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

import jakarta.json.bind.annotation.JsonbProperty;

/**
  * Definition of a Domino REST API cache of design element summaries.
 **/

public class AdminCache  {
  
 /**
   * If the specified database has been cached, then return true. Otherwise false.  
  **/
  @JsonbProperty("cached")
  private Boolean cached;

 /**
   * How this database is known to the API.
  **/
  @JsonbProperty("apiName")
  private String apiName;

 /**
   * Location on Domino server.
  **/
  @JsonbProperty("nsfPath")
  private String nsfPath;

 /**
   * Form count exsit in the Domino REST API cache folder. 
  **/
  @JsonbProperty("formcount")
  private Integer formcount;

 /**
   * View count exsit in the Domino REST API cache folder. 
  **/
  @JsonbProperty("viewcount")
  private Integer viewcount;

 /**
   * Agent count exsit in the Domino REST API cache folder. 
  **/
  @JsonbProperty("agentcount")
  private Integer agentcount;

 /**
   * Library count exsit in the Domino REST API cache folder. 
  **/
  @JsonbProperty("librarycount")
  private Integer librarycount;

 /**
   * A 16-character combination of letters and numbers that represents the replica ID of a Notes database.
  **/
  @JsonbProperty("replicaid")
  private String replicaid;

 /**
   * The title of the database.
  **/
  @JsonbProperty("title")
  private String title;

 /**
   * If the specified database has been cached, then return true. Otherwise false.  
   * @return cached
  **/
  public Boolean getCached() {
    return cached;
  }

  /**
    * Set cached
  **/
  public void setCached(Boolean cached) {
    this.cached = cached;
  }

  public AdminCache cached(Boolean cached) {
    this.cached = cached;
    return this;
  }

 /**
   * How this database is known to the API.
   * @return apiName
  **/
  public String getApiName() {
    return apiName;
  }

  /**
    * Set apiName
  **/
  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public AdminCache apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

 /**
   * Location on Domino server.
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

  public AdminCache nsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
    return this;
  }

 /**
   * Form count exsit in the Domino REST API cache folder. 
   * @return formcount
  **/
  public Integer getFormcount() {
    return formcount;
  }

  /**
    * Set formcount
  **/
  public void setFormcount(Integer formcount) {
    this.formcount = formcount;
  }

  public AdminCache formcount(Integer formcount) {
    this.formcount = formcount;
    return this;
  }

 /**
   * View count exsit in the Domino REST API cache folder. 
   * @return viewcount
  **/
  public Integer getViewcount() {
    return viewcount;
  }

  /**
    * Set viewcount
  **/
  public void setViewcount(Integer viewcount) {
    this.viewcount = viewcount;
  }

  public AdminCache viewcount(Integer viewcount) {
    this.viewcount = viewcount;
    return this;
  }

 /**
   * Agent count exsit in the Domino REST API cache folder. 
   * @return agentcount
  **/
  public Integer getAgentcount() {
    return agentcount;
  }

  /**
    * Set agentcount
  **/
  public void setAgentcount(Integer agentcount) {
    this.agentcount = agentcount;
  }

  public AdminCache agentcount(Integer agentcount) {
    this.agentcount = agentcount;
    return this;
  }

 /**
   * Library count exsit in the Domino REST API cache folder. 
   * @return librarycount
  **/
  public Integer getLibrarycount() {
    return librarycount;
  }

  /**
    * Set librarycount
  **/
  public void setLibrarycount(Integer librarycount) {
    this.librarycount = librarycount;
  }

  public AdminCache librarycount(Integer librarycount) {
    this.librarycount = librarycount;
    return this;
  }

 /**
   * A 16-character combination of letters and numbers that represents the replica ID of a Notes database.
   * @return replicaid
  **/
  public String getReplicaid() {
    return replicaid;
  }

  /**
    * Set replicaid
  **/
  public void setReplicaid(String replicaid) {
    this.replicaid = replicaid;
  }

  public AdminCache replicaid(String replicaid) {
    this.replicaid = replicaid;
    return this;
  }

 /**
   * The title of the database.
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

  public AdminCache title(String title) {
    this.title = title;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCache {\n");
    
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    nsfPath: ").append(toIndentedString(nsfPath)).append("\n");
    sb.append("    formcount: ").append(toIndentedString(formcount)).append("\n");
    sb.append("    viewcount: ").append(toIndentedString(viewcount)).append("\n");
    sb.append("    agentcount: ").append(toIndentedString(agentcount)).append("\n");
    sb.append("    librarycount: ").append(toIndentedString(librarycount)).append("\n");
    sb.append("    replicaid: ").append(toIndentedString(replicaid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

