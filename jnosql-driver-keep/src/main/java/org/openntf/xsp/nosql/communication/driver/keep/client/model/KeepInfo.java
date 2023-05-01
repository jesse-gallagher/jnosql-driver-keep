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

import jakarta.json.bind.annotation.JsonbProperty;

/**
  * Basic Information about the running environment
 **/

public class KeepInfo  {
  
  @JsonbProperty("KeepProperties")
  private KeepInfoDetails keepProperties;

  @JsonbProperty("DominoProperties")
  private KeepInfoDomino dominoProperties;

 /**
   * Get keepProperties
   * @return keepProperties
  **/
  public KeepInfoDetails getKeepProperties() {
    return keepProperties;
  }

  /**
    * Set keepProperties
  **/
  public void setKeepProperties(KeepInfoDetails keepProperties) {
    this.keepProperties = keepProperties;
  }

  public KeepInfo keepProperties(KeepInfoDetails keepProperties) {
    this.keepProperties = keepProperties;
    return this;
  }

 /**
   * Get dominoProperties
   * @return dominoProperties
  **/
  public KeepInfoDomino getDominoProperties() {
    return dominoProperties;
  }

  /**
    * Set dominoProperties
  **/
  public void setDominoProperties(KeepInfoDomino dominoProperties) {
    this.dominoProperties = dominoProperties;
  }

  public KeepInfo dominoProperties(KeepInfoDomino dominoProperties) {
    this.dominoProperties = dominoProperties;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeepInfo {\n");
    
    sb.append("    keepProperties: ").append(toIndentedString(keepProperties)).append("\n");
    sb.append("    dominoProperties: ").append(toIndentedString(dominoProperties)).append("\n");
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
