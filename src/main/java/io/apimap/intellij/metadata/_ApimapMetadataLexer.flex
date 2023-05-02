package io.apimap.intellij.metadata;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.apimap.intellij.metadata.psi.MetadataTypes.*;

%%

%{
  public _ApimapMetadataLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ApimapMetadataLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]*
URLVALUE=(https?:"//")([\w\.\-])+
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
  {URLVALUE}                 { return URLVALUE; }
  {STRINGVALUE}              { return STRINGVALUE; }

}

[^] { return BAD_CHARACTER; }
