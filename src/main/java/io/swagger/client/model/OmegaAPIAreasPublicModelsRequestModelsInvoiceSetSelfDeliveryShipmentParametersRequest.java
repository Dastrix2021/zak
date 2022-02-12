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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("PaidType")
  private String paidType = null;

  @SerializedName("Date")
  private String date = null;

  @SerializedName("Time")
  private String time = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest docId(String docId) {
    this.docId = docId;
    return this;
  }

   /**
   * Уникальный идентификатор счёта, строка
   * @return docId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор счёта, строка")
  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest paidType(String paidType) {
    this.paidType = paidType;
    return this;
  }

   /**
   * Уникальный идентификатор способа оплаты, строка
   * @return paidType
  **/
  @ApiModelProperty(value = "Уникальный идентификатор способа оплаты, строка")
  public String getPaidType() {
    return paidType;
  }

  public void setPaidType(String paidType) {
    this.paidType = paidType;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Дата в формате dd.mm.yyyy, когда товар заберут, строка
   * @return date
  **/
  @ApiModelProperty(value = "Дата в формате dd.mm.yyyy, когда товар заберут, строка")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Время в формате hh:mm, когда товар заберут, строка
   * @return time
  **/
  @ApiModelProperty(value = "Время в формате hh:mm, когда товар заберут, строка")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest.docId) &&
        Objects.equals(this.paidType, omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest.paidType) &&
        Objects.equals(this.date, omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest.date) &&
        Objects.equals(this.time, omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest.time) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, paidType, date, time, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetSelfDeliveryShipmentParametersRequest {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

