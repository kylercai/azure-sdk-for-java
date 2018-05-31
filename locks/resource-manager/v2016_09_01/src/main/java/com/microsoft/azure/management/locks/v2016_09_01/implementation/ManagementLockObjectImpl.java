/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.locks.v2016_09_01.implementation;

import com.microsoft.azure.management.locks.v2016_09_01.ManagementLockObject;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.locks.v2016_09_01.LockLevel;
import java.util.List;
import com.microsoft.azure.management.locks.v2016_09_01.ManagementLockOwner;

class ManagementLockObjectImpl extends CreatableUpdatableImpl<ManagementLockObject, ManagementLockObjectInner, ManagementLockObjectImpl> implements ManagementLockObject, ManagementLockObject.Definition, ManagementLockObject.Update {
    private String resourceGroupName;
    private String lockName;
    private final AuthorizationManager manager;

    ManagementLockObjectImpl(String name, AuthorizationManager manager) {
        super(name, new ManagementLockObjectInner());
        this.manager = manager;
        // Set resource name
        this.lockName = name;
        //
    }

    ManagementLockObjectImpl(ManagementLockObjectInner inner, AuthorizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.lockName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.lockName = IdParsingUtils.getValueFromIdByName(inner.id(), "locks");
        //
    }

    @Override
    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementLockObject> createResourceAsync() {
        ManagementLocksInner client = this.manager().inner().managementLocks();
        return client.createOrUpdateAtResourceGroupLevelAsync(this.resourceGroupName, this.lockName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagementLockObject> updateResourceAsync() {
        ManagementLocksInner client = this.manager().inner().managementLocks();
        return client.createOrUpdateAtResourceGroupLevelAsync(this.resourceGroupName, this.lockName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagementLockObjectInner> getInnerAsync() {
        ManagementLocksInner client = this.manager().inner().managementLocks();
        return client.getByResourceGroupAsync(this.resourceGroupName, this.lockName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public LockLevel level() {
        return this.inner().level();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String notes() {
        return this.inner().notes();
    }

    @Override
    public List<ManagementLockOwner> owners() {
        return this.inner().owners();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagementLockObjectImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ManagementLockObjectImpl withLevel(LockLevel level) {
        this.inner().withLevel(level);
        return this;
    }

    @Override
    public ManagementLockObjectImpl withNotes(String notes) {
        this.inner().withNotes(notes);
        return this;
    }

    @Override
    public ManagementLockObjectImpl withOwners(List<ManagementLockOwner> owners) {
        this.inner().withOwners(owners);
        return this;
    }

}
