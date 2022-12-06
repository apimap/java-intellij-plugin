package io.apimap.intellij.metadata;

import com.intellij.psi.tree.TokenSet;
import io.apimap.intellij.metadata.psi.MetadataTypes;
import static com.intellij.psi.tree.TokenSet.create;

public interface MetadataTokenSets {
    TokenSet IDENTIFIERS = create(MetadataTypes.METADATA_OPTION);
    TokenSet COMMENTS = TokenSet.EMPTY;

    TokenSet OPTIONS = create(MetadataTypes.METADATA_OPTION, MetadataTypes.METADATA_VALUE, MetadataTypes.METADATA_VALUE_ARRAY);
}