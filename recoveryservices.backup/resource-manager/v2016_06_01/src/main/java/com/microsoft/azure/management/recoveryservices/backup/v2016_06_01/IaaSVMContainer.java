/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionContainerInner;

/**
 * IaaS VM workload-specific container.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableObjectType")
@JsonTypeName("IaaSVMContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = AzureIaaSComputeVMContainer.class),
    @JsonSubTypes.Type(name = "Microsoft.ClassicCompute/virtualMachines", value = AzureIaaSClassicComputeVMContainer.class)
})
public class IaaSVMContainer extends ProtectionContainerInner {
    /**
     * The fully qualified Resource Manager URL of the virtual machine
     * represented by this Azure IaaS VM container.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /**
     * Specifies whether the container represents a classic or a Resource
     * Manager-deployed virtual machine.
     */
    @JsonProperty(value = "virtualMachineVersion")
    private String virtualMachineVersion;

    /**
     * The resource group name associated with the Recovery Services vault.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the fully qualified Resource Manager URL of the virtual machine represented by this Azure IaaS VM container.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set the fully qualified Resource Manager URL of the virtual machine represented by this Azure IaaS VM container.
     *
     * @param virtualMachineId the virtualMachineId value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * Get specifies whether the container represents a classic or a Resource Manager-deployed virtual machine.
     *
     * @return the virtualMachineVersion value
     */
    public String virtualMachineVersion() {
        return this.virtualMachineVersion;
    }

    /**
     * Set specifies whether the container represents a classic or a Resource Manager-deployed virtual machine.
     *
     * @param virtualMachineVersion the virtualMachineVersion value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withVirtualMachineVersion(String virtualMachineVersion) {
        this.virtualMachineVersion = virtualMachineVersion;
        return this;
    }

    /**
     * Get the resource group name associated with the Recovery Services vault.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resource group name associated with the Recovery Services vault.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
