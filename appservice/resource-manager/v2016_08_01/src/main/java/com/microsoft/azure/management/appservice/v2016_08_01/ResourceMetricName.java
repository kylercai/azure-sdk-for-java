/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name of a metric for any resource .
 */
public class ResourceMetricName {
    /**
     * metric name value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Localized metric name value.
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /**
     * Get metric name value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get localized metric name value.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

}
