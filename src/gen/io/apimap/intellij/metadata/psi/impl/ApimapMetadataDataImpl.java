// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.metadata.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.apimap.intellij.metadata.psi.MetadataTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.apimap.intellij.metadata.psi.*;

public class ApimapMetadataDataImpl extends ASTWrapperPsiElement implements ApimapMetadataData {

  public ApimapMetadataDataImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApimapMetadataVisitor visitor) {
    visitor.visitData(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApimapMetadataVisitor) accept((ApimapMetadataVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ApimapMetadataDataAttribute> getDataAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ApimapMetadataDataAttribute.class);
  }

  @Override
  @Nullable
  public PsiElement getSpace() {
    return findChildByType(SPACE);
  }

}
