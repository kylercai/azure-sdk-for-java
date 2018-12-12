/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentBillingFeaturesInner;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ComponentCurrentBillingFeaturesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ComponentCurrentBillingFeatures.
 */
public interface ComponentCurrentBillingFeatures extends HasInner<ComponentCurrentBillingFeaturesInner> {
    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentBillingFeatures> getAsync(String resourceGroupName, String resourceName);

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentBillingFeatures> updateAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties);

}
