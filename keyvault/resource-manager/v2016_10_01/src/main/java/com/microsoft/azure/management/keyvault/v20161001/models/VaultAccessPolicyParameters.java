/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Parameters for updating the access policy in a vault.
 */
public class VaultAccessPolicyParameters extends ProxyResource {
    /**
     * The resource type of the the access policy.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Properties of the access policy.
     */
    @JsonProperty(value = "properties", required = true)
    private VaultAccessPolicyProperties properties;

    /**
     * Get the resource type of the the access policy.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get properties of the access policy.
     *
     * @return the properties value
     */
    public VaultAccessPolicyProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the access policy.
     *
     * @param properties the properties value to set
     * @return the VaultAccessPolicyParameters object itself.
     */
    public VaultAccessPolicyParameters withProperties(VaultAccessPolicyProperties properties) {
        this.properties = properties;
        return this;
    }

}
