/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerinstance.v2018_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.StartContainers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.ContainerExecResponse;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.ContainerExecRequest;

class StartContainersImpl extends WrapperImpl<StartContainersInner> implements StartContainers {
    private final ContainerInstanceManager manager;

    StartContainersImpl(ContainerInstanceManager manager) {
        super(manager.inner().startContainers());
        this.manager = manager;
    }

    public ContainerInstanceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ContainerExecResponse> launchExecAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest) {
        StartContainersInner client = this.inner();
        return client.launchExecAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest)
        .map(new Func1<ContainerExecResponseInner, ContainerExecResponse>() {
            @Override
            public ContainerExecResponse call(ContainerExecResponseInner inner) {
                return new ContainerExecResponseImpl(inner, manager());
            }
        });
    }

}
