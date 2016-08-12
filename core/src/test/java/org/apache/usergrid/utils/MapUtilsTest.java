/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.usergrid.utils;


import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MapUtilsTest {

    private static final Logger LOG = LoggerFactory.getLogger( MapUtilsTest.class );


    @Test
    public void testMapUtils() {

        Map<String, ?> map = MapUtils.putPath( "a.b.c", 5 );
        LOG.info( JsonUtils.mapToFormattedJsonString( map ) );

        map = MapUtils.putPath( map, "a.c", 6 );
        LOG.info( JsonUtils.mapToFormattedJsonString( map ) );
    }
}
