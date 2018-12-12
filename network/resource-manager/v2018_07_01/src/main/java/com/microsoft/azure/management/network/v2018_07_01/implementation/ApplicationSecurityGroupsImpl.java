/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_07_01.ApplicationSecurityGroups;
import com.microsoft.azure.management.network.v2018_07_01.ApplicationSecurityGroup;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ApplicationSecurityGroupsImpl extends GroupableResourcesCoreImpl<ApplicationSecurityGroup, ApplicationSecurityGroupImpl, ApplicationSecurityGroupInner, ApplicationSecurityGroupsInner, NetworkManager>  implements ApplicationSecurityGroups {
    protected ApplicationSecurityGroupsImpl(NetworkManager manager) {
        super(manager.inner().applicationSecurityGroups(), manager);
    }

    @Override
    protected Observable<ApplicationSecurityGroupInner> getInnerAsync(String resourceGroupName, String name) {
        ApplicationSecurityGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ApplicationSecurityGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ApplicationSecurityGroup> listByResourceGroup(String resourceGroupName) {
        ApplicationSecurityGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ApplicationSecurityGroup> listByResourceGroupAsync(String resourceGroupName) {
        ApplicationSecurityGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApplicationSecurityGroupInner>, Iterable<ApplicationSecurityGroupInner>>() {
            @Override
            public Iterable<ApplicationSecurityGroupInner> call(Page<ApplicationSecurityGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationSecurityGroupInner, ApplicationSecurityGroup>() {
            @Override
            public ApplicationSecurityGroup call(ApplicationSecurityGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ApplicationSecurityGroup> list() {
        ApplicationSecurityGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ApplicationSecurityGroup> listAsync() {
        ApplicationSecurityGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApplicationSecurityGroupInner>, Iterable<ApplicationSecurityGroupInner>>() {
            @Override
            public Iterable<ApplicationSecurityGroupInner> call(Page<ApplicationSecurityGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationSecurityGroupInner, ApplicationSecurityGroup>() {
            @Override
            public ApplicationSecurityGroup call(ApplicationSecurityGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ApplicationSecurityGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ApplicationSecurityGroupImpl wrapModel(ApplicationSecurityGroupInner inner) {
        return  new ApplicationSecurityGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected ApplicationSecurityGroupImpl wrapModel(String name) {
        return new ApplicationSecurityGroupImpl(name, new ApplicationSecurityGroupInner(), this.manager());
    }

}
