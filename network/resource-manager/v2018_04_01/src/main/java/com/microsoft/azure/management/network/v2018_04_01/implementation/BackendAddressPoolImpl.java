/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.management.network.v2018_04_01.BackendAddressPool;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_04_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;
import java.util.List;
import com.microsoft.azure.SubResource;

class BackendAddressPoolImpl extends IndexableRefreshableWrapperImpl<BackendAddressPool, BackendAddressPoolInner> implements BackendAddressPool {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String backendAddressPoolName;

    BackendAddressPoolImpl(BackendAddressPoolInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.backendAddressPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "backendAddressPools");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BackendAddressPoolInner> getInnerAsync() {
        LoadBalancerBackendAddressPoolsInner client = this.manager().inner().loadBalancerBackendAddressPools();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.backendAddressPoolName);
    }



    @Override
    public List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> backendIPConfigurations() {
        List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> lst = new ArrayList<VirtualMachineScaleSetNetworkInterfaceIPConfiguration>();
        if (this.inner().backendIPConfigurations() != null) {
            for (NetworkInterfaceIPConfigurationInner inner : this.inner().backendIPConfigurations()) {
                lst.add( new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<SubResource> loadBalancingRules() {
        return this.inner().loadBalancingRules();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SubResource outboundNatRule() {
        return this.inner().outboundNatRule();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

}
