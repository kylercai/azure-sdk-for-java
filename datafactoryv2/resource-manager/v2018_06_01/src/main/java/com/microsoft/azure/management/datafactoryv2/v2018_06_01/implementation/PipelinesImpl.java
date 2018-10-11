/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.Pipelines;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.CreateRunResponse;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineResource;

class PipelinesImpl extends WrapperImpl<PipelinesInner> implements Pipelines {
    private final DataFactoryManager manager;

    PipelinesImpl(DataFactoryManager manager) {
        super(manager.inner().pipelines());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public PipelineResourceImpl define(String name) {
        return wrapModel(name);
    }

    private PipelineResourceImpl wrapModel(PipelineResourceInner inner) {
        return  new PipelineResourceImpl(inner, manager());
    }

    private PipelineResourceImpl wrapModel(String name) {
        return new PipelineResourceImpl(name, this.manager());
    }

    @Override
    public Observable<CreateRunResponse> createRunAsync(String resourceGroupName, String factoryName, String pipelineName) {
        PipelinesInner client = this.inner();
        return client.createRunAsync(resourceGroupName, factoryName, pipelineName)
        .map(new Func1<CreateRunResponseInner, CreateRunResponse>() {
            @Override
            public CreateRunResponse call(CreateRunResponseInner inner) {
                return new CreateRunResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PipelineResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        PipelinesInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<PipelineResourceInner>, Iterable<PipelineResourceInner>>() {
            @Override
            public Iterable<PipelineResourceInner> call(Page<PipelineResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PipelineResourceInner, PipelineResource>() {
            @Override
            public PipelineResource call(PipelineResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PipelineResource> getAsync(String resourceGroupName, String factoryName, String pipelineName) {
        PipelinesInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, pipelineName)
        .map(new Func1<PipelineResourceInner, PipelineResource>() {
            @Override
            public PipelineResource call(PipelineResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName, String pipelineName) {
        PipelinesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName, pipelineName).toCompletable();
    }

}
