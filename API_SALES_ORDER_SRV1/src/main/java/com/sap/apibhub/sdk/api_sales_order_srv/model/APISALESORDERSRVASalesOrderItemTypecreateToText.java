/*
 * Sales Order - Create, Read, Update, Delete (A2X)
 * You can use this service to integrate external  applications with sales order processing in SAP  S/4HANA Cloud. In every API call, you can make  use of the following operations:  - You can retrieve  sales orders. Apply any of the filters provided or  retrieve all existing data.  - You can create sales  orders. Note that you must use “deep insert”  requests (a header plus the following entities:  header partner, header pricing element, header  text, payment details, item, item partner, item  pricing element, and item text). You cannot create  entities without including any related entities.  - For  existing sales orders, you can create new items.  Note that you must use “deep insert” requests  (with the following entities: item partner, item pricing  element, and item text). You cannot create entities  without including any related entities.  - For existing  sales orders, you can update the header, header  partner, header pricing element, header text,  payment details, item, item partner, item pricing  element, and item text.  - For existing sales  orders, you can delete the header, header partner,  header pricing element, header text, payment  details, item, item partner, item pricing element,  and item text.  - You can accept or deny approval  requests for sales orders that cannot be processed  without the consent of an approver.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_sales_order_srv.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemTextTypeCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * APISALESORDERSRVASalesOrderItemTypecreateToText
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:59:02.462Z")
public class APISALESORDERSRVASalesOrderItemTypecreateToText {
  @SerializedName("results")
  private List<APISALESORDERSRVASalesOrderItemTextTypeCreate> results = null;

  public APISALESORDERSRVASalesOrderItemTypecreateToText results(List<APISALESORDERSRVASalesOrderItemTextTypeCreate> results) {
    this.results = results;
    return this;
  }

  public APISALESORDERSRVASalesOrderItemTypecreateToText addResultsItem(APISALESORDERSRVASalesOrderItemTextTypeCreate resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<APISALESORDERSRVASalesOrderItemTextTypeCreate>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<APISALESORDERSRVASalesOrderItemTextTypeCreate> getResults() {
    return results;
  }

  public void setResults(List<APISALESORDERSRVASalesOrderItemTextTypeCreate> results) {
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
    APISALESORDERSRVASalesOrderItemTypecreateToText apISALESORDERSRVASalesOrderItemTypecreateToText = (APISALESORDERSRVASalesOrderItemTypecreateToText) o;
    return Objects.equals(this.results, apISALESORDERSRVASalesOrderItemTypecreateToText.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APISALESORDERSRVASalesOrderItemTypecreateToText {\n");
    
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

