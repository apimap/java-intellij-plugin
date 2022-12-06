package io.apimap.intellij.metadata;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import io.apimap.intellij.ApimapIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MetadataFileType extends LanguageFileType {
    public static final MetadataFileType INSTANCE = new MetadataFileType();
    public static final String DEFAULT_EXTENSION = "apimap";

    public MetadataFileType(){
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
