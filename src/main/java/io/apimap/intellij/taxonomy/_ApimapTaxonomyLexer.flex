package io.apimap.intellij.taxonomy;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.apimap.intellij.taxonomy.psi.TaxonomyTypes.*;

%%

%{
  public _ApimapTaxonomyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ApimapTaxonomyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]*
URN=urn:([a-z0-9][a-z0-9-]{0,31}:[a-z0-9A-Z]{0,31})
STRINGVALUE=([\w \\.]+)

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "{"                        { return LEFT_BRACE; }
  "}"                        { return RIGHT_BRACE; }
  ":"                        { return COLON; }
  ","                        { return COMMA; }
  "["                        { return LEFT_BRACKET; }
  "]"                        { return RIGHT_BRACKET; }
  "\""                       { return DOUBLE_QUOTE; }
  "data"                     { return DATA_KEY; }
  "api catalog version"      { return VERSION_KEY; }

  {SPACE}                    { return SPACE; }
  {URN}                      { return URN; }
  {STRINGVALUE}              { return STRINGVALUE; }

}

[^] { return BAD_CHARACTER; }
