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

/**
  * Definition of request to create specific design element View.
 **/

public class DesignViewSimpleRequest  {
  
 /**
   * The name of the view.
  **/
  @JsonbProperty("name")
  private String name;

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

  public DesignViewSimpleRequest name(String name) {
    this.name = name;
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

  public DesignViewSimpleRequest selectionFormula(String selectionFormula) {
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

  public DesignViewSimpleRequest columns(List<DesignColumnSimple> columns) {
    this.columns = columns;
    return this;
  }

  public DesignViewSimpleRequest addColumnsItem(DesignColumnSimple columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignViewSimpleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
