/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.WebManager;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.StampCapacityInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.AppServiceEnvironmentResourceInner;

/**
 * Type representing AppServiceEnvironmentResource.
 */
public interface AppServiceEnvironmentResource extends HasInner<AppServiceEnvironmentResourceInner>, Resource, GroupableResourceCore<WebManager, AppServiceEnvironmentResourceInner>, HasResourceGroup, Refreshable<AppServiceEnvironmentResource>, Updatable<AppServiceEnvironmentResource.Update>, HasManager<WebManager> {
    /**
     * @return the allowedMultiSizes value.
     */
    String allowedMultiSizes();

    /**
     * @return the allowedWorkerSizes value.
     */
    String allowedWorkerSizes();

    /**
     * @return the apiManagementAccountId value.
     */
    String apiManagementAccountId();

    /**
     * @return the appServiceEnvironmentResourceLocation value.
     */
    String appServiceEnvironmentResourceLocation();

    /**
     * @return the appServiceEnvironmentResourceName value.
     */
    String appServiceEnvironmentResourceName();

    /**
     * @return the clusterSettings value.
     */
    List<NameValuePair> clusterSettings();

    /**
     * @return the databaseEdition value.
     */
    String databaseEdition();

    /**
     * @return the databaseServiceObjective value.
     */
    String databaseServiceObjective();

    /**
     * @return the defaultFrontEndScaleFactor value.
     */
    Integer defaultFrontEndScaleFactor();

    /**
     * @return the dnsSuffix value.
     */
    String dnsSuffix();

    /**
     * @return the dynamicCacheEnabled value.
     */
    Boolean dynamicCacheEnabled();

    /**
     * @return the environmentCapacities value.
     */
    List<StampCapacity> environmentCapacities();

    /**
     * @return the environmentIsHealthy value.
     */
    Boolean environmentIsHealthy();

    /**
     * @return the environmentStatus value.
     */
    String environmentStatus();

    /**
     * @return the frontEndScaleFactor value.
     */
    Integer frontEndScaleFactor();

    /**
     * @return the internalLoadBalancingMode value.
     */
    InternalLoadBalancingMode internalLoadBalancingMode();

    /**
     * @return the ipsslAddressCount value.
     */
    Integer ipsslAddressCount();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastAction value.
     */
    String lastAction();

    /**
     * @return the lastActionResult value.
     */
    String lastActionResult();

    /**
     * @return the maximumNumberOfMachines value.
     */
    Integer maximumNumberOfMachines();

    /**
     * @return the multiRoleCount value.
     */
    Integer multiRoleCount();

    /**
     * @return the multiSize value.
     */
    String multiSize();

    /**
     * @return the networkAccessControlList value.
     */
    List<NetworkAccessControlEntry> networkAccessControlList();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the status value.
     */
    HostingEnvironmentStatus status();

    /**
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * @return the suspended value.
     */
    Boolean suspended();

    /**
     * @return the upgradeDomains value.
     */
    Integer upgradeDomains();

    /**
     * @return the userWhitelistedIpRanges value.
     */
    List<String> userWhitelistedIpRanges();

    /**
     * @return the vipMappings value.
     */
    List<VirtualIPMapping> vipMappings();

    /**
     * @return the virtualNetwork value.
     */
    VirtualNetworkProfile virtualNetwork();

    /**
     * @return the vnetName value.
     */
    String vnetName();

    /**
     * @return the vnetResourceGroupName value.
     */
    String vnetResourceGroupName();

    /**
     * @return the vnetSubnetName value.
     */
    String vnetSubnetName();

    /**
     * @return the workerPools value.
     */
    List<WorkerPool> workerPools();

    /**
     * The entirety of the AppServiceEnvironmentResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithAppServiceEnvironmentResourceLocation, DefinitionStages.WithAppServiceEnvironmentResourceName, DefinitionStages.WithVirtualNetwork, DefinitionStages.WithWorkerPools, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppServiceEnvironmentResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppServiceEnvironmentResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AppServiceEnvironmentResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithAppServiceEnvironmentResourceLocation> {
        }

        /**
         * The stage of the appserviceenvironmentresource definition allowing to specify AppServiceEnvironmentResourceLocation.
         */
        interface WithAppServiceEnvironmentResourceLocation {
           /**
            * Specifies appServiceEnvironmentResourceLocation.
            */
            WithAppServiceEnvironmentResourceName withAppServiceEnvironmentResourceLocation(String appServiceEnvironmentResourceLocation);
        }

        /**
         * The stage of the appserviceenvironmentresource definition allowing to specify AppServiceEnvironmentResourceName.
         */
        interface WithAppServiceEnvironmentResourceName {
           /**
            * Specifies appServiceEnvironmentResourceName.
            */
            WithVirtualNetwork withAppServiceEnvironmentResourceName(String appServiceEnvironmentResourceName);
        }

        /**
         * The stage of the appserviceenvironmentresource definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
           /**
            * Specifies virtualNetwork.
            */
            WithWorkerPools withVirtualNetwork(VirtualNetworkProfile virtualNetwork);
        }

        /**
         * The stage of the appserviceenvironmentresource definition allowing to specify WorkerPools.
         */
        interface WithWorkerPools {
           /**
            * Specifies workerPools.
            */
            WithCreate withWorkerPools(List<WorkerPool> workerPools);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify ApiManagementAccountId.
         */
        interface WithApiManagementAccountId {
            /**
             * Specifies apiManagementAccountId.
             */
            WithCreate withApiManagementAccountId(String apiManagementAccountId);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify ClusterSettings.
         */
        interface WithClusterSettings {
            /**
             * Specifies clusterSettings.
             */
            WithCreate withClusterSettings(List<NameValuePair> clusterSettings);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify DnsSuffix.
         */
        interface WithDnsSuffix {
            /**
             * Specifies dnsSuffix.
             */
            WithCreate withDnsSuffix(String dnsSuffix);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify DynamicCacheEnabled.
         */
        interface WithDynamicCacheEnabled {
            /**
             * Specifies dynamicCacheEnabled.
             */
            WithCreate withDynamicCacheEnabled(Boolean dynamicCacheEnabled);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify FrontEndScaleFactor.
         */
        interface WithFrontEndScaleFactor {
            /**
             * Specifies frontEndScaleFactor.
             */
            WithCreate withFrontEndScaleFactor(Integer frontEndScaleFactor);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify InternalLoadBalancingMode.
         */
        interface WithInternalLoadBalancingMode {
            /**
             * Specifies internalLoadBalancingMode.
             */
            WithCreate withInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify IpsslAddressCount.
         */
        interface WithIpsslAddressCount {
            /**
             * Specifies ipsslAddressCount.
             */
            WithCreate withIpsslAddressCount(Integer ipsslAddressCount);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify MultiRoleCount.
         */
        interface WithMultiRoleCount {
            /**
             * Specifies multiRoleCount.
             */
            WithCreate withMultiRoleCount(Integer multiRoleCount);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify MultiSize.
         */
        interface WithMultiSize {
            /**
             * Specifies multiSize.
             */
            WithCreate withMultiSize(String multiSize);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify NetworkAccessControlList.
         */
        interface WithNetworkAccessControlList {
            /**
             * Specifies networkAccessControlList.
             */
            WithCreate withNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify Suspended.
         */
        interface WithSuspended {
            /**
             * Specifies suspended.
             */
            WithCreate withSuspended(Boolean suspended);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify UserWhitelistedIpRanges.
         */
        interface WithUserWhitelistedIpRanges {
            /**
             * Specifies userWhitelistedIpRanges.
             */
            WithCreate withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify VnetName.
         */
        interface WithVnetName {
            /**
             * Specifies vnetName.
             */
            WithCreate withVnetName(String vnetName);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify VnetResourceGroupName.
         */
        interface WithVnetResourceGroupName {
            /**
             * Specifies vnetResourceGroupName.
             */
            WithCreate withVnetResourceGroupName(String vnetResourceGroupName);
        }

        /**
         * The stage of the appserviceenvironmentresource update allowing to specify VnetSubnetName.
         */
        interface WithVnetSubnetName {
            /**
             * Specifies vnetSubnetName.
             */
            WithCreate withVnetSubnetName(String vnetSubnetName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppServiceEnvironmentResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithApiManagementAccountId, DefinitionStages.WithClusterSettings, DefinitionStages.WithDnsSuffix, DefinitionStages.WithDynamicCacheEnabled, DefinitionStages.WithFrontEndScaleFactor, DefinitionStages.WithInternalLoadBalancingMode, DefinitionStages.WithIpsslAddressCount, DefinitionStages.WithKind, DefinitionStages.WithMultiRoleCount, DefinitionStages.WithMultiSize, DefinitionStages.WithNetworkAccessControlList, DefinitionStages.WithSuspended, DefinitionStages.WithUserWhitelistedIpRanges, DefinitionStages.WithVnetName, DefinitionStages.WithVnetResourceGroupName, DefinitionStages.WithVnetSubnetName {
        }
    }
    /**
     * The template for a AppServiceEnvironmentResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppServiceEnvironmentResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithApiManagementAccountId, UpdateStages.WithClusterSettings, UpdateStages.WithDnsSuffix, UpdateStages.WithDynamicCacheEnabled, UpdateStages.WithFrontEndScaleFactor, UpdateStages.WithInternalLoadBalancingMode, UpdateStages.WithIpsslAddressCount, UpdateStages.WithKind, UpdateStages.WithMultiRoleCount, UpdateStages.WithMultiSize, UpdateStages.WithNetworkAccessControlList, UpdateStages.WithSuspended, UpdateStages.WithUserWhitelistedIpRanges, UpdateStages.WithVnetName, UpdateStages.WithVnetResourceGroupName, UpdateStages.WithVnetSubnetName {
    }

    /**
     * Grouping of AppServiceEnvironmentResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify ApiManagementAccountId.
         */
        interface WithApiManagementAccountId {
            /**
             * Specifies apiManagementAccountId.
             */
            Update withApiManagementAccountId(String apiManagementAccountId);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify ClusterSettings.
         */
        interface WithClusterSettings {
            /**
             * Specifies clusterSettings.
             */
            Update withClusterSettings(List<NameValuePair> clusterSettings);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify DnsSuffix.
         */
        interface WithDnsSuffix {
            /**
             * Specifies dnsSuffix.
             */
            Update withDnsSuffix(String dnsSuffix);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify DynamicCacheEnabled.
         */
        interface WithDynamicCacheEnabled {
            /**
             * Specifies dynamicCacheEnabled.
             */
            Update withDynamicCacheEnabled(Boolean dynamicCacheEnabled);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify FrontEndScaleFactor.
         */
        interface WithFrontEndScaleFactor {
            /**
             * Specifies frontEndScaleFactor.
             */
            Update withFrontEndScaleFactor(Integer frontEndScaleFactor);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify InternalLoadBalancingMode.
         */
        interface WithInternalLoadBalancingMode {
            /**
             * Specifies internalLoadBalancingMode.
             */
            Update withInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify IpsslAddressCount.
         */
        interface WithIpsslAddressCount {
            /**
             * Specifies ipsslAddressCount.
             */
            Update withIpsslAddressCount(Integer ipsslAddressCount);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify MultiRoleCount.
         */
        interface WithMultiRoleCount {
            /**
             * Specifies multiRoleCount.
             */
            Update withMultiRoleCount(Integer multiRoleCount);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify MultiSize.
         */
        interface WithMultiSize {
            /**
             * Specifies multiSize.
             */
            Update withMultiSize(String multiSize);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify NetworkAccessControlList.
         */
        interface WithNetworkAccessControlList {
            /**
             * Specifies networkAccessControlList.
             */
            Update withNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify Suspended.
         */
        interface WithSuspended {
            /**
             * Specifies suspended.
             */
            Update withSuspended(Boolean suspended);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify UserWhitelistedIpRanges.
         */
        interface WithUserWhitelistedIpRanges {
            /**
             * Specifies userWhitelistedIpRanges.
             */
            Update withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify VnetName.
         */
        interface WithVnetName {
            /**
             * Specifies vnetName.
             */
            Update withVnetName(String vnetName);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify VnetResourceGroupName.
         */
        interface WithVnetResourceGroupName {
            /**
             * Specifies vnetResourceGroupName.
             */
            Update withVnetResourceGroupName(String vnetResourceGroupName);
        }

        /**
         * The stage of the appserviceenvironmentresource {0} allowing to specify VnetSubnetName.
         */
        interface WithVnetSubnetName {
            /**
             * Specifies vnetSubnetName.
             */
            Update withVnetSubnetName(String vnetSubnetName);
        }

    }
}
