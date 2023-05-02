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

package io.apimap.intellij.metadata;

import com.intellij.openapi.fileTypes.LanguageFileType;
import io.apimap.intellij.ApimapIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MetadataFileType extends LanguageFileType {
    public static final MetadataFileType INSTANCE = new MetadataFileType();
    public static final String DEFAULT_EXTENSION = "apimap";

    public MetadataFileType() {
        super(MetadataLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Apimap.io Metadata File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Apimap.io metadata definition";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ApimapIcons.METADATA;
    }
}
