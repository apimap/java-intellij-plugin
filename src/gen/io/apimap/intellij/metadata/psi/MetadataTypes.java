// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.metadata.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.apimap.intellij.metadata.psi.impl.*;

public interface MetadataTypes {

  IElementType CONTENT = new MetadataElementType("CONTENT");
  IElementType CONTENT_VERSION = new MetadataElementType("CONTENT_VERSION");
  IElementType DATA = new MetadataElementType("DATA");
  IElementType DATA_ATTRIBUTE = new MetadataElementType("DATA_ATTRIBUTE");
  IElementType METADATA_OPTION = new MetadataElementType("METADATA_OPTION");
  IElementType METADATA_VALUE = new MetadataElementType("METADATA_VALUE");
  IElementType METADATA_VALUE_ARRAY = new MetadataElementType("METADATA_VALUE_ARRAY");
  IElementType ROOT = new MetadataElementType("ROOT");

  IElementType COLON = new MetadataTokenType(":");
  IElementType COMMA = new MetadataTokenType(",");
  IElementType DATA_KEY = new MetadataTokenType("data");
  IElementType DOUBLE_QUOTE = new MetadataTokenType("\"");
  IElementType LEFT_BRACE = new MetadataTokenType("{");
  IElementType LEFT_BRACKET = new MetadataTokenType("[");
  IElementType RIGHT_BRACE = new MetadataTokenType("}");
  IElementType RIGHT_BRACKET = new MetadataTokenType("]");
  IElementType SPACE = new MetadataTokenType("space");
  IElementType STRINGVALUE = new MetadataTokenType("stringValue");
  IElementType URLVALUE = new MetadataTokenType("urlValue");
  IElementType VERSION_KEY = new MetadataTokenType("api catalog version");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONTENT) {
        return new ApimapMetadataContentImpl(node);
      }
      else if (type == CONTENT_VERSION) {
        return new ApimapMetadataContentVersionImpl(node);
      }
      else if (type == DATA) {
        return new ApimapMetadataDataImpl(node);
      }
      else if (type == DATA_ATTRIBUTE) {
        return new ApimapMetadataDataAttributeImpl(node);
      }
      else if (type == METADATA_OPTION) {
        return new ApimapMetadataMetadataOptionImpl(node);
      }
      else if (type == METADATA_VALUE) {
        return new ApimapMetadataMetadataValueImpl(node);
      }
      else if (type == METADATA_VALUE_ARRAY) {
        return new ApimapMetadataMetadataValueArrayImpl(node);
      }
      else if (type == ROOT) {
        return new ApimapMetadataRootImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
