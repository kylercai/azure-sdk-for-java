/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation.ProjectsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Projects.
 */
public interface Projects extends SupportsCreating<Project.DefinitionStages.Blank>, HasInner<ProjectsInner> {
    /**
     * Get project information.
     * The project resource is a nested resource representing a stored migration project. The GET method retrieves information about a project.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Project> getAsync(String groupName, String serviceName, String projectName);

    /**
     * Get projects in a service.
     * The project resource is a nested resource representing a stored migration project. This method returns a list of projects owned by a service resource.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Project> listAsync(final String groupName, final String serviceName);

    /**
     * Delete project.
     * The project resource is a nested resource representing a stored migration project. The DELETE method deletes a project.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param projectName Name of the project
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String groupName, String serviceName, String projectName);

}
