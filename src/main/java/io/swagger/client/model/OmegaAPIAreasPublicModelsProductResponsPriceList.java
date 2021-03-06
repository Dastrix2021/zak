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
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductRestResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsSearchPublicSupplierRest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsProductResponsPriceList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsProductResponsPriceList {
  @SerializedName("ProductId")
  private Long productId = null;

  @SerializedName("CodeTWHED")
  private String codeTWHED = null;

  @SerializedName("BarCode")
  private String barCode = null;

  @SerializedName("Card")
  private String card = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("BrandDescription")
  private String brandDescription = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DescriptionUkr")
  private String descriptionUkr = null;

  @SerializedName("Info")
  private String info = null;

  @SerializedName("Weight")
  private Float weight = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("CustomerPrice")
  private Double customerPrice = null;

  @SerializedName("EffectiveQuantity")
  private Integer effectiveQuantity = null;

  @SerializedName("EffectivePrice")
  private Double effectivePrice = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("Rests")
  private List<OmegaAPIAreasPublicModelsProductRestResponse> rests = null;

  @SerializedName("QualityDesc")
  private String qualityDesc = null;

  @SerializedName("HardPackingRate")
  private Integer hardPackingRate = null;

  @SerializedName("Analogs")
  private List<OmegaAPIAreasPublicModelsProductResponse> analogs = null;

  @SerializedName("SupplierRests")
  private List<OmegaAPIAreasPublicModelsSearchPublicSupplierRest> supplierRests = null;

  public OmegaAPIAreasPublicModelsProductResponsPriceList productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * ???????????????????? ?????????????????????????? ????????????
   * @return productId
  **/
  @ApiModelProperty(value = "???????????????????? ?????????????????????????? ????????????")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList codeTWHED(String codeTWHED) {
    this.codeTWHED = codeTWHED;
    return this;
  }

   /**
   * ?????? ??????????
   * @return codeTWHED
  **/
  @ApiModelProperty(value = "?????? ??????????")
  public String getCodeTWHED() {
    return codeTWHED;
  }

  public void setCodeTWHED(String codeTWHED) {
    this.codeTWHED = codeTWHED;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList barCode(String barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * ?????????? ??????
   * @return barCode
  **/
  @ApiModelProperty(value = "?????????? ??????")
  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList card(String card) {
    this.card = card;
    return this;
  }

   /**
   * ???????????????? ????????????
   * @return card
  **/
  @ApiModelProperty(value = "???????????????? ????????????")
  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList number(String number) {
    this.number = number;
    return this;
  }

   /**
   * ?????? ????????????
   * @return number
  **/
  @ApiModelProperty(value = "?????? ????????????")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList brandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
    return this;
  }

   /**
   * ?????????? ????????????
   * @return brandDescription
  **/
  @ApiModelProperty(value = "?????????? ????????????")
  public String getBrandDescription() {
    return brandDescription;
  }

  public void setBrandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList description(String description) {
    this.description = description;
    return this;
  }

   /**
   * ???????????????? ????????????
   * @return description
  **/
  @ApiModelProperty(value = "???????????????? ????????????")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList descriptionUkr(String descriptionUkr) {
    this.descriptionUkr = descriptionUkr;
    return this;
  }

   /**
   * ???????????????? ???????????? ???? ????????????????????
   * @return descriptionUkr
  **/
  @ApiModelProperty(value = "???????????????? ???????????? ???? ????????????????????")
  public String getDescriptionUkr() {
    return descriptionUkr;
  }

  public void setDescriptionUkr(String descriptionUkr) {
    this.descriptionUkr = descriptionUkr;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList info(String info) {
    this.info = info;
    return this;
  }

   /**
   * ???????????????????????????? ????????????????????
   * @return info
  **/
  @ApiModelProperty(value = "???????????????????????????? ????????????????????")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList weight(Float weight) {
    this.weight = weight;
    return this;
  }

   /**
   * ?????? ????????????
   * @return weight
  **/
  @ApiModelProperty(value = "?????? ????????????")
  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * ?????????????????? ???????? ????????????
   * @return price
  **/
  @ApiModelProperty(value = "?????????????????? ???????? ????????????")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList customerPrice(Double customerPrice) {
    this.customerPrice = customerPrice;
    return this;
  }

   /**
   * ???????? ???????????? ?????? ??????????????
   * @return customerPrice
  **/
  @ApiModelProperty(value = "???????? ???????????? ?????? ??????????????")
  public Double getCustomerPrice() {
    return customerPrice;
  }

  public void setCustomerPrice(Double customerPrice) {
    this.customerPrice = customerPrice;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList effectiveQuantity(Integer effectiveQuantity) {
    this.effectiveQuantity = effectiveQuantity;
    return this;
  }

   /**
   * ???????????????????? ????????????, ?????? ?????????????? ???????????????? ???????????????? ???????? (?????? ???????????? ?? ???????????? ????????????)
   * @return effectiveQuantity
  **/
  @ApiModelProperty(value = "???????????????????? ????????????, ?????? ?????????????? ???????????????? ???????????????? ???????? (?????? ???????????? ?? ???????????? ????????????)")
  public Integer getEffectiveQuantity() {
    return effectiveQuantity;
  }

  public void setEffectiveQuantity(Integer effectiveQuantity) {
    this.effectiveQuantity = effectiveQuantity;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList effectivePrice(Double effectivePrice) {
    this.effectivePrice = effectivePrice;
    return this;
  }

   /**
   * ???????? ???????????? ?????? ?????????????? ?????? ???????????? ???? EffectiveQuantity
   * @return effectivePrice
  **/
  @ApiModelProperty(value = "???????? ???????????? ?????? ?????????????? ?????? ???????????? ???? EffectiveQuantity")
  public Double getEffectivePrice() {
    return effectivePrice;
  }

  public void setEffectivePrice(Double effectivePrice) {
    this.effectivePrice = effectivePrice;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * ???????????? ???? ?????????????????????? ????????????
   * @return imageUrl
  **/
  @ApiModelProperty(value = "???????????? ???? ?????????????????????? ????????????")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList rests(List<OmegaAPIAreasPublicModelsProductRestResponse> rests) {
    this.rests = rests;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList addRestsItem(OmegaAPIAreasPublicModelsProductRestResponse restsItem) {
    if (this.rests == null) {
      this.rests = new ArrayList<OmegaAPIAreasPublicModelsProductRestResponse>();
    }
    this.rests.add(restsItem);
    return this;
  }

   /**
   * ???????????? ???????????????? ???????????? ???? ??????????????
   * @return rests
  **/
  @ApiModelProperty(value = "???????????? ???????????????? ???????????? ???? ??????????????")
  public List<OmegaAPIAreasPublicModelsProductRestResponse> getRests() {
    return rests;
  }

  public void setRests(List<OmegaAPIAreasPublicModelsProductRestResponse> rests) {
    this.rests = rests;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList qualityDesc(String qualityDesc) {
    this.qualityDesc = qualityDesc;
    return this;
  }

   /**
   * ???????????????? ?????????????? ????????????, ???????? ???? ?????????? - ?????????? ??????????????
   * @return qualityDesc
  **/
  @ApiModelProperty(value = "???????????????? ?????????????? ????????????, ???????? ???? ?????????? - ?????????? ??????????????")
  public String getQualityDesc() {
    return qualityDesc;
  }

  public void setQualityDesc(String qualityDesc) {
    this.qualityDesc = qualityDesc;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList hardPackingRate(Integer hardPackingRate) {
    this.hardPackingRate = hardPackingRate;
    return this;
  }

   /**
   * ?????????????? ?????????? ????????????????
   * @return hardPackingRate
  **/
  @ApiModelProperty(value = "?????????????? ?????????? ????????????????")
  public Integer getHardPackingRate() {
    return hardPackingRate;
  }

  public void setHardPackingRate(Integer hardPackingRate) {
    this.hardPackingRate = hardPackingRate;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList analogs(List<OmegaAPIAreasPublicModelsProductResponse> analogs) {
    this.analogs = analogs;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList addAnalogsItem(OmegaAPIAreasPublicModelsProductResponse analogsItem) {
    if (this.analogs == null) {
      this.analogs = new ArrayList<OmegaAPIAreasPublicModelsProductResponse>();
    }
    this.analogs.add(analogsItem);
    return this;
  }

   /**
   * ??????????????
   * @return analogs
  **/
  @ApiModelProperty(value = "??????????????")
  public List<OmegaAPIAreasPublicModelsProductResponse> getAnalogs() {
    return analogs;
  }

  public void setAnalogs(List<OmegaAPIAreasPublicModelsProductResponse> analogs) {
    this.analogs = analogs;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList supplierRests(List<OmegaAPIAreasPublicModelsSearchPublicSupplierRest> supplierRests) {
    this.supplierRests = supplierRests;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductResponsPriceList addSupplierRestsItem(OmegaAPIAreasPublicModelsSearchPublicSupplierRest supplierRestsItem) {
    if (this.supplierRests == null) {
      this.supplierRests = new ArrayList<OmegaAPIAreasPublicModelsSearchPublicSupplierRest>();
    }
    this.supplierRests.add(supplierRestsItem);
    return this;
  }

   /**
   * ???????????? ?????????????? ?????? ??????????
   * @return supplierRests
  **/
  @ApiModelProperty(value = "???????????? ?????????????? ?????? ??????????")
  public List<OmegaAPIAreasPublicModelsSearchPublicSupplierRest> getSupplierRests() {
    return supplierRests;
  }

  public void setSupplierRests(List<OmegaAPIAreasPublicModelsSearchPublicSupplierRest> supplierRests) {
    this.supplierRests = supplierRests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsProductResponsPriceList omegaAPIAreasPublicModelsProductResponsPriceList = (OmegaAPIAreasPublicModelsProductResponsPriceList) o;
    return Objects.equals(this.productId, omegaAPIAreasPublicModelsProductResponsPriceList.productId) &&
        Objects.equals(this.codeTWHED, omegaAPIAreasPublicModelsProductResponsPriceList.codeTWHED) &&
        Objects.equals(this.barCode, omegaAPIAreasPublicModelsProductResponsPriceList.barCode) &&
        Objects.equals(this.card, omegaAPIAreasPublicModelsProductResponsPriceList.card) &&
        Objects.equals(this.number, omegaAPIAreasPublicModelsProductResponsPriceList.number) &&
        Objects.equals(this.brandDescription, omegaAPIAreasPublicModelsProductResponsPriceList.brandDescription) &&
        Objects.equals(this.description, omegaAPIAreasPublicModelsProductResponsPriceList.description) &&
        Objects.equals(this.descriptionUkr, omegaAPIAreasPublicModelsProductResponsPriceList.descriptionUkr) &&
        Objects.equals(this.info, omegaAPIAreasPublicModelsProductResponsPriceList.info) &&
        Objects.equals(this.weight, omegaAPIAreasPublicModelsProductResponsPriceList.weight) &&
        Objects.equals(this.price, omegaAPIAreasPublicModelsProductResponsPriceList.price) &&
        Objects.equals(this.customerPrice, omegaAPIAreasPublicModelsProductResponsPriceList.customerPrice) &&
        Objects.equals(this.effectiveQuantity, omegaAPIAreasPublicModelsProductResponsPriceList.effectiveQuantity) &&
        Objects.equals(this.effectivePrice, omegaAPIAreasPublicModelsProductResponsPriceList.effectivePrice) &&
        Objects.equals(this.imageUrl, omegaAPIAreasPublicModelsProductResponsPriceList.imageUrl) &&
        Objects.equals(this.rests, omegaAPIAreasPublicModelsProductResponsPriceList.rests) &&
        Objects.equals(this.qualityDesc, omegaAPIAreasPublicModelsProductResponsPriceList.qualityDesc) &&
        Objects.equals(this.hardPackingRate, omegaAPIAreasPublicModelsProductResponsPriceList.hardPackingRate) &&
        Objects.equals(this.analogs, omegaAPIAreasPublicModelsProductResponsPriceList.analogs) &&
        Objects.equals(this.supplierRests, omegaAPIAreasPublicModelsProductResponsPriceList.supplierRests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, codeTWHED, barCode, card, number, brandDescription, description, descriptionUkr, info, weight, price, customerPrice, effectiveQuantity, effectivePrice, imageUrl, rests, qualityDesc, hardPackingRate, analogs, supplierRests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsProductResponsPriceList {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    codeTWHED: ").append(toIndentedString(codeTWHED)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    brandDescription: ").append(toIndentedString(brandDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionUkr: ").append(toIndentedString(descriptionUkr)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    customerPrice: ").append(toIndentedString(customerPrice)).append("\n");
    sb.append("    effectiveQuantity: ").append(toIndentedString(effectiveQuantity)).append("\n");
    sb.append("    effectivePrice: ").append(toIndentedString(effectivePrice)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    rests: ").append(toIndentedString(rests)).append("\n");
    sb.append("    qualityDesc: ").append(toIndentedString(qualityDesc)).append("\n");
    sb.append("    hardPackingRate: ").append(toIndentedString(hardPackingRate)).append("\n");
    sb.append("    analogs: ").append(toIndentedString(analogs)).append("\n");
    sb.append("    supplierRests: ").append(toIndentedString(supplierRests)).append("\n");
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

