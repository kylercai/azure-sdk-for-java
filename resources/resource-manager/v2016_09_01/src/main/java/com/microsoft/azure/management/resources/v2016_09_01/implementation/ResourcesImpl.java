/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2016_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2016_09_01.Resources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.resources.v2016_09_01.ResourcegroupSubscriptionGenericResource;
import com.microsoft.azure.management.resources.v2016_09_01.SubscriptionGenericResource;
import com.microsoft.azure.management.resources.v2016_09_01.ResourcesMoveInfo;

class ResourcesImpl extends WrapperImpl<ResourcesInner> implements Resources {
    private final ResourcesManager manager;

    ResourcesImpl(ResourcesManager manager) {
        super(manager.inner().resources());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private SubscriptionGenericResourceImpl wrapModel(GenericResourceInner inner) {
        return  new SubscriptionGenericResourceImpl(inner, manager());
    }

    @Override
    public Completable checkExistenceByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.checkExistenceByIdAsync(resourceId, apiVersion).toCompletable();
    }

    @Override
    public Completable deleteByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.deleteByIdAsync(resourceId, apiVersion).toCompletable();
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> createOrUpdateByIdAsync(String resourceId, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.createOrUpdateByIdAsync(resourceId, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> updateByIdAsync(String resourceId, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.updateByIdAsync(resourceId, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> getByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.getByIdAsync(resourceId, apiVersion)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

    private Observable<Page<GenericResourceInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ResourcesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<GenericResourceInner>, Observable<Page<GenericResourceInner>>>() {
            @Override
            public Observable<Page<GenericResourceInner>> call(Page<GenericResourceInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<SubscriptionGenericResource> listAsync() {
        ResourcesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<GenericResourceInner>, Observable<Page<GenericResourceInner>>>() {
            @Override
            public Observable<Page<GenericResourceInner>> call(Page<GenericResourceInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<GenericResourceInner>, Iterable<GenericResourceInner>>() {
            @Override
            public Iterable<GenericResourceInner> call(Page<GenericResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GenericResourceInner, SubscriptionGenericResource>() {
            @Override
            public SubscriptionGenericResource call(GenericResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Completable moveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters) {
        ResourcesInner client = this.inner();
        return client.moveResourcesAsync(sourceResourceGroupName, parameters).toCompletable();
    }

    @Override
    public Completable checkExistenceAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion).toCompletable();
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion).toCompletable();
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> createOrUpdateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> updateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.updateAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourcegroupSubscriptionGenericResource> getAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion)
        .map(new Func1<GenericResourceInner, ResourcegroupSubscriptionGenericResource>() {
            @Override
            public ResourcegroupSubscriptionGenericResource call(GenericResourceInner inner) {
                return new ResourcegroupSubscriptionGenericResourceImpl(inner, manager());
            }
        });
    }

}
