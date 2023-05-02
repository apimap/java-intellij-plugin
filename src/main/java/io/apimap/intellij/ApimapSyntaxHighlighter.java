/*
Copyright 2021-2023 TELENOR NORGE AS

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
    public static final TextAttributesKey VALUE = createTextAttributesKey("VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NONE = createTextAttributesKey("NONE", DefaultLanguageHighlighterColors.BRACES);

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MetadataTypes.STRINGVALUE)
            || tokenType.equals(MetadataTypes.URLVALUE)
            || tokenType.equals(TaxonomyTypes.CONTENT)
            || tokenType.equals(TaxonomyTypes.URN)) {
            return new TextAttributesKey[]{VALUE};
        }

        return new TextAttributesKey[]{NONE};
    }
}
