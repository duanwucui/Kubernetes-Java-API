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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1ConfigMapKeySelector;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1ObjectFieldSelector;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1ResourceFieldSelector;
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1SecretKeySelector;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnvVarSource represents a source for the value of an EnvVar.
 */
@ApiModel(description = "EnvVarSource represents a source for the value of an EnvVar.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1EnvVarSource {
  @SerializedName("configMapKeyRef")
  private IoK8sKubernetesPkgApiV1ConfigMapKeySelector configMapKeyRef = null;

  @SerializedName("fieldRef")
  private IoK8sKubernetesPkgApiV1ObjectFieldSelector fieldRef = null;

  @SerializedName("resourceFieldRef")
  private IoK8sKubernetesPkgApiV1ResourceFieldSelector resourceFieldRef = null;

  @SerializedName("secretKeyRef")
  private IoK8sKubernetesPkgApiV1SecretKeySelector secretKeyRef = null;

  public IoK8sKubernetesPkgApiV1EnvVarSource configMapKeyRef(IoK8sKubernetesPkgApiV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Selects a key of a ConfigMap.
   * @return configMapKeyRef
  **/
  @ApiModelProperty(value = "Selects a key of a ConfigMap.")
  public IoK8sKubernetesPkgApiV1ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  public void setConfigMapKeyRef(IoK8sKubernetesPkgApiV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  public IoK8sKubernetesPkgApiV1EnvVarSource fieldRef(IoK8sKubernetesPkgApiV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
   * @return fieldRef
  **/
  @ApiModelProperty(value = "Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.")
  public IoK8sKubernetesPkgApiV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(IoK8sKubernetesPkgApiV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public IoK8sKubernetesPkgApiV1EnvVarSource resourceFieldRef(IoK8sKubernetesPkgApiV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
   * @return resourceFieldRef
  **/
  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
  public IoK8sKubernetesPkgApiV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(IoK8sKubernetesPkgApiV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  public IoK8sKubernetesPkgApiV1EnvVarSource secretKeyRef(IoK8sKubernetesPkgApiV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Selects a key of a secret in the pod&#39;s namespace
   * @return secretKeyRef
  **/
  @ApiModelProperty(value = "Selects a key of a secret in the pod's namespace")
  public IoK8sKubernetesPkgApiV1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(IoK8sKubernetesPkgApiV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1EnvVarSource ioK8sKubernetesPkgApiV1EnvVarSource = (IoK8sKubernetesPkgApiV1EnvVarSource) o;
    return Objects.equals(this.configMapKeyRef, ioK8sKubernetesPkgApiV1EnvVarSource.configMapKeyRef) &&
        Objects.equals(this.fieldRef, ioK8sKubernetesPkgApiV1EnvVarSource.fieldRef) &&
        Objects.equals(this.resourceFieldRef, ioK8sKubernetesPkgApiV1EnvVarSource.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, ioK8sKubernetesPkgApiV1EnvVarSource.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1EnvVarSource {\n");
    
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

