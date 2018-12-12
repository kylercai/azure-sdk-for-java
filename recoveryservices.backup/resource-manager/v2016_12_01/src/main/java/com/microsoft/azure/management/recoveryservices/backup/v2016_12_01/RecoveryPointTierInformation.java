/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery point tier information.
 */
public class RecoveryPointTierInformation {
    /**
     * Recovery point tier type. Possible values include: 'Invalid',
     * 'InstantRP', 'HardenedRP'.
     */
    @JsonProperty(value = "type")
    private RecoveryPointTierType type;

    /**
     * Recovery point tier status. Possible values include: 'Invalid', 'Valid',
     * 'Disabled', 'Deleted'.
     */
    @JsonProperty(value = "status")
    private RecoveryPointTierStatus status;

    /**
     * Get recovery point tier type. Possible values include: 'Invalid', 'InstantRP', 'HardenedRP'.
     *
     * @return the type value
     */
    public RecoveryPointTierType type() {
        return this.type;
    }

    /**
     * Set recovery point tier type. Possible values include: 'Invalid', 'InstantRP', 'HardenedRP'.
     *
     * @param type the type value to set
     * @return the RecoveryPointTierInformation object itself.
     */
    public RecoveryPointTierInformation withType(RecoveryPointTierType type) {
        this.type = type;
        return this;
    }

    /**
     * Get recovery point tier status. Possible values include: 'Invalid', 'Valid', 'Disabled', 'Deleted'.
     *
     * @return the status value
     */
    public RecoveryPointTierStatus status() {
        return this.status;
    }

    /**
     * Set recovery point tier status. Possible values include: 'Invalid', 'Valid', 'Disabled', 'Deleted'.
     *
     * @param status the status value to set
     * @return the RecoveryPointTierInformation object itself.
     */
    public RecoveryPointTierInformation withStatus(RecoveryPointTierStatus status) {
        this.status = status;
        return this;
    }

}
