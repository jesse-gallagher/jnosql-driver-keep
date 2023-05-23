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
  * This is one Datatype used to compose other schemas, DesignViewSimple and DesignViewSimpleRequest
 **/

public class DesignColumnSimple  {
  
 /**
   * 
  **/
  @JsonbProperty("name")
  private String name;

 /**
   * 
  **/
  @JsonbProperty("title")
  private String title;

 /**
   * 
  **/
  @JsonbProperty("formula")
  private String formula;

  @JsonbTypeSerializer(SortEnum.Serializer.class)
  @JsonbTypeDeserializer(SortEnum.Deserializer.class)
  public enum SortEnum {

    ASCENDING(String.valueOf("ascending")), DESCENDING(String.valueOf("descending")), NONE(String.valueOf("none"));


    String value;

    SortEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<SortEnum> {
        @Override
        public SortEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (SortEnum b : SortEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<SortEnum> {
        @Override
        public void serialize(SortEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

 /**
   * 
  **/
  @JsonbProperty("sort")
  private SortEnum sort;

 /**
   * 
  **/
  @JsonbProperty("separateMultipleValues")
  private Boolean separateMultipleValues;

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

  public DesignColumnSimple name(String name) {
    this.name = name;
    return this;
  }

 /**
   * 
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  /**
    * Set title
  **/
  public void setTitle(String title) {
    this.title = title;
  }

  public DesignColumnSimple title(String title) {
    this.title = title;
    return this;
  }

 /**
   * 
   * @return formula
  **/
  @NotNull
  public String getFormula() {
    return formula;
  }

  /**
    * Set formula
  **/
  public void setFormula(String formula) {
    this.formula = formula;
  }

  public DesignColumnSimple formula(String formula) {
    this.formula = formula;
    return this;
  }

 /**
   * 
   * @return sort
  **/
  public SortEnum getSort() {
    return sort;
  }

  /**
    * Set sort
  **/
  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public DesignColumnSimple sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

 /**
   * 
   * @return separateMultipleValues
  **/
  @NotNull
  public Boolean getSeparateMultipleValues() {
    return separateMultipleValues;
  }

  /**
    * Set separateMultipleValues
  **/
  public void setSeparateMultipleValues(Boolean separateMultipleValues) {
    this.separateMultipleValues = separateMultipleValues;
  }

  public DesignColumnSimple separateMultipleValues(Boolean separateMultipleValues) {
    this.separateMultipleValues = separateMultipleValues;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignColumnSimple {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    separateMultipleValues: ").append(toIndentedString(separateMultipleValues)).append("\n");
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

