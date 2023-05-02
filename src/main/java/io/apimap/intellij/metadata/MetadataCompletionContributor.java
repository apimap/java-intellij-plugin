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

package io.apimap.intellij.metadata;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class MetadataCompletionContributor extends CompletionContributor {
    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        final PsiElement position = parameters.getPosition();
        final PsiFile file = parameters.getOriginalFile();
        final PsiElement element = file.findElementAt(position.getTextOffset());
        final PsiElement context = element.getContext();

        if (context instanceof io.apimap.intellij.metadata.psi.impl.ApimapMetadataMetadataOptionImpl) {
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