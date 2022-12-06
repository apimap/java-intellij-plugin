package io.apimap.intellij;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import io.apimap.intellij.metadata.psi.MetadataTypes;
import io.apimap.intellij.taxonomy.psi.TaxonomyTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public abstract class ApimapSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey VERSION_ID = createTextAttributesKey("VERSION_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey VALUE = createTextAttributesKey("VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NONE = createTextAttributesKey("NONE", DefaultLanguageHighlighterColors.BRACES);


    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MetadataTypes.VERSIONID) || tokenType.equals(TaxonomyTypes.VERSIONID)) {
            return new TextAttributesKey[]{VERSION_ID};
        }

        if (tokenType.equals(MetadataTypes.STRINGVALUE)
                || tokenType.equals(MetadataTypes.URLVALUE)
                || tokenType.equals(TaxonomyTypes.CONTENT)
                || tokenType.equals(TaxonomyTypes.URN)) {
            return new TextAttributesKey[]{VALUE};
        }

        return new TextAttributesKey[]{NONE};
    }
}
