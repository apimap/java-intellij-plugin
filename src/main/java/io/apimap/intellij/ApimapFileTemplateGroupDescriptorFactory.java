package io.apimap.intellij;

import com.intellij.ide.fileTemplates.FileTemplateDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory;

public class ApimapFileTemplateGroupDescriptorFactory implements FileTemplateGroupDescriptorFactory {
    public static final String METADATA_APIMAP = "internal/Apimap metadata";
    public static final String TAXONOMY_APIMAP = "internal/Apimap taxonomy";

    @Override
    public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
        FileTemplateGroupDescriptor group = new FileTemplateGroupDescriptor("Apimap.io", ApimapIcons.METADATA);
        group.addTemplate(new FileTemplateDescriptor(METADATA_APIMAP, ApimapIcons.METADATA));
        group.addTemplate(new FileTemplateDescriptor(TAXONOMY_APIMAP, ApimapIcons.TAXONOMY));
        return group;
    }
}
