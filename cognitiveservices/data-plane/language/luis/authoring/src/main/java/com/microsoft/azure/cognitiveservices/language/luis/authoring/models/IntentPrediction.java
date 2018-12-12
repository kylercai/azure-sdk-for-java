/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A suggested intent.
 */
public class IntentPrediction {
    /**
     * The intent's name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The intent's score, based on the prediction model.
     */
    @JsonProperty(value = "score")
    private Double score;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the IntentPrediction object itself.
     */
    public IntentPrediction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the IntentPrediction object itself.
     */
    public IntentPrediction withScore(Double score) {
        this.score = score;
        return this;
    }

}
