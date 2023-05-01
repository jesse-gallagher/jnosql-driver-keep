/**
 * Copyright © 2022-2023 Jesse Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openntf.xsp.nosql.communication.driver.keep.impl;

import static java.util.Objects.requireNonNull;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jnosql.mapping.reflection.ClassMapping;
import org.openntf.xsp.nosql.communication.driver.DominoConstants;
import org.openntf.xsp.nosql.communication.driver.impl.AbstractEntityConverter;
import org.openntf.xsp.nosql.mapping.extension.ItemFlags;
import org.openntf.xsp.nosql.mapping.extension.ItemStorage;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.nosql.ServiceLoaderProvider;
import jakarta.nosql.ValueWriter;
import jakarta.nosql.document.Document;
import jakarta.nosql.document.DocumentEntity;

public class KeepEntityConverter extends AbstractEntityConverter {

  private final Jsonb jsonb;

  public KeepEntityConverter() {
    this.jsonb = JsonbBuilder.create();
  }

  @SuppressWarnings("unchecked")
  public Stream<DocumentEntity> convertDocuments(String entityName, List<Map<String, Object>> docs,
      ClassMapping classMapping) {
    return docs.stream()
        .map(doc -> {
          Map<String, Object> meta = (Map<String, Object>) doc.get("@meta"); //$NON-NLS-1$
          String id;
          if (meta != null) {
            id = (String) meta.get("unid"); //$NON-NLS-1$
          } else {
            // View entries
            id = (String) doc.get("@unid");
          }

          List<jakarta.nosql.document.Document> resultDocs = new ArrayList<>();
          resultDocs.add(jakarta.nosql.document.Document.of(DominoConstants.FIELD_ID, id));

          doc.forEach((key, rawVal) -> {
            Object value;
            if(rawVal instanceof Map) {
              // Assume rich text for now
              // TODO account for encoding, MIME, etc.
              value = ((Map<String, String>)rawVal).get("content");
            } else {
              List<?> val = rawVal instanceof List ? (List<?>) rawVal : Arrays.asList(rawVal);
              value = val == null || val.isEmpty() ? null : val.size() == 1 ? val.get(0) : val;
            }
            if(value != null) {
              resultDocs.add(jakarta.nosql.document.Document.of(key, value));
            }
          });

          return DocumentEntity.of(entityName, resultDocs);
        });
  }

  public Map<String, Object> convertNoSQLEntity(DocumentEntity entity, boolean inserting,
      ClassMapping classMapping) {
    requireNonNull(entity, "entity is required"); //$NON-NLS-1$
    @SuppressWarnings("unchecked")
    List<ValueWriter<Object, Object>> writers =
        ServiceLoaderProvider.getSupplierStream(ValueWriter.class)
            .map(w -> (ValueWriter<Object, Object>) w)
            .collect(Collectors.toList());

    Map<String, Object> items = entity.getDocuments()
        .stream()
        .filter(doc -> doc.get() != null && doc.getName() != null)
        .map(doc -> {
          // TODO attachment support

          if (!DominoConstants.SKIP_WRITING_FIELDS.contains(doc.getName())) {
            Optional<ItemStorage> optStorage =
                getFieldAnnotation(classMapping, doc.getName(), ItemStorage.class);
            // Check if we should skip processing
            if (optStorage.isPresent()) {
              ItemStorage storage = optStorage.get();
              if (!storage.insertable() && inserting) {
                return null;
              } else if (!storage.updatable() && !inserting) {
                return null;
              }
            }

            Object value = doc.get();
            if (value == null) {
              return null;
            } else {
              Object val = value;
              for (ValueWriter<Object, Object> w : writers) {
                if (w.test(value.getClass())) {
                  val = w.write(value);
                  break;
                }
              }

              // Can't realistically handle item flags currently
              @SuppressWarnings("unused")
              Optional<ItemFlags> itemFlagsOpt =
                  getFieldAnnotation(classMapping, doc.getName(), ItemFlags.class);


              // Check if the item is expected to be stored specially, which may be handled down the
              // line
              if (optStorage.isPresent() && optStorage.get().type() != ItemStorage.Type.Default) {
                ItemStorage storage = optStorage.get();
                switch (storage.type()) {
                  case JSON:
                    Object fVal = val;
                    String json = AccessController
                        .doPrivileged((PrivilegedAction<String>) () -> jsonb.toJson(fVal));
                    return Document.of(doc.getName(), json);
                  case MIME:
                    throw new UnsupportedOperationException("MIME storage is unsupported");
                  case MIMEBean:
                    throw new UnsupportedOperationException("MIMEBean storage is unsupported");
                  case Default:
                  default:
                    // Shouldn't get here
                    throw new UnsupportedOperationException(
                        MessageFormat.format("Unable to handle storage type {0}", storage.type()));
                }
              } else {
                Object dominoVal = val;

                // Set number precision if applicable
                if (optStorage.isPresent()) {
                  int precision = optStorage.get().precision();
                  if (precision > 0) {
                    dominoVal = applyPrecision(dominoVal, precision);
                  }
                }

                return Document.of(doc.getName(), dominoVal);
              }
            }
          }
          return null;
        })
        .filter(Objects::nonNull)
        .filter(doc -> doc.get() != null)
        .collect(Collectors.toMap(Document::getName, Document::get));

    items.put(DominoConstants.FIELD_NAME, entity.getName());
    return items;
  }
}
