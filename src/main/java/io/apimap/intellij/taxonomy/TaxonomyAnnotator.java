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

package io.apimap.intellij.taxonomy;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxonomyAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        final PsiFile file = element.getContainingFile();
        final PsiElement currentElement = file.findElementAt(element.getTextOffset());

        final ArrayList<String> allowedOptions = new ArrayList<>() {{
            add("classifications");
            add("taxonomy");
        }};

        if(element instanceof PsiErrorElementImpl){
            holder.newAnnotation(HighlightSeverity.ERROR, "JSON syntax error")
                .highlightType(ProblemHighlightType.ERROR)
                .create();
        }

        if (currentElement != null
            && currentElement.getParent() instanceof io.apimap.intellij.taxonomy.psi.impl.ApimapTaxonomyDataImpl) {
            List<String> unknownProperties = Arrays.stream(currentElement.getParent().getChildren())
                .flatMap(child -> Arrays.stream(child.getChildren()).filter(e -> e instanceof io.apimap.intellij.taxonomy.psi.impl.ApimapTaxonomyDataAttributeOptionImpl))
                .map(child -> {
                    System.out.println(child
                    );
                    return child.getText();
                })
                .filter(text -> !allowedOptions.contains(text))
                .toList();

            if (unknownProperties.size() > 0) {
                holder.newAnnotation(HighlightSeverity.WEAK_WARNING, "Illegal properties found: " + unknownProperties)
                    .highlightType(ProblemHighlightType.WEAK_WARNING)
                    .create();
            }

            List<String> missingProperties = allowedOptions.stream()
                .filter(e -> !Arrays.stream(currentElement.getParent().getChildren())
                    .flatMap(child -> Arrays.stream(child.getChildren()).filter(children -> children instanceof io.apimap.intellij.taxonomy.psi.impl.ApimapTaxonomyDataAttributeOptionImpl))
                    .map(PsiElement::getText)
                    .toList()
                    .contains(e))
                .toList();

            if (missingProperties.size() > 0) {
                holder.newAnnotation(HighlightSeverity.ERROR, "The following required properties where missing: " + missingProperties)
                    .highlightType(ProblemHighlightType.ERROR)
                    .create();
            }
        }

        if (currentElement != null
            && currentElement.getParent() instanceof io.apimap.intellij.taxonomy.psi.impl.ApimapTaxonomyContentVersionImpl) {
            if (!currentElement.getText().equals("1")) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Only version 1 is supported by this plugin")
                    .highlightType(ProblemHighlightType.ERROR)
                    .create();
            }
        }

        if (currentElement != null
            && currentElement.getParent() instanceof io.apimap.intellij.taxonomy.psi.impl.ApimapTaxonomyDataAttributeOptionImpl) {
            if (allowedOptions.stream().noneMatch(e -> e.equals(currentElement.getText()))) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Only the following values are allowed: " + allowedOptions)
                    .highlightType(ProblemHighlightType.ERROR)
                    .create();
            }
        }
    }
}