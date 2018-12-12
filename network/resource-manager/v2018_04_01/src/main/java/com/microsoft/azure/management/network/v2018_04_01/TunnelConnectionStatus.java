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
 * Defines values for TunnelConnectionStatus.
 */
public final class TunnelConnectionStatus extends ExpandableStringEnum<TunnelConnectionStatus> {
    /** Static value Unknown for TunnelConnectionStatus. */
    public static final TunnelConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value Connecting for TunnelConnectionStatus. */
    public static final TunnelConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Connected for TunnelConnectionStatus. */
    public static final TunnelConnectionStatus CONNECTED = fromString("Connected");

    /** Static value NotConnected for TunnelConnectionStatus. */
    public static final TunnelConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a TunnelConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TunnelConnectionStatus
     */
    @JsonCreator
    public static TunnelConnectionStatus fromString(String name) {
        return fromString(name, TunnelConnectionStatus.class);
    }

    /**
     * @return known TunnelConnectionStatus values
     */
    public static Collection<TunnelConnectionStatus> values() {
        return values(TunnelConnectionStatus.class);
    }
}
