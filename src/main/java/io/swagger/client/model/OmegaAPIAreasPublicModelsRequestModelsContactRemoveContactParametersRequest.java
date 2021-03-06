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
 * OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest {
  @SerializedName("ContactId")
  private String contactId = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Уникальный идентификатор контактного лица, которое нужно удалить
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор контактного лица, которое нужно удалить")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest omegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest) o;
    return Objects.equals(this.contactId, omegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest.contactId) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsContactRemoveContactParametersRequest {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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

