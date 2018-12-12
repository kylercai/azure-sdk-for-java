/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.CheckNameAvailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A response indicating whether the specified name for a resource is
 * available.
 */
public class CheckNameAvailabilityResponseInner {
    /**
     * True if the name is available, otherwise false.
     */
    @JsonProperty(value = "available", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean available;

    /**
     * A message explaining why the name is unavailable. Will be null if the
     * name is available.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The name whose availability was checked.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The reason code explaining why the name is unavailable. Will be null if
     * the name is available. Possible values include: 'Invalid',
     * 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private CheckNameAvailabilityReason reason;

    /**
     * Get true if the name is available, otherwise false.
     *
     * @return the available value
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Get a message explaining why the name is unavailable. Will be null if the name is available.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the name whose availability was checked.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the reason code explaining why the name is unavailable. Will be null if the name is available. Possible values include: 'Invalid', 'AlreadyExists'.
     *
     * @return the reason value
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

}
