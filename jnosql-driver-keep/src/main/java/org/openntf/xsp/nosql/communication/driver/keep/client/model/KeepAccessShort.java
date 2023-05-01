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

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Provides simple information of access level required for Domino REST API access get operations: -
 * Domino REST API mapping in Domino directory - Domino REST API configuration in individual
 * databases Masks ACL and Role checks for users of the API
 **/

public class KeepAccessShort {

  /**
   * Can the current user create Domino REST API configuration mappings
   **/
  @JsonbProperty("CreateDbMapping")
  private Boolean createDbMapping;

  /**
   * Can the current user delete Domino REST API configuration mappings
   **/
  @JsonbProperty("DeleteDbMapping")
  private Boolean deleteDbMapping;

  /**
   * Can the current user create Domino REST API configuration mappings
   * 
   * @return createDbMapping
   **/
  public Boolean getCreateDbMapping() {
    return createDbMapping;
  }

  /**
   * Set createDbMapping
   **/
  public void setCreateDbMapping(Boolean createDbMapping) {
    this.createDbMapping = createDbMapping;
  }

  public KeepAccessShort createDbMapping(Boolean createDbMapping) {
    this.createDbMapping = createDbMapping;
    return this;
  }

  /**
   * Can the current user delete Domino REST API configuration mappings
   * 
   * @return deleteDbMapping
   **/
  public Boolean getDeleteDbMapping() {
    return deleteDbMapping;
  }

  /**
   * Set deleteDbMapping
   **/
  public void setDeleteDbMapping(Boolean deleteDbMapping) {
    this.deleteDbMapping = deleteDbMapping;
  }

  public KeepAccessShort deleteDbMapping(Boolean deleteDbMapping) {
    this.deleteDbMapping = deleteDbMapping;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeepAccessShort {\n");

    sb.append("    createDbMapping: ").append(toIndentedString(createDbMapping)).append("\n");
    sb.append("    deleteDbMapping: ").append(toIndentedString(deleteDbMapping)).append("\n");
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

