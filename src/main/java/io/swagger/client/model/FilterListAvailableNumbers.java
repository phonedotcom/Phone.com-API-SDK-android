/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class FilterListAvailableNumbers {
  
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("npa")
  private String npa = null;
  @SerializedName("nxx")
  private String nxx = null;
  @SerializedName("xxxx")
  private String xxxx = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("province")
  private String province = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("category")
  private String category = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNpa() {
    return npa;
  }
  public void setNpa(String npa) {
    this.npa = npa;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNxx() {
    return nxx;
  }
  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getXxxx() {
    return xxxx;
  }
  public void setXxxx(String xxxx) {
    this.xxxx = xxxx;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterListAvailableNumbers filterListAvailableNumbers = (FilterListAvailableNumbers) o;
    return (this.phoneNumber == null ? filterListAvailableNumbers.phoneNumber == null : this.phoneNumber.equals(filterListAvailableNumbers.phoneNumber)) &&
        (this.countryCode == null ? filterListAvailableNumbers.countryCode == null : this.countryCode.equals(filterListAvailableNumbers.countryCode)) &&
        (this.npa == null ? filterListAvailableNumbers.npa == null : this.npa.equals(filterListAvailableNumbers.npa)) &&
        (this.nxx == null ? filterListAvailableNumbers.nxx == null : this.nxx.equals(filterListAvailableNumbers.nxx)) &&
        (this.xxxx == null ? filterListAvailableNumbers.xxxx == null : this.xxxx.equals(filterListAvailableNumbers.xxxx)) &&
        (this.city == null ? filterListAvailableNumbers.city == null : this.city.equals(filterListAvailableNumbers.city)) &&
        (this.province == null ? filterListAvailableNumbers.province == null : this.province.equals(filterListAvailableNumbers.province)) &&
        (this.country == null ? filterListAvailableNumbers.country == null : this.country.equals(filterListAvailableNumbers.country)) &&
        (this.price == null ? filterListAvailableNumbers.price == null : this.price.equals(filterListAvailableNumbers.price)) &&
        (this.category == null ? filterListAvailableNumbers.category == null : this.category.equals(filterListAvailableNumbers.category));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phoneNumber == null ? 0: this.phoneNumber.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.npa == null ? 0: this.npa.hashCode());
    result = 31 * result + (this.nxx == null ? 0: this.nxx.hashCode());
    result = 31 * result + (this.xxxx == null ? 0: this.xxxx.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.province == null ? 0: this.province.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterListAvailableNumbers {\n");
    
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  npa: ").append(npa).append("\n");
    sb.append("  nxx: ").append(nxx).append("\n");
    sb.append("  xxxx: ").append(xxxx).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
