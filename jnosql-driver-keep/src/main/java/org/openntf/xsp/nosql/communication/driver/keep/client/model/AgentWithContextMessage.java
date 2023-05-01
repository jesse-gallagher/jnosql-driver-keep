/**
 * Copyright © 2022-2023 Jesse Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
 * Runs an existing agent in a given database using a specific document as the agent's run context.
 * The is the status message of the response.
 **/

public class AgentWithContextMessage {

  /**
   * The agentName in the given database.
   **/
  @JsonbProperty("agentName")
  private String agentName;

  /**
   * The UNID of a document to passing by. NotesSession.documentContext can be used in the agent to
   * access the relevant document.
   **/
  @JsonbProperty("unid")
  private String unid;

  /**
   * The mode configured in Domino REST API.
   **/
  @JsonbProperty("returnMode")
  private String returnMode;

  /**
   * The agentName in the given database.
   * 
   * @return agentName
   **/
  public String getAgentName() {
    return agentName;
  }

  /**
   * Set agentName
   **/
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public AgentWithContextMessage agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

  /**
   * The UNID of a document to passing by. NotesSession.documentContext can be used in the agent to
   * access the relevant document.
   * 
   * @return unid
   **/
  public String getUnid() {
    return unid;
  }

  /**
   * Set unid
   **/
  public void setUnid(String unid) {
    this.unid = unid;
  }

  public AgentWithContextMessage unid(String unid) {
    this.unid = unid;
    return this;
  }

  /**
   * The mode configured in Domino REST API.
   * 
   * @return returnMode
   **/
  public String getReturnMode() {
    return returnMode;
  }

  /**
   * Set returnMode
   **/
  public void setReturnMode(String returnMode) {
    this.returnMode = returnMode;
  }

  public AgentWithContextMessage returnMode(String returnMode) {
    this.returnMode = returnMode;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWithContextMessage {\n");

    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    unid: ").append(toIndentedString(unid)).append("\n");
    sb.append("    returnMode: ").append(toIndentedString(returnMode)).append("\n");
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

