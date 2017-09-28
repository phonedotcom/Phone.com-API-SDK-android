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

/**
 * Each entry in a Voicemail&#39;s from list is an object with the following properties:
 **/
@ApiModel(description = "Each entry in a Voicemail's from list is an object with the following properties:")
public class FromObject {
  
  @SerializedName("number")
  private String number = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;

  /**
   * The caller phone number
   **/
  @ApiModelProperty(value = "The caller phone number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The name / caller ID of the caller
   **/
  @ApiModelProperty(value = "The name / caller ID of the caller")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The city where the caller is from
   **/
  @ApiModelProperty(value = "The city where the caller is from")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The state where the caller is from
   **/
  @ApiModelProperty(value = "The state where the caller is from")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FromObject fromObject = (FromObject) o;
    return (this.number == null ? fromObject.number == null : this.number.equals(fromObject.number)) &&
        (this.name == null ? fromObject.name == null : this.name.equals(fromObject.name)) &&
        (this.city == null ? fromObject.city == null : this.city.equals(fromObject.city)) &&
        (this.state == null ? fromObject.state == null : this.state.equals(fromObject.state));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FromObject {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}