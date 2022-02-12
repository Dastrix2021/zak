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
 * OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-27T17:23:48.058+02:00")
public class OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest {
  @SerializedName("Rests")
  private List<Long> rests = new ArrayList<Long>();

  @SerializedName("Key")
  private String key = null;

  public OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest rests(List<Long> rests) {
    this.rests = rests;
    return this;
  }

  public OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest addRestsItem(Long restsItem) {
    this.rests.add(restsItem);
    return this;
  }

   /**
   * Список уникальный идентификаторов товаров
   * @return rests
  **/
  @ApiModelProperty(required = true, value = "Список уникальный идентификаторов товаров")
  public List<Long> getRests() {
    return rests;
  }

  public void setRests(List<Long> rests) {
    this.rests = rests;
  }

  public OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest key(String key) {
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
    OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest omegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest = (OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest) o;
    return Objects.equals(this.rests, omegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest.rests) &&
        Objects.equals(this.key, omegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rests, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmegaAPIAreasPublicModelsRequestModelsGetListRestsParametersRequest {\n");
    
    sb.append("    rests: ").append(toIndentedString(rests)).append("\n");
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
