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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1LoadBalancerIngress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadBalancerStatus represents the status of a load-balancer.
 */
@ApiModel(description = "LoadBalancerStatus represents the status of a load-balancer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1LoadBalancerStatus {
  @SerializedName("ingress")
  private List<IoK8sKubernetesPkgApiV1LoadBalancerIngress> ingress = null;

  public IoK8sKubernetesPkgApiV1LoadBalancerStatus ingress(List<IoK8sKubernetesPkgApiV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public IoK8sKubernetesPkgApiV1LoadBalancerStatus addIngressItem(IoK8sKubernetesPkgApiV1LoadBalancerIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<IoK8sKubernetesPkgApiV1LoadBalancerIngress>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
   * @return ingress
  **/
  @ApiModelProperty(value = "Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.")
  public List<IoK8sKubernetesPkgApiV1LoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<IoK8sKubernetesPkgApiV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1LoadBalancerStatus ioK8sKubernetesPkgApiV1LoadBalancerStatus = (IoK8sKubernetesPkgApiV1LoadBalancerStatus) o;
    return Objects.equals(this.ingress, ioK8sKubernetesPkgApiV1LoadBalancerStatus.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1LoadBalancerStatus {\n");
    
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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

