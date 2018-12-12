/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RequestSource.
 */
public final class RequestSource extends ExpandableStringEnum<RequestSource> {
    /** Static value rest for RequestSource. */
    public static final RequestSource REST = fromString("rest");

    /**
     * Creates or finds a RequestSource from its string representation.
     * @param name a name to look for
     * @return the corresponding RequestSource
     */
    @JsonCreator
    public static RequestSource fromString(String name) {
        return fromString(name, RequestSource.class);
    }

    /**
     * @return known RequestSource values
     */
    public static Collection<RequestSource> values() {
        return values(RequestSource.class);
    }
}
