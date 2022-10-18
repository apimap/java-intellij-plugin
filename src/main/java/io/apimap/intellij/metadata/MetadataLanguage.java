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

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetadataLanguage extends Language {
    public static final MetadataLanguage INSTANCE = new MetadataLanguage();

    private MetadataLanguage() {
        super("Apimap.io Metadata");
    }

    protected MetadataLanguage(@NotNull String ID) {
        super(ID);
    }

    protected MetadataLanguage(@NotNull String ID, @NotNull String... mimeTypes) {
        super(ID, mimeTypes);
    }

    protected MetadataLanguage(@Nullable Language baseLanguage, @NotNull String ID, @NotNull String... mimeTypes) {
        super(baseLanguage, ID, mimeTypes);
    }

    protected MetadataLanguage(@NotNull String ID, boolean register) {
        super(ID, register);
    }
}