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
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import io.swagger.client.model.IoK8sKubernetesPkgApisRbacV1beta1PolicyRule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
@ApiModel(description = "ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApisRbacV1beta1ClusterRole {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("rules")
  private List<IoK8sKubernetesPkgApisRbacV1beta1PolicyRule> rules = new ArrayList<IoK8sKubernetesPkgApisRbacV1beta1PolicyRule>();

  public IoK8sKubernetesPkgApisRbacV1beta1ClusterRole apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sKubernetesPkgApisRbacV1beta1ClusterRole kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sKubernetesPkgApisRbacV1beta1ClusterRole metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata.")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sKubernetesPkgApisRbacV1beta1ClusterRole rules(List<IoK8sKubernetesPkgApisRbacV1beta1PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  public IoK8sKubernetesPkgApisRbacV1beta1ClusterRole addRulesItem(IoK8sKubernetesPkgApisRbacV1beta1PolicyRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules holds all the PolicyRules for this ClusterRole
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "Rules holds all the PolicyRules for this ClusterRole")
  public List<IoK8sKubernetesPkgApisRbacV1beta1PolicyRule> getRules() {
    return rules;
  }

  public void setRules(List<IoK8sKubernetesPkgApisRbacV1beta1PolicyRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApisRbacV1beta1ClusterRole ioK8sKubernetesPkgApisRbacV1beta1ClusterRole = (IoK8sKubernetesPkgApisRbacV1beta1ClusterRole) o;
    return Objects.equals(this.apiVersion, ioK8sKubernetesPkgApisRbacV1beta1ClusterRole.apiVersion) &&
        Objects.equals(this.kind, ioK8sKubernetesPkgApisRbacV1beta1ClusterRole.kind) &&
        Objects.equals(this.metadata, ioK8sKubernetesPkgApisRbacV1beta1ClusterRole.metadata) &&
        Objects.equals(this.rules, ioK8sKubernetesPkgApisRbacV1beta1ClusterRole.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisRbacV1beta1ClusterRole {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

