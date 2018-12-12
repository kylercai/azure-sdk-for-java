/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabaseState.
 */
public final class DatabaseState extends ExpandableStringEnum<DatabaseState> {
    /** Static value Online for DatabaseState. */
    public static final DatabaseState ONLINE = fromString("Online");

    /** Static value Restoring for DatabaseState. */
    public static final DatabaseState RESTORING = fromString("Restoring");

    /** Static value Recovering for DatabaseState. */
    public static final DatabaseState RECOVERING = fromString("Recovering");

    /** Static value RecoveryPending for DatabaseState. */
    public static final DatabaseState RECOVERY_PENDING = fromString("RecoveryPending");

    /** Static value Suspect for DatabaseState. */
    public static final DatabaseState SUSPECT = fromString("Suspect");

    /** Static value Emergency for DatabaseState. */
    public static final DatabaseState EMERGENCY = fromString("Emergency");

    /** Static value Offline for DatabaseState. */
    public static final DatabaseState OFFLINE = fromString("Offline");

    /** Static value Copying for DatabaseState. */
    public static final DatabaseState COPYING = fromString("Copying");

    /** Static value OfflineSecondary for DatabaseState. */
    public static final DatabaseState OFFLINE_SECONDARY = fromString("OfflineSecondary");

    /**
     * Creates or finds a DatabaseState from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabaseState
     */
    @JsonCreator
    public static DatabaseState fromString(String name) {
        return fromString(name, DatabaseState.class);
    }

    /**
     * @return known DatabaseState values
     */
    public static Collection<DatabaseState> values() {
        return values(DatabaseState.class);
    }
}
