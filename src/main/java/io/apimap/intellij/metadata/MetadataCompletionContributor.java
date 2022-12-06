package io.apimap.intellij.metadata;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import io.apimap.intellij.metadata.psi.ApimapMetadataData;
import io.apimap.intellij.metadata.psi.ApimapMetadataMetadataOption;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class MetadataCompletionContributor extends CompletionContributor {
    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        final PsiElement position = parameters.getPosition();
        final PsiFile file = parameters.getOriginalFile();
        final PsiElement element = file.findElementAt(position.getTextOffset());
        final PsiElement context = element.getContext();

        if(context instanceof io.apimap.intellij.metadata.psi.impl.ApimapMetadataMetadataOptionImpl){
            result.addElement(LookupElementBuilder.create("name"));
            result.addElement(LookupElementBuilder.create("description"));
            result.addElement(LookupElementBuilder.create("visibility"));
            result.addElement(LookupElementBuilder.create("api version"));
            result.addElement(LookupElementBuilder.create("release status"));
            result.addElement(LookupElementBuilder.create("interface specification"));
            result.addElement(LookupElementBuilder.create("interface description language"));
            result.addElement(LookupElementBuilder.create("architecture layer"));
            result.addElement(LookupElementBuilder.create("business unit"));
            result.addElement(LookupElementBuilder.create("system identifier"));
            result.addElement(LookupElementBuilder.create("documentation"));
        }
    }
}