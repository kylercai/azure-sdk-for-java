/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource limits.
 */
public class ResourceLimits {
    /**
     * The memory limit in GB of this container instance.
     */
    @JsonProperty(value = "memoryInGB")
    private Double memoryInGB;

    /**
     * The CPU limit of this container instance.
     */
    @JsonProperty(value = "cpu")
    private Double cpu;

    /**
     * Get the memory limit in GB of this container instance.
     *
     * @return the memoryInGB value
     */
    public Double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memory limit in GB of this container instance.
     *
     * @param memoryInGB the memoryInGB value to set
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the CPU limit of this container instance.
     *
     * @return the cpu value
     */
    public Double cpu() {
        return this.cpu;
    }

    /**
     * Set the CPU limit of this container instance.
     *
     * @param cpu the cpu value to set
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }

}
