package io.apimap.intellij.metadata.psi;

import com.intellij.psi.tree.IElementType;
import io.apimap.intellij.metadata.MetadataLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MetadataElementType extends IElementType {
    public MetadataElementType(@NotNull @NonNls String debugName) {
        super(debugName, MetadataLanguage.INSTANCE);
    }
}
