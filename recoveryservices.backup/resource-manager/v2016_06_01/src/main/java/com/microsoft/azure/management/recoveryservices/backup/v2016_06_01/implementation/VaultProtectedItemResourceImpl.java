/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.VaultProtectedItemResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class VaultProtectedItemResourceImpl extends WrapperImpl<ProtectedItemResourceInner> implements VaultProtectedItemResource {
    private final RecoveryServicesManager manager;

    VaultProtectedItemResourceImpl(ProtectedItemResourceInner inner,  RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }



    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProtectedItemInner properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
