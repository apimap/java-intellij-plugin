package io.apimap.intellij.taxonomy;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TaxonomyLanguage extends Language {
    public static final TaxonomyLanguage INSTANCE = new TaxonomyLanguage();

    private TaxonomyLanguage() {
        super("Apimap.io Taxonomy");
    }

    protected TaxonomyLanguage(@NotNull String ID) {
        super(ID);
    }

    protected TaxonomyLanguage(@NotNull String ID, @NotNull String... mimeTypes) {
        super(ID, mimeTypes);
    }

    protected TaxonomyLanguage(@Nullable Language baseLanguage, @NotNull String ID, @NotNull String... mimeTypes) {
        super(baseLanguage, ID, mimeTypes);
    }

    protected TaxonomyLanguage(@NotNull String ID, boolean register) {
        super(ID, register);
    }
}
