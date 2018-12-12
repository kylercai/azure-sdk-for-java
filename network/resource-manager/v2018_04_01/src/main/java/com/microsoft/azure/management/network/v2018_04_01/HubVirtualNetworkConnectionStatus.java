/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HubVirtualNetworkConnectionStatus.
 */
public final class HubVirtualNetworkConnectionStatus extends ExpandableStringEnum<HubVirtualNetworkConnectionStatus> {
    /** Static value Unknown for HubVirtualNetworkConnectionStatus. */
    public static final HubVirtualNetworkConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value Connecting for HubVirtualNetworkConnectionStatus. */
    public static final HubVirtualNetworkConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Connected for HubVirtualNetworkConnectionStatus. */
    public static final HubVirtualNetworkConnectionStatus CONNECTED = fromString("Connected");

    /** Static value NotConnected for HubVirtualNetworkConnectionStatus. */
    public static final HubVirtualNetworkConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a HubVirtualNetworkConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding HubVirtualNetworkConnectionStatus
     */
    @JsonCreator
    public static HubVirtualNetworkConnectionStatus fromString(String name) {
        return fromString(name, HubVirtualNetworkConnectionStatus.class);
    }

    /**
     * @return known HubVirtualNetworkConnectionStatus values
     */
    public static Collection<HubVirtualNetworkConnectionStatus> values() {
        return values(HubVirtualNetworkConnectionStatus.class);
    }
}
