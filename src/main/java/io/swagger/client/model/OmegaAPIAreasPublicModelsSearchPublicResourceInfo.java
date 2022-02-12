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
 * OmegaAPIAreasPublicModelsSearchPublicResourceInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsSearchPublicResourceInfo {
  @SerializedName("ProductId")
  private Long productId = null;

  @SerializedName("DocType")
  private String docType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Number")
  private Integer number = null;

  public OmegaAPIAreasPublicModelsSearchPublicResourceInfo productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Уникальный идентификатор
   * @return productId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OmegaAPIAreasPublicModelsSearchPublicResourceInfo docType(String docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Формат
   * @return docType
  **/
  @ApiModelProperty(value = "Формат")
  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public OmegaAPIAreasPublicModelsSearchPublicResourceInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание
   * @return description
  **/
  @ApiModelProperty(value = "Описание")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OmegaAPIAreasPublicModelsSearchPublicResourceInfo number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Номер фото
   * @return number
  **/
  @ApiModelProperty(value = "Номер фото")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsSearchPublicResourceInfo omegaAPIAreasPublicModelsSearchPublicResourceInfo = (OmegaAPIAreasPublicModelsSearchPublicResourceInfo) o;
    return Objects.equals(this.productId, omegaAPIAreasPublicModelsSearchPublicResourceInfo.productId) &&
        Objects.equals(this.docType, omegaAPIAreasPublicModelsSearchPublicResourceInfo.docType) &&
        Objects.equals(this.description, omegaAPIAreasPublicModelsSearchPublicResourceInfo.description) &&
        Objects.equals(this.number, omegaAPIAreasPublicModelsSearchPublicResourceInfo.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, docType, description, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsSearchPublicResourceInfo {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
