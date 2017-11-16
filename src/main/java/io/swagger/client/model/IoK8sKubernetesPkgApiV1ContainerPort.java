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
 * ContainerPort represents a network port in a single container.
 */
@ApiModel(description = "ContainerPort represents a network port in a single container.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1ContainerPort {
  @SerializedName("containerPort")
  private Integer containerPort = null;

  @SerializedName("hostIP")
  private String hostIP = null;

  @SerializedName("hostPort")
  private Integer hostPort = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("protocol")
  private String protocol = null;

  public IoK8sKubernetesPkgApiV1ContainerPort containerPort(Integer containerPort) {
    this.containerPort = containerPort;
    return this;
  }

   /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
   * @return containerPort
  **/
  @ApiModelProperty(required = true, value = "Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.")
  public Integer getContainerPort() {
    return containerPort;
  }

  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }

  public IoK8sKubernetesPkgApiV1ContainerPort hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

   /**
   * What host IP to bind the external port to.
   * @return hostIP
  **/
  @ApiModelProperty(value = "What host IP to bind the external port to.")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public IoK8sKubernetesPkgApiV1ContainerPort hostPort(Integer hostPort) {
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   * @return hostPort
  **/
  @ApiModelProperty(value = "Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.")
  public Integer getHostPort() {
    return hostPort;
  }

  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }

  public IoK8sKubernetesPkgApiV1ContainerPort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   * @return name
  **/
  @ApiModelProperty(value = "If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sKubernetesPkgApiV1ContainerPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol for port. Must be UDP or TCP. Defaults to \&quot;TCP\&quot;.
   * @return protocol
  **/
  @ApiModelProperty(value = "Protocol for port. Must be UDP or TCP. Defaults to \"TCP\".")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1ContainerPort ioK8sKubernetesPkgApiV1ContainerPort = (IoK8sKubernetesPkgApiV1ContainerPort) o;
    return Objects.equals(this.containerPort, ioK8sKubernetesPkgApiV1ContainerPort.containerPort) &&
        Objects.equals(this.hostIP, ioK8sKubernetesPkgApiV1ContainerPort.hostIP) &&
        Objects.equals(this.hostPort, ioK8sKubernetesPkgApiV1ContainerPort.hostPort) &&
        Objects.equals(this.name, ioK8sKubernetesPkgApiV1ContainerPort.name) &&
        Objects.equals(this.protocol, ioK8sKubernetesPkgApiV1ContainerPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1ContainerPort {\n");
    
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

