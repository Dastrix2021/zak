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
 * OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest {
  @SerializedName("IndexFrom")
  private Integer indexFrom = null;

  @SerializedName("SizeToShow")
  private Integer sizeToShow = null;

  @SerializedName("DateFrom")
  private String dateFrom = null;

  @SerializedName("DateTo")
  private String dateTo = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest indexFrom(Integer indexFrom) {
    this.indexFrom = indexFrom;
    return this;
  }

   /**
   * Get indexFrom
   * @return indexFrom
  **/
  @ApiModelProperty(value = "")
  public Integer getIndexFrom() {
    return indexFrom;
  }

  public void setIndexFrom(Integer indexFrom) {
    this.indexFrom = indexFrom;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest sizeToShow(Integer sizeToShow) {
    this.sizeToShow = sizeToShow;
    return this;
  }

   /**
   * Get sizeToShow
   * @return sizeToShow
  **/
  @ApiModelProperty(value = "")
  public Integer getSizeToShow() {
    return sizeToShow;
  }

  public void setSizeToShow(Integer sizeToShow) {
    this.sizeToShow = sizeToShow;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @ApiModelProperty(value = "")
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @ApiModelProperty(value = "")
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest) o;
    return Objects.equals(this.indexFrom, omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest.indexFrom) &&
        Objects.equals(this.sizeToShow, omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest.sizeToShow) &&
        Objects.equals(this.dateFrom, omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest.dateFrom) &&
        Objects.equals(this.dateTo, omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest.dateTo) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexFrom, sizeToShow, dateFrom, dateTo, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsInvoiceGetPagedInvoicesParametersRequest {\n");
    
    sb.append("    indexFrom: ").append(toIndentedString(indexFrom)).append("\n");
    sb.append("    sizeToShow: ").append(toIndentedString(sizeToShow)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

