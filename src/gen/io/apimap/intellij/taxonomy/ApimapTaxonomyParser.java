// This is a generated file. Not intended for manual editing.
package io.apimap.intellij.taxonomy;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.apimap.intellij.taxonomy.psi.TaxonomyTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ApimapTaxonomyParser implements PsiParser, LightPsiParser {

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
  // [whitespace] LEFT_BRACKET [!RIGHT_BRACKET [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE [whitespace]) *] [whitespace] RIGHT_BRACKET [whitespace]
  public static boolean Classifications(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications")) return false;
    if (!nextTokenIs(builder_, "<classifications>", LEFT_BRACKET, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASSIFICATIONS, "<classifications>");
    result_ = Classifications_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && Classifications_2(builder_, level_ + 1);
    result_ = result_ && Classifications_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    result_ = result_ && Classifications_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean Classifications_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [!RIGHT_BRACKET [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE [whitespace]) *]
  private static boolean Classifications_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2")) return false;
    Classifications_2_0(builder_, level_ + 1);
    return true;
  }

  // !RIGHT_BRACKET [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE [whitespace]) *
  private static boolean Classifications_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Classifications_2_0_0(builder_, level_ + 1);
    result_ = result_ && Classifications_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, URN, DOUBLE_QUOTE);
    result_ = result_ && Classifications_2_0_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACKET
  private static boolean Classifications_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean Classifications_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_1")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // (!RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE [whitespace]) *
  private static boolean Classifications_2_0_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Classifications_2_0_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Classifications_2_0_5", pos_)) break;
    }
    return true;
  }

  // !RIGHT_BRACKET [whitespace] COMMA [whitespace] DOUBLE_QUOTE urn DOUBLE_QUOTE [whitespace]
  private static boolean Classifications_2_0_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Classifications_2_0_5_0_0(builder_, level_ + 1);
    result_ = result_ && Classifications_2_0_5_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && Classifications_2_0_5_0_3(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, URN, DOUBLE_QUOTE);
    result_ = result_ && Classifications_2_0_5_0_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !RIGHT_BRACKET
  private static boolean Classifications_2_0_5_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean Classifications_2_0_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5_0_1")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean Classifications_2_0_5_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5_0_3")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean Classifications_2_0_5_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_2_0_5_0_7")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean Classifications_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_3")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean Classifications_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Classifications_5")) return false;
    whitespace(builder_, level_ + 1);
    return true;
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
  // [whitespace] DOUBLE_QUOTE VERSION_KEY DOUBLE_QUOTE [whitespace] COLON [whitespace] DOUBLE_QUOTE VERSIONID DOUBLE_QUOTE [whitespace]
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
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, VERSIONID, DOUBLE_QUOTE);
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
  // DataAttributeOption COLON DataAttributeValue
  public static boolean DataAttribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttribute")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DATA_ATTRIBUTE, "<data attribute>");
    result_ = DataAttributeOption(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && DataAttributeValue(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [whitespace] ('"classifications"' | '"taxonomy"') [whitespace]
  public static boolean DataAttributeOption(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeOption")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DATA_ATTRIBUTE_OPTION, "<data attribute option>");
    result_ = DataAttributeOption_0(builder_, level_ + 1);
    result_ = result_ && DataAttributeOption_1(builder_, level_ + 1);
    result_ = result_ && DataAttributeOption_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean DataAttributeOption_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeOption_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // '"classifications"' | '"taxonomy"'
  private static boolean DataAttributeOption_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeOption_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "\"classifications\"");
    if (!result_) result_ = consumeToken(builder_, "\"taxonomy\"");
    return result_;
  }

  // [whitespace]
  private static boolean DataAttributeOption_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeOption_2")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [whitespace] ( TaxonomyIdentifier | Classifications ) [whitespace]
  public static boolean DataAttributeValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DATA_ATTRIBUTE_VALUE, "<data attribute value>");
    result_ = DataAttributeValue_0(builder_, level_ + 1);
    result_ = result_ && DataAttributeValue_1(builder_, level_ + 1);
    result_ = result_ && DataAttributeValue_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean DataAttributeValue_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeValue_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // TaxonomyIdentifier | Classifications
  private static boolean DataAttributeValue_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeValue_1")) return false;
    boolean result_;
    result_ = TaxonomyIdentifier(builder_, level_ + 1);
    if (!result_) result_ = Classifications(builder_, level_ + 1);
    return result_;
  }

  // [whitespace]
  private static boolean DataAttributeValue_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DataAttributeValue_2")) return false;
    whitespace(builder_, level_ + 1);
    return true;
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
  // Content COMMA Content
  public static boolean Root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Root")) return false;
    if (!nextTokenIs(builder_, "<root>", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROOT, "<root>");
    result_ = Content(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && Content(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [whitespace] DOUBLE_QUOTE identifier DOUBLE_QUOTE [whitespace]
  public static boolean TaxonomyIdentifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TaxonomyIdentifier")) return false;
    if (!nextTokenIs(builder_, "<taxonomy identifier>", DOUBLE_QUOTE, SPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TAXONOMY_IDENTIFIER, "<taxonomy identifier>");
    result_ = TaxonomyIdentifier_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOUBLE_QUOTE, IDENTIFIER, DOUBLE_QUOTE);
    result_ = result_ && TaxonomyIdentifier_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [whitespace]
  private static boolean TaxonomyIdentifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TaxonomyIdentifier_0")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  // [whitespace]
  private static boolean TaxonomyIdentifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TaxonomyIdentifier_4")) return false;
    whitespace(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // space
  static boolean whitespace(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, SPACE);
  }

}
