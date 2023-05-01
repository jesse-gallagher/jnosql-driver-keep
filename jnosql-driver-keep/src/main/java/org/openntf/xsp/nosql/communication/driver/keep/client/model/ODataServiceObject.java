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
 * Entity object for OData service document of a database.
 **/

public class ODataServiceObject {

  /**
   * The form name.
   **/
  @JsonbProperty("name")
  private String name;

  /**
   * EntitySet
   **/
  @JsonbProperty("kind")
  private String kind;

  /**
   * The form name currently
   **/
  @JsonbProperty("url")
  private String url;

  /**
   * The form name.
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

  public ODataServiceObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * EntitySet
   * 
   * @return kind
   **/
  public String getKind() {
    return kind;
  }

  /**
   * Set kind
   **/
  public void setKind(String kind) {
    this.kind = kind;
  }

  public ODataServiceObject kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The form name currently
   * 
   * @return url
   **/
  public String getUrl() {
    return url;
  }

  /**
   * Set url
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  public ODataServiceObject url(String url) {
    this.url = url;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataServiceObject {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

