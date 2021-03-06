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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 */
@ApiModel(description = "PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus {
  @SerializedName("currentHealthy")
  private Integer currentHealthy = null;

  @SerializedName("desiredHealthy")
  private Integer desiredHealthy = null;

  @SerializedName("disruptedPods")
  private Map<String, String> disruptedPods = new HashMap<String, String>();

  @SerializedName("disruptionsAllowed")
  private Integer disruptionsAllowed = null;

  @SerializedName("expectedPods")
  private Integer expectedPods = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus currentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
    return this;
  }

   /**
   * current number of healthy pods
   * @return currentHealthy
  **/
  @ApiModelProperty(required = true, value = "current number of healthy pods")
  public Integer getCurrentHealthy() {
    return currentHealthy;
  }

  public void setCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus desiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return this;
  }

   /**
   * minimum desired number of healthy pods
   * @return desiredHealthy
  **/
  @ApiModelProperty(required = true, value = "minimum desired number of healthy pods")
  public Integer getDesiredHealthy() {
    return desiredHealthy;
  }

  public void setDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus disruptedPods(Map<String, String> disruptedPods) {
    this.disruptedPods = disruptedPods;
    return this;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus putDisruptedPodsItem(String key, String disruptedPodsItem) {
    this.disruptedPods.put(key, disruptedPodsItem);
    return this;
  }

   /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
   * @return disruptedPods
  **/
  @ApiModelProperty(required = true, value = "DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.")
  public Map<String, String> getDisruptedPods() {
    return disruptedPods;
  }

  public void setDisruptedPods(Map<String, String> disruptedPods) {
    this.disruptedPods = disruptedPods;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus disruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

   /**
   * Number of pod disruptions that are currently allowed.
   * @return disruptionsAllowed
  **/
  @ApiModelProperty(required = true, value = "Number of pod disruptions that are currently allowed.")
  public Integer getDisruptionsAllowed() {
    return disruptionsAllowed;
  }

  public void setDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus expectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
    return this;
  }

   /**
   * total number of pods counted by this disruption budget
   * @return expectedPods
  **/
  @ApiModelProperty(required = true, value = "total number of pods counted by this disruption budget")
  public Integer getExpectedPods() {
    return expectedPods;
  }

  public void setExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
  }

  public IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB&#39;s object generation.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and other status informatio is valid only if observedGeneration equals to PDB's object generation.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus = (IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus) o;
    return Objects.equals(this.currentHealthy, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.currentHealthy) &&
        Objects.equals(this.desiredHealthy, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.desiredHealthy) &&
        Objects.equals(this.disruptedPods, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.disruptedPods) &&
        Objects.equals(this.disruptionsAllowed, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.disruptionsAllowed) &&
        Objects.equals(this.expectedPods, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.expectedPods) &&
        Objects.equals(this.observedGeneration, ioK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetStatus {\n");
    
    sb.append("    currentHealthy: ").append(toIndentedString(currentHealthy)).append("\n");
    sb.append("    desiredHealthy: ").append(toIndentedString(desiredHealthy)).append("\n");
    sb.append("    disruptedPods: ").append(toIndentedString(disruptedPods)).append("\n");
    sb.append("    disruptionsAllowed: ").append(toIndentedString(disruptionsAllowed)).append("\n");
    sb.append("    expectedPods: ").append(toIndentedString(expectedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

