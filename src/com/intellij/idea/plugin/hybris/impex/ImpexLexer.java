/* The following code was generated by JFlex 1.4.3 on 31/08/14 18:14 */

package com.intellij.idea.plugin.hybris.impex;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.idea.plugin.hybris.impex.psi.ImpexTypes;
import com.intellij.psi.TokenType;
import com.intellij.psi.CustomHighlighterTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 31/08/14 18:14 from the specification file
 * <tt>/home/sasha/sources/idea/Hybris-Impex-Synax-Highlight/src/com/intellij/idea/plugin/hybris/impex/Impex.flex</tt>
 */
class ImpexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int BEAN_SHELL = 16;
  public static final int HEADER_MODE = 8;
  public static final int ATTRIBUTE_VALUE = 24;
  public static final int HEADER_TYPE = 10;
  public static final int FIELD_VALUE = 14;
  public static final int WAITING_ATTRIBUTE_VALUE = 22;
  public static final int MODYFIERS_BLOCK = 18;
  public static final int MACRO_DECLARATION = 6;
  public static final int YYINITIAL = 0;
  public static final int ATTRIBUTE_NAME = 20;
  public static final int WAITING_FOR_FIELD_VALUE = 12;
  public static final int COMMENT = 2;
  public static final int WAITING_MACRO_VALUE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\11\1\3\1\1\1\0\1\3\1\2\16\11\4\0\1\36\1\0"+
    "\1\7\1\4\1\12\1\5\1\0\1\6\4\0\1\16\1\0\1\17"+
    "\1\0\12\11\1\0\1\15\1\37\1\10\1\46\2\0\1\31\2\11"+
    "\1\30\1\23\3\11\1\20\3\11\1\33\1\21\1\34\1\27\1\11"+
    "\1\24\1\22\1\25\1\26\1\35\4\11\1\13\1\0\1\14\1\0"+
    "\1\32\1\0\4\11\1\45\1\11\1\41\1\11\1\40\4\11\1\42"+
    "\1\43\2\11\1\44\10\11\4\0\41\11\2\0\4\11\4\0\1\11"+
    "\2\0\1\11\7\0\1\11\4\0\1\11\5\0\27\11\1\0\37\11"+
    "\1\0\u01ca\11\4\0\14\11\16\0\5\11\7\0\1\11\1\0\1\11"+
    "\21\0\165\11\1\0\2\11\2\0\4\11\10\0\1\11\1\0\3\11"+
    "\1\0\1\11\1\0\24\11\1\0\123\11\1\0\213\11\1\0\5\11"+
    "\2\0\236\11\11\0\46\11\2\0\1\11\7\0\47\11\7\0\1\11"+
    "\1\0\55\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0\1\11"+
    "\10\0\33\11\5\0\3\11\15\0\5\11\6\0\1\11\4\0\13\11"+
    "\5\0\112\11\4\0\146\11\1\0\11\11\1\0\12\11\1\0\23\11"+
    "\2\0\1\11\17\0\74\11\2\0\145\11\16\0\66\11\4\0\1\11"+
    "\5\0\56\11\22\0\34\11\104\0\1\11\1\0\13\11\67\0\33\11"+
    "\1\0\144\11\2\0\12\11\1\0\7\11\1\0\7\11\1\0\3\11"+
    "\1\0\10\11\2\0\2\11\2\0\26\11\1\0\7\11\1\0\1\11"+
    "\3\0\4\11\2\0\11\11\2\0\2\11\2\0\4\11\10\0\1\11"+
    "\4\0\2\11\1\0\5\11\2\0\16\11\7\0\1\11\5\0\3\11"+
    "\1\0\6\11\4\0\2\11\2\0\26\11\1\0\7\11\1\0\2\11"+
    "\1\0\2\11\1\0\2\11\2\0\1\11\1\0\5\11\4\0\2\11"+
    "\2\0\3\11\3\0\1\11\7\0\4\11\1\0\1\11\7\0\20\11"+
    "\13\0\3\11\1\0\11\11\1\0\3\11\1\0\26\11\1\0\7\11"+
    "\1\0\2\11\1\0\5\11\2\0\12\11\1\0\3\11\1\0\3\11"+
    "\2\0\1\11\17\0\4\11\2\0\12\11\1\0\1\11\17\0\3\11"+
    "\1\0\10\11\2\0\2\11\2\0\26\11\1\0\7\11\1\0\2\11"+
    "\1\0\5\11\2\0\11\11\2\0\2\11\2\0\3\11\10\0\2\11"+
    "\4\0\2\11\1\0\5\11\2\0\12\11\1\0\1\11\20\0\2\11"+
    "\1\0\6\11\3\0\3\11\1\0\4\11\3\0\2\11\1\0\1\11"+
    "\1\0\2\11\3\0\2\11\3\0\3\11\3\0\14\11\4\0\5\11"+
    "\3\0\3\11\1\0\4\11\2\0\1\11\6\0\1\11\16\0\12\11"+
    "\11\0\1\11\7\0\3\11\1\0\10\11\1\0\3\11\1\0\27\11"+
    "\1\0\12\11\1\0\5\11\3\0\10\11\1\0\3\11\1\0\4\11"+
    "\7\0\2\11\1\0\2\11\6\0\4\11\2\0\12\11\22\0\2\11"+
    "\1\0\10\11\1\0\3\11\1\0\27\11\1\0\12\11\1\0\5\11"+
    "\2\0\11\11\1\0\3\11\1\0\4\11\7\0\2\11\7\0\1\11"+
    "\1\0\4\11\2\0\12\11\1\0\2\11\17\0\2\11\1\0\10\11"+
    "\1\0\3\11\1\0\51\11\2\0\10\11\1\0\3\11\1\0\5\11"+
    "\10\0\1\11\10\0\4\11\2\0\12\11\12\0\6\11\2\0\2\11"+
    "\1\0\22\11\3\0\30\11\1\0\11\11\1\0\1\11\2\0\7\11"+
    "\3\0\1\11\4\0\6\11\1\0\1\11\1\0\10\11\22\0\2\11"+
    "\15\0\72\11\4\0\20\11\1\0\12\11\47\0\2\11\1\0\1\11"+
    "\2\0\2\11\1\0\1\11\2\0\1\11\6\0\4\11\1\0\7\11"+
    "\1\0\3\11\1\0\1\11\1\0\1\11\2\0\2\11\1\0\15\11"+
    "\1\0\3\11\2\0\5\11\1\0\1\11\1\0\6\11\2\0\12\11"+
    "\2\0\4\11\40\0\1\11\27\0\2\11\6\0\12\11\13\0\1\11"+
    "\1\0\1\11\1\0\1\11\4\0\12\11\1\0\44\11\4\0\24\11"+
    "\1\0\22\11\1\0\44\11\11\0\1\11\71\0\112\11\6\0\116\11"+
    "\2\0\46\11\1\0\1\11\5\0\1\11\2\0\53\11\1\0\u014d\11"+
    "\1\0\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0\51\11"+
    "\1\0\4\11\2\0\41\11\1\0\4\11\2\0\7\11\1\0\1\11"+
    "\1\0\4\11\2\0\17\11\1\0\71\11\1\0\4\11\2\0\103\11"+
    "\2\0\3\11\40\0\20\11\20\0\125\11\14\0\u026c\11\2\0\21\11"+
    "\1\0\32\11\5\0\113\11\3\0\3\11\17\0\15\11\1\0\7\11"+
    "\13\0\25\11\13\0\24\11\14\0\15\11\1\0\3\11\1\0\2\11"+
    "\14\0\124\11\3\0\1\11\3\0\3\11\2\0\12\11\41\0\3\11"+
    "\2\0\12\11\6\0\130\11\10\0\53\11\5\0\106\11\12\0\35\11"+
    "\3\0\14\11\4\0\14\11\12\0\50\11\2\0\5\11\13\0\54\11"+
    "\4\0\32\11\6\0\12\11\46\0\34\11\4\0\77\11\1\0\35\11"+
    "\2\0\13\11\6\0\12\11\15\0\1\11\130\0\114\11\4\0\12\11"+
    "\21\0\11\11\14\0\164\11\14\0\70\11\10\0\12\11\3\0\61\11"+
    "\122\0\3\11\1\0\43\11\11\0\347\11\25\0\u011a\11\2\0\6\11"+
    "\2\0\46\11\2\0\6\11\2\0\10\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\1\0\37\11\2\0\65\11\1\0\7\11\1\0\1\11"+
    "\3\0\3\11\1\0\7\11\3\0\4\11\2\0\6\11\4\0\15\11"+
    "\5\0\3\11\1\0\7\11\16\0\5\11\32\0\5\11\20\0\2\11"+
    "\23\0\1\11\13\0\5\11\5\0\6\11\1\0\1\11\15\0\1\11"+
    "\20\0\15\11\3\0\33\11\25\0\15\11\4\0\1\11\3\0\14\11"+
    "\21\0\1\11\4\0\1\11\2\0\12\11\1\0\1\11\3\0\5\11"+
    "\6\0\1\11\1\0\1\11\1\0\1\11\1\0\4\11\1\0\13\11"+
    "\2\0\4\11\5\0\5\11\4\0\1\11\21\0\51\11\u0a77\0\57\11"+
    "\1\0\57\11\1\0\205\11\6\0\11\11\14\0\46\11\1\0\1\11"+
    "\5\0\1\11\2\0\70\11\7\0\1\11\17\0\30\11\11\0\7\11"+
    "\1\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11"+
    "\1\0\7\11\1\0\7\11\1\0\40\11\57\0\1\11\u01d5\0\3\11"+
    "\31\0\17\11\1\0\5\11\2\0\5\11\4\0\126\11\2\0\2\11"+
    "\2\0\3\11\1\0\132\11\1\0\4\11\5\0\51\11\3\0\136\11"+
    "\21\0\33\11\65\0\20\11\u0200\0\u19b6\11\112\0\u51cd\11\63\0\u048d\11"+
    "\103\0\56\11\2\0\u010d\11\3\0\34\11\24\0\60\11\4\0\12\11"+
    "\1\0\31\11\7\0\123\11\45\0\11\11\2\0\147\11\2\0\4\11"+
    "\1\0\4\11\14\0\13\11\115\0\60\11\20\0\1\11\7\0\64\11"+
    "\14\0\105\11\13\0\12\11\6\0\30\11\3\0\1\11\4\0\56\11"+
    "\2\0\44\11\14\0\35\11\3\0\101\11\16\0\13\11\46\0\67\11"+
    "\11\0\16\11\2\0\12\11\6\0\27\11\3\0\2\11\4\0\103\11"+
    "\30\0\3\11\2\0\20\11\2\0\5\11\12\0\6\11\2\0\6\11"+
    "\2\0\6\11\11\0\7\11\1\0\7\11\221\0\53\11\1\0\2\11"+
    "\2\0\12\11\6\0\u2ba4\11\14\0\27\11\4\0\61\11\u2104\0\u016e\11"+
    "\2\0\152\11\46\0\7\11\14\0\5\11\5\0\14\11\1\0\15\11"+
    "\1\0\5\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0\154\11"+
    "\41\0\u016b\11\22\0\100\11\2\0\66\11\50\0\15\11\3\0\20\11"+
    "\20\0\7\11\14\0\2\11\30\0\3\11\31\0\1\11\6\0\5\11"+
    "\1\0\207\11\2\0\1\11\4\0\1\11\13\0\12\11\7\0\32\11"+
    "\4\0\1\11\1\0\32\11\13\0\131\11\3\0\6\11\2\0\6\11"+
    "\2\0\6\11\2\0\3\11\3\0\2\11\3\0\2\11\22\0\3\11"+
    "\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\13\0\1\2\2\3\1\4\1\5\2\6"+
    "\1\7\3\6\1\1\1\4\2\10\1\11\1\12\1\13"+
    "\1\4\1\13\1\14\1\13\3\2\1\15\1\16\1\17"+
    "\2\2\1\20\1\21\1\22\1\23\3\6\1\0\1\24"+
    "\1\13\1\0\1\25\1\0\1\26\1\0\1\27\1\0"+
    "\1\30\1\0\1\31\1\0\3\6\1\24\1\13\1\26"+
    "\1\0\1\30\1\0\1\20\3\6\1\13\3\6\1\13"+
    "\1\32\1\33\1\34\1\13\1\6\1\13\1\6\1\35"+
    "\4\6\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u01fb\0\u0222"+
    "\0\u0249\0\u0270\0\u0297\0\u02be\0\u01fb\0\u02e5\0\u030c\0\u0333"+
    "\0\u035a\0\u0381\0\u03a8\0\u01fb\0\u03cf\0\u01fb\0\u03f6\0\u041d"+
    "\0\u0444\0\u01fb\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u01fb"+
    "\0\u01fb\0\u052e\0\u0555\0\u057c\0\u01fb\0\u01fb\0\u02be\0\u05a3"+
    "\0\u05ca\0\u05f1\0\u0618\0\u063f\0\u0666\0\u0492\0\u068d\0\u06b4"+
    "\0\u06db\0\u04e0\0\u0702\0\u0729\0\u0750\0\u0555\0\u0777\0\u079e"+
    "\0\u07c5\0\u07ec\0\u0813\0\u083a\0\u0861\0\u01fb\0\u0888\0\u01fb"+
    "\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b\0\u0972\0\u0999\0\u09c0"+
    "\0\u09e7\0\u0a0e\0\u0a35\0\u0297\0\u0297\0\u0a5c\0\u0a83\0\u0aaa"+
    "\0\u0ad1\0\u03f6\0\u0af8\0\u0b1f\0\u0b46\0\u0b6d\0\u0297";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\16\1\17\1\20\1\21\1\22\4\16\1\23\1\24"+
    "\2\16\1\25\2\16\1\26\3\23\1\27\1\23\1\30"+
    "\7\23\1\21\1\16\6\23\1\16\1\31\1\17\1\20"+
    "\1\32\32\31\1\32\10\31\1\16\1\17\1\20\1\21"+
    "\5\16\2\33\5\16\16\33\1\21\1\16\6\33\2\16"+
    "\1\17\1\20\1\21\4\16\1\34\25\16\1\21\11\16"+
    "\1\17\1\20\1\21\5\16\2\35\5\16\16\35\1\21"+
    "\1\16\6\35\2\16\1\17\1\20\1\21\7\16\2\36"+
    "\21\16\1\21\10\16\1\37\1\17\1\20\1\40\3\37"+
    "\1\41\5\37\1\25\1\42\17\37\1\21\1\43\10\37"+
    "\1\17\1\20\1\40\11\37\1\25\1\42\17\37\1\21"+
    "\1\43\7\37\1\16\1\17\1\20\1\21\3\16\1\44"+
    "\26\16\1\21\11\16\1\17\1\20\1\21\2\16\1\45"+
    "\1\46\1\16\2\47\1\16\1\50\3\16\16\47\1\21"+
    "\1\16\6\47\2\16\1\17\1\20\1\21\4\16\1\51"+
    "\25\16\1\21\11\16\1\17\1\20\1\21\2\16\1\52"+
    "\1\53\1\16\2\54\5\16\16\54\1\21\1\16\6\54"+
    "\2\16\1\17\1\20\1\21\10\16\1\36\1\16\1\55"+
    "\17\16\1\21\10\16\50\0\1\17\50\0\1\21\32\0"+
    "\1\21\15\0\1\56\52\0\2\23\5\0\16\23\2\0"+
    "\6\23\12\0\2\57\5\0\16\57\2\0\6\57\12\0"+
    "\2\23\5\0\1\23\1\60\14\23\2\0\6\23\12\0"+
    "\2\23\5\0\3\23\1\61\12\23\2\0\6\23\12\0"+
    "\2\23\5\0\7\23\1\62\6\23\2\0\6\23\1\0"+
    "\1\31\2\0\45\31\2\0\1\32\32\31\1\32\10\31"+
    "\11\0\2\33\5\0\16\33\2\0\6\33\12\0\2\35"+
    "\5\0\16\35\2\0\6\35\1\0\1\37\2\0\12\37"+
    "\2\0\17\37\1\0\11\37\2\0\1\40\11\37\2\0"+
    "\17\37\1\21\10\37\1\41\2\63\4\41\1\64\5\41"+
    "\2\63\17\41\1\63\10\41\1\37\2\0\12\37\2\0"+
    "\17\37\1\0\1\37\1\65\6\37\7\66\1\67\37\66"+
    "\1\70\2\0\3\70\1\71\40\70\7\72\1\73\37\72"+
    "\11\0\2\47\5\0\16\47\2\0\6\47\1\0\1\74"+
    "\2\0\3\74\1\75\40\74\7\76\1\77\37\76\11\0"+
    "\2\54\4\0\1\100\16\54\2\0\6\54\12\0\2\23"+
    "\5\0\2\23\1\101\13\23\2\0\6\23\12\0\2\23"+
    "\5\0\13\23\1\102\2\23\2\0\6\23\12\0\2\23"+
    "\5\0\10\23\1\103\5\23\2\0\6\23\1\0\7\63"+
    "\1\104\37\63\1\37\2\0\4\37\1\41\5\37\2\0"+
    "\17\37\1\0\11\37\2\0\12\37\2\0\17\37\1\0"+
    "\2\37\1\105\5\37\7\0\1\66\37\0\1\70\2\0"+
    "\3\70\1\106\40\70\6\0\1\107\47\0\1\72\37\0"+
    "\1\74\2\0\3\74\1\110\40\74\6\0\1\111\47\0"+
    "\1\76\50\0\2\112\5\0\16\112\2\0\6\112\12\0"+
    "\2\23\5\0\3\23\1\113\12\23\2\0\6\23\12\0"+
    "\2\23\5\0\14\23\1\114\1\23\2\0\6\23\12\0"+
    "\2\23\5\0\11\23\1\115\4\23\2\0\6\23\10\0"+
    "\1\63\37\0\1\37\2\0\12\37\2\0\17\37\1\0"+
    "\3\37\1\116\4\37\6\0\1\106\46\0\1\110\51\0"+
    "\2\54\5\0\16\54\2\0\6\54\12\0\2\23\5\0"+
    "\4\23\1\117\11\23\2\0\6\23\12\0\2\23\5\0"+
    "\15\23\1\120\2\0\6\23\12\0\2\23\5\0\5\23"+
    "\1\121\10\23\2\0\6\23\1\0\1\37\2\0\12\37"+
    "\2\0\17\37\1\0\4\37\1\122\3\37\11\0\2\23"+
    "\5\0\5\23\1\123\10\23\2\0\6\23\12\0\2\23"+
    "\5\0\3\23\1\124\12\23\2\0\6\23\12\0\2\23"+
    "\5\0\3\23\1\125\12\23\2\0\6\23\1\0\1\37"+
    "\2\0\12\37\2\0\17\37\1\0\5\37\1\126\2\37"+
    "\11\0\2\23\5\0\12\23\1\127\3\23\2\0\6\23"+
    "\1\0\1\37\2\0\12\37\2\0\17\37\1\0\6\37"+
    "\1\130\1\37\11\0\2\23\5\0\6\23\1\131\7\23"+
    "\2\0\6\23\1\0\1\37\2\0\12\37\2\0\17\37"+
    "\1\0\7\37\1\132\11\0\2\23\5\0\7\23\1\133"+
    "\6\23\2\0\6\23\12\0\2\23\5\0\10\23\1\134"+
    "\5\23\2\0\6\23\12\0\2\23\5\0\11\23\1\135"+
    "\4\23\2\0\6\23\12\0\2\23\5\0\5\23\1\136"+
    "\10\23\2\0\6\23\12\0\2\23\5\0\3\23\1\137"+
    "\12\23\2\0\6\23\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2964];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\13\0\2\11\5\1\1\11\6\1\1\11"+
    "\1\1\1\11\3\1\1\11\5\1\2\11\3\1\2\11"+
    "\4\1\1\0\2\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\5\1\1\11"+
    "\1\0\1\11\1\0\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  ImpexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ImpexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1922) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 28: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_UPDATE;
          }
        case 31: break;
        case 27: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_REMOVE;
          }
        case 32: break;
        case 12: 
          { yybegin(WAITING_FOR_FIELD_VALUE); return ImpexTypes.FIELD_LIST_ITEM_SEPARATOR;
          }
        case 33: break;
        case 2: 
          { return TokenType.BAD_CHARACTER;
          }
        case 34: break;
        case 20: 
          { yybegin(FIELD_VALUE); return ImpexTypes.DOUBLE_STRING;
          }
        case 35: break;
        case 9: 
          { yybegin(HEADER_TYPE); return ImpexTypes.HEADER_TYPE;
          }
        case 36: break;
        case 29: 
          { yybegin(FIELD_VALUE); return ImpexTypes.FIELD_VALUE_IGNORE;
          }
        case 37: break;
        case 30: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_INSERT_UPDATE;
          }
        case 38: break;
        case 10: 
          { yybegin(MODYFIERS_BLOCK); return ImpexTypes.SQUARE_BRACKETS;
          }
        case 39: break;
        case 23: 
          { yybegin(ATTRIBUTE_NAME); return ImpexTypes.DOUBLE_STRING;
          }
        case 40: break;
        case 4: 
          { return TokenType.WHITE_SPACE;
          }
        case 41: break;
        case 15: 
          { yybegin(WAITING_ATTRIBUTE_VALUE); return ImpexTypes.ASSIGN_VALUE;
          }
        case 42: break;
        case 8: 
          { yybegin(WAITING_MACRO_VALUE); return ImpexTypes.ASSIGN_VALUE;
          }
        case 43: break;
        case 1: 
          { return ImpexTypes.COMMENT_BODY;
          }
        case 44: break;
        case 25: 
          { yybegin(ATTRIBUTE_VALUE); return ImpexTypes.DOUBLE_STRING;
          }
        case 45: break;
        case 16: 
          { yybegin(ATTRIBUTE_VALUE); return ImpexTypes.ATTRIBUTE_VALUE;
          }
        case 46: break;
        case 22: 
          { yybegin(ATTRIBUTE_NAME); return ImpexTypes.SINGLE_STRING;
          }
        case 47: break;
        case 5: 
          { yybegin(COMMENT); return ImpexTypes.COMMENT_MARKER;
          }
        case 48: break;
        case 18: 
          { yybegin(BEAN_SHELL); return ImpexTypes.BEAN_SHELL_MARKER;
          }
        case 49: break;
        case 13: 
          { yybegin(ATTRIBUTE_NAME); return ImpexTypes.ATTRIBUTE_NAME;
          }
        case 50: break;
        case 24: 
          { yybegin(ATTRIBUTE_VALUE); return ImpexTypes.SINGLE_STRING;
          }
        case 51: break;
        case 11: 
          { yybegin(FIELD_VALUE); return ImpexTypes.FIELD_VALUE;
          }
        case 52: break;
        case 3: 
          { yybegin(YYINITIAL); return ImpexTypes.CRLF;
          }
        case 53: break;
        case 7: 
          { yybegin(WAITING_FOR_FIELD_VALUE); return ImpexTypes.FIELD_VALUE_SEPARATOR;
          }
        case 54: break;
        case 26: 
          { yybegin(HEADER_MODE); return ImpexTypes.HEADER_MODE_INSERT;
          }
        case 55: break;
        case 14: 
          { return ImpexTypes.SQUARE_BRACKETS;
          }
        case 56: break;
        case 21: 
          { return ImpexTypes.BEAN_SHELL_BODY;
          }
        case 57: break;
        case 19: 
          { yybegin(MACRO_DECLARATION); return ImpexTypes.MACRO_DECLARATION;
          }
        case 58: break;
        case 6: 
          { yybegin(FIELD_VALUE); return ImpexTypes.VALUE_SUBTYPE;
          }
        case 59: break;
        case 17: 
          { yybegin(MODYFIERS_BLOCK); return ImpexTypes.ATTRIBUTE_SEPARATOR;
          }
        case 60: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
