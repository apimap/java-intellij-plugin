package io.apimap.intellij.metadata.psi;

import com.intellij.psi.tree.IElementType;
import io.apimap.intellij.metadata.MetadataLanguage;
import org.jetbrains.annotations.NotNull;

public class MetadataTokenType extends IElementType {
    public MetadataTokenType(@NotNull String debugName) {
        super(debugName, MetadataLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MetadataTokenType." + super.toString();
    }
}