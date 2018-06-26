/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties that are enabled for Odata querying.
 */
public class BuildFilter {
    /**
     * The unique identifier for the build.
     */
    @JsonProperty(value = "buildId")
    private String buildId;

    /**
     * The type of build. Possible values include: 'AutoBuild', 'QuickBuild'.
     */
    @JsonProperty(value = "buildType")
    private BuildType buildType;

    /**
     * The current status of the build. Possible values include: 'Queued',
     * 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error',
     * 'Timeout'.
     */
    @JsonProperty(value = "status")
    private BuildStatus status;

    /**
     * The create time for a build.
     */
    @JsonProperty(value = "createTime")
    private DateTime createTime;

    /**
     * The time the build finished.
     */
    @JsonProperty(value = "finishTime")
    private DateTime finishTime;

    /**
     * The list of all images that were generated from the build.
     */
    @JsonProperty(value = "outputImageNames")
    private List<String> outputImageNames;

    /**
     * The value that indicates whether archiving is enabled or not.
     */
    @JsonProperty(value = "isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /**
     * The name of the build task that the build corresponds to.
     */
    @JsonProperty(value = "buildTaskName")
    private String buildTaskName;

    /**
     * Get the unique identifier for the build.
     *
     * @return the buildId value
     */
    public String buildId() {
        return this.buildId;
    }

    /**
     * Set the unique identifier for the build.
     *
     * @param buildId the buildId value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * Get the type of build. Possible values include: 'AutoBuild', 'QuickBuild'.
     *
     * @return the buildType value
     */
    public BuildType buildType() {
        return this.buildType;
    }

    /**
     * Set the type of build. Possible values include: 'AutoBuild', 'QuickBuild'.
     *
     * @param buildType the buildType value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withBuildType(BuildType buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * Get the current status of the build. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @return the status value
     */
    public BuildStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the build. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @param status the status value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withStatus(BuildStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the create time for a build.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the create time for a build.
     *
     * @param createTime the createTime value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the time the build finished.
     *
     * @return the finishTime value
     */
    public DateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the time the build finished.
     *
     * @param finishTime the finishTime value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the list of all images that were generated from the build.
     *
     * @return the outputImageNames value
     */
    public List<String> outputImageNames() {
        return this.outputImageNames;
    }

    /**
     * Set the list of all images that were generated from the build.
     *
     * @param outputImageNames the outputImageNames value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withOutputImageNames(List<String> outputImageNames) {
        this.outputImageNames = outputImageNames;
        return this;
    }

    /**
     * Get the value that indicates whether archiving is enabled or not.
     *
     * @return the isArchiveEnabled value
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the value that indicates whether archiving is enabled or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

    /**
     * Get the name of the build task that the build corresponds to.
     *
     * @return the buildTaskName value
     */
    public String buildTaskName() {
        return this.buildTaskName;
    }

    /**
     * Set the name of the build task that the build corresponds to.
     *
     * @param buildTaskName the buildTaskName value to set
     * @return the BuildFilter object itself.
     */
    public BuildFilter withBuildTaskName(String buildTaskName) {
        this.buildTaskName = buildTaskName;
        return this;
    }

}
