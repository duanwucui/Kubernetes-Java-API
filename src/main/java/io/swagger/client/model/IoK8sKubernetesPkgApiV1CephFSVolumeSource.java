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
import io.swagger.client.model.IoK8sKubernetesPkgApiV1LocalObjectReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1CephFSVolumeSource {
  @SerializedName("monitors")
  private List<String> monitors = new ArrayList<String>();

  @SerializedName("path")
  private String path = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretFile")
  private String secretFile = null;

  @SerializedName("secretRef")
  private IoK8sKubernetesPkgApiV1LocalObjectReference secretRef = null;

  @SerializedName("user")
  private String user = null;

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   * @return monitors
  **/
  @ApiModelProperty(required = true, value = "Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   * @return path
  **/
  @ApiModelProperty(value = "Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   * @return readOnly
  **/
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource secretFile(String secretFile) {
    this.secretFile = secretFile;
    return this;
  }

   /**
   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   * @return secretFile
  **/
  @ApiModelProperty(value = "Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  public String getSecretFile() {
    return secretFile;
  }

  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource secretRef(IoK8sKubernetesPkgApiV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   * @return secretRef
  **/
  @ApiModelProperty(value = "Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  public IoK8sKubernetesPkgApiV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sKubernetesPkgApiV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sKubernetesPkgApiV1CephFSVolumeSource user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   * @return user
  **/
  @ApiModelProperty(value = "Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1CephFSVolumeSource ioK8sKubernetesPkgApiV1CephFSVolumeSource = (IoK8sKubernetesPkgApiV1CephFSVolumeSource) o;
    return Objects.equals(this.monitors, ioK8sKubernetesPkgApiV1CephFSVolumeSource.monitors) &&
        Objects.equals(this.path, ioK8sKubernetesPkgApiV1CephFSVolumeSource.path) &&
        Objects.equals(this.readOnly, ioK8sKubernetesPkgApiV1CephFSVolumeSource.readOnly) &&
        Objects.equals(this.secretFile, ioK8sKubernetesPkgApiV1CephFSVolumeSource.secretFile) &&
        Objects.equals(this.secretRef, ioK8sKubernetesPkgApiV1CephFSVolumeSource.secretRef) &&
        Objects.equals(this.user, ioK8sKubernetesPkgApiV1CephFSVolumeSource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1CephFSVolumeSource {\n");
    
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

