/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.CheckResourceNameAvailabilitys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.ResourceNameAvailabilityResponseResource;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.ResourceNameAvailabilityInput;

class CheckResourceNameAvailabilitysImpl extends WrapperImpl<CheckResourceNameAvailabilitysInner> implements CheckResourceNameAvailabilitys {
    private final RecoveryServicesManager manager;

    CheckResourceNameAvailabilitysImpl(RecoveryServicesManager manager) {
        super(manager.inner().checkResourceNameAvailabilitys());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceNameAvailabilityResponseResource> postAsync(String location, ResourceNameAvailabilityInput input) {
        CheckResourceNameAvailabilitysInner client = this.inner();
        return client.postAsync(location, input)
        .map(new Func1<ResourceNameAvailabilityResponseResourceInner, ResourceNameAvailabilityResponseResource>() {
            @Override
            public ResourceNameAvailabilityResponseResource call(ResourceNameAvailabilityResponseResourceInner inner) {
                return new ResourceNameAvailabilityResponseResourceImpl(inner, manager());
            }
        });
    }

}
