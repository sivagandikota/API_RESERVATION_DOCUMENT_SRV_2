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
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sales Order Header Pricing Element (API)
 */
@ApiModel(description = "Sales Order Header Pricing Element (API)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:59:02.462Z")
public class APISALESORDERSRVASalesOrderHeaderPrElementType {
  @SerializedName("SalesOrder")
  private String salesOrder = null;

  @SerializedName("PricingProcedureStep")
  private String pricingProcedureStep = null;

  @SerializedName("PricingProcedureCounter")
  private String pricingProcedureCounter = null;

  @SerializedName("to_SalesOrder")
  private APISALESORDERSRVASalesOrderType toSalesOrder = null;

  public APISALESORDERSRVASalesOrderHeaderPrElementType salesOrder(String salesOrder) {
    this.salesOrder = salesOrder;
    return this;
  }

   /**
   * Sales Order
   * @return salesOrder
  **/
  @ApiModelProperty(value = "Sales Order")
  public String getSalesOrder() {
    return salesOrder;
  }

  public void setSalesOrder(String salesOrder) {
    this.salesOrder = salesOrder;
  }

  public APISALESORDERSRVASalesOrderHeaderPrElementType pricingProcedureStep(String pricingProcedureStep) {
    this.pricingProcedureStep = pricingProcedureStep;
    return this;
  }

   /**
   * Number that determines the sequence of the condition within a procedure.
   * @return pricingProcedureStep
  **/
  @ApiModelProperty(value = "Number that determines the sequence of the condition within a procedure.")
  public String getPricingProcedureStep() {
    return pricingProcedureStep;
  }

  public void setPricingProcedureStep(String pricingProcedureStep) {
    this.pricingProcedureStep = pricingProcedureStep;
  }

  public APISALESORDERSRVASalesOrderHeaderPrElementType pricingProcedureCounter(String pricingProcedureCounter) {
    this.pricingProcedureCounter = pricingProcedureCounter;
    return this;
  }

   /**
   * Condition Counter   Access number of the conditions within a step in the pricing procedure.   During automatic pricing, the system takes into account the sequence specified by the counter.
   * @return pricingProcedureCounter
  **/
  @ApiModelProperty(value = "Condition Counter   Access number of the conditions within a step in the pricing procedure.   During automatic pricing, the system takes into account the sequence specified by the counter.")
  public String getPricingProcedureCounter() {
    return pricingProcedureCounter;
  }

  public void setPricingProcedureCounter(String pricingProcedureCounter) {
    this.pricingProcedureCounter = pricingProcedureCounter;
  }

  public APISALESORDERSRVASalesOrderHeaderPrElementType toSalesOrder(APISALESORDERSRVASalesOrderType toSalesOrder) {
    this.toSalesOrder = toSalesOrder;
    return this;
  }

   /**
   * Get toSalesOrder
   * @return toSalesOrder
  **/
  @ApiModelProperty(value = "")
  public APISALESORDERSRVASalesOrderType getToSalesOrder() {
    return toSalesOrder;
  }

  public void setToSalesOrder(APISALESORDERSRVASalesOrderType toSalesOrder) {
    this.toSalesOrder = toSalesOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APISALESORDERSRVASalesOrderHeaderPrElementType apISALESORDERSRVASalesOrderHeaderPrElementType = (APISALESORDERSRVASalesOrderHeaderPrElementType) o;
    return Objects.equals(this.salesOrder, apISALESORDERSRVASalesOrderHeaderPrElementType.salesOrder) &&
        Objects.equals(this.pricingProcedureStep, apISALESORDERSRVASalesOrderHeaderPrElementType.pricingProcedureStep) &&
        Objects.equals(this.pricingProcedureCounter, apISALESORDERSRVASalesOrderHeaderPrElementType.pricingProcedureCounter) &&
        Objects.equals(this.toSalesOrder, apISALESORDERSRVASalesOrderHeaderPrElementType.toSalesOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesOrder, pricingProcedureStep, pricingProcedureCounter, toSalesOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APISALESORDERSRVASalesOrderHeaderPrElementType {\n");
    
    sb.append("    salesOrder: ").append(toIndentedString(salesOrder)).append("\n");
    sb.append("    pricingProcedureStep: ").append(toIndentedString(pricingProcedureStep)).append("\n");
    sb.append("    pricingProcedureCounter: ").append(toIndentedString(pricingProcedureCounter)).append("\n");
    sb.append("    toSalesOrder: ").append(toIndentedString(toSalesOrder)).append("\n");
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

