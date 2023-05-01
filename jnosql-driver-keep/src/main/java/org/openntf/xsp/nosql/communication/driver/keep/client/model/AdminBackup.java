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
 * Definition of a Domino REST API configuration.
 **/

public class AdminBackup {

  /**
   * Basic information about Domino REST API.
   **/
  @JsonbProperty("version")
  private Object version;

  /**
   * All database configuration, including keepconfig(KeepConfig.nsf) which has configuration
   * settings for the Domino REST API.
   **/
  @JsonbProperty("databases")
  private Object databases;

  /**
   * Application configuration.
   **/
  @JsonbProperty("apps")
  private Object apps;

  /**
   * Basic information about Domino REST API.
   * 
   * @return version
   **/
  public Object getVersion() {
    return version;
  }

  /**
   * Set version
   **/
  public void setVersion(Object version) {
    this.version = version;
  }

  public AdminBackup version(Object version) {
    this.version = version;
    return this;
  }

  /**
   * All database configuration, including keepconfig(KeepConfig.nsf) which has configuration
   * settings for the Domino REST API.
   * 
   * @return databases
   **/
  public Object getDatabases() {
    return databases;
  }

  /**
   * Set databases
   **/
  public void setDatabases(Object databases) {
    this.databases = databases;
  }

  public AdminBackup databases(Object databases) {
    this.databases = databases;
    return this;
  }

  /**
   * Application configuration.
   * 
   * @return apps
   **/
  public Object getApps() {
    return apps;
  }

  /**
   * Set apps
   **/
  public void setApps(Object apps) {
    this.apps = apps;
  }

  public AdminBackup apps(Object apps) {
    this.apps = apps;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBackup {\n");

    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

