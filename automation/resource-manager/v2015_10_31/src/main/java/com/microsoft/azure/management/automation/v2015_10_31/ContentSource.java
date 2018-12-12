/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the content source.
 */
public class ContentSource {
    /**
     * Gets or sets the hash.
     */
    @JsonProperty(value = "hash")
    private ContentHash hash;

    /**
     * Gets or sets the content source type. Possible values include:
     * 'embeddedContent', 'uri'.
     */
    @JsonProperty(value = "type")
    private ContentSourceType type;

    /**
     * Gets or sets the value of the content. This is based on the content
     * source type.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Gets or sets the version of the content.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get gets or sets the hash.
     *
     * @return the hash value
     */
    public ContentHash hash() {
        return this.hash;
    }

    /**
     * Set gets or sets the hash.
     *
     * @param hash the hash value to set
     * @return the ContentSource object itself.
     */
    public ContentSource withHash(ContentHash hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get gets or sets the content source type. Possible values include: 'embeddedContent', 'uri'.
     *
     * @return the type value
     */
    public ContentSourceType type() {
        return this.type;
    }

    /**
     * Set gets or sets the content source type. Possible values include: 'embeddedContent', 'uri'.
     *
     * @param type the type value to set
     * @return the ContentSource object itself.
     */
    public ContentSource withType(ContentSourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets or sets the value of the content. This is based on the content source type.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set gets or sets the value of the content. This is based on the content source type.
     *
     * @param value the value value to set
     * @return the ContentSource object itself.
     */
    public ContentSource withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get gets or sets the version of the content.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set gets or sets the version of the content.
     *
     * @param version the version value to set
     * @return the ContentSource object itself.
     */
    public ContentSource withVersion(String version) {
        this.version = version;
        return this;
    }

}
