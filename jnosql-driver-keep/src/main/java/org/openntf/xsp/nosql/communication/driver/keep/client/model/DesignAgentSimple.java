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

import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Definition design information for specific design element Agent.
 **/

public class DesignAgentSimple {

  /**
   * Indicates when this agent runs.
   **/
  @JsonbProperty("@trigger")
  private String atTrigger;

  /**
   * Represents a specified set of target documents that are manipulated by an agent. The following
   * types run an agent on: all - All the documents in the database. allinview - All documents in a
   * view. modified - All new and modified documents. runonce - The current document once. selected
   * - Only the selected documents. unreadinview - All unread documents in a view. none
   **/
  @JsonbProperty("@documentset")
  private String atDocumentset;

  /**
   * The Note UNID of the agent.
   **/
  @JsonbProperty("@unid")
  private String atUnid;

  /**
   * The name of the agent.
   **/
  @JsonbProperty("@name")
  private String atName;

  /**
   * If this agent has been configured to use in Domino REST API.
   **/
  @JsonbProperty("@validForKeep")
  private Boolean atValidForKeep;

  /**
   * The note ID of the agent, which is uniquely identifies a document within a particular database.
   **/
  @JsonbProperty("@noteid")
  private String atNoteid;

  /**
   * Indicates the type of the agent (simple action, formula, LotusScript, imported Java, or Java).
   **/
  @JsonbProperty("@type")
  private String atType;

  public DesignAgentSimple() {}

  @JsonbCreator
  public DesignAgentSimple(
      @JsonbProperty(value = "@trigger", nillable = true) String atTrigger,
      @JsonbProperty(value = "@validForKeep", nillable = true) Boolean atValidForKeep) {
    this.atTrigger = atTrigger;
    this.atValidForKeep = atValidForKeep;
  }

  /**
   * Indicates when this agent runs.
   * 
   * @return atTrigger
   **/
  public String getAtTrigger() {
    return atTrigger;
  }


  /**
   * Represents a specified set of target documents that are manipulated by an agent. The following
   * types run an agent on: all - All the documents in the database. allinview - All documents in a
   * view. modified - All new and modified documents. runonce - The current document once. selected
   * - Only the selected documents. unreadinview - All unread documents in a view. none
   * 
   * @return atDocumentset
   **/
  public String getAtDocumentset() {
    return atDocumentset;
  }

  /**
   * Set atDocumentset
   **/
  public void setAtDocumentset(String atDocumentset) {
    this.atDocumentset = atDocumentset;
  }

  public DesignAgentSimple atDocumentset(String atDocumentset) {
    this.atDocumentset = atDocumentset;
    return this;
  }

  /**
   * The Note UNID of the agent.
   * 
   * @return atUnid
   **/
  public String getAtUnid() {
    return atUnid;
  }

  /**
   * Set atUnid
   **/
  public void setAtUnid(String atUnid) {
    this.atUnid = atUnid;
  }

  public DesignAgentSimple atUnid(String atUnid) {
    this.atUnid = atUnid;
    return this;
  }

  /**
   * The name of the agent.
   * 
   * @return atName
   **/
  public String getAtName() {
    return atName;
  }

  /**
   * Set atName
   **/
  public void setAtName(String atName) {
    this.atName = atName;
  }

  public DesignAgentSimple atName(String atName) {
    this.atName = atName;
    return this;
  }

  /**
   * If this agent has been configured to use in Domino REST API.
   * 
   * @return atValidForKeep
   **/
  public Boolean getAtValidForKeep() {
    return atValidForKeep;
  }


  /**
   * The note ID of the agent, which is uniquely identifies a document within a particular database.
   * 
   * @return atNoteid
   **/
  public String getAtNoteid() {
    return atNoteid;
  }

  /**
   * Set atNoteid
   **/
  public void setAtNoteid(String atNoteid) {
    this.atNoteid = atNoteid;
  }

  public DesignAgentSimple atNoteid(String atNoteid) {
    this.atNoteid = atNoteid;
    return this;
  }

  /**
   * Indicates the type of the agent (simple action, formula, LotusScript, imported Java, or Java).
   * 
   * @return atType
   **/
  public String getAtType() {
    return atType;
  }

  /**
   * Set atType
   **/
  public void setAtType(String atType) {
    this.atType = atType;
  }

  public DesignAgentSimple atType(String atType) {
    this.atType = atType;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignAgentSimple {\n");

    sb.append("    atTrigger: ").append(toIndentedString(atTrigger)).append("\n");
    sb.append("    atDocumentset: ").append(toIndentedString(atDocumentset)).append("\n");
    sb.append("    atUnid: ").append(toIndentedString(atUnid)).append("\n");
    sb.append("    atName: ").append(toIndentedString(atName)).append("\n");
    sb.append("    atValidForKeep: ").append(toIndentedString(atValidForKeep)).append("\n");
    sb.append("    atNoteid: ").append(toIndentedString(atNoteid)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

