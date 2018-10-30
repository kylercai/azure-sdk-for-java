/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.ArmTemplatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ArmTemplates.
 */
public interface ArmTemplates extends HasInner<ArmTemplatesInner> {
    /**
     * Get azure resource manager template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the azure Resource Manager template.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ArmTemplate> getAsync(String resourceGroupName, String labName, String artifactSourceName, String name);

    /**
     * List azure resource manager templates in a given artifact source.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ArmTemplate> listAsync(final String resourceGroupName, final String labName, final String artifactSourceName);

}
