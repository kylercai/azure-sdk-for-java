/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the DSC Report Resource.
 */
public class DscReportResource {
    /**
     * Gets or sets the ID of the resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Gets or sets the source info of the resource.
     */
    @JsonProperty(value = "sourceInfo")
    private String sourceInfo;

    /**
     * Gets or sets the Resource Navigation values for resources the resource
     * depends on.
     */
    @JsonProperty(value = "dependsOn")
    private List<DscReportResourceNavigation> dependsOn;

    /**
     * Gets or sets the module name of the resource.
     */
    @JsonProperty(value = "moduleName")
    private String moduleName;

    /**
     * Gets or sets the module version of the resource.
     */
    @JsonProperty(value = "moduleVersion")
    private String moduleVersion;

    /**
     * Gets or sets the name of the resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Gets or sets the error of the resource.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Gets or sets the status of the resource.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Gets or sets the duration in seconds for the resource.
     */
    @JsonProperty(value = "durationInSeconds")
    private Double durationInSeconds;

    /**
     * Gets or sets the start date of the resource.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * Get gets or sets the ID of the resource.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set gets or sets the ID of the resource.
     *
     * @param resourceId the resourceId value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get gets or sets the source info of the resource.
     *
     * @return the sourceInfo value
     */
    public String sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set gets or sets the source info of the resource.
     *
     * @param sourceInfo the sourceInfo value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get gets or sets the Resource Navigation values for resources the resource depends on.
     *
     * @return the dependsOn value
     */
    public List<DscReportResourceNavigation> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set gets or sets the Resource Navigation values for resources the resource depends on.
     *
     * @param dependsOn the dependsOn value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withDependsOn(List<DscReportResourceNavigation> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get gets or sets the module name of the resource.
     *
     * @return the moduleName value
     */
    public String moduleName() {
        return this.moduleName;
    }

    /**
     * Set gets or sets the module name of the resource.
     *
     * @param moduleName the moduleName value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * Get gets or sets the module version of the resource.
     *
     * @return the moduleVersion value
     */
    public String moduleVersion() {
        return this.moduleVersion;
    }

    /**
     * Set gets or sets the module version of the resource.
     *
     * @param moduleVersion the moduleVersion value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * Get gets or sets the name of the resource.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set gets or sets the name of the resource.
     *
     * @param resourceName the resourceName value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get gets or sets the error of the resource.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set gets or sets the error of the resource.
     *
     * @param error the error value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get gets or sets the status of the resource.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set gets or sets the status of the resource.
     *
     * @param status the status value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get gets or sets the duration in seconds for the resource.
     *
     * @return the durationInSeconds value
     */
    public Double durationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Set gets or sets the duration in seconds for the resource.
     *
     * @param durationInSeconds the durationInSeconds value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withDurationInSeconds(Double durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * Get gets or sets the start date of the resource.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set gets or sets the start date of the resource.
     *
     * @param startDate the startDate value to set
     * @return the DscReportResource object itself.
     */
    public DscReportResource withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

}
