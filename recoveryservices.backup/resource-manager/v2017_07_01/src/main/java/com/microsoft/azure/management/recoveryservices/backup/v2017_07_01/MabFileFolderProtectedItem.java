/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.ProtectedItemInner;

/**
 * MAB workload-specific backup item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("MabFileFolderProtectedItem")
public class MabFileFolderProtectedItem extends ProtectedItemInner {
    /**
     * Friendly name of this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Name of the computer associated with this backup item.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /**
     * Status of last backup operation.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /**
     * Protected, ProtectionStopped, IRPending or ProtectionError.
     */
    @JsonProperty(value = "protectionState")
    private String protectionState;

    /**
     * Specifies if the item is scheduled for deferred deletion.
     */
    @JsonProperty(value = "isScheduledForDeferredDelete")
    private Boolean isScheduledForDeferredDelete;

    /**
     * Sync time for deferred deletion.
     */
    @JsonProperty(value = "deferredDeleteSyncTimeInUTC")
    private Long deferredDeleteSyncTimeInUTC;

    /**
     * Additional information with this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private MabFileFolderProtectedItemExtendedInfo extendedInfo;

    /**
     * Get friendly name of this backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of this backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get name of the computer associated with this backup item.
     *
     * @return the computerName value
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set name of the computer associated with this backup item.
     *
     * @param computerName the computerName value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get status of last backup operation.
     *
     * @return the lastBackupStatus value
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set status of last backup operation.
     *
     * @param lastBackupStatus the lastBackupStatus value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Get protected, ProtectionStopped, IRPending or ProtectionError.
     *
     * @return the protectionState value
     */
    public String protectionState() {
        return this.protectionState;
    }

    /**
     * Set protected, ProtectionStopped, IRPending or ProtectionError.
     *
     * @param protectionState the protectionState value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withProtectionState(String protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get specifies if the item is scheduled for deferred deletion.
     *
     * @return the isScheduledForDeferredDelete value
     */
    public Boolean isScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete;
    }

    /**
     * Set specifies if the item is scheduled for deferred deletion.
     *
     * @param isScheduledForDeferredDelete the isScheduledForDeferredDelete value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        return this;
    }

    /**
     * Get sync time for deferred deletion.
     *
     * @return the deferredDeleteSyncTimeInUTC value
     */
    public Long deferredDeleteSyncTimeInUTC() {
        return this.deferredDeleteSyncTimeInUTC;
    }

    /**
     * Set sync time for deferred deletion.
     *
     * @param deferredDeleteSyncTimeInUTC the deferredDeleteSyncTimeInUTC value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withDeferredDeleteSyncTimeInUTC(Long deferredDeleteSyncTimeInUTC) {
        this.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
        return this;
    }

    /**
     * Get additional information with this backup item.
     *
     * @return the extendedInfo value
     */
    public MabFileFolderProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information with this backup item.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the MabFileFolderProtectedItem object itself.
     */
    public MabFileFolderProtectedItem withExtendedInfo(MabFileFolderProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
