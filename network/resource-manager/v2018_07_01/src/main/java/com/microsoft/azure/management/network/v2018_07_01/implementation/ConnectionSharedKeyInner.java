/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Response for GetConnectionSharedKey API service call.
 */
public class ConnectionSharedKeyInner extends SubResource {
    /**
     * The virtual network connection shared key value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the virtual network connection shared key value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the virtual network connection shared key value.
     *
     * @param value the value value to set
     * @return the ConnectionSharedKeyInner object itself.
     */
    public ConnectionSharedKeyInner withValue(String value) {
        this.value = value;
        return this;
    }

}
