/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment dependency information.
 */
public class BasicDependency {
    /**
     * The ID of the dependency.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The dependency resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * The dependency resource name.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the ID of the dependency.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the dependency.
     *
     * @param id the id value to set
     * @return the BasicDependency object itself.
     */
    public BasicDependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the dependency resource type.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the dependency resource type.
     *
     * @param resourceType the resourceType value to set
     * @return the BasicDependency object itself.
     */
    public BasicDependency withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the dependency resource name.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the dependency resource name.
     *
     * @param resourceName the resourceName value to set
     * @return the BasicDependency object itself.
     */
    public BasicDependency withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

}
