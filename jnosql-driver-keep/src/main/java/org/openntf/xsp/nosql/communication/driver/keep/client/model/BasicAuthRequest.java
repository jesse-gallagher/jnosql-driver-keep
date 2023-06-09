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
import jakarta.validation.constraints.NotNull;

/**
  * API way to get a token
 **/

public class BasicAuthRequest  {
  
 /**
   * Password, not written on a Post-it
  **/
  @JsonbProperty("password")
  private String password;

 /**
   * Who you are or your eMail
  **/
  @JsonbProperty("username")
  private String username;

 /**
   * Optional approved scopes. A scope is a string, the scope field a series of space separated strings. If omitted the default value \"MAIL $DATA\" that give access to PIM functions and any database the user has access to. Other scopes can be the name of database aliases like \"demo\", \"crm\". The values are case sensitive. Regular database scopes are lower case. Scopes can't open access, that's what ACLs do, but limit them. For a user driven login, this makes limited sense, so it is mostly to achieve JWT parameter parity, so scopes can be tested without an IdP issuing a JWT at the end of an OAuth process 
  **/
  @JsonbProperty("scope")
  private String scope;

 /**
   * Password, not written on a Post-it
   * @return password
  **/
  @NotNull
  public String getPassword() {
    return password;
  }

  /**
    * Set password
  **/
  public void setPassword(String password) {
    this.password = password;
  }

  public BasicAuthRequest password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Who you are or your eMail
   * @return username
  **/
  @NotNull
  public String getUsername() {
    return username;
  }

  /**
    * Set username
  **/
  public void setUsername(String username) {
    this.username = username;
  }

  public BasicAuthRequest username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Optional approved scopes. A scope is a string, the scope field a series of space separated strings. If omitted the default value \&quot;MAIL $DATA\&quot; that give access to PIM functions and any database the user has access to. Other scopes can be the name of database aliases like \&quot;demo\&quot;, \&quot;crm\&quot;. The values are case sensitive. Regular database scopes are lower case. Scopes can&#39;t open access, that&#39;s what ACLs do, but limit them. For a user driven login, this makes limited sense, so it is mostly to achieve JWT parameter parity, so scopes can be tested without an IdP issuing a JWT at the end of an OAuth process 
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  /**
    * Set scope
  **/
  public void setScope(String scope) {
    this.scope = scope;
  }

  public BasicAuthRequest scope(String scope) {
    this.scope = scope;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicAuthRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

