package com.github.patrickianwilson.thirdparty.kubernetes.model;

import io.swagger.annotations.ApiModel;

import java.util.Objects;

/**
 * Created by pwilson on 11/17/17.
 */

@ApiModel(description = "Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T15:42:22.208Z")
public class IoK8sApimachineryPkgApisMetaV1Patch {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IoK8sApimachineryPkgApisMetaV1Patch {\n");

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

