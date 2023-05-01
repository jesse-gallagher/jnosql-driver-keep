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
  * 
 **/

public class DesignFieldSimple  {
  
 /**
   * 
  **/
  @JsonbProperty("name")
  private String name;

  @JsonbTypeSerializer(TypeEnum.Serializer.class)
  @JsonbTypeDeserializer(TypeEnum.Deserializer.class)
  public enum TypeEnum {

    TEXT(String.valueOf("text")), NUMBER(String.valueOf("number")), RICHTEXT(String.valueOf("richtext")), DATETIME(String.valueOf("datetime"));


    String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<TypeEnum> {
        @Override
        public TypeEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<TypeEnum> {
        @Override
        public void serialize(TypeEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

 /**
   * 
  **/
  @JsonbProperty("type")
  private TypeEnum type;

 /**
   * 
  **/
  @JsonbProperty("allowMultiValues")
  private Boolean allowMultiValues;

 /**
   * 
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public DesignFieldSimple name(String name) {
    this.name = name;
    return this;
  }

 /**
   * 
   * @return type
  **/
  @NotNull
  public TypeEnum getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DesignFieldSimple type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * 
   * @return allowMultiValues
  **/
  public Boolean getAllowMultiValues() {
    return allowMultiValues;
  }

  /**
    * Set allowMultiValues
  **/
  public void setAllowMultiValues(Boolean allowMultiValues) {
    this.allowMultiValues = allowMultiValues;
  }

  public DesignFieldSimple allowMultiValues(Boolean allowMultiValues) {
    this.allowMultiValues = allowMultiValues;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignFieldSimple {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowMultiValues: ").append(toIndentedString(allowMultiValues)).append("\n");
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
