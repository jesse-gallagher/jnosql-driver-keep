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

import java.lang.reflect.Type;
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
 * Code to send for logging out a current JWT based user
 **/

public class LogoutBody {

  @JsonbTypeSerializer(LogoutEnum.Serializer.class)
  @JsonbTypeDeserializer(LogoutEnum.Deserializer.class)
  public enum LogoutEnum {

    YES(String.valueOf("Yes"));


    String value;

    LogoutEnum(String v) {
      value = v;
    }

    public String value() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<LogoutEnum> {
      @Override
      public LogoutEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        for (LogoutEnum b : LogoutEnum.values()) {
          if (String.valueOf(b.value).equals(parser.getString())) {
            return b;
          }
        }
        throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
      }
    }

    public static final class Serializer implements JsonbSerializer<LogoutEnum> {
      @Override
      public void serialize(LogoutEnum obj, JsonGenerator generator, SerializationContext ctx) {
        generator.write(obj.value);
      }
    }
  }

  /**
   * Body to prevent an accidential logout
   **/
  @JsonbProperty("logout")
  private LogoutEnum logout;

  /**
   * Body to prevent an accidential logout
   * 
   * @return logout
   **/
  @NotNull
  public LogoutEnum getLogout() {
    return logout;
  }

  /**
   * Set logout
   **/
  public void setLogout(LogoutEnum logout) {
    this.logout = logout;
  }

  public LogoutBody logout(LogoutEnum logout) {
    this.logout = logout;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutBody {\n");

    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
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

