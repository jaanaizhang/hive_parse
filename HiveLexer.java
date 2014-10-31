// $ANTLR 3.5.2 HiveLexer.g 2014-10-31 18:10:10
package parse;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int BigintLiteral=7;
	public static final int ByteLengthLiteral=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CharSetLiteral=12;
	public static final int CharSetName=13;
	public static final int DIV=14;
	public static final int DIVIDE=15;
	public static final int DOLLAR=16;
	public static final int DOT=17;
	public static final int DecimalLiteral=18;
	public static final int Digit=19;
	public static final int EQUAL=20;
	public static final int EQUAL_NS=21;
	public static final int Exponent=22;
	public static final int GREATERTHAN=23;
	public static final int GREATERTHANOREQUALTO=24;
	public static final int HexDigit=25;
	public static final int Identifier=26;
	public static final int KW_ADD=27;
	public static final int KW_AFTER=28;
	public static final int KW_ALL=29;
	public static final int KW_ALTER=30;
	public static final int KW_ANALYZE=31;
	public static final int KW_AND=32;
	public static final int KW_ARCHIVE=33;
	public static final int KW_ARRAY=34;
	public static final int KW_AS=35;
	public static final int KW_ASC=36;
	public static final int KW_BEFORE=37;
	public static final int KW_BETWEEN=38;
	public static final int KW_BIGINT=39;
	public static final int KW_BINARY=40;
	public static final int KW_BOOLEAN=41;
	public static final int KW_BOTH=42;
	public static final int KW_BUCKET=43;
	public static final int KW_BUCKETS=44;
	public static final int KW_BY=45;
	public static final int KW_CASCADE=46;
	public static final int KW_CASE=47;
	public static final int KW_CAST=48;
	public static final int KW_CHANGE=49;
	public static final int KW_CLUSTER=50;
	public static final int KW_CLUSTERED=51;
	public static final int KW_CLUSTERSTATUS=52;
	public static final int KW_COLLECTION=53;
	public static final int KW_COLUMN=54;
	public static final int KW_COLUMNS=55;
	public static final int KW_COMMENT=56;
	public static final int KW_COMPUTE=57;
	public static final int KW_CONCATENATE=58;
	public static final int KW_CONTINUE=59;
	public static final int KW_CREATE=60;
	public static final int KW_CROSS=61;
	public static final int KW_CUBE=62;
	public static final int KW_CURRENT=63;
	public static final int KW_CURSOR=64;
	public static final int KW_DATA=65;
	public static final int KW_DATABASE=66;
	public static final int KW_DATABASES=67;
	public static final int KW_DATE=68;
	public static final int KW_DATETIME=69;
	public static final int KW_DBPROPERTIES=70;
	public static final int KW_DECIMAL=71;
	public static final int KW_DEFERRED=72;
	public static final int KW_DELETE=73;
	public static final int KW_DELIMITED=74;
	public static final int KW_DEPENDENCY=75;
	public static final int KW_DESC=76;
	public static final int KW_DESCRIBE=77;
	public static final int KW_DIRECTORIES=78;
	public static final int KW_DIRECTORY=79;
	public static final int KW_DISABLE=80;
	public static final int KW_DISTINCT=81;
	public static final int KW_DISTRIBUTE=82;
	public static final int KW_DOUBLE=83;
	public static final int KW_DROP=84;
	public static final int KW_ELEM_TYPE=85;
	public static final int KW_ELSE=86;
	public static final int KW_ENABLE=87;
	public static final int KW_END=88;
	public static final int KW_ESCAPED=89;
	public static final int KW_EXCHANGE=90;
	public static final int KW_EXCLUSIVE=91;
	public static final int KW_EXISTS=92;
	public static final int KW_EXPLAIN=93;
	public static final int KW_EXPORT=94;
	public static final int KW_EXTENDED=95;
	public static final int KW_EXTERNAL=96;
	public static final int KW_FALSE=97;
	public static final int KW_FETCH=98;
	public static final int KW_FIELDS=99;
	public static final int KW_FILEFORMAT=100;
	public static final int KW_FIRST=101;
	public static final int KW_FLOAT=102;
	public static final int KW_FOLLOWING=103;
	public static final int KW_FOR=104;
	public static final int KW_FORMAT=105;
	public static final int KW_FORMATTED=106;
	public static final int KW_FROM=107;
	public static final int KW_FULL=108;
	public static final int KW_FUNCTION=109;
	public static final int KW_FUNCTIONS=110;
	public static final int KW_GRANT=111;
	public static final int KW_GROUP=112;
	public static final int KW_GROUPING=113;
	public static final int KW_HAVING=114;
	public static final int KW_HOLD_DDLTIME=115;
	public static final int KW_IDXPROPERTIES=116;
	public static final int KW_IF=117;
	public static final int KW_IGNORE=118;
	public static final int KW_IMPORT=119;
	public static final int KW_IN=120;
	public static final int KW_INCRE=121;
	public static final int KW_INDEX=122;
	public static final int KW_INDEXES=123;
	public static final int KW_INNER=124;
	public static final int KW_INPATH=125;
	public static final int KW_INPUTDRIVER=126;
	public static final int KW_INPUTFORMAT=127;
	public static final int KW_INSERT=128;
	public static final int KW_INT=129;
	public static final int KW_INTERSECT=130;
	public static final int KW_INTO=131;
	public static final int KW_IS=132;
	public static final int KW_ITEMS=133;
	public static final int KW_JOIN=134;
	public static final int KW_KEYS=135;
	public static final int KW_KEY_TYPE=136;
	public static final int KW_LATERAL=137;
	public static final int KW_LEFT=138;
	public static final int KW_LESS=139;
	public static final int KW_LIKE=140;
	public static final int KW_LIMIT=141;
	public static final int KW_LINES=142;
	public static final int KW_LOAD=143;
	public static final int KW_LOCAL=144;
	public static final int KW_LOCATION=145;
	public static final int KW_LOCK=146;
	public static final int KW_LOCKS=147;
	public static final int KW_LOGICAL=148;
	public static final int KW_LONG=149;
	public static final int KW_MACRO=150;
	public static final int KW_MAP=151;
	public static final int KW_MAPJOIN=152;
	public static final int KW_MATERIALIZED=153;
	public static final int KW_MINUS=154;
	public static final int KW_MORE=155;
	public static final int KW_MSCK=156;
	public static final int KW_NOSCAN=157;
	public static final int KW_NOT=158;
	public static final int KW_NO_DROP=159;
	public static final int KW_NULL=160;
	public static final int KW_OF=161;
	public static final int KW_OFFLINE=162;
	public static final int KW_ON=163;
	public static final int KW_OPTION=164;
	public static final int KW_OR=165;
	public static final int KW_ORCFILE=166;
	public static final int KW_ORDER=167;
	public static final int KW_OUT=168;
	public static final int KW_OUTER=169;
	public static final int KW_OUTPUTDRIVER=170;
	public static final int KW_OUTPUTFORMAT=171;
	public static final int KW_OVER=172;
	public static final int KW_OVERWRITE=173;
	public static final int KW_PARTIALSCAN=174;
	public static final int KW_PARTITION=175;
	public static final int KW_PARTITIONED=176;
	public static final int KW_PARTITIONS=177;
	public static final int KW_PERCENT=178;
	public static final int KW_PLUS=179;
	public static final int KW_PRECEDING=180;
	public static final int KW_PRESERVE=181;
	public static final int KW_PRETTY=182;
	public static final int KW_PROCEDURE=183;
	public static final int KW_PROTECTION=184;
	public static final int KW_PURGE=185;
	public static final int KW_RANGE=186;
	public static final int KW_RCFILE=187;
	public static final int KW_READ=188;
	public static final int KW_READONLY=189;
	public static final int KW_READS=190;
	public static final int KW_REBUILD=191;
	public static final int KW_RECORDREADER=192;
	public static final int KW_RECORDWRITER=193;
	public static final int KW_REDUCE=194;
	public static final int KW_REGEXP=195;
	public static final int KW_RENAME=196;
	public static final int KW_REPAIR=197;
	public static final int KW_REPLACE=198;
	public static final int KW_RESTRICT=199;
	public static final int KW_REVOKE=200;
	public static final int KW_RIGHT=201;
	public static final int KW_RLIKE=202;
	public static final int KW_ROLE=203;
	public static final int KW_ROLLUP=204;
	public static final int KW_ROW=205;
	public static final int KW_ROWS=206;
	public static final int KW_SCHEMA=207;
	public static final int KW_SCHEMAS=208;
	public static final int KW_SELECT=209;
	public static final int KW_SEMI=210;
	public static final int KW_SEQUENCEFILE=211;
	public static final int KW_SERDE=212;
	public static final int KW_SERDEPROPERTIES=213;
	public static final int KW_SET=214;
	public static final int KW_SETS=215;
	public static final int KW_SHARED=216;
	public static final int KW_SHOW=217;
	public static final int KW_SHOW_DATABASE=218;
	public static final int KW_SKEWED=219;
	public static final int KW_SMALLINT=220;
	public static final int KW_SORT=221;
	public static final int KW_SORTED=222;
	public static final int KW_SSL=223;
	public static final int KW_STATISTICS=224;
	public static final int KW_STORED=225;
	public static final int KW_STREAMTABLE=226;
	public static final int KW_STRING=227;
	public static final int KW_STRUCT=228;
	public static final int KW_TABLE=229;
	public static final int KW_TABLES=230;
	public static final int KW_TABLESAMPLE=231;
	public static final int KW_TBLPROPERTIES=232;
	public static final int KW_TEMPORARY=233;
	public static final int KW_TERMINATED=234;
	public static final int KW_TEXTFILE=235;
	public static final int KW_THEN=236;
	public static final int KW_TIMESTAMP=237;
	public static final int KW_TINYINT=238;
	public static final int KW_TO=239;
	public static final int KW_TOUCH=240;
	public static final int KW_TRANSFORM=241;
	public static final int KW_TRIGGER=242;
	public static final int KW_TRUE=243;
	public static final int KW_TRUNCATE=244;
	public static final int KW_UNARCHIVE=245;
	public static final int KW_UNBOUNDED=246;
	public static final int KW_UNDO=247;
	public static final int KW_UNION=248;
	public static final int KW_UNIONTYPE=249;
	public static final int KW_UNIQUEJOIN=250;
	public static final int KW_UNLOCK=251;
	public static final int KW_UNSET=252;
	public static final int KW_UNSIGNED=253;
	public static final int KW_UPDATE=254;
	public static final int KW_USE=255;
	public static final int KW_USER=256;
	public static final int KW_USING=257;
	public static final int KW_UTC=258;
	public static final int KW_UTCTIMESTAMP=259;
	public static final int KW_VALUE_TYPE=260;
	public static final int KW_VARCHAR=261;
	public static final int KW_VIEW=262;
	public static final int KW_WHEN=263;
	public static final int KW_WHERE=264;
	public static final int KW_WHILE=265;
	public static final int KW_WINDOW=266;
	public static final int KW_WITH=267;
	public static final int LCURLY=268;
	public static final int LESSTHAN=269;
	public static final int LESSTHANOREQUALTO=270;
	public static final int LPAREN=271;
	public static final int LSQUARE=272;
	public static final int Letter=273;
	public static final int MINUS=274;
	public static final int MOD=275;
	public static final int NOTEQUAL=276;
	public static final int Number=277;
	public static final int PLUS=278;
	public static final int QUESTION=279;
	public static final int RCURLY=280;
	public static final int RPAREN=281;
	public static final int RSQUARE=282;
	public static final int RegexComponent=283;
	public static final int SEMICOLON=284;
	public static final int STAR=285;
	public static final int SmallintLiteral=286;
	public static final int StringLiteral=287;
	public static final int TILDE=288;
	public static final int TinyintLiteral=289;
	public static final int WS=290;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "HiveLexer.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:23:9: ( 'TRUE' )
			// HiveLexer.g:23:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:24:10: ( 'FALSE' )
			// HiveLexer.g:24:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:25:8: ( 'ALL' )
			// HiveLexer.g:25:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:26:8: ( 'AND' )
			// HiveLexer.g:26:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:27:7: ( 'OR' )
			// HiveLexer.g:27:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:28:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// HiveLexer.g:28:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// HiveLexer.g:28:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:29:9: ( 'LIKE' )
			// HiveLexer.g:29:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:31:7: ( 'IF' )
			// HiveLexer.g:31:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:32:11: ( 'EXISTS' )
			// HiveLexer.g:32:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_INCRE"
	public final void mKW_INCRE() throws RecognitionException {
		try {
			int _type = KW_INCRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:34:10: ( 'INCREMENTAL' )
			// HiveLexer.g:34:12: 'INCREMENTAL'
			{
			match("INCREMENTAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INCRE"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:35:8: ( 'ASC' )
			// HiveLexer.g:35:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:36:9: ( 'DESC' )
			// HiveLexer.g:36:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:37:10: ( 'ORDER' )
			// HiveLexer.g:37:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:38:10: ( 'GROUP' )
			// HiveLexer.g:38:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:39:7: ( 'BY' )
			// HiveLexer.g:39:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:40:11: ( 'HAVING' )
			// HiveLexer.g:40:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:41:10: ( 'WHERE' )
			// HiveLexer.g:41:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:42:9: ( 'FROM' )
			// HiveLexer.g:42:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:43:7: ( 'AS' )
			// HiveLexer.g:43:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:44:11: ( 'SELECT' )
			// HiveLexer.g:44:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:45:13: ( 'DISTINCT' )
			// HiveLexer.g:45:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:46:11: ( 'INSERT' )
			// HiveLexer.g:46:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:47:14: ( 'OVERWRITE' )
			// HiveLexer.g:47:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:48:10: ( 'OUTER' )
			// HiveLexer.g:48:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:49:15: ( 'UNIQUEJOIN' )
			// HiveLexer.g:49:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:50:13: ( 'PRESERVE' )
			// HiveLexer.g:50:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:51:9: ( 'JOIN' )
			// HiveLexer.g:51:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:52:9: ( 'LEFT' )
			// HiveLexer.g:52:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:53:10: ( 'RIGHT' )
			// HiveLexer.g:53:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:54:9: ( 'FULL' )
			// HiveLexer.g:54:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:55:7: ( 'ON' )
			// HiveLexer.g:55:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:56:14: ( 'PARTITION' )
			// HiveLexer.g:56:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:57:15: ( 'PARTITIONS' )
			// HiveLexer.g:57:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:58:9: ( 'TABLE' )
			// HiveLexer.g:58:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:59:10: ( 'TABLES' )
			// HiveLexer.g:59:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:60:11: ( 'COLUMNS' )
			// HiveLexer.g:60:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:61:9: ( 'INDEX' )
			// HiveLexer.g:61:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:62:11: ( 'INDEXES' )
			// HiveLexer.g:62:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:63:11: ( 'REBUILD' )
			// HiveLexer.g:63:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:64:13: ( 'FUNCTIONS' )
			// HiveLexer.g:64:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:65:8: ( 'SHOW' )
			// HiveLexer.g:65:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:66:8: ( 'MSCK' )
			// HiveLexer.g:66:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:67:10: ( 'REPAIR' )
			// HiveLexer.g:67:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:68:13: ( 'DIRECTORY' )
			// HiveLexer.g:68:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:69:9: ( 'LOCAL' )
			// HiveLexer.g:69:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:70:14: ( 'TRANSFORM' )
			// HiveLexer.g:70:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:71:9: ( 'USING' )
			// HiveLexer.g:71:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:72:11: ( 'CLUSTER' )
			// HiveLexer.g:72:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:73:14: ( 'DISTRIBUTE' )
			// HiveLexer.g:73:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:74:8: ( 'SORT' )
			// HiveLexer.g:74:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:75:9: ( 'UNION' )
			// HiveLexer.g:75:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:76:8: ( 'LOAD' )
			// HiveLexer.g:76:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:77:10: ( 'EXPORT' )
			// HiveLexer.g:77:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:78:10: ( 'IMPORT' )
			// HiveLexer.g:78:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:79:8: ( 'DATA' )
			// HiveLexer.g:79:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:80:10: ( 'INPATH' )
			// HiveLexer.g:80:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:81:6: ( 'IS' )
			// HiveLexer.g:81:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:82:8: ( 'NULL' )
			// HiveLexer.g:82:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:83:10: ( 'CREATE' )
			// HiveLexer.g:83:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:84:12: ( 'EXTERNAL' )
			// HiveLexer.g:84:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:85:9: ( 'ALTER' )
			// HiveLexer.g:85:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:86:10: ( 'CHANGE' )
			// HiveLexer.g:86:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:87:10: ( 'COLUMN' )
			// HiveLexer.g:87:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:88:9: ( 'FIRST' )
			// HiveLexer.g:88:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:89:9: ( 'AFTER' )
			// HiveLexer.g:89:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:90:12: ( 'DESCRIBE' )
			// HiveLexer.g:90:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:91:8: ( 'DROP' )
			// HiveLexer.g:91:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:92:10: ( 'RENAME' )
			// HiveLexer.g:92:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_IGNORE"
	public final void mKW_IGNORE() throws RecognitionException {
		try {
			int _type = KW_IGNORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:93:10: ( 'IGNORE' )
			// HiveLexer.g:93:12: 'IGNORE'
			{
			match("IGNORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IGNORE"

	// $ANTLR start "KW_PROTECTION"
	public final void mKW_PROTECTION() throws RecognitionException {
		try {
			int _type = KW_PROTECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:94:14: ( 'PROTECTION' )
			// HiveLexer.g:94:16: 'PROTECTION'
			{
			match("PROTECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROTECTION"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:95:6: ( 'TO' )
			// HiveLexer.g:95:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:96:11: ( 'COMMENT' )
			// HiveLexer.g:96:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:97:11: ( 'BOOLEAN' )
			// HiveLexer.g:97:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:98:11: ( 'TINYINT' )
			// HiveLexer.g:98:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:99:12: ( 'SMALLINT' )
			// HiveLexer.g:99:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:100:7: ( 'INT' )
			// HiveLexer.g:100:9: 'INT'
			{
			match("INT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:101:10: ( 'BIGINT' )
			// HiveLexer.g:101:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:102:9: ( 'FLOAT' )
			// HiveLexer.g:102:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:103:10: ( 'DOUBLE' )
			// HiveLexer.g:103:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:104:8: ( 'DATE' )
			// HiveLexer.g:104:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:105:12: ( 'DATETIME' )
			// HiveLexer.g:105:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:106:13: ( 'TIMESTAMP' )
			// HiveLexer.g:106:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_DECIMAL"
	public final void mKW_DECIMAL() throws RecognitionException {
		try {
			int _type = KW_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:107:11: ( 'DECIMAL' )
			// HiveLexer.g:107:13: 'DECIMAL'
			{
			match("DECIMAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DECIMAL"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:108:10: ( 'STRING' )
			// HiveLexer.g:108:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_VARCHAR"
	public final void mKW_VARCHAR() throws RecognitionException {
		try {
			int _type = KW_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:109:11: ( 'VARCHAR' )
			// HiveLexer.g:109:13: 'VARCHAR'
			{
			match("VARCHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VARCHAR"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:110:9: ( 'ARRAY' )
			// HiveLexer.g:110:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:111:10: ( 'STRUCT' )
			// HiveLexer.g:111:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:112:7: ( 'MAP' )
			// HiveLexer.g:112:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:113:13: ( 'UNIONTYPE' )
			// HiveLexer.g:113:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:114:10: ( 'REDUCE' )
			// HiveLexer.g:114:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:115:15: ( 'PARTITIONED' )
			// HiveLexer.g:115:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:116:13: ( 'CLUSTERED' )
			// HiveLexer.g:116:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:117:10: ( 'SORTED' )
			// HiveLexer.g:117:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:118:8: ( 'INTO' )
			// HiveLexer.g:118:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:119:11: ( 'BUCKETS' )
			// HiveLexer.g:119:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:120:7: ( 'ROW' )
			// HiveLexer.g:120:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_ROWS"
	public final void mKW_ROWS() throws RecognitionException {
		try {
			int _type = KW_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:121:8: ( 'ROWS' )
			// HiveLexer.g:121:10: 'ROWS'
			{
			match("ROWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROWS"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:122:10: ( 'FORMAT' )
			// HiveLexer.g:122:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:123:13: ( 'DELIMITED' )
			// HiveLexer.g:123:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:124:10: ( 'FIELDS' )
			// HiveLexer.g:124:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:125:14: ( 'TERMINATED' )
			// HiveLexer.g:125:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:126:11: ( 'ESCAPED' )
			// HiveLexer.g:126:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:127:14: ( 'COLLECTION' )
			// HiveLexer.g:127:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:128:9: ( 'ITEMS' )
			// HiveLexer.g:128:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:129:8: ( 'KEYS' )
			// HiveLexer.g:129:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:130:12: ( '$KEY$' )
			// HiveLexer.g:130:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:131:9: ( 'LINES' )
			// HiveLexer.g:131:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:132:10: ( 'STORED' )
			// HiveLexer.g:132:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:133:14: ( 'FILEFORMAT' )
			// HiveLexer.g:133:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_SEQUENCEFILE"
	public final void mKW_SEQUENCEFILE() throws RecognitionException {
		try {
			int _type = KW_SEQUENCEFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:134:16: ( 'SEQUENCEFILE' )
			// HiveLexer.g:134:18: 'SEQUENCEFILE'
			{
			match("SEQUENCEFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEQUENCEFILE"

	// $ANTLR start "KW_TEXTFILE"
	public final void mKW_TEXTFILE() throws RecognitionException {
		try {
			int _type = KW_TEXTFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:135:12: ( 'TEXTFILE' )
			// HiveLexer.g:135:14: 'TEXTFILE'
			{
			match("TEXTFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEXTFILE"

	// $ANTLR start "KW_RCFILE"
	public final void mKW_RCFILE() throws RecognitionException {
		try {
			int _type = KW_RCFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:136:10: ( 'RCFILE' )
			// HiveLexer.g:136:12: 'RCFILE'
			{
			match("RCFILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RCFILE"

	// $ANTLR start "KW_ORCFILE"
	public final void mKW_ORCFILE() throws RecognitionException {
		try {
			int _type = KW_ORCFILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:137:11: ( 'ORC' )
			// HiveLexer.g:137:13: 'ORC'
			{
			match("ORC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORCFILE"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:138:15: ( 'INPUTFORMAT' )
			// HiveLexer.g:138:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:139:16: ( 'OUTPUTFORMAT' )
			// HiveLexer.g:139:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:140:15: ( 'INPUTDRIVER' )
			// HiveLexer.g:140:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:141:16: ( 'OUTPUTDRIVER' )
			// HiveLexer.g:141:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_OFFLINE"
	public final void mKW_OFFLINE() throws RecognitionException {
		try {
			int _type = KW_OFFLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:142:11: ( 'OFFLINE' )
			// HiveLexer.g:142:13: 'OFFLINE'
			{
			match("OFFLINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFLINE"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:143:10: ( 'ENABLE' )
			// HiveLexer.g:143:12: 'ENABLE'
			{
			match("ENABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:144:11: ( 'DISABLE' )
			// HiveLexer.g:144:13: 'DISABLE'
			{
			match("DISABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_READONLY"
	public final void mKW_READONLY() throws RecognitionException {
		try {
			int _type = KW_READONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:145:12: ( 'READONLY' )
			// HiveLexer.g:145:14: 'READONLY'
			{
			match("READONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READONLY"

	// $ANTLR start "KW_NO_DROP"
	public final void mKW_NO_DROP() throws RecognitionException {
		try {
			int _type = KW_NO_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:146:11: ( 'NO_DROP' )
			// HiveLexer.g:146:13: 'NO_DROP'
			{
			match("NO_DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NO_DROP"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:147:12: ( 'LOCATION' )
			// HiveLexer.g:147:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:148:15: ( 'TABLESAMPLE' )
			// HiveLexer.g:148:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:149:10: ( 'BUCKET' )
			// HiveLexer.g:149:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:150:7: ( 'OUT' )
			// HiveLexer.g:150:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:151:6: ( 'OF' )
			// HiveLexer.g:151:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:152:11: ( 'PERCENT' )
			// HiveLexer.g:152:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:153:8: ( 'CAST' )
			// HiveLexer.g:153:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:154:7: ( 'ADD' )
			// HiveLexer.g:154:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:155:11: ( 'REPLACE' )
			// HiveLexer.g:155:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:156:9: ( 'RLIKE' )
			// HiveLexer.g:156:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:157:10: ( 'REGEXP' )
			// HiveLexer.g:157:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:158:13: ( 'TEMPORARY' )
			// HiveLexer.g:158:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:159:12: ( 'FUNCTION' )
			// HiveLexer.g:159:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_MACRO"
	public final void mKW_MACRO() throws RecognitionException {
		try {
			int _type = KW_MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:160:9: ( 'MACRO' )
			// HiveLexer.g:160:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MACRO"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:161:11: ( 'EXPLAIN' )
			// HiveLexer.g:161:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:162:12: ( 'EXTENDED' )
			// HiveLexer.g:162:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:163:13: ( 'FORMATTED' )
			// HiveLexer.g:163:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_PRETTY"
	public final void mKW_PRETTY() throws RecognitionException {
		try {
			int _type = KW_PRETTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:164:10: ( 'PRETTY' )
			// HiveLexer.g:164:12: 'PRETTY'
			{
			match("PRETTY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRETTY"

	// $ANTLR start "KW_DEPENDENCY"
	public final void mKW_DEPENDENCY() throws RecognitionException {
		try {
			int _type = KW_DEPENDENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:165:14: ( 'DEPENDENCY' )
			// HiveLexer.g:165:16: 'DEPENDENCY'
			{
			match("DEPENDENCY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEPENDENCY"

	// $ANTLR start "KW_LOGICAL"
	public final void mKW_LOGICAL() throws RecognitionException {
		try {
			int _type = KW_LOGICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:166:11: ( 'LOGICAL' )
			// HiveLexer.g:166:13: 'LOGICAL'
			{
			match("LOGICAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOGICAL"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:167:9: ( 'SERDE' )
			// HiveLexer.g:167:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:168:8: ( 'WITH' )
			// HiveLexer.g:168:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:169:12: ( 'DEFERRED' )
			// HiveLexer.g:169:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:170:19: ( 'SERDEPROPERTIES' )
			// HiveLexer.g:170:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:171:16: ( 'DBPROPERTIES' )
			// HiveLexer.g:171:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:172:9: ( 'LIMIT' )
			// HiveLexer.g:172:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:173:7: ( 'SET' )
			// HiveLexer.g:173:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_UNSET"
	public final void mKW_UNSET() throws RecognitionException {
		try {
			int _type = KW_UNSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:174:9: ( 'UNSET' )
			// HiveLexer.g:174:11: 'UNSET'
			{
			match("UNSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:175:17: ( 'TBLPROPERTIES' )
			// HiveLexer.g:175:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:176:17: ( 'IDXPROPERTIES' )
			// HiveLexer.g:176:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:177:14: ( '$VALUE$' )
			// HiveLexer.g:177:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:178:13: ( '$ELEM$' )
			// HiveLexer.g:178:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:179:8: ( 'CASE' )
			// HiveLexer.g:179:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:180:8: ( 'WHEN' )
			// HiveLexer.g:180:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:181:8: ( 'THEN' )
			// HiveLexer.g:181:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:182:8: ( 'ELSE' )
			// HiveLexer.g:182:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:183:7: ( 'END' )
			// HiveLexer.g:183:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:184:11: ( 'MAPJOIN' )
			// HiveLexer.g:184:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:186:15: ( 'STREAMTABLE' )
			// HiveLexer.g:186:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_HOLD_DDLTIME"
	public final void mKW_HOLD_DDLTIME() throws RecognitionException {
		try {
			int _type = KW_HOLD_DDLTIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:187:16: ( 'HOLD_DDLTIME' )
			// HiveLexer.g:187:18: 'HOLD_DDLTIME'
			{
			match("HOLD_DDLTIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOLD_DDLTIME"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:188:17: ( 'CLUSTERSTATUS' )
			// HiveLexer.g:188:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:189:7: ( 'UTC' )
			// HiveLexer.g:189:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:190:16: ( 'UTC_TMESTAMP' )
			// HiveLexer.g:190:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:191:8: ( 'LONG' )
			// HiveLexer.g:191:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:192:10: ( 'DELETE' )
			// HiveLexer.g:192:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:193:8: ( 'PLUS' )
			// HiveLexer.g:193:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:194:9: ( 'MINUS' )
			// HiveLexer.g:194:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:195:9: ( 'FETCH' )
			// HiveLexer.g:195:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:196:13: ( 'INTERSECT' )
			// HiveLexer.g:196:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:197:8: ( 'VIEW' )
			// HiveLexer.g:197:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:198:6: ( 'IN' )
			// HiveLexer.g:198:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:199:12: ( 'DATABASE' )
			// HiveLexer.g:199:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:200:13: ( 'DATABASES' )
			// HiveLexer.g:200:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:201:16: ( 'MATERIALIZED' )
			// HiveLexer.g:201:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:202:10: ( 'SCHEMA' )
			// HiveLexer.g:202:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:203:11: ( 'SCHEMAS' )
			// HiveLexer.g:203:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:204:9: ( 'GRANT' )
			// HiveLexer.g:204:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:205:10: ( 'REVOKE' )
			// HiveLexer.g:205:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:206:7: ( 'SSL' )
			// HiveLexer.g:206:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:207:8: ( 'UNDO' )
			// HiveLexer.g:207:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:208:8: ( 'LOCK' )
			// HiveLexer.g:208:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:209:9: ( 'LOCKS' )
			// HiveLexer.g:209:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:210:10: ( 'UNLOCK' )
			// HiveLexer.g:210:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:211:10: ( 'SHARED' )
			// HiveLexer.g:211:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:212:13: ( 'EXCLUSIVE' )
			// HiveLexer.g:212:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:213:13: ( 'PROCEDURE' )
			// HiveLexer.g:213:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:214:12: ( 'UNSIGNED' )
			// HiveLexer.g:214:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:215:9: ( 'WHILE' )
			// HiveLexer.g:215:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:216:8: ( 'READ' )
			// HiveLexer.g:216:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:217:9: ( 'READS' )
			// HiveLexer.g:217:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:218:9: ( 'PURGE' )
			// HiveLexer.g:218:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:219:9: ( 'RANGE' )
			// HiveLexer.g:219:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:220:11: ( 'ANALYZE' )
			// HiveLexer.g:220:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:221:10: ( 'BEFORE' )
			// HiveLexer.g:221:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:222:11: ( 'BETWEEN' )
			// HiveLexer.g:222:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:223:8: ( 'BOTH' )
			// HiveLexer.g:223:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:224:10: ( 'BINARY' )
			// HiveLexer.g:224:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:225:9: ( 'CROSS' )
			// HiveLexer.g:225:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:226:12: ( 'CONTINUE' )
			// HiveLexer.g:226:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:227:10: ( 'CURSOR' )
			// HiveLexer.g:227:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:228:11: ( 'TRIGGER' )
			// HiveLexer.g:228:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:229:16: ( 'RECORDREADER' )
			// HiveLexer.g:229:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:230:16: ( 'RECORDWRITER' )
			// HiveLexer.g:230:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:231:8: ( 'SEMI' )
			// HiveLexer.g:231:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:232:11: ( 'LATERAL' )
			// HiveLexer.g:232:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:233:9: ( 'TOUCH' )
			// HiveLexer.g:233:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:234:11: ( 'ARCHIVE' )
			// HiveLexer.g:234:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:235:13: ( 'UNARCHIVE' )
			// HiveLexer.g:235:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:236:11: ( 'COMPUTE' )
			// HiveLexer.g:236:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:237:14: ( 'STATISTICS' )
			// HiveLexer.g:237:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:238:7: ( 'USE' )
			// HiveLexer.g:238:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:239:10: ( 'OPTION' )
			// HiveLexer.g:239:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:240:15: ( 'CONCATENATE' )
			// HiveLexer.g:240:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:241:17: ( 'SHOW_DATABASE' )
			// HiveLexer.g:241:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:242:10: ( 'UPDATE' )
			// HiveLexer.g:242:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:243:12: ( 'RESTRICT' )
			// HiveLexer.g:243:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:244:11: ( 'CASCADE' )
			// HiveLexer.g:244:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "KW_SKEWED"
	public final void mKW_SKEWED() throws RecognitionException {
		try {
			int _type = KW_SKEWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:245:10: ( 'SKEWED' )
			// HiveLexer.g:245:12: 'SKEWED'
			{
			match("SKEWED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SKEWED"

	// $ANTLR start "KW_ROLLUP"
	public final void mKW_ROLLUP() throws RecognitionException {
		try {
			int _type = KW_ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:246:10: ( 'ROLLUP' )
			// HiveLexer.g:246:12: 'ROLLUP'
			{
			match("ROLLUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLUP"

	// $ANTLR start "KW_CUBE"
	public final void mKW_CUBE() throws RecognitionException {
		try {
			int _type = KW_CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:247:8: ( 'CUBE' )
			// HiveLexer.g:247:10: 'CUBE'
			{
			match("CUBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CUBE"

	// $ANTLR start "KW_DIRECTORIES"
	public final void mKW_DIRECTORIES() throws RecognitionException {
		try {
			int _type = KW_DIRECTORIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:248:15: ( 'DIRECTORIES' )
			// HiveLexer.g:248:17: 'DIRECTORIES'
			{
			match("DIRECTORIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORIES"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:249:7: ( 'FOR' )
			// HiveLexer.g:249:9: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "KW_WINDOW"
	public final void mKW_WINDOW() throws RecognitionException {
		try {
			int _type = KW_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:250:10: ( 'WINDOW' )
			// HiveLexer.g:250:12: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WINDOW"

	// $ANTLR start "KW_UNBOUNDED"
	public final void mKW_UNBOUNDED() throws RecognitionException {
		try {
			int _type = KW_UNBOUNDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:251:13: ( 'UNBOUNDED' )
			// HiveLexer.g:251:15: 'UNBOUNDED'
			{
			match("UNBOUNDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNBOUNDED"

	// $ANTLR start "KW_PRECEDING"
	public final void mKW_PRECEDING() throws RecognitionException {
		try {
			int _type = KW_PRECEDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:252:13: ( 'PRECEDING' )
			// HiveLexer.g:252:15: 'PRECEDING'
			{
			match("PRECEDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECEDING"

	// $ANTLR start "KW_FOLLOWING"
	public final void mKW_FOLLOWING() throws RecognitionException {
		try {
			int _type = KW_FOLLOWING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:253:13: ( 'FOLLOWING' )
			// HiveLexer.g:253:15: 'FOLLOWING'
			{
			match("FOLLOWING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOLLOWING"

	// $ANTLR start "KW_CURRENT"
	public final void mKW_CURRENT() throws RecognitionException {
		try {
			int _type = KW_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:254:11: ( 'CURRENT' )
			// HiveLexer.g:254:13: 'CURRENT'
			{
			match("CURRENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT"

	// $ANTLR start "KW_LESS"
	public final void mKW_LESS() throws RecognitionException {
		try {
			int _type = KW_LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:255:8: ( 'LESS' )
			// HiveLexer.g:255:10: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LESS"

	// $ANTLR start "KW_MORE"
	public final void mKW_MORE() throws RecognitionException {
		try {
			int _type = KW_MORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:256:8: ( 'MORE' )
			// HiveLexer.g:256:10: 'MORE'
			{
			match("MORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MORE"

	// $ANTLR start "KW_OVER"
	public final void mKW_OVER() throws RecognitionException {
		try {
			int _type = KW_OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:257:8: ( 'OVER' )
			// HiveLexer.g:257:10: 'OVER'
			{
			match("OVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVER"

	// $ANTLR start "KW_GROUPING"
	public final void mKW_GROUPING() throws RecognitionException {
		try {
			int _type = KW_GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:258:12: ( 'GROUPING' )
			// HiveLexer.g:258:14: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUPING"

	// $ANTLR start "KW_SETS"
	public final void mKW_SETS() throws RecognitionException {
		try {
			int _type = KW_SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:259:8: ( 'SETS' )
			// HiveLexer.g:259:10: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SETS"

	// $ANTLR start "KW_TRUNCATE"
	public final void mKW_TRUNCATE() throws RecognitionException {
		try {
			int _type = KW_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:260:12: ( 'TRUNCATE' )
			// HiveLexer.g:260:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUNCATE"

	// $ANTLR start "KW_NOSCAN"
	public final void mKW_NOSCAN() throws RecognitionException {
		try {
			int _type = KW_NOSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:261:10: ( 'NOSCAN' )
			// HiveLexer.g:261:12: 'NOSCAN'
			{
			match("NOSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOSCAN"

	// $ANTLR start "KW_PARTIALSCAN"
	public final void mKW_PARTIALSCAN() throws RecognitionException {
		try {
			int _type = KW_PARTIALSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:262:15: ( 'PARTIALSCAN' )
			// HiveLexer.g:262:17: 'PARTIALSCAN'
			{
			match("PARTIALSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTIALSCAN"

	// $ANTLR start "KW_USER"
	public final void mKW_USER() throws RecognitionException {
		try {
			int _type = KW_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:263:8: ( 'USER' )
			// HiveLexer.g:263:10: 'USER'
			{
			match("USER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USER"

	// $ANTLR start "KW_ROLE"
	public final void mKW_ROLE() throws RecognitionException {
		try {
			int _type = KW_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:264:8: ( 'ROLE' )
			// HiveLexer.g:264:10: 'ROLE'
			{
			match("ROLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLE"

	// $ANTLR start "KW_INNER"
	public final void mKW_INNER() throws RecognitionException {
		try {
			int _type = KW_INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:265:9: ( 'INNER' )
			// HiveLexer.g:265:11: 'INNER'
			{
			match("INNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INNER"

	// $ANTLR start "KW_EXCHANGE"
	public final void mKW_EXCHANGE() throws RecognitionException {
		try {
			int _type = KW_EXCHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:266:12: ( 'EXCHANGE' )
			// HiveLexer.g:266:14: 'EXCHANGE'
			{
			match("EXCHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCHANGE"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:271:5: ( '.' )
			// HiveLexer.g:271:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:272:7: ( ':' )
			// HiveLexer.g:272:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:273:7: ( ',' )
			// HiveLexer.g:273:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:274:11: ( ';' )
			// HiveLexer.g:274:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:276:8: ( '(' )
			// HiveLexer.g:276:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:277:8: ( ')' )
			// HiveLexer.g:277:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:278:9: ( '[' )
			// HiveLexer.g:278:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:279:9: ( ']' )
			// HiveLexer.g:279:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:280:8: ( '{' )
			// HiveLexer.g:280:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:281:8: ( '}' )
			// HiveLexer.g:281:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:283:7: ( '=' | '==' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='=') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='=') ) {
					alt2=2;
				}

				else {
					alt2=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// HiveLexer.g:283:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// HiveLexer.g:283:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUAL_NS"
	public final void mEQUAL_NS() throws RecognitionException {
		try {
			int _type = EQUAL_NS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:284:10: ( '<=>' )
			// HiveLexer.g:284:12: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_NS"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:285:10: ( '<>' | '!=' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='<') ) {
				alt3=1;
			}
			else if ( (LA3_0=='!') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// HiveLexer.g:285:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// HiveLexer.g:285:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:286:19: ( '<=' )
			// HiveLexer.g:286:21: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:287:10: ( '<' )
			// HiveLexer.g:287:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:288:22: ( '>=' )
			// HiveLexer.g:288:24: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:289:13: ( '>' )
			// HiveLexer.g:289:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:291:8: ( '/' )
			// HiveLexer.g:291:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:292:6: ( '+' )
			// HiveLexer.g:292:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:293:7: ( '-' )
			// HiveLexer.g:293:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:294:6: ( '*' )
			// HiveLexer.g:294:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:295:5: ( '%' )
			// HiveLexer.g:295:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:296:5: ( 'DIV' )
			// HiveLexer.g:296:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:298:11: ( '&' )
			// HiveLexer.g:298:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:299:7: ( '~' )
			// HiveLexer.g:299:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:300:11: ( '|' )
			// HiveLexer.g:300:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:301:12: ( '^' )
			// HiveLexer.g:301:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:302:10: ( '?' )
			// HiveLexer.g:302:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:303:8: ( '$' )
			// HiveLexer.g:303:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// HiveLexer.g:308:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// HiveLexer.g:313:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// HiveLexer.g:318:5: ( '0' .. '9' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// HiveLexer.g:324:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// HiveLexer.g:325:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// HiveLexer.g:325:17: ( PLUS | MINUS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='+'||LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// HiveLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// HiveLexer.g:325:33: ( Digit )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// HiveLexer.g:330:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
			// HiveLexer.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:337:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// HiveLexer.g:338:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// HiveLexer.g:338:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\'') ) {
					alt8=1;
				}
				else if ( (LA8_0=='\"') ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// HiveLexer.g:338:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// HiveLexer.g:338:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// HiveLexer.g:338:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// HiveLexer.g:338:29: ( '\\\\' . )
							{
							// HiveLexer.g:338:29: ( '\\\\' . )
							// HiveLexer.g:338:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// HiveLexer.g:339:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// HiveLexer.g:339:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// HiveLexer.g:339:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// HiveLexer.g:339:29: ( '\\\\' . )
							{
							// HiveLexer.g:339:29: ( '\\\\' . )
							// HiveLexer.g:339:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop7;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:344:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\"'||LA10_0=='\'') ) {
				alt10=1;
			}
			else if ( (LA10_0=='0') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// HiveLexer.g:345:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// HiveLexer.g:346:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// HiveLexer.g:346:15: ( HexDigit | Digit )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "BigintLiteral"
	public final void mBigintLiteral() throws RecognitionException {
		try {
			int _type = BigintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:350:5: ( ( Digit )+ 'L' )
			// HiveLexer.g:351:5: ( Digit )+ 'L'
			{
			// HiveLexer.g:351:5: ( Digit )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BigintLiteral"

	// $ANTLR start "SmallintLiteral"
	public final void mSmallintLiteral() throws RecognitionException {
		try {
			int _type = SmallintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:355:5: ( ( Digit )+ 'S' )
			// HiveLexer.g:356:5: ( Digit )+ 'S'
			{
			// HiveLexer.g:356:5: ( Digit )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SmallintLiteral"

	// $ANTLR start "TinyintLiteral"
	public final void mTinyintLiteral() throws RecognitionException {
		try {
			int _type = TinyintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:360:5: ( ( Digit )+ 'Y' )
			// HiveLexer.g:361:5: ( Digit )+ 'Y'
			{
			// HiveLexer.g:361:5: ( Digit )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match('Y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TinyintLiteral"

	// $ANTLR start "DecimalLiteral"
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:365:5: ( Number 'B' 'D' )
			// HiveLexer.g:366:5: Number 'B' 'D'
			{
			mNumber(); 

			match('B'); 
			match('D'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DecimalLiteral"

	// $ANTLR start "ByteLengthLiteral"
	public final void mByteLengthLiteral() throws RecognitionException {
		try {
			int _type = ByteLengthLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:370:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// HiveLexer.g:371:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// HiveLexer.g:371:5: ( Digit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ByteLengthLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:375:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// HiveLexer.g:376:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// HiveLexer.g:376:5: ( Digit )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// HiveLexer.g:376:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='.') ) {
				alt18=1;
			}
			else if ( (LA18_0=='E'||LA18_0=='e') ) {
				alt18=2;
			}
			switch (alt18) {
				case 1 :
					// HiveLexer.g:376:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// HiveLexer.g:376:20: ( Digit )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					// HiveLexer.g:376:29: ( Exponent )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='E'||LA17_0=='e') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// HiveLexer.g:376:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:376:43: Exponent
					{
					mExponent(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:380:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
				alt21=1;
			}
			else if ( (LA21_0=='`') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// HiveLexer.g:381:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// HiveLexer.g:381:22: ( Letter | Digit | '_' )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;
				case 2 :
					// HiveLexer.g:382:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// HiveLexer.g:382:11: ( RegexComponent )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='$'||(LA20_0 >= '(' && LA20_0 <= '+')||(LA20_0 >= '-' && LA20_0 <= '.')||(LA20_0 >= '0' && LA20_0 <= '9')||LA20_0=='?'||(LA20_0 >= 'A' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '_')||(LA20_0 >= 'a' && LA20_0 <= '}')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:386:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// HiveLexer.g:387:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// HiveLexer.g:387:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '-' && LA22_0 <= '.')||(LA22_0 >= '0' && LA22_0 <= ':')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:390:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// HiveLexer.g:390:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:394:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// HiveLexer.g:394:5: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// HiveLexer.g:394:10: (~ ( '\\n' | '\\r' ) )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop23;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_INCRE | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
		int alt24=282;
		alt24 = dfa24.predict(input);
		switch (alt24) {
			case 1 :
				// HiveLexer.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// HiveLexer.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// HiveLexer.g:1:27: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 4 :
				// HiveLexer.g:1:34: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 5 :
				// HiveLexer.g:1:41: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 6 :
				// HiveLexer.g:1:47: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 7 :
				// HiveLexer.g:1:54: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 8 :
				// HiveLexer.g:1:62: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 9 :
				// HiveLexer.g:1:68: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 10 :
				// HiveLexer.g:1:78: KW_INCRE
				{
				mKW_INCRE(); 

				}
				break;
			case 11 :
				// HiveLexer.g:1:87: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 12 :
				// HiveLexer.g:1:94: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 13 :
				// HiveLexer.g:1:102: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 14 :
				// HiveLexer.g:1:111: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 15 :
				// HiveLexer.g:1:120: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 16 :
				// HiveLexer.g:1:126: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 17 :
				// HiveLexer.g:1:136: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 18 :
				// HiveLexer.g:1:145: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 19 :
				// HiveLexer.g:1:153: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 20 :
				// HiveLexer.g:1:159: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 21 :
				// HiveLexer.g:1:169: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 22 :
				// HiveLexer.g:1:181: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 23 :
				// HiveLexer.g:1:191: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 24 :
				// HiveLexer.g:1:204: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 25 :
				// HiveLexer.g:1:213: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 26 :
				// HiveLexer.g:1:227: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 27 :
				// HiveLexer.g:1:239: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 28 :
				// HiveLexer.g:1:247: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 29 :
				// HiveLexer.g:1:255: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 30 :
				// HiveLexer.g:1:264: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 31 :
				// HiveLexer.g:1:272: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 32 :
				// HiveLexer.g:1:278: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 33 :
				// HiveLexer.g:1:291: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 34 :
				// HiveLexer.g:1:305: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 35 :
				// HiveLexer.g:1:314: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 36 :
				// HiveLexer.g:1:324: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 37 :
				// HiveLexer.g:1:335: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 38 :
				// HiveLexer.g:1:344: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 39 :
				// HiveLexer.g:1:355: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 40 :
				// HiveLexer.g:1:366: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 41 :
				// HiveLexer.g:1:379: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 42 :
				// HiveLexer.g:1:387: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 43 :
				// HiveLexer.g:1:395: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 44 :
				// HiveLexer.g:1:405: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 45 :
				// HiveLexer.g:1:418: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 46 :
				// HiveLexer.g:1:427: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 47 :
				// HiveLexer.g:1:440: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 48 :
				// HiveLexer.g:1:449: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 49 :
				// HiveLexer.g:1:460: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 50 :
				// HiveLexer.g:1:474: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 51 :
				// HiveLexer.g:1:482: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 52 :
				// HiveLexer.g:1:491: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 53 :
				// HiveLexer.g:1:499: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 54 :
				// HiveLexer.g:1:509: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 55 :
				// HiveLexer.g:1:519: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 56 :
				// HiveLexer.g:1:527: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 57 :
				// HiveLexer.g:1:537: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 58 :
				// HiveLexer.g:1:543: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 59 :
				// HiveLexer.g:1:551: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 60 :
				// HiveLexer.g:1:561: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 61 :
				// HiveLexer.g:1:573: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 62 :
				// HiveLexer.g:1:582: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 63 :
				// HiveLexer.g:1:592: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 64 :
				// HiveLexer.g:1:602: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 65 :
				// HiveLexer.g:1:611: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 66 :
				// HiveLexer.g:1:620: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 67 :
				// HiveLexer.g:1:632: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 68 :
				// HiveLexer.g:1:640: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 69 :
				// HiveLexer.g:1:650: KW_IGNORE
				{
				mKW_IGNORE(); 

				}
				break;
			case 70 :
				// HiveLexer.g:1:660: KW_PROTECTION
				{
				mKW_PROTECTION(); 

				}
				break;
			case 71 :
				// HiveLexer.g:1:674: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 72 :
				// HiveLexer.g:1:680: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 73 :
				// HiveLexer.g:1:691: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 74 :
				// HiveLexer.g:1:702: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 75 :
				// HiveLexer.g:1:713: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 76 :
				// HiveLexer.g:1:725: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 77 :
				// HiveLexer.g:1:732: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 78 :
				// HiveLexer.g:1:742: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 79 :
				// HiveLexer.g:1:751: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 80 :
				// HiveLexer.g:1:761: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 81 :
				// HiveLexer.g:1:769: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 82 :
				// HiveLexer.g:1:781: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 83 :
				// HiveLexer.g:1:794: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 84 :
				// HiveLexer.g:1:805: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 85 :
				// HiveLexer.g:1:815: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 86 :
				// HiveLexer.g:1:826: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 87 :
				// HiveLexer.g:1:835: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 88 :
				// HiveLexer.g:1:845: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 89 :
				// HiveLexer.g:1:852: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 90 :
				// HiveLexer.g:1:865: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 91 :
				// HiveLexer.g:1:875: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 92 :
				// HiveLexer.g:1:890: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 93 :
				// HiveLexer.g:1:903: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 94 :
				// HiveLexer.g:1:913: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 95 :
				// HiveLexer.g:1:921: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 96 :
				// HiveLexer.g:1:932: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 97 :
				// HiveLexer.g:1:939: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 98 :
				// HiveLexer.g:1:947: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 99 :
				// HiveLexer.g:1:957: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 100 :
				// HiveLexer.g:1:970: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 101 :
				// HiveLexer.g:1:980: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 102 :
				// HiveLexer.g:1:994: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 103 :
				// HiveLexer.g:1:1005: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 104 :
				// HiveLexer.g:1:1019: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 105 :
				// HiveLexer.g:1:1028: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 106 :
				// HiveLexer.g:1:1036: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 107 :
				// HiveLexer.g:1:1048: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 108 :
				// HiveLexer.g:1:1057: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 109 :
				// HiveLexer.g:1:1067: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 110 :
				// HiveLexer.g:1:1081: KW_SEQUENCEFILE
				{
				mKW_SEQUENCEFILE(); 

				}
				break;
			case 111 :
				// HiveLexer.g:1:1097: KW_TEXTFILE
				{
				mKW_TEXTFILE(); 

				}
				break;
			case 112 :
				// HiveLexer.g:1:1109: KW_RCFILE
				{
				mKW_RCFILE(); 

				}
				break;
			case 113 :
				// HiveLexer.g:1:1119: KW_ORCFILE
				{
				mKW_ORCFILE(); 

				}
				break;
			case 114 :
				// HiveLexer.g:1:1130: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 115 :
				// HiveLexer.g:1:1145: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 116 :
				// HiveLexer.g:1:1161: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 117 :
				// HiveLexer.g:1:1176: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 118 :
				// HiveLexer.g:1:1192: KW_OFFLINE
				{
				mKW_OFFLINE(); 

				}
				break;
			case 119 :
				// HiveLexer.g:1:1203: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 120 :
				// HiveLexer.g:1:1213: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 121 :
				// HiveLexer.g:1:1224: KW_READONLY
				{
				mKW_READONLY(); 

				}
				break;
			case 122 :
				// HiveLexer.g:1:1236: KW_NO_DROP
				{
				mKW_NO_DROP(); 

				}
				break;
			case 123 :
				// HiveLexer.g:1:1247: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 124 :
				// HiveLexer.g:1:1259: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 125 :
				// HiveLexer.g:1:1274: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 126 :
				// HiveLexer.g:1:1284: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 127 :
				// HiveLexer.g:1:1291: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 128 :
				// HiveLexer.g:1:1297: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 129 :
				// HiveLexer.g:1:1308: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 130 :
				// HiveLexer.g:1:1316: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 131 :
				// HiveLexer.g:1:1323: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 132 :
				// HiveLexer.g:1:1334: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 133 :
				// HiveLexer.g:1:1343: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 134 :
				// HiveLexer.g:1:1353: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 135 :
				// HiveLexer.g:1:1366: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 136 :
				// HiveLexer.g:1:1378: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 137 :
				// HiveLexer.g:1:1387: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 138 :
				// HiveLexer.g:1:1398: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 139 :
				// HiveLexer.g:1:1410: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 140 :
				// HiveLexer.g:1:1423: KW_PRETTY
				{
				mKW_PRETTY(); 

				}
				break;
			case 141 :
				// HiveLexer.g:1:1433: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 142 :
				// HiveLexer.g:1:1447: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 143 :
				// HiveLexer.g:1:1458: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 144 :
				// HiveLexer.g:1:1467: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 145 :
				// HiveLexer.g:1:1475: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 146 :
				// HiveLexer.g:1:1487: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 147 :
				// HiveLexer.g:1:1506: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 148 :
				// HiveLexer.g:1:1522: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 149 :
				// HiveLexer.g:1:1531: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 150 :
				// HiveLexer.g:1:1538: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 151 :
				// HiveLexer.g:1:1547: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 152 :
				// HiveLexer.g:1:1564: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 153 :
				// HiveLexer.g:1:1581: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 154 :
				// HiveLexer.g:1:1595: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 155 :
				// HiveLexer.g:1:1608: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 156 :
				// HiveLexer.g:1:1616: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 157 :
				// HiveLexer.g:1:1624: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 158 :
				// HiveLexer.g:1:1632: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 159 :
				// HiveLexer.g:1:1640: KW_END
				{
				mKW_END(); 

				}
				break;
			case 160 :
				// HiveLexer.g:1:1647: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 161 :
				// HiveLexer.g:1:1658: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 162 :
				// HiveLexer.g:1:1673: KW_HOLD_DDLTIME
				{
				mKW_HOLD_DDLTIME(); 

				}
				break;
			case 163 :
				// HiveLexer.g:1:1689: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 164 :
				// HiveLexer.g:1:1706: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 165 :
				// HiveLexer.g:1:1713: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 166 :
				// HiveLexer.g:1:1729: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 167 :
				// HiveLexer.g:1:1737: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 168 :
				// HiveLexer.g:1:1747: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 169 :
				// HiveLexer.g:1:1755: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 170 :
				// HiveLexer.g:1:1764: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 171 :
				// HiveLexer.g:1:1773: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 172 :
				// HiveLexer.g:1:1786: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 173 :
				// HiveLexer.g:1:1794: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 174 :
				// HiveLexer.g:1:1800: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 175 :
				// HiveLexer.g:1:1812: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 176 :
				// HiveLexer.g:1:1825: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 177 :
				// HiveLexer.g:1:1841: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 178 :
				// HiveLexer.g:1:1851: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 179 :
				// HiveLexer.g:1:1862: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 180 :
				// HiveLexer.g:1:1871: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 181 :
				// HiveLexer.g:1:1881: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 182 :
				// HiveLexer.g:1:1888: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 183 :
				// HiveLexer.g:1:1896: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 184 :
				// HiveLexer.g:1:1904: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 185 :
				// HiveLexer.g:1:1913: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 186 :
				// HiveLexer.g:1:1923: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 187 :
				// HiveLexer.g:1:1933: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 188 :
				// HiveLexer.g:1:1946: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 189 :
				// HiveLexer.g:1:1959: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 190 :
				// HiveLexer.g:1:1971: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 191 :
				// HiveLexer.g:1:1980: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 192 :
				// HiveLexer.g:1:1988: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 193 :
				// HiveLexer.g:1:1997: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 194 :
				// HiveLexer.g:1:2006: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 195 :
				// HiveLexer.g:1:2015: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 196 :
				// HiveLexer.g:1:2026: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 197 :
				// HiveLexer.g:1:2036: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 198 :
				// HiveLexer.g:1:2047: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 199 :
				// HiveLexer.g:1:2055: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 200 :
				// HiveLexer.g:1:2065: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 201 :
				// HiveLexer.g:1:2074: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 202 :
				// HiveLexer.g:1:2086: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 203 :
				// HiveLexer.g:1:2096: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 204 :
				// HiveLexer.g:1:2107: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 205 :
				// HiveLexer.g:1:2123: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 206 :
				// HiveLexer.g:1:2139: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 207 :
				// HiveLexer.g:1:2147: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 208 :
				// HiveLexer.g:1:2158: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 209 :
				// HiveLexer.g:1:2167: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 210 :
				// HiveLexer.g:1:2178: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 211 :
				// HiveLexer.g:1:2191: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 212 :
				// HiveLexer.g:1:2202: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 213 :
				// HiveLexer.g:1:2216: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 214 :
				// HiveLexer.g:1:2223: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 215 :
				// HiveLexer.g:1:2233: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 216 :
				// HiveLexer.g:1:2248: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 217 :
				// HiveLexer.g:1:2265: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 218 :
				// HiveLexer.g:1:2275: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 219 :
				// HiveLexer.g:1:2287: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 220 :
				// HiveLexer.g:1:2298: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 221 :
				// HiveLexer.g:1:2308: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 222 :
				// HiveLexer.g:1:2318: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 223 :
				// HiveLexer.g:1:2326: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 224 :
				// HiveLexer.g:1:2341: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 225 :
				// HiveLexer.g:1:2348: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 226 :
				// HiveLexer.g:1:2358: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 227 :
				// HiveLexer.g:1:2371: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 228 :
				// HiveLexer.g:1:2384: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 229 :
				// HiveLexer.g:1:2397: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 230 :
				// HiveLexer.g:1:2408: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 231 :
				// HiveLexer.g:1:2416: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 232 :
				// HiveLexer.g:1:2424: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 233 :
				// HiveLexer.g:1:2432: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 234 :
				// HiveLexer.g:1:2444: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 235 :
				// HiveLexer.g:1:2452: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 236 :
				// HiveLexer.g:1:2464: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 237 :
				// HiveLexer.g:1:2474: KW_PARTIALSCAN
				{
				mKW_PARTIALSCAN(); 

				}
				break;
			case 238 :
				// HiveLexer.g:1:2489: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 239 :
				// HiveLexer.g:1:2497: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 240 :
				// HiveLexer.g:1:2505: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 241 :
				// HiveLexer.g:1:2514: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 242 :
				// HiveLexer.g:1:2526: DOT
				{
				mDOT(); 

				}
				break;
			case 243 :
				// HiveLexer.g:1:2530: COLON
				{
				mCOLON(); 

				}
				break;
			case 244 :
				// HiveLexer.g:1:2536: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 245 :
				// HiveLexer.g:1:2542: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 246 :
				// HiveLexer.g:1:2552: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 247 :
				// HiveLexer.g:1:2559: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 248 :
				// HiveLexer.g:1:2566: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 249 :
				// HiveLexer.g:1:2574: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 250 :
				// HiveLexer.g:1:2582: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 251 :
				// HiveLexer.g:1:2589: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 252 :
				// HiveLexer.g:1:2596: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 253 :
				// HiveLexer.g:1:2602: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 254 :
				// HiveLexer.g:1:2611: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 255 :
				// HiveLexer.g:1:2620: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 256 :
				// HiveLexer.g:1:2638: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 257 :
				// HiveLexer.g:1:2647: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 258 :
				// HiveLexer.g:1:2668: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 259 :
				// HiveLexer.g:1:2680: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 260 :
				// HiveLexer.g:1:2687: PLUS
				{
				mPLUS(); 

				}
				break;
			case 261 :
				// HiveLexer.g:1:2692: MINUS
				{
				mMINUS(); 

				}
				break;
			case 262 :
				// HiveLexer.g:1:2698: STAR
				{
				mSTAR(); 

				}
				break;
			case 263 :
				// HiveLexer.g:1:2703: MOD
				{
				mMOD(); 

				}
				break;
			case 264 :
				// HiveLexer.g:1:2707: DIV
				{
				mDIV(); 

				}
				break;
			case 265 :
				// HiveLexer.g:1:2711: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 266 :
				// HiveLexer.g:1:2721: TILDE
				{
				mTILDE(); 

				}
				break;
			case 267 :
				// HiveLexer.g:1:2727: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 268 :
				// HiveLexer.g:1:2737: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 269 :
				// HiveLexer.g:1:2748: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 270 :
				// HiveLexer.g:1:2757: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 271 :
				// HiveLexer.g:1:2764: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 272 :
				// HiveLexer.g:1:2778: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 273 :
				// HiveLexer.g:1:2793: BigintLiteral
				{
				mBigintLiteral(); 

				}
				break;
			case 274 :
				// HiveLexer.g:1:2807: SmallintLiteral
				{
				mSmallintLiteral(); 

				}
				break;
			case 275 :
				// HiveLexer.g:1:2823: TinyintLiteral
				{
				mTinyintLiteral(); 

				}
				break;
			case 276 :
				// HiveLexer.g:1:2838: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 277 :
				// HiveLexer.g:1:2853: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 278 :
				// HiveLexer.g:1:2871: Number
				{
				mNumber(); 

				}
				break;
			case 279 :
				// HiveLexer.g:1:2878: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 280 :
				// HiveLexer.g:1:2889: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 281 :
				// HiveLexer.g:1:2901: WS
				{
				mWS(); 

				}
				break;
			case 282 :
				// HiveLexer.g:1:2904: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA24 dfa24 = new DFA24(this);
	static final String DFA24_eotS =
		"\1\uffff\5\64\1\124\21\64\1\u009c\13\uffff\1\u009e\1\u00a0\2\uffff\1\u00a2"+
		"\11\uffff\2\u00b0\3\uffff\2\64\1\u00b8\15\64\1\u00d0\3\64\1\u00d7\2\64"+
		"\1\u00da\1\u00dc\3\64\2\uffff\4\64\1\u00ec\1\u00f3\1\64\1\u00f5\16\64"+
		"\1\u010f\55\64\4\uffff\1\u0160\7\uffff\1\u0162\2\uffff\1\u0162\1\64\1"+
		"\u0165\1\u00b0\1\u0166\1\u0167\1\u00b0\1\64\1\uffff\2\u016e\5\64\1\uffff"+
		"\17\64\1\u0185\2\64\1\u0188\1\64\1\u018a\1\64\1\u018c\1\uffff\3\64\1\u0190"+
		"\1\64\1\u0192\1\uffff\1\64\1\u0196\1\uffff\1\64\1\uffff\1\64\1\124\15"+
		"\64\1\uffff\4\64\1\u01ae\1\64\1\uffff\1\64\1\uffff\11\64\1\u01bc\10\64"+
		"\1\u01c7\6\64\1\uffff\20\64\1\u01e1\11\64\1\u01ed\10\64\1\u01f9\1\u01fb"+
		"\22\64\1\u0213\17\64\1\u022b\7\64\5\uffff\1\u0233\3\uffff\1\u00b0\3\uffff"+
		"\1\u00b0\1\u016a\1\uffff\1\u0238\13\64\1\u0244\1\64\1\u0246\1\u0247\6"+
		"\64\1\uffff\2\64\1\uffff\1\64\1\uffff\1\64\1\uffff\3\64\1\uffff\1\64\1"+
		"\uffff\1\u0257\2\64\1\uffff\4\64\1\u025e\1\u025f\2\64\1\u0262\1\u0263"+
		"\1\64\1\u0267\1\u0268\1\64\1\u026a\6\64\1\u0271\1\64\1\uffff\15\64\1\uffff"+
		"\1\u0281\1\u0283\10\64\1\uffff\1\u028e\1\u0290\1\u0291\5\64\1\u0297\10"+
		"\64\1\u02a0\1\64\1\u02a2\4\64\1\u02a7\1\uffff\1\u02a8\1\u02aa\1\64\1\u02ad"+
		"\7\64\1\uffff\5\64\1\u02ba\4\64\1\u02bf\1\uffff\1\64\1\uffff\10\64\1\u02c9"+
		"\1\64\1\u02cb\6\64\1\u02d4\4\64\1\u02d9\1\uffff\1\64\1\u02db\15\64\1\u02e9"+
		"\1\u02ea\3\64\1\u02ee\1\u02ef\1\64\1\uffff\3\64\1\u02f4\1\64\1\u02f6\1"+
		"\u02f7\2\uffff\2\u00b0\1\64\1\uffff\3\64\1\u02fc\1\u02fd\6\64\1\uffff"+
		"\1\u0304\2\uffff\1\64\1\u0306\2\64\1\u0309\2\64\1\u030c\1\u030d\1\64\1"+
		"\u030f\1\u0310\1\64\1\u0312\1\64\1\uffff\1\u0314\5\64\2\uffff\1\u031a"+
		"\1\u031b\2\uffff\1\u031c\1\64\1\u031e\2\uffff\1\64\1\uffff\3\64\1\u0324"+
		"\2\64\1\uffff\1\64\1\u0329\2\64\1\u032c\12\64\1\uffff\1\64\1\uffff\12"+
		"\64\1\uffff\1\64\2\uffff\2\64\1\u0346\1\u0347\1\64\1\uffff\7\64\1\u0350"+
		"\1\uffff\1\u0351\1\uffff\3\64\1\u0356\2\uffff\1\64\1\uffff\2\64\1\uffff"+
		"\11\64\1\u0364\1\u0365\1\64\1\uffff\3\64\1\u036a\1\uffff\11\64\1\uffff"+
		"\1\u0375\1\uffff\1\u0376\6\64\1\u037d\1\uffff\4\64\1\uffff\1\64\1\uffff"+
		"\1\64\1\u0384\1\u0385\10\64\1\u038e\1\64\2\uffff\3\64\2\uffff\1\64\1\u0394"+
		"\1\64\1\u0396\1\uffff\1\64\2\uffff\3\64\1\u039c\2\uffff\6\64\1\uffff\1"+
		"\64\1\uffff\1\u03a4\1\64\1\uffff\1\u03a7\1\64\2\uffff\1\64\2\uffff\1\64"+
		"\1\uffff\1\64\1\uffff\2\64\1\u03af\1\64\1\u03b1\3\uffff\1\64\1\uffff\3"+
		"\64\1\u03b6\1\64\1\uffff\1\u03b8\3\64\1\uffff\1\u03bc\1\u03bd\1\uffff"+
		"\1\64\1\u03bf\1\u03c0\6\64\1\u03c7\3\64\1\u03cb\10\64\1\u03d4\2\64\2\uffff"+
		"\1\64\1\u03d8\1\u03d9\1\u03db\1\u03dc\1\64\1\u03de\1\64\2\uffff\1\u03e0"+
		"\1\u03e1\2\64\1\uffff\1\64\1\u03e5\1\u03e6\1\64\1\u03e8\1\u03e9\1\64\1"+
		"\u03eb\1\64\1\u03ee\1\u03ef\2\64\2\uffff\1\64\1\u03f3\2\64\1\uffff\1\64"+
		"\1\u03f7\1\64\1\u03f9\6\64\2\uffff\1\64\1\u0401\1\64\1\u0403\1\u0404\1"+
		"\64\1\uffff\1\u0406\1\u0407\2\64\1\u040b\1\u040c\2\uffff\1\u040e\6\64"+
		"\1\u0415\1\uffff\1\u0416\1\64\1\u0418\2\64\1\uffff\1\64\1\uffff\3\64\1"+
		"\u041f\1\64\1\uffff\1\u0421\6\64\1\uffff\2\64\1\uffff\1\64\1\u042b\1\u042c"+
		"\3\64\1\u0430\1\uffff\1\u0431\1\uffff\1\64\1\u0433\1\u0434\1\64\1\uffff"+
		"\1\u0436\1\uffff\3\64\2\uffff\1\64\2\uffff\1\u043b\4\64\1\u0440\1\uffff"+
		"\1\64\1\u0442\1\64\1\uffff\4\64\1\u0448\3\64\1\uffff\2\64\1\u044e\2\uffff"+
		"\1\u044f\2\uffff\1\u0450\1\uffff\1\64\2\uffff\3\64\2\uffff\1\64\2\uffff"+
		"\1\64\1\uffff\1\64\1\u0458\2\uffff\3\64\1\uffff\3\64\1\uffff\1\64\1\uffff"+
		"\5\64\1\u0465\1\u0466\1\uffff\1\u0467\2\uffff\1\64\2\uffff\3\64\2\uffff"+
		"\1\u046c\1\uffff\1\64\1\u046e\1\u046f\2\64\1\u0474\2\uffff\1\u0475\1\uffff"+
		"\1\u0476\1\u0477\1\64\1\u0479\1\u047a\1\64\1\uffff\1\64\1\uffff\2\64\1"+
		"\u047f\2\64\1\u0483\3\64\2\uffff\3\64\2\uffff\1\u048a\2\uffff\1\64\1\uffff"+
		"\4\64\1\uffff\1\u0490\1\u0491\1\64\1\u0493\1\uffff\1\u0494\1\uffff\2\64"+
		"\1\u0497\1\u0498\1\64\1\uffff\1\64\1\u049d\1\u049e\1\64\1\u04a0\3\uffff"+
		"\4\64\1\u04a5\2\64\1\uffff\2\64\1\u04aa\3\64\1\u04ae\5\64\3\uffff\1\u04b4"+
		"\2\64\1\u04b7\1\uffff\1\64\2\uffff\1\u04b9\3\64\4\uffff\1\64\2\uffff\1"+
		"\u04be\1\64\1\u04c0\1\64\1\uffff\1\u04c2\1\64\1\u04c4\1\uffff\1\64\1\u04c6"+
		"\1\u04c7\1\u04c8\2\64\1\uffff\3\64\1\u04ce\1\64\2\uffff\1\u04d0\2\uffff"+
		"\1\u04d1\1\64\2\uffff\1\64\1\u04d4\1\64\1\u04d6\2\uffff\1\64\1\uffff\4"+
		"\64\1\uffff\3\64\1\u04df\1\uffff\1\u04e0\1\u04e1\1\64\1\uffff\1\u04e3"+
		"\1\64\1\u04e5\1\u04e8\1\64\1\uffff\2\64\1\uffff\1\64\1\uffff\1\64\1\u04ee"+
		"\2\64\1\uffff\1\64\1\uffff\1\u04f2\1\uffff\1\64\1\uffff\1\u04f4\3\uffff"+
		"\5\64\1\uffff\1\64\2\uffff\1\u04fb\1\u04fc\1\uffff\1\64\1\uffff\6\64\1"+
		"\u0504\1\u0505\3\uffff\1\64\1\uffff\1\u0507\1\uffff\1\u0508\1\64\1\uffff"+
		"\3\64\1\u050d\1\64\1\uffff\2\64\1\u0511\1\uffff\1\64\1\uffff\2\64\1\u0515"+
		"\1\u0516\1\u0517\1\64\2\uffff\1\u0519\5\64\1\u051f\2\uffff\1\64\2\uffff"+
		"\1\u0521\1\u0522\2\64\1\uffff\1\u0525\2\64\1\uffff\1\64\1\u0529\1\u052a"+
		"\3\uffff\1\64\1\uffff\1\u052c\1\u052d\1\u052e\2\64\1\uffff\1\u0531\2\uffff"+
		"\1\u0532\1\u0533\1\uffff\1\64\1\u0535\1\u0536\2\uffff\1\u0537\3\uffff"+
		"\1\64\1\u0539\3\uffff\1\u053a\3\uffff\1\64\2\uffff\1\u053c\1\uffff";
	static final String DFA24_eofS =
		"\u053d\uffff";
	static final String DFA24_minS =
		"\1\11\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\114\1\101\1\122\1\105"+
		"\1\101\1\110\1\103\1\116\1\101\1\117\4\101\2\105\13\uffff\2\75\2\uffff"+
		"\1\55\7\uffff\2\0\2\56\3\uffff\1\101\1\102\1\60\2\115\1\114\1\105\1\114"+
		"\1\117\1\114\1\105\1\117\1\114\1\124\1\114\1\101\1\60\1\124\1\103\1\104"+
		"\1\60\1\105\1\124\2\60\1\124\1\123\1\114\2\uffff\1\113\1\106\1\101\1\124"+
		"\2\60\1\120\1\60\1\116\1\105\1\130\2\103\1\101\1\123\1\103\1\122\1\124"+
		"\1\117\1\125\1\120\1\101\1\60\1\117\1\107\1\103\1\106\1\126\1\114\1\105"+
		"\1\116\1\114\1\101\1\122\2\101\1\110\1\114\1\105\1\101\1\105\1\103\1\104"+
		"\1\105\2\122\1\125\1\122\1\111\1\107\1\101\1\114\1\106\1\111\1\116\1\114"+
		"\1\125\1\105\1\101\1\123\1\102\2\103\1\116\2\122\1\105\1\131\4\uffff\1"+
		"\76\5\uffff\2\0\1\42\2\0\1\42\2\60\1\56\3\60\1\53\1\uffff\2\60\1\105\1"+
		"\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1\123"+
		"\1\115\1\114\1\103\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\60\1\105"+
		"\1\60\1\114\1\60\1\uffff\1\105\1\101\1\110\1\60\1\105\1\60\1\uffff\1\122"+
		"\1\60\1\uffff\1\114\1\uffff\1\111\1\60\1\104\1\103\1\114\2\105\1\111\1"+
		"\124\1\123\1\101\1\104\1\111\1\107\1\105\1\uffff\1\122\2\105\1\101\1\60"+
		"\1\105\1\uffff\1\117\1\uffff\1\117\1\115\1\120\1\123\1\114\1\105\1\110"+
		"\1\101\1\102\1\60\1\105\1\103\1\111\3\105\1\101\1\105\1\60\1\101\1\120"+
		"\1\102\1\122\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1"+
		"\127\1\111\1\104\1\116\1\114\1\110\1\104\1\105\1\125\1\104\1\60\1\111"+
		"\1\127\1\122\1\124\1\114\1\105\1\122\1\124\1\105\1\60\1\127\1\117\1\105"+
		"\2\117\1\122\1\117\1\116\2\60\1\101\2\103\1\124\1\103\1\123\1\107\1\116"+
		"\1\110\1\125\2\101\1\125\1\104\1\105\2\117\1\124\1\60\1\105\1\111\1\113"+
		"\1\107\1\114\1\115\1\103\1\123\1\101\1\123\1\116\1\103\1\122\1\105\1\113"+
		"\1\60\1\122\1\105\1\125\1\105\1\103\1\127\1\123\2\uffff\1\0\1\uffff\1"+
		"\0\1\60\3\uffff\1\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\107"+
		"\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1\122\1\60\1\105\2\60\2\124"+
		"\1\104\1\106\1\124\1\101\1\uffff\1\117\1\110\1\uffff\1\122\1\uffff\1\131"+
		"\1\uffff\1\122\1\131\1\111\1\uffff\1\122\1\uffff\1\60\1\122\1\125\1\uffff"+
		"\1\111\1\117\1\122\1\101\2\60\1\123\1\124\2\60\1\114\2\60\1\103\1\60\1"+
		"\122\1\105\1\122\1\130\2\124\1\60\1\122\1\uffff\3\122\1\123\1\122\1\124"+
		"\1\122\1\101\1\116\1\125\1\101\1\120\1\114\1\uffff\2\60\2\115\1\124\1"+
		"\116\1\122\1\111\1\102\1\103\1\uffff\3\60\1\114\1\117\1\120\1\124\1\105"+
		"\1\60\1\116\1\122\1\105\1\122\1\105\1\116\1\137\1\105\1\60\1\105\1\60"+
		"\1\117\1\103\2\105\1\60\1\uffff\2\60\1\105\1\60\1\114\1\116\1\103\1\101"+
		"\1\105\1\111\1\115\1\uffff\1\105\1\125\1\116\1\124\1\107\1\60\2\103\1"+
		"\125\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\105\1\124\3\105\1\111\1"+
		"\105\1\60\1\105\1\60\1\124\2\111\1\101\1\115\1\103\1\60\1\130\1\113\2"+
		"\122\1\60\1\uffff\1\125\1\60\1\114\2\105\1\115\2\105\1\125\1\111\1\101"+
		"\2\124\1\123\1\107\2\60\1\101\1\117\1\105\2\60\1\117\1\uffff\1\117\1\122"+
		"\1\123\1\60\1\110\2\60\1\uffff\3\60\1\104\1\uffff\1\101\1\106\1\105\2"+
		"\60\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60"+
		"\1\123\1\117\1\60\1\124\1\127\2\60\1\132\2\60\1\126\1\60\1\122\1\uffff"+
		"\1\60\1\124\2\116\1\117\1\116\2\uffff\2\60\2\uffff\1\60\1\111\1\60\2\uffff"+
		"\1\101\1\uffff\1\101\1\115\1\124\1\60\1\110\1\104\1\uffff\1\123\1\60\1"+
		"\124\1\105\1\60\1\117\1\123\1\124\1\111\1\116\1\104\1\123\1\116\2\105"+
		"\1\uffff\1\111\1\uffff\1\101\1\111\1\105\1\104\1\122\1\116\1\111\1\114"+
		"\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\120\2\60\1\101\1\uffff\1\124"+
		"\1\131\1\124\2\105\1\107\1\104\1\60\1\uffff\1\60\1\uffff\1\127\1\124\1"+
		"\116\1\60\2\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115"+
		"\1\104\1\123\1\101\1\104\1\105\2\60\1\116\1\uffff\1\113\1\110\1\116\1"+
		"\60\1\uffff\1\115\1\105\1\122\1\131\1\104\1\103\1\104\1\101\1\116\1\uffff"+
		"\1\60\1\uffff\1\60\1\114\1\122\1\103\2\105\1\116\1\60\1\uffff\1\120\1"+
		"\105\1\104\1\111\1\uffff\1\120\1\uffff\1\105\2\60\1\116\1\103\1\116\1"+
		"\124\1\116\1\124\2\105\1\60\1\105\2\uffff\1\104\1\122\1\116\2\uffff\1"+
		"\111\1\60\1\111\1\60\1\uffff\1\101\2\uffff\1\124\1\117\1\122\1\60\2\uffff"+
		"\1\124\2\101\1\114\1\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\1\uffff"+
		"\1\60\1\111\2\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\uffff\1\104\1"+
		"\105\1\60\1\120\1\60\3\uffff\1\117\1\uffff\2\114\1\105\1\60\1\123\1\uffff"+
		"\1\60\1\117\1\122\1\105\1\uffff\2\60\1\uffff\1\120\2\60\1\116\1\101\1"+
		"\105\1\111\1\107\1\104\1\60\1\102\1\114\1\124\1\60\2\105\1\103\1\102\1"+
		"\105\1\117\1\123\1\115\1\60\1\105\1\116\2\uffff\1\116\4\60\1\116\1\60"+
		"\1\104\2\uffff\2\60\1\103\1\122\1\uffff\1\101\2\60\1\116\2\60\1\124\1"+
		"\60\1\124\2\60\1\112\1\131\2\uffff\1\105\1\60\1\111\1\104\1\uffff\1\105"+
		"\1\60\1\126\1\60\1\111\1\124\1\125\1\111\1\114\1\124\2\uffff\1\104\1\60"+
		"\1\105\2\60\1\114\1\uffff\2\60\1\122\1\103\2\60\2\uffff\1\60\2\124\1\105"+
		"\1\125\1\105\1\122\1\60\1\uffff\1\60\1\105\1\60\1\124\1\116\1\uffff\1"+
		"\101\1\uffff\1\122\1\105\1\122\1\60\1\115\1\uffff\1\60\1\115\1\124\1\105"+
		"\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\116\2\60\1\124\1\117"+
		"\1\122\1\60\1\uffff\1\60\1\uffff\1\116\2\60\1\116\1\uffff\1\60\1\uffff"+
		"\1\122\1\111\1\103\2\uffff\1\105\2\uffff\1\60\1\114\1\104\1\126\1\105"+
		"\1\60\1\uffff\1\105\1\60\1\105\1\uffff\1\116\1\104\1\124\1\125\1\60\1"+
		"\122\2\105\1\uffff\1\122\1\107\1\60\2\uffff\1\60\2\uffff\1\60\1\uffff"+
		"\1\114\2\uffff\1\105\1\117\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1"+
		"\111\1\60\2\uffff\1\117\1\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff"+
		"\1\105\1\uffff\1\116\1\111\1\122\1\117\1\123\2\60\1\uffff\1\60\2\uffff"+
		"\1\131\2\uffff\1\105\1\122\1\124\2\uffff\1\60\1\uffff\1\111\2\60\1\105"+
		"\1\116\1\60\2\uffff\1\60\1\uffff\2\60\1\114\2\60\1\115\1\uffff\1\120\1"+
		"\uffff\1\120\1\105\1\60\1\131\1\122\1\60\1\101\1\104\1\107\2\uffff\1\105"+
		"\1\122\1\111\2\uffff\1\60\2\uffff\1\124\1\uffff\1\115\1\126\1\124\1\122"+
		"\1\uffff\2\60\1\105\1\60\1\uffff\1\60\1\uffff\1\104\1\103\2\60\1\124\1"+
		"\uffff\1\111\2\60\1\124\1\60\3\uffff\1\124\1\106\1\120\1\101\1\60\1\102"+
		"\1\103\1\uffff\1\111\1\105\1\60\1\105\1\104\1\124\1\60\1\107\1\117\1\105"+
		"\1\116\1\103\3\uffff\1\60\1\101\1\111\1\60\1\uffff\1\117\2\uffff\1\60"+
		"\1\101\1\104\1\124\4\uffff\1\111\2\uffff\1\60\1\114\1\60\1\104\1\uffff"+
		"\1\60\1\124\1\60\1\uffff\1\124\3\60\1\115\1\126\1\uffff\2\101\1\105\1"+
		"\60\1\124\2\uffff\1\60\2\uffff\1\60\1\131\2\uffff\1\105\1\60\1\105\1\60"+
		"\2\uffff\1\111\1\uffff\2\111\1\105\1\102\1\uffff\1\114\1\123\1\116\1\60"+
		"\1\uffff\2\60\1\101\1\uffff\1\60\1\116\2\60\1\101\1\uffff\1\104\1\124"+
		"\1\uffff\1\116\1\uffff\1\124\1\60\1\101\1\132\1\uffff\1\105\1\uffff\1"+
		"\60\1\uffff\1\111\1\uffff\1\60\3\uffff\1\101\1\105\1\114\1\124\1\122\1"+
		"\uffff\1\111\2\uffff\2\60\1\uffff\1\123\1\uffff\1\105\1\115\1\114\1\122"+
		"\1\101\1\105\2\60\3\uffff\1\115\1\uffff\1\60\1\uffff\1\60\1\104\1\uffff"+
		"\1\116\2\105\1\60\1\105\1\uffff\1\124\1\105\1\60\1\uffff\1\105\1\uffff"+
		"\1\124\1\122\3\60\1\105\2\uffff\1\60\1\123\2\105\1\124\1\123\1\60\2\uffff"+
		"\1\120\2\uffff\2\60\2\122\1\uffff\1\60\1\125\1\104\1\uffff\1\123\2\60"+
		"\3\uffff\1\123\1\uffff\3\60\1\111\1\105\1\uffff\1\60\2\uffff\2\60\1\uffff"+
		"\1\123\2\60\2\uffff\1\60\3\uffff\1\105\1\60\3\uffff\1\60\3\uffff\1\123"+
		"\2\uffff\1\60\1\uffff";
	static final String DFA24_maxS =
		"\1\176\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\1\130\2\122\1\131"+
		"\1\117\1\111\2\124\1\125\2\117\1\125\1\123\1\111\1\105\1\126\13\uffff"+
		"\1\76\1\75\2\uffff\1\55\7\uffff\2\uffff\2\172\3\uffff\1\125\1\102\1\172"+
		"\1\116\1\130\1\114\1\105\1\114\1\117\1\116\1\122\1\117\1\122\2\124\1\104"+
		"\1\172\1\124\1\122\1\104\1\172\1\105\1\124\2\172\1\124\1\137\1\114\2\uffff"+
		"\1\116\1\123\1\116\1\124\2\172\1\120\1\172\1\116\1\105\1\130\1\124\1\103"+
		"\1\104\2\123\1\126\1\124\1\117\1\125\1\120\1\117\1\172\1\124\1\116\1\103"+
		"\1\124\1\126\1\114\1\111\2\124\1\117\1\122\1\101\1\122\1\110\1\114\1\105"+
		"\1\123\1\111\1\103\1\104\1\117\2\122\1\125\1\122\1\111\1\107\1\126\1\127"+
		"\1\106\1\111\2\116\1\125\1\117\1\101\1\123\1\122\1\103\1\124\1\116\2\122"+
		"\1\105\1\131\4\uffff\1\76\5\uffff\2\uffff\1\47\2\uffff\1\47\1\146\4\172"+
		"\1\145\1\71\1\uffff\2\172\2\116\1\107\1\114\1\103\1\uffff\1\131\1\105"+
		"\1\115\1\124\2\120\1\116\1\123\1\115\1\114\1\103\1\123\1\114\1\105\1\101"+
		"\1\172\1\114\1\103\1\172\1\105\1\172\1\114\1\172\1\uffff\1\105\1\101\1"+
		"\110\1\172\1\105\1\172\1\uffff\1\122\1\172\1\uffff\1\114\1\uffff\1\111"+
		"\1\172\1\104\1\103\1\114\2\105\1\111\1\124\1\123\1\113\1\104\1\111\1\107"+
		"\1\105\1\uffff\1\122\2\105\1\125\1\172\1\105\1\uffff\1\117\1\uffff\1\117"+
		"\1\115\1\120\1\123\1\117\1\105\1\114\1\101\1\102\1\172\1\105\1\103\2\111"+
		"\2\105\1\124\1\105\1\172\1\105\1\120\1\102\1\122\1\125\1\116\1\uffff\1"+
		"\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111\1\104\1\122\1\114\1\110"+
		"\1\104\1\105\1\125\1\104\1\172\1\111\1\127\1\122\1\124\1\114\1\125\1\122"+
		"\1\124\1\105\1\172\1\127\1\121\1\111\2\117\1\122\1\117\1\116\2\172\1\101"+
		"\3\124\1\103\1\123\1\107\1\116\1\110\1\125\1\114\1\101\1\125\1\104\1\105"+
		"\2\117\1\124\1\172\1\114\1\111\1\113\1\107\1\125\1\120\1\124\1\123\1\101"+
		"\1\123\1\116\1\124\1\123\1\105\1\113\1\172\1\122\1\105\1\125\1\105\1\103"+
		"\1\127\1\123\2\uffff\1\uffff\1\uffff\1\uffff\1\172\3\uffff\1\145\1\71"+
		"\1\uffff\1\71\2\172\1\uffff\1\172\1\103\1\123\1\107\1\105\1\110\1\111"+
		"\1\123\1\111\1\106\1\117\1\122\1\172\1\105\2\172\2\124\1\104\1\106\1\124"+
		"\1\101\1\uffff\1\117\1\110\1\uffff\1\122\1\uffff\1\131\1\uffff\1\122\1"+
		"\131\1\111\1\uffff\1\122\1\uffff\1\172\1\122\1\125\1\uffff\1\111\1\117"+
		"\1\122\1\101\2\172\1\123\1\124\2\172\1\124\2\172\1\103\1\172\1\122\1\105"+
		"\1\122\1\130\2\124\1\172\1\122\1\uffff\3\122\1\123\1\122\1\124\1\122\1"+
		"\101\1\122\1\125\1\101\1\120\1\114\1\uffff\2\172\2\115\1\124\1\116\2\122"+
		"\1\102\1\103\1\uffff\3\172\1\114\1\117\1\120\1\124\1\105\1\172\1\116\1"+
		"\122\1\105\1\122\1\105\1\116\1\137\1\105\1\172\1\105\1\172\1\117\1\103"+
		"\2\105\1\172\1\uffff\2\172\1\105\1\172\1\114\1\116\1\103\1\101\1\105\1"+
		"\111\1\115\1\uffff\1\105\1\125\1\116\1\124\1\107\1\172\2\103\1\125\1\107"+
		"\1\172\1\uffff\1\124\1\uffff\1\124\1\105\1\124\3\105\1\111\1\105\1\172"+
		"\1\105\1\172\1\124\2\111\1\101\1\115\1\103\1\172\1\130\1\113\2\122\1\172"+
		"\1\uffff\1\125\1\172\1\114\2\105\1\115\2\105\1\125\1\111\1\101\2\124\1"+
		"\123\1\107\2\172\1\101\1\117\1\105\2\172\1\117\1\uffff\1\117\1\122\1\123"+
		"\1\172\1\110\2\172\1\uffff\1\71\2\102\1\104\1\uffff\1\101\1\106\1\105"+
		"\2\172\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\172\2\uffff\1\111"+
		"\1\172\1\123\1\117\1\172\1\124\1\127\2\172\1\132\2\172\1\126\1\172\1\122"+
		"\1\uffff\1\172\1\124\2\116\1\117\1\116\2\uffff\2\172\2\uffff\1\172\1\111"+
		"\1\172\2\uffff\1\101\1\uffff\1\101\1\115\1\124\1\172\1\110\1\106\1\uffff"+
		"\1\123\1\172\1\124\1\105\1\172\1\117\1\123\1\124\1\111\1\116\1\104\1\123"+
		"\1\116\2\105\1\uffff\1\111\1\uffff\1\101\1\111\1\105\1\104\1\122\1\116"+
		"\1\111\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\120\2\172\1\101"+
		"\1\uffff\1\124\1\131\1\124\2\105\1\107\1\104\1\172\1\uffff\1\172\1\uffff"+
		"\1\127\1\124\1\116\1\172\2\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107"+
		"\1\124\1\115\1\104\1\123\1\101\1\104\1\105\2\172\1\116\1\uffff\1\113\1"+
		"\110\1\116\1\172\1\uffff\1\115\1\105\1\122\1\131\1\104\1\103\1\104\1\124"+
		"\1\116\1\uffff\1\172\1\uffff\1\172\1\114\1\122\1\103\2\105\1\116\1\172"+
		"\1\uffff\1\120\1\105\1\104\1\111\1\uffff\1\120\1\uffff\1\105\2\172\1\116"+
		"\1\103\1\116\1\124\1\116\1\124\2\105\1\172\1\105\2\uffff\1\104\1\122\1"+
		"\116\2\uffff\1\111\1\172\1\111\1\172\1\uffff\1\101\2\uffff\1\124\1\117"+
		"\1\122\1\172\2\uffff\1\124\2\101\1\114\1\101\1\120\1\uffff\1\117\1\uffff"+
		"\1\172\1\122\1\uffff\1\172\1\111\2\uffff\1\105\2\uffff\1\105\1\uffff\1"+
		"\111\1\uffff\1\106\1\105\1\172\1\120\1\172\3\uffff\1\117\1\uffff\2\114"+
		"\1\105\1\172\1\123\1\uffff\1\172\1\117\1\122\1\105\1\uffff\2\172\1\uffff"+
		"\1\120\2\172\1\116\1\101\1\105\1\111\1\107\1\104\1\172\1\102\1\114\1\124"+
		"\1\172\2\105\1\103\1\102\1\105\1\117\1\123\1\115\1\172\1\105\1\116\2\uffff"+
		"\1\116\4\172\1\116\1\172\1\104\2\uffff\2\172\1\103\1\122\1\uffff\1\101"+
		"\2\172\1\116\2\172\1\124\1\172\1\124\2\172\1\112\1\131\2\uffff\1\105\1"+
		"\172\1\111\1\104\1\uffff\1\105\1\172\1\126\1\172\1\111\1\124\1\125\1\111"+
		"\1\114\1\124\2\uffff\1\104\1\172\1\105\2\172\1\114\1\uffff\2\172\1\127"+
		"\1\103\2\172\2\uffff\1\172\2\124\1\105\1\125\1\105\1\122\1\172\1\uffff"+
		"\1\172\1\105\1\172\1\124\1\116\1\uffff\1\101\1\uffff\1\122\1\105\1\122"+
		"\1\172\1\115\1\uffff\1\172\1\115\1\124\1\105\1\122\1\105\1\116\1\uffff"+
		"\1\115\1\105\1\uffff\1\116\2\172\1\124\1\117\1\122\1\172\1\uffff\1\172"+
		"\1\uffff\1\116\2\172\1\116\1\uffff\1\172\1\uffff\1\122\1\111\1\103\2\uffff"+
		"\1\105\2\uffff\1\172\1\114\1\104\1\126\1\105\1\172\1\uffff\1\105\1\172"+
		"\1\105\1\uffff\1\116\1\104\1\124\1\125\1\172\1\122\2\105\1\uffff\1\122"+
		"\1\107\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\114\2\uffff\1\105\1"+
		"\117\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111\1\172\2\uffff\1\117"+
		"\1\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff\1\105\1\uffff\1\116\1\111"+
		"\1\122\1\117\1\123\2\172\1\uffff\1\172\2\uffff\1\131\2\uffff\1\105\1\122"+
		"\1\124\2\uffff\1\172\1\uffff\1\111\2\172\1\105\1\116\1\172\2\uffff\1\172"+
		"\1\uffff\2\172\1\114\2\172\1\115\1\uffff\1\120\1\uffff\1\120\1\105\1\172"+
		"\1\131\1\122\1\172\1\101\1\104\1\107\2\uffff\1\105\1\122\1\111\2\uffff"+
		"\1\172\2\uffff\1\124\1\uffff\1\115\1\126\1\124\1\122\1\uffff\2\172\1\105"+
		"\1\172\1\uffff\1\172\1\uffff\1\104\1\103\2\172\1\124\1\uffff\1\131\2\172"+
		"\1\124\1\172\3\uffff\1\124\1\106\1\120\1\101\1\172\1\102\1\103\1\uffff"+
		"\1\111\1\105\1\172\1\105\1\104\1\124\1\172\1\107\1\117\1\105\1\116\1\103"+
		"\3\uffff\1\172\1\101\1\111\1\172\1\uffff\1\117\2\uffff\1\172\1\101\1\104"+
		"\1\124\4\uffff\1\111\2\uffff\1\172\1\114\1\172\1\104\1\uffff\1\172\1\124"+
		"\1\172\1\uffff\1\124\3\172\1\115\1\126\1\uffff\2\101\1\105\1\172\1\124"+
		"\2\uffff\1\172\2\uffff\1\172\1\131\2\uffff\1\105\1\172\1\105\1\172\2\uffff"+
		"\1\111\1\uffff\2\111\1\105\1\102\1\uffff\1\114\1\123\1\116\1\172\1\uffff"+
		"\2\172\1\101\1\uffff\1\172\1\116\2\172\1\101\1\uffff\1\104\1\124\1\uffff"+
		"\1\116\1\uffff\1\124\1\172\1\101\1\132\1\uffff\1\105\1\uffff\1\172\1\uffff"+
		"\1\111\1\uffff\1\172\3\uffff\1\101\1\105\1\114\1\124\1\122\1\uffff\1\111"+
		"\2\uffff\2\172\1\uffff\1\123\1\uffff\1\105\1\115\1\114\1\122\1\101\1\105"+
		"\2\172\3\uffff\1\115\1\uffff\1\172\1\uffff\1\172\1\104\1\uffff\1\116\2"+
		"\105\1\172\1\105\1\uffff\1\124\1\105\1\172\1\uffff\1\105\1\uffff\1\124"+
		"\1\122\3\172\1\105\2\uffff\1\172\1\123\2\105\1\124\1\123\1\172\2\uffff"+
		"\1\120\2\uffff\2\172\2\122\1\uffff\1\172\1\125\1\104\1\uffff\1\123\2\172"+
		"\3\uffff\1\123\1\uffff\3\172\1\111\1\105\1\uffff\1\172\2\uffff\2\172\1"+
		"\uffff\1\123\2\172\2\uffff\1\172\3\uffff\1\105\1\172\3\uffff\1\172\3\uffff"+
		"\1\123\2\uffff\1\172\1\uffff";
	static final String DFA24_acceptS =
		"\31\uffff\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9"+
		"\1\u00fa\1\u00fb\1\u00fc\2\uffff\1\u0103\1\u0104\1\uffff\1\u0106\1\u0107"+
		"\1\u0109\1\u010a\1\u010b\1\u010c\1\u010d\4\uffff\1\u0117\1\u0118\1\u0119"+
		"\34\uffff\1\u00fe\1\6\104\uffff\1\152\1\u0099\1\u009a\1\u010e\1\uffff"+
		"\1\u0100\1\u0101\1\u0102\1\u011a\1\u0105\15\uffff\1\u0116\7\uffff\1\107"+
		"\27\uffff\1\23\6\uffff\1\5\2\uffff\1\37\1\uffff\1\177\17\uffff\1\10\6"+
		"\uffff\1\u00ad\1\uffff\1\71\31\uffff\1\17\117\uffff\1\u00fd\1\u00ff\1"+
		"\uffff\1\u010f\2\uffff\1\u0111\1\u0112\1\u0113\2\uffff\1\u0114\3\uffff"+
		"\1\u0115\26\uffff\1\u00e0\2\uffff\1\3\1\uffff\1\4\1\uffff\1\13\3\uffff"+
		"\1\u0082\1\uffff\1\161\3\uffff\1\176\27\uffff\1\114\15\uffff\1\u009f\12"+
		"\uffff\1\u0108\31\uffff\1\u0095\13\uffff\1\u00b5\13\uffff\1\u00d5\1\uffff"+
		"\1\u00a4\27\uffff\1\140\27\uffff\1\130\7\uffff\1\u0110\4\uffff\1\1\13"+
		"\uffff\1\u009d\1\uffff\1\22\1\36\17\uffff\1\u00e8\6\uffff\1\72\1\7\2\uffff"+
		"\1\34\1\u00e6\3\uffff\1\u00b7\1\64\1\uffff\1\u00a6\6\uffff\1\136\17\uffff"+
		"\1\u009e\1\uffff\1\14\12\uffff\1\67\1\uffff\1\120\1\103\5\uffff\1\u00c6"+
		"\10\uffff\1\u009c\1\uffff\1\u0090\4\uffff\1\u00ea\1\u00ce\1\uffff\1\51"+
		"\2\uffff\1\62\14\uffff\1\u00b6\4\uffff\1\u00ee\11\uffff\1\u00a8\1\uffff"+
		"\1\33\10\uffff\1\u00bf\4\uffff\1\141\1\uffff\1\u00ef\15\uffff\1\u0081"+
		"\1\u009b\3\uffff\1\u00de\1\52\4\uffff\1\u00e7\1\uffff\1\u00ac\1\151\4"+
		"\uffff\1\42\1\u00d0\6\uffff\1\2\1\uffff\1\100\2\uffff\1\116\2\uffff\1"+
		"\u00aa\1\75\1\uffff\1\101\1\126\1\uffff\1\15\1\uffff\1\30\5\uffff\1\153"+
		"\1\u0094\1\55\1\uffff\1\u00b8\5\uffff\1\45\4\uffff\1\u00f0\2\uffff\1\150"+
		"\31\uffff\1\16\1\u00b3\10\uffff\1\21\1\u00be\4\uffff\1\u008f\15\uffff"+
		"\1\63\1\u0096\4\uffff\1\57\12\uffff\1\u00c1\1\35\6\uffff\1\u00c0\6\uffff"+
		"\1\u0084\1\u00c2\10\uffff\1\u00c8\5\uffff\1\u0088\1\uffff\1\u00a9\5\uffff"+
		"\1\43\7\uffff\1\144\2\uffff\1\142\7\uffff\1\u00d6\1\uffff\1\u00ec\4\uffff"+
		"\1\26\1\uffff\1\70\3\uffff\1\66\1\105\1\uffff\1\11\1\65\6\uffff\1\167"+
		"\3\uffff\1\u00a7\10\uffff\1\117\3\uffff\1\115\1\u00c7\1\uffff\1\175\1"+
		"\u00c4\1\uffff\1\20\1\uffff\1\u00e1\1\24\3\uffff\1\u00ba\1\135\1\uffff"+
		"\1\124\1\127\1\uffff\1\154\2\uffff\1\u00b1\1\u00dc\3\uffff\1\u00b9\3\uffff"+
		"\1\u00d9\1\uffff\1\u008c\7\uffff\1\53\1\uffff\1\104\1\132\1\uffff\1\u0085"+
		"\1\u00b4\3\uffff\1\u00dd\1\160\1\uffff\1\77\6\uffff\1\73\1\76\1\uffff"+
		"\1\u00ca\6\uffff\1\u00cb\1\uffff\1\112\11\uffff\1\u00c3\1\u00d1\3\uffff"+
		"\1\166\1\172\1\uffff\1\u008e\1\u00cf\1\uffff\1\46\4\uffff\1\u0089\4\uffff"+
		"\1\146\1\uffff\1\123\5\uffff\1\170\5\uffff\1\111\1\137\1\u00c5\7\uffff"+
		"\1\u00b2\14\uffff\1\u0080\1\47\1\u0083\4\uffff\1\44\1\uffff\1\110\1\u00d3"+
		"\4\uffff\1\60\1\u00db\1\u00e5\1\u00a0\1\uffff\1\125\1\u00eb\4\uffff\1"+
		"\157\3\uffff\1\u0087\6\uffff\1\173\5\uffff\1\74\1\u008a\1\uffff\1\u00f1"+
		"\1\102\2\uffff\1\u0091\1\25\4\uffff\1\u00ae\1\121\1\uffff\1\u00e9\4\uffff"+
		"\1\113\4\uffff\1\u00bd\3\uffff\1\32\5\uffff\1\171\2\uffff\1\u00da\1\uffff"+
		"\1\u00c9\4\uffff\1\56\1\uffff\1\122\1\uffff\1\u0086\1\uffff\1\50\1\uffff"+
		"\1\u008b\1\u00e4\1\27\5\uffff\1\u00ab\1\uffff\1\u00bb\1\143\2\uffff\1"+
		"\54\1\uffff\1\u00af\10\uffff\1\131\1\u00d2\1\u00e2\1\uffff\1\u00e3\1\uffff"+
		"\1\u00bc\2\uffff\1\40\5\uffff\1\134\3\uffff\1\145\1\uffff\1\155\6\uffff"+
		"\1\u008d\1\61\7\uffff\1\u00d4\1\31\1\uffff\1\106\1\41\4\uffff\1\147\3"+
		"\uffff\1\174\3\uffff\1\12\1\162\1\164\1\uffff\1\u00df\5\uffff\1\u00a1"+
		"\1\uffff\1\133\1\u00ed\2\uffff\1\u00d7\3\uffff\1\163\1\165\1\uffff\1\u0093"+
		"\1\u00a2\1\156\2\uffff\1\u00a5\1\u00cc\1\u00cd\1\uffff\1\u00b0\1\u0097"+
		"\1\u0098\1\uffff\1\u00d8\1\u00a3\1\uffff\1\u0092";
	static final String DFA24_specialS =
		"\60\uffff\1\3\1\7\161\uffff\1\2\1\5\1\uffff\1\0\1\6\u00b9\uffff\1\4\1"+
		"\uffff\1\1\u03d9\uffff}>";
	static final String[] DFA24_transitionS = {
			"\2\66\2\uffff\1\66\22\uffff\1\66\1\6\1\61\1\uffff\1\30\1\52\1\53\1\60"+
			"\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\62\11\63\1\32\1\34\1\44\1"+
			"\43\1\45\1\57\1\uffff\1\3\1\14\1\24\1\12\1\11\1\2\1\13\1\15\1\10\1\22"+
			"\1\27\1\7\1\25\1\5\1\4\1\21\1\64\1\23\1\17\1\1\1\20\1\26\1\16\3\64\1"+
			"\37\1\uffff\1\40\1\56\1\65\33\64\1\41\1\55\1\42\1\54",
			"\1\70\1\74\2\uffff\1\73\2\uffff\1\75\1\72\5\uffff\1\71\2\uffff\1\67",
			"\1\76\3\uffff\1\104\3\uffff\1\101\2\uffff\1\102\2\uffff\1\103\2\uffff"+
			"\1\77\2\uffff\1\100",
			"\1\112\1\uffff\1\110\5\uffff\1\105\1\uffff\1\106\3\uffff\1\111\1\107",
			"\1\117\7\uffff\1\116\1\uffff\1\120\1\uffff\1\113\2\uffff\1\115\1\114",
			"\1\121\5\uffff\1\122",
			"\1\123",
			"\1\130\3\uffff\1\126\3\uffff\1\125\5\uffff\1\127",
			"\1\137\1\uffff\1\131\1\135\5\uffff\1\133\1\132\4\uffff\1\134\1\136",
			"\1\143\1\uffff\1\142\4\uffff\1\141\4\uffff\1\140",
			"\1\146\1\151\2\uffff\1\144\3\uffff\1\145\5\uffff\1\150\2\uffff\1\147",
			"\1\152",
			"\1\157\3\uffff\1\155\5\uffff\1\154\5\uffff\1\156\3\uffff\1\153",
			"\1\160\15\uffff\1\161",
			"\1\162\1\163",
			"\1\171\1\uffff\1\164\2\uffff\1\165\2\uffff\1\173\1\uffff\1\167\1\uffff"+
			"\1\166\3\uffff\1\172\1\170",
			"\1\174\1\uffff\1\177\2\uffff\1\175\1\176",
			"\1\u0081\3\uffff\1\u0082\6\uffff\1\u0083\5\uffff\1\u0080\2\uffff\1\u0084",
			"\1\u0085",
			"\1\u008b\1\uffff\1\u0089\1\uffff\1\u0087\3\uffff\1\u0086\2\uffff\1\u008a"+
			"\2\uffff\1\u0088",
			"\1\u0090\6\uffff\1\u008f\3\uffff\1\u008d\2\uffff\1\u008c\2\uffff\1\u008e"+
			"\2\uffff\1\u0091",
			"\1\u0093\7\uffff\1\u0094\5\uffff\1\u0095\3\uffff\1\u0092",
			"\1\u0096\7\uffff\1\u0097",
			"\1\u0098",
			"\1\u009b\5\uffff\1\u0099\12\uffff\1\u009a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009d\1\123",
			"\1\u009f",
			"",
			"",
			"\1\u00a1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u00a3\1\u00a5\64\u00a3\1\u00a4\uffa3\u00a3",
			"\42\u00a6\1\u00a8\71\u00a6\1\u00a7\uffa3\u00a6",
			"\1\u00ae\1\uffff\12\u00ab\7\uffff\1\64\1\u00b1\2\64\1\u00af\1\64\1\u00b2"+
			"\3\64\1\u00b2\1\u00aa\1\u00b2\5\64\1\u00ac\4\64\1\u00a9\1\u00ad\1\64"+
			"\4\uffff\1\64\1\uffff\1\64\1\u00b2\2\64\1\u00af\1\64\1\u00b2\3\64\1\u00b2"+
			"\1\64\1\u00b2\15\64",
			"\1\u00ae\1\uffff\12\u00ab\7\uffff\1\64\1\u00b1\2\64\1\u00af\1\64\1\u00b2"+
			"\3\64\1\u00b2\1\u00aa\1\u00b2\5\64\1\u00ac\5\64\1\u00ad\1\64\4\uffff"+
			"\1\64\1\uffff\1\64\1\u00b2\2\64\1\u00af\1\64\1\u00b2\3\64\1\u00b2\1\64"+
			"\1\u00b2\15\64",
			"",
			"",
			"",
			"\1\u00b4\7\uffff\1\u00b5\13\uffff\1\u00b3",
			"\1\u00b6",
			"\12\64\7\uffff\24\64\1\u00b7\5\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ba\1\u00b9",
			"\1\u00bd\4\uffff\1\u00bb\5\uffff\1\u00bc",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2\1\uffff\1\u00c3",
			"\1\u00c5\6\uffff\1\u00c6\5\uffff\1\u00c4",
			"\1\u00c7",
			"\1\u00c9\5\uffff\1\u00c8",
			"\1\u00ca",
			"\1\u00cb\7\uffff\1\u00cc",
			"\1\u00ce\2\uffff\1\u00cd",
			"\12\64\7\uffff\2\64\1\u00cf\27\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00d1",
			"\1\u00d3\16\uffff\1\u00d2",
			"\1\u00d4",
			"\12\64\7\uffff\2\64\1\u00d6\1\u00d5\26\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00d8",
			"\1\u00d9",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\5\64\1\u00db\24\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00dd",
			"\1\u00e0\1\u00de\12\uffff\1\u00df",
			"\1\u00e1",
			"",
			"",
			"\1\u00e2\1\uffff\1\u00e4\1\u00e3",
			"\1\u00e5\14\uffff\1\u00e6",
			"\1\u00e8\1\uffff\1\u00e7\3\uffff\1\u00e9\6\uffff\1\u00ea",
			"\1\u00eb",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\2\64\1\u00ed\1\u00ef\11\64\1\u00f2\1\64\1\u00f0\2\64"+
			"\1\u00ee\1\u00f1\6\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00fc\5\uffff\1\u00f9\6\uffff\1\u00fa\3\uffff\1\u00fb",
			"\1\u00fd",
			"\1\u00fe\2\uffff\1\u00ff",
			"\1\u0100",
			"\1\u0102\2\uffff\1\u0105\5\uffff\1\u0103\3\uffff\1\u0104\2\uffff\1\u0101",
			"\1\u0107\1\u0106\2\uffff\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010e\15\uffff\1\u010d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0110\4\uffff\1\u0111",
			"\1\u0112\6\uffff\1\u0113",
			"\1\u0114",
			"\1\u0115\15\uffff\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119\3\uffff\1\u011a",
			"\1\u011c\5\uffff\1\u011b",
			"\1\u011d\1\u0121\3\uffff\1\u011e\1\u011f\1\uffff\1\u0120",
			"\1\u0123\15\uffff\1\u0122",
			"\1\u0124",
			"\1\u0125",
			"\1\u0128\15\uffff\1\u0127\2\uffff\1\u0126",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u0130\1\u0131\1\uffff\1\u012e\4\uffff\1\u012c\2\uffff\1\u012f\6\uffff"+
			"\1\u012d",
			"\1\u0133\3\uffff\1\u0132",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136\11\uffff\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u0142\1\u013e\1\u0145\1\u0141\2\uffff\1\u0143\6\uffff\1\u0140\1\uffff"+
			"\1\u013f\2\uffff\1\u0146\2\uffff\1\u0144",
			"\1\u0148\12\uffff\1\u0147",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c\1\u014d\1\u014e",
			"\1\u014f",
			"\1\u0150\11\uffff\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0155\17\uffff\1\u0154",
			"\1\u0156",
			"\1\u0158\14\uffff\1\u0157\3\uffff\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"",
			"",
			"",
			"",
			"\1\u015f",
			"",
			"",
			"",
			"",
			"",
			"\47\u00a3\1\u00a5\64\u00a3\1\u00a4\uffa3\u00a3",
			"\0\u0161",
			"\1\61\4\uffff\1\60",
			"\42\u00a6\1\u00a8\71\u00a6\1\u00a7\uffa3\u00a6",
			"\0\u0163",
			"\1\61\4\uffff\1\60",
			"\12\u0164\7\uffff\6\u0164\32\uffff\6\u0164",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u00ae\1\uffff\12\u00ab\7\uffff\1\64\1\u00b1\2\64\1\u00af\1\64\1\u00b2"+
			"\3\64\1\u00b2\1\u00aa\1\u00b2\5\64\1\u00ac\5\64\1\u00ad\1\64\4\uffff"+
			"\1\64\1\uffff\1\64\1\u00b2\2\64\1\u00af\1\64\1\u00b2\3\64\1\u00b2\1\64"+
			"\1\u00b2\15\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\u0168\10\uffff\1\u016a\2\uffff\1\u0169\37\uffff\1\u0169",
			"\1\u016b\1\uffff\1\u016b\2\uffff\12\u016c",
			"",
			"\12\64\7\uffff\3\64\1\u016d\26\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u016f\10\uffff\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\12\64\7\uffff\14\64\1\u0184\15\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0186",
			"\1\u0187",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0189",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u018b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0191",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0193",
			"\12\64\7\uffff\4\64\1\u0194\12\64\1\u0195\12\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"\1\u0197",
			"",
			"\1\u0198",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1\11\uffff\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\23\uffff\1\u01ab",
			"\12\64\7\uffff\4\64\1\u01ad\11\64\1\u01ac\13\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"\1\u01af",
			"",
			"\1\u01b0",
			"",
			"\1\u01b1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b6\2\uffff\1\u01b5",
			"\1\u01b7",
			"\1\u01b9\3\uffff\1\u01b8",
			"\1\u01ba",
			"\1\u01bb",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01bd",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c1\3\uffff\1\u01c0",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c5\22\uffff\1\u01c4",
			"\1\u01c6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01c8\3\uffff\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d9\3\uffff\1\u01d8",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\1\u01df",
			"\12\64\7\uffff\22\64\1\u01e0\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e9\3\uffff\1\u01e7\13\uffff\1\u01e8",
			"\1\u01ea",
			"\1\u01eb",
			"\1\u01ec",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u01ee",
			"\1\u01f0\1\uffff\1\u01ef",
			"\1\u01f1\3\uffff\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\12\64\7\uffff\21\64\1\u01f8\10\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\u01fa\1\uffff\32\64",
			"\1\u01fc",
			"\1\u01ff\17\uffff\1\u01fd\1\u01fe",
			"\1\u0201\20\uffff\1\u0200",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209\12\uffff\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0211",
			"\12\64\7\uffff\22\64\1\u0212\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0215\6\uffff\1\u0214",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u021a\10\uffff\1\u0219",
			"\1\u021b\2\uffff\1\u021c",
			"\1\u021e\20\uffff\1\u021d",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0225\1\uffff\1\u0224\16\uffff\1\u0223",
			"\1\u0227\1\u0226",
			"\1\u0228",
			"\1\u0229",
			"\12\64\7\uffff\11\64\1\u022a\20\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"",
			"",
			"\47\u00a3\1\u00a5\64\u00a3\1\u00a4\uffa3\u00a3",
			"",
			"\42\u00a6\1\u00a8\71\u00a6\1\u00a7\uffa3\u00a6",
			"\12\u0164\7\uffff\6\u0164\24\64\4\uffff\1\64\1\uffff\6\u0164\24\64",
			"",
			"",
			"",
			"\12\u0168\10\uffff\1\u016a\2\uffff\1\u0169\37\uffff\1\u0169",
			"\1\u0234\1\uffff\1\u0234\2\uffff\12\u0235",
			"",
			"\12\u0236",
			"\12\u016c\7\uffff\1\64\1\u0237\30\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0245",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"",
			"\1\u024e",
			"\1\u024f",
			"",
			"\1\u0250",
			"",
			"\1\u0251",
			"",
			"\1\u0252",
			"\1\u0253",
			"\1\u0254",
			"",
			"\1\u0255",
			"",
			"\12\64\7\uffff\26\64\1\u0256\3\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0258",
			"\1\u0259",
			"",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0260",
			"\1\u0261",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0264\7\uffff\1\u0265",
			"\12\64\7\uffff\22\64\1\u0266\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0269",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0272",
			"",
			"\1\u0273",
			"\1\u0274",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027c\3\uffff\1\u027b",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\21\64\1\u0282\10\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0284",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289\10\uffff\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"",
			"\12\64\7\uffff\1\64\1\u028d\30\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\23\64\1\u028f\6\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0298",
			"\1\u0299",
			"\1\u029a",
			"\1\u029b",
			"\1\u029c",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02a1",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02a3",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\u02a9\1\uffff\32\64",
			"\1\u02ab",
			"\12\64\7\uffff\4\64\1\u02ac\25\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02ae",
			"\1\u02af",
			"\1\u02b0",
			"\1\u02b1",
			"\1\u02b2",
			"\1\u02b3",
			"\1\u02b4",
			"",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u02c0",
			"",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02ca",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\12\64\7\uffff\16\64\1\u02d2\3\64\1\u02d3\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"\1\u02d8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u02da",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\1\u02df",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"\1\u02e8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02eb",
			"\1\u02ec",
			"\1\u02ed",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02f0",
			"",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02f5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\u0235",
			"\12\u0235\10\uffff\1\u016a",
			"\12\u0236\10\uffff\1\u016a",
			"\1\u016d",
			"",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\12\64\7\uffff\22\64\1\u02fb\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0305",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0307",
			"\1\u0308",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u030a",
			"\1\u030b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u030e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0311",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0313",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u031d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u031f",
			"",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\12\64\7\uffff\4\64\1\u0323\25\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0325",
			"\1\u0327\1\uffff\1\u0326",
			"",
			"\1\u0328",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u032a",
			"\1\u032b",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"",
			"\1\u0337",
			"",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"",
			"\1\u0342",
			"",
			"",
			"\1\u0343",
			"\1\u0344",
			"\12\64\7\uffff\10\64\1\u0345\21\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0348",
			"",
			"\1\u0349",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0352",
			"\1\u0353",
			"\1\u0354",
			"\12\64\7\uffff\17\64\1\u0355\12\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0357",
			"",
			"\1\u0358",
			"\1\u0359",
			"",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\1\u035d",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\12\64\7\uffff\23\64\1\u0363\6\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0366",
			"",
			"\1\u0367",
			"\1\u0368",
			"\1\u0369",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\1\u0370",
			"\1\u0371",
			"\1\u0373\22\uffff\1\u0372",
			"\1\u0374",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u037e",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"",
			"\1\u0382",
			"",
			"\1\u0383",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\1\u038a",
			"\1\u038b",
			"\1\u038c",
			"\1\u038d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u038f",
			"",
			"",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"",
			"",
			"\1\u0393",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0395",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0397",
			"",
			"",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\12\64\7\uffff\1\u039b\31\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"",
			"\1\u03a3",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03a5",
			"",
			"\12\64\7\uffff\23\64\1\u03a6\6\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03a8",
			"",
			"",
			"\1\u03a9",
			"",
			"",
			"\1\u03aa",
			"",
			"\1\u03ab",
			"",
			"\1\u03ad\1\uffff\1\u03ac",
			"\1\u03ae",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03b0",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u03b2",
			"",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03b7",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u03be",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03c8",
			"\1\u03c9",
			"\1\u03ca",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\1\u03cf",
			"\1\u03d0",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03d5",
			"\1\u03d6",
			"",
			"",
			"\1\u03d7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\22\64\1\u03da\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03dd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03df",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03e2",
			"\1\u03e3",
			"",
			"\1\u03e4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03e7",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03ea",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03ec",
			"\12\64\7\uffff\22\64\1\u03ed\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03f0",
			"\1\u03f1",
			"",
			"",
			"\1\u03f2",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03f4",
			"\1\u03f5",
			"",
			"\1\u03f6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03f8",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"",
			"",
			"\1\u0400",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0402",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0405",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0408\4\uffff\1\u0409",
			"\1\u040a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\22\64\1\u040d\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u040f",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0417",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0419",
			"\1\u041a",
			"",
			"\1\u041b",
			"",
			"\1\u041c",
			"\1\u041d",
			"\1\u041e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0420",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0422",
			"\1\u0423",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"",
			"\1\u0428",
			"\1\u0429",
			"",
			"\1\u042a",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u042d",
			"\1\u042e",
			"\1\u042f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0432",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0435",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"",
			"",
			"\1\u043a",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u043c",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0441",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0443",
			"",
			"\1\u0444",
			"\1\u0445",
			"\1\u0446",
			"\1\u0447",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"",
			"\1\u044c",
			"\1\u044d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0451",
			"",
			"",
			"\1\u0452",
			"\1\u0453",
			"\1\u0454",
			"",
			"",
			"\1\u0455",
			"",
			"",
			"\1\u0456",
			"",
			"\1\u0457",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"",
			"\1\u045f",
			"",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"\1\u0464",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0468",
			"",
			"",
			"\1\u0469",
			"\1\u046a",
			"\1\u046b",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u046d",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0470",
			"\1\u0471",
			"\12\64\7\uffff\4\64\1\u0472\15\64\1\u0473\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0478",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u047b",
			"",
			"\1\u047c",
			"",
			"\1\u047d",
			"\1\u047e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0480",
			"\1\u0481",
			"\12\64\7\uffff\22\64\1\u0482\7\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"",
			"",
			"\1\u0487",
			"\1\u0488",
			"\1\u0489",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u048b",
			"",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0492",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0495",
			"\1\u0496",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0499",
			"",
			"\1\u049b\17\uffff\1\u049a",
			"\12\64\7\uffff\22\64\1\u049c\7\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u049f",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u04a1",
			"\1\u04a2",
			"\1\u04a3",
			"\1\u04a4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04a6",
			"\1\u04a7",
			"",
			"\1\u04a8",
			"\1\u04a9",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04ab",
			"\1\u04ac",
			"\1\u04ad",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04af",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\1\u04b3",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04b5",
			"\1\u04b6",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u04b8",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04ba",
			"\1\u04bb",
			"\1\u04bc",
			"",
			"",
			"",
			"",
			"\1\u04bd",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04bf",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04c1",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04c3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u04c5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04c9",
			"\1\u04ca",
			"",
			"\1\u04cb",
			"\1\u04cc",
			"\1\u04cd",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04cf",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04d2",
			"",
			"",
			"\1\u04d3",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04d5",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u04d7",
			"",
			"\1\u04d8",
			"\1\u04d9",
			"\1\u04da",
			"\1\u04db",
			"",
			"\1\u04dc",
			"\1\u04dd",
			"\1\u04de",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04e2",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04e4",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\4\64\1\u04e7\15\64\1\u04e6\7\64\4\uffff\1\64\1\uffff"+
			"\32\64",
			"\1\u04e9",
			"",
			"\1\u04ea",
			"\1\u04eb",
			"",
			"\1\u04ec",
			"",
			"\1\u04ed",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u04ef",
			"\1\u04f0",
			"",
			"\1\u04f1",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u04f3",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"",
			"\1\u04fa",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u04fd",
			"",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"\1\u0502",
			"\1\u0503",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u0506",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0509",
			"",
			"\1\u050a",
			"\1\u050b",
			"\1\u050c",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u050e",
			"",
			"\1\u050f",
			"\1\u0510",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0512",
			"",
			"\1\u0513",
			"\1\u0514",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0518",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u051a",
			"\1\u051b",
			"\1\u051c",
			"\1\u051d",
			"\1\u051e",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\1\u0520",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0523",
			"\1\u0524",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u0526",
			"\1\u0527",
			"",
			"\1\u0528",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u052b",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\1\u052f",
			"\1\u0530",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"\1\u0534",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u0538",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			"",
			"",
			"",
			"\1\u053b",
			"",
			"",
			"\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_INCRE | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA24_166 = input.LA(1);
						s = -1;
						if ( (LA24_166=='\"') ) {s = 168;}
						else if ( ((LA24_166 >= '\u0000' && LA24_166 <= '!')||(LA24_166 >= '#' && LA24_166 <= '[')||(LA24_166 >= ']' && LA24_166 <= '\uFFFF')) ) {s = 166;}
						else if ( (LA24_166=='\\') ) {s = 167;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA24_355 = input.LA(1);
						s = -1;
						if ( (LA24_355=='\"') ) {s = 168;}
						else if ( ((LA24_355 >= '\u0000' && LA24_355 <= '!')||(LA24_355 >= '#' && LA24_355 <= '[')||(LA24_355 >= ']' && LA24_355 <= '\uFFFF')) ) {s = 166;}
						else if ( (LA24_355=='\\') ) {s = 167;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA24_163 = input.LA(1);
						s = -1;
						if ( (LA24_163=='\'') ) {s = 165;}
						else if ( ((LA24_163 >= '\u0000' && LA24_163 <= '&')||(LA24_163 >= '(' && LA24_163 <= '[')||(LA24_163 >= ']' && LA24_163 <= '\uFFFF')) ) {s = 163;}
						else if ( (LA24_163=='\\') ) {s = 164;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA24_48 = input.LA(1);
						s = -1;
						if ( ((LA24_48 >= '\u0000' && LA24_48 <= '&')||(LA24_48 >= '(' && LA24_48 <= '[')||(LA24_48 >= ']' && LA24_48 <= '\uFFFF')) ) {s = 163;}
						else if ( (LA24_48=='\\') ) {s = 164;}
						else if ( (LA24_48=='\'') ) {s = 165;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA24_353 = input.LA(1);
						s = -1;
						if ( (LA24_353=='\'') ) {s = 165;}
						else if ( ((LA24_353 >= '\u0000' && LA24_353 <= '&')||(LA24_353 >= '(' && LA24_353 <= '[')||(LA24_353 >= ']' && LA24_353 <= '\uFFFF')) ) {s = 163;}
						else if ( (LA24_353=='\\') ) {s = 164;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA24_164 = input.LA(1);
						s = -1;
						if ( ((LA24_164 >= '\u0000' && LA24_164 <= '\uFFFF')) ) {s = 353;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA24_167 = input.LA(1);
						s = -1;
						if ( ((LA24_167 >= '\u0000' && LA24_167 <= '\uFFFF')) ) {s = 355;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA24_49 = input.LA(1);
						s = -1;
						if ( ((LA24_49 >= '\u0000' && LA24_49 <= '!')||(LA24_49 >= '#' && LA24_49 <= '[')||(LA24_49 >= ']' && LA24_49 <= '\uFFFF')) ) {s = 166;}
						else if ( (LA24_49=='\\') ) {s = 167;}
						else if ( (LA24_49=='\"') ) {s = 168;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 24, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
