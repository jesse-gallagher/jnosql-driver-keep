/**
 * HCL Domino REST API basis
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 * The version of the OpenAPI document: 1.0.10
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotNull;

/**
  * One simple element of return value when requesting formula execution
 **/

public class FormulaResultElement  {
  
 /**
   * Unique ID of document formula result is from.  If no document or query specified, unid will be an empty string
  **/
  @JsonbProperty("unid")
  private String unid;

 /**
   * Result is returned as an array.
  **/
  @JsonbProperty("result")
  private List<Object> result = new ArrayList<>();

 /**
   * Unique ID of document formula result is from.  If no document or query specified, unid will be an empty string
   * @return unid
  **/
  @NotNull
  public String getUnid() {
    return unid;
  }

  /**
    * Set unid
  **/
  public void setUnid(String unid) {
    this.unid = unid;
  }

  public FormulaResultElement unid(String unid) {
    this.unid = unid;
    return this;
  }

 /**
   * Result is returned as an array.
   * @return result
  **/
  @NotNull
  public List<Object> getResult() {
    return result;
  }

  /**
    * Set result
  **/
  public void setResult(List<Object> result) {
    this.result = result;
  }

  public FormulaResultElement result(List<Object> result) {
    this.result = result;
    return this;
  }

  public FormulaResultElement addResultItem(Object resultItem) {
    this.result.add(resultItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaResultElement {\n");
    
    sb.append("    unid: ").append(toIndentedString(unid)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

