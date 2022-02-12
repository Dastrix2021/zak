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
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest {
  @SerializedName("DocReasonId")
  private String docReasonId = null;

  @SerializedName("ContactId")
  private String contactId = null;

  /**
   * Тип доставки, 0 - Доставляет Омега, 1 - доставляет клиент, число
   */
  @JsonAdapter(KindShipmentEnum.Adapter.class)
  public enum KindShipmentEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    KindShipmentEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindShipmentEnum fromValue(String text) {
      for (KindShipmentEnum b : KindShipmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KindShipmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindShipmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindShipmentEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return KindShipmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("KindShipment")
  private KindShipmentEnum kindShipment = null;

  @SerializedName("AddressReturnId")
  private String addressReturnId = null;

  @SerializedName("ContactPhoneId")
  private String contactPhoneId = null;

  @SerializedName("ContactEmail")
  private String contactEmail = null;

  @SerializedName("Descr")
  private String descr = null;

  /**
   * Способ оповещения, 0 - Email, 1 - Телефон, число
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
  public enum NotificationTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    NotificationTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String text) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return NotificationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("NotificationType")
  private NotificationTypeEnum notificationType = null;

  @SerializedName("Products")
  private List<OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct> products = new ArrayList<OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct>();

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest docReasonId(String docReasonId) {
    this.docReasonId = docReasonId;
    return this;
  }

   /**
   * Уникальный идентификатор РН, строка
   * @return docReasonId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор РН, строка")
  public String getDocReasonId() {
    return docReasonId;
  }

  public void setDocReasonId(String docReasonId) {
    this.docReasonId = docReasonId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Уникальный идентификатор контактного лица, строка
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор контактного лица, строка")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest kindShipment(KindShipmentEnum kindShipment) {
    this.kindShipment = kindShipment;
    return this;
  }

   /**
   * Тип доставки, 0 - Доставляет Омега, 1 - доставляет клиент, число
   * @return kindShipment
  **/
  @ApiModelProperty(required = true, value = "Тип доставки, 0 - Доставляет Омега, 1 - доставляет клиент, число")
  public KindShipmentEnum getKindShipment() {
    return kindShipment;
  }

  public void setKindShipment(KindShipmentEnum kindShipment) {
    this.kindShipment = kindShipment;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest addressReturnId(String addressReturnId) {
    this.addressReturnId = addressReturnId;
    return this;
  }

   /**
   * Уникальный идентификатор адреса доставки, строка
   * @return addressReturnId
  **/
  @ApiModelProperty(required = true, value = "Уникальный идентификатор адреса доставки, строка")
  public String getAddressReturnId() {
    return addressReturnId;
  }

  public void setAddressReturnId(String addressReturnId) {
    this.addressReturnId = addressReturnId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest contactPhoneId(String contactPhoneId) {
    this.contactPhoneId = contactPhoneId;
    return this;
  }

   /**
   * Уникальный идентификатор номера телефона (если выбран способ оповещения телефоном), строка
   * @return contactPhoneId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор номера телефона (если выбран способ оповещения телефоном), строка")
  public String getContactPhoneId() {
    return contactPhoneId;
  }

  public void setContactPhoneId(String contactPhoneId) {
    this.contactPhoneId = contactPhoneId;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Email (если выбран способ оповещения Email), строка
   * @return contactEmail
  **/
  @ApiModelProperty(value = "Email (если выбран способ оповещения Email), строка")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * Примечание, строка
   * @return descr
  **/
  @ApiModelProperty(value = "Примечание, строка")
  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest notificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Способ оповещения, 0 - Email, 1 - Телефон, число
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Способ оповещения, 0 - Email, 1 - Телефон, число")
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest products(List<OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct> products) {
    this.products = products;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest addProductsItem(OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Спосок товаров в претензии, перечисление объектов
   * @return products
  **/
  @ApiModelProperty(required = true, value = "Спосок товаров в претензии, перечисление объектов")
  public List<OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct> getProducts() {
    return products;
  }

  public void setProducts(List<OmegaAPIAreasPublicModelsRequestModelsClaimBaseClaimProduct> products) {
    this.products = products;
  }

  public OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest) o;
    return Objects.equals(this.docReasonId, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.docReasonId) &&
        Objects.equals(this.contactId, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.contactId) &&
        Objects.equals(this.kindShipment, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.kindShipment) &&
        Objects.equals(this.addressReturnId, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.addressReturnId) &&
        Objects.equals(this.contactPhoneId, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.contactPhoneId) &&
        Objects.equals(this.contactEmail, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.contactEmail) &&
        Objects.equals(this.descr, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.descr) &&
        Objects.equals(this.notificationType, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.notificationType) &&
        Objects.equals(this.products, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.products) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docReasonId, contactId, kindShipment, addressReturnId, contactPhoneId, contactEmail, descr, notificationType, products, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsClaimCreateClaimParametersRequest {\n");
    
    sb.append("    docReasonId: ").append(toIndentedString(docReasonId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    kindShipment: ").append(toIndentedString(kindShipment)).append("\n");
    sb.append("    addressReturnId: ").append(toIndentedString(addressReturnId)).append("\n");
    sb.append("    contactPhoneId: ").append(toIndentedString(contactPhoneId)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

