/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ImportExportResponse;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.ImportExtensionRequest;
import java.util.UUID;
import com.microsoft.azure.management.sql.v2014_04_01.AuthenticationType;
import com.microsoft.azure.management.sql.v2014_04_01.StorageKeyType;
import rx.functions.Func1;

class ImportExportResponseImpl extends CreatableUpdatableImpl<ImportExportResponse, ImportExportResponseInner, ImportExportResponseImpl> implements ImportExportResponse, ImportExportResponse.Definition, ImportExportResponse.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private ImportExtensionRequest createOrUpdateParameter;

    ImportExportResponseImpl(String name, SqlManager manager) {
        super(name, new ImportExportResponseInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.createOrUpdateParameter = new ImportExtensionRequest();
    }

    ImportExportResponseImpl(ImportExportResponseInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
        this.createOrUpdateParameter = new ImportExtensionRequest();
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ImportExportResponse> createResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createImportOperationAsync(this.resourceGroupName, this.serverName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<ImportExportResponseInner, ImportExportResponseInner>() {
               @Override
               public ImportExportResponseInner call(ImportExportResponseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ImportExportResponse> updateResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createImportOperationAsync(this.resourceGroupName, this.serverName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<ImportExportResponseInner, ImportExportResponseInner>() {
               @Override
               public ImportExportResponseInner call(ImportExportResponseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ImportExportResponseInner> getInnerAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new ImportExtensionRequest();
    }

    @Override
    public String blobUri() {
        return this.inner().blobUri();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String queuedTime() {
        return this.inner().queuedTime();
    }

    @Override
    public UUID requestId() {
        return this.inner().requestId();
    }

    @Override
    public String requestType() {
        return this.inner().requestType();
    }

    @Override
    public String serverName() {
        return this.inner().serverName();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ImportExportResponseImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public ImportExportResponseImpl withAdministratorLogin(String administratorLogin) {
        this.createOrUpdateParameter.withAdministratorLogin(administratorLogin);
        return this;
    }

    @Override
    public ImportExportResponseImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        this.createOrUpdateParameter.withAdministratorLoginPassword(administratorLoginPassword);
        return this;
    }

    @Override
    public ImportExportResponseImpl withOperationMode(String operationMode) {
        this.createOrUpdateParameter.withOperationMode(operationMode);
        return this;
    }

    @Override
    public ImportExportResponseImpl withStorageKey(String storageKey) {
        this.createOrUpdateParameter.withStorageKey(storageKey);
        return this;
    }

    @Override
    public ImportExportResponseImpl withStorageKeyType(StorageKeyType storageKeyType) {
        this.createOrUpdateParameter.withStorageKeyType(storageKeyType);
        return this;
    }

    @Override
    public ImportExportResponseImpl withStorageUri(String storageUri) {
        this.createOrUpdateParameter.withStorageUri(storageUri);
        return this;
    }

    @Override
    public ImportExportResponseImpl withAuthenticationType(AuthenticationType authenticationType) {
        this.createOrUpdateParameter.withAuthenticationType(authenticationType);
        return this;
    }

    @Override
    public ImportExportResponseImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

    @Override
    public ImportExportResponseImpl withType(String type) {
        this.createOrUpdateParameter.withType(type);
        return this;
    }

}
