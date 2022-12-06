package io.apimap.intellij.metadata;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class MetadataAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        final PsiFile file = element.getContainingFile();
        final PsiElement element2 = file.findElementAt(element.getTextOffset());
        final PsiElement context = element.getContext();

        holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved property")
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create();
    }
}
