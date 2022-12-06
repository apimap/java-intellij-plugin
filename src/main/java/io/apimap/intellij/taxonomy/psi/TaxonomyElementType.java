package io.apimap.intellij.taxonomy.psi;

import com.intellij.psi.tree.IElementType;
import io.apimap.intellij.taxonomy.TaxonomyLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TaxonomyElementType extends IElementType {
    public TaxonomyElementType(@NotNull @NonNls String debugName) {
        super(debugName, TaxonomyLanguage.INSTANCE);
    }
}
