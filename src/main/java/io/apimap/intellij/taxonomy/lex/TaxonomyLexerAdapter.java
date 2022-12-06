package io.apimap.intellij.taxonomy.lex;

import com.intellij.lexer.FlexAdapter;
import main.grammars._ApimapTaxonomyLexer;

import java.io.Reader;

public class TaxonomyLexerAdapter extends FlexAdapter {
    public TaxonomyLexerAdapter() {
        super(new _ApimapTaxonomyLexer(null));
    }
}
