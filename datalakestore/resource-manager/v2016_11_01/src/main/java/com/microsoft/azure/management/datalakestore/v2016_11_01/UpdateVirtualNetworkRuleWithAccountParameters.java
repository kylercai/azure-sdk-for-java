/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to update a virtual network rule while updating a Data
 * Lake Store account.
 */
@JsonFlatten
public class UpdateVirtualNetworkRuleWithAccountParameters {
    /**
     * The unique name of the virtual network rule to update.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The resource identifier for the subnet.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /**
     * Get the unique name of the virtual network rule to update.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the unique name of the virtual network rule to update.
     *
     * @param name the name value to set
     * @return the UpdateVirtualNetworkRuleWithAccountParameters object itself.
     */
    public UpdateVirtualNetworkRuleWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource identifier for the subnet.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the resource identifier for the subnet.
     *
     * @param subnetId the subnetId value to set
     * @return the UpdateVirtualNetworkRuleWithAccountParameters object itself.
     */
    public UpdateVirtualNetworkRuleWithAccountParameters withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

}
