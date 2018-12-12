/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceCertificateOrderInner;

/**
 * Type representing AppServiceCertificateOrder.
 */
public interface AppServiceCertificateOrder extends HasInner<AppServiceCertificateOrderInner>, Resource, GroupableResourceCore<AppServiceManager, AppServiceCertificateOrderInner>, HasResourceGroup, Refreshable<AppServiceCertificateOrder>, Updatable<AppServiceCertificateOrder.Update>, HasManager<AppServiceManager> {
    /**
     * @return the appServiceCertificateNotRenewableReasons value.
     */
    List<String> appServiceCertificateNotRenewableReasons();

    /**
     * @return the autoRenew value.
     */
    Boolean autoRenew();

    /**
     * @return the certificates value.
     */
    Map<String, AppServiceCertificate> certificates();

    /**
     * @return the csr value.
     */
    String csr();

    /**
     * @return the distinguishedName value.
     */
    String distinguishedName();

    /**
     * @return the domainVerificationToken value.
     */
    String domainVerificationToken();

    /**
     * @return the expirationTime value.
     */
    DateTime expirationTime();

    /**
     * @return the intermediate value.
     */
    CertificateDetails intermediate();

    /**
     * @return the isPrivateKeyExternal value.
     */
    Boolean isPrivateKeyExternal();

    /**
     * @return the keySize value.
     */
    Integer keySize();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastCertificateIssuanceTime value.
     */
    DateTime lastCertificateIssuanceTime();

    /**
     * @return the nextAutoRenewalTimeStamp value.
     */
    DateTime nextAutoRenewalTimeStamp();

    /**
     * @return the productType value.
     */
    CertificateProductType productType();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the root value.
     */
    CertificateDetails root();

    /**
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * @return the signedCertificate value.
     */
    CertificateDetails signedCertificate();

    /**
     * @return the status value.
     */
    CertificateOrderStatus status();

    /**
     * @return the validityInYears value.
     */
    Integer validityInYears();

    /**
     * The entirety of the AppServiceCertificateOrder definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProductType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppServiceCertificateOrder definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppServiceCertificateOrder definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AppServiceCertificateOrder definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProductType> {
        }

        /**
         * The stage of the appservicecertificateorder definition allowing to specify ProductType.
         */
        interface WithProductType {
           /**
            * Specifies productType.
            */
            WithCreate withProductType(CertificateProductType productType);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify AutoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies autoRenew.
             */
            WithCreate withAutoRenew(Boolean autoRenew);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify Certificates.
         */
        interface WithCertificates {
            /**
             * Specifies certificates.
             */
            WithCreate withCertificates(Map<String, AppServiceCertificate> certificates);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify Csr.
         */
        interface WithCsr {
            /**
             * Specifies csr.
             */
            WithCreate withCsr(String csr);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify DistinguishedName.
         */
        interface WithDistinguishedName {
            /**
             * Specifies distinguishedName.
             */
            WithCreate withDistinguishedName(String distinguishedName);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify KeySize.
         */
        interface WithKeySize {
            /**
             * Specifies keySize.
             */
            WithCreate withKeySize(Integer keySize);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appservicecertificateorder update allowing to specify ValidityInYears.
         */
        interface WithValidityInYears {
            /**
             * Specifies validityInYears.
             */
            WithCreate withValidityInYears(Integer validityInYears);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppServiceCertificateOrder>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAutoRenew, DefinitionStages.WithCertificates, DefinitionStages.WithCsr, DefinitionStages.WithDistinguishedName, DefinitionStages.WithKeySize, DefinitionStages.WithKind, DefinitionStages.WithValidityInYears {
        }
    }
    /**
     * The template for a AppServiceCertificateOrder update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppServiceCertificateOrder>, Resource.UpdateWithTags<Update>, UpdateStages.WithAutoRenew, UpdateStages.WithCertificates, UpdateStages.WithCsr, UpdateStages.WithDistinguishedName, UpdateStages.WithKeySize, UpdateStages.WithKind, UpdateStages.WithValidityInYears {
    }

    /**
     * Grouping of AppServiceCertificateOrder update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appservicecertificateorder {0} allowing to specify AutoRenew.
         */
        interface WithAutoRenew {
            /**
             * Specifies autoRenew.
             */
            Update withAutoRenew(Boolean autoRenew);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify Certificates.
         */
        interface WithCertificates {
            /**
             * Specifies certificates.
             */
            Update withCertificates(Map<String, AppServiceCertificate> certificates);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify Csr.
         */
        interface WithCsr {
            /**
             * Specifies csr.
             */
            Update withCsr(String csr);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify DistinguishedName.
         */
        interface WithDistinguishedName {
            /**
             * Specifies distinguishedName.
             */
            Update withDistinguishedName(String distinguishedName);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify KeySize.
         */
        interface WithKeySize {
            /**
             * Specifies keySize.
             */
            Update withKeySize(Integer keySize);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the appservicecertificateorder {0} allowing to specify ValidityInYears.
         */
        interface WithValidityInYears {
            /**
             * Specifies validityInYears.
             */
            Update withValidityInYears(Integer validityInYears);
        }

    }
}
