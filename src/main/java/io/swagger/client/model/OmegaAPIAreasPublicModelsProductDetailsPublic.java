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
import io.swagger.client.model.OmegaAPIModelsApplicabilityItem;
import io.swagger.client.model.OmegaAPIModelsKeyValueModel;
import io.swagger.client.model.OmegaAPIModelsOECode;
import io.swagger.client.model.OmegaAPIModelsProductCertificate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsProductDetailsPublic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsProductDetailsPublic {
  @SerializedName("ProductId")
  private Long productId = null;

  @SerializedName("BarCode")
  private String barCode = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("OECodeList")
  private List<OmegaAPIModelsOECode> oeCodeList = null;

  @SerializedName("ApplicabilityList")
  private List<OmegaAPIModelsApplicabilityItem> applicabilityList = null;

  @SerializedName("CertificateList")
  private List<OmegaAPIModelsProductCertificate> certificateList = null;

  @SerializedName("SpecificationList")
  private List<OmegaAPIModelsKeyValueModel> specificationList = null;

  public OmegaAPIAreasPublicModelsProductDetailsPublic productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Уникальный идентификатор товара.
   * @return productId
  **/
  @ApiModelProperty(value = "Уникальный идентификатор товара.")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic barCode(String barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * Штрих код.
   * @return barCode
  **/
  @ApiModelProperty(value = "Штрих код.")
  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Ссылка на изображение товара
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Ссылка на изображение товара")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic oeCodeList(List<OmegaAPIModelsOECode> oeCodeList) {
    this.oeCodeList = oeCodeList;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic addOeCodeListItem(OmegaAPIModelsOECode oeCodeListItem) {
    if (this.oeCodeList == null) {
      this.oeCodeList = new ArrayList<OmegaAPIModelsOECode>();
    }
    this.oeCodeList.add(oeCodeListItem);
    return this;
  }

   /**
   * Список ОЕ косс-кодов.
   * @return oeCodeList
  **/
  @ApiModelProperty(value = "Список ОЕ косс-кодов.")
  public List<OmegaAPIModelsOECode> getOeCodeList() {
    return oeCodeList;
  }

  public void setOeCodeList(List<OmegaAPIModelsOECode> oeCodeList) {
    this.oeCodeList = oeCodeList;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic applicabilityList(List<OmegaAPIModelsApplicabilityItem> applicabilityList) {
    this.applicabilityList = applicabilityList;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic addApplicabilityListItem(OmegaAPIModelsApplicabilityItem applicabilityListItem) {
    if (this.applicabilityList == null) {
      this.applicabilityList = new ArrayList<OmegaAPIModelsApplicabilityItem>();
    }
    this.applicabilityList.add(applicabilityListItem);
    return this;
  }

   /**
   * Дерево применяемости.
   * @return applicabilityList
  **/
  @ApiModelProperty(value = "Дерево применяемости.")
  public List<OmegaAPIModelsApplicabilityItem> getApplicabilityList() {
    return applicabilityList;
  }

  public void setApplicabilityList(List<OmegaAPIModelsApplicabilityItem> applicabilityList) {
    this.applicabilityList = applicabilityList;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic certificateList(List<OmegaAPIModelsProductCertificate> certificateList) {
    this.certificateList = certificateList;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic addCertificateListItem(OmegaAPIModelsProductCertificate certificateListItem) {
    if (this.certificateList == null) {
      this.certificateList = new ArrayList<OmegaAPIModelsProductCertificate>();
    }
    this.certificateList.add(certificateListItem);
    return this;
  }

   /**
   * Список сертификатов.
   * @return certificateList
  **/
  @ApiModelProperty(value = "Список сертификатов.")
  public List<OmegaAPIModelsProductCertificate> getCertificateList() {
    return certificateList;
  }

  public void setCertificateList(List<OmegaAPIModelsProductCertificate> certificateList) {
    this.certificateList = certificateList;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic specificationList(List<OmegaAPIModelsKeyValueModel> specificationList) {
    this.specificationList = specificationList;
    return this;
  }

  public OmegaAPIAreasPublicModelsProductDetailsPublic addSpecificationListItem(OmegaAPIModelsKeyValueModel specificationListItem) {
    if (this.specificationList == null) {
      this.specificationList = new ArrayList<OmegaAPIModelsKeyValueModel>();
    }
    this.specificationList.add(specificationListItem);
    return this;
  }

   /**
   * Список характеристик.
   * @return specificationList
  **/
  @ApiModelProperty(value = "Список характеристик.")
  public List<OmegaAPIModelsKeyValueModel> getSpecificationList() {
    return specificationList;
  }

  public void setSpecificationList(List<OmegaAPIModelsKeyValueModel> specificationList) {
    this.specificationList = specificationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsProductDetailsPublic omegaAPIAreasPublicModelsProductDetailsPublic = (OmegaAPIAreasPublicModelsProductDetailsPublic) o;
    return Objects.equals(this.productId, omegaAPIAreasPublicModelsProductDetailsPublic.productId) &&
        Objects.equals(this.barCode, omegaAPIAreasPublicModelsProductDetailsPublic.barCode) &&
        Objects.equals(this.imageUrl, omegaAPIAreasPublicModelsProductDetailsPublic.imageUrl) &&
        Objects.equals(this.oeCodeList, omegaAPIAreasPublicModelsProductDetailsPublic.oeCodeList) &&
        Objects.equals(this.applicabilityList, omegaAPIAreasPublicModelsProductDetailsPublic.applicabilityList) &&
        Objects.equals(this.certificateList, omegaAPIAreasPublicModelsProductDetailsPublic.certificateList) &&
        Objects.equals(this.specificationList, omegaAPIAreasPublicModelsProductDetailsPublic.specificationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, barCode, imageUrl, oeCodeList, applicabilityList, certificateList, specificationList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsProductDetailsPublic {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    oeCodeList: ").append(toIndentedString(oeCodeList)).append("\n");
    sb.append("    applicabilityList: ").append(toIndentedString(applicabilityList)).append("\n");
    sb.append("    certificateList: ").append(toIndentedString(certificateList)).append("\n");
    sb.append("    specificationList: ").append(toIndentedString(specificationList)).append("\n");
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

