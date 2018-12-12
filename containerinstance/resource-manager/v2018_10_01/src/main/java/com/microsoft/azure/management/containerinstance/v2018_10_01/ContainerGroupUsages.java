/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import rx.Observable;

/**
 * Type representing ContainerGroupUsages.
 */
public interface ContainerGroupUsages {
    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageListResult> listAsync(String location);

}
