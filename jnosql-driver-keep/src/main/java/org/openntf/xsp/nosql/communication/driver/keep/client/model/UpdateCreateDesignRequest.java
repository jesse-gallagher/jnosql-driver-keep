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


public class UpdateCreateDesignRequest  {
  
 /**
   * The name of the view.
  **/
  @JsonbProperty("name")
  private String name;

 /**
   * Alternate names or alias of the form.
  **/
  @JsonbProperty("alias")
  private String alias;

 /**
   * The fields on a forms. 
  **/
  @JsonbProperty("fields")
  private List<DesignFieldSimple> fields = null;

 /**
   * The formula to select documents for a view. 
  **/
  @JsonbProperty("selectionFormula")
  private String selectionFormula;

 /**
   * 
  **/
  @JsonbProperty("columns")
  private List<DesignColumnSimple> columns = null;

 /**
   * The name of the view.
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

  public UpdateCreateDesignRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Alternate names or alias of the form.
   * @return alias
  **/
  public String getAlias() {
    return alias;
  }

  /**
    * Set alias
  **/
  public void setAlias(String alias) {
    this.alias = alias;
  }

  public UpdateCreateDesignRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * The fields on a forms. 
   * @return fields
  **/
  public List<DesignFieldSimple> getFields() {
    return fields;
  }

  /**
    * Set fields
  **/
  public void setFields(List<DesignFieldSimple> fields) {
    this.fields = fields;
  }

  public UpdateCreateDesignRequest fields(List<DesignFieldSimple> fields) {
    this.fields = fields;
    return this;
  }

  public UpdateCreateDesignRequest addFieldsItem(DesignFieldSimple fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

 /**
   * The formula to select documents for a view. 
   * @return selectionFormula
  **/
  public String getSelectionFormula() {
    return selectionFormula;
  }

  /**
    * Set selectionFormula
  **/
  public void setSelectionFormula(String selectionFormula) {
    this.selectionFormula = selectionFormula;
  }

  public UpdateCreateDesignRequest selectionFormula(String selectionFormula) {
    this.selectionFormula = selectionFormula;
    return this;
  }

 /**
   * 
   * @return columns
  **/
  public List<DesignColumnSimple> getColumns() {
    return columns;
  }

  /**
    * Set columns
  **/
  public void setColumns(List<DesignColumnSimple> columns) {
    this.columns = columns;
  }

  public UpdateCreateDesignRequest columns(List<DesignColumnSimple> columns) {
    this.columns = columns;
    return this;
  }

  public UpdateCreateDesignRequest addColumnsItem(DesignColumnSimple columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCreateDesignRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    selectionFormula: ").append(toIndentedString(selectionFormula)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
