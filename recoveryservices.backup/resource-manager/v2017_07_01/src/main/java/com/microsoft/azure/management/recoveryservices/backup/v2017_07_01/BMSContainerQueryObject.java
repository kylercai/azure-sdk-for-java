/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The query filters that can be used with the list containers API.
 */
public class BMSContainerQueryObject {
    /**
     * Backup management type for this container. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType", required = true)
    private BackupManagementType backupManagementType;

    /**
     * Type of container for filter. Possible values include: 'Invalid',
     * 'Unknown', 'IaasVMContainer', 'IaasVMServiceContainer', 'DPMContainer',
     * 'AzureBackupServerContainer', 'MABContainer', 'Cluster',
     * 'AzureSqlContainer', 'Windows', 'VCenter', 'VMAppContainer',
     * 'SQLAGWorkLoadContainer', 'StorageContainer', 'GenericContainer',
     * 'SqlCluster', 'ExchangeDAG', 'SharepointFarm', 'HyperVCluster',
     * 'WindowsClient'.
     */
    @JsonProperty(value = "containerType")
    private ContainerType containerType;

    /**
     * Backup engine name.
     */
    @JsonProperty(value = "backupEngineName")
    private String backupEngineName;

    /**
     * Fabric name for filter.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * Status of registration of this container with the Recovery Services
     * Vault.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Friendly name of this container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get type of container for filter. Possible values include: 'Invalid', 'Unknown', 'IaasVMContainer', 'IaasVMServiceContainer', 'DPMContainer', 'AzureBackupServerContainer', 'MABContainer', 'Cluster', 'AzureSqlContainer', 'Windows', 'VCenter', 'VMAppContainer', 'SQLAGWorkLoadContainer', 'StorageContainer', 'GenericContainer', 'SqlCluster', 'ExchangeDAG', 'SharepointFarm', 'HyperVCluster', 'WindowsClient'.
     *
     * @return the containerType value
     */
    public ContainerType containerType() {
        return this.containerType;
    }

    /**
     * Set type of container for filter. Possible values include: 'Invalid', 'Unknown', 'IaasVMContainer', 'IaasVMServiceContainer', 'DPMContainer', 'AzureBackupServerContainer', 'MABContainer', 'Cluster', 'AzureSqlContainer', 'Windows', 'VCenter', 'VMAppContainer', 'SQLAGWorkLoadContainer', 'StorageContainer', 'GenericContainer', 'SqlCluster', 'ExchangeDAG', 'SharepointFarm', 'HyperVCluster', 'WindowsClient'.
     *
     * @param containerType the containerType value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withContainerType(ContainerType containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * Get backup engine name.
     *
     * @return the backupEngineName value
     */
    public String backupEngineName() {
        return this.backupEngineName;
    }

    /**
     * Set backup engine name.
     *
     * @param backupEngineName the backupEngineName value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withBackupEngineName(String backupEngineName) {
        this.backupEngineName = backupEngineName;
        return this;
    }

    /**
     * Get fabric name for filter.
     *
     * @return the fabricName value
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set fabric name for filter.
     *
     * @param fabricName the fabricName value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get status of registration of this container with the Recovery Services Vault.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of registration of this container with the Recovery Services Vault.
     *
     * @param status the status value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get friendly name of this container.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of this container.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
