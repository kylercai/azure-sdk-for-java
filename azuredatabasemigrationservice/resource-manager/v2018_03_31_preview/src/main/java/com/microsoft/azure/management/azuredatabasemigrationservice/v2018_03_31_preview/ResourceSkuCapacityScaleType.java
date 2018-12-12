/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceSkuCapacityScaleType.
 */
public final class ResourceSkuCapacityScaleType extends ExpandableStringEnum<ResourceSkuCapacityScaleType> {
    /** Static value Automatic for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType AUTOMATIC = fromString("Automatic");

    /** Static value Manual for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType MANUAL = fromString("Manual");

    /** Static value None for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType NONE = fromString("None");

    /**
     * Creates or finds a ResourceSkuCapacityScaleType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceSkuCapacityScaleType
     */
    @JsonCreator
    public static ResourceSkuCapacityScaleType fromString(String name) {
        return fromString(name, ResourceSkuCapacityScaleType.class);
    }

    /**
     * @return known ResourceSkuCapacityScaleType values
     */
    public static Collection<ResourceSkuCapacityScaleType> values() {
        return values(ResourceSkuCapacityScaleType.class);
    }
}
