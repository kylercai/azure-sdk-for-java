/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PublicIPAddressSkuName.
 */
public final class PublicIPAddressSkuName extends ExpandableStringEnum<PublicIPAddressSkuName> {
    /** Static value Basic for PublicIPAddressSkuName. */
    public static final PublicIPAddressSkuName BASIC = fromString("Basic");

    /** Static value Standard for PublicIPAddressSkuName. */
    public static final PublicIPAddressSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a PublicIPAddressSkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding PublicIPAddressSkuName
     */
    @JsonCreator
    public static PublicIPAddressSkuName fromString(String name) {
        return fromString(name, PublicIPAddressSkuName.class);
    }

    /**
     * @return known PublicIPAddressSkuName values
     */
    public static Collection<PublicIPAddressSkuName> values() {
        return values(PublicIPAddressSkuName.class);
    }
}
