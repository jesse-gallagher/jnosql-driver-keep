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


public class ExecutionResultResultsInnerItems {

  @JsonbProperty("age")
  private Integer age;

  @JsonbProperty("name")
  private String name;

  /**
   * Get age
   * 
   * @return age
   **/
  public Integer getAge() {
    return age;
  }

  /**
   * Set age
   **/
  public void setAge(Integer age) {
    this.age = age;
  }

  public ExecutionResultResultsInnerItems age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get name
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

  public ExecutionResultResultsInnerItems name(String name) {
    this.name = name;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionResultResultsInnerItems {\n");

    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

