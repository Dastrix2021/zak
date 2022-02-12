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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest docId(String docId) {
    this.docId = docId;
    return this;
  }

   /**
   * Уникальный идентификатор ранее сохранёного счёта
   * @return docId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор ранее сохранёного счёта")
  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest.docId) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceParametersRequest {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
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

