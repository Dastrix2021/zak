/*
 * Omega.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Brand with code Parameters Model
 */
@ApiModel(description = "Brand with code Parameters Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Brand")
  private String brand = null;

  @SerializedName("Rest")
  private Integer rest = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Код
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Код")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Бренд
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "Бренд")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest rest(Integer rest) {
    this.rest = rest;
    return this;
  }

   /**
   * Признак наличия товара на остатках, число, 0 - без учета остатков, 1 - только в наличии
   * @return rest
  **/
  @ApiModelProperty(value = "Признак наличия товара на остатках, число, 0 - без учета остатков, 1 - только в наличии")
  public Integer getRest() {
    return rest;
  }

  public void setRest(Integer rest) {
    this.rest = rest;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Ключ доступа, строка
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Ключ доступа, строка")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest omegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest = (OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest) o;
    return Objects.equals(this.code, omegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest.code) &&
        Objects.equals(this.brand, omegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest.brand) &&
        Objects.equals(this.rest, omegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest.rest) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, brand, rest, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    rest: ").append(toIndentedString(rest)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

