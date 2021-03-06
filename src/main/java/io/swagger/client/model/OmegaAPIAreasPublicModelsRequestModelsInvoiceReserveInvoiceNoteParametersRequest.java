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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest docId(String docId) {
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

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Примечание к счету
   * @return note
  **/
  @ApiModelProperty(value = "Примечание к счету")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest.docId) &&
        Objects.equals(this.note, omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest.note) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, note, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceReserveInvoiceNoteParametersRequest {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

