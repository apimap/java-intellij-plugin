package io.apimap.intellij.taxonomy.psi;

import com.intellij.psi.tree.IElementType;
import io.apimap.intellij.taxonomy.TaxonomyLanguage;
import org.jetbrains.annotations.NotNull;

public class TaxonomyTokenType extends IElementType {
    public TaxonomyTokenType(@NotNull String debugName) {
        super(debugName, TaxonomyLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TaxonomyTokenType." + super.toString();
    }
}
