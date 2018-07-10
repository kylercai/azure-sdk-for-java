/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.TransformsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Transforms.
 */
public interface Transforms extends SupportsCreating<Transform.DefinitionStages.Blank>, HasInner<TransformsInner> {
    /**
     * Get Transform.
     * Gets a Transform.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transform> getAsync(String resourceGroupName, String accountName, String transformName);

    /**
     * List Transforms.
     * Lists the Transforms in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transform> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete Transform.
     * Deletes a Transform.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String transformName);

}
