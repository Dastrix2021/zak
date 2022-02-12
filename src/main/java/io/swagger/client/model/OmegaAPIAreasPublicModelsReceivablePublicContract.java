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
import io.swagger.client.model.OmegaAPIAreasPublicModelsReceivablePublicDocument;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OmegaAPIAreasPublicModelsReceivablePublicContract
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsReceivablePublicContract {
  @SerializedName("ClientId")
  private UUID clientId = null;

  @SerializedName("DocId")
  private UUID docId = null;

  @SerializedName("DocName")
  private String docName = null;

  @SerializedName("Summa")
  private String summa = null;

  @SerializedName("Sum")
  private Double sum = null;

  @SerializedName("Credit")
  private Double credit = null;

  @SerializedName("Debit")
  private Double debit = null;

  @SerializedName("Expiration")
  private Double expiration = null;

  @SerializedName("PercentExpiration")
  private Double percentExpiration = null;

  @SerializedName("Documents")
  private List<OmegaAPIAreasPublicModelsReceivablePublicDocument> documents = null;

  public OmegaAPIAreasPublicModelsReceivablePublicContract clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract docId(UUID docId) {
    this.docId = docId;
    return this;
  }

   /**
   * Get docId
   * @return docId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getDocId() {
    return docId;
  }

  public void setDocId(UUID docId) {
    this.docId = docId;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract docName(String docName) {
    this.docName = docName;
    return this;
  }

   /**
   * Get docName
   * @return docName
  **/
  @ApiModelProperty(value = "")
  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract summa(String summa) {
    this.summa = summa;
    return this;
  }

   /**
   * Get summa
   * @return summa
  **/
  @ApiModelProperty(value = "")
  public String getSumma() {
    return summa;
  }

  public void setSumma(String summa) {
    this.summa = summa;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract sum(Double sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @ApiModelProperty(value = "")
  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract credit(Double credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @ApiModelProperty(value = "")
  public Double getCredit() {
    return credit;
  }

  public void setCredit(Double credit) {
    this.credit = credit;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract debit(Double debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @ApiModelProperty(value = "")
  public Double getDebit() {
    return debit;
  }

  public void setDebit(Double debit) {
    this.debit = debit;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract expiration(Double expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")
  public Double getExpiration() {
    return expiration;
  }

  public void setExpiration(Double expiration) {
    this.expiration = expiration;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract percentExpiration(Double percentExpiration) {
    this.percentExpiration = percentExpiration;
    return this;
  }

   /**
   * Get percentExpiration
   * @return percentExpiration
  **/
  @ApiModelProperty(value = "")
  public Double getPercentExpiration() {
    return percentExpiration;
  }

  public void setPercentExpiration(Double percentExpiration) {
    this.percentExpiration = percentExpiration;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract documents(List<OmegaAPIAreasPublicModelsReceivablePublicDocument> documents) {
    this.documents = documents;
    return this;
  }

  public OmegaAPIAreasPublicModelsReceivablePublicContract addDocumentsItem(OmegaAPIAreasPublicModelsReceivablePublicDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<OmegaAPIAreasPublicModelsReceivablePublicDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  public List<OmegaAPIAreasPublicModelsReceivablePublicDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<OmegaAPIAreasPublicModelsReceivablePublicDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsReceivablePublicContract omegaAPIAreasPublicModelsReceivablePublicContract = (OmegaAPIAreasPublicModelsReceivablePublicContract) o;
    return Objects.equals(this.clientId, omegaAPIAreasPublicModelsReceivablePublicContract.clientId) &&
        Objects.equals(this.docId, omegaAPIAreasPublicModelsReceivablePublicContract.docId) &&
        Objects.equals(this.docName, omegaAPIAreasPublicModelsReceivablePublicContract.docName) &&
        Objects.equals(this.summa, omegaAPIAreasPublicModelsReceivablePublicContract.summa) &&
        Objects.equals(this.sum, omegaAPIAreasPublicModelsReceivablePublicContract.sum) &&
        Objects.equals(this.credit, omegaAPIAreasPublicModelsReceivablePublicContract.credit) &&
        Objects.equals(this.debit, omegaAPIAreasPublicModelsReceivablePublicContract.debit) &&
        Objects.equals(this.expiration, omegaAPIAreasPublicModelsReceivablePublicContract.expiration) &&
        Objects.equals(this.percentExpiration, omegaAPIAreasPublicModelsReceivablePublicContract.percentExpiration) &&
        Objects.equals(this.documents, omegaAPIAreasPublicModelsReceivablePublicContract.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, docId, docName, summa, sum, credit, debit, expiration, percentExpiration, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsReceivablePublicContract {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    summa: ").append(toIndentedString(summa)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    percentExpiration: ").append(toIndentedString(percentExpiration)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
