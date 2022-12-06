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
