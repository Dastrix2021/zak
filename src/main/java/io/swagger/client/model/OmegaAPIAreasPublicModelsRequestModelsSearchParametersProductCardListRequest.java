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
import java.util.ArrayList;
import java.util.List;

/**
 * Mode for searching by list produc card.
 */
@ApiModel(description = "Mode for searching by list produc card.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest {
  @SerializedName("ProductCardList")
  private List<String> productCardList = new ArrayList<String>();

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest productCardList(List<String> productCardList) {
    this.productCardList = productCardList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest addProductCardListItem(String productCardListItem) {
    this.productCardList.add(productCardListItem);
    return this;
  }

   /**
   * Список уникальных номеров карточек
   * @return productCardList
  **/
  @ApiModelProperty(required = true, value = "Список уникальных номеров карточек")
  public List<String> getProductCardList() {
    return productCardList;
  }

  public void setProductCardList(List<String> productCardList) {
    this.productCardList = productCardList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest omegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest = (OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest) o;
    return Objects.equals(this.productCardList, omegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest.productCardList) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCardList, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest {\n");
    
    sb.append("    productCardList: ").append(toIndentedString(productCardList)).append("\n");
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
