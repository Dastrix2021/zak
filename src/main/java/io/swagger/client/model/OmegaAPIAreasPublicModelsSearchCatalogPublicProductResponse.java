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
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductRestResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse {
  @SerializedName("ProductId")
  private Long productId = null;

  @SerializedName("Card")
  private String card = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("BrandDescription")
  private String brandDescription = null;

  @SerializedName("QualityDesc")
  private String qualityDesc = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DescriptionUkr")
  private String descriptionUkr = null;

  @SerializedName("Info")
  private String info = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("CustomerPrice")
  private Double customerPrice = null;

  @SerializedName("EffectiveQuantity")
  private Integer effectiveQuantity = null;

  @SerializedName("EffectivePrice")
  private Double effectivePrice = null;

  @SerializedName("Rests")
  private List<OmegaAPIAreasPublicModelsProductRestResponse> rests = null;

  @SerializedName("Analogs")
  private List<OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse> analogs = null;

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Уникальный идентификатор товара
   * @return productId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор товара")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse card(String card) {
    this.card = card;
    return this;
  }

   /**
   * Карточка товара
   * @return card
  **/
  @ApiModelProperty(value = "Карточка товара")
  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Код товара
   * @return number
  **/
  @ApiModelProperty(value = "Код товара")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse brandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
    return this;
  }

   /**
   * Бренд товара
   * @return brandDescription
  **/
  @ApiModelProperty(value = "Бренд товара")
  public String getBrandDescription() {
    return brandDescription;
  }

  public void setBrandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse qualityDesc(String qualityDesc) {
    this.qualityDesc = qualityDesc;
    return this;
  }

   /**
   * Описание сортный товара, если не пусто - товар сортный
   * @return qualityDesc
  **/
  @ApiModelProperty(value = "Описание сортный товара, если не пусто - товар сортный")
  public String getQualityDesc() {
    return qualityDesc;
  }

  public void setQualityDesc(String qualityDesc) {
    this.qualityDesc = qualityDesc;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание товара
   * @return description
  **/
  @ApiModelProperty(value = "Описание товара")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse descriptionUkr(String descriptionUkr) {
    this.descriptionUkr = descriptionUkr;
    return this;
  }

   /**
   * Описание товара на украинском
   * @return descriptionUkr
  **/
  @ApiModelProperty(value = "Описание товара на украинском")
  public String getDescriptionUkr() {
    return descriptionUkr;
  }

  public void setDescriptionUkr(String descriptionUkr) {
    this.descriptionUkr = descriptionUkr;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Дополнительная информация
   * @return info
  **/
  @ApiModelProperty(value = "Дополнительная информация")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Розничная цена товара
   * @return price
  **/
  @ApiModelProperty(value = "Розничная цена товара")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse customerPrice(Double customerPrice) {
    this.customerPrice = customerPrice;
    return this;
  }

   /**
   * Цена товара для клиента
   * @return customerPrice
  **/
  @ApiModelProperty(value = "Цена товара для клиента")
  public Double getCustomerPrice() {
    return customerPrice;
  }

  public void setCustomerPrice(Double customerPrice) {
    this.customerPrice = customerPrice;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse effectiveQuantity(Integer effectiveQuantity) {
    this.effectiveQuantity = effectiveQuantity;
    return this;
  }

   /**
   * Количество товара, при котором возможно снижение цены (при заказе с одного склада)
   * @return effectiveQuantity
  **/
  @ApiModelProperty(value = "Количество товара, при котором возможно снижение цены (при заказе с одного склада)")
  public Integer getEffectiveQuantity() {
    return effectiveQuantity;
  }

  public void setEffectiveQuantity(Integer effectiveQuantity) {
    this.effectiveQuantity = effectiveQuantity;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse effectivePrice(Double effectivePrice) {
    this.effectivePrice = effectivePrice;
    return this;
  }

   /**
   * Цена товара для клиента при заказе от EffectiveQuantity
   * @return effectivePrice
  **/
  @ApiModelProperty(value = "Цена товара для клиента при заказе от EffectiveQuantity")
  public Double getEffectivePrice() {
    return effectivePrice;
  }

  public void setEffectivePrice(Double effectivePrice) {
    this.effectivePrice = effectivePrice;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse rests(List<OmegaAPIAreasPublicModelsProductRestResponse> rests) {
    this.rests = rests;
    return this;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse addRestsItem(OmegaAPIAreasPublicModelsProductRestResponse restsItem) {
    if (this.rests == null) {
      this.rests = new ArrayList<OmegaAPIAreasPublicModelsProductRestResponse>();
    }
    this.rests.add(restsItem);
    return this;
  }

   /**
   * Список остатков товара по складам
   * @return rests
  **/
  @ApiModelProperty(value = "Список остатков товара по складам")
  public List<OmegaAPIAreasPublicModelsProductRestResponse> getRests() {
    return rests;
  }

  public void setRests(List<OmegaAPIAreasPublicModelsProductRestResponse> rests) {
    this.rests = rests;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse analogs(List<OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse> analogs) {
    this.analogs = analogs;
    return this;
  }

  public OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse addAnalogsItem(OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse analogsItem) {
    if (this.analogs == null) {
      this.analogs = new ArrayList<OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse>();
    }
    this.analogs.add(analogsItem);
    return this;
  }

   /**
   * Аналоги
   * @return analogs
  **/
  @ApiModelProperty(value = "Аналоги")
  public List<OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse> getAnalogs() {
    return analogs;
  }

  public void setAnalogs(List<OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse> analogs) {
    this.analogs = analogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse = (OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse) o;
    return Objects.equals(this.productId, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.productId) &&
        Objects.equals(this.card, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.card) &&
        Objects.equals(this.number, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.number) &&
        Objects.equals(this.brandDescription, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.brandDescription) &&
        Objects.equals(this.qualityDesc, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.qualityDesc) &&
        Objects.equals(this.description, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.description) &&
        Objects.equals(this.descriptionUkr, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.descriptionUkr) &&
        Objects.equals(this.info, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.info) &&
        Objects.equals(this.price, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.price) &&
        Objects.equals(this.customerPrice, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.customerPrice) &&
        Objects.equals(this.effectiveQuantity, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.effectiveQuantity) &&
        Objects.equals(this.effectivePrice, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.effectivePrice) &&
        Objects.equals(this.rests, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.rests) &&
        Objects.equals(this.analogs, omegaAPIAreasPublicModelsSearchCatalogPublicProductResponse.analogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, card, number, brandDescription, qualityDesc, description, descriptionUkr, info, price, customerPrice, effectiveQuantity, effectivePrice, rests, analogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsSearchCatalogPublicProductResponse {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    brandDescription: ").append(toIndentedString(brandDescription)).append("\n");
    sb.append("    qualityDesc: ").append(toIndentedString(qualityDesc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionUkr: ").append(toIndentedString(descriptionUkr)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    customerPrice: ").append(toIndentedString(customerPrice)).append("\n");
    sb.append("    effectiveQuantity: ").append(toIndentedString(effectiveQuantity)).append("\n");
    sb.append("    effectivePrice: ").append(toIndentedString(effectivePrice)).append("\n");
    sb.append("    rests: ").append(toIndentedString(rests)).append("\n");
    sb.append("    analogs: ").append(toIndentedString(analogs)).append("\n");
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

