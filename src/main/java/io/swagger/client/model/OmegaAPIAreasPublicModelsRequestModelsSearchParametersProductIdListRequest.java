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
 * Mode for searching by list produc id.
 */
@ApiModel(description = "Mode for searching by list produc id.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest {
  @SerializedName("ProductIdList")
  private List<Long> productIdList = new ArrayList<Long>();

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest productIdList(List<Long> productIdList) {
    this.productIdList = productIdList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest addProductIdListItem(Long productIdListItem) {
    this.productIdList.add(productIdListItem);
    return this;
  }

   /**
   * Список уникальный идентификаторов товаров
   * @return productIdList
  **/
  @ApiModelProperty(required = true, value = "Список уникальный идентификаторов товаров")
  public List<Long> getProductIdList() {
    return productIdList;
  }

  public void setProductIdList(List<Long> productIdList) {
    this.productIdList = productIdList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest omegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest = (OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest) o;
    return Objects.equals(this.productIdList, omegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest.productIdList) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIdList, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest {\n");
    
    sb.append("    productIdList: ").append(toIndentedString(productIdList)).append("\n");
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

