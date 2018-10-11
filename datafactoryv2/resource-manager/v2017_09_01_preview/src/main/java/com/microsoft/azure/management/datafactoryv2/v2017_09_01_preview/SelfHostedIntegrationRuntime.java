/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.IntegrationRuntimeInner;

/**
 * Self-hosted integration runtime.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SelfHosted")
@JsonFlatten
public class SelfHostedIntegrationRuntime extends IntegrationRuntimeInner {
    /**
     * The linkedInfo property.
     */
    @JsonProperty(value = "typeProperties.linkedInfo")
    private LinkedIntegrationRuntimeProperties linkedInfo;

    /**
     * Get the linkedInfo value.
     *
     * @return the linkedInfo value
     */
    public LinkedIntegrationRuntimeProperties linkedInfo() {
        return this.linkedInfo;
    }

    /**
     * Set the linkedInfo value.
     *
     * @param linkedInfo the linkedInfo value to set
     * @return the SelfHostedIntegrationRuntime object itself.
     */
    public SelfHostedIntegrationRuntime withLinkedInfo(LinkedIntegrationRuntimeProperties linkedInfo) {
        this.linkedInfo = linkedInfo;
        return this;
    }

}
