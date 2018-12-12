/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.iotcentral.v2018_09_01.App;
import rx.Observable;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppPatch;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppSkuInfo;
import rx.functions.Func1;

class AppImpl extends GroupableResourceCoreImpl<App, AppInner, AppImpl, IoTCentralManager> implements App, App.Definition, App.Update {
    private AppPatch updateParameter;
    AppImpl(String name, AppInner inner, IoTCentralManager manager) {
        super(name, inner, manager);
        this.updateParameter = new AppPatch();
    }

    @Override
    public Observable<App> createResourceAsync() {
        AppsInner client = this.manager().inner().apps();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<AppInner, AppInner>() {
               @Override
               public AppInner call(AppInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<App> updateResourceAsync() {
        AppsInner client = this.manager().inner().apps();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<AppInner, AppInner>() {
               @Override
               public AppInner call(AppInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppInner> getInnerAsync() {
        AppsInner client = this.manager().inner().apps();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AppPatch();
    }

    @Override
    public String applicationId() {
        return this.inner().applicationId();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public AppSkuInfo sku() {
        return this.inner().sku();
    }

    @Override
    public String subdomain() {
        return this.inner().subdomain();
    }

    @Override
    public String template() {
        return this.inner().template();
    }

    @Override
    public AppImpl withSku(AppSkuInfo sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public AppImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.inner().withDisplayName(displayName);
        } else {
            this.updateParameter.withDisplayName(displayName);
        }
        return this;
    }

    @Override
    public AppImpl withSubdomain(String subdomain) {
        if (isInCreateMode()) {
            this.inner().withSubdomain(subdomain);
        } else {
            this.updateParameter.withSubdomain(subdomain);
        }
        return this;
    }

    @Override
    public AppImpl withTemplate(String template) {
        if (isInCreateMode()) {
            this.inner().withTemplate(template);
        } else {
            this.updateParameter.withTemplate(template);
        }
        return this;
    }

}
