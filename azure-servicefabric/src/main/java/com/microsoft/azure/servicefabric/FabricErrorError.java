/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error object containing error code and error message.
 */
public class FabricErrorError {
    /**
     * Defines the fabric error codes that be returned as part of the error
     * object in response to Service Fabric API operations that are not
     * successful. Following are the error code values that can be returned for
     * a specific HTTP status code.
     *
     * - Possible values of the error code for HTTP status code 400 (Bad
     * Request)
     * - "FABRIC_E_INVALID_PARTITION_KEY"
     * - "FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR"
     * - "FABRIC_E_INVALID_ADDRESS"
     * - "FABRIC_E_APPLICATION_NOT_UPGRADING"
     * - "FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR"
     * - "FABRIC_E_FABRIC_NOT_UPGRADING"
     * - "FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR"
     * - "FABRIC_E_INVALID_CONFIGURATION"
     * - "FABRIC_E_INVALID_NAME_URI"
     * - "FABRIC_E_PATH_TOO_LONG"
     * - "FABRIC_E_KEY_TOO_LARGE"
     * - "FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED"
     * - "FABRIC_E_INVALID_ATOMIC_GROUP"
     * - "FABRIC_E_VALUE_EMPTY"
     * - "FABRIC_E_BACKUP_IS_ENABLED"
     * - "FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH"
     * - "FABRIC_E_INVALID_FOR_STATELESS_SERVICES"
     * - "FABRIC_E_INVALID_SERVICE_SCALING_POLICY"
     * - "E_INVALIDARG"
     *
     * - Possible values of the error code for HTTP status code 404 (Not Found)
     * - "FABRIC_E_NODE_NOT_FOUND"
     * - "FABRIC_E_APPLICATION_TYPE_NOT_FOUND"
     * - "FABRIC_E_APPLICATION_NOT_FOUND"
     * - "FABRIC_E_SERVICE_TYPE_NOT_FOUND"
     * - "FABRIC_E_SERVICE_DOES_NOT_EXIST"
     * - "FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND"
     * - "FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND"
     * - "FABRIC_E_PARTITION_NOT_FOUND"
     * - "FABRIC_E_REPLICA_DOES_NOT_EXIST"
     * - "FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST"
     * - "FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND"
     * - "FABRIC_E_DIRECTORY_NOT_FOUND"
     * - "FABRIC_E_FABRIC_VERSION_NOT_FOUND"
     * - "FABRIC_E_FILE_NOT_FOUND"
     * - "FABRIC_E_NAME_DOES_NOT_EXIST"
     * - "FABRIC_E_PROPERTY_DOES_NOT_EXIST"
     * - "FABRIC_E_ENUMERATION_COMPLETED"
     * - "FABRIC_E_SERVICE_MANIFEST_NOT_FOUND"
     * - "FABRIC_E_KEY_NOT_FOUND"
     * - "FABRIC_E_HEALTH_ENTITY_NOT_FOUND"
     * - "FABRIC_E_BACKUP_NOT_ENABLED"
     * - "FABRIC_E_BACKUP_POLICY_NOT_EXISTING"
     * - "FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING"
     * - "FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR"
     *
     * - Possible values of the error code for HTTP status code 409 (Conflict)
     * - "FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS"
     * - "FABRIC_E_APPLICATION_ALREADY_EXISTS"
     * - "FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION"
     * - "FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS"
     * - "FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS"
     * - "FABRIC_E_SERVICE_ALREADY_EXISTS"
     * - "FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS"
     * - "FABRIC_E_APPLICATION_TYPE_IN_USE"
     * - "FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION"
     * - "FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS"
     * - "FABRIC_E_FABRIC_VERSION_IN_USE"
     * - "FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS"
     * - "FABRIC_E_NAME_ALREADY_EXISTS"
     * - "FABRIC_E_NAME_NOT_EMPTY"
     * - "FABRIC_E_PROPERTY_CHECK_FAILED"
     * - "FABRIC_E_SERVICE_METADATA_MISMATCH"
     * - "FABRIC_E_SERVICE_TYPE_MISMATCH"
     * - "FABRIC_E_HEALTH_STALE_REPORT"
     * - "FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED"
     * - "FABRIC_E_NODE_HAS_NOT_STOPPED_YET"
     * - "FABRIC_E_INSTANCE_ID_MISMATCH"
     * - "FABRIC_E_BACKUP_IN_PROGRESS"
     * - "FABRIC_E_RESTORE_IN_PROGRESS"
     * - "FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING"
     *
     * - Possible values of the error code for HTTP status code 413 (Request
     * Entity Too Large)
     * - "FABRIC_E_VALUE_TOO_LARGE"
     *
     * - Possible values of the error code for HTTP status code 500 (Internal
     * Server Error)
     * - "FABRIC_E_NODE_IS_UP"
     * - "E_FAIL"
     * - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS"
     * - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND"
     * - "FABRIC_E_VOLUME_ALREADY_EXISTS"
     * - "ABRIC_E_VOLUME_NOT_FOUND"
     * - "SerializationError"
     *
     * - Possible values of the error code for HTTP status code 503 (Service
     * Unavailable)
     * - "FABRIC_E_NO_WRITE_QUORUM"
     * - "FABRIC_E_NOT_PRIMARY"
     * - "FABRIC_E_NOT_READY"
     * - "FABRIC_E_RECONFIGURATION_PENDING"
     * - "FABRIC_E_SERVICE_OFFLINE"
     * - "E_ABORT"
     * - "FABRIC_E_VALUE_TOO_LARGE"
     *
     * - Possible values of the error code for HTTP status code 504 (Gateway
     * Timeout)
     * - "FABRIC_E_COMMUNICATION_ERROR"
     * - "FABRIC_E_OPERATION_NOT_COMPLETE"
     * - "FABRIC_E_TIMEOUT". Possible values include:
     * 'FABRIC_E_INVALID_PARTITION_KEY',
     * 'FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR', 'FABRIC_E_INVALID_ADDRESS',
     * 'FABRIC_E_APPLICATION_NOT_UPGRADING',
     * 'FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR',
     * 'FABRIC_E_FABRIC_NOT_UPGRADING',
     * 'FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR',
     * 'FABRIC_E_INVALID_CONFIGURATION', 'FABRIC_E_INVALID_NAME_URI',
     * 'FABRIC_E_PATH_TOO_LONG', 'FABRIC_E_KEY_TOO_LARGE',
     * 'FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED',
     * 'FABRIC_E_INVALID_ATOMIC_GROUP', 'FABRIC_E_VALUE_EMPTY',
     * 'FABRIC_E_NODE_NOT_FOUND', 'FABRIC_E_APPLICATION_TYPE_NOT_FOUND',
     * 'FABRIC_E_APPLICATION_NOT_FOUND', 'FABRIC_E_SERVICE_TYPE_NOT_FOUND',
     * 'FABRIC_E_SERVICE_DOES_NOT_EXIST',
     * 'FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND',
     * 'FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND',
     * 'FABRIC_E_PARTITION_NOT_FOUND', 'FABRIC_E_REPLICA_DOES_NOT_EXIST',
     * 'FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST',
     * 'FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND',
     * 'FABRIC_E_DIRECTORY_NOT_FOUND', 'FABRIC_E_FABRIC_VERSION_NOT_FOUND',
     * 'FABRIC_E_FILE_NOT_FOUND', 'FABRIC_E_NAME_DOES_NOT_EXIST',
     * 'FABRIC_E_PROPERTY_DOES_NOT_EXIST', 'FABRIC_E_ENUMERATION_COMPLETED',
     * 'FABRIC_E_SERVICE_MANIFEST_NOT_FOUND', 'FABRIC_E_KEY_NOT_FOUND',
     * 'FABRIC_E_HEALTH_ENTITY_NOT_FOUND',
     * 'FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS',
     * 'FABRIC_E_APPLICATION_ALREADY_EXISTS',
     * 'FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION',
     * 'FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS',
     * 'FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS',
     * 'FABRIC_E_SERVICE_ALREADY_EXISTS',
     * 'FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS',
     * 'FABRIC_E_APPLICATION_TYPE_IN_USE',
     * 'FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION',
     * 'FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS',
     * 'FABRIC_E_FABRIC_VERSION_IN_USE', 'FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS',
     * 'FABRIC_E_NAME_ALREADY_EXISTS', 'FABRIC_E_NAME_NOT_EMPTY',
     * 'FABRIC_E_PROPERTY_CHECK_FAILED', 'FABRIC_E_SERVICE_METADATA_MISMATCH',
     * 'FABRIC_E_SERVICE_TYPE_MISMATCH', 'FABRIC_E_HEALTH_STALE_REPORT',
     * 'FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED',
     * 'FABRIC_E_NODE_HAS_NOT_STOPPED_YET', 'FABRIC_E_INSTANCE_ID_MISMATCH',
     * 'FABRIC_E_VALUE_TOO_LARGE', 'FABRIC_E_NO_WRITE_QUORUM',
     * 'FABRIC_E_NOT_PRIMARY', 'FABRIC_E_NOT_READY',
     * 'FABRIC_E_RECONFIGURATION_PENDING', 'FABRIC_E_SERVICE_OFFLINE',
     * 'E_ABORT', 'FABRIC_E_COMMUNICATION_ERROR',
     * 'FABRIC_E_OPERATION_NOT_COMPLETE', 'FABRIC_E_TIMEOUT',
     * 'FABRIC_E_NODE_IS_UP', 'E_FAIL', 'FABRIC_E_BACKUP_IS_ENABLED',
     * 'FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH',
     * 'FABRIC_E_INVALID_FOR_STATELESS_SERVICES',
     * 'FABRIC_E_BACKUP_NOT_ENABLED', 'FABRIC_E_BACKUP_POLICY_NOT_EXISTING',
     * 'FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING',
     * 'FABRIC_E_BACKUP_IN_PROGRESS', 'FABRIC_E_RESTORE_IN_PROGRESS',
     * 'FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING',
     * 'FABRIC_E_INVALID_SERVICE_SCALING_POLICY', 'E_INVALIDARG',
     * 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS',
     * 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND',
     * 'FABRIC_E_VOLUME_ALREADY_EXISTS', 'FABRIC_E_VOLUME_NOT_FOUND',
     * 'SerializationError', 'FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR'.
     */
    @JsonProperty(value = "Code", required = true)
    private FabricErrorCodes code;

    /**
     * Error message.
     */
    @JsonProperty(value = "Message")
    private String message;

    /**
     * Get defines the fabric error codes that be returned as part of the error object in response to Service Fabric API operations that are not successful. Following are the error code values that can be returned for a specific HTTP status code.
       - Possible values of the error code for HTTP status code 400 (Bad Request)
         - "FABRIC_E_INVALID_PARTITION_KEY"
         - "FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR"
         - "FABRIC_E_INVALID_ADDRESS"
         - "FABRIC_E_APPLICATION_NOT_UPGRADING"
         - "FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR"
         - "FABRIC_E_FABRIC_NOT_UPGRADING"
         - "FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR"
         - "FABRIC_E_INVALID_CONFIGURATION"
         - "FABRIC_E_INVALID_NAME_URI"
         - "FABRIC_E_PATH_TOO_LONG"
         - "FABRIC_E_KEY_TOO_LARGE"
         - "FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED"
         - "FABRIC_E_INVALID_ATOMIC_GROUP"
         - "FABRIC_E_VALUE_EMPTY"
         - "FABRIC_E_BACKUP_IS_ENABLED"
         - "FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH"
         - "FABRIC_E_INVALID_FOR_STATELESS_SERVICES"
         - "FABRIC_E_INVALID_SERVICE_SCALING_POLICY"
         - "E_INVALIDARG"
       - Possible values of the error code for HTTP status code 404 (Not Found)
         - "FABRIC_E_NODE_NOT_FOUND"
         - "FABRIC_E_APPLICATION_TYPE_NOT_FOUND"
         - "FABRIC_E_APPLICATION_NOT_FOUND"
         - "FABRIC_E_SERVICE_TYPE_NOT_FOUND"
         - "FABRIC_E_SERVICE_DOES_NOT_EXIST"
         - "FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND"
         - "FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND"
         - "FABRIC_E_PARTITION_NOT_FOUND"
         - "FABRIC_E_REPLICA_DOES_NOT_EXIST"
         - "FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST"
         - "FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND"
         - "FABRIC_E_DIRECTORY_NOT_FOUND"
         - "FABRIC_E_FABRIC_VERSION_NOT_FOUND"
         - "FABRIC_E_FILE_NOT_FOUND"
         - "FABRIC_E_NAME_DOES_NOT_EXIST"
         - "FABRIC_E_PROPERTY_DOES_NOT_EXIST"
         - "FABRIC_E_ENUMERATION_COMPLETED"
         - "FABRIC_E_SERVICE_MANIFEST_NOT_FOUND"
         - "FABRIC_E_KEY_NOT_FOUND"
         - "FABRIC_E_HEALTH_ENTITY_NOT_FOUND"
         - "FABRIC_E_BACKUP_NOT_ENABLED"
         - "FABRIC_E_BACKUP_POLICY_NOT_EXISTING"
         - "FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING"
         - "FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR"
       - Possible values of the error code for HTTP status code 409 (Conflict)
         - "FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION"
         - "FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS"
         - "FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS"
         - "FABRIC_E_SERVICE_ALREADY_EXISTS"
         - "FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_TYPE_IN_USE"
         - "FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION"
         - "FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS"
         - "FABRIC_E_FABRIC_VERSION_IN_USE"
         - "FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS"
         - "FABRIC_E_NAME_ALREADY_EXISTS"
         - "FABRIC_E_NAME_NOT_EMPTY"
         - "FABRIC_E_PROPERTY_CHECK_FAILED"
         - "FABRIC_E_SERVICE_METADATA_MISMATCH"
         - "FABRIC_E_SERVICE_TYPE_MISMATCH"
         - "FABRIC_E_HEALTH_STALE_REPORT"
         - "FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED"
         - "FABRIC_E_NODE_HAS_NOT_STOPPED_YET"
         - "FABRIC_E_INSTANCE_ID_MISMATCH"
         - "FABRIC_E_BACKUP_IN_PROGRESS"
         - "FABRIC_E_RESTORE_IN_PROGRESS"
         - "FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING"
       - Possible values of the error code for HTTP status code 413 (Request Entity Too Large)
         - "FABRIC_E_VALUE_TOO_LARGE"
       - Possible values of the error code for HTTP status code 500 (Internal Server Error)
         - "FABRIC_E_NODE_IS_UP"
         - "E_FAIL"
         - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS"
         - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND"
         - "FABRIC_E_VOLUME_ALREADY_EXISTS"
         - "ABRIC_E_VOLUME_NOT_FOUND"
         - "SerializationError"
       - Possible values of the error code for HTTP status code 503 (Service Unavailable)
         - "FABRIC_E_NO_WRITE_QUORUM"
         - "FABRIC_E_NOT_PRIMARY"
         - "FABRIC_E_NOT_READY"
         - "FABRIC_E_RECONFIGURATION_PENDING"
         - "FABRIC_E_SERVICE_OFFLINE"
         - "E_ABORT"
         - "FABRIC_E_VALUE_TOO_LARGE"
       - Possible values of the error code for HTTP status code 504 (Gateway Timeout)
         - "FABRIC_E_COMMUNICATION_ERROR"
         - "FABRIC_E_OPERATION_NOT_COMPLETE"
         - "FABRIC_E_TIMEOUT". Possible values include: 'FABRIC_E_INVALID_PARTITION_KEY', 'FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR', 'FABRIC_E_INVALID_ADDRESS', 'FABRIC_E_APPLICATION_NOT_UPGRADING', 'FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR', 'FABRIC_E_FABRIC_NOT_UPGRADING', 'FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR', 'FABRIC_E_INVALID_CONFIGURATION', 'FABRIC_E_INVALID_NAME_URI', 'FABRIC_E_PATH_TOO_LONG', 'FABRIC_E_KEY_TOO_LARGE', 'FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED', 'FABRIC_E_INVALID_ATOMIC_GROUP', 'FABRIC_E_VALUE_EMPTY', 'FABRIC_E_NODE_NOT_FOUND', 'FABRIC_E_APPLICATION_TYPE_NOT_FOUND', 'FABRIC_E_APPLICATION_NOT_FOUND', 'FABRIC_E_SERVICE_TYPE_NOT_FOUND', 'FABRIC_E_SERVICE_DOES_NOT_EXIST', 'FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND', 'FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND', 'FABRIC_E_PARTITION_NOT_FOUND', 'FABRIC_E_REPLICA_DOES_NOT_EXIST', 'FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST', 'FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND', 'FABRIC_E_DIRECTORY_NOT_FOUND', 'FABRIC_E_FABRIC_VERSION_NOT_FOUND', 'FABRIC_E_FILE_NOT_FOUND', 'FABRIC_E_NAME_DOES_NOT_EXIST', 'FABRIC_E_PROPERTY_DOES_NOT_EXIST', 'FABRIC_E_ENUMERATION_COMPLETED', 'FABRIC_E_SERVICE_MANIFEST_NOT_FOUND', 'FABRIC_E_KEY_NOT_FOUND', 'FABRIC_E_HEALTH_ENTITY_NOT_FOUND', 'FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION', 'FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS', 'FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS', 'FABRIC_E_SERVICE_ALREADY_EXISTS', 'FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_TYPE_IN_USE', 'FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION', 'FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS', 'FABRIC_E_FABRIC_VERSION_IN_USE', 'FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS', 'FABRIC_E_NAME_ALREADY_EXISTS', 'FABRIC_E_NAME_NOT_EMPTY', 'FABRIC_E_PROPERTY_CHECK_FAILED', 'FABRIC_E_SERVICE_METADATA_MISMATCH', 'FABRIC_E_SERVICE_TYPE_MISMATCH', 'FABRIC_E_HEALTH_STALE_REPORT', 'FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED', 'FABRIC_E_NODE_HAS_NOT_STOPPED_YET', 'FABRIC_E_INSTANCE_ID_MISMATCH', 'FABRIC_E_VALUE_TOO_LARGE', 'FABRIC_E_NO_WRITE_QUORUM', 'FABRIC_E_NOT_PRIMARY', 'FABRIC_E_NOT_READY', 'FABRIC_E_RECONFIGURATION_PENDING', 'FABRIC_E_SERVICE_OFFLINE', 'E_ABORT', 'FABRIC_E_COMMUNICATION_ERROR', 'FABRIC_E_OPERATION_NOT_COMPLETE', 'FABRIC_E_TIMEOUT', 'FABRIC_E_NODE_IS_UP', 'E_FAIL', 'FABRIC_E_BACKUP_IS_ENABLED', 'FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH', 'FABRIC_E_INVALID_FOR_STATELESS_SERVICES', 'FABRIC_E_BACKUP_NOT_ENABLED', 'FABRIC_E_BACKUP_POLICY_NOT_EXISTING', 'FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING', 'FABRIC_E_BACKUP_IN_PROGRESS', 'FABRIC_E_RESTORE_IN_PROGRESS', 'FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING', 'FABRIC_E_INVALID_SERVICE_SCALING_POLICY', 'E_INVALIDARG', 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS', 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND', 'FABRIC_E_VOLUME_ALREADY_EXISTS', 'FABRIC_E_VOLUME_NOT_FOUND', 'SerializationError', 'FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR'.
     *
     * @return the code value
     */
    public FabricErrorCodes code() {
        return this.code;
    }

    /**
     * Set defines the fabric error codes that be returned as part of the error object in response to Service Fabric API operations that are not successful. Following are the error code values that can be returned for a specific HTTP status code.
       - Possible values of the error code for HTTP status code 400 (Bad Request)
         - "FABRIC_E_INVALID_PARTITION_KEY"
         - "FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR"
         - "FABRIC_E_INVALID_ADDRESS"
         - "FABRIC_E_APPLICATION_NOT_UPGRADING"
         - "FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR"
         - "FABRIC_E_FABRIC_NOT_UPGRADING"
         - "FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR"
         - "FABRIC_E_INVALID_CONFIGURATION"
         - "FABRIC_E_INVALID_NAME_URI"
         - "FABRIC_E_PATH_TOO_LONG"
         - "FABRIC_E_KEY_TOO_LARGE"
         - "FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED"
         - "FABRIC_E_INVALID_ATOMIC_GROUP"
         - "FABRIC_E_VALUE_EMPTY"
         - "FABRIC_E_BACKUP_IS_ENABLED"
         - "FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH"
         - "FABRIC_E_INVALID_FOR_STATELESS_SERVICES"
         - "FABRIC_E_INVALID_SERVICE_SCALING_POLICY"
         - "E_INVALIDARG"
       - Possible values of the error code for HTTP status code 404 (Not Found)
         - "FABRIC_E_NODE_NOT_FOUND"
         - "FABRIC_E_APPLICATION_TYPE_NOT_FOUND"
         - "FABRIC_E_APPLICATION_NOT_FOUND"
         - "FABRIC_E_SERVICE_TYPE_NOT_FOUND"
         - "FABRIC_E_SERVICE_DOES_NOT_EXIST"
         - "FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND"
         - "FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND"
         - "FABRIC_E_PARTITION_NOT_FOUND"
         - "FABRIC_E_REPLICA_DOES_NOT_EXIST"
         - "FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST"
         - "FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND"
         - "FABRIC_E_DIRECTORY_NOT_FOUND"
         - "FABRIC_E_FABRIC_VERSION_NOT_FOUND"
         - "FABRIC_E_FILE_NOT_FOUND"
         - "FABRIC_E_NAME_DOES_NOT_EXIST"
         - "FABRIC_E_PROPERTY_DOES_NOT_EXIST"
         - "FABRIC_E_ENUMERATION_COMPLETED"
         - "FABRIC_E_SERVICE_MANIFEST_NOT_FOUND"
         - "FABRIC_E_KEY_NOT_FOUND"
         - "FABRIC_E_HEALTH_ENTITY_NOT_FOUND"
         - "FABRIC_E_BACKUP_NOT_ENABLED"
         - "FABRIC_E_BACKUP_POLICY_NOT_EXISTING"
         - "FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING"
         - "FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR"
       - Possible values of the error code for HTTP status code 409 (Conflict)
         - "FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION"
         - "FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS"
         - "FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS"
         - "FABRIC_E_SERVICE_ALREADY_EXISTS"
         - "FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS"
         - "FABRIC_E_APPLICATION_TYPE_IN_USE"
         - "FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION"
         - "FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS"
         - "FABRIC_E_FABRIC_VERSION_IN_USE"
         - "FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS"
         - "FABRIC_E_NAME_ALREADY_EXISTS"
         - "FABRIC_E_NAME_NOT_EMPTY"
         - "FABRIC_E_PROPERTY_CHECK_FAILED"
         - "FABRIC_E_SERVICE_METADATA_MISMATCH"
         - "FABRIC_E_SERVICE_TYPE_MISMATCH"
         - "FABRIC_E_HEALTH_STALE_REPORT"
         - "FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED"
         - "FABRIC_E_NODE_HAS_NOT_STOPPED_YET"
         - "FABRIC_E_INSTANCE_ID_MISMATCH"
         - "FABRIC_E_BACKUP_IN_PROGRESS"
         - "FABRIC_E_RESTORE_IN_PROGRESS"
         - "FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING"
       - Possible values of the error code for HTTP status code 413 (Request Entity Too Large)
         - "FABRIC_E_VALUE_TOO_LARGE"
       - Possible values of the error code for HTTP status code 500 (Internal Server Error)
         - "FABRIC_E_NODE_IS_UP"
         - "E_FAIL"
         - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS"
         - "FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND"
         - "FABRIC_E_VOLUME_ALREADY_EXISTS"
         - "ABRIC_E_VOLUME_NOT_FOUND"
         - "SerializationError"
       - Possible values of the error code for HTTP status code 503 (Service Unavailable)
         - "FABRIC_E_NO_WRITE_QUORUM"
         - "FABRIC_E_NOT_PRIMARY"
         - "FABRIC_E_NOT_READY"
         - "FABRIC_E_RECONFIGURATION_PENDING"
         - "FABRIC_E_SERVICE_OFFLINE"
         - "E_ABORT"
         - "FABRIC_E_VALUE_TOO_LARGE"
       - Possible values of the error code for HTTP status code 504 (Gateway Timeout)
         - "FABRIC_E_COMMUNICATION_ERROR"
         - "FABRIC_E_OPERATION_NOT_COMPLETE"
         - "FABRIC_E_TIMEOUT". Possible values include: 'FABRIC_E_INVALID_PARTITION_KEY', 'FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR', 'FABRIC_E_INVALID_ADDRESS', 'FABRIC_E_APPLICATION_NOT_UPGRADING', 'FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR', 'FABRIC_E_FABRIC_NOT_UPGRADING', 'FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR', 'FABRIC_E_INVALID_CONFIGURATION', 'FABRIC_E_INVALID_NAME_URI', 'FABRIC_E_PATH_TOO_LONG', 'FABRIC_E_KEY_TOO_LARGE', 'FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED', 'FABRIC_E_INVALID_ATOMIC_GROUP', 'FABRIC_E_VALUE_EMPTY', 'FABRIC_E_NODE_NOT_FOUND', 'FABRIC_E_APPLICATION_TYPE_NOT_FOUND', 'FABRIC_E_APPLICATION_NOT_FOUND', 'FABRIC_E_SERVICE_TYPE_NOT_FOUND', 'FABRIC_E_SERVICE_DOES_NOT_EXIST', 'FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND', 'FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND', 'FABRIC_E_PARTITION_NOT_FOUND', 'FABRIC_E_REPLICA_DOES_NOT_EXIST', 'FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST', 'FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND', 'FABRIC_E_DIRECTORY_NOT_FOUND', 'FABRIC_E_FABRIC_VERSION_NOT_FOUND', 'FABRIC_E_FILE_NOT_FOUND', 'FABRIC_E_NAME_DOES_NOT_EXIST', 'FABRIC_E_PROPERTY_DOES_NOT_EXIST', 'FABRIC_E_ENUMERATION_COMPLETED', 'FABRIC_E_SERVICE_MANIFEST_NOT_FOUND', 'FABRIC_E_KEY_NOT_FOUND', 'FABRIC_E_HEALTH_ENTITY_NOT_FOUND', 'FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION', 'FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS', 'FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS', 'FABRIC_E_SERVICE_ALREADY_EXISTS', 'FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS', 'FABRIC_E_APPLICATION_TYPE_IN_USE', 'FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION', 'FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS', 'FABRIC_E_FABRIC_VERSION_IN_USE', 'FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS', 'FABRIC_E_NAME_ALREADY_EXISTS', 'FABRIC_E_NAME_NOT_EMPTY', 'FABRIC_E_PROPERTY_CHECK_FAILED', 'FABRIC_E_SERVICE_METADATA_MISMATCH', 'FABRIC_E_SERVICE_TYPE_MISMATCH', 'FABRIC_E_HEALTH_STALE_REPORT', 'FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED', 'FABRIC_E_NODE_HAS_NOT_STOPPED_YET', 'FABRIC_E_INSTANCE_ID_MISMATCH', 'FABRIC_E_VALUE_TOO_LARGE', 'FABRIC_E_NO_WRITE_QUORUM', 'FABRIC_E_NOT_PRIMARY', 'FABRIC_E_NOT_READY', 'FABRIC_E_RECONFIGURATION_PENDING', 'FABRIC_E_SERVICE_OFFLINE', 'E_ABORT', 'FABRIC_E_COMMUNICATION_ERROR', 'FABRIC_E_OPERATION_NOT_COMPLETE', 'FABRIC_E_TIMEOUT', 'FABRIC_E_NODE_IS_UP', 'E_FAIL', 'FABRIC_E_BACKUP_IS_ENABLED', 'FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH', 'FABRIC_E_INVALID_FOR_STATELESS_SERVICES', 'FABRIC_E_BACKUP_NOT_ENABLED', 'FABRIC_E_BACKUP_POLICY_NOT_EXISTING', 'FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING', 'FABRIC_E_BACKUP_IN_PROGRESS', 'FABRIC_E_RESTORE_IN_PROGRESS', 'FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING', 'FABRIC_E_INVALID_SERVICE_SCALING_POLICY', 'E_INVALIDARG', 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS', 'FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND', 'FABRIC_E_VOLUME_ALREADY_EXISTS', 'FABRIC_E_VOLUME_NOT_FOUND', 'SerializationError', 'FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR'.
     *
     * @param code the code value to set
     * @return the FabricErrorError object itself.
     */
    public FabricErrorError withCode(FabricErrorCodes code) {
        this.code = code;
        return this;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message.
     *
     * @param message the message value to set
     * @return the FabricErrorError object itself.
     */
    public FabricErrorError withMessage(String message) {
        this.message = message;
        return this;
    }

}
