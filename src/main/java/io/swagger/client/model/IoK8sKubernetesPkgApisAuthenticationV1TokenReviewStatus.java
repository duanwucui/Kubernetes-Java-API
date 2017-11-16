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
import io.swagger.client.model.IoK8sKubernetesPkgApisAuthenticationV1UserInfo;
import java.io.IOException;

/**
 * TokenReviewStatus is the result of the token authentication request.
 */
@ApiModel(description = "TokenReviewStatus is the result of the token authentication request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus {
  @SerializedName("authenticated")
  private Boolean authenticated = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("user")
  private IoK8sKubernetesPkgApisAuthenticationV1UserInfo user = null;

  public IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

   /**
   * Authenticated indicates that the token was associated with a known user.
   * @return authenticated
  **/
  @ApiModelProperty(value = "Authenticated indicates that the token was associated with a known user.")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error indicates that the token couldn&#39;t be checked
   * @return error
  **/
  @ApiModelProperty(value = "Error indicates that the token couldn't be checked")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus user(IoK8sKubernetesPkgApisAuthenticationV1UserInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User is the UserInfo associated with the provided token.
   * @return user
  **/
  @ApiModelProperty(value = "User is the UserInfo associated with the provided token.")
  public IoK8sKubernetesPkgApisAuthenticationV1UserInfo getUser() {
    return user;
  }

  public void setUser(IoK8sKubernetesPkgApisAuthenticationV1UserInfo user) {
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
    IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus ioK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus = (IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus) o;
    return Objects.equals(this.authenticated, ioK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus.authenticated) &&
        Objects.equals(this.error, ioK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus.error) &&
        Objects.equals(this.user, ioK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticated, error, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubernetesPkgApisAuthenticationV1TokenReviewStatus {\n");
    
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

