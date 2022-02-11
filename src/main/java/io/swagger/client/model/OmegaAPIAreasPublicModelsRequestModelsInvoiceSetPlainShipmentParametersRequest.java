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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("AddressId")
  private String addressId = null;

  @SerializedName("RouteId")
  private String routeId = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest docId(String docId) {
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

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Уникальный идентификатор адресса, строка
   * @return addressId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор адресса, строка")
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Уникальный идентификатор маршрута, строка
   * @return routeId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор маршрута, строка")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest.docId) &&
        Objects.equals(this.addressId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest.addressId) &&
        Objects.equals(this.routeId, omegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest.routeId) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, addressId, routeId, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceSetPlainShipmentParametersRequest {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

