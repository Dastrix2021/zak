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
import io.swagger.client.model.OmegaAPIAreasPublicModelsInvoicePublicInvoice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice {
  @SerializedName("Invoice")
  private OmegaAPIAreasPublicModelsInvoicePublicInvoice invoice = null;

  @SerializedName("MessageList")
  private List<String> messageList = null;

  @SerializedName("ErrorList")
  private List<String> errorList = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice invoice(OmegaAPIAreasPublicModelsInvoicePublicInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public OmegaAPIAreasPublicModelsInvoicePublicInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(OmegaAPIAreasPublicModelsInvoicePublicInvoice invoice) {
    this.invoice = invoice;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice messageList(List<String> messageList) {
    this.messageList = messageList;
    return this;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice addMessageListItem(String messageListItem) {
    if (this.messageList == null) {
      this.messageList = new ArrayList<String>();
    }
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * Get messageList
   * @return messageList
  **/
  @ApiModelProperty(value = "")
  public List<String> getMessageList() {
    return messageList;
  }

  public void setMessageList(List<String> messageList) {
    this.messageList = messageList;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice errorList(List<String> errorList) {
    this.errorList = errorList;
    return this;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice addErrorListItem(String errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<String>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")
  public List<String> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<String> errorList) {
    this.errorList = errorList;
  }

  public OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice omegaAPIAreasPublicModelsInvoicePublicReponseInvoice = (OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice) o;
    return Objects.equals(this.invoice, omegaAPIAreasPublicModelsInvoicePublicReponseInvoice.invoice) &&
        Objects.equals(this.messageList, omegaAPIAreasPublicModelsInvoicePublicReponseInvoice.messageList) &&
        Objects.equals(this.errorList, omegaAPIAreasPublicModelsInvoicePublicReponseInvoice.errorList) &&
        Objects.equals(this.status, omegaAPIAreasPublicModelsInvoicePublicReponseInvoice.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, messageList, errorList, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsInvoicePublicReponseInvoice {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

