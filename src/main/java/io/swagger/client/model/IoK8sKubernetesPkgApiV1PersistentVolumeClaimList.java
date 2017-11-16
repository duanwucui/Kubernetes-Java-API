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
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1ListMeta;
import io.swagger.client.model.IoK8sKubernetesPkgApiV1PersistentVolumeClaim;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
 */
@ApiModel(description = "PersistentVolumeClaimList is a list of PersistentVolumeClaim items.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1PersistentVolumeClaimList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<IoK8sKubernetesPkgApiV1PersistentVolumeClaim> items = new ArrayList<IoK8sKubernetesPkgApiV1PersistentVolumeClaim>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimList apiVersion(String apiVersion) {
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

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimList items(List<IoK8sKubernetesPkgApiV1PersistentVolumeClaim> items) {
    this.items = items;
    return this;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimList addItemsItem(IoK8sKubernetesPkgApiV1PersistentVolumeClaim itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of persistent volume claims. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of persistent volume claims. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public List<IoK8sKubernetesPkgApiV1PersistentVolumeClaim> getItems() {
    return items;
  }

  public void setItems(List<IoK8sKubernetesPkgApiV1PersistentVolumeClaim> items) {
    this.items = items;
  }

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimList kind(String kind) {
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

  public IoK8sKubernetesPkgApiV1PersistentVolumeClaimList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1PersistentVolumeClaimList ioK8sKubernetesPkgApiV1PersistentVolumeClaimList = (IoK8sKubernetesPkgApiV1PersistentVolumeClaimList) o;
    return Objects.equals(this.apiVersion, ioK8sKubernetesPkgApiV1PersistentVolumeClaimList.apiVersion) &&
        Objects.equals(this.items, ioK8sKubernetesPkgApiV1PersistentVolumeClaimList.items) &&
        Objects.equals(this.kind, ioK8sKubernetesPkgApiV1PersistentVolumeClaimList.kind) &&
        Objects.equals(this.metadata, ioK8sKubernetesPkgApiV1PersistentVolumeClaimList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1PersistentVolumeClaimList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

