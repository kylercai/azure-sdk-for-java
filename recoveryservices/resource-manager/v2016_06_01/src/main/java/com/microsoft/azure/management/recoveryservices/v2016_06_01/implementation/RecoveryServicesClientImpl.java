/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the RecoveryServicesClientImpl class.
 */
public class RecoveryServicesClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription Id. */
    private String subscriptionId;

    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public RecoveryServicesClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
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
    public RecoveryServicesClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public RecoveryServicesClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public RecoveryServicesClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The VaultCertificatesInner object to access its operations.
     */
    private VaultCertificatesInner vaultCertificates;

    /**
     * Gets the VaultCertificatesInner object to access its operations.
     * @return the VaultCertificatesInner object.
     */
    public VaultCertificatesInner vaultCertificates() {
        return this.vaultCertificates;
    }

    /**
     * The RegisteredIdentitiesInner object to access its operations.
     */
    private RegisteredIdentitiesInner registeredIdentities;

    /**
     * Gets the RegisteredIdentitiesInner object to access its operations.
     * @return the RegisteredIdentitiesInner object.
     */
    public RegisteredIdentitiesInner registeredIdentities() {
        return this.registeredIdentities;
    }

    /**
     * The ReplicationUsagesInner object to access its operations.
     */
    private ReplicationUsagesInner replicationUsages;

    /**
     * Gets the ReplicationUsagesInner object to access its operations.
     * @return the ReplicationUsagesInner object.
     */
    public ReplicationUsagesInner replicationUsages() {
        return this.replicationUsages;
    }

    /**
     * The VaultsInner object to access its operations.
     */
    private VaultsInner vaults;

    /**
     * Gets the VaultsInner object to access its operations.
     * @return the VaultsInner object.
     */
    public VaultsInner vaults() {
        return this.vaults;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The VaultExtendedInfosInner object to access its operations.
     */
    private VaultExtendedInfosInner vaultExtendedInfos;

    /**
     * Gets the VaultExtendedInfosInner object to access its operations.
     * @return the VaultExtendedInfosInner object.
     */
    public VaultExtendedInfosInner vaultExtendedInfos() {
        return this.vaultExtendedInfos;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * Initializes an instance of RecoveryServicesClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public RecoveryServicesClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of RecoveryServicesClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public RecoveryServicesClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of RecoveryServicesClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public RecoveryServicesClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-06-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.vaultCertificates = new VaultCertificatesInner(restClient().retrofit(), this);
        this.registeredIdentities = new RegisteredIdentitiesInner(restClient().retrofit(), this);
        this.replicationUsages = new ReplicationUsagesInner(restClient().retrofit(), this);
        this.vaults = new VaultsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.vaultExtendedInfos = new VaultExtendedInfosInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "RecoveryServicesClient", "2016-06-01");
    }
}
