/*
 * Reservation Document - Read, Create, Delete
 * This service enables you to retrieve,  create and delete reservation documents.  For example, a user might create a  reservation for a material with some  quantity and assign that reserved material  to a cost center, a sales order or an  asset. A reservation can also be created  for a transfer posting from one plant to  another. The service also allows to delete  existing reservation documents. It can be  consumed by external systems and user  interfaces.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_reservation_document_srv.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypecreateToReservationDocumentItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T11:14:01.327Z")
public class APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate {
  @SerializedName("Reservation")
  private String reservation = null;

  @SerializedName("to_ReservationDocumentItem")
  private APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypecreateToReservationDocumentItem toReservationDocumentItem = null;

  public APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate reservation(String reservation) {
    this.reservation = reservation;
    return this;
  }

   /**
   * Number of Reservation/Dependent Requirement   Alphanumeric key uniquely identifying the document.
   * @return reservation
  **/
  @ApiModelProperty(required = true, value = "Number of Reservation/Dependent Requirement   Alphanumeric key uniquely identifying the document.")
  public String getReservation() {
    return reservation;
  }

  public void setReservation(String reservation) {
    this.reservation = reservation;
  }

  public APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate toReservationDocumentItem(APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypecreateToReservationDocumentItem toReservationDocumentItem) {
    this.toReservationDocumentItem = toReservationDocumentItem;
    return this;
  }

   /**
   * Get toReservationDocumentItem
   * @return toReservationDocumentItem
  **/
  @ApiModelProperty(value = "")
  public APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypecreateToReservationDocumentItem getToReservationDocumentItem() {
    return toReservationDocumentItem;
  }

  public void setToReservationDocumentItem(APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypecreateToReservationDocumentItem toReservationDocumentItem) {
    this.toReservationDocumentItem = toReservationDocumentItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate = (APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate) o;
    return Objects.equals(this.reservation, apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate.reservation) &&
        Objects.equals(this.toReservationDocumentItem, apIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate.toReservationDocumentItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation, toReservationDocumentItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderTypeCreate {\n");
    
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
    sb.append("    toReservationDocumentItem: ").append(toIndentedString(toReservationDocumentItem)).append("\n");
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

