// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.metadata;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.apimap.intellij.metadata.psi.MetadataTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ApimapMetadataParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return FileContent(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ContentDataSection | ContentVersionSection
  public static boolean Content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content")) return false;
    if (!nextTokenIs(builder_, "<content>", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONTENT, "<content>");
    result_ = ContentDataSection(builder_, level_ + 1);
    if (!result_) result_ = ContentVersionSection(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [whitespace] DOUBLE_QUOTE DATA_KEY DOUBLE_QUOTE [whitespace] COLON [whitespace] Data [whitespace]
  static boolean ContentDataSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentDataSection")) return false;
    if (!nextTokenIs(builder_, "", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ContentDataSection_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, DATA_KEY, DOUBLE_QUOTE);
    result_ = result_ && ContentDataSection_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && ContentDataSection_6(builder_, level_ + 1);
    result_ = result_ && Data(builder_, level_ + 1);
    result_ = result_ && ContentDataSection_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [whitespace]
  private static boolean ContentDataSection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentDataSection_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentDataSection_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentDataSection_4")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentDataSection_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentDataSection_6")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentDataSection_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentDataSection_8")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // stringValue
  public static boolean ContentVersion(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersion")) return false;
    if (!nextTokenIs(builder_, STRINGVALUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRINGVALUE);
    exit_section_(builder_, marker_, CONTENT_VERSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // [whitespace] DOUBLE_QUOTE VERSION_KEY DOUBLE_QUOTE [whitespace] COLON [whitespace] DOUBLE_QUOTE ContentVersion DOUBLE_QUOTE [whitespace]
  static boolean ContentVersionSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersionSection")) return false;
    if (!nextTokenIs(builder_, "", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ContentVersionSection_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, VERSION_KEY, DOUBLE_QUOTE);
    result_ = result_ && ContentVersionSection_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && ContentVersionSection_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && ContentVersion(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && ContentVersionSection_10(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [whitespace]
  private static boolean ContentVersionSection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersionSection_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentVersionSection_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersionSection_4")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentVersionSection_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersionSection_6")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean ContentVersionSection_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContentVersionSection_10")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [whitespace] LEFT_BRACE [!RIGHT_BRACE DataAttribute (!RIGHT_BRACE COMMA DataAttribute) *] RIGHT_BRACE
  public static boolean Data(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data")) return false;
    if (!nextTokenIs(builder_, "<data>", LEFT_BRACE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DATA, "<data>");
    result_ = Data_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && Data_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean Data_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [!RIGHT_BRACE DataAttribute (!RIGHT_BRACE COMMA DataAttribute) *]
  private static boolean Data_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2")) return false;
    Data_2_0(builder_, level_ + 1);
    return true;
  }

  // !RIGHT_BRACE DataAttribute (!RIGHT_BRACE COMMA DataAttribute) *
  private static boolean Data_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Data_2_0_0(builder_, level_ + 1);
    result_ = result_ && DataAttribute(builder_, level_ + 1);
    result_ = result_ && Data_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACE
  private static boolean Data_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (!RIGHT_BRACE COMMA DataAttribute) *
  private static boolean Data_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Data_2_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Data_2_0_2", pos_)) break;
    }
    return true;
  }

  // !RIGHT_BRACE COMMA DataAttribute
  private static boolean Data_2_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Data_2_0_2_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && DataAttribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACE
  private static boolean Data_2_0_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Data_2_0_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTE MetadataOption DOUBLE_QUOTE COLON ( MetadataValue |  MetadataValueArray )
  public static boolean DataAttribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttribute")) return false;
    if (!nextTokenIs(builder_, DOUBLE_QUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && MetadataOption(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, COLON);
    result_ = result_ && DataAttribute_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, DATA_ATTRIBUTE, result_);
    return result_;
  }

  // MetadataValue |  MetadataValueArray
  private static boolean DataAttribute_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttribute_4")) return false;
    boolean result_;
    result_ = MetadataValue(builder_, level_ + 1);
    if (!result_) result_ = MetadataValueArray(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACE Root RIGHT_BRACE
  static boolean FileContent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FileContent")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && Root(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [whitespace] stringValue [whitespace]
  public static boolean MetadataOption(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataOption")) return false;
    if (!nextTokenIs(builder_, "<metadata option>", SPACE, STRINGVALUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METADATA_OPTION, "<metadata option>");
    result_ = MetadataOption_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRINGVALUE);
    result_ = result_ && MetadataOption_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean MetadataOption_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataOption_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataOption_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataOption_2")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]
  public static boolean MetadataValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValue")) return false;
    if (!nextTokenIs(builder_, "<metadata value>", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METADATA_VALUE, "<metadata value>");
    result_ = MetadataValue_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && Value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && MetadataValue_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean MetadataValue_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValue_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataValue_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValue_4")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [whitespace] LEFT_BRACKET [!RIGHT_BRACKET [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]) *] [whitespace] RIGHT_BRACKET [whitespace]
  public static boolean MetadataValueArray(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray")) return false;
    if (!nextTokenIs(builder_, "<metadata value array>", LEFT_BRACKET, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METADATA_VALUE_ARRAY, "<metadata value array>");
    result_ = MetadataValueArray_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && MetadataValueArray_2(builder_, level_ + 1);
    result_ = result_ && MetadataValueArray_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    result_ = result_ && MetadataValueArray_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean MetadataValueArray_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [!RIGHT_BRACKET [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]) *]
  private static boolean MetadataValueArray_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2")) return false;
    MetadataValueArray_2_0(builder_, level_ + 1);
    return true;
  }

  // !RIGHT_BRACKET [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]) *
  private static boolean MetadataValueArray_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetadataValueArray_2_0_0(builder_, level_ + 1);
    result_ = result_ && MetadataValueArray_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && Value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && MetadataValueArray_2_0_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACKET
  private static boolean MetadataValueArray_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean MetadataValueArray_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_1")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]) *
  private static boolean MetadataValueArray_2_0_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!MetadataValueArray_2_0_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "MetadataValueArray_2_0_5", pos_)) break;
    }
    return true;
  }

  // !RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE Value DOUBLE_QUOTE [whitespace]
  private static boolean MetadataValueArray_2_0_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = MetadataValueArray_2_0_5_0_0(builder_, level_ + 1);
    result_ = result_ && MetadataValueArray_2_0_5_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && MetadataValueArray_2_0_5_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && Value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOUBLE_QUOTE);
    result_ = result_ && MetadataValueArray_2_0_5_0_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACKET
  private static boolean MetadataValueArray_2_0_5_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean MetadataValueArray_2_0_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5_0_1")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataValueArray_2_0_5_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5_0_3")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataValueArray_2_0_5_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_2_0_5_0_7")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataValueArray_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_3")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean MetadataValueArray_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MetadataValueArray_5")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // Content ( COMMA Content )*
  public static boolean Root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Root")) return false;
    if (!nextTokenIs(builder_, "<root>", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROOT, "<root>");
    result_ = Content(builder_, level_ + 1);
    result_ = result_ && Root_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( COMMA Content )*
  private static boolean Root_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Root_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Root_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Root_1", pos_)) break;
    }
    return true;
  }

  // COMMA Content
  private static boolean Root_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Root_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Content(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // stringValue | urlValue
  static boolean Value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Value")) return false;
    if (!nextTokenIs(builder_, "", STRINGVALUE, URLVALUE)) return false;
    boolean result_;
    result_ = consumeToken(builder_, STRINGVALUE);
    if (!result_) result_ = consumeToken(builder_, URLVALUE);
    return result_;
  }

  /* ********************************************************** */
  // space
  static boolean whitespace(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, SPACE);
  }

}
