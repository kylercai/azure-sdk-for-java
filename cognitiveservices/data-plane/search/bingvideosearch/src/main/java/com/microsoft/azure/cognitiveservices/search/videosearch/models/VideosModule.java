/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.videosearch.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VideosModule model.
 */
public class VideosModule {
    /**
     * The value property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<VideoObject> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<VideoObject> value() {
        return this.value;
    }

}
