/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NameCheckFailureReason.
 */
public enum NameCheckFailureReason {
    /** Enum value AlreadyExists. */
    ALREADY_EXISTS("AlreadyExists"),

    /** Enum value Invalid. */
    INVALID("Invalid");

    /** The actual serialized value for a NameCheckFailureReason instance. */
    private String value;

    NameCheckFailureReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NameCheckFailureReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NameCheckFailureReason object, or null if unable to parse.
     */
    @JsonCreator
    public static NameCheckFailureReason fromString(String value) {
        NameCheckFailureReason[] items = NameCheckFailureReason.values();
        for (NameCheckFailureReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
