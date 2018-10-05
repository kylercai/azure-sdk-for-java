/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation.
 */
public class ProviderOperation {
    /**
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The operation display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The operation origin.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the operation name.
     *
     * @param name the name value to set
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operation display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the operation display name.
     *
     * @param displayName the displayName value to set
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the operation description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the operation description.
     *
     * @param description the description value to set
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the operation origin.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the operation origin.
     *
     * @param origin the origin value to set
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the operation properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the operation properties.
     *
     * @param properties the properties value to set
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
