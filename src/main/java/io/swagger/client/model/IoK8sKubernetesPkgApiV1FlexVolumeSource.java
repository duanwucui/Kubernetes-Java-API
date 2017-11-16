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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. This is an alpha feature and may change in future.
 */
@ApiModel(description = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. This is an alpha feature and may change in future.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApiV1FlexVolumeSource {
  @SerializedName("driver")
  private String driver = null;

  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("options")
  private Map<String, String> options = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private IoK8sKubernetesPkgApiV1LocalObjectReference secretRef = null;

  public IoK8sKubernetesPkgApiV1FlexVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Driver is the name of the driver to use for this volume.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "Driver is the name of the driver to use for this volume.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public IoK8sKubernetesPkgApiV1FlexVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default filesystem depends on FlexVolume script.
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default filesystem depends on FlexVolume script.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sKubernetesPkgApiV1FlexVolumeSource options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public IoK8sKubernetesPkgApiV1FlexVolumeSource putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Optional: Extra command options if any.
   * @return options
  **/
  @ApiModelProperty(value = "Optional: Extra command options if any.")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public IoK8sKubernetesPkgApiV1FlexVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sKubernetesPkgApiV1FlexVolumeSource secretRef(IoK8sKubernetesPkgApiV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
   * @return secretRef
  **/
  @ApiModelProperty(value = "Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.")
  public IoK8sKubernetesPkgApiV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sKubernetesPkgApiV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubernetesPkgApiV1FlexVolumeSource ioK8sKubernetesPkgApiV1FlexVolumeSource = (IoK8sKubernetesPkgApiV1FlexVolumeSource) o;
    return Objects.equals(this.driver, ioK8sKubernetesPkgApiV1FlexVolumeSource.driver) &&
        Objects.equals(this.fsType, ioK8sKubernetesPkgApiV1FlexVolumeSource.fsType) &&
        Objects.equals(this.options, ioK8sKubernetesPkgApiV1FlexVolumeSource.options) &&
        Objects.equals(this.readOnly, ioK8sKubernetesPkgApiV1FlexVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, ioK8sKubernetesPkgApiV1FlexVolumeSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, fsType, options, readOnly, secretRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApiV1FlexVolumeSource {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

