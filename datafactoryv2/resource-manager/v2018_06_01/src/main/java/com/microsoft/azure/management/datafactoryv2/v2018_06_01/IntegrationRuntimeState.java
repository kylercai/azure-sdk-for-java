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
 * Defines values for IntegrationRuntimeState.
 */
public final class IntegrationRuntimeState extends ExpandableStringEnum<IntegrationRuntimeState> {
    /** Static value Initial for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState INITIAL = fromString("Initial");

    /** Static value Stopped for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STOPPED = fromString("Stopped");

    /** Static value Started for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STARTED = fromString("Started");

    /** Static value Starting for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STARTING = fromString("Starting");

    /** Static value Stopping for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState STOPPING = fromString("Stopping");

    /** Static value NeedRegistration for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState NEED_REGISTRATION = fromString("NeedRegistration");

    /** Static value Online for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState ONLINE = fromString("Online");

    /** Static value Limited for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState LIMITED = fromString("Limited");

    /** Static value Offline for IntegrationRuntimeState. */
    public static final IntegrationRuntimeState OFFLINE = fromString("Offline");

    /**
     * Creates or finds a IntegrationRuntimeState from its string representation.
     * @param name a name to look for
     * @return the corresponding IntegrationRuntimeState
     */
    @JsonCreator
    public static IntegrationRuntimeState fromString(String name) {
        return fromString(name, IntegrationRuntimeState.class);
    }

    /**
     * @return known IntegrationRuntimeState values
     */
    public static Collection<IntegrationRuntimeState> values() {
        return values(IntegrationRuntimeState.class);
    }
}
