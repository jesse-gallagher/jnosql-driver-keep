/**
 * HCL Project KEEP Core API v1
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and data
 *
 * The version of the OpenAPI document: 4.3.9
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotNull;

/**
  * Upload an array of JSON objects to create new documents each
 **/

public class BulkCreateDocuments  {
  
 /**
   * JSON source for new Documents
  **/
  @JsonbProperty("documents")
  private List<Map<String, Object>> documents = new ArrayList<>();

 /**
   * JSON source for new Documents
   * @return documents
  **/
  @NotNull
  public List<Map<String, Object>> getDocuments() {
    return documents;
  }

  /**
    * Set documents
  **/
  public void setDocuments(List<Map<String, Object>> documents) {
    this.documents = documents;
  }

  public BulkCreateDocuments documents(List<Map<String, Object>> documents) {
    this.documents = documents;
    return this;
  }

  public BulkCreateDocuments addDocumentsItem(Map<String, Object> documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCreateDocuments {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

