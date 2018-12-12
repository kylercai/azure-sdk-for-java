/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Response for Import/Export Get operation.
 */
@JsonFlatten
public class ImportExportResponseInner extends ProxyResource {
    /**
     * The request type of the operation.
     */
    @JsonProperty(value = "properties.requestType", access = JsonProperty.Access.WRITE_ONLY)
    private String requestType;

    /**
     * The request type of the operation.
     */
    @JsonProperty(value = "properties.requestId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID requestId;

    /**
     * The name of the server.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /**
     * The name of the database.
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * The status message returned from the server.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The operation status last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedTime;

    /**
     * The operation queued time.
     */
    @JsonProperty(value = "properties.queuedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String queuedTime;

    /**
     * The blob uri.
     */
    @JsonProperty(value = "properties.blobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String blobUri;

    /**
     * The error message returned from the server.
     */
    @JsonProperty(value = "properties.errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Get the request type of the operation.
     *
     * @return the requestType value
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Get the request type of the operation.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Get the name of the server.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the status message returned from the server.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the operation status last modified time.
     *
     * @return the lastModifiedTime value
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the operation queued time.
     *
     * @return the queuedTime value
     */
    public String queuedTime() {
        return this.queuedTime;
    }

    /**
     * Get the blob uri.
     *
     * @return the blobUri value
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Get the error message returned from the server.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

}
