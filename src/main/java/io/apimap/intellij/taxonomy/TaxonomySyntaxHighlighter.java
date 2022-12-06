package io.apimap.intellij.taxonomy;

import com.intellij.lexer.Lexer;
import io.apimap.intellij.ApimapSyntaxHighlighter;
import io.apimap.intellij.taxonomy.lex.TaxonomyLexerAdapter;
import org.jetbrains.annotations.NotNull;

public class TaxonomySyntaxHighlighter extends ApimapSyntaxHighlighter {
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new TaxonomyLexerAdapter();
    }
}