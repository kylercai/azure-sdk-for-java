/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01.implementation;

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
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private ContainerInstanceManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, ContainerInstanceManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.v2018_04_01.Operations list" })
        @GET("providers/Microsoft.ContainerInstance/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List the operations for Azure Container Instance service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationListResultInner object if successful.
     */
    public OperationListResultInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List the operations for Azure Container Instance service.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationListResultInner> listAsync(final ServiceCallback<OperationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List the operations for Azure Container Instance service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResultInner object
     */
    public Observable<OperationListResultInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<OperationListResultInner>, OperationListResultInner>() {
            @Override
            public OperationListResultInner call(ServiceResponse<OperationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * List the operations for Azure Container Instance service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResultInner object
     */
    public Observable<ServiceResponse<OperationListResultInner>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationListResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
