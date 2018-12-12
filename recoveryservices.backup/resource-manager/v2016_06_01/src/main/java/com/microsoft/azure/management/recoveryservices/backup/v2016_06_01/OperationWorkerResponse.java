/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The base class for operation result responses.
 */
public class OperationWorkerResponse {
    /**
     * The HTTP status code of the operation. Possible values include:
     * 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted',
     * 'NonAuthoritativeInformation', 'NoContent', 'ResetContent',
     * 'PartialContent', 'MultipleChoices', 'Ambiguous', 'MovedPermanently',
     * 'Moved', 'Found', 'Redirect', 'SeeOther', 'RedirectMethod',
     * 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect',
     * 'RedirectKeepVerb', 'BadRequest', 'Unauthorized', 'PaymentRequired',
     * 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable',
     * 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone',
     * 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge',
     * 'RequestUriTooLong', 'UnsupportedMediaType',
     * 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired',
     * 'InternalServerError', 'NotImplemented', 'BadGateway',
     * 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /**
     * The HTTP headers associated with this operation.
     */
    @JsonProperty(value = "Headers")
    private Map<String, List<String>> headers;

    /**
     * Get the HTTP status code of the operation. Possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'Ambiguous', 'MovedPermanently', 'Moved', 'Found', 'Redirect', 'SeeOther', 'RedirectMethod', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'RedirectKeepVerb', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @return the statusCode value
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the HTTP status code of the operation. Possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'Ambiguous', 'MovedPermanently', 'Moved', 'Found', 'Redirect', 'SeeOther', 'RedirectMethod', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'RedirectKeepVerb', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @param statusCode the statusCode value to set
     * @return the OperationWorkerResponse object itself.
     */
    public OperationWorkerResponse withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the HTTP headers associated with this operation.
     *
     * @return the headers value
     */
    public Map<String, List<String>> headers() {
        return this.headers;
    }

    /**
     * Set the HTTP headers associated with this operation.
     *
     * @param headers the headers value to set
     * @return the OperationWorkerResponse object itself.
     */
    public OperationWorkerResponse withHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
        return this;
    }

}
