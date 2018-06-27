/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Iteration model to be sent over JSON.
 */
public class Iteration {
    /**
     * Gets the id of the iteration.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * Gets or sets the name of the iteration.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets a value indicating whether the iteration is the default
     * iteration for the project.
     */
    @JsonProperty(value = "isDefault")
    private boolean isDefault;

    /**
     * Gets the current iteration status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Gets the time this iteration was completed.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Gets the time this iteration was last modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * Gets the time this iteration was last modified.
     */
    @JsonProperty(value = "trainedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime trainedAt;

    /**
     * Gets the project id of the iteration.
     */
    @JsonProperty(value = "projectId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID projectId;

    /**
     * Whether the iteration can be exported to another format for download.
     */
    @JsonProperty(value = "exportable", access = JsonProperty.Access.WRITE_ONLY)
    private boolean exportable;

    /**
     * Get or sets a guid of the domain the iteration has been trained on.
     */
    @JsonProperty(value = "domainId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID domainId;

    /**
     * Get gets the id of the iteration.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get gets or sets the name of the iteration.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the iteration.
     *
     * @param name the name value to set
     * @return the Iteration object itself.
     */
    public Iteration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets a value indicating whether the iteration is the default iteration for the project.
     *
     * @return the isDefault value
     */
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set gets or sets a value indicating whether the iteration is the default iteration for the project.
     *
     * @param isDefault the isDefault value to set
     * @return the Iteration object itself.
     */
    public Iteration withIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get gets the current iteration status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get gets the time this iteration was completed.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get gets the time this iteration was last modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get gets the time this iteration was last modified.
     *
     * @return the trainedAt value
     */
    public DateTime trainedAt() {
        return this.trainedAt;
    }

    /**
     * Get gets the project id of the iteration.
     *
     * @return the projectId value
     */
    public UUID projectId() {
        return this.projectId;
    }

    /**
     * Get whether the iteration can be exported to another format for download.
     *
     * @return the exportable value
     */
    public boolean exportable() {
        return this.exportable;
    }

    /**
     * Get get or sets a guid of the domain the iteration has been trained on.
     *
     * @return the domainId value
     */
    public UUID domainId() {
        return this.domainId;
    }

}
