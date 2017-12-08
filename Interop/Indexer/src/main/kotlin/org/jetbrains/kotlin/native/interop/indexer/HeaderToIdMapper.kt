/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.native.interop.indexer

import java.nio.file.Paths

class HeaderToIdMapper(localSysRoot: String?) {
    private val headerPathToId = mutableMapOf<String, HeaderId>()
    private val localSysRoot = localSysRoot?.let { Paths.get(it).normalize() }

    internal fun getHeaderId(filePath: String) = headerPathToId.getOrPut(filePath) {
        val path = Paths.get(filePath)
        val headerIdValue = if (localSysRoot != null && path.startsWith(localSysRoot)) {
            val relative = localSysRoot.relativize(path)
            relative.toString()
        } else {
            headerContentsHash(filePath)
        }
        HeaderId(headerIdValue)
    }
}
