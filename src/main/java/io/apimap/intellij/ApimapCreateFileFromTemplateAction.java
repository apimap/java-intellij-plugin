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

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApimapCreateFileFromTemplateAction extends CreateFileFromTemplateAction {

    public ApimapCreateFileFromTemplateAction() {
        super("Apimap Metadata/Taxonomy", "Creates new metadata and/or taxonomy file", ApimapIcons.METADATA);
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder
            .setTitle("New Apimap Metadata/Taxonomy")
            .addKind("Metadata (Recommended name: metadata)", ApimapIcons.METADATA, "Apimap metadata.apimap")
            .addKind("Taxonomy (Recommended name: taxonomy)", ApimapIcons.TAXONOMY, "Apimap taxonomy.apimap");
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return "Create New Apimap Metadata/Taxonomy: " + newName;
    }
}
