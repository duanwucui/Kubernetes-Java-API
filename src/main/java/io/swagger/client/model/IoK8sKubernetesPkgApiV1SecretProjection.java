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
import io.swagger.client.model.IoK8sKubernetesPkgApiV1KeyToPath;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Adapts a secret into a projected volume.  The contents of the target Secret&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
 */
@ApiModel(description = "Adapts a secret into a projected volume.  The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1SecretProjection {
  @SerializedName("items")
  private List<IoK8sKubernetesPkgApiV1KeyToPath> items = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  public IoK8sKubernetesPkgApiV1SecretProjection items(List<IoK8sKubernetesPkgApiV1KeyToPath> items) {
    this.items = items;
    return this;
  }

  public IoK8sKubernetesPkgApiV1SecretProjection addItemsItem(IoK8sKubernetesPkgApiV1KeyToPath itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<IoK8sKubernetesPkgApiV1KeyToPath>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  public List<IoK8sKubernetesPkgApiV1KeyToPath> getItems() {
    return items;
  }

  public void setItems(List<IoK8sKubernetesPkgApiV1KeyToPath> items) {
    this.items = items;
  }

  public IoK8sKubernetesPkgApiV1SecretProjection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sKubernetesPkgApiV1SecretProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the Secret or its key must be defined
   * @return optional
  **/
  @ApiModelProperty(value = "Specify whether the Secret or its key must be defined")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1SecretProjection ioK8sKubernetesPkgApiV1SecretProjection = (IoK8sKubernetesPkgApiV1SecretProjection) o;
    return Objects.equals(this.items, ioK8sKubernetesPkgApiV1SecretProjection.items) &&
        Objects.equals(this.name, ioK8sKubernetesPkgApiV1SecretProjection.name) &&
        Objects.equals(this.optional, ioK8sKubernetesPkgApiV1SecretProjection.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1SecretProjection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

