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
/**
 * HCL Domino REST API basis
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 * The version of the OpenAPI document: 1.0.8
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.model;

import java.util.List;
import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Definition of request to create specific design element Form.
 **/

public class DesignFormSimpleRequest {

  /**
   * The name of the form.
   **/
  @JsonbProperty("name")
  private String name;

  /**
   * Alternate names or alias of the form.
   **/
  @JsonbProperty("alias")
  private String alias;

  /**
   * The fields on a forms.
   **/
  @JsonbProperty("fields")
  private List<DesignFieldSimple> fields = null;

  /**
   * The name of the form.
   * 
   * @return name
   **/
  public String getName() {
    return name;
  }

  /**
   * Set name
   **/
  public void setName(String name) {
    this.name = name;
  }

  public DesignFormSimpleRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Alternate names or alias of the form.
   * 
   * @return alias
   **/
  public String getAlias() {
    return alias;
  }

  /**
   * Set alias
   **/
  public void setAlias(String alias) {
    this.alias = alias;
  }

  public DesignFormSimpleRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * The fields on a forms.
   * 
   * @return fields
   **/
  public List<DesignFieldSimple> getFields() {
    return fields;
  }

  /**
   * Set fields
   **/
  public void setFields(List<DesignFieldSimple> fields) {
    this.fields = fields;
  }

  public DesignFormSimpleRequest fields(List<DesignFieldSimple> fields) {
    this.fields = fields;
    return this;
  }

  public DesignFormSimpleRequest addFieldsItem(DesignFieldSimple fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignFormSimpleRequest {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

