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

import jakarta.json.bind.annotation.JsonbProperty;

/**
  * Entry available in keep API
 **/

public class KeepDBShort  {
  
 /**
   * How this database is known to the API
  **/
  @JsonbProperty("apiName")
  private String apiName;

 /**
   * Description with human readable details of the database's purpose
  **/
  @JsonbProperty("description")
  private String description;

 /**
   * Location on Domino server
  **/
  @JsonbProperty("nsfPath")
  private String nsfPath;

 /**
   * The internal schema name used
  **/
  @JsonbProperty("schemaName")
  private String schemaName;

 /**
   * Alt text for icon
  **/
  @JsonbProperty("iconName")
  private String iconName;

 /**
   * Base64 encoded icon (preferably svg)
  **/
  @JsonbProperty("icon")
  private String icon;

 /**
   * is the definition currently in use
  **/
  @JsonbProperty("isActive")
  private Boolean isActive;

 /**
   * How this database is known to the API
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

  public KeepDBShort apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

 /**
   * Description with human readable details of the database&#39;s purpose
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

  public KeepDBShort description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Location on Domino server
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

  public KeepDBShort nsfPath(String nsfPath) {
    this.nsfPath = nsfPath;
    return this;
  }

 /**
   * The internal schema name used
   * @return schemaName
  **/
  public String getSchemaName() {
    return schemaName;
  }

  /**
    * Set schemaName
  **/
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public KeepDBShort schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

 /**
   * Alt text for icon
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

  public KeepDBShort iconName(String iconName) {
    this.iconName = iconName;
    return this;
  }

 /**
   * Base64 encoded icon (preferably svg)
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

  public KeepDBShort icon(String icon) {
    this.icon = icon;
    return this;
  }

 /**
   * is the definition currently in use
   * @return isActive
  **/
  public Boolean getIsActive() {
    return isActive;
  }

  /**
    * Set isActive
  **/
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public KeepDBShort isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeepDBShort {\n");
    
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nsfPath: ").append(toIndentedString(nsfPath)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
