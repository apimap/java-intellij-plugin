// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.taxonomy.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.apimap.intellij.taxonomy.psi.impl.*;

public interface TaxonomyTypes {

  IElementType CLASSIFICATIONS = new TaxonomyElementType("CLASSIFICATIONS");
  IElementType CONTENT = new TaxonomyElementType("CONTENT");
  IElementType DATA = new TaxonomyElementType("DATA");
  IElementType DATA_ATTRIBUTE = new TaxonomyElementType("DATA_ATTRIBUTE");
  IElementType DATA_ATTRIBUTE_OPTION = new TaxonomyElementType("DATA_ATTRIBUTE_OPTION");
  IElementType DATA_ATTRIBUTE_VALUE = new TaxonomyElementType("DATA_ATTRIBUTE_VALUE");
  IElementType ROOT = new TaxonomyElementType("ROOT");
  IElementType TAXONOMY_IDENTIFIER = new TaxonomyElementType("TAXONOMY_IDENTIFIER");

  IElementType COLON = new TaxonomyTokenType(":");
  IElementType COMMA = new TaxonomyTokenType(",");
  IElementType DATA_KEY = new TaxonomyTokenType("data");
  IElementType DOUBLE_QUOTE = new TaxonomyTokenType("\"");
  IElementType IDENTIFIER = new TaxonomyTokenType("identifier");
  IElementType LEFT_BRACE = new TaxonomyTokenType("{");
  IElementType LEFT_BRACKET = new TaxonomyTokenType("[");
  IElementType RIGHT_BRACE = new TaxonomyTokenType("}");
  IElementType RIGHT_BRACKET = new TaxonomyTokenType("]");
  IElementType SPACE = new TaxonomyTokenType("space");
  IElementType URN = new TaxonomyTokenType("urn");
  IElementType VERSIONID = new TaxonomyTokenType("1");
  IElementType VERSION_KEY = new TaxonomyTokenType("api catalog version");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CLASSIFICATIONS) {
        return new ApimapTaxonomyClassificationsImpl(node);
      }
      else if (type == CONTENT) {
        return new ApimapTaxonomyContentImpl(node);
      }
      else if (type == DATA) {
        return new ApimapTaxonomyDataImpl(node);
      }
      else if (type == DATA_ATTRIBUTE) {
        return new ApimapTaxonomyDataAttributeImpl(node);
      }
      else if (type == DATA_ATTRIBUTE_OPTION) {
        return new ApimapTaxonomyDataAttributeOptionImpl(node);
      }
      else if (type == DATA_ATTRIBUTE_VALUE) {
        return new ApimapTaxonomyDataAttributeValueImpl(node);
      }
      else if (type == ROOT) {
        return new ApimapTaxonomyRootImpl(node);
      }
      else if (type == TAXONOMY_IDENTIFIER) {
        return new ApimapTaxonomyTaxonomyIdentifierImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
