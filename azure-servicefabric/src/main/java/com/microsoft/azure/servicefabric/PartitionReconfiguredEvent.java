/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.PartitionEventInner;

/**
 * Partition Reconfiguration event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("PartitionReconfigured")
public class PartitionReconfiguredEvent extends PartitionEventInner {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /**
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private String nodeInstanceId;

    /**
     * Type of Service.
     */
    @JsonProperty(value = "ServiceType", required = true)
    private String serviceType;

    /**
     * CcEpochDataLoss version.
     */
    @JsonProperty(value = "CcEpochDataLossVersion", required = true)
    private long ccEpochDataLossVersion;

    /**
     * CcEpochConfig version.
     */
    @JsonProperty(value = "CcEpochConfigVersion", required = true)
    private long ccEpochConfigVersion;

    /**
     * Type of reconfiguration.
     */
    @JsonProperty(value = "ReconfigType", required = true)
    private String reconfigType;

    /**
     * Describes reconfiguration result.
     */
    @JsonProperty(value = "Result", required = true)
    private String result;

    /**
     * Duration of Phase0 in milli-seconds.
     */
    @JsonProperty(value = "Phase0DurationMs", required = true)
    private double phase0DurationMs;

    /**
     * Duration of Phase1 in milli-seconds.
     */
    @JsonProperty(value = "Phase1DurationMs", required = true)
    private double phase1DurationMs;

    /**
     * Duration of Phase2 in milli-seconds.
     */
    @JsonProperty(value = "Phase2DurationMs", required = true)
    private double phase2DurationMs;

    /**
     * Duration of Phase3 in milli-seconds.
     */
    @JsonProperty(value = "Phase3DurationMs", required = true)
    private double phase3DurationMs;

    /**
     * Duration of Phase4 in milli-seconds.
     */
    @JsonProperty(value = "Phase4DurationMs", required = true)
    private double phase4DurationMs;

    /**
     * Total duration in milli-seconds.
     */
    @JsonProperty(value = "TotalDurationMs", required = true)
    private double totalDurationMs;

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get id of Node instance.
     *
     * @return the nodeInstanceId value
     */
    public String nodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set id of Node instance.
     *
     * @param nodeInstanceId the nodeInstanceId value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * Get type of Service.
     *
     * @return the serviceType value
     */
    public String serviceType() {
        return this.serviceType;
    }

    /**
     * Set type of Service.
     *
     * @param serviceType the serviceType value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get ccEpochDataLoss version.
     *
     * @return the ccEpochDataLossVersion value
     */
    public long ccEpochDataLossVersion() {
        return this.ccEpochDataLossVersion;
    }

    /**
     * Set ccEpochDataLoss version.
     *
     * @param ccEpochDataLossVersion the ccEpochDataLossVersion value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withCcEpochDataLossVersion(long ccEpochDataLossVersion) {
        this.ccEpochDataLossVersion = ccEpochDataLossVersion;
        return this;
    }

    /**
     * Get ccEpochConfig version.
     *
     * @return the ccEpochConfigVersion value
     */
    public long ccEpochConfigVersion() {
        return this.ccEpochConfigVersion;
    }

    /**
     * Set ccEpochConfig version.
     *
     * @param ccEpochConfigVersion the ccEpochConfigVersion value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withCcEpochConfigVersion(long ccEpochConfigVersion) {
        this.ccEpochConfigVersion = ccEpochConfigVersion;
        return this;
    }

    /**
     * Get type of reconfiguration.
     *
     * @return the reconfigType value
     */
    public String reconfigType() {
        return this.reconfigType;
    }

    /**
     * Set type of reconfiguration.
     *
     * @param reconfigType the reconfigType value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withReconfigType(String reconfigType) {
        this.reconfigType = reconfigType;
        return this;
    }

    /**
     * Get describes reconfiguration result.
     *
     * @return the result value
     */
    public String result() {
        return this.result;
    }

    /**
     * Set describes reconfiguration result.
     *
     * @param result the result value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Get duration of Phase0 in milli-seconds.
     *
     * @return the phase0DurationMs value
     */
    public double phase0DurationMs() {
        return this.phase0DurationMs;
    }

    /**
     * Set duration of Phase0 in milli-seconds.
     *
     * @param phase0DurationMs the phase0DurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withPhase0DurationMs(double phase0DurationMs) {
        this.phase0DurationMs = phase0DurationMs;
        return this;
    }

    /**
     * Get duration of Phase1 in milli-seconds.
     *
     * @return the phase1DurationMs value
     */
    public double phase1DurationMs() {
        return this.phase1DurationMs;
    }

    /**
     * Set duration of Phase1 in milli-seconds.
     *
     * @param phase1DurationMs the phase1DurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withPhase1DurationMs(double phase1DurationMs) {
        this.phase1DurationMs = phase1DurationMs;
        return this;
    }

    /**
     * Get duration of Phase2 in milli-seconds.
     *
     * @return the phase2DurationMs value
     */
    public double phase2DurationMs() {
        return this.phase2DurationMs;
    }

    /**
     * Set duration of Phase2 in milli-seconds.
     *
     * @param phase2DurationMs the phase2DurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withPhase2DurationMs(double phase2DurationMs) {
        this.phase2DurationMs = phase2DurationMs;
        return this;
    }

    /**
     * Get duration of Phase3 in milli-seconds.
     *
     * @return the phase3DurationMs value
     */
    public double phase3DurationMs() {
        return this.phase3DurationMs;
    }

    /**
     * Set duration of Phase3 in milli-seconds.
     *
     * @param phase3DurationMs the phase3DurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withPhase3DurationMs(double phase3DurationMs) {
        this.phase3DurationMs = phase3DurationMs;
        return this;
    }

    /**
     * Get duration of Phase4 in milli-seconds.
     *
     * @return the phase4DurationMs value
     */
    public double phase4DurationMs() {
        return this.phase4DurationMs;
    }

    /**
     * Set duration of Phase4 in milli-seconds.
     *
     * @param phase4DurationMs the phase4DurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withPhase4DurationMs(double phase4DurationMs) {
        this.phase4DurationMs = phase4DurationMs;
        return this;
    }

    /**
     * Get total duration in milli-seconds.
     *
     * @return the totalDurationMs value
     */
    public double totalDurationMs() {
        return this.totalDurationMs;
    }

    /**
     * Set total duration in milli-seconds.
     *
     * @param totalDurationMs the totalDurationMs value to set
     * @return the PartitionReconfiguredEvent object itself.
     */
    public PartitionReconfiguredEvent withTotalDurationMs(double totalDurationMs) {
        this.totalDurationMs = totalDurationMs;
        return this;
    }

}
