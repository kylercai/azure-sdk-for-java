/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the auto scaling policy.
 */
public class AutoScalingPolicy {
    /**
     * The name of the auto scaling policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Determines when auto scaling operation will be invoked.
     */
    @JsonProperty(value = "trigger", required = true)
    private AutoScalingTrigger trigger;

    /**
     * The mechanism that is used to scale when auto scaling operation is
     * invoked.
     */
    @JsonProperty(value = "mechanism", required = true)
    private AutoScalingMechanism mechanism;

    /**
     * Get the name of the auto scaling policy.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the auto scaling policy.
     *
     * @param name the name value to set
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get determines when auto scaling operation will be invoked.
     *
     * @return the trigger value
     */
    public AutoScalingTrigger trigger() {
        return this.trigger;
    }

    /**
     * Set determines when auto scaling operation will be invoked.
     *
     * @param trigger the trigger value to set
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy withTrigger(AutoScalingTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the mechanism that is used to scale when auto scaling operation is invoked.
     *
     * @return the mechanism value
     */
    public AutoScalingMechanism mechanism() {
        return this.mechanism;
    }

    /**
     * Set the mechanism that is used to scale when auto scaling operation is invoked.
     *
     * @param mechanism the mechanism value to set
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy withMechanism(AutoScalingMechanism mechanism) {
        this.mechanism = mechanism;
        return this;
    }

}
