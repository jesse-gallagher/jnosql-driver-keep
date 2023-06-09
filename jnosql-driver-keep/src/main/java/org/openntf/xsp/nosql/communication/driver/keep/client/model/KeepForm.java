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

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
  * Definition of a Domino REST API form including form modes
 **/

public class KeepForm  {
  
 /**
   * Name of the form as stored in the document, might be an alias
  **/
  @JsonbProperty("formName")
  private String formName;

 /**
   * Definition of fieldgroups that form detail records inside a document
  **/
  @JsonbProperty("fieldGroups")
  private List<KeepFieldGroup> fieldGroups = null;

 /**
   * Array of FormModes configured for this database. Might be empty
  **/
  @JsonbProperty("formModes")
  private Set<KeepFormMode> formModes = new LinkedHashSet<>();

 /**
   * Alternate names or alias of the form.
  **/
  @JsonbProperty("alias")
  private List<String> alias = null;

 /**
   * Name of the form as stored in the document, might be an alias
   * @return formName
  **/
  @NotNull
  public String getFormName() {
    return formName;
  }

  /**
    * Set formName
  **/
  public void setFormName(String formName) {
    this.formName = formName;
  }

  public KeepForm formName(String formName) {
    this.formName = formName;
    return this;
  }

 /**
   * Definition of fieldgroups that form detail records inside a document
   * @return fieldGroups
  **/
  public List<KeepFieldGroup> getFieldGroups() {
    return fieldGroups;
  }

  /**
    * Set fieldGroups
  **/
  public void setFieldGroups(List<KeepFieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

  public KeepForm fieldGroups(List<KeepFieldGroup> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public KeepForm addFieldGroupsItem(KeepFieldGroup fieldGroupsItem) {
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

 /**
   * Array of FormModes configured for this database. Might be empty
   * @return formModes
  **/
  @NotNull
 @Size(min=1)  public Set<KeepFormMode> getFormModes() {
    return formModes;
  }

  /**
    * Set formModes
  **/
  public void setFormModes(Set<KeepFormMode> formModes) {
    this.formModes = formModes;
  }

  public KeepForm formModes(Set<KeepFormMode> formModes) {
    this.formModes = formModes;
    return this;
  }

  public KeepForm addFormModesItem(KeepFormMode formModesItem) {
    this.formModes.add(formModesItem);
    return this;
  }

 /**
   * Alternate names or alias of the form.
   * @return alias
  **/
  public List<String> getAlias() {
    return alias;
  }

  /**
    * Set alias
  **/
  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public KeepForm alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public KeepForm addAliasItem(String aliasItem) {
    this.alias.add(aliasItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeepForm {\n");
    
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
    sb.append("    formModes: ").append(toIndentedString(formModes)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

