/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Vertica linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Vertica")
@JsonFlatten
public class VerticaLinkedService extends LinkedServiceInner {
    /**
     * An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get an ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set an ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the VerticaLinkedService object itself.
     */
    public VerticaLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the VerticaLinkedService object itself.
     */
    public VerticaLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
