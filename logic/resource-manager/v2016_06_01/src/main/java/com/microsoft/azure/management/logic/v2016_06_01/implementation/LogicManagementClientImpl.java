/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.logic.v2016_06_01.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the LogicManagementClientImpl class.
 */
public class LogicManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private LogicManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription id. */
    private String subscriptionId;

    /**
     * Gets The subscription id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version. */
    private String apiVersion;

    /**
     * Gets The API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public LogicManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The WorkflowsInner object to access its operations.
     */
    private WorkflowsInner workflows;

    /**
     * Gets the WorkflowsInner object to access its operations.
     * @return the WorkflowsInner object.
     */
    public WorkflowsInner workflows() {
        return this.workflows;
    }

    /**
     * The WorkflowVersionsInner object to access its operations.
     */
    private WorkflowVersionsInner workflowVersions;

    /**
     * Gets the WorkflowVersionsInner object to access its operations.
     * @return the WorkflowVersionsInner object.
     */
    public WorkflowVersionsInner workflowVersions() {
        return this.workflowVersions;
    }

    /**
     * The WorkflowTriggersInner object to access its operations.
     */
    private WorkflowTriggersInner workflowTriggers;

    /**
     * Gets the WorkflowTriggersInner object to access its operations.
     * @return the WorkflowTriggersInner object.
     */
    public WorkflowTriggersInner workflowTriggers() {
        return this.workflowTriggers;
    }

    /**
     * The WorkflowTriggerHistoriesInner object to access its operations.
     */
    private WorkflowTriggerHistoriesInner workflowTriggerHistories;

    /**
     * Gets the WorkflowTriggerHistoriesInner object to access its operations.
     * @return the WorkflowTriggerHistoriesInner object.
     */
    public WorkflowTriggerHistoriesInner workflowTriggerHistories() {
        return this.workflowTriggerHistories;
    }

    /**
     * The WorkflowRunsInner object to access its operations.
     */
    private WorkflowRunsInner workflowRuns;

    /**
     * Gets the WorkflowRunsInner object to access its operations.
     * @return the WorkflowRunsInner object.
     */
    public WorkflowRunsInner workflowRuns() {
        return this.workflowRuns;
    }

    /**
     * The WorkflowRunActionsInner object to access its operations.
     */
    private WorkflowRunActionsInner workflowRunActions;

    /**
     * Gets the WorkflowRunActionsInner object to access its operations.
     * @return the WorkflowRunActionsInner object.
     */
    public WorkflowRunActionsInner workflowRunActions() {
        return this.workflowRunActions;
    }

    /**
     * The WorkflowRunActionRepetitionsInner object to access its operations.
     */
    private WorkflowRunActionRepetitionsInner workflowRunActionRepetitions;

    /**
     * Gets the WorkflowRunActionRepetitionsInner object to access its operations.
     * @return the WorkflowRunActionRepetitionsInner object.
     */
    public WorkflowRunActionRepetitionsInner workflowRunActionRepetitions() {
        return this.workflowRunActionRepetitions;
    }

    /**
     * The WorkflowRunActionRepetitionsRequestHistoriesInner object to access its operations.
     */
    private WorkflowRunActionRepetitionsRequestHistoriesInner workflowRunActionRepetitionsRequestHistories;

    /**
     * Gets the WorkflowRunActionRepetitionsRequestHistoriesInner object to access its operations.
     * @return the WorkflowRunActionRepetitionsRequestHistoriesInner object.
     */
    public WorkflowRunActionRepetitionsRequestHistoriesInner workflowRunActionRepetitionsRequestHistories() {
        return this.workflowRunActionRepetitionsRequestHistories;
    }

    /**
     * The WorkflowRunActionRequestHistoriesInner object to access its operations.
     */
    private WorkflowRunActionRequestHistoriesInner workflowRunActionRequestHistories;

    /**
     * Gets the WorkflowRunActionRequestHistoriesInner object to access its operations.
     * @return the WorkflowRunActionRequestHistoriesInner object.
     */
    public WorkflowRunActionRequestHistoriesInner workflowRunActionRequestHistories() {
        return this.workflowRunActionRequestHistories;
    }

    /**
     * The WorkflowRunActionScopedRepetitionsInner object to access its operations.
     */
    private WorkflowRunActionScopedRepetitionsInner workflowRunActionScopedRepetitions;

    /**
     * Gets the WorkflowRunActionScopedRepetitionsInner object to access its operations.
     * @return the WorkflowRunActionScopedRepetitionsInner object.
     */
    public WorkflowRunActionScopedRepetitionsInner workflowRunActionScopedRepetitions() {
        return this.workflowRunActionScopedRepetitions;
    }

    /**
     * The WorkflowRunOperationsInner object to access its operations.
     */
    private WorkflowRunOperationsInner workflowRunOperations;

    /**
     * Gets the WorkflowRunOperationsInner object to access its operations.
     * @return the WorkflowRunOperationsInner object.
     */
    public WorkflowRunOperationsInner workflowRunOperations() {
        return this.workflowRunOperations;
    }

    /**
     * The IntegrationAccountsInner object to access its operations.
     */
    private IntegrationAccountsInner integrationAccounts;

    /**
     * Gets the IntegrationAccountsInner object to access its operations.
     * @return the IntegrationAccountsInner object.
     */
    public IntegrationAccountsInner integrationAccounts() {
        return this.integrationAccounts;
    }

    /**
     * The IntegrationAccountAssembliesInner object to access its operations.
     */
    private IntegrationAccountAssembliesInner integrationAccountAssemblies;

    /**
     * Gets the IntegrationAccountAssembliesInner object to access its operations.
     * @return the IntegrationAccountAssembliesInner object.
     */
    public IntegrationAccountAssembliesInner integrationAccountAssemblies() {
        return this.integrationAccountAssemblies;
    }

    /**
     * The IntegrationAccountBatchConfigurationsInner object to access its operations.
     */
    private IntegrationAccountBatchConfigurationsInner integrationAccountBatchConfigurations;

    /**
     * Gets the IntegrationAccountBatchConfigurationsInner object to access its operations.
     * @return the IntegrationAccountBatchConfigurationsInner object.
     */
    public IntegrationAccountBatchConfigurationsInner integrationAccountBatchConfigurations() {
        return this.integrationAccountBatchConfigurations;
    }

    /**
     * The SchemasInner object to access its operations.
     */
    private SchemasInner schemas;

    /**
     * Gets the SchemasInner object to access its operations.
     * @return the SchemasInner object.
     */
    public SchemasInner schemas() {
        return this.schemas;
    }

    /**
     * The MapsInner object to access its operations.
     */
    private MapsInner maps;

    /**
     * Gets the MapsInner object to access its operations.
     * @return the MapsInner object.
     */
    public MapsInner maps() {
        return this.maps;
    }

    /**
     * The PartnersInner object to access its operations.
     */
    private PartnersInner partners;

    /**
     * Gets the PartnersInner object to access its operations.
     * @return the PartnersInner object.
     */
    public PartnersInner partners() {
        return this.partners;
    }

    /**
     * The AgreementsInner object to access its operations.
     */
    private AgreementsInner agreements;

    /**
     * Gets the AgreementsInner object to access its operations.
     * @return the AgreementsInner object.
     */
    public AgreementsInner agreements() {
        return this.agreements;
    }

    /**
     * The CertificatesInner object to access its operations.
     */
    private CertificatesInner certificates;

    /**
     * Gets the CertificatesInner object to access its operations.
     * @return the CertificatesInner object.
     */
    public CertificatesInner certificates() {
        return this.certificates;
    }

    /**
     * The SessionsInner object to access its operations.
     */
    private SessionsInner sessions;

    /**
     * Gets the SessionsInner object to access its operations.
     * @return the SessionsInner object.
     */
    public SessionsInner sessions() {
        return this.sessions;
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public LogicManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public LogicManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public LogicManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-06-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.workflows = new WorkflowsInner(restClient().retrofit(), this);
        this.workflowVersions = new WorkflowVersionsInner(restClient().retrofit(), this);
        this.workflowTriggers = new WorkflowTriggersInner(restClient().retrofit(), this);
        this.workflowTriggerHistories = new WorkflowTriggerHistoriesInner(restClient().retrofit(), this);
        this.workflowRuns = new WorkflowRunsInner(restClient().retrofit(), this);
        this.workflowRunActions = new WorkflowRunActionsInner(restClient().retrofit(), this);
        this.workflowRunActionRepetitions = new WorkflowRunActionRepetitionsInner(restClient().retrofit(), this);
        this.workflowRunActionRepetitionsRequestHistories = new WorkflowRunActionRepetitionsRequestHistoriesInner(restClient().retrofit(), this);
        this.workflowRunActionRequestHistories = new WorkflowRunActionRequestHistoriesInner(restClient().retrofit(), this);
        this.workflowRunActionScopedRepetitions = new WorkflowRunActionScopedRepetitionsInner(restClient().retrofit(), this);
        this.workflowRunOperations = new WorkflowRunOperationsInner(restClient().retrofit(), this);
        this.integrationAccounts = new IntegrationAccountsInner(restClient().retrofit(), this);
        this.integrationAccountAssemblies = new IntegrationAccountAssembliesInner(restClient().retrofit(), this);
        this.integrationAccountBatchConfigurations = new IntegrationAccountBatchConfigurationsInner(restClient().retrofit(), this);
        this.schemas = new SchemasInner(restClient().retrofit(), this);
        this.maps = new MapsInner(restClient().retrofit(), this);
        this.partners = new PartnersInner(restClient().retrofit(), this);
        this.agreements = new AgreementsInner(restClient().retrofit(), this);
        this.certificates = new CertificatesInner(restClient().retrofit(), this);
        this.sessions = new SessionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "LogicManagementClient", "2016-06-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(LogicManagementClientService.class);
    }

    /**
     * The interface defining all the services for LogicManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LogicManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.LogicManagementClient listOperations" })
        @GET("providers/Microsoft.Logic/operations")
        Observable<Response<ResponseBody>> listOperations(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.LogicManagementClient listOperationsNext" })
        @GET
        Observable<Response<ResponseBody>> listOperationsNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> listOperations() {
        ServiceResponse<Page<OperationInner>> response = listOperationsSinglePageAsync().toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listOperationsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listOperationsAsync(final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listOperationsSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listOperationsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listOperationsAsync() {
        return listOperationsWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listOperationsWithServiceResponseAsync() {
        return listOperationsSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listOperationsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listOperationsSinglePageAsync() {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.listOperations(this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listOperationsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listOperationsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PageImpl<OperationInner>, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> listOperationsNext(final String nextPageLink) {
        ServiceResponse<Page<OperationInner>> response = listOperationsNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listOperationsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listOperationsNextAsync(final String nextPageLink, final ServiceFuture<List<OperationInner>> serviceFuture, final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listOperationsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listOperationsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listOperationsNextAsync(final String nextPageLink) {
        return listOperationsNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listOperationsNextWithServiceResponseAsync(final String nextPageLink) {
        return listOperationsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listOperationsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Logic REST API operations.
     *
    ServiceResponse<PageImpl<OperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listOperationsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listOperationsNext(nextUrl, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listOperationsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listOperationsNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PageImpl<OperationInner>, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
