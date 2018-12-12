/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProtectedItemOperationResults.
 */
public class ProtectedItemOperationResultsInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectedItemOperationResultsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectedItemOperationResultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectedItemOperationResultsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectedItemOperationResultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectedItemOperationResults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectedItemOperationResultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectedItemOperationResults get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/operationResults/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectedItemResourceInner object if successful.
     */
    public ProtectedItemResourceInner get(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId).toBlocking().single().body();
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectedItemResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId, final ServiceCallback<ProtectedItemResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId), serviceCallback);
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectedItemResourceInner object
     */
    public Observable<ProtectedItemResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId).map(new Func1<ServiceResponse<ProtectedItemResourceInner>, ProtectedItemResourceInner>() {
            @Override
            public ProtectedItemResourceInner call(ServiceResponse<ProtectedItemResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectedItemResourceInner object
     */
    public Observable<ServiceResponse<ProtectedItemResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, operationId, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectedItemResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectedItemResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectedItemResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectedItemResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectedItemResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectedItemResourceInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
