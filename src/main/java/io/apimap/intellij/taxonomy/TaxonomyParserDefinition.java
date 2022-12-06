package io.apimap.intellij.taxonomy;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.apimap.intellij.taxonomy.lex.TaxonomyLexerAdapter;
import io.apimap.intellij.taxonomy.psi.TaxonomyFile;
import io.apimap.intellij.taxonomy.psi.TaxonomyTypes;
import org.jetbrains.annotations.NotNull;

public class TaxonomyParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(TaxonomyLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TaxonomyLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new io.apimap.intellij.taxonomy.ApimapTaxonomyParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.WHITE_SPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return TaxonomyTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new TaxonomyFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
