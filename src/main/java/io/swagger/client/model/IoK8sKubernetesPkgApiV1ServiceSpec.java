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
import io.swagger.client.model.IoK8sKubernetesPkgApiV1ServicePort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
@ApiModel(description = "ServiceSpec describes the attributes that a user creates on a service.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1ServiceSpec {
  @SerializedName("clusterIP")
  private String clusterIP = null;

  @SerializedName("externalIPs")
  private List<String> externalIPs = null;

  @SerializedName("externalName")
  private String externalName = null;

  @SerializedName("externalTrafficPolicy")
  private String externalTrafficPolicy = null;

  @SerializedName("healthCheckNodePort")
  private Integer healthCheckNodePort = null;

  @SerializedName("loadBalancerIP")
  private String loadBalancerIP = null;

  @SerializedName("loadBalancerSourceRanges")
  private List<String> loadBalancerSourceRanges = null;

  @SerializedName("ports")
  private List<IoK8sKubernetesPkgApiV1ServicePort> ports = null;

  @SerializedName("selector")
  private Map<String, String> selector = null;

  @SerializedName("sessionAffinity")
  private String sessionAffinity = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sKubernetesPkgApiV1ServiceSpec clusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

   /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. \&quot;None\&quot; can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return clusterIP
  **/
  @ApiModelProperty(value = "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getClusterIP() {
    return clusterIP;
  }

  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec addExternalIPsItem(String externalIPsItem) {
    if (this.externalIPs == null) {
      this.externalIPs = new ArrayList<String>();
    }
    this.externalIPs.add(externalIPsItem);
    return this;
  }

   /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   * @return externalIPs
  **/
  @ApiModelProperty(value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

   /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid DNS name and requires Type to be ExternalName.
   * @return externalName
  **/
  @ApiModelProperty(value = "externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid DNS name and requires Type to be ExternalName.")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec externalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

   /**
   * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \&quot;Local\&quot; preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \&quot;Cluster\&quot; obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
   * @return externalTrafficPolicy
  **/
  @ApiModelProperty(value = "externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \"Local\" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \"Cluster\" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }

  public void setExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec healthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

   /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
   * @return healthCheckNodePort
  **/
  @ApiModelProperty(value = "healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.")
  public Integer getHealthCheckNodePort() {
    return healthCheckNodePort;
  }

  public void setHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec loadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

   /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
   * @return loadBalancerIP
  **/
  @ApiModelProperty(value = "Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }

  public void setLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new ArrayList<String>();
    }
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

   /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\&quot; More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
   * @return loadBalancerSourceRanges
  **/
  @ApiModelProperty(value = "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec ports(List<IoK8sKubernetesPkgApiV1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec addPortsItem(IoK8sKubernetesPkgApiV1ServicePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<IoK8sKubernetesPkgApiV1ServicePort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return ports
  **/
  @ApiModelProperty(value = "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public List<IoK8sKubernetesPkgApiV1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sKubernetesPkgApiV1ServicePort> ports) {
    this.ports = ports;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<String, String>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   * @return selector
  **/
  @ApiModelProperty(value = "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec sessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

   /**
   * Supports \&quot;ClientIP\&quot; and \&quot;None\&quot;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return sessionAffinity
  **/
  @ApiModelProperty(value = "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }

  public IoK8sKubernetesPkgApiV1ServiceSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ExternalName\&quot; maps to the specified externalName. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \&quot;None\&quot;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
   * @return type
  **/
  @ApiModelProperty(value = "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types")
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
    IoK8sKubernetesPkgApiV1ServiceSpec ioK8sKubernetesPkgApiV1ServiceSpec = (IoK8sKubernetesPkgApiV1ServiceSpec) o;
    return Objects.equals(this.clusterIP, ioK8sKubernetesPkgApiV1ServiceSpec.clusterIP) &&
        Objects.equals(this.externalIPs, ioK8sKubernetesPkgApiV1ServiceSpec.externalIPs) &&
        Objects.equals(this.externalName, ioK8sKubernetesPkgApiV1ServiceSpec.externalName) &&
        Objects.equals(this.externalTrafficPolicy, ioK8sKubernetesPkgApiV1ServiceSpec.externalTrafficPolicy) &&
        Objects.equals(this.healthCheckNodePort, ioK8sKubernetesPkgApiV1ServiceSpec.healthCheckNodePort) &&
        Objects.equals(this.loadBalancerIP, ioK8sKubernetesPkgApiV1ServiceSpec.loadBalancerIP) &&
        Objects.equals(this.loadBalancerSourceRanges, ioK8sKubernetesPkgApiV1ServiceSpec.loadBalancerSourceRanges) &&
        Objects.equals(this.ports, ioK8sKubernetesPkgApiV1ServiceSpec.ports) &&
        Objects.equals(this.selector, ioK8sKubernetesPkgApiV1ServiceSpec.selector) &&
        Objects.equals(this.sessionAffinity, ioK8sKubernetesPkgApiV1ServiceSpec.sessionAffinity) &&
        Objects.equals(this.type, ioK8sKubernetesPkgApiV1ServiceSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIP, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, loadBalancerIP, loadBalancerSourceRanges, ports, selector, sessionAffinity, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1ServiceSpec {\n");
    
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    externalTrafficPolicy: ").append(toIndentedString(externalTrafficPolicy)).append("\n");
    sb.append("    healthCheckNodePort: ").append(toIndentedString(healthCheckNodePort)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
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

