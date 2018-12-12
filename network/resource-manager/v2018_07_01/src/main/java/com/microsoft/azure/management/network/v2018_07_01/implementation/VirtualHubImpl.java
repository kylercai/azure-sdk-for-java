/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_07_01.VirtualHub;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2018_07_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_07_01.HubVirtualNetworkConnection;

class VirtualHubImpl extends GroupableResourceCoreImpl<VirtualHub, VirtualHubInner, VirtualHubImpl, NetworkManager> implements VirtualHub, VirtualHub.Definition, VirtualHub.Update {
    VirtualHubImpl(String name, VirtualHubInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualHub> createResourceAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualHub> updateResourceAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualHubInner> getInnerAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<HubVirtualNetworkConnection> hubVirtualNetworkConnections() {
        List<HubVirtualNetworkConnection> lst = new ArrayList<HubVirtualNetworkConnection>();
        if (this.inner().hubVirtualNetworkConnections() != null) {
            for (HubVirtualNetworkConnectionInner inner : this.inner().hubVirtualNetworkConnections()) {
                lst.add( new HubVirtualNetworkConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource virtualWan() {
        return this.inner().virtualWan();
    }

    @Override
    public VirtualHubImpl withAddressPrefix(String addressPrefix) {
        this.inner().withAddressPrefix(addressPrefix);
        return this;
    }

    @Override
    public VirtualHubImpl withHubVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> hubVirtualNetworkConnections) {
        this.inner().withHubVirtualNetworkConnections(hubVirtualNetworkConnections);
        return this;
    }

    @Override
    public VirtualHubImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public VirtualHubImpl withVirtualWan(SubResource virtualWan) {
        this.inner().withVirtualWan(virtualWan);
        return this;
    }

}
