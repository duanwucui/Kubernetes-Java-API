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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourceRequirements describes the compute resource requirements.
 */
@ApiModel(description = "ResourceRequirements describes the compute resource requirements.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1ResourceRequirements {
  @SerializedName("limits")
  private Map<String, String> limits = null;

  @SerializedName("requests")
  private Map<String, String> requests = null;

  public IoK8sKubernetesPkgApiV1ResourceRequirements limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ResourceRequirements putLimitsItem(String key, String limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<String, String>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   * @return limits
  **/
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public IoK8sKubernetesPkgApiV1ResourceRequirements requests(Map<String, String> requests) {
    this.requests = requests;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ResourceRequirements putRequestsItem(String key, String requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<String, String>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   * @return requests
  **/
  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  public Map<String, String> getRequests() {
    return requests;
  }

  public void setRequests(Map<String, String> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1ResourceRequirements ioK8sKubernetesPkgApiV1ResourceRequirements = (IoK8sKubernetesPkgApiV1ResourceRequirements) o;
    return Objects.equals(this.limits, ioK8sKubernetesPkgApiV1ResourceRequirements.limits) &&
        Objects.equals(this.requests, ioK8sKubernetesPkgApiV1ResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1ResourceRequirements {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
