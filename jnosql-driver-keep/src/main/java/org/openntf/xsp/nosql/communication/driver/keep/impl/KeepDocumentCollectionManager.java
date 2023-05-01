/**
 * Copyright © 2022 Jesse Gallagher
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

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.eclipse.jnosql.mapping.reflection.ClassMapping;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.openntf.xsp.nosql.communication.driver.DominoConstants;
import org.openntf.xsp.nosql.communication.driver.impl.AbstractDominoDocumentCollectionManager;
import org.openntf.xsp.nosql.communication.driver.impl.DQL;
import org.openntf.xsp.nosql.communication.driver.impl.DQL.DQLTerm;
import org.openntf.xsp.nosql.communication.driver.impl.EntityUtil;
import org.openntf.xsp.nosql.communication.driver.impl.QueryConverter;
import org.openntf.xsp.nosql.communication.driver.impl.QueryConverter.QueryConverterResult;
import org.openntf.xsp.nosql.communication.driver.keep.AccessTokenSupplier;
import org.openntf.xsp.nosql.communication.driver.keep.BaseUriSupplier;
import org.openntf.xsp.nosql.communication.driver.keep.DataSourceSupplier;
import org.openntf.xsp.nosql.communication.driver.keep.client.api.ApiException;
import org.openntf.xsp.nosql.communication.driver.keep.client.api.DataApi;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.QueryRequest;
import org.openntf.xsp.nosql.communication.driver.keep.client.model.RichTextRepresentation;
import org.openntf.xsp.nosql.mapping.extension.ViewQuery;
import jakarta.nosql.Sort;
import jakarta.nosql.SortType;
import jakarta.nosql.document.DocumentDeleteQuery;
import jakarta.nosql.document.DocumentEntity;
import jakarta.nosql.document.DocumentQuery;
import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Pagination;
import jakarta.nosql.mapping.Sorts;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.HttpHeaders;

public class KeepDocumentCollectionManager extends AbstractDominoDocumentCollectionManager {

  private final BaseUriSupplier baseUriSupplier;
  private final DataSourceSupplier dataSourceSupplier;
  private final AccessTokenSupplier tokenSupplier;
  private final KeepEntityConverter entityConverter;

  public KeepDocumentCollectionManager(BaseUriSupplier baseUriSupplier,
      DataSourceSupplier dataSourceSupplier, AccessTokenSupplier tokenSupplier) {
    this.baseUriSupplier = baseUriSupplier;
    this.dataSourceSupplier = dataSourceSupplier;
    this.tokenSupplier = tokenSupplier;
    this.entityConverter = new KeepEntityConverter();
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stream<DocumentEntity> viewEntryQuery(String entityName, String viewName,
      Pagination pagination, Sorts sorts,
      int maxLevel, boolean docsOnly, ViewQuery viewQuery, boolean singleResult) {
    DataApi dataApi = getDataApi();

    ClassMapping mapping = EntityUtil.getClassMapping(entityName);
    try {
      int start = 0;
      int count = Integer.MAX_VALUE;
      if(pagination != null) {
        start = (int)Math.min(Integer.MAX_VALUE, pagination.getSkip());
        count = (int)Math.min(Integer.MAX_VALUE, pagination.getPageSize());
      }
      
      // TODO add keyAllowPartial
      String key = null;
      if(viewQuery != null) {
        if(viewQuery.getKey() != null) {
          key = String.valueOf(viewQuery.getKey());
        }
      }
      
      String sortColumn = null;
      String direction = null;
      if(sorts != null) {
        List<Sort> sortList = sorts.getSorts();
        if(sortList != null && !sortList.isEmpty()) {
          sortColumn = sortList.get(0).getName();
          direction = sortList.get(0).getType() == SortType.ASC ? "asc" : "desc";
        }
      }
      
      List<Map<String, Object>> entries =
          (List<Map<String, Object>>) (List<?>) dataApi.fetchViewEntries(
              viewName,
              this.dataSourceSupplier.get(),
              count,
              docsOnly ? "documents": "all",
              start,
              key,
              null,
              sortColumn,
              direction,
              null,
              "default");
      Stream<DocumentEntity> result = entityConverter.convertDocuments(entityName, entries, mapping);
      if(singleResult) {
        result = result.limit(1);
      }
      return result;
    } catch (ProcessingException | ApiException e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public Stream<DocumentEntity> viewDocumentQuery(String entityName, String viewName,
      Pagination pagination, Sorts sorts, int maxLevel, ViewQuery viewQuery, boolean singleResult,
      boolean distinct) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void putInFolder(String entityId, String folderName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void removeFromFolder(String entityId, String folderName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public DocumentEntity insert(DocumentEntity entity, boolean computeWithForm) {
    ClassMapping mapping = EntityUtil.getClassMapping(entity.getName());
    DataApi api = getDataApi();
    try {
      Map<String, Object> doc = entityConverter.convertNoSQLEntity(entity, true, mapping);
      doc.remove("@meta");
      doc = api.createDocument(dataSourceSupplier.get(), doc, null);
      @SuppressWarnings("unchecked")
      Map<String, Object> meta = (Map<String, Object>) doc.get("@meta");
      entity.add(jakarta.nosql.document.Document.of(DominoConstants.FIELD_ID, meta.get("unid")));
      return entity;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public DocumentEntity update(DocumentEntity entity, boolean computeWithForm) {
    Optional<jakarta.nosql.document.Document> maybeId = entity.find(DominoConstants.FIELD_ID);
    if (!maybeId.isPresent()) {
      // Then consider it an insert
      return insert(entity, computeWithForm);
    } else {
      ClassMapping mapping = EntityUtil.getClassMapping(entity.getName());
      DataApi api = getDataApi();
      try {
        Map<String, Object> doc = entityConverter.convertNoSQLEntity(entity, true, mapping);
        api.updateDocument(dataSourceSupplier.get(), maybeId.get().get(String.class), doc,
            "default", RichTextRepresentation.HTML, null, null);
        return entity;
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public boolean existsById(String unid) {
    DataApi api = getDataApi();
    try {
      Map<String, Object> doc = api.getDocument(unid, dataSourceSupplier.get(), "default", //$NON-NLS-1$
          RichTextRepresentation.HTML, false);
      return doc != null;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Optional<DocumentEntity> getByNoteId(String entityName, String noteId) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Optional<DocumentEntity> getById(String entityName, String id) {
    ClassMapping mapping = EntityUtil.getClassMapping(entityName);
    DataApi api = getDataApi();
    try {
      Map<String, Object> doc = api.getDocument(id, dataSourceSupplier.get(), "default", //$NON-NLS-1$
          RichTextRepresentation.HTML, false);
      return entityConverter.convertDocuments(entityName, Arrays.asList(doc), mapping)
          .findFirst();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Iterable<DocumentEntity> insert(Iterable<DocumentEntity> entities) {
    return StreamSupport.stream(entities.spliterator(), false)
        .map(entity -> insert(entity, false))
        .collect(Collectors.toList());
  }

  @SuppressWarnings("unchecked")
  @Override
  public void delete(DocumentDeleteQuery query) {
    try {
      DataApi api = getDataApi();
      Collection<String> unids = query.getDocuments();
      if (unids != null) {
        unids = unids.stream()
            .filter(unid -> unid != null && !unid.isEmpty())
            .collect(Collectors.toSet());
      }
      if (unids == null || unids.isEmpty()) {
        // Then query for docs
        String entityName = query.getDocumentCollection();
        DocumentQuery docQuery = DocumentQuery.builder()
            .from(entityName)
            .where(query.getCondition().get())
            .build();

        QueryConverterResult queryResult = QueryConverter.select(docQuery);
        QueryRequest req = new QueryRequest();
        req.setForms(Arrays.asList(entityName));
        req.setQuery(queryResult.getStatement().toString());
        req.setMode("dql");
        unids = api.query(
            dataSourceSupplier.get(),
            "execute", //$NON-NLS-1$
            req,
            RichTextRepresentation.HTML,
            Integer.MAX_VALUE,
            0)
            .stream()
            .map(doc -> (Map<String, Object>) doc.get("@meta"))
            .map(meta -> (String) meta.get("unid"))
            .collect(Collectors.toList());
      }

      for (String unid : unids) {
        api.deleteDocument(dataSourceSupplier.get(), unid, "default", RichTextRepresentation.MIME);
      }
      // BulkUnids bulkUnids = new BulkUnids();
      // bulkUnids.setUnids(new ArrayList<>(unids));
      // bulkUnids.setMode("default");
      // api.bulkDeleteDocuments(dataSourceSupplier.get(), bulkUnids);
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Stream<DocumentEntity> select(DocumentQuery query) {
    String entityName = query.getDocumentCollection();
    ClassMapping mapping = EntityUtil.getClassMapping(entityName);

    QueryConverterResult queryResult = QueryConverter.select(query);

    long skip = queryResult.getSkip();
    long limit = queryResult.getLimit();

    // Sorting is not available in queries, and this is left as a reminder
    // if intentionally ignoring them
    @SuppressWarnings("unused")
    List<Sort> sorts = query.getSorts();

    DataApi api = getDataApi();
    QueryRequest req = new QueryRequest();
    req.setForms(Arrays.asList(entityName));
    req.setQuery(queryResult.getStatement().toString());
    req.setMode("dql");
    try {
      List<Map<String, Object>> docs = api.query(
          dataSourceSupplier.get(),
          "execute", //$NON-NLS-1$
          req,
          RichTextRepresentation.HTML,
          (int) (limit < 1 ? Integer.MAX_VALUE : limit),
          (int) (skip < 1 ? 0 : skip));
      return entityConverter.convertDocuments(entityName, docs, mapping);
    } catch (ProcessingException | ApiException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public long count(String documentCollection) {
    DQLTerm dql = DQL.item(DominoConstants.FIELD_NAME).isEqualTo(documentCollection);
    DataApi api = getDataApi();
    QueryRequest req = new QueryRequest();
    req.setForms(Arrays.asList(documentCollection));
    req.setQuery(dql.toString());
    try {
      return api.query(
          dataSourceSupplier.get(),
          "execute", //$NON-NLS-1$
          req,
          RichTextRepresentation.HTML,
          Integer.MAX_VALUE,
          0)
          .size();
    } catch (ProcessingException | ApiException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void close() {

  }

  private List<String> getItemNames(ClassMapping mapping) {
    return mapping.getFields()
        .stream()
        .map(f -> f.getNativeField())
        .map(f -> {
          Column col = f.getAnnotation(Column.class);
          if (col == null) {
            return null;
          }
          return col.value().isEmpty() ? f.getName() : col.value();
        })
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
  }

  private DataApi getDataApi() {
    return RestClientBuilder.newBuilder()
        .baseUri(baseUriSupplier.get())
        .register((ClientRequestFilter) (ctx) -> {
          ctx.getHeaders().add(HttpHeaders.AUTHORIZATION, "Bearer " + tokenSupplier.get()); //$NON-NLS-1$
        })
        .build(DataApi.class);
  }
}
