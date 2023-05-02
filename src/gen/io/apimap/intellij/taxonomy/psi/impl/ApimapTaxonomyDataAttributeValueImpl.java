// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.taxonomy.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.apimap.intellij.taxonomy.psi.TaxonomyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.apimap.intellij.taxonomy.psi.*;

public class ApimapTaxonomyDataAttributeValueImpl extends ASTWrapperPsiElement implements ApimapTaxonomyDataAttributeValue {

  public ApimapTaxonomyDataAttributeValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApimapTaxonomyVisitor visitor) {
    visitor.visitDataAttributeValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApimapTaxonomyVisitor) accept((ApimapTaxonomyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ApimapTaxonomyClassifications getClassifications() {
    return findChildByClass(ApimapTaxonomyClassifications.class);
  }

  @Override
  @Nullable
  public ApimapTaxonomyTaxonomyIdentifier getTaxonomyIdentifier() {
    return findChildByClass(ApimapTaxonomyTaxonomyIdentifier.class);
  }

}
