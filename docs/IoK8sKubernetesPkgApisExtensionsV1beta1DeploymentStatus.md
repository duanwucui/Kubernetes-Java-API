
# IoK8sKubernetesPkgApisExtensionsV1beta1DeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | Total number of available pods (ready for at least minReadySeconds) targeted by this deployment. |  [optional]
**collisionCount** | **Long** | Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet. |  [optional]
**conditions** | [**List&lt;IoK8sKubernetesPkgApisExtensionsV1beta1DeploymentCondition&gt;**](IoK8sKubernetesPkgApisExtensionsV1beta1DeploymentCondition.md) | Represents the latest available observations of a deployment&#39;s current state. |  [optional]
**observedGeneration** | **Long** | The generation observed by the deployment controller. |  [optional]
**readyReplicas** | **Integer** | Total number of ready pods targeted by this deployment. |  [optional]
**replicas** | **Integer** | Total number of non-terminated pods targeted by this deployment (their labels match the selector). |  [optional]
**unavailableReplicas** | **Integer** | Total number of unavailable pods targeted by this deployment. |  [optional]
**updatedReplicas** | **Integer** | Total number of non-terminated pods targeted by this deployment that have the desired template spec. |  [optional]



