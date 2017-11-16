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
import io.swagger.client.model.IoK8sKubernetesPkgApiV1ContainerStatus;
import io.swagger.client.model.IoK8sKubernetesPkgApiV1PodCondition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system.
 */
@ApiModel(description = "PodStatus represents information about the status of a pod. Status may trail the actual state of a system.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1PodStatus {
  @SerializedName("conditions")
  private List<IoK8sKubernetesPkgApiV1PodCondition> conditions = null;

  @SerializedName("containerStatuses")
  private List<IoK8sKubernetesPkgApiV1ContainerStatus> containerStatuses = null;

  @SerializedName("hostIP")
  private String hostIP = null;

  @SerializedName("initContainerStatuses")
  private List<IoK8sKubernetesPkgApiV1ContainerStatus> initContainerStatuses = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("podIP")
  private String podIP = null;

  @SerializedName("qosClass")
  private String qosClass = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("startTime")
  private String startTime = null;

  public IoK8sKubernetesPkgApiV1PodStatus conditions(List<IoK8sKubernetesPkgApiV1PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodStatus addConditionsItem(IoK8sKubernetesPkgApiV1PodCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<IoK8sKubernetesPkgApiV1PodCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  public List<IoK8sKubernetesPkgApiV1PodCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sKubernetesPkgApiV1PodCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sKubernetesPkgApiV1PodStatus containerStatuses(List<IoK8sKubernetesPkgApiV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodStatus addContainerStatusesItem(IoK8sKubernetesPkgApiV1ContainerStatus containerStatusesItem) {
    if (this.containerStatuses == null) {
      this.containerStatuses = new ArrayList<IoK8sKubernetesPkgApiV1ContainerStatus>();
    }
    this.containerStatuses.add(containerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return containerStatuses
  **/
  @ApiModelProperty(value = "The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<IoK8sKubernetesPkgApiV1ContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }

  public void setContainerStatuses(List<IoK8sKubernetesPkgApiV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }

  public IoK8sKubernetesPkgApiV1PodStatus hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

   /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   * @return hostIP
  **/
  @ApiModelProperty(value = "IP address of the host to which the pod is assigned. Empty if not yet scheduled.")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public IoK8sKubernetesPkgApiV1PodStatus initContainerStatuses(List<IoK8sKubernetesPkgApiV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodStatus addInitContainerStatusesItem(IoK8sKubernetesPkgApiV1ContainerStatus initContainerStatusesItem) {
    if (this.initContainerStatuses == null) {
      this.initContainerStatuses = new ArrayList<IoK8sKubernetesPkgApiV1ContainerStatus>();
    }
    this.initContainerStatuses.add(initContainerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return initContainerStatuses
  **/
  @ApiModelProperty(value = "The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<IoK8sKubernetesPkgApiV1ContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }

  public void setInitContainerStatuses(List<IoK8sKubernetesPkgApiV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }

  public IoK8sKubernetesPkgApiV1PodStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the pod is in this condition.
   * @return message
  **/
  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sKubernetesPkgApiV1PodStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   * @return phase
  **/
  @ApiModelProperty(value = "Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sKubernetesPkgApiV1PodStatus podIP(String podIP) {
    this.podIP = podIP;
    return this;
  }

   /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   * @return podIP
  **/
  @ApiModelProperty(value = "IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
  public String getPodIP() {
    return podIP;
  }

  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }

  public IoK8sKubernetesPkgApiV1PodStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

   /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md
   * @return qosClass
  **/
  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md")
  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  public IoK8sKubernetesPkgApiV1PodStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;OutOfDisk&#39;
   * @return reason
  **/
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'OutOfDisk'")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sKubernetesPkgApiV1PodStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   * @return startTime
  **/
  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PodStatus ioK8sKubernetesPkgApiV1PodStatus = (IoK8sKubernetesPkgApiV1PodStatus) o;
    return Objects.equals(this.conditions, ioK8sKubernetesPkgApiV1PodStatus.conditions) &&
        Objects.equals(this.containerStatuses, ioK8sKubernetesPkgApiV1PodStatus.containerStatuses) &&
        Objects.equals(this.hostIP, ioK8sKubernetesPkgApiV1PodStatus.hostIP) &&
        Objects.equals(this.initContainerStatuses, ioK8sKubernetesPkgApiV1PodStatus.initContainerStatuses) &&
        Objects.equals(this.message, ioK8sKubernetesPkgApiV1PodStatus.message) &&
        Objects.equals(this.phase, ioK8sKubernetesPkgApiV1PodStatus.phase) &&
        Objects.equals(this.podIP, ioK8sKubernetesPkgApiV1PodStatus.podIP) &&
        Objects.equals(this.qosClass, ioK8sKubernetesPkgApiV1PodStatus.qosClass) &&
        Objects.equals(this.reason, ioK8sKubernetesPkgApiV1PodStatus.reason) &&
        Objects.equals(this.startTime, ioK8sKubernetesPkgApiV1PodStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, containerStatuses, hostIP, initContainerStatuses, message, phase, podIP, qosClass, reason, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PodStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
