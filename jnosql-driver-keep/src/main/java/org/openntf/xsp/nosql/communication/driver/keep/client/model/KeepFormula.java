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
  * FOrmula in a scripting environment, that can be used for true/false evaluation or as a pre-load/save execution.
 **/

public class KeepFormula  {
  
  @JsonbTypeSerializer(FormulaTypeEnum.Serializer.class)
  @JsonbTypeDeserializer(FormulaTypeEnum.Deserializer.class)
  public enum FormulaTypeEnum {

    DOMINO(String.valueOf("domino"));


    String value;

    FormulaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static final class Deserializer implements JsonbDeserializer<FormulaTypeEnum> {
        @Override
        public FormulaTypeEnum deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
            for (FormulaTypeEnum b : FormulaTypeEnum.values()) {
                if (String.valueOf(b.value).equals(parser.getString())) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + parser.getString() + "'");
        }
    }

    public static final class Serializer implements JsonbSerializer<FormulaTypeEnum> {
        @Override
        public void serialize(FormulaTypeEnum obj, JsonGenerator generator, SerializationContext ctx) {
            generator.write(obj.value);
        }
    }
  }

 /**
   * computation model, currently Domino only
  **/
  @JsonbProperty("formulaType")
  private FormulaTypeEnum formulaType;

 /**
   * Formula code to run
  **/
  @JsonbProperty("formula")
  private String formula;

 /**
   * Optional message to use for fasilure of formula
  **/
  @JsonbProperty("message")
  private String message;

 /**
   * computation model, currently Domino only
   * @return formulaType
  **/
  @NotNull
  public FormulaTypeEnum getFormulaType() {
    return formulaType;
  }

  /**
    * Set formulaType
  **/
  public void setFormulaType(FormulaTypeEnum formulaType) {
    this.formulaType = formulaType;
  }

  public KeepFormula formulaType(FormulaTypeEnum formulaType) {
    this.formulaType = formulaType;
    return this;
  }

 /**
   * Formula code to run
   * @return formula
  **/
  public String getFormula() {
    return formula;
  }

  /**
    * Set formula
  **/
  public void setFormula(String formula) {
    this.formula = formula;
  }

  public KeepFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

 /**
   * Optional message to use for fasilure of formula
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  /**
    * Set message
  **/
  public void setMessage(String message) {
    this.message = message;
  }

  public KeepFormula message(String message) {
    this.message = message;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeepFormula {\n");
    
    sb.append("    formulaType: ").append(toIndentedString(formulaType)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
