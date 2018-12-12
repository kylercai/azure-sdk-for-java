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
 * Defines values for SqlSourcePlatform.
 */
public final class SqlSourcePlatform extends ExpandableStringEnum<SqlSourcePlatform> {
    /** Static value SqlOnPrem for SqlSourcePlatform. */
    public static final SqlSourcePlatform SQL_ON_PREM = fromString("SqlOnPrem");

    /**
     * Creates or finds a SqlSourcePlatform from its string representation.
     * @param name a name to look for
     * @return the corresponding SqlSourcePlatform
     */
    @JsonCreator
    public static SqlSourcePlatform fromString(String name) {
        return fromString(name, SqlSourcePlatform.class);
    }

    /**
     * @return known SqlSourcePlatform values
     */
    public static Collection<SqlSourcePlatform> values() {
        return values(SqlSourcePlatform.class);
    }
}
