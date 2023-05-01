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
import jakarta.validation.constraints.NotNull;

/**
 * Code sent to server to be executed and results returned
 **/

public class ExecutionRequest {

  /**
   * The data context to be provided for the call. By default `session` and `database` are given,
   * more based on this property
   **/
  @JsonbProperty("context")
  private Object context = null;

  /**
   * code to be executed
   **/
  @JsonbProperty("payload")
  private String payload;

  /**
   * The data context to be provided for the call. By default &#x60;session&#x60; and
   * &#x60;database&#x60; are given, more based on this property
   * 
   * @return context
   **/
  @NotNull
  public Object getContext() {
    return context;
  }

  /**
   * Set context
   **/
  public void setContext(Object context) {
    this.context = context;
  }

  public ExecutionRequest context(Object context) {
    this.context = context;
    return this;
  }

  /**
   * code to be executed
   * 
   * @return payload
   **/
  @NotNull
  public String getPayload() {
    return payload;
  }

  /**
   * Set payload
   **/
  public void setPayload(String payload) {
    this.payload = payload;
  }

  public ExecutionRequest payload(String payload) {
    this.payload = payload;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionRequest {\n");

    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

