/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.DatabasesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Databases.
 */
public interface Databases extends SupportsCreating<Database.DefinitionStages.Blank>, HasInner<DatabasesInner> {
    /**
     * Begins definition for a new Extension resource.
     * @param name resource name.
     * @return the first stage of the new Extension definition.
     */
    ImportExportResponse.DefinitionStages.Blank defineExtension(String name);

    /**
     * Pauses a data warehouse.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the data warehouse to pause.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable pauseAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Resumes a data warehouse.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the data warehouse to resume.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resumeAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database inside of an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to be retrieved.
     * @param databaseName The name of the database to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> getByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName, String databaseName);

    /**
     * Returns a list of databases in an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> listByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName);

    /**
     * Gets a database inside of a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the elastic pool to be retrieved.
     * @param databaseName The name of the database to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> getByRecommendedElasticPoolAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName, String databaseName);

    /**
     * Returns a list of databases inside a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> listByRecommendedElasticPoolAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName);

    /**
     * Exports a database to a bacpac.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to be exported.
     * @param parameters The required parameters for exporting a database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ImportExportResponse> exportAsync(String resourceGroupName, String serverName, String databaseName, ExportRequest parameters);

    /**
     * Gets a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> getAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Returns a list of databases in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Database> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Imports a bacpac into a new database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The required parameters for importing a Bacpac into a database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ImportExportResponse> importMethodAsync(String resourceGroupName, String serverName, ImportRequest parameters);

}
