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
import io.swagger.client.model.OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings {
  @SerializedName("Addresses")
  private List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> addresses = null;

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings addresses(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> addresses) {
    this.addresses = addresses;
    return this;
  }

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings addAddressesItem(OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Список адресов, лист обьектов в виде ключ значение, где ключи уникальный идентификатор адреса
   * @return addresses
  **/
  @ApiModelProperty(value = "Список адресов, лист обьектов в виде ключ значение, где ключи уникальный идентификатор адреса")
  public List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings omegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings = (OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings) o;
    return Objects.equals(this.addresses, omegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryAddressSettings {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

