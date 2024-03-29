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
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfACustomerDunningType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfACustomerWithHoldingTaxType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Customer Company
 */
@ApiModel(description = "Customer Company")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:48:53.946Z")
public class APIBUSINESSPARTNERACustomerCompanyType {
  @SerializedName("Customer")
  private String customer = null;

  @SerializedName("CompanyCode")
  private String companyCode = null;

  @SerializedName("to_CustomerDunning")
  private CollectionOfACustomerDunningType toCustomerDunning = null;

  @SerializedName("to_WithHoldingTax")
  private CollectionOfACustomerWithHoldingTaxType toWithHoldingTax = null;

  public APIBUSINESSPARTNERACustomerCompanyType customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer Number   Gives an alphanumeric key, which clearly identifies the customer or vendor in the SAP system.
   * @return customer
  **/
  @ApiModelProperty(value = "Customer Number   Gives an alphanumeric key, which clearly identifies the customer or vendor in the SAP system.")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public APIBUSINESSPARTNERACustomerCompanyType companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * The company code is an organizational unit within financial accounting.
   * @return companyCode
  **/
  @ApiModelProperty(value = "The company code is an organizational unit within financial accounting.")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public APIBUSINESSPARTNERACustomerCompanyType toCustomerDunning(CollectionOfACustomerDunningType toCustomerDunning) {
    this.toCustomerDunning = toCustomerDunning;
    return this;
  }

   /**
   * Get toCustomerDunning
   * @return toCustomerDunning
  **/
  @ApiModelProperty(value = "")
  public CollectionOfACustomerDunningType getToCustomerDunning() {
    return toCustomerDunning;
  }

  public void setToCustomerDunning(CollectionOfACustomerDunningType toCustomerDunning) {
    this.toCustomerDunning = toCustomerDunning;
  }

  public APIBUSINESSPARTNERACustomerCompanyType toWithHoldingTax(CollectionOfACustomerWithHoldingTaxType toWithHoldingTax) {
    this.toWithHoldingTax = toWithHoldingTax;
    return this;
  }

   /**
   * Get toWithHoldingTax
   * @return toWithHoldingTax
  **/
  @ApiModelProperty(value = "")
  public CollectionOfACustomerWithHoldingTaxType getToWithHoldingTax() {
    return toWithHoldingTax;
  }

  public void setToWithHoldingTax(CollectionOfACustomerWithHoldingTaxType toWithHoldingTax) {
    this.toWithHoldingTax = toWithHoldingTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBUSINESSPARTNERACustomerCompanyType apIBUSINESSPARTNERACustomerCompanyType = (APIBUSINESSPARTNERACustomerCompanyType) o;
    return Objects.equals(this.customer, apIBUSINESSPARTNERACustomerCompanyType.customer) &&
        Objects.equals(this.companyCode, apIBUSINESSPARTNERACustomerCompanyType.companyCode) &&
        Objects.equals(this.toCustomerDunning, apIBUSINESSPARTNERACustomerCompanyType.toCustomerDunning) &&
        Objects.equals(this.toWithHoldingTax, apIBUSINESSPARTNERACustomerCompanyType.toWithHoldingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, companyCode, toCustomerDunning, toWithHoldingTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBUSINESSPARTNERACustomerCompanyType {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    toCustomerDunning: ").append(toIndentedString(toCustomerDunning)).append("\n");
    sb.append("    toWithHoldingTax: ").append(toIndentedString(toWithHoldingTax)).append("\n");
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

