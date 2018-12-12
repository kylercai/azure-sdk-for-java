/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container group network profile information.
 */
public class ContainerGroupNetworkProfile {
    /**
     * The identifier for a network profile.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the identifier for a network profile.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the identifier for a network profile.
     *
     * @param id the id value to set
     * @return the ContainerGroupNetworkProfile object itself.
     */
    public ContainerGroupNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

}
