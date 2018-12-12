/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProjectSourcePlatform.
 */
public final class ProjectSourcePlatform extends ExpandableStringEnum<ProjectSourcePlatform> {
    /** Static value SQL for ProjectSourcePlatform. */
    public static final ProjectSourcePlatform SQL = fromString("SQL");

    /** Static value MySQL for ProjectSourcePlatform. */
    public static final ProjectSourcePlatform MY_SQL = fromString("MySQL");

    /** Static value PostgreSql for ProjectSourcePlatform. */
    public static final ProjectSourcePlatform POSTGRE_SQL = fromString("PostgreSql");

    /** Static value MongoDb for ProjectSourcePlatform. */
    public static final ProjectSourcePlatform MONGO_DB = fromString("MongoDb");

    /** Static value Unknown for ProjectSourcePlatform. */
    public static final ProjectSourcePlatform UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a ProjectSourcePlatform from its string representation.
     * @param name a name to look for
     * @return the corresponding ProjectSourcePlatform
     */
    @JsonCreator
    public static ProjectSourcePlatform fromString(String name) {
        return fromString(name, ProjectSourcePlatform.class);
    }

    /**
     * @return known ProjectSourcePlatform values
     */
    public static Collection<ProjectSourcePlatform> values() {
        return values(ProjectSourcePlatform.class);
    }
}
