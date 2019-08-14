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
import com.sap.apibhub.sdk.api_material_stock_srv.model.CollectionOfAMaterialStockType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Wrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-07T13:00:53.757Z")
public class Wrapper {
  @SerializedName("d")
  private CollectionOfAMaterialStockType d = null;

  public Wrapper d(CollectionOfAMaterialStockType d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @ApiModelProperty(value = "")
  public CollectionOfAMaterialStockType getD() {
    return d;
  }

  public void setD(CollectionOfAMaterialStockType d) {
    this.d = d;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wrapper wrapper = (Wrapper) o;
    return Objects.equals(this.d, wrapper.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wrapper {\n");
    
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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

