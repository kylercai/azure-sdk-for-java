/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupStatus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupStatusResponse;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupStatusRequest;

class BackupStatusImpl extends WrapperImpl<BackupStatusInner> implements BackupStatus {
    private final RecoveryServicesManager manager;

    BackupStatusImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupStatus());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupStatusResponse> getAsync(String azureRegion, BackupStatusRequest parameters) {
        BackupStatusInner client = this.inner();
        return client.getAsync(azureRegion, parameters)
        .map(new Func1<BackupStatusResponseInner, BackupStatusResponse>() {
            @Override
            public BackupStatusResponse call(BackupStatusResponseInner inner) {
                return new BackupStatusResponseImpl(inner, manager());
            }
        });
    }

}
