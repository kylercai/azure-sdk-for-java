/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify properties of default content key for each encryption
 * scheme.
 */
public class DefaultKey {
    /**
     * Label can be used to specify Content Key when creating Stremaing
     * Locator.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Policy used by Default Key.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * Get label can be used to specify Content Key when creating Stremaing Locator.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set label can be used to specify Content Key when creating Stremaing Locator.
     *
     * @param label the label value to set
     * @return the DefaultKey object itself.
     */
    public DefaultKey withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get policy used by Default Key.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set policy used by Default Key.
     *
     * @param policyName the policyName value to set
     * @return the DefaultKey object itself.
     */
    public DefaultKey withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

}
