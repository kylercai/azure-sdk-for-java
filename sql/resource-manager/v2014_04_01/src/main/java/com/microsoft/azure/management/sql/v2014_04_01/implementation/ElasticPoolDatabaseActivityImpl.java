/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolDatabaseActivity;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.UUID;

class ElasticPoolDatabaseActivityImpl extends WrapperImpl<ElasticPoolDatabaseActivityInner> implements ElasticPoolDatabaseActivity {
    private final SqlManager manager;
    ElasticPoolDatabaseActivityImpl(ElasticPoolDatabaseActivityInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public String currentElasticPoolName() {
        return this.inner().currentElasticPoolName();
    }

    @Override
    public String currentServiceObjective() {
        return this.inner().currentServiceObjective();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public Integer errorCode() {
        return this.inner().errorCode();
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public Integer errorSeverity() {
        return this.inner().errorSeverity();
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
    public String operation() {
        return this.inner().operation();
    }

    @Override
    public UUID operationId() {
        return this.inner().operationId();
    }

    @Override
    public Integer percentComplete() {
        return this.inner().percentComplete();
    }

    @Override
    public String requestedElasticPoolName() {
        return this.inner().requestedElasticPoolName();
    }

    @Override
    public String requestedServiceObjective() {
        return this.inner().requestedServiceObjective();
    }

    @Override
    public String serverName() {
        return this.inner().serverName();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
