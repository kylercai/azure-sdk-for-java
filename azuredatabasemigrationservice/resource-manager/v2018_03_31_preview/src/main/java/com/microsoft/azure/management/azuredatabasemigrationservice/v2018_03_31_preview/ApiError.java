/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error information.
 */
public class ApiError {
    /**
     * Error information in OData format.
     */
    @JsonProperty(value = "error")
    private ODataError error;

    /**
     * Get error information in OData format.
     *
     * @return the error value
     */
    public ODataError error() {
        return this.error;
    }

    /**
     * Set error information in OData format.
     *
     * @param error the error value to set
     * @return the ApiError object itself.
     */
    public ApiError withError(ODataError error) {
        this.error = error;
        return this;
    }

}
