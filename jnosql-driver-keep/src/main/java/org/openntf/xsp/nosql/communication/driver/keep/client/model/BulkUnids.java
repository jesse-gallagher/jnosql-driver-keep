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
 * Collection of UNIDs for bulk retrieval or deletions
 **/

public class BulkUnids {

  /**
   * List of UNIDs to act upon
   **/
  @JsonbProperty("unids")
  private List<String> unids = null;

  /**
   * mode to use to act on the documents. defaults to default
   **/
  @JsonbProperty("mode")
  private String mode;

  /**
   * List of UNIDs to act upon
   * 
   * @return unids
   **/
  public List<String> getUnids() {
    return unids;
  }

  /**
   * Set unids
   **/
  public void setUnids(List<String> unids) {
    this.unids = unids;
  }

  public BulkUnids unids(List<String> unids) {
    this.unids = unids;
    return this;
  }

  public BulkUnids addUnidsItem(String unidsItem) {
    this.unids.add(unidsItem);
    return this;
  }

  /**
   * mode to use to act on the documents. defaults to default
   * 
   * @return mode
   **/
  public String getMode() {
    return mode;
  }

  /**
   * Set mode
   **/
  public void setMode(String mode) {
    this.mode = mode;
  }

  public BulkUnids mode(String mode) {
    this.mode = mode;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUnids {\n");

    sb.append("    unids: ").append(toIndentedString(unids)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

