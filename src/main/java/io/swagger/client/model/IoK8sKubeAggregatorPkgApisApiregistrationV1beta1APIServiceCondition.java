/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.7.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition {
  @SerializedName("lastTransitionTime")
  private String lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the status of the condition. Can be True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status is the status of the condition. Can be True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type is the type of the condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type is the type of the condition.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition = (IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition) o;
    return Objects.equals(this.lastTransitionTime, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition.lastTransitionTime) &&
        Objects.equals(this.message, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition.message) &&
        Objects.equals(this.reason, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition.reason) &&
        Objects.equals(this.status, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition.status) &&
        Objects.equals(this.type, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceCondition {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

