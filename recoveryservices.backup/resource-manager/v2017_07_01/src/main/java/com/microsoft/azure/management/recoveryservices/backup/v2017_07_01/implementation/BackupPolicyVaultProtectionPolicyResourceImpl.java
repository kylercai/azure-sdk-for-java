/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupPolicyVaultProtectionPolicyResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.Map;

class BackupPolicyVaultProtectionPolicyResourceImpl extends IndexableRefreshableWrapperImpl<BackupPolicyVaultProtectionPolicyResource, ProtectionPolicyResourceInner> implements BackupPolicyVaultProtectionPolicyResource {
    private final RecoveryServicesManager manager;
    private String vaultName;
    private String resourceGroupName;
    private String policyName;
    private String operationId;

    BackupPolicyVaultProtectionPolicyResourceImpl(ProtectionPolicyResourceInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.policyName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupPolicies");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operationResults");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProtectionPolicyResourceInner> getInnerAsync() {
        ProtectionPolicyOperationResultsInner client = this.manager().inner().protectionPolicyOperationResults();
        return client.getAsync(this.vaultName, this.resourceGroupName, this.policyName, this.operationId);
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
    public ProtectionPolicyInner properties() {
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
