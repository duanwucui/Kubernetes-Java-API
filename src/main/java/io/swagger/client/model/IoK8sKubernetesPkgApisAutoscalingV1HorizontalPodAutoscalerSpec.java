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
import io.swagger.client.model.IoK8sKubernetesPkgApisAutoscalingV1CrossVersionObjectReference;
import java.io.IOException;

/**
 * specification of a horizontal pod autoscaler.
 */
@ApiModel(description = "specification of a horizontal pod autoscaler.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec {
  @SerializedName("maxReplicas")
  private Integer maxReplicas = null;

  @SerializedName("minReplicas")
  private Integer minReplicas = null;

  @SerializedName("scaleTargetRef")
  private IoK8sKubernetesPkgApisAutoscalingV1CrossVersionObjectReference scaleTargetRef = null;

  @SerializedName("targetCPUUtilizationPercentage")
  private Integer targetCPUUtilizationPercentage = null;

  public IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
   * @return maxReplicas
  **/
  @ApiModelProperty(required = true, value = "upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * lower limit for the number of pods that can be set by the autoscaler, default 1.
   * @return minReplicas
  **/
  @ApiModelProperty(value = "lower limit for the number of pods that can be set by the autoscaler, default 1.")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec scaleTargetRef(IoK8sKubernetesPkgApisAutoscalingV1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

   /**
   * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
   * @return scaleTargetRef
  **/
  @ApiModelProperty(required = true, value = "reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.")
  public IoK8sKubernetesPkgApisAutoscalingV1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(IoK8sKubernetesPkgApisAutoscalingV1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }

  public IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }

   /**
   * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
   * @return targetCPUUtilizationPercentage
  **/
  @ApiModelProperty(value = "target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.")
  public Integer getTargetCPUUtilizationPercentage() {
    return targetCPUUtilizationPercentage;
  }

  public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec ioK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec = (IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, ioK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec.maxReplicas) &&
        Objects.equals(this.minReplicas, ioK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec.minReplicas) &&
        Objects.equals(this.scaleTargetRef, ioK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec.scaleTargetRef) &&
        Objects.equals(this.targetCPUUtilizationPercentage, ioK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec.targetCPUUtilizationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisAutoscalingV1HorizontalPodAutoscalerSpec {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
    sb.append("    targetCPUUtilizationPercentage: ").append(toIndentedString(targetCPUUtilizationPercentage)).append("\n");
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

