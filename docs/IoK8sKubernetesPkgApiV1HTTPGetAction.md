
# IoK8sKubernetesPkgApiV1HTTPGetAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead. |  [optional]
**httpHeaders** | [**List&lt;IoK8sKubernetesPkgApiV1HTTPHeader&gt;**](IoK8sKubernetesPkgApiV1HTTPHeader.md) | Custom headers to set in the request. HTTP allows repeated headers. |  [optional]
**path** | **String** | Path to access on the HTTP server. |  [optional]
**exposedPort** | **String** | Name or number of the exposedPort to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. | 
**scheme** | **String** | Scheme to use for connecting to the host. Defaults to HTTP. |  [optional]



