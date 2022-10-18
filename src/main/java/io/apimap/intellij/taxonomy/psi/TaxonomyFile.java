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

package io.apimap.intellij.taxonomy.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.apimap.intellij.taxonomy.TaxonomyFileType;
import io.apimap.intellij.taxonomy.TaxonomyLanguage;
import org.jetbrains.annotations.NotNull;

public class TaxonomyFile extends PsiFileBase {
    public TaxonomyFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TaxonomyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TaxonomyFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Apimap.io Taxonomy File";
    }
}
