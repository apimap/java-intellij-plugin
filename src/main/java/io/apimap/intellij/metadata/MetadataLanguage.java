package io.apimap.intellij.metadata;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetadataLanguage extends Language {
    public static final MetadataLanguage INSTANCE = new MetadataLanguage();

    private MetadataLanguage() {
        super("Apimap.io Metadata");
    }

    protected MetadataLanguage(@NotNull String ID) {
        super(ID);
    }

    protected MetadataLanguage(@NotNull String ID, @NotNull String... mimeTypes) {
        super(ID, mimeTypes);
    }

    protected MetadataLanguage(@Nullable Language baseLanguage, @NotNull String ID, @NotNull String... mimeTypes) {
        super(baseLanguage, ID, mimeTypes);
    }

    protected MetadataLanguage(@NotNull String ID, boolean register) {
        super(ID, register);
    }
}