/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the Azure File volume. Azure File shares are mounted as
 * volumes.
 */
public class AzureFileVolume {
    /**
     * The name of the Azure File share to be mounted as a volume.
     */
    @JsonProperty(value = "shareName", required = true)
    private String shareName;

    /**
     * The flag indicating whether the Azure File shared mounted as a volume is
     * read-only.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /**
     * The name of the storage account that contains the Azure File share.
     */
    @JsonProperty(value = "storageAccountName", required = true)
    private String storageAccountName;

    /**
     * The storage account access key used to access the Azure File share.
     */
    @JsonProperty(value = "storageAccountKey")
    private String storageAccountKey;

    /**
     * Get the name of the Azure File share to be mounted as a volume.
     *
     * @return the shareName value
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the name of the Azure File share to be mounted as a volume.
     *
     * @param shareName the shareName value to set
     * @return the AzureFileVolume object itself.
     */
    public AzureFileVolume withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * Get the flag indicating whether the Azure File shared mounted as a volume is read-only.
     *
     * @return the readOnly value
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the flag indicating whether the Azure File shared mounted as a volume is read-only.
     *
     * @param readOnly the readOnly value to set
     * @return the AzureFileVolume object itself.
     */
    public AzureFileVolume withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the name of the storage account that contains the Azure File share.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the name of the storage account that contains the Azure File share.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the AzureFileVolume object itself.
     */
    public AzureFileVolume withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the storage account access key used to access the Azure File share.
     *
     * @return the storageAccountKey value
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * Set the storage account access key used to access the Azure File share.
     *
     * @param storageAccountKey the storageAccountKey value to set
     * @return the AzureFileVolume object itself.
     */
    public AzureFileVolume withStorageAccountKey(String storageAccountKey) {
        this.storageAccountKey = storageAccountKey;
        return this;
    }

}
