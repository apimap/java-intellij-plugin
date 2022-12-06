package io.apimap.intellij.metadata;

import com.intellij.lexer.Lexer;
import io.apimap.intellij.ApimapSyntaxHighlighter;
import io.apimap.intellij.metadata.lex.MetadataLexerAdapter;
import org.jetbrains.annotations.NotNull;

public class MetadataSyntaxHighlighter extends ApimapSyntaxHighlighter {
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new MetadataLexerAdapter();
    }
}
