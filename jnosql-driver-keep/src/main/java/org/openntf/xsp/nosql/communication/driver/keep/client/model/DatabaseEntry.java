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

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

/**
  * A database living on the sever's file system. Eventually with the API names it is known for
 **/

public class DatabaseEntry  {
  
  @JsonbProperty("title")
  private String title;

  @JsonbProperty("apiNames")
  private List<String> apiNames = null;

  @JsonbProperty("nsfPath")
  private String nsfPath;

 /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  /**
    * Set title
  **/
  public void setTitle(String title) {
    this.title = title;
  }

  public DatabaseEntry title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get apiNames
   * @return apiNames
  **/
  public List<String> getApiNames() {
    return apiNames;
  }

  /**
    * Set apiNames
  **/
  public void setApiNames(List<String> apiNames) {
    this.apiNames = apiNames;
  }

  public DatabaseEntry apiNames(List<String> apiNames) {
    this.apiNames = apiNames;
    return this;
  }

  public DatabaseEntry addApiNamesItem(String apiNamesItem) {
    this.apiNames.add(apiNamesItem);
    return this;
  }

 /**
   * Get nsfPath
   * @return nsfPath
  **/
  public String getNsfPath() {
    return nsfPath;
  }

  /**
    * Set nsfPath
  **/
  public void setNsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
  }

  public DatabaseEntry nsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseEntry {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    apiNames: ").append(toIndentedString(apiNames)).append("\n");
    sb.append("    nsfPath: ").append(toIndentedString(nsfPath)).append("\n");
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

