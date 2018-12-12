/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.LiveOutputs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.LiveOutput;

class LiveOutputsImpl extends WrapperImpl<LiveOutputsInner> implements LiveOutputs {
    private final MediaManager manager;

    LiveOutputsImpl(MediaManager manager) {
        super(manager.inner().liveOutputs());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public LiveOutputImpl define(String name) {
        return wrapModel(name);
    }

    private LiveOutputImpl wrapModel(LiveOutputInner inner) {
        return  new LiveOutputImpl(inner, manager());
    }

    private LiveOutputImpl wrapModel(String name) {
        return new LiveOutputImpl(name, this.manager());
    }

    @Override
    public Observable<LiveOutput> listAsync(final String resourceGroupName, final String accountName, final String liveEventName) {
        LiveOutputsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, liveEventName)
        .flatMapIterable(new Func1<Page<LiveOutputInner>, Iterable<LiveOutputInner>>() {
            @Override
            public Iterable<LiveOutputInner> call(Page<LiveOutputInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LiveOutputInner, LiveOutput>() {
            @Override
            public LiveOutput call(LiveOutputInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<LiveOutput> getAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName) {
        LiveOutputsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, liveEventName, liveOutputName)
        .map(new Func1<LiveOutputInner, LiveOutput>() {
            @Override
            public LiveOutput call(LiveOutputInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName) {
        LiveOutputsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, liveEventName, liveOutputName).toCompletable();
    }

}
