// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.metadata.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import io.apimap.intellij.metadata.mixin.MetadataOptionElement;

public class ApimapMetadataVisitor extends PsiElementVisitor {

  public void visitContent(@NotNull ApimapMetadataContent o) {
    visitPsiElement(o);
  }

  public void visitData(@NotNull ApimapMetadataData o) {
    visitPsiElement(o);
  }

  public void visitDataAttribute(@NotNull ApimapMetadataDataAttribute o) {
    visitMetadataOptionElement(o);
  }

  public void visitMetadataOption(@NotNull ApimapMetadataMetadataOption o) {
    visitPsiElement(o);
  }

  public void visitMetadataValue(@NotNull ApimapMetadataMetadataValue o) {
    visitPsiElement(o);
  }

  public void visitMetadataValueArray(@NotNull ApimapMetadataMetadataValueArray o) {
    visitPsiElement(o);
  }

  public void visitRoot(@NotNull ApimapMetadataRoot o) {
    visitPsiElement(o);
  }

  public void visitMetadataOptionElement(@NotNull MetadataOptionElement o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}