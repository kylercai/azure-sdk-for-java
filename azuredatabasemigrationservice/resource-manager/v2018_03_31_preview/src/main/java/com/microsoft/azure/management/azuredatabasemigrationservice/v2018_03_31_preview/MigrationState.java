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
 * Defines values for MigrationState.
 */
public final class MigrationState extends ExpandableStringEnum<MigrationState> {
    /** Static value None for MigrationState. */
    public static final MigrationState NONE = fromString("None");

    /** Static value InProgress for MigrationState. */
    public static final MigrationState IN_PROGRESS = fromString("InProgress");

    /** Static value Failed for MigrationState. */
    public static final MigrationState FAILED = fromString("Failed");

    /** Static value Warning for MigrationState. */
    public static final MigrationState WARNING = fromString("Warning");

    /** Static value Completed for MigrationState. */
    public static final MigrationState COMPLETED = fromString("Completed");

    /** Static value Skipped for MigrationState. */
    public static final MigrationState SKIPPED = fromString("Skipped");

    /** Static value Stopped for MigrationState. */
    public static final MigrationState STOPPED = fromString("Stopped");

    /**
     * Creates or finds a MigrationState from its string representation.
     * @param name a name to look for
     * @return the corresponding MigrationState
     */
    @JsonCreator
    public static MigrationState fromString(String name) {
        return fromString(name, MigrationState.class);
    }

    /**
     * @return known MigrationState values
     */
    public static Collection<MigrationState> values() {
        return values(MigrationState.class);
    }
}
