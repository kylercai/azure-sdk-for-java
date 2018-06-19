/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.DocumentDBManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.PartitionUsageInner;

/**
 * Type representing PartitionUsage.
 */
public interface PartitionUsage extends HasInner<PartitionUsageInner>, HasManager<DocumentDBManager> {
    /**
     * @return the currentValue value.
     */
    Integer currentValue();

    /**
     * @return the limit value.
     */
    Integer limit();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the partitionId value.
     */
    String partitionId();

    /**
     * @return the partitionKeyRangeId value.
     */
    String partitionKeyRangeId();

    /**
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
