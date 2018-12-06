/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WorkItemConfiguration;
import rx.Completable;

/**
 * Type representing WorkItemConfigurations.
 */
public interface WorkItemConfigurations {
    /**
     * Gets the list work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkItemConfiguration> listAsync(String resourceGroupName, String resourceName);

    /**
     * Delete a work item configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as defined in connector configuration
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName, String workItemConfigId);

    /**
     * Create a work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigurationProperties Properties that need to be specified to create a work item configuration of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkItemConfiguration> createAsync(String resourceGroupName, String resourceName, WorkItemCreateConfiguration workItemConfigurationProperties);

    /**
     * Gets default work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkItemConfiguration> getDefaultAsync(String resourceGroupName, String resourceName);

}
