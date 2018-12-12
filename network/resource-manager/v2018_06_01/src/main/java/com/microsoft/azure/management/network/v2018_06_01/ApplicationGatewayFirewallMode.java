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
 * Defines values for ApplicationGatewayFirewallMode.
 */
public final class ApplicationGatewayFirewallMode extends ExpandableStringEnum<ApplicationGatewayFirewallMode> {
    /** Static value Detection for ApplicationGatewayFirewallMode. */
    public static final ApplicationGatewayFirewallMode DETECTION = fromString("Detection");

    /** Static value Prevention for ApplicationGatewayFirewallMode. */
    public static final ApplicationGatewayFirewallMode PREVENTION = fromString("Prevention");

    /**
     * Creates or finds a ApplicationGatewayFirewallMode from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayFirewallMode
     */
    @JsonCreator
    public static ApplicationGatewayFirewallMode fromString(String name) {
        return fromString(name, ApplicationGatewayFirewallMode.class);
    }

    /**
     * @return known ApplicationGatewayFirewallMode values
     */
    public static Collection<ApplicationGatewayFirewallMode> values() {
        return values(ApplicationGatewayFirewallMode.class);
    }
}
