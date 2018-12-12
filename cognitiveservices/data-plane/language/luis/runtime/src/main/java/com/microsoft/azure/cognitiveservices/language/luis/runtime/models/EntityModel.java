/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An entity extracted from the utterance.
 */
public class EntityModel {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Name of the entity, as defined in LUIS.
     */
    @JsonProperty(value = "entity", required = true)
    private String entity;

    /**
     * Type of the entity, as defined in LUIS.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The position of the first character of the matched entity within the
     * utterance.
     */
    @JsonProperty(value = "startIndex", required = true)
    private int startIndex;

    /**
     * The position of the last character of the matched entity within the
     * utterance.
     */
    @JsonProperty(value = "endIndex", required = true)
    private int endIndex;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the EntityModel object itself.
     */
    public EntityModel withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the entity value.
     *
     * @return the entity value
     */
    public String entity() {
        return this.entity;
    }

    /**
     * Set the entity value.
     *
     * @param entity the entity value to set
     * @return the EntityModel object itself.
     */
    public EntityModel withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the EntityModel object itself.
     */
    public EntityModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the startIndex value.
     *
     * @return the startIndex value
     */
    public int startIndex() {
        return this.startIndex;
    }

    /**
     * Set the startIndex value.
     *
     * @param startIndex the startIndex value to set
     * @return the EntityModel object itself.
     */
    public EntityModel withStartIndex(int startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Get the endIndex value.
     *
     * @return the endIndex value
     */
    public int endIndex() {
        return this.endIndex;
    }

    /**
     * Set the endIndex value.
     *
     * @param endIndex the endIndex value to set
     * @return the EntityModel object itself.
     */
    public EntityModel withEndIndex(int endIndex) {
        this.endIndex = endIndex;
        return this;
    }

}
