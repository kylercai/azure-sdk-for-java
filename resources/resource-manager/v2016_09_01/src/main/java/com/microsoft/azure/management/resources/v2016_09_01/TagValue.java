/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2016_09_01.implementation.ResourcesManager;
import com.microsoft.azure.management.resources.v2016_09_01.implementation.TagValueInner;

/**
 * Type representing TagValue.
 */
public interface TagValue extends HasInner<TagValueInner>, HasManager<ResourcesManager> {
    /**
     * @return the count value.
     */
    TagCount count();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the tagValue value.
     */
    String tagValue();

}
