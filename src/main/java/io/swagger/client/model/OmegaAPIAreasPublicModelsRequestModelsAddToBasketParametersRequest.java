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
 * OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest {
  @SerializedName("ProductId")
  private Long productId = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Уникальный идентификатор товара
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор товара")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество единиц товара
   * minimum: 1
   * maximum: 2147483647
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Количество единиц товара")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest omegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest) o;
    return Objects.equals(this.productId, omegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest.productId) &&
        Objects.equals(this.count, omegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest.count) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, count, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

