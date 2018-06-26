/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.ContainerRegistryManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.BuildGetLogResultInner;

/**
 * Type representing BuildGetLogResult.
 */
public interface BuildGetLogResult extends HasInner<BuildGetLogResultInner>, HasManager<ContainerRegistryManager> {
    /**
     * @return the logLink value.
     */
    String logLink();

}
