
# IoK8sKubernetesPkgApiV1ISCSIVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chapAuthDiscovery** | **Boolean** | whether support iSCSI Discovery CHAP authentication |  [optional]
**chapAuthSession** | **Boolean** | whether support iSCSI Session CHAP authentication |  [optional]
**fsType** | **String** | Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi |  [optional]
**iqn** | **String** | Target iSCSI Qualified Name. | 
**iscsiInterface** | **String** | Optional: Defaults to &#39;default&#39; (tcp). iSCSI interface name that uses an iSCSI transport. |  [optional]
**lun** | **Integer** | iSCSI target lun number. | 
**portals** | **List&lt;String&gt;** | iSCSI target portal List. The portal is either an IP or ip_addr:exposedPort if the exposedPort is other than default (typically TCP ports 860 and 3260). |  [optional]
**readOnly** | **Boolean** | ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. |  [optional]
**secretRef** | [**IoK8sKubernetesPkgApiV1LocalObjectReference**](IoK8sKubernetesPkgApiV1LocalObjectReference.md) | CHAP secret for iSCSI target and initiator authentication |  [optional]
**targetPortal** | **String** | iSCSI target portal. The portal is either an IP or ip_addr:exposedPort if the exposedPort is other than default (typically TCP ports 860 and 3260). | 



