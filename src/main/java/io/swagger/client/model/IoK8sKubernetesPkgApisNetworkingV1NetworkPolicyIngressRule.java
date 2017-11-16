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
import io.swagger.client.model.IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer;
import io.swagger.client.model.IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and from.
 */
@ApiModel(description = "NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule {
  @SerializedName("from")
  private List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer> from = null;

  @SerializedName("ports")
  private List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort> ports = null;

  public IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule from(List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer> from) {
    this.from = from;
    return this;
  }

  public IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule addFromItem(IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least on item, this rule allows traffic only if the traffic matches at least one item in the from list.
   * @return from
  **/
  @ApiModelProperty(value = "List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least on item, this rule allows traffic only if the traffic matches at least one item in the from list.")
  public List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer> getFrom() {
    return from;
  }

  public void setFrom(List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPeer> from) {
    this.from = from;
  }

  public IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule ports(List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule addPortsItem(IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @ApiModelProperty(value = "List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule ioK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule = (IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule) o;
    return Objects.equals(this.from, ioK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule.from) &&
        Objects.equals(this.ports, ioK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisNetworkingV1NetworkPolicyIngressRule {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

