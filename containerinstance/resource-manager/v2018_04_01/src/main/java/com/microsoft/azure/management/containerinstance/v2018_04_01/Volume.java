/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the volume.
 */
public class Volume {
    /**
     * The name of the volume.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The Azure File volume.
     */
    @JsonProperty(value = "azureFile")
    private AzureFileVolume azureFile;

    /**
     * The empty directory volume.
     */
    @JsonProperty(value = "emptyDir")
    private Object emptyDir;

    /**
     * The secret volume.
     */
    @JsonProperty(value = "secret")
    private Map<String, String> secret;

    /**
     * The git repo volume.
     */
    @JsonProperty(value = "gitRepo")
    private GitRepoVolume gitRepo;

    /**
     * Get the name of the volume.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the volume.
     *
     * @param name the name value to set
     * @return the Volume object itself.
     */
    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the Azure File volume.
     *
     * @return the azureFile value
     */
    public AzureFileVolume azureFile() {
        return this.azureFile;
    }

    /**
     * Set the Azure File volume.
     *
     * @param azureFile the azureFile value to set
     * @return the Volume object itself.
     */
    public Volume withAzureFile(AzureFileVolume azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    /**
     * Get the empty directory volume.
     *
     * @return the emptyDir value
     */
    public Object emptyDir() {
        return this.emptyDir;
    }

    /**
     * Set the empty directory volume.
     *
     * @param emptyDir the emptyDir value to set
     * @return the Volume object itself.
     */
    public Volume withEmptyDir(Object emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    /**
     * Get the secret volume.
     *
     * @return the secret value
     */
    public Map<String, String> secret() {
        return this.secret;
    }

    /**
     * Set the secret volume.
     *
     * @param secret the secret value to set
     * @return the Volume object itself.
     */
    public Volume withSecret(Map<String, String> secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get the git repo volume.
     *
     * @return the gitRepo value
     */
    public GitRepoVolume gitRepo() {
        return this.gitRepo;
    }

    /**
     * Set the git repo volume.
     *
     * @param gitRepo the gitRepo value to set
     * @return the Volume object itself.
     */
    public Volume withGitRepo(GitRepoVolume gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }

}
