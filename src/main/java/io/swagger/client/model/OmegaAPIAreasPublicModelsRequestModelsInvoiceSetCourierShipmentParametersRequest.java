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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("DeliveryTypeId")
  private String deliveryTypeId = null;

  @SerializedName("ServiceTypeId")
  private String serviceTypeId = null;

  @SerializedName("TownId")
  private String townId = null;

  @SerializedName("AddressId")
  private String addressId = null;

  @SerializedName("ContactPersonId")
  private String contactPersonId = null;

  @SerializedName("IsDontSendDocsWithProduct")
  private Boolean isDontSendDocsWithProduct = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest docId(String docId) {
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

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest deliveryTypeId(String deliveryTypeId) {
    this.deliveryTypeId = deliveryTypeId;
    return this;
  }

   /**
   * Уникальный идентификатор типа курьерской доставки, строка
   * @return deliveryTypeId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор типа курьерской доставки, строка")
  public String getDeliveryTypeId() {
    return deliveryTypeId;
  }

  public void setDeliveryTypeId(String deliveryTypeId) {
    this.deliveryTypeId = deliveryTypeId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest serviceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
    return this;
  }

   /**
   * Уникальный идентификатор сервиса курьерской доставки, строка
   * @return serviceTypeId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор сервиса курьерской доставки, строка")
  public String getServiceTypeId() {
    return serviceTypeId;
  }

  public void setServiceTypeId(String serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest townId(String townId) {
    this.townId = townId;
    return this;
  }

   /**
   * Уникальный идентификатор города для курьерской доставки, строка
   * @return townId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор города для курьерской доставки, строка")
  public String getTownId() {
    return townId;
  }

  public void setTownId(String townId) {
    this.townId = townId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Уникальный идентификатор адреса для курьерской доставки, строка
   * @return addressId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор адреса для курьерской доставки, строка")
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest contactPersonId(String contactPersonId) {
    this.contactPersonId = contactPersonId;
    return this;
  }

   /**
   * Уникальный идентификатор контактного лица для курьерской доставки, являеться обязательным для всех договоров, кроме отстрочки, строка
   * @return contactPersonId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор контактного лица для курьерской доставки, являеться обязательным для всех договоров, кроме отстрочки, строка")
  public String getContactPersonId() {
    return contactPersonId;
  }

  public void setContactPersonId(String contactPersonId) {
    this.contactPersonId = contactPersonId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest isDontSendDocsWithProduct(Boolean isDontSendDocsWithProduct) {
    this.isDontSendDocsWithProduct = isDontSendDocsWithProduct;
    return this;
  }

   /**
   * Get isDontSendDocsWithProduct
   * @return isDontSendDocsWithProduct
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsDontSendDocsWithProduct() {
    return isDontSendDocsWithProduct;
  }

  public void setIsDontSendDocsWithProduct(Boolean isDontSendDocsWithProduct) {
    this.isDontSendDocsWithProduct = isDontSendDocsWithProduct;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.docId) &&
        Objects.equals(this.deliveryTypeId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.deliveryTypeId) &&
        Objects.equals(this.serviceTypeId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.serviceTypeId) &&
        Objects.equals(this.townId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.townId) &&
        Objects.equals(this.addressId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.addressId) &&
        Objects.equals(this.contactPersonId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.contactPersonId) &&
        Objects.equals(this.isDontSendDocsWithProduct, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.isDontSendDocsWithProduct) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, deliveryTypeId, serviceTypeId, townId, addressId, contactPersonId, isDontSendDocsWithProduct, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetCourierShipmentParametersRequest {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    deliveryTypeId: ").append(toIndentedString(deliveryTypeId)).append("\n");
    sb.append("    serviceTypeId: ").append(toIndentedString(serviceTypeId)).append("\n");
    sb.append("    townId: ").append(toIndentedString(townId)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    contactPersonId: ").append(toIndentedString(contactPersonId)).append("\n");
    sb.append("    isDontSendDocsWithProduct: ").append(toIndentedString(isDontSendDocsWithProduct)).append("\n");
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

