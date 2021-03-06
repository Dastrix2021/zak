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
import io.swagger.client.model.OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsInvoicePagedInvoices
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoicePagedInvoices {
  @SerializedName("Invoices")
  private List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo> invoices = null;

  @SerializedName("Total")
  private Long total = null;

  @SerializedName("StartIndex")
  private Integer startIndex = null;

  @SerializedName("Count")
  private Integer count = null;

  public OmegaAPIAreasPublicModelsInvoicePagedInvoices invoices(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo> invoices) {
    this.invoices = invoices;
    return this;
  }

  public OmegaAPIAreasPublicModelsInvoicePagedInvoices addInvoicesItem(OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo> invoices) {
    this.invoices = invoices;
  }

  public OmegaAPIAreasPublicModelsInvoicePagedInvoices total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public OmegaAPIAreasPublicModelsInvoicePagedInvoices startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public OmegaAPIAreasPublicModelsInvoicePagedInvoices count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoicePagedInvoices omegaAPIAreasPublicModelsInvoicePagedInvoices = (OmegaAPIAreasPublicModelsInvoicePagedInvoices) o;
    return Objects.equals(this.invoices, omegaAPIAreasPublicModelsInvoicePagedInvoices.invoices) &&
        Objects.equals(this.total, omegaAPIAreasPublicModelsInvoicePagedInvoices.total) &&
        Objects.equals(this.startIndex, omegaAPIAreasPublicModelsInvoicePagedInvoices.startIndex) &&
        Objects.equals(this.count, omegaAPIAreasPublicModelsInvoicePagedInvoices.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices, total, startIndex, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoicePagedInvoices {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

