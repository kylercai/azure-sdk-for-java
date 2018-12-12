/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentSourceType.
 */
public final class ContentSourceType extends ExpandableStringEnum<ContentSourceType> {
    /** Static value embeddedContent for ContentSourceType. */
    public static final ContentSourceType EMBEDDED_CONTENT = fromString("embeddedContent");

    /** Static value uri for ContentSourceType. */
    public static final ContentSourceType URI = fromString("uri");

    /**
     * Creates or finds a ContentSourceType from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentSourceType
     */
    @JsonCreator
    public static ContentSourceType fromString(String name) {
        return fromString(name, ContentSourceType.class);
    }

    /**
     * @return known ContentSourceType values
     */
    public static Collection<ContentSourceType> values() {
        return values(ContentSourceType.class);
    }
}
