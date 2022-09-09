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

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
  * Maps a rest config from its internal name to the name it is visible. Info can be seen in the Internet sites of the domino directory. Also known as scope
 **/

public class RestMapping  {
  
  @JsonbProperty("Subject")
  private String subject;

 /**
   * Name that is used in ?datSsource= parameter to access mapped resource
  **/
  @JsonbProperty("apiName")
  private String apiName;

 /**
   * Allows to enable/disable API access without removing cofiguration
  **/
  @JsonbProperty("isActive")
  private Boolean isActive;

 /**
   * Base64 of an icon. SVG preferred
  **/
  @JsonbProperty("icon")
  private String icon;

 /**
   * alt text for icon
  **/
  @JsonbProperty("iconName")
  private String iconName;

  @JsonbProperty("ISiteNameFull")
  private String isiteNameFull;

  @JsonbProperty("ISiteOrg")
  private String isiteOrg;

 /**
   * fully qualified names of servers to run on. ALL when missing or empty
  **/
  @JsonbProperty("servers")
  private List<String> servers = null;

 /**
   * name (without .json extension) of schema file in nsf REST file resources
  **/
  @JsonbProperty("schemaName")
  private String schemaName;

 /**
   * path relative to Domino data directory to nsf database
  **/
  @JsonbProperty("nsfPath")
  private String nsfPath;

 /**
   * Human readable explanation
  **/
  @JsonbProperty("description")
  private String description;

 /**
   * Get subject
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }

  /**
    * Set subject
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public RestMapping subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
   * Name that is used in ?datSsource&#x3D; parameter to access mapped resource
   * @return apiName
  **/
  @NotNull
 @Pattern(regexp="[a-z0-9]")  public String getApiName() {
    return apiName;
  }

  /**
    * Set apiName
  **/
  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public RestMapping apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

 /**
   * Allows to enable/disable API access without removing cofiguration
   * @return isActive
  **/
  @NotNull
  public Boolean getIsActive() {
    return isActive;
  }

  /**
    * Set isActive
  **/
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public RestMapping isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

 /**
   * Base64 of an icon. SVG preferred
   * @return icon
  **/
  public String getIcon() {
    return icon;
  }

  /**
    * Set icon
  **/
  public void setIcon(String icon) {
    this.icon = icon;
  }

  public RestMapping icon(String icon) {
    this.icon = icon;
    return this;
  }

 /**
   * alt text for icon
   * @return iconName
  **/
  public String getIconName() {
    return iconName;
  }

  /**
    * Set iconName
  **/
  public void setIconName(String iconName) {
    this.iconName = iconName;
  }

  public RestMapping iconName(String iconName) {
    this.iconName = iconName;
    return this;
  }

 /**
   * Get isiteNameFull
   * @return isiteNameFull
  **/
  public String getIsiteNameFull() {
    return isiteNameFull;
  }

  /**
    * Set isiteNameFull
  **/
  public void setIsiteNameFull(String isiteNameFull) {
    this.isiteNameFull = isiteNameFull;
  }

  public RestMapping isiteNameFull(String isiteNameFull) {
    this.isiteNameFull = isiteNameFull;
    return this;
  }

 /**
   * Get isiteOrg
   * @return isiteOrg
  **/
  public String getIsiteOrg() {
    return isiteOrg;
  }

  /**
    * Set isiteOrg
  **/
  public void setIsiteOrg(String isiteOrg) {
    this.isiteOrg = isiteOrg;
  }

  public RestMapping isiteOrg(String isiteOrg) {
    this.isiteOrg = isiteOrg;
    return this;
  }

 /**
   * fully qualified names of servers to run on. ALL when missing or empty
   * @return servers
  **/
  public List<String> getServers() {
    return servers;
  }

  /**
    * Set servers
  **/
  public void setServers(List<String> servers) {
    this.servers = servers;
  }

  public RestMapping servers(List<String> servers) {
    this.servers = servers;
    return this;
  }

  public RestMapping addServersItem(String serversItem) {
    this.servers.add(serversItem);
    return this;
  }

 /**
   * name (without .json extension) of schema file in nsf REST file resources
   * @return schemaName
  **/
  @NotNull
 @Pattern(regexp="[a-z0-9]")  public String getSchemaName() {
    return schemaName;
  }

  /**
    * Set schemaName
  **/
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public RestMapping schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

 /**
   * path relative to Domino data directory to nsf database
   * @return nsfPath
  **/
  @NotNull
  public String getNsfPath() {
    return nsfPath;
  }

  /**
    * Set nsfPath
  **/
  public void setNsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
  }

  public RestMapping nsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
    return this;
  }

 /**
   * Human readable explanation
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  /**
    * Set description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public RestMapping description(String description) {
    this.description = description;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestMapping {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    isiteNameFull: ").append(toIndentedString(isiteNameFull)).append("\n");
    sb.append("    isiteOrg: ").append(toIndentedString(isiteOrg)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    nsfPath: ").append(toIndentedString(nsfPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

