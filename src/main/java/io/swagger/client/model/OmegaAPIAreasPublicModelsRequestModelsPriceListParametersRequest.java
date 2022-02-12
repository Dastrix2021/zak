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
 * PriceList Parameters Model
 */
@ApiModel(description = "PriceList Parameters Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest {
  @SerializedName("IsPrepay")
  private Boolean isPrepay = null;

  @SerializedName("From")
  private Integer from = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("AddSupplierRests")
  private Boolean addSupplierRests = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest isPrepay(Boolean isPrepay) {
    this.isPrepay = isPrepay;
    return this;
  }

   /**
   * Признак учета скидки по предоплате, false - без скидки, true - с учетом скидки
   * @return isPrepay
  **/
  @ApiModelProperty(value = "Признак учета скидки по предоплате, false - без скидки, true - с учетом скидки")
  public Boolean getIsPrepay() {
    return isPrepay;
  }

  public void setIsPrepay(Boolean isPrepay) {
    this.isPrepay = isPrepay;
  }

  public OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Номер текущей страницы для постраничного вывода, число, начинается с 0
   * @return from
  **/
  @ApiModelProperty(value = "Номер текущей страницы для постраничного вывода, число, начинается с 0")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество результатов на страницу, число, по-умолчанию 1000
   * @return count
  **/
  @ApiModelProperty(value = "Количество результатов на страницу, число, по-умолчанию 1000")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest addSupplierRests(Boolean addSupplierRests) {
    this.addSupplierRests = addSupplierRests;
    return this;
  }

   /**
   * Добавить в ответ товары под заказ
   * @return addSupplierRests
  **/
  @ApiModelProperty(value = "Добавить в ответ товары под заказ")
  public Boolean getAddSupplierRests() {
    return addSupplierRests;
  }

  public void setAddSupplierRests(Boolean addSupplierRests) {
    this.addSupplierRests = addSupplierRests;
  }

  public OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest) o;
    return Objects.equals(this.isPrepay, omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest.isPrepay) &&
        Objects.equals(this.from, omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest.from) &&
        Objects.equals(this.count, omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest.count) &&
        Objects.equals(this.addSupplierRests, omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest.addSupplierRests) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrepay, from, count, addSupplierRests, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest {\n");
    
    sb.append("    isPrepay: ").append(toIndentedString(isPrepay)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    addSupplierRests: ").append(toIndentedString(addSupplierRests)).append("\n");
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
