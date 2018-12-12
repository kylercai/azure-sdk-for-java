/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery point specific to PointInTime.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSQLPointInTimeRecoveryPoint")
public class AzureWorkloadSQLPointInTimeRecoveryPoint extends AzureWorkloadSQLRecoveryPoint {
    /**
     * List of log ranges.
     */
    @JsonProperty(value = "timeRanges")
    private List<PointInTimeRange> timeRanges;

    /**
     * Get list of log ranges.
     *
     * @return the timeRanges value
     */
    public List<PointInTimeRange> timeRanges() {
        return this.timeRanges;
    }

    /**
     * Set list of log ranges.
     *
     * @param timeRanges the timeRanges value to set
     * @return the AzureWorkloadSQLPointInTimeRecoveryPoint object itself.
     */
    public AzureWorkloadSQLPointInTimeRecoveryPoint withTimeRanges(List<PointInTimeRange> timeRanges) {
        this.timeRanges = timeRanges;
        return this;
    }

}
