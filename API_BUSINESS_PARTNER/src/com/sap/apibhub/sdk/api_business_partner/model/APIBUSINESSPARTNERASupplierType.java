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
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfASupplierCompanyType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfASupplierPurchasingOrgType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Supplier
 */
@ApiModel(description = "Supplier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T06:30:25.755Z")
public class APIBUSINESSPARTNERASupplierType {
  @SerializedName("Supplier")
  private String supplier = null;

  @SerializedName("to_SupplierCompany")
  private CollectionOfASupplierCompanyType toSupplierCompany = null;

  @SerializedName("to_SupplierPurchasingOrg")
  private CollectionOfASupplierPurchasingOrgType toSupplierPurchasingOrg = null;

  public APIBUSINESSPARTNERASupplierType supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system.
   * @return supplier
  **/
  @ApiModelProperty(value = "Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system.")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public APIBUSINESSPARTNERASupplierType toSupplierCompany(CollectionOfASupplierCompanyType toSupplierCompany) {
    this.toSupplierCompany = toSupplierCompany;
    return this;
  }

   /**
   * Get toSupplierCompany
   * @return toSupplierCompany
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASupplierCompanyType getToSupplierCompany() {
    return toSupplierCompany;
  }

  public void setToSupplierCompany(CollectionOfASupplierCompanyType toSupplierCompany) {
    this.toSupplierCompany = toSupplierCompany;
  }

  public APIBUSINESSPARTNERASupplierType toSupplierPurchasingOrg(CollectionOfASupplierPurchasingOrgType toSupplierPurchasingOrg) {
    this.toSupplierPurchasingOrg = toSupplierPurchasingOrg;
    return this;
  }

   /**
   * Get toSupplierPurchasingOrg
   * @return toSupplierPurchasingOrg
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASupplierPurchasingOrgType getToSupplierPurchasingOrg() {
    return toSupplierPurchasingOrg;
  }

  public void setToSupplierPurchasingOrg(CollectionOfASupplierPurchasingOrgType toSupplierPurchasingOrg) {
    this.toSupplierPurchasingOrg = toSupplierPurchasingOrg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBUSINESSPARTNERASupplierType apIBUSINESSPARTNERASupplierType = (APIBUSINESSPARTNERASupplierType) o;
    return Objects.equals(this.supplier, apIBUSINESSPARTNERASupplierType.supplier) &&
        Objects.equals(this.toSupplierCompany, apIBUSINESSPARTNERASupplierType.toSupplierCompany) &&
        Objects.equals(this.toSupplierPurchasingOrg, apIBUSINESSPARTNERASupplierType.toSupplierPurchasingOrg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, toSupplierCompany, toSupplierPurchasingOrg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBUSINESSPARTNERASupplierType {\n");
    
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    toSupplierCompany: ").append(toIndentedString(toSupplierCompany)).append("\n");
    sb.append("    toSupplierPurchasingOrg: ").append(toIndentedString(toSupplierPurchasingOrg)).append("\n");
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

