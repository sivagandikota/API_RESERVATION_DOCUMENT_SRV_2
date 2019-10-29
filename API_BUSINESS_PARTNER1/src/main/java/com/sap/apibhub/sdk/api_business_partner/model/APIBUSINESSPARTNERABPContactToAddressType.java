/*
 * OData Service for Business Partner
 * This service enables you to create, read, update, and    delete master data related to Business Partners,    Suppliers, and Customers in an SAP S/4HANA system.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_business_partner.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfAAddressEmailAddressType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfAAddressFaxNumberType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfAAddressHomePageURLType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfAAddressPhoneNumberType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Business Partner Contact Address
 */
@ApiModel(description = "Business Partner Contact Address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:48:53.946Z")
public class APIBUSINESSPARTNERABPContactToAddressType {
  @SerializedName("RelationshipNumber")
  private String relationshipNumber = null;

  @SerializedName("BusinessPartnerCompany")
  private String businessPartnerCompany = null;

  @SerializedName("BusinessPartnerPerson")
  private String businessPartnerPerson = null;

  @SerializedName("ValidityEndDate")
  private String validityEndDate = null;

  @SerializedName("AddressID")
  private String addressID = null;

  @SerializedName("to_EmailAddress")
  private CollectionOfAAddressEmailAddressType toEmailAddress = null;

  @SerializedName("to_FaxNumber")
  private CollectionOfAAddressFaxNumberType toFaxNumber = null;

  @SerializedName("to_MobilePhoneNumber")
  private CollectionOfAAddressPhoneNumberType toMobilePhoneNumber = null;

  @SerializedName("to_PhoneNumber")
  private CollectionOfAAddressPhoneNumberType toPhoneNumber = null;

  @SerializedName("to_URLAddress")
  private CollectionOfAAddressHomePageURLType toURLAddress = null;

  public APIBUSINESSPARTNERABPContactToAddressType relationshipNumber(String relationshipNumber) {
    this.relationshipNumber = relationshipNumber;
    return this;
  }

   /**
   * BP Relationship Number   The business partner relationship number is an internal number that identifies the business partner relationship set.
   * @return relationshipNumber
  **/
  @ApiModelProperty(value = "BP Relationship Number   The business partner relationship number is an internal number that identifies the business partner relationship set.")
  public String getRelationshipNumber() {
    return relationshipNumber;
  }

  public void setRelationshipNumber(String relationshipNumber) {
    this.relationshipNumber = relationshipNumber;
  }

  public APIBUSINESSPARTNERABPContactToAddressType businessPartnerCompany(String businessPartnerCompany) {
    this.businessPartnerCompany = businessPartnerCompany;
    return this;
  }

   /**
   * Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client.
   * @return businessPartnerCompany
  **/
  @ApiModelProperty(value = "Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client.")
  public String getBusinessPartnerCompany() {
    return businessPartnerCompany;
  }

  public void setBusinessPartnerCompany(String businessPartnerCompany) {
    this.businessPartnerCompany = businessPartnerCompany;
  }

  public APIBUSINESSPARTNERABPContactToAddressType businessPartnerPerson(String businessPartnerPerson) {
    this.businessPartnerPerson = businessPartnerPerson;
    return this;
  }

   /**
   * Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client.
   * @return businessPartnerPerson
  **/
  @ApiModelProperty(value = "Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client.")
  public String getBusinessPartnerPerson() {
    return businessPartnerPerson;
  }

  public void setBusinessPartnerPerson(String businessPartnerPerson) {
    this.businessPartnerPerson = businessPartnerPerson;
  }

  public APIBUSINESSPARTNERABPContactToAddressType validityEndDate(String validityEndDate) {
    this.validityEndDate = validityEndDate;
    return this;
  }

   /**
   * Validity Date (Valid To)
   * @return validityEndDate
  **/
  @ApiModelProperty(example = "/Date(1492041600000)/", value = "Validity Date (Valid To)")
  public String getValidityEndDate() {
    return validityEndDate;
  }

  public void setValidityEndDate(String validityEndDate) {
    this.validityEndDate = validityEndDate;
  }

  public APIBUSINESSPARTNERABPContactToAddressType addressID(String addressID) {
    this.addressID = addressID;
    return this;
  }

   /**
   * Internal key for identifying a Business Address Services address.   For more information about the meaning and use of the address number and the Business Address Services concepts, see the function group SZA0 documentation.
   * @return addressID
  **/
  @ApiModelProperty(value = "Internal key for identifying a Business Address Services address.   For more information about the meaning and use of the address number and the Business Address Services concepts, see the function group SZA0 documentation.")
  public String getAddressID() {
    return addressID;
  }

  public void setAddressID(String addressID) {
    this.addressID = addressID;
  }

  public APIBUSINESSPARTNERABPContactToAddressType toEmailAddress(CollectionOfAAddressEmailAddressType toEmailAddress) {
    this.toEmailAddress = toEmailAddress;
    return this;
  }

   /**
   * Get toEmailAddress
   * @return toEmailAddress
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAAddressEmailAddressType getToEmailAddress() {
    return toEmailAddress;
  }

  public void setToEmailAddress(CollectionOfAAddressEmailAddressType toEmailAddress) {
    this.toEmailAddress = toEmailAddress;
  }

  public APIBUSINESSPARTNERABPContactToAddressType toFaxNumber(CollectionOfAAddressFaxNumberType toFaxNumber) {
    this.toFaxNumber = toFaxNumber;
    return this;
  }

   /**
   * Get toFaxNumber
   * @return toFaxNumber
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAAddressFaxNumberType getToFaxNumber() {
    return toFaxNumber;
  }

  public void setToFaxNumber(CollectionOfAAddressFaxNumberType toFaxNumber) {
    this.toFaxNumber = toFaxNumber;
  }

  public APIBUSINESSPARTNERABPContactToAddressType toMobilePhoneNumber(CollectionOfAAddressPhoneNumberType toMobilePhoneNumber) {
    this.toMobilePhoneNumber = toMobilePhoneNumber;
    return this;
  }

   /**
   * Get toMobilePhoneNumber
   * @return toMobilePhoneNumber
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAAddressPhoneNumberType getToMobilePhoneNumber() {
    return toMobilePhoneNumber;
  }

  public void setToMobilePhoneNumber(CollectionOfAAddressPhoneNumberType toMobilePhoneNumber) {
    this.toMobilePhoneNumber = toMobilePhoneNumber;
  }

  public APIBUSINESSPARTNERABPContactToAddressType toPhoneNumber(CollectionOfAAddressPhoneNumberType toPhoneNumber) {
    this.toPhoneNumber = toPhoneNumber;
    return this;
  }

   /**
   * Get toPhoneNumber
   * @return toPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAAddressPhoneNumberType getToPhoneNumber() {
    return toPhoneNumber;
  }

  public void setToPhoneNumber(CollectionOfAAddressPhoneNumberType toPhoneNumber) {
    this.toPhoneNumber = toPhoneNumber;
  }

  public APIBUSINESSPARTNERABPContactToAddressType toURLAddress(CollectionOfAAddressHomePageURLType toURLAddress) {
    this.toURLAddress = toURLAddress;
    return this;
  }

   /**
   * Get toURLAddress
   * @return toURLAddress
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAAddressHomePageURLType getToURLAddress() {
    return toURLAddress;
  }

  public void setToURLAddress(CollectionOfAAddressHomePageURLType toURLAddress) {
    this.toURLAddress = toURLAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBUSINESSPARTNERABPContactToAddressType apIBUSINESSPARTNERABPContactToAddressType = (APIBUSINESSPARTNERABPContactToAddressType) o;
    return Objects.equals(this.relationshipNumber, apIBUSINESSPARTNERABPContactToAddressType.relationshipNumber) &&
        Objects.equals(this.businessPartnerCompany, apIBUSINESSPARTNERABPContactToAddressType.businessPartnerCompany) &&
        Objects.equals(this.businessPartnerPerson, apIBUSINESSPARTNERABPContactToAddressType.businessPartnerPerson) &&
        Objects.equals(this.validityEndDate, apIBUSINESSPARTNERABPContactToAddressType.validityEndDate) &&
        Objects.equals(this.addressID, apIBUSINESSPARTNERABPContactToAddressType.addressID) &&
        Objects.equals(this.toEmailAddress, apIBUSINESSPARTNERABPContactToAddressType.toEmailAddress) &&
        Objects.equals(this.toFaxNumber, apIBUSINESSPARTNERABPContactToAddressType.toFaxNumber) &&
        Objects.equals(this.toMobilePhoneNumber, apIBUSINESSPARTNERABPContactToAddressType.toMobilePhoneNumber) &&
        Objects.equals(this.toPhoneNumber, apIBUSINESSPARTNERABPContactToAddressType.toPhoneNumber) &&
        Objects.equals(this.toURLAddress, apIBUSINESSPARTNERABPContactToAddressType.toURLAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID, toEmailAddress, toFaxNumber, toMobilePhoneNumber, toPhoneNumber, toURLAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBUSINESSPARTNERABPContactToAddressType {\n");
    
    sb.append("    relationshipNumber: ").append(toIndentedString(relationshipNumber)).append("\n");
    sb.append("    businessPartnerCompany: ").append(toIndentedString(businessPartnerCompany)).append("\n");
    sb.append("    businessPartnerPerson: ").append(toIndentedString(businessPartnerPerson)).append("\n");
    sb.append("    validityEndDate: ").append(toIndentedString(validityEndDate)).append("\n");
    sb.append("    addressID: ").append(toIndentedString(addressID)).append("\n");
    sb.append("    toEmailAddress: ").append(toIndentedString(toEmailAddress)).append("\n");
    sb.append("    toFaxNumber: ").append(toIndentedString(toFaxNumber)).append("\n");
    sb.append("    toMobilePhoneNumber: ").append(toIndentedString(toMobilePhoneNumber)).append("\n");
    sb.append("    toPhoneNumber: ").append(toIndentedString(toPhoneNumber)).append("\n");
    sb.append("    toURLAddress: ").append(toIndentedString(toURLAddress)).append("\n");
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
