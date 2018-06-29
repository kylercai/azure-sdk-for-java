/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IntegrationRuntimeUpdateResult.
 */
public final class IntegrationRuntimeUpdateResult extends ExpandableStringEnum<IntegrationRuntimeUpdateResult> {
    /** Static value Succeed for IntegrationRuntimeUpdateResult. */
    public static final IntegrationRuntimeUpdateResult SUCCEED = fromString("Succeed");

    /** Static value Fail for IntegrationRuntimeUpdateResult. */
    public static final IntegrationRuntimeUpdateResult FAIL = fromString("Fail");

    /**
     * Creates or finds a IntegrationRuntimeUpdateResult from its string representation.
     * @param name a name to look for
     * @return the corresponding IntegrationRuntimeUpdateResult
     */
    @JsonCreator
    public static IntegrationRuntimeUpdateResult fromString(String name) {
        return fromString(name, IntegrationRuntimeUpdateResult.class);
    }

    /**
     * @return known IntegrationRuntimeUpdateResult values
     */
    public static Collection<IntegrationRuntimeUpdateResult> values() {
        return values(IntegrationRuntimeUpdateResult.class);
    }
}
