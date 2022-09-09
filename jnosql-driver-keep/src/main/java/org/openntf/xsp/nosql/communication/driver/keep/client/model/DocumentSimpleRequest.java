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

import java.util.HashMap;

import jakarta.json.bind.annotation.JsonbProperty;

/**
  * This is a sample Json format request body to create or update a domino document. The fields properties are just examples for one testform. 
 **/

public class DocumentSimpleRequest extends HashMap<String, RootTypeForDocumentSimpleRequest> {
  
 /**
   * The form name you want to operate with. 
  **/
  @JsonbProperty("Form")
  private String form;

 /**
   * The form name you want to operate with. 
   * @return form
  **/
  public String getForm() {
    return form;
  }

  /**
    * Set form
  **/
  public void setForm(String form) {
    this.form = form;
  }

  public DocumentSimpleRequest form(String form) {
    this.form = form;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSimpleRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

