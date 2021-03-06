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
import com.github.patrickianwilson.thirdparty.kubernetes.model.IoK8sKubernetesPkgApiV1SELinuxOptions;
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
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 */
@ApiModel(description = "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-17T08:08:12.703-08:00")
public class IoK8sKubernetesPkgApiV1PodSecurityContext {
  @SerializedName("fsGroup")
  private Long fsGroup = null;

  @SerializedName("runAsNonRoot")
  private Boolean runAsNonRoot = null;

  @SerializedName("runAsUser")
  private Long runAsUser = null;

  @SerializedName("seLinuxOptions")
  private IoK8sKubernetesPkgApiV1SELinuxOptions seLinuxOptions = null;

  @SerializedName("supplementalGroups")
  private List<Long> supplementalGroups = null;

  public IoK8sKubernetesPkgApiV1PodSecurityContext fsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.
   * @return fsGroup
  **/
  @ApiModelProperty(value = "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  public IoK8sKubernetesPkgApiV1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

   /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
  **/
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public IoK8sKubernetesPkgApiV1PodSecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * @return runAsUser
  **/
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public IoK8sKubernetesPkgApiV1PodSecurityContext seLinuxOptions(IoK8sKubernetesPkgApiV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * @return seLinuxOptions
  **/
  @ApiModelProperty(value = "The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public IoK8sKubernetesPkgApiV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(IoK8sKubernetesPkgApiV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public IoK8sKubernetesPkgApiV1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<Long>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

   /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container.
   * @return supplementalGroups
  **/
  @ApiModelProperty(value = "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PodSecurityContext ioK8sKubernetesPkgApiV1PodSecurityContext = (IoK8sKubernetesPkgApiV1PodSecurityContext) o;
    return Objects.equals(this.fsGroup, ioK8sKubernetesPkgApiV1PodSecurityContext.fsGroup) &&
        Objects.equals(this.runAsNonRoot, ioK8sKubernetesPkgApiV1PodSecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, ioK8sKubernetesPkgApiV1PodSecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxOptions, ioK8sKubernetesPkgApiV1PodSecurityContext.seLinuxOptions) &&
        Objects.equals(this.supplementalGroups, ioK8sKubernetesPkgApiV1PodSecurityContext.supplementalGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsGroup, runAsNonRoot, runAsUser, seLinuxOptions, supplementalGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PodSecurityContext {\n");
    
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
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

