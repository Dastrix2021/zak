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
import io.swagger.client.model.OmegaAPIAreasPublicModelsExpensePublicExpenseReference;
import io.swagger.client.model.OmegaAPIAreasPublicModelsInvoicePublicCustomer;
import java.io.IOException;

/**
 * OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo {
  @SerializedName("DocId")
  private String docId = null;

  @SerializedName("Customer")
  private OmegaAPIAreasPublicModelsInvoicePublicCustomer customer = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Date")
  private String date = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Summ")
  private Double summ = null;

  @SerializedName("ExpenseDoc")
  private OmegaAPIAreasPublicModelsExpensePublicExpenseReference expenseDoc = null;

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo docId(String docId) {
    this.docId = docId;
    return this;
  }

   /**
   * Get docId
   * @return docId
  **/
  @ApiModelProperty(value = "")
  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo customer(OmegaAPIAreasPublicModelsInvoicePublicCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public OmegaAPIAreasPublicModelsInvoicePublicCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(OmegaAPIAreasPublicModelsInvoicePublicCustomer customer) {
    this.customer = customer;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo summ(Double summ) {
    this.summ = summ;
    return this;
  }

   /**
   * Get summ
   * @return summ
  **/
  @ApiModelProperty(value = "")
  public Double getSumm() {
    return summ;
  }

  public void setSumm(Double summ) {
    this.summ = summ;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo expenseDoc(OmegaAPIAreasPublicModelsExpensePublicExpenseReference expenseDoc) {
    this.expenseDoc = expenseDoc;
    return this;
  }

   /**
   * Get expenseDoc
   * @return expenseDoc
  **/
  @ApiModelProperty(value = "")
  public OmegaAPIAreasPublicModelsExpensePublicExpenseReference getExpenseDoc() {
    return expenseDoc;
  }

  public void setExpenseDoc(OmegaAPIAreasPublicModelsExpensePublicExpenseReference expenseDoc) {
    this.expenseDoc = expenseDoc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo = (OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo) o;
    return Objects.equals(this.docId, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.docId) &&
        Objects.equals(this.customer, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.customer) &&
        Objects.equals(this.status, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.status) &&
        Objects.equals(this.date, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.date) &&
        Objects.equals(this.number, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.number) &&
        Objects.equals(this.note, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.note) &&
        Objects.equals(this.summ, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.summ) &&
        Objects.equals(this.expenseDoc, omegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo.expenseDoc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId, customer, status, date, number, note, summ, expenseDoc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoicePublicInvoiceMainInfo {\n");
    
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    summ: ").append(toIndentedString(summ)).append("\n");
    sb.append("    expenseDoc: ").append(toIndentedString(expenseDoc)).append("\n");
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

