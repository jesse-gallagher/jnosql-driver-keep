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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTypeDeserializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;
import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.validation.constraints.NotNull;

/**
  * Meta data to register an application for OAuth IdP
 **/

public class OAuthApplicationRequest  {
  
 /**
   * Human readable Application name
  **/
  @JsonbProperty("client_name")
  private String clientName;

 /**
   * Description what the application does
  **/
  @JsonbProperty("description")
  private String description;

 /**
   * List of callback URLs after consent is given. Must use https with the exception of http://localhost/some_url
  **/
  @JsonbProperty("redirect_uris")
  private List<String> redirectUris = new ArrayList<>();

 /**
   * Scopes the application can (and will) request. When the application requests other scopes, token is denied
  **/
  @JsonbProperty("scope")
  private String scope;

 /**
   * Start page of application. Can be used to create list of apps
  **/
  @JsonbProperty("client_uri")
  private String clientUri;

 /**
   * Optional: application logo URL
  **/
  @JsonbProperty("logo_uri")
  private String logoUri;

  @JsonbTypeSerializer(StatusEnum.Serializer.class)
  @JsonbTypeDeserializer(StatusEnum.Deserializer.class)
  public enum StatusEnum {

    ISACTIVE(String.valueOf("isActive")), DISABLED(String.valueOf("disabled"));


    String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<StatusEnum> {
        @Override
        public StatusEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<StatusEnum> {
        @Override
        public void serialize(StatusEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

 /**
   * Is this application active
  **/
  @JsonbProperty("status")
  private StatusEnum status;

 /**
   * URL, eMail, handles to contact people responsible for the app
  **/
  @JsonbProperty("contacts")
  private List<String> contacts = null;

 /**
   * Token endpoint authentication
  **/
  @JsonbProperty("token_endpoint_auth_method")
  private String tokenEndpointAuthMethod;

 /**
   * Application ID. Empty on creation, required for update
  **/
  @JsonbProperty("client_id")
  private String clientId;

 /**
   * Human readable Application name
   * @return clientName
  **/
  @NotNull
  public String getClientName() {
    return clientName;
  }

  /**
    * Set clientName
  **/
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OAuthApplicationRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

 /**
   * Description what the application does
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

  public OAuthApplicationRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
   * List of callback URLs after consent is given. Must use https with the exception of http://localhost/some_url
   * @return redirectUris
  **/
  @NotNull
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  /**
    * Set redirectUris
  **/
  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OAuthApplicationRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuthApplicationRequest addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

 /**
   * Scopes the application can (and will) request. When the application requests other scopes, token is denied
   * @return scope
  **/
  @NotNull
  public String getScope() {
    return scope;
  }

  /**
    * Set scope
  **/
  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuthApplicationRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Start page of application. Can be used to create list of apps
   * @return clientUri
  **/
  @NotNull
  public String getClientUri() {
    return clientUri;
  }

  /**
    * Set clientUri
  **/
  public void setClientUri(String clientUri) {
    this.clientUri = clientUri;
  }

  public OAuthApplicationRequest clientUri(String clientUri) {
    this.clientUri = clientUri;
    return this;
  }

 /**
   * Optional: application logo URL
   * @return logoUri
  **/
  public String getLogoUri() {
    return logoUri;
  }

  /**
    * Set logoUri
  **/
  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public OAuthApplicationRequest logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

 /**
   * Is this application active
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OAuthApplicationRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * URL, eMail, handles to contact people responsible for the app
   * @return contacts
  **/
  public List<String> getContacts() {
    return contacts;
  }

  /**
    * Set contacts
  **/
  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }

  public OAuthApplicationRequest contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public OAuthApplicationRequest addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

 /**
   * Token endpoint authentication
   * @return tokenEndpointAuthMethod
  **/
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  /**
    * Set tokenEndpointAuthMethod
  **/
  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public OAuthApplicationRequest tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

 /**
   * Application ID. Empty on creation, required for update
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }

  /**
    * Set clientId
  **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthApplicationRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthApplicationRequest {\n");
    
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    clientUri: ").append(toIndentedString(clientUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

