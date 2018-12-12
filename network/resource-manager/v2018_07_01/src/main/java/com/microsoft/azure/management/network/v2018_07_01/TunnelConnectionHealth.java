/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualNetworkGatewayConnection properties.
 */
public class TunnelConnectionHealth {
    /**
     * Tunnel name.
     */
    @JsonProperty(value = "tunnel", access = JsonProperty.Access.WRITE_ONLY)
    private String tunnel;

    /**
     * Virtual network Gateway connection status. Possible values include:
     * 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /**
     * The Ingress Bytes Transferred in this connection.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /**
     * The Egress Bytes Transferred in this connection.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /**
     * The time at which connection was established in Utc format.
     */
    @JsonProperty(value = "lastConnectionEstablishedUtcTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastConnectionEstablishedUtcTime;

    /**
     * Get tunnel name.
     *
     * @return the tunnel value
     */
    public String tunnel() {
        return this.tunnel;
    }

    /**
     * Get virtual network Gateway connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     *
     * @return the connectionStatus value
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the Ingress Bytes Transferred in this connection.
     *
     * @return the ingressBytesTransferred value
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the Egress Bytes Transferred in this connection.
     *
     * @return the egressBytesTransferred value
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the time at which connection was established in Utc format.
     *
     * @return the lastConnectionEstablishedUtcTime value
     */
    public String lastConnectionEstablishedUtcTime() {
        return this.lastConnectionEstablishedUtcTime;
    }

}
