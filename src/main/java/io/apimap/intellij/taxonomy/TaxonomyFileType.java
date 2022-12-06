package io.apimap.intellij.taxonomy;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import io.apimap.intellij.ApimapIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TaxonomyFileType extends LanguageFileType {
    public static final TaxonomyFileType INSTANCE = new TaxonomyFileType();
    public static final String DEFAULT_EXTENSION = "apimap";

    public TaxonomyFileType(){
        super(TaxonomyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Apimap.io Taxonomy File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Apimap.io taxonomy definition";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ApimapIcons.TAXONOMY;
    }
}
