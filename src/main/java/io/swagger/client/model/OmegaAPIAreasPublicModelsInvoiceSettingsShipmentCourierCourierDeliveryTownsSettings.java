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
 * OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings {
  @SerializedName("Towns")
  private List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> towns = null;

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings towns(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> towns) {
    this.towns = towns;
    return this;
  }

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings addTownsItem(OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue townsItem) {
    if (this.towns == null) {
      this.towns = new ArrayList<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue>();
    }
    this.towns.add(townsItem);
    return this;
  }

   /**
   * Список городов, лист обьектов в виде ключ значение, где ключи уникальный идентификатор города
   * @return towns
  **/
  @ApiModelProperty(value = "Список городов, лист обьектов в виде ключ значение, где ключи уникальный идентификатор города")
  public List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> getTowns() {
    return towns;
  }

  public void setTowns(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceKeyValue> towns) {
    this.towns = towns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings omegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings = (OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings) o;
    return Objects.equals(this.towns, omegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings.towns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(towns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentCourierCourierDeliveryTownsSettings {\n");
    
    sb.append("    towns: ").append(toIndentedString(towns)).append("\n");
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

