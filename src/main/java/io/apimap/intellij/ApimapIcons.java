/*
Copyright 2021-2023 TELENOR NORGE AS

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package io.apimap.intellij;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ApimapIcons {
    private static final String APIMAP_ICONS_PATH = "/META-INF/";
    public static final Icon METADATA = getIcon("metadataFileIcon.svg");
    public static final Icon TAXONOMY = getIcon("taxonomyFileIcon.svg");

    @NotNull
    private static Icon getIcon(String path) {
        return IconLoader.getIcon(APIMAP_ICONS_PATH + path, ApimapIcons.class);
    }
}
