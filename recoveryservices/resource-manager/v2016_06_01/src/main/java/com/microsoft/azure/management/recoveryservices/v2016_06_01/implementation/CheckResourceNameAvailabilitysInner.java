/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.ResourceNameAvailabilityInput;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in CheckResourceNameAvailabilitys.
 */
public class CheckResourceNameAvailabilitysInner {
    /** The Retrofit service to perform REST calls. */
    private CheckResourceNameAvailabilitysService service;
    /** The service client containing this operation class. */
    private RecoveryServicesClientImpl client;

    /**
     * Initializes an instance of CheckResourceNameAvailabilitysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CheckResourceNameAvailabilitysInner(Retrofit retrofit, RecoveryServicesClientImpl client) {
        this.service = retrofit.create(CheckResourceNameAvailabilitysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CheckResourceNameAvailabilitys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CheckResourceNameAvailabilitysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.v2016_06_01.CheckResourceNameAvailabilitys post" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.RecoveryServices/locations/{location}/checkNameAvailability")
        Observable<Response<ResponseBody>> post(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Body ResourceNameAvailabilityInput input, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * API to check for resource name availability.
     A name is available if no other resource exists that has the same SubscriptionId, Resource Name and Type
     or if one or more such resources exist, each of these must be GCed and their time of deletion be more than 24 Hours Ago.
     *
     * @param location Location of the resource
     * @param input Contains information about Resource type and Resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceNameAvailabilityResponseResourceInner object if successful.
     */
    public ResourceNameAvailabilityResponseResourceInner post(String location, ResourceNameAvailabilityInput input) {
        return postWithServiceResponseAsync(location, input).toBlocking().single().body();
    }

    /**
     * API to check for resource name availability.
     A name is available if no other resource exists that has the same SubscriptionId, Resource Name and Type
     or if one or more such resources exist, each of these must be GCed and their time of deletion be more than 24 Hours Ago.
     *
     * @param location Location of the resource
     * @param input Contains information about Resource type and Resource name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceNameAvailabilityResponseResourceInner> postAsync(String location, ResourceNameAvailabilityInput input, final ServiceCallback<ResourceNameAvailabilityResponseResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(postWithServiceResponseAsync(location, input), serviceCallback);
    }

    /**
     * API to check for resource name availability.
     A name is available if no other resource exists that has the same SubscriptionId, Resource Name and Type
     or if one or more such resources exist, each of these must be GCed and their time of deletion be more than 24 Hours Ago.
     *
     * @param location Location of the resource
     * @param input Contains information about Resource type and Resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityResponseResourceInner object
     */
    public Observable<ResourceNameAvailabilityResponseResourceInner> postAsync(String location, ResourceNameAvailabilityInput input) {
        return postWithServiceResponseAsync(location, input).map(new Func1<ServiceResponse<ResourceNameAvailabilityResponseResourceInner>, ResourceNameAvailabilityResponseResourceInner>() {
            @Override
            public ResourceNameAvailabilityResponseResourceInner call(ServiceResponse<ResourceNameAvailabilityResponseResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * API to check for resource name availability.
     A name is available if no other resource exists that has the same SubscriptionId, Resource Name and Type
     or if one or more such resources exist, each of these must be GCed and their time of deletion be more than 24 Hours Ago.
     *
     * @param location Location of the resource
     * @param input Contains information about Resource type and Resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityResponseResourceInner object
     */
    public Observable<ServiceResponse<ResourceNameAvailabilityResponseResourceInner>> postWithServiceResponseAsync(String location, ResourceNameAvailabilityInput input) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (input == null) {
            throw new IllegalArgumentException("Parameter input is required and cannot be null.");
        }
        Validator.validate(input);
        return service.post(this.client.subscriptionId(), location, this.client.apiVersion(), input, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceNameAvailabilityResponseResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceNameAvailabilityResponseResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceNameAvailabilityResponseResourceInner> clientResponse = postDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceNameAvailabilityResponseResourceInner> postDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ResourceNameAvailabilityResponseResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResourceNameAvailabilityResponseResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
