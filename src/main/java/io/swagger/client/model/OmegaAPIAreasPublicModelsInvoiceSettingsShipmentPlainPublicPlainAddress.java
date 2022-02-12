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
 * OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Description")
  private String description = null;

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Уникальный идентификатор адреса, строка
   * @return id
  **/
  @ApiModelProperty(value = "Уникальный идентификатор адреса, строка")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Наименование адреса, список объектов, строка
   * @return description
  **/
  @ApiModelProperty(value = "Наименование адреса, список объектов, строка")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress omegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress = (OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress) o;
    return Objects.equals(this.id, omegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress.id) &&
        Objects.equals(this.description, omegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoiceSettingsShipmentPlainPublicPlainAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
