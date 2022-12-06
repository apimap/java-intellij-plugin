package io.apimap.intellij.metadata.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.apimap.intellij.metadata.MetadataFileType;
import io.apimap.intellij.metadata.MetadataLanguage;
import org.jetbrains.annotations.NotNull;

public class MetadataFile extends PsiFileBase {
    public MetadataFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MetadataLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MetadataFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Apimap.io Metadata File";
    }
}