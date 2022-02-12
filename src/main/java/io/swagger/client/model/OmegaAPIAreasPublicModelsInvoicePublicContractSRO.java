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
 * OmegaAPIAreasPublicModelsInvoicePublicContractSRO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoicePublicContractSRO {
  @SerializedName("SRO")
  private Double SRO = null;

  public OmegaAPIAreasPublicModelsInvoicePublicContractSRO SRO(Double SRO) {
    this.SRO = SRO;
    return this;
  }

   /**
   * Сумма разрешенной отгрузки
   * @return SRO
  **/
  @ApiModelProperty(value = "Сумма разрешенной отгрузки")
  public Double getSRO() {
    return SRO;
  }

  public void setSRO(Double SRO) {
    this.SRO = SRO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoicePublicContractSRO omegaAPIAreasPublicModelsInvoicePublicContractSRO = (OmegaAPIAreasPublicModelsInvoicePublicContractSRO) o;
    return Objects.equals(this.SRO, omegaAPIAreasPublicModelsInvoicePublicContractSRO.SRO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SRO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoicePublicContractSRO {\n");
    
    sb.append("    SRO: ").append(toIndentedString(SRO)).append("\n");
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

