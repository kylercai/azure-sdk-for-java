/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Severity.
 */
public final class Severity extends ExpandableStringEnum<Severity> {
    /** Static value Error for Severity. */
    public static final Severity ERROR = fromString("Error");

    /** Static value Warning for Severity. */
    public static final Severity WARNING = fromString("Warning");

    /**
     * Creates or finds a Severity from its string representation.
     * @param name a name to look for
     * @return the corresponding Severity
     */
    @JsonCreator
    public static Severity fromString(String name) {
        return fromString(name, Severity.class);
    }

    /**
     * @return known Severity values
     */
    public static Collection<Severity> values() {
        return values(Severity.class);
    }
}
