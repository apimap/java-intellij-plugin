// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.metadata.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.apimap.intellij.metadata.psi.MetadataTypes.*;
import io.apimap.intellij.metadata.mixin.MetadataOptionElementImpl;
import io.apimap.intellij.metadata.psi.*;

public class ApimapMetadataDataAttributeImpl extends MetadataOptionElementImpl implements ApimapMetadataDataAttribute {

  public ApimapMetadataDataAttributeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ApimapMetadataVisitor visitor) {
    visitor.visitDataAttribute(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApimapMetadataVisitor) accept((ApimapMetadataVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApimapMetadataMetadataOption getMetadataOption() {
    return findNotNullChildByClass(ApimapMetadataMetadataOption.class);
  }

  @Override
  @Nullable
  public ApimapMetadataMetadataValue getMetadataValue() {
    return findChildByClass(ApimapMetadataMetadataValue.class);
  }

  @Override
  @Nullable
  public ApimapMetadataMetadataValueArray getMetadataValueArray() {
    return findChildByClass(ApimapMetadataMetadataValueArray.class);
  }

}
