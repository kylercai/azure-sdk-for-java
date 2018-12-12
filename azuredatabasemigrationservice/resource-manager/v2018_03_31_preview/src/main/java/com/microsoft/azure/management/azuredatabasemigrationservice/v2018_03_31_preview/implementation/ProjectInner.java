/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.implementation;

import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.ProjectSourcePlatform;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.ProjectTargetPlatform;
import org.joda.time.DateTime;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.ConnectionInfo;
import java.util.List;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.DatabaseInfo;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.ProjectProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A project resource.
 */
@JsonFlatten
public class ProjectInner extends Resource {
    /**
     * Source platform for the project. Possible values include: 'SQL',
     * 'Unknown'.
     */
    @JsonProperty(value = "properties.sourcePlatform", required = true)
    private ProjectSourcePlatform sourcePlatform;

    /**
     * Target platform for the project. Possible values include: 'SQLDB',
     * 'SQLMI', 'Unknown'.
     */
    @JsonProperty(value = "properties.targetPlatform", required = true)
    private ProjectTargetPlatform targetPlatform;

    /**
     * UTC Date and time when project was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Information for connecting to source.
     */
    @JsonProperty(value = "properties.sourceConnectionInfo")
    private ConnectionInfo sourceConnectionInfo;

    /**
     * Information for connecting to target.
     */
    @JsonProperty(value = "properties.targetConnectionInfo")
    private ConnectionInfo targetConnectionInfo;

    /**
     * List of DatabaseInfo.
     */
    @JsonProperty(value = "properties.databasesInfo")
    private List<DatabaseInfo> databasesInfo;

    /**
     * The project's provisioning state. Possible values include: 'Deleting',
     * 'Succeeded'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProjectProvisioningState provisioningState;

    /**
     * Get source platform for the project. Possible values include: 'SQL', 'Unknown'.
     *
     * @return the sourcePlatform value
     */
    public ProjectSourcePlatform sourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * Set source platform for the project. Possible values include: 'SQL', 'Unknown'.
     *
     * @param sourcePlatform the sourcePlatform value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withSourcePlatform(ProjectSourcePlatform sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }

    /**
     * Get target platform for the project. Possible values include: 'SQLDB', 'SQLMI', 'Unknown'.
     *
     * @return the targetPlatform value
     */
    public ProjectTargetPlatform targetPlatform() {
        return this.targetPlatform;
    }

    /**
     * Set target platform for the project. Possible values include: 'SQLDB', 'SQLMI', 'Unknown'.
     *
     * @param targetPlatform the targetPlatform value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withTargetPlatform(ProjectTargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
        return this;
    }

    /**
     * Get uTC Date and time when project was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get information for connecting to source.
     *
     * @return the sourceConnectionInfo value
     */
    public ConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set information for connecting to source.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withSourceConnectionInfo(ConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get information for connecting to target.
     *
     * @return the targetConnectionInfo value
     */
    public ConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set information for connecting to target.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withTargetConnectionInfo(ConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get list of DatabaseInfo.
     *
     * @return the databasesInfo value
     */
    public List<DatabaseInfo> databasesInfo() {
        return this.databasesInfo;
    }

    /**
     * Set list of DatabaseInfo.
     *
     * @param databasesInfo the databasesInfo value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withDatabasesInfo(List<DatabaseInfo> databasesInfo) {
        this.databasesInfo = databasesInfo;
        return this;
    }

    /**
     * Get the project's provisioning state. Possible values include: 'Deleting', 'Succeeded'.
     *
     * @return the provisioningState value
     */
    public ProjectProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
