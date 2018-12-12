/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policies for vpn gateway.
 */
public class Policies {
    /**
     * True if branch to branch traffic is allowed.
     */
    @JsonProperty(value = "allowBranchToBranchTraffic")
    private Boolean allowBranchToBranchTraffic;

    /**
     * True if Vnet to Vnet traffic is allowed.
     */
    @JsonProperty(value = "allowVnetToVnetTraffic")
    private Boolean allowVnetToVnetTraffic;

    /**
     * Get true if branch to branch traffic is allowed.
     *
     * @return the allowBranchToBranchTraffic value
     */
    public Boolean allowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }

    /**
     * Set true if branch to branch traffic is allowed.
     *
     * @param allowBranchToBranchTraffic the allowBranchToBranchTraffic value to set
     * @return the Policies object itself.
     */
    public Policies withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        return this;
    }

    /**
     * Get true if Vnet to Vnet traffic is allowed.
     *
     * @return the allowVnetToVnetTraffic value
     */
    public Boolean allowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic;
    }

    /**
     * Set true if Vnet to Vnet traffic is allowed.
     *
     * @param allowVnetToVnetTraffic the allowVnetToVnetTraffic value to set
     * @return the Policies object itself.
     */
    public Policies withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic) {
        this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
        return this;
    }

}
