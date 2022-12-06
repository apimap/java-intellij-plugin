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
