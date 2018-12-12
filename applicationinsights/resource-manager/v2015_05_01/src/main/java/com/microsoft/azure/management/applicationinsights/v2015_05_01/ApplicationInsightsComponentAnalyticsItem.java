/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentAnalyticsItemInner;

/**
 * Type representing ApplicationInsightsComponentAnalyticsItem.
 */
public interface ApplicationInsightsComponentAnalyticsItem extends HasInner<ApplicationInsightsComponentAnalyticsItemInner>, HasManager<InsightsManager> {
    /**
     * @return the content value.
     */
    String content();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ApplicationInsightsComponentAnalyticsItemProperties properties();

    /**
     * @return the scope value.
     */
    ItemScope scope();

    /**
     * @return the timeCreated value.
     */
    String timeCreated();

    /**
     * @return the timeModified value.
     */
    String timeModified();

    /**
     * @return the type value.
     */
    ItemType type();

    /**
     * @return the version value.
     */
    String version();

}
