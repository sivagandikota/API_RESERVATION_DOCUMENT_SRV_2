/*
 * Material Stock Display
 * This service enables you to retrieve material stock information using the OData protocol with filter data provided in the payload. It can be consumed by external warehouse applications.
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_material_stock_srv.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_material_stock_srv.model.APIMATERIALSTOCKSRVAMaterialStockType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CollectionOfAMaterialStockType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:00:53.757Z")
public class CollectionOfAMaterialStockType {
  @SerializedName("results")
  private List<APIMATERIALSTOCKSRVAMaterialStockType> results = null;

  public CollectionOfAMaterialStockType results(List<APIMATERIALSTOCKSRVAMaterialStockType> results) {
    this.results = results;
    return this;
  }

  public CollectionOfAMaterialStockType addResultsItem(APIMATERIALSTOCKSRVAMaterialStockType resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<APIMATERIALSTOCKSRVAMaterialStockType>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<APIMATERIALSTOCKSRVAMaterialStockType> getResults() {
    return results;
  }

  public void setResults(List<APIMATERIALSTOCKSRVAMaterialStockType> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfAMaterialStockType collectionOfAMaterialStockType = (CollectionOfAMaterialStockType) o;
    return Objects.equals(this.results, collectionOfAMaterialStockType.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfAMaterialStockType {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

