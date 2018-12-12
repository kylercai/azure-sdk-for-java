/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing Abnormal Time Period identified in diagnosis.
 */
public class AbnormalTimePeriod {
    /**
     * Start time of the downtime.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * End time of the downtime.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * List of Possible Cause of downtime.
     */
    @JsonProperty(value = "events")
    private List<DetectorAbnormalTimePeriod> events;

    /**
     * List of proposed solutions.
     */
    @JsonProperty(value = "solutions")
    private List<Solution> solutions;

    /**
     * Get start time of the downtime.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time of the downtime.
     *
     * @param startTime the startTime value to set
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time of the downtime.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set end time of the downtime.
     *
     * @param endTime the endTime value to set
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get list of Possible Cause of downtime.
     *
     * @return the events value
     */
    public List<DetectorAbnormalTimePeriod> events() {
        return this.events;
    }

    /**
     * Set list of Possible Cause of downtime.
     *
     * @param events the events value to set
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withEvents(List<DetectorAbnormalTimePeriod> events) {
        this.events = events;
        return this;
    }

    /**
     * Get list of proposed solutions.
     *
     * @return the solutions value
     */
    public List<Solution> solutions() {
        return this.solutions;
    }

    /**
     * Set list of proposed solutions.
     *
     * @param solutions the solutions value to set
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withSolutions(List<Solution> solutions) {
        this.solutions = solutions;
        return this;
    }

}
