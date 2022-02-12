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
import io.swagger.client.model.OmegaCommonModelsResponsesError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString {
  @SerializedName("Data")
  private List<String> data = null;

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Errors")
  private List<OmegaCommonModelsResponsesError> errors = null;

  public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString data(List<String> data) {
    this.data = data;
    return this;
  }

  public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<String>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString errors(List<OmegaCommonModelsResponsesError> errors) {
    this.errors = errors;
    return this;
  }

  public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString addErrorsItem(OmegaCommonModelsResponsesError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<OmegaCommonModelsResponsesError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<OmegaCommonModelsResponsesError> getErrors() {
    return errors;
  }

  public void setErrors(List<OmegaCommonModelsResponsesError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString omegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString = (OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString) o;
    return Objects.equals(this.data, omegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString.data) &&
        Objects.equals(this.success, omegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString.success) &&
        Objects.equals(this.errors, omegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, success, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableSystemString {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
