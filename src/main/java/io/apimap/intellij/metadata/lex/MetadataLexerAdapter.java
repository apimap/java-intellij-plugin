package io.apimap.intellij.metadata.lex;

import com.intellij.lexer.FlexAdapter;
import main.grammars._ApimapMetadataLexer;

import java.io.Reader;

public class MetadataLexerAdapter extends FlexAdapter {
    public MetadataLexerAdapter() {
        super(new _ApimapMetadataLexer(null));
    }
}