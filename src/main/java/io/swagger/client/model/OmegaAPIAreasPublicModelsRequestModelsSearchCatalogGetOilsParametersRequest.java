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
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest {
  @SerializedName("IsSale")
  private Integer isSale = null;

  @SerializedName("Rest")
  private Integer rest = null;

  @SerializedName("Manufacturers")
  private List<Integer> manufacturers = null;

  @SerializedName("PurposeList")
  private List<String> purposeList = null;

  @SerializedName("ViscosityList")
  private List<String> viscosityList = null;

  @SerializedName("ScopeList")
  private List<String> scopeList = null;

  @SerializedName("ApplicabilityList")
  private List<String> applicabilityList = null;

  @SerializedName("TypeList")
  private List<String> typeList = null;

  @SerializedName("SpecAPIList")
  private List<String> specAPIList = null;

  @SerializedName("SpecACEAList")
  private List<String> specACEAList = null;

  @SerializedName("SpecLSACList")
  private List<String> specLSACList = null;

  @SerializedName("SpecJASOList")
  private List<String> specJASOList = null;

  @SerializedName("SpecOEMList")
  private List<String> specOEMList = null;

  @SerializedName("ISOList")
  private List<String> isOList = null;

  @SerializedName("From")
  private Integer from = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("FormFactor")
  private Integer formFactor = null;

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest isSale(Integer isSale) {
    this.isSale = isSale;
    return this;
  }

   /**
   * Признак снижения цены, 0 -все товары, 1 - только товары со скидкой
   * @return isSale
  **/
  @ApiModelProperty(value = "Признак снижения цены, 0 -все товары, 1 - только товары со скидкой")
  public Integer getIsSale() {
    return isSale;
  }

  public void setIsSale(Integer isSale) {
    this.isSale = isSale;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest rest(Integer rest) {
    this.rest = rest;
    return this;
  }

   /**
   * Признак наличия товара на остатках, число, 0 - без учета остатков, 1 - только в наличии
   * @return rest
  **/
  @ApiModelProperty(value = "Признак наличия товара на остатках, число, 0 - без учета остатков, 1 - только в наличии")
  public Integer getRest() {
    return rest;
  }

  public void setRest(Integer rest) {
    this.rest = rest;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest manufacturers(List<Integer> manufacturers) {
    this.manufacturers = manufacturers;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addManufacturersItem(Integer manufacturersItem) {
    if (this.manufacturers == null) {
      this.manufacturers = new ArrayList<Integer>();
    }
    this.manufacturers.add(manufacturersItem);
    return this;
  }

   /**
   * Бренд
   * @return manufacturers
  **/
  @ApiModelProperty(value = "Бренд")
  public List<Integer> getManufacturers() {
    return manufacturers;
  }

  public void setManufacturers(List<Integer> manufacturers) {
    this.manufacturers = manufacturers;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest purposeList(List<String> purposeList) {
    this.purposeList = purposeList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addPurposeListItem(String purposeListItem) {
    if (this.purposeList == null) {
      this.purposeList = new ArrayList<String>();
    }
    this.purposeList.add(purposeListItem);
    return this;
  }

   /**
   * Назначение
   * @return purposeList
  **/
  @ApiModelProperty(value = "Назначение")
  public List<String> getPurposeList() {
    return purposeList;
  }

  public void setPurposeList(List<String> purposeList) {
    this.purposeList = purposeList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest viscosityList(List<String> viscosityList) {
    this.viscosityList = viscosityList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addViscosityListItem(String viscosityListItem) {
    if (this.viscosityList == null) {
      this.viscosityList = new ArrayList<String>();
    }
    this.viscosityList.add(viscosityListItem);
    return this;
  }

   /**
   * Вязкость
   * @return viscosityList
  **/
  @ApiModelProperty(value = "Вязкость")
  public List<String> getViscosityList() {
    return viscosityList;
  }

  public void setViscosityList(List<String> viscosityList) {
    this.viscosityList = viscosityList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest scopeList(List<String> scopeList) {
    this.scopeList = scopeList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addScopeListItem(String scopeListItem) {
    if (this.scopeList == null) {
      this.scopeList = new ArrayList<String>();
    }
    this.scopeList.add(scopeListItem);
    return this;
  }

   /**
   * Обьем
   * @return scopeList
  **/
  @ApiModelProperty(value = "Обьем")
  public List<String> getScopeList() {
    return scopeList;
  }

  public void setScopeList(List<String> scopeList) {
    this.scopeList = scopeList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest applicabilityList(List<String> applicabilityList) {
    this.applicabilityList = applicabilityList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addApplicabilityListItem(String applicabilityListItem) {
    if (this.applicabilityList == null) {
      this.applicabilityList = new ArrayList<String>();
    }
    this.applicabilityList.add(applicabilityListItem);
    return this;
  }

   /**
   * Применимость
   * @return applicabilityList
  **/
  @ApiModelProperty(value = "Применимость")
  public List<String> getApplicabilityList() {
    return applicabilityList;
  }

  public void setApplicabilityList(List<String> applicabilityList) {
    this.applicabilityList = applicabilityList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest typeList(List<String> typeList) {
    this.typeList = typeList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addTypeListItem(String typeListItem) {
    if (this.typeList == null) {
      this.typeList = new ArrayList<String>();
    }
    this.typeList.add(typeListItem);
    return this;
  }

   /**
   * Тип
   * @return typeList
  **/
  @ApiModelProperty(value = "Тип")
  public List<String> getTypeList() {
    return typeList;
  }

  public void setTypeList(List<String> typeList) {
    this.typeList = typeList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest specAPIList(List<String> specAPIList) {
    this.specAPIList = specAPIList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addSpecAPIListItem(String specAPIListItem) {
    if (this.specAPIList == null) {
      this.specAPIList = new ArrayList<String>();
    }
    this.specAPIList.add(specAPIListItem);
    return this;
  }

   /**
   * Спецификации API
   * @return specAPIList
  **/
  @ApiModelProperty(value = "Спецификации API")
  public List<String> getSpecAPIList() {
    return specAPIList;
  }

  public void setSpecAPIList(List<String> specAPIList) {
    this.specAPIList = specAPIList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest specACEAList(List<String> specACEAList) {
    this.specACEAList = specACEAList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addSpecACEAListItem(String specACEAListItem) {
    if (this.specACEAList == null) {
      this.specACEAList = new ArrayList<String>();
    }
    this.specACEAList.add(specACEAListItem);
    return this;
  }

   /**
   * Спецификации ACEA
   * @return specACEAList
  **/
  @ApiModelProperty(value = "Спецификации ACEA")
  public List<String> getSpecACEAList() {
    return specACEAList;
  }

  public void setSpecACEAList(List<String> specACEAList) {
    this.specACEAList = specACEAList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest specLSACList(List<String> specLSACList) {
    this.specLSACList = specLSACList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addSpecLSACListItem(String specLSACListItem) {
    if (this.specLSACList == null) {
      this.specLSACList = new ArrayList<String>();
    }
    this.specLSACList.add(specLSACListItem);
    return this;
  }

   /**
   * Спецификации LSAC
   * @return specLSACList
  **/
  @ApiModelProperty(value = "Спецификации LSAC")
  public List<String> getSpecLSACList() {
    return specLSACList;
  }

  public void setSpecLSACList(List<String> specLSACList) {
    this.specLSACList = specLSACList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest specJASOList(List<String> specJASOList) {
    this.specJASOList = specJASOList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addSpecJASOListItem(String specJASOListItem) {
    if (this.specJASOList == null) {
      this.specJASOList = new ArrayList<String>();
    }
    this.specJASOList.add(specJASOListItem);
    return this;
  }

   /**
   * Спецификации JASO
   * @return specJASOList
  **/
  @ApiModelProperty(value = "Спецификации JASO")
  public List<String> getSpecJASOList() {
    return specJASOList;
  }

  public void setSpecJASOList(List<String> specJASOList) {
    this.specJASOList = specJASOList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest specOEMList(List<String> specOEMList) {
    this.specOEMList = specOEMList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addSpecOEMListItem(String specOEMListItem) {
    if (this.specOEMList == null) {
      this.specOEMList = new ArrayList<String>();
    }
    this.specOEMList.add(specOEMListItem);
    return this;
  }

   /**
   * Спецификации OEM
   * @return specOEMList
  **/
  @ApiModelProperty(value = "Спецификации OEM")
  public List<String> getSpecOEMList() {
    return specOEMList;
  }

  public void setSpecOEMList(List<String> specOEMList) {
    this.specOEMList = specOEMList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest isOList(List<String> isOList) {
    this.isOList = isOList;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest addIsOListItem(String isOListItem) {
    if (this.isOList == null) {
      this.isOList = new ArrayList<String>();
    }
    this.isOList.add(isOListItem);
    return this;
  }

   /**
   * Спецификации ISO
   * @return isOList
  **/
  @ApiModelProperty(value = "Спецификации ISO")
  public List<String> getIsOList() {
    return isOList;
  }

  public void setIsOList(List<String> isOList) {
    this.isOList = isOList;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Номер с которого начинаются товары - для постраничного вывода, по умолчанию с 0
   * @return from
  **/
  @ApiModelProperty(value = "Номер с которого начинаются товары - для постраничного вывода, по умолчанию с 0")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество результатов на страницу, по-умолчанию 24
   * minimum: 1
   * maximum: 2147483647
   * @return count
  **/
  @ApiModelProperty(value = "Количество результатов на страницу, по-умолчанию 24")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest formFactor(Integer formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * Тип автомобиля, 0 - легковой, 1 - грузовой, 2 - все
   * @return formFactor
  **/
  @ApiModelProperty(value = "Тип автомобиля, 0 - легковой, 1 - грузовой, 2 - все")
  public Integer getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(Integer formFactor) {
    this.formFactor = formFactor;
  }

  public OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest) o;
    return Objects.equals(this.isSale, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.isSale) &&
        Objects.equals(this.rest, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.rest) &&
        Objects.equals(this.manufacturers, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.manufacturers) &&
        Objects.equals(this.purposeList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.purposeList) &&
        Objects.equals(this.viscosityList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.viscosityList) &&
        Objects.equals(this.scopeList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.scopeList) &&
        Objects.equals(this.applicabilityList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.applicabilityList) &&
        Objects.equals(this.typeList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.typeList) &&
        Objects.equals(this.specAPIList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.specAPIList) &&
        Objects.equals(this.specACEAList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.specACEAList) &&
        Objects.equals(this.specLSACList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.specLSACList) &&
        Objects.equals(this.specJASOList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.specJASOList) &&
        Objects.equals(this.specOEMList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.specOEMList) &&
        Objects.equals(this.isOList, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.isOList) &&
        Objects.equals(this.from, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.from) &&
        Objects.equals(this.count, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.count) &&
        Objects.equals(this.formFactor, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.formFactor) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSale, rest, manufacturers, purposeList, viscosityList, scopeList, applicabilityList, typeList, specAPIList, specACEAList, specLSACList, specJASOList, specOEMList, isOList, from, count, formFactor, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsSearchCatalogGetOilsParametersRequest {\n");
    
    sb.append("    isSale: ").append(toIndentedString(isSale)).append("\n");
    sb.append("    rest: ").append(toIndentedString(rest)).append("\n");
    sb.append("    manufacturers: ").append(toIndentedString(manufacturers)).append("\n");
    sb.append("    purposeList: ").append(toIndentedString(purposeList)).append("\n");
    sb.append("    viscosityList: ").append(toIndentedString(viscosityList)).append("\n");
    sb.append("    scopeList: ").append(toIndentedString(scopeList)).append("\n");
    sb.append("    applicabilityList: ").append(toIndentedString(applicabilityList)).append("\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    specAPIList: ").append(toIndentedString(specAPIList)).append("\n");
    sb.append("    specACEAList: ").append(toIndentedString(specACEAList)).append("\n");
    sb.append("    specLSACList: ").append(toIndentedString(specLSACList)).append("\n");
    sb.append("    specJASOList: ").append(toIndentedString(specJASOList)).append("\n");
    sb.append("    specOEMList: ").append(toIndentedString(specOEMList)).append("\n");
    sb.append("    isOList: ").append(toIndentedString(isOList)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
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
