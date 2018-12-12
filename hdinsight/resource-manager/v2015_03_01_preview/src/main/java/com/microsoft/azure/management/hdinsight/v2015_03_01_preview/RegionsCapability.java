/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The regions capability.
 */
public class RegionsCapability {
    /**
     * The list of region capabilities.
     */
    @JsonProperty(value = "available")
    private List<String> available;

    /**
     * Get the list of region capabilities.
     *
     * @return the available value
     */
    public List<String> available() {
        return this.available;
    }

    /**
     * Set the list of region capabilities.
     *
     * @param available the available value to set
     * @return the RegionsCapability object itself.
     */
    public RegionsCapability withAvailable(List<String> available) {
        this.available = available;
        return this;
    }

}
