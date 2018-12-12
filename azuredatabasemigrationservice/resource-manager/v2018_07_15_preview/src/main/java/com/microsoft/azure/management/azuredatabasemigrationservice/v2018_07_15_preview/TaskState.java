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
 * Defines values for TaskState.
 */
public final class TaskState extends ExpandableStringEnum<TaskState> {
    /** Static value Unknown for TaskState. */
    public static final TaskState UNKNOWN = fromString("Unknown");

    /** Static value Queued for TaskState. */
    public static final TaskState QUEUED = fromString("Queued");

    /** Static value Running for TaskState. */
    public static final TaskState RUNNING = fromString("Running");

    /** Static value Canceled for TaskState. */
    public static final TaskState CANCELED = fromString("Canceled");

    /** Static value Succeeded for TaskState. */
    public static final TaskState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for TaskState. */
    public static final TaskState FAILED = fromString("Failed");

    /** Static value FailedInputValidation for TaskState. */
    public static final TaskState FAILED_INPUT_VALIDATION = fromString("FailedInputValidation");

    /** Static value Faulted for TaskState. */
    public static final TaskState FAULTED = fromString("Faulted");

    /**
     * Creates or finds a TaskState from its string representation.
     * @param name a name to look for
     * @return the corresponding TaskState
     */
    @JsonCreator
    public static TaskState fromString(String name) {
        return fromString(name, TaskState.class);
    }

    /**
     * @return known TaskState values
     */
    public static Collection<TaskState> values() {
        return values(TaskState.class);
    }
}
