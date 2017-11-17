/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.7.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.patrickianwilson.thirdparty.kubernetes.model;

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
 * NodeCondition contains condition information for a node.
 */
@ApiModel(description = "NodeCondition contains condition information for a node.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1NodeCondition {
  @SerializedName("lastHeartbeatTime")
  private String lastHeartbeatTime = null;

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

  public IoK8sKubernetesPkgApiV1NodeCondition lastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

   /**
   * Last time we got an update on a given condition.
   * @return lastHeartbeatTime
  **/
  @ApiModelProperty(value = "Last time we got an update on a given condition.")
  public String getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }

  public void setLastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }

  public IoK8sKubernetesPkgApiV1NodeCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "Last time the condition transit from one status to another.")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sKubernetesPkgApiV1NodeCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(value = "Human readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sKubernetesPkgApiV1NodeCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "(brief) reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sKubernetesPkgApiV1NodeCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sKubernetesPkgApiV1NodeCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of node condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of node condition.")
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
    IoK8sKubernetesPkgApiV1NodeCondition ioK8sKubernetesPkgApiV1NodeCondition = (IoK8sKubernetesPkgApiV1NodeCondition) o;
    return Objects.equals(this.lastHeartbeatTime, ioK8sKubernetesPkgApiV1NodeCondition.lastHeartbeatTime) &&
        Objects.equals(this.lastTransitionTime, ioK8sKubernetesPkgApiV1NodeCondition.lastTransitionTime) &&
        Objects.equals(this.message, ioK8sKubernetesPkgApiV1NodeCondition.message) &&
        Objects.equals(this.reason, ioK8sKubernetesPkgApiV1NodeCondition.reason) &&
        Objects.equals(this.status, ioK8sKubernetesPkgApiV1NodeCondition.status) &&
        Objects.equals(this.type, ioK8sKubernetesPkgApiV1NodeCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1NodeCondition {\n");
    
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
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
