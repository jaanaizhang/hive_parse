// $ANTLR 3.5.2 HiveLexer.g 2014-11-26 15:19:45
package org.apache.hadoop.hive.ql.parse;

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
	public static final int APRIL=5;
	public static final int AUGUST=6;
	public static final int BITWISEOR=7;
	public static final int BITWISEXOR=8;
	public static final int BigintLiteral=9;
	public static final int ByteLengthLiteral=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int CharSetLiteral=14;
	public static final int CharSetName=15;
	public static final int DAY=16;
	public static final int DECEMBER=17;
	public static final int DIV=18;
	public static final int DIVIDE=19;
	public static final int DOLLAR=20;
	public static final int DOT=21;
	public static final int DecimalLiteral=22;
	public static final int Digit=23;
	public static final int EQUAL=24;
	public static final int EQUAL_NS=25;
	public static final int Exponent=26;
	public static final int FEBRUARY=27;
	public static final int FRIDAY=28;
	public static final int GREATERTHAN=29;
	public static final int GREATERTHANOREQUALTO=30;
	public static final int HOUR=31;
	public static final int HexDigit=32;
	public static final int Identifier=33;
	public static final int JANUARY=34;
	public static final int JULY=35;
	public static final int JUNE=36;
	public static final int KW_ADD=37;
	public static final int KW_AFTER=38;
	public static final int KW_ALL=39;
	public static final int KW_ALTER=40;
	public static final int KW_ANALYZE=41;
	public static final int KW_AND=42;
	public static final int KW_ARCHIVE=43;
	public static final int KW_ARRAY=44;
	public static final int KW_AS=45;
	public static final int KW_ASC=46;
	public static final int KW_BEFORE=47;
	public static final int KW_BETWEEN=48;
	public static final int KW_BIGINT=49;
	public static final int KW_BINARY=50;
	public static final int KW_BOOLEAN=51;
	public static final int KW_BOTH=52;
	public static final int KW_BUCKET=53;
	public static final int KW_BUCKETS=54;
	public static final int KW_BY=55;
	public static final int KW_CASCADE=56;
	public static final int KW_CASE=57;
	public static final int KW_CAST=58;
	public static final int KW_CHANGE=59;
	public static final int KW_CLUSTER=60;
	public static final int KW_CLUSTERED=61;
	public static final int KW_CLUSTERSTATUS=62;
	public static final int KW_COLLECTION=63;
	public static final int KW_COLUMN=64;
	public static final int KW_COLUMNS=65;
	public static final int KW_COMMENT=66;
	public static final int KW_COMPUTE=67;
	public static final int KW_CONCATENATE=68;
	public static final int KW_CONSTANT=69;
	public static final int KW_CONTINUE=70;
	public static final int KW_CREATE=71;
	public static final int KW_CROSS=72;
	public static final int KW_CUBE=73;
	public static final int KW_CURRENT=74;
	public static final int KW_CURSOR=75;
	public static final int KW_DATA=76;
	public static final int KW_DATABASE=77;
	public static final int KW_DATABASES=78;
	public static final int KW_DATE=79;
	public static final int KW_DATETIME=80;
	public static final int KW_DAY=81;
	public static final int KW_DBPROPERTIES=82;
	public static final int KW_DECIMAL=83;
	public static final int KW_DEFERRED=84;
	public static final int KW_DELETE=85;
	public static final int KW_DELIMITED=86;
	public static final int KW_DEPENDENCY=87;
	public static final int KW_DESC=88;
	public static final int KW_DESCRIBE=89;
	public static final int KW_DIRECTORIES=90;
	public static final int KW_DIRECTORY=91;
	public static final int KW_DISABLE=92;
	public static final int KW_DISTINCT=93;
	public static final int KW_DISTRIBUTE=94;
	public static final int KW_DOUBLE=95;
	public static final int KW_DROP=96;
	public static final int KW_ELEM_TYPE=97;
	public static final int KW_ELSE=98;
	public static final int KW_ENABLE=99;
	public static final int KW_END=100;
	public static final int KW_ESCAPED=101;
	public static final int KW_EXCHANGE=102;
	public static final int KW_EXCLUSIVE=103;
	public static final int KW_EXISTS=104;
	public static final int KW_EXPLAIN=105;
	public static final int KW_EXPORT=106;
	public static final int KW_EXTENDED=107;
	public static final int KW_EXTERNAL=108;
	public static final int KW_FALSE=109;
	public static final int KW_FETCH=110;
	public static final int KW_FIELDS=111;
	public static final int KW_FILEFORMAT=112;
	public static final int KW_FIRST=113;
	public static final int KW_FLOAT=114;
	public static final int KW_FOLLOWING=115;
	public static final int KW_FOR=116;
	public static final int KW_FORMAT=117;
	public static final int KW_FORMATTED=118;
	public static final int KW_FROM=119;
	public static final int KW_FULL=120;
	public static final int KW_FUNCTION=121;
	public static final int KW_FUNCTIONS=122;
	public static final int KW_GRANT=123;
	public static final int KW_GROUP=124;
	public static final int KW_GROUPING=125;
	public static final int KW_HAVING=126;
	public static final int KW_HOLD_DDLTIME=127;
	public static final int KW_HOUR=128;
	public static final int KW_IDXPROPERTIES=129;
	public static final int KW_IF=130;
	public static final int KW_IGNORE=131;
	public static final int KW_IMPORT=132;
	public static final int KW_IN=133;
	public static final int KW_INCRE=134;
	public static final int KW_INDEX=135;
	public static final int KW_INDEXES=136;
	public static final int KW_INNER=137;
	public static final int KW_INPATH=138;
	public static final int KW_INPUTDRIVER=139;
	public static final int KW_INPUTFORMAT=140;
	public static final int KW_INSERT=141;
	public static final int KW_INT=142;
	public static final int KW_INTERSECT=143;
	public static final int KW_INTERVAL=144;
	public static final int KW_INTO=145;
	public static final int KW_IS=146;
	public static final int KW_ITEMS=147;
	public static final int KW_JOIN=148;
	public static final int KW_KEYS=149;
	public static final int KW_KEY_TYPE=150;
	public static final int KW_LATERAL=151;
	public static final int KW_LEFT=152;
	public static final int KW_LESS=153;
	public static final int KW_LIKE=154;
	public static final int KW_LIMIT=155;
	public static final int KW_LINES=156;
	public static final int KW_LOAD=157;
	public static final int KW_LOCAL=158;
	public static final int KW_LOCATION=159;
	public static final int KW_LOCK=160;
	public static final int KW_LOCKS=161;
	public static final int KW_LOGICAL=162;
	public static final int KW_LONG=163;
	public static final int KW_MACRO=164;
	public static final int KW_MAP=165;
	public static final int KW_MAPJOIN=166;
	public static final int KW_MATERIALIZED=167;
	public static final int KW_MINUS=168;
	public static final int KW_MINUTE=169;
	public static final int KW_MORE=170;
	public static final int KW_MSCK=171;
	public static final int KW_NOSCAN=172;
	public static final int KW_NOT=173;
	public static final int KW_NO_DROP=174;
	public static final int KW_NULL=175;
	public static final int KW_OF=176;
	public static final int KW_OFFLINE=177;
	public static final int KW_ON=178;
	public static final int KW_OPTION=179;
	public static final int KW_OR=180;
	public static final int KW_ORCFILE=181;
	public static final int KW_ORDER=182;
	public static final int KW_OUT=183;
	public static final int KW_OUTER=184;
	public static final int KW_OUTPUTDRIVER=185;
	public static final int KW_OUTPUTFORMAT=186;
	public static final int KW_OVER=187;
	public static final int KW_OVERWRITE=188;
	public static final int KW_PARTIALSCAN=189;
	public static final int KW_PARTITION=190;
	public static final int KW_PARTITIONED=191;
	public static final int KW_PARTITIONS=192;
	public static final int KW_PERCENT=193;
	public static final int KW_PLUS=194;
	public static final int KW_PRECEDING=195;
	public static final int KW_PRESERVE=196;
	public static final int KW_PRETTY=197;
	public static final int KW_PROCEDURE=198;
	public static final int KW_PROTECTION=199;
	public static final int KW_PURGE=200;
	public static final int KW_RANGE=201;
	public static final int KW_RCFILE=202;
	public static final int KW_READ=203;
	public static final int KW_READONLY=204;
	public static final int KW_READS=205;
	public static final int KW_REBUILD=206;
	public static final int KW_RECORDREADER=207;
	public static final int KW_RECORDWRITER=208;
	public static final int KW_REDUCE=209;
	public static final int KW_REGEXP=210;
	public static final int KW_RENAME=211;
	public static final int KW_REPAIR=212;
	public static final int KW_REPLACE=213;
	public static final int KW_RESTRICT=214;
	public static final int KW_REVOKE=215;
	public static final int KW_RIGHT=216;
	public static final int KW_RLIKE=217;
	public static final int KW_ROLE=218;
	public static final int KW_ROLLUP=219;
	public static final int KW_ROW=220;
	public static final int KW_ROWS=221;
	public static final int KW_SCHEMA=222;
	public static final int KW_SCHEMAS=223;
	public static final int KW_SECOND=224;
	public static final int KW_SELECT=225;
	public static final int KW_SEMI=226;
	public static final int KW_SEQUENCEFILE=227;
	public static final int KW_SERDE=228;
	public static final int KW_SERDEPROPERTIES=229;
	public static final int KW_SET=230;
	public static final int KW_SETS=231;
	public static final int KW_SHARED=232;
	public static final int KW_SHOW=233;
	public static final int KW_SHOW_DATABASE=234;
	public static final int KW_SKEWED=235;
	public static final int KW_SMALLINT=236;
	public static final int KW_SORT=237;
	public static final int KW_SORTED=238;
	public static final int KW_SSL=239;
	public static final int KW_STATISTICS=240;
	public static final int KW_STORED=241;
	public static final int KW_STREAMTABLE=242;
	public static final int KW_STRING=243;
	public static final int KW_STRUCT=244;
	public static final int KW_TABLE=245;
	public static final int KW_TABLES=246;
	public static final int KW_TABLESAMPLE=247;
	public static final int KW_TBLPROPERTIES=248;
	public static final int KW_TEMPORARY=249;
	public static final int KW_TERMINATED=250;
	public static final int KW_TEXTFILE=251;
	public static final int KW_THEN=252;
	public static final int KW_TIMESTAMP=253;
	public static final int KW_TINYINT=254;
	public static final int KW_TO=255;
	public static final int KW_TOUCH=256;
	public static final int KW_TRANSFORM=257;
	public static final int KW_TRIGGER=258;
	public static final int KW_TRUE=259;
	public static final int KW_TRUNCATE=260;
	public static final int KW_UNARCHIVE=261;
	public static final int KW_UNBOUNDED=262;
	public static final int KW_UNDO=263;
	public static final int KW_UNION=264;
	public static final int KW_UNIONTYPE=265;
	public static final int KW_UNIQUEJOIN=266;
	public static final int KW_UNLOCK=267;
	public static final int KW_UNSET=268;
	public static final int KW_UNSIGNED=269;
	public static final int KW_UPDATE=270;
	public static final int KW_USE=271;
	public static final int KW_USER=272;
	public static final int KW_USING=273;
	public static final int KW_UTC=274;
	public static final int KW_UTCTIMESTAMP=275;
	public static final int KW_VALUE_TYPE=276;
	public static final int KW_VARCHAR=277;
	public static final int KW_VIEW=278;
	public static final int KW_WHEN=279;
	public static final int KW_WHERE=280;
	public static final int KW_WHILE=281;
	public static final int KW_WINDOW=282;
	public static final int KW_WITH=283;
	public static final int LCURLY=284;
	public static final int LESSTHAN=285;
	public static final int LESSTHANOREQUALTO=286;
	public static final int LPAREN=287;
	public static final int LSQUARE=288;
	public static final int Letter=289;
	public static final int MARCH=290;
	public static final int MAY=291;
	public static final int MINUS=292;
	public static final int MINUTE=293;
	public static final int MOD=294;
	public static final int MONDAY=295;
	public static final int MONTH=296;
	public static final int NOTEQUAL=297;
	public static final int NOVEMBER=298;
	public static final int Number=299;
	public static final int OCTOBER=300;
	public static final int PLUS=301;
	public static final int QUESTION=302;
	public static final int RCURLY=303;
	public static final int RPAREN=304;
	public static final int RSQUARE=305;
	public static final int RegexComponent=306;
	public static final int SATURDAY=307;
	public static final int SEMICOLON=308;
	public static final int SEPTEMBER=309;
	public static final int STAR=310;
	public static final int SUNDAY=311;
	public static final int SmallintLiteral=312;
	public static final int StringLiteral=313;
	public static final int THURSDAY=314;
	public static final int TILDE=315;
	public static final int TODAY=316;
	public static final int TOMORROW=317;
	public static final int TONIGHT=318;
	public static final int TUESDAY=319;
	public static final int TimeUnit=320;
	public static final int TinyintLiteral=321;
	public static final int WEDNESDAY=322;
	public static final int WEEK=323;
	public static final int WS=324;
	public static final int YEAR=325;
	public static final int YESTERDAY=326;

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

	// $ANTLR start "KW_DAY"
	public final void mKW_DAY() throws RecognitionException {
		try {
			int _type = KW_DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:34:8: ( 'D' )
			// HiveLexer.g:34:10: 'D'
			{
			match('D'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DAY"

	// $ANTLR start "KW_HOUR"
	public final void mKW_HOUR() throws RecognitionException {
		try {
			int _type = KW_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:35:9: ( 'H' )
			// HiveLexer.g:35:10: 'H'
			{
			match('H'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOUR"

	// $ANTLR start "KW_MINUTE"
	public final void mKW_MINUTE() throws RecognitionException {
		try {
			int _type = KW_MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:36:11: ( 'M' )
			// HiveLexer.g:36:13: 'M'
			{
			match('M'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUTE"

	// $ANTLR start "KW_SECOND"
	public final void mKW_SECOND() throws RecognitionException {
		try {
			int _type = KW_SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:37:11: ( 'S' )
			// HiveLexer.g:37:13: 'S'
			{
			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SECOND"

	// $ANTLR start "KW_CONSTANT"
	public final void mKW_CONSTANT() throws RecognitionException {
		try {
			int _type = KW_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:38:13: ( 'CONSTANT' )
			// HiveLexer.g:38:15: 'CONSTANT'
			{
			match("CONSTANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONSTANT"

	// $ANTLR start "KW_INTERVAL"
	public final void mKW_INTERVAL() throws RecognitionException {
		try {
			int _type = KW_INTERVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:39:13: ( 'INTERVAL' )
			// HiveLexer.g:39:15: 'INTERVAL'
			{
			match("INTERVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERVAL"

	// $ANTLR start "KW_INCRE"
	public final void mKW_INCRE() throws RecognitionException {
		try {
			int _type = KW_INCRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:40:10: ( 'INCREMENTAL' )
			// HiveLexer.g:40:12: 'INCREMENTAL'
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
			// HiveLexer.g:41:8: ( 'ASC' )
			// HiveLexer.g:41:10: 'ASC'
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
			// HiveLexer.g:42:9: ( 'DESC' )
			// HiveLexer.g:42:11: 'DESC'
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
			// HiveLexer.g:43:10: ( 'ORDER' )
			// HiveLexer.g:43:12: 'ORDER'
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
			// HiveLexer.g:44:10: ( 'GROUP' )
			// HiveLexer.g:44:12: 'GROUP'
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
			// HiveLexer.g:45:7: ( 'BY' )
			// HiveLexer.g:45:9: 'BY'
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
			// HiveLexer.g:46:11: ( 'HAVING' )
			// HiveLexer.g:46:13: 'HAVING'
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
			// HiveLexer.g:47:10: ( 'WHERE' )
			// HiveLexer.g:47:12: 'WHERE'
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
			// HiveLexer.g:48:9: ( 'FROM' )
			// HiveLexer.g:48:11: 'FROM'
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
			// HiveLexer.g:49:7: ( 'AS' )
			// HiveLexer.g:49:9: 'AS'
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
			// HiveLexer.g:50:11: ( 'SELECT' )
			// HiveLexer.g:50:13: 'SELECT'
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
			// HiveLexer.g:51:13: ( 'DISTINCT' )
			// HiveLexer.g:51:15: 'DISTINCT'
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
			// HiveLexer.g:52:11: ( 'INSERT' )
			// HiveLexer.g:52:13: 'INSERT'
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
			// HiveLexer.g:53:14: ( 'OVERWRITE' )
			// HiveLexer.g:53:16: 'OVERWRITE'
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
			// HiveLexer.g:54:10: ( 'OUTER' )
			// HiveLexer.g:54:12: 'OUTER'
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
			// HiveLexer.g:55:15: ( 'UNIQUEJOIN' )
			// HiveLexer.g:55:17: 'UNIQUEJOIN'
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
			// HiveLexer.g:56:13: ( 'PRESERVE' )
			// HiveLexer.g:56:15: 'PRESERVE'
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
			// HiveLexer.g:57:9: ( 'JOIN' )
			// HiveLexer.g:57:11: 'JOIN'
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
			// HiveLexer.g:58:9: ( 'LEFT' )
			// HiveLexer.g:58:11: 'LEFT'
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
			// HiveLexer.g:59:10: ( 'RIGHT' )
			// HiveLexer.g:59:12: 'RIGHT'
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
			// HiveLexer.g:60:9: ( 'FULL' )
			// HiveLexer.g:60:11: 'FULL'
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
			// HiveLexer.g:61:7: ( 'ON' )
			// HiveLexer.g:61:9: 'ON'
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
			// HiveLexer.g:62:14: ( 'PARTITION' )
			// HiveLexer.g:62:16: 'PARTITION'
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
			// HiveLexer.g:63:15: ( 'PARTITIONS' )
			// HiveLexer.g:63:17: 'PARTITIONS'
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
			// HiveLexer.g:64:9: ( 'TABLE' )
			// HiveLexer.g:64:11: 'TABLE'
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
			// HiveLexer.g:65:10: ( 'TABLES' )
			// HiveLexer.g:65:12: 'TABLES'
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
			// HiveLexer.g:66:11: ( 'COLUMNS' )
			// HiveLexer.g:66:13: 'COLUMNS'
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
			// HiveLexer.g:67:9: ( 'INDEX' )
			// HiveLexer.g:67:11: 'INDEX'
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
			// HiveLexer.g:68:11: ( 'INDEXES' )
			// HiveLexer.g:68:13: 'INDEXES'
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
			// HiveLexer.g:69:11: ( 'REBUILD' )
			// HiveLexer.g:69:13: 'REBUILD'
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
			// HiveLexer.g:70:13: ( 'FUNCTIONS' )
			// HiveLexer.g:70:15: 'FUNCTIONS'
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
			// HiveLexer.g:71:8: ( 'SHOW' )
			// HiveLexer.g:71:10: 'SHOW'
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
			// HiveLexer.g:72:8: ( 'MSCK' )
			// HiveLexer.g:72:10: 'MSCK'
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
			// HiveLexer.g:73:10: ( 'REPAIR' )
			// HiveLexer.g:73:12: 'REPAIR'
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
			// HiveLexer.g:74:13: ( 'DIRECTORY' )
			// HiveLexer.g:74:15: 'DIRECTORY'
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
			// HiveLexer.g:75:9: ( 'LOCAL' )
			// HiveLexer.g:75:11: 'LOCAL'
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
			// HiveLexer.g:76:14: ( 'TRANSFORM' )
			// HiveLexer.g:76:16: 'TRANSFORM'
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
			// HiveLexer.g:77:9: ( 'USING' )
			// HiveLexer.g:77:11: 'USING'
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
			// HiveLexer.g:78:11: ( 'CLUSTER' )
			// HiveLexer.g:78:13: 'CLUSTER'
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
			// HiveLexer.g:79:14: ( 'DISTRIBUTE' )
			// HiveLexer.g:79:16: 'DISTRIBUTE'
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
			// HiveLexer.g:80:8: ( 'SORT' )
			// HiveLexer.g:80:10: 'SORT'
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
			// HiveLexer.g:81:9: ( 'UNION' )
			// HiveLexer.g:81:11: 'UNION'
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
			// HiveLexer.g:82:8: ( 'LOAD' )
			// HiveLexer.g:82:10: 'LOAD'
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
			// HiveLexer.g:83:10: ( 'EXPORT' )
			// HiveLexer.g:83:12: 'EXPORT'
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
			// HiveLexer.g:84:10: ( 'IMPORT' )
			// HiveLexer.g:84:12: 'IMPORT'
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
			// HiveLexer.g:85:8: ( 'DATA' )
			// HiveLexer.g:85:10: 'DATA'
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
			// HiveLexer.g:86:10: ( 'INPATH' )
			// HiveLexer.g:86:12: 'INPATH'
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
			// HiveLexer.g:87:6: ( 'IS' )
			// HiveLexer.g:87:8: 'IS'
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
			// HiveLexer.g:88:8: ( 'NULL' )
			// HiveLexer.g:88:10: 'NULL'
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
			// HiveLexer.g:89:10: ( 'CREATE' )
			// HiveLexer.g:89:12: 'CREATE'
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
			// HiveLexer.g:90:12: ( 'EXTERNAL' )
			// HiveLexer.g:90:14: 'EXTERNAL'
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
			// HiveLexer.g:91:9: ( 'ALTER' )
			// HiveLexer.g:91:11: 'ALTER'
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
			// HiveLexer.g:92:10: ( 'CHANGE' )
			// HiveLexer.g:92:12: 'CHANGE'
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
			// HiveLexer.g:93:10: ( 'COLUMN' )
			// HiveLexer.g:93:12: 'COLUMN'
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
			// HiveLexer.g:94:9: ( 'FIRST' )
			// HiveLexer.g:94:11: 'FIRST'
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
			// HiveLexer.g:95:9: ( 'AFTER' )
			// HiveLexer.g:95:11: 'AFTER'
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
			// HiveLexer.g:96:12: ( 'DESCRIBE' )
			// HiveLexer.g:96:14: 'DESCRIBE'
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
			// HiveLexer.g:97:8: ( 'DROP' )
			// HiveLexer.g:97:10: 'DROP'
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
			// HiveLexer.g:98:10: ( 'RENAME' )
			// HiveLexer.g:98:12: 'RENAME'
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
			// HiveLexer.g:99:10: ( 'IGNORE' )
			// HiveLexer.g:99:12: 'IGNORE'
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
			// HiveLexer.g:100:14: ( 'PROTECTION' )
			// HiveLexer.g:100:16: 'PROTECTION'
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
			// HiveLexer.g:101:6: ( 'TO' )
			// HiveLexer.g:101:8: 'TO'
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
			// HiveLexer.g:102:11: ( 'COMMENT' )
			// HiveLexer.g:102:13: 'COMMENT'
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
			// HiveLexer.g:103:11: ( 'BOOLEAN' )
			// HiveLexer.g:103:13: 'BOOLEAN'
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
			// HiveLexer.g:104:11: ( 'TINYINT' )
			// HiveLexer.g:104:13: 'TINYINT'
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
			// HiveLexer.g:105:12: ( 'SMALLINT' )
			// HiveLexer.g:105:14: 'SMALLINT'
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
			// HiveLexer.g:106:7: ( 'INT' )
			// HiveLexer.g:106:9: 'INT'
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
			// HiveLexer.g:107:10: ( 'BIGINT' )
			// HiveLexer.g:107:12: 'BIGINT'
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
			// HiveLexer.g:108:9: ( 'FLOAT' )
			// HiveLexer.g:108:11: 'FLOAT'
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
			// HiveLexer.g:109:10: ( 'DOUBLE' )
			// HiveLexer.g:109:12: 'DOUBLE'
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
			// HiveLexer.g:110:8: ( 'DATE' )
			// HiveLexer.g:110:10: 'DATE'
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
			// HiveLexer.g:111:12: ( 'DATETIME' )
			// HiveLexer.g:111:14: 'DATETIME'
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
			// HiveLexer.g:112:13: ( 'TIMESTAMP' )
			// HiveLexer.g:112:15: 'TIMESTAMP'
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
			// HiveLexer.g:113:11: ( 'DECIMAL' )
			// HiveLexer.g:113:13: 'DECIMAL'
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
			// HiveLexer.g:114:10: ( 'STRING' )
			// HiveLexer.g:114:12: 'STRING'
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
			// HiveLexer.g:115:11: ( 'VARCHAR' )
			// HiveLexer.g:115:13: 'VARCHAR'
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
			// HiveLexer.g:116:9: ( 'ARRAY' )
			// HiveLexer.g:116:11: 'ARRAY'
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
			// HiveLexer.g:117:10: ( 'STRUCT' )
			// HiveLexer.g:117:12: 'STRUCT'
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
			// HiveLexer.g:118:7: ( 'MAP' )
			// HiveLexer.g:118:9: 'MAP'
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
			// HiveLexer.g:119:13: ( 'UNIONTYPE' )
			// HiveLexer.g:119:15: 'UNIONTYPE'
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
			// HiveLexer.g:120:10: ( 'REDUCE' )
			// HiveLexer.g:120:12: 'REDUCE'
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
			// HiveLexer.g:121:15: ( 'PARTITIONED' )
			// HiveLexer.g:121:17: 'PARTITIONED'
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
			// HiveLexer.g:122:13: ( 'CLUSTERED' )
			// HiveLexer.g:122:15: 'CLUSTERED'
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
			// HiveLexer.g:123:10: ( 'SORTED' )
			// HiveLexer.g:123:12: 'SORTED'
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
			// HiveLexer.g:124:8: ( 'INTO' )
			// HiveLexer.g:124:10: 'INTO'
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
			// HiveLexer.g:125:11: ( 'BUCKETS' )
			// HiveLexer.g:125:13: 'BUCKETS'
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
			// HiveLexer.g:126:7: ( 'ROW' )
			// HiveLexer.g:126:9: 'ROW'
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
			// HiveLexer.g:127:8: ( 'ROWS' )
			// HiveLexer.g:127:10: 'ROWS'
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
			// HiveLexer.g:128:10: ( 'FORMAT' )
			// HiveLexer.g:128:12: 'FORMAT'
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
			// HiveLexer.g:129:13: ( 'DELIMITED' )
			// HiveLexer.g:129:15: 'DELIMITED'
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
			// HiveLexer.g:130:10: ( 'FIELDS' )
			// HiveLexer.g:130:12: 'FIELDS'
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
			// HiveLexer.g:131:14: ( 'TERMINATED' )
			// HiveLexer.g:131:16: 'TERMINATED'
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
			// HiveLexer.g:132:11: ( 'ESCAPED' )
			// HiveLexer.g:132:13: 'ESCAPED'
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
			// HiveLexer.g:133:14: ( 'COLLECTION' )
			// HiveLexer.g:133:16: 'COLLECTION'
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
			// HiveLexer.g:134:9: ( 'ITEMS' )
			// HiveLexer.g:134:11: 'ITEMS'
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
			// HiveLexer.g:135:8: ( 'KEYS' )
			// HiveLexer.g:135:10: 'KEYS'
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
			// HiveLexer.g:136:12: ( '$KEY$' )
			// HiveLexer.g:136:14: '$KEY$'
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
			// HiveLexer.g:137:9: ( 'LINES' )
			// HiveLexer.g:137:11: 'LINES'
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
			// HiveLexer.g:138:10: ( 'STORED' )
			// HiveLexer.g:138:12: 'STORED'
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
			// HiveLexer.g:139:14: ( 'FILEFORMAT' )
			// HiveLexer.g:139:16: 'FILEFORMAT'
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
			// HiveLexer.g:140:16: ( 'SEQUENCEFILE' )
			// HiveLexer.g:140:18: 'SEQUENCEFILE'
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
			// HiveLexer.g:141:12: ( 'TEXTFILE' )
			// HiveLexer.g:141:14: 'TEXTFILE'
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
			// HiveLexer.g:142:10: ( 'RCFILE' )
			// HiveLexer.g:142:12: 'RCFILE'
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
			// HiveLexer.g:143:11: ( 'ORC' )
			// HiveLexer.g:143:13: 'ORC'
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
			// HiveLexer.g:144:15: ( 'INPUTFORMAT' )
			// HiveLexer.g:144:17: 'INPUTFORMAT'
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
			// HiveLexer.g:145:16: ( 'OUTPUTFORMAT' )
			// HiveLexer.g:145:18: 'OUTPUTFORMAT'
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
			// HiveLexer.g:146:15: ( 'INPUTDRIVER' )
			// HiveLexer.g:146:17: 'INPUTDRIVER'
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
			// HiveLexer.g:147:16: ( 'OUTPUTDRIVER' )
			// HiveLexer.g:147:18: 'OUTPUTDRIVER'
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
			// HiveLexer.g:148:11: ( 'OFFLINE' )
			// HiveLexer.g:148:13: 'OFFLINE'
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
			// HiveLexer.g:149:10: ( 'ENABLE' )
			// HiveLexer.g:149:12: 'ENABLE'
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
			// HiveLexer.g:150:11: ( 'DISABLE' )
			// HiveLexer.g:150:13: 'DISABLE'
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
			// HiveLexer.g:151:12: ( 'READONLY' )
			// HiveLexer.g:151:14: 'READONLY'
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
			// HiveLexer.g:152:11: ( 'NO_DROP' )
			// HiveLexer.g:152:13: 'NO_DROP'
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
			// HiveLexer.g:153:12: ( 'LOCATION' )
			// HiveLexer.g:153:14: 'LOCATION'
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
			// HiveLexer.g:154:15: ( 'TABLESAMPLE' )
			// HiveLexer.g:154:17: 'TABLESAMPLE'
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
			// HiveLexer.g:155:10: ( 'BUCKET' )
			// HiveLexer.g:155:12: 'BUCKET'
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
			// HiveLexer.g:156:7: ( 'OUT' )
			// HiveLexer.g:156:9: 'OUT'
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
			// HiveLexer.g:157:6: ( 'OF' )
			// HiveLexer.g:157:8: 'OF'
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
			// HiveLexer.g:158:11: ( 'PERCENT' )
			// HiveLexer.g:158:13: 'PERCENT'
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
			// HiveLexer.g:159:8: ( 'CAST' )
			// HiveLexer.g:159:10: 'CAST'
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
			// HiveLexer.g:160:7: ( 'ADD' )
			// HiveLexer.g:160:9: 'ADD'
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
			// HiveLexer.g:161:11: ( 'REPLACE' )
			// HiveLexer.g:161:13: 'REPLACE'
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
			// HiveLexer.g:162:9: ( 'RLIKE' )
			// HiveLexer.g:162:11: 'RLIKE'
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
			// HiveLexer.g:163:10: ( 'REGEXP' )
			// HiveLexer.g:163:12: 'REGEXP'
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
			// HiveLexer.g:164:13: ( 'TEMPORARY' )
			// HiveLexer.g:164:15: 'TEMPORARY'
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
			// HiveLexer.g:165:12: ( 'FUNCTION' )
			// HiveLexer.g:165:14: 'FUNCTION'
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
			// HiveLexer.g:166:9: ( 'MACRO' )
			// HiveLexer.g:166:11: 'MACRO'
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
			// HiveLexer.g:167:11: ( 'EXPLAIN' )
			// HiveLexer.g:167:13: 'EXPLAIN'
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
			// HiveLexer.g:168:12: ( 'EXTENDED' )
			// HiveLexer.g:168:14: 'EXTENDED'
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
			// HiveLexer.g:169:13: ( 'FORMATTED' )
			// HiveLexer.g:169:15: 'FORMATTED'
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
			// HiveLexer.g:170:10: ( 'PRETTY' )
			// HiveLexer.g:170:12: 'PRETTY'
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
			// HiveLexer.g:171:14: ( 'DEPENDENCY' )
			// HiveLexer.g:171:16: 'DEPENDENCY'
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
			// HiveLexer.g:172:11: ( 'LOGICAL' )
			// HiveLexer.g:172:13: 'LOGICAL'
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
			// HiveLexer.g:173:9: ( 'SERDE' )
			// HiveLexer.g:173:11: 'SERDE'
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
			// HiveLexer.g:174:8: ( 'WITH' )
			// HiveLexer.g:174:10: 'WITH'
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
			// HiveLexer.g:175:12: ( 'DEFERRED' )
			// HiveLexer.g:175:14: 'DEFERRED'
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
			// HiveLexer.g:176:19: ( 'SERDEPROPERTIES' )
			// HiveLexer.g:176:21: 'SERDEPROPERTIES'
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
			// HiveLexer.g:177:16: ( 'DBPROPERTIES' )
			// HiveLexer.g:177:18: 'DBPROPERTIES'
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
			// HiveLexer.g:178:9: ( 'LIMIT' )
			// HiveLexer.g:178:11: 'LIMIT'
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
			// HiveLexer.g:179:7: ( 'SET' )
			// HiveLexer.g:179:9: 'SET'
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
			// HiveLexer.g:180:9: ( 'UNSET' )
			// HiveLexer.g:180:11: 'UNSET'
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
			// HiveLexer.g:181:17: ( 'TBLPROPERTIES' )
			// HiveLexer.g:181:19: 'TBLPROPERTIES'
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
			// HiveLexer.g:182:17: ( 'IDXPROPERTIES' )
			// HiveLexer.g:182:19: 'IDXPROPERTIES'
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
			// HiveLexer.g:183:14: ( '$VALUE$' )
			// HiveLexer.g:183:16: '$VALUE$'
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
			// HiveLexer.g:184:13: ( '$ELEM$' )
			// HiveLexer.g:184:15: '$ELEM$'
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
			// HiveLexer.g:185:8: ( 'CASE' )
			// HiveLexer.g:185:10: 'CASE'
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
			// HiveLexer.g:186:8: ( 'WHEN' )
			// HiveLexer.g:186:10: 'WHEN'
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
			// HiveLexer.g:187:8: ( 'THEN' )
			// HiveLexer.g:187:10: 'THEN'
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
			// HiveLexer.g:188:8: ( 'ELSE' )
			// HiveLexer.g:188:10: 'ELSE'
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
			// HiveLexer.g:189:7: ( 'END' )
			// HiveLexer.g:189:9: 'END'
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
			// HiveLexer.g:190:11: ( 'MAPJOIN' )
			// HiveLexer.g:190:13: 'MAPJOIN'
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
			// HiveLexer.g:192:15: ( 'STREAMTABLE' )
			// HiveLexer.g:192:17: 'STREAMTABLE'
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
			// HiveLexer.g:193:16: ( 'HOLD_DDLTIME' )
			// HiveLexer.g:193:18: 'HOLD_DDLTIME'
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
			// HiveLexer.g:194:17: ( 'CLUSTERSTATUS' )
			// HiveLexer.g:194:19: 'CLUSTERSTATUS'
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
			// HiveLexer.g:195:7: ( 'UTC' )
			// HiveLexer.g:195:9: 'UTC'
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
			// HiveLexer.g:196:16: ( 'UTC_TMESTAMP' )
			// HiveLexer.g:196:18: 'UTC_TMESTAMP'
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
			// HiveLexer.g:197:8: ( 'LONG' )
			// HiveLexer.g:197:10: 'LONG'
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
			// HiveLexer.g:198:10: ( 'DELETE' )
			// HiveLexer.g:198:12: 'DELETE'
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
			// HiveLexer.g:199:8: ( 'PLUS' )
			// HiveLexer.g:199:10: 'PLUS'
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
			// HiveLexer.g:200:9: ( 'MINUS' )
			// HiveLexer.g:200:11: 'MINUS'
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
			// HiveLexer.g:201:9: ( 'FETCH' )
			// HiveLexer.g:201:11: 'FETCH'
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
			// HiveLexer.g:202:13: ( 'INTERSECT' )
			// HiveLexer.g:202:15: 'INTERSECT'
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
			// HiveLexer.g:203:8: ( 'VIEW' )
			// HiveLexer.g:203:10: 'VIEW'
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
			// HiveLexer.g:204:6: ( 'IN' )
			// HiveLexer.g:204:8: 'IN'
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
			// HiveLexer.g:205:12: ( 'DATABASE' )
			// HiveLexer.g:205:14: 'DATABASE'
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
			// HiveLexer.g:206:13: ( 'DATABASES' )
			// HiveLexer.g:206:15: 'DATABASES'
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
			// HiveLexer.g:207:16: ( 'MATERIALIZED' )
			// HiveLexer.g:207:18: 'MATERIALIZED'
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
			// HiveLexer.g:208:10: ( 'SCHEMA' )
			// HiveLexer.g:208:12: 'SCHEMA'
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
			// HiveLexer.g:209:11: ( 'SCHEMAS' )
			// HiveLexer.g:209:13: 'SCHEMAS'
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
			// HiveLexer.g:210:9: ( 'GRANT' )
			// HiveLexer.g:210:11: 'GRANT'
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
			// HiveLexer.g:211:10: ( 'REVOKE' )
			// HiveLexer.g:211:12: 'REVOKE'
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
			// HiveLexer.g:212:7: ( 'SSL' )
			// HiveLexer.g:212:9: 'SSL'
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
			// HiveLexer.g:213:8: ( 'UNDO' )
			// HiveLexer.g:213:10: 'UNDO'
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
			// HiveLexer.g:214:8: ( 'LOCK' )
			// HiveLexer.g:214:10: 'LOCK'
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
			// HiveLexer.g:215:9: ( 'LOCKS' )
			// HiveLexer.g:215:11: 'LOCKS'
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
			// HiveLexer.g:216:10: ( 'UNLOCK' )
			// HiveLexer.g:216:12: 'UNLOCK'
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
			// HiveLexer.g:217:10: ( 'SHARED' )
			// HiveLexer.g:217:12: 'SHARED'
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
			// HiveLexer.g:218:13: ( 'EXCLUSIVE' )
			// HiveLexer.g:218:15: 'EXCLUSIVE'
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
			// HiveLexer.g:219:13: ( 'PROCEDURE' )
			// HiveLexer.g:219:15: 'PROCEDURE'
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
			// HiveLexer.g:220:12: ( 'UNSIGNED' )
			// HiveLexer.g:220:14: 'UNSIGNED'
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
			// HiveLexer.g:221:9: ( 'WHILE' )
			// HiveLexer.g:221:11: 'WHILE'
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
			// HiveLexer.g:222:8: ( 'READ' )
			// HiveLexer.g:222:10: 'READ'
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
			// HiveLexer.g:223:9: ( 'READS' )
			// HiveLexer.g:223:11: 'READS'
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
			// HiveLexer.g:224:9: ( 'PURGE' )
			// HiveLexer.g:224:11: 'PURGE'
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
			// HiveLexer.g:225:9: ( 'RANGE' )
			// HiveLexer.g:225:11: 'RANGE'
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
			// HiveLexer.g:226:11: ( 'ANALYZE' )
			// HiveLexer.g:226:13: 'ANALYZE'
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
			// HiveLexer.g:227:10: ( 'BEFORE' )
			// HiveLexer.g:227:12: 'BEFORE'
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
			// HiveLexer.g:228:11: ( 'BETWEEN' )
			// HiveLexer.g:228:13: 'BETWEEN'
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
			// HiveLexer.g:229:8: ( 'BOTH' )
			// HiveLexer.g:229:10: 'BOTH'
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
			// HiveLexer.g:230:10: ( 'BINARY' )
			// HiveLexer.g:230:12: 'BINARY'
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
			// HiveLexer.g:231:9: ( 'CROSS' )
			// HiveLexer.g:231:11: 'CROSS'
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
			// HiveLexer.g:232:12: ( 'CONTINUE' )
			// HiveLexer.g:232:14: 'CONTINUE'
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
			// HiveLexer.g:233:10: ( 'CURSOR' )
			// HiveLexer.g:233:12: 'CURSOR'
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
			// HiveLexer.g:234:11: ( 'TRIGGER' )
			// HiveLexer.g:234:13: 'TRIGGER'
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
			// HiveLexer.g:235:16: ( 'RECORDREADER' )
			// HiveLexer.g:235:18: 'RECORDREADER'
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
			// HiveLexer.g:236:16: ( 'RECORDWRITER' )
			// HiveLexer.g:236:18: 'RECORDWRITER'
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
			// HiveLexer.g:237:8: ( 'SEMI' )
			// HiveLexer.g:237:10: 'SEMI'
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
			// HiveLexer.g:238:11: ( 'LATERAL' )
			// HiveLexer.g:238:13: 'LATERAL'
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
			// HiveLexer.g:239:9: ( 'TOUCH' )
			// HiveLexer.g:239:11: 'TOUCH'
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
			// HiveLexer.g:240:11: ( 'ARCHIVE' )
			// HiveLexer.g:240:13: 'ARCHIVE'
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
			// HiveLexer.g:241:13: ( 'UNARCHIVE' )
			// HiveLexer.g:241:15: 'UNARCHIVE'
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
			// HiveLexer.g:242:11: ( 'COMPUTE' )
			// HiveLexer.g:242:13: 'COMPUTE'
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
			// HiveLexer.g:243:14: ( 'STATISTICS' )
			// HiveLexer.g:243:16: 'STATISTICS'
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
			// HiveLexer.g:244:7: ( 'USE' )
			// HiveLexer.g:244:9: 'USE'
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
			// HiveLexer.g:245:10: ( 'OPTION' )
			// HiveLexer.g:245:12: 'OPTION'
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
			// HiveLexer.g:246:15: ( 'CONCATENATE' )
			// HiveLexer.g:246:17: 'CONCATENATE'
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
			// HiveLexer.g:247:17: ( 'SHOW_DATABASE' )
			// HiveLexer.g:247:19: 'SHOW_DATABASE'
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
			// HiveLexer.g:248:10: ( 'UPDATE' )
			// HiveLexer.g:248:12: 'UPDATE'
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
			// HiveLexer.g:249:12: ( 'RESTRICT' )
			// HiveLexer.g:249:14: 'RESTRICT'
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
			// HiveLexer.g:250:11: ( 'CASCADE' )
			// HiveLexer.g:250:13: 'CASCADE'
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
			// HiveLexer.g:251:10: ( 'SKEWED' )
			// HiveLexer.g:251:12: 'SKEWED'
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
			// HiveLexer.g:252:10: ( 'ROLLUP' )
			// HiveLexer.g:252:12: 'ROLLUP'
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
			// HiveLexer.g:253:8: ( 'CUBE' )
			// HiveLexer.g:253:10: 'CUBE'
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
			// HiveLexer.g:254:15: ( 'DIRECTORIES' )
			// HiveLexer.g:254:17: 'DIRECTORIES'
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
			// HiveLexer.g:255:7: ( 'FOR' )
			// HiveLexer.g:255:9: 'FOR'
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
			// HiveLexer.g:256:10: ( 'WINDOW' )
			// HiveLexer.g:256:12: 'WINDOW'
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
			// HiveLexer.g:257:13: ( 'UNBOUNDED' )
			// HiveLexer.g:257:15: 'UNBOUNDED'
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
			// HiveLexer.g:258:13: ( 'PRECEDING' )
			// HiveLexer.g:258:15: 'PRECEDING'
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
			// HiveLexer.g:259:13: ( 'FOLLOWING' )
			// HiveLexer.g:259:15: 'FOLLOWING'
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
			// HiveLexer.g:260:11: ( 'CURRENT' )
			// HiveLexer.g:260:13: 'CURRENT'
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
			// HiveLexer.g:261:8: ( 'LESS' )
			// HiveLexer.g:261:10: 'LESS'
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
			// HiveLexer.g:262:8: ( 'MORE' )
			// HiveLexer.g:262:10: 'MORE'
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
			// HiveLexer.g:263:8: ( 'OVER' )
			// HiveLexer.g:263:10: 'OVER'
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
			// HiveLexer.g:264:12: ( 'GROUPING' )
			// HiveLexer.g:264:14: 'GROUPING'
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
			// HiveLexer.g:265:8: ( 'SETS' )
			// HiveLexer.g:265:10: 'SETS'
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
			// HiveLexer.g:266:12: ( 'TRUNCATE' )
			// HiveLexer.g:266:14: 'TRUNCATE'
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
			// HiveLexer.g:267:10: ( 'NOSCAN' )
			// HiveLexer.g:267:12: 'NOSCAN'
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
			// HiveLexer.g:268:15: ( 'PARTIALSCAN' )
			// HiveLexer.g:268:17: 'PARTIALSCAN'
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
			// HiveLexer.g:269:8: ( 'USER' )
			// HiveLexer.g:269:10: 'USER'
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
			// HiveLexer.g:270:8: ( 'ROLE' )
			// HiveLexer.g:270:10: 'ROLE'
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
			// HiveLexer.g:271:9: ( 'INNER' )
			// HiveLexer.g:271:11: 'INNER'
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
			// HiveLexer.g:272:12: ( 'EXCHANGE' )
			// HiveLexer.g:272:14: 'EXCHANGE'
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
			// HiveLexer.g:277:5: ( '.' )
			// HiveLexer.g:277:7: '.'
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
			// HiveLexer.g:278:7: ( ':' )
			// HiveLexer.g:278:9: ':'
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
			// HiveLexer.g:279:7: ( ',' )
			// HiveLexer.g:279:9: ','
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
			// HiveLexer.g:280:11: ( ';' )
			// HiveLexer.g:280:13: ';'
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
			// HiveLexer.g:282:8: ( '(' )
			// HiveLexer.g:282:10: '('
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
			// HiveLexer.g:283:8: ( ')' )
			// HiveLexer.g:283:10: ')'
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
			// HiveLexer.g:284:9: ( '[' )
			// HiveLexer.g:284:11: '['
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
			// HiveLexer.g:285:9: ( ']' )
			// HiveLexer.g:285:11: ']'
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
			// HiveLexer.g:286:8: ( '{' )
			// HiveLexer.g:286:10: '{'
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
			// HiveLexer.g:287:8: ( '}' )
			// HiveLexer.g:287:10: '}'
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
			// HiveLexer.g:289:7: ( '=' | '==' )
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
					// HiveLexer.g:289:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// HiveLexer.g:289:15: '=='
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
			// HiveLexer.g:290:10: ( '<=>' )
			// HiveLexer.g:290:12: '<=>'
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
			// HiveLexer.g:291:10: ( '<>' | '!=' )
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
					// HiveLexer.g:291:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// HiveLexer.g:291:19: '!='
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
			// HiveLexer.g:292:19: ( '<=' )
			// HiveLexer.g:292:21: '<='
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
			// HiveLexer.g:293:10: ( '<' )
			// HiveLexer.g:293:12: '<'
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
			// HiveLexer.g:294:22: ( '>=' )
			// HiveLexer.g:294:24: '>='
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
			// HiveLexer.g:295:13: ( '>' )
			// HiveLexer.g:295:15: '>'
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
			// HiveLexer.g:297:8: ( '/' )
			// HiveLexer.g:297:10: '/'
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
			// HiveLexer.g:298:6: ( '+' )
			// HiveLexer.g:298:8: '+'
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
			// HiveLexer.g:299:7: ( '-' )
			// HiveLexer.g:299:9: '-'
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
			// HiveLexer.g:300:6: ( '*' )
			// HiveLexer.g:300:8: '*'
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
			// HiveLexer.g:301:5: ( '%' )
			// HiveLexer.g:301:7: '%'
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
			// HiveLexer.g:302:5: ( 'DIV' )
			// HiveLexer.g:302:7: 'DIV'
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
			// HiveLexer.g:304:11: ( '&' )
			// HiveLexer.g:304:13: '&'
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
			// HiveLexer.g:305:7: ( '~' )
			// HiveLexer.g:305:9: '~'
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
			// HiveLexer.g:306:11: ( '|' )
			// HiveLexer.g:306:13: '|'
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
			// HiveLexer.g:307:12: ( '^' )
			// HiveLexer.g:307:14: '^'
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
			// HiveLexer.g:308:10: ( '?' )
			// HiveLexer.g:308:12: '?'
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
			// HiveLexer.g:309:8: ( '$' )
			// HiveLexer.g:309:10: '$'
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

	// $ANTLR start "JANUARY"
	public final void mJANUARY() throws RecognitionException {
		try {
			int _type = JANUARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:315:11: ( 'january' ( 's' )? | 'jan' ( DOT )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='j') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='a') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='n') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='u') ) {
							alt6=1;
						}

						else {
							alt6=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// HiveLexer.g:315:13: 'january' ( 's' )?
					{
					match("january"); 

					// HiveLexer.g:315:25: ( 's' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='s') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// HiveLexer.g:315:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:315:33: 'jan' ( DOT )?
					{
					match("jan"); 

					// HiveLexer.g:315:39: ( DOT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "JANUARY"

	// $ANTLR start "FEBRUARY"
	public final void mFEBRUARY() throws RecognitionException {
		try {
			int _type = FEBRUARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:316:11: ( 'february' ( 's' )? | 'feb' ( DOT )? )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='f') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='e') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='b') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='r') ) {
							alt9=1;
						}

						else {
							alt9=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// HiveLexer.g:316:13: 'february' ( 's' )?
					{
					match("february"); 

					// HiveLexer.g:316:25: ( 's' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='s') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// HiveLexer.g:316:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:316:33: 'feb' ( DOT )?
					{
					match("feb"); 

					// HiveLexer.g:316:39: ( DOT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='.') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "FEBRUARY"

	// $ANTLR start "MARCH"
	public final void mMARCH() throws RecognitionException {
		try {
			int _type = MARCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:317:11: ( 'march' ( 'es' )? | 'mar' ( DOT )? )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='m') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='a') ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2=='r') ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3=='c') ) {
							alt12=1;
						}

						else {
							alt12=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// HiveLexer.g:317:13: 'march' ( 'es' )?
					{
					match("march"); 

					// HiveLexer.g:317:25: ( 'es' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// HiveLexer.g:317:25: 'es'
							{
							match("es"); 

							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:317:33: 'mar' ( DOT )?
					{
					match("mar"); 

					// HiveLexer.g:317:39: ( DOT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='.') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "MARCH"

	// $ANTLR start "APRIL"
	public final void mAPRIL() throws RecognitionException {
		try {
			int _type = APRIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:318:11: ( 'april' ( 's' )? | 'apr' ( DOT )? )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='a') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='p') ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2=='r') ) {
						int LA15_3 = input.LA(4);
						if ( (LA15_3=='i') ) {
							alt15=1;
						}

						else {
							alt15=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// HiveLexer.g:318:13: 'april' ( 's' )?
					{
					match("april"); 

					// HiveLexer.g:318:25: ( 's' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='s') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// HiveLexer.g:318:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:318:33: 'apr' ( DOT )?
					{
					match("apr"); 

					// HiveLexer.g:318:39: ( DOT )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='.') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "APRIL"

	// $ANTLR start "MAY"
	public final void mMAY() throws RecognitionException {
		try {
			int _type = MAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:319:11: ( 'may' ( 's' )? )
			// HiveLexer.g:319:13: 'may' ( 's' )?
			{
			match("may"); 

			// HiveLexer.g:319:25: ( 's' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='s') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// HiveLexer.g:319:25: 's'
					{
					match('s'); 
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
	// $ANTLR end "MAY"

	// $ANTLR start "JUNE"
	public final void mJUNE() throws RecognitionException {
		try {
			int _type = JUNE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:320:11: ( 'june' ( 's' )? | 'jun' ( DOT )? )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='j') ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='u') ) {
					int LA19_2 = input.LA(3);
					if ( (LA19_2=='n') ) {
						int LA19_3 = input.LA(4);
						if ( (LA19_3=='e') ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// HiveLexer.g:320:13: 'june' ( 's' )?
					{
					match("june"); 

					// HiveLexer.g:320:25: ( 's' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='s') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// HiveLexer.g:320:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:320:33: 'jun' ( DOT )?
					{
					match("jun"); 

					// HiveLexer.g:320:39: ( DOT )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='.') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "JUNE"

	// $ANTLR start "JULY"
	public final void mJULY() throws RecognitionException {
		try {
			int _type = JULY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:321:11: ( 'july' ( 's' )? | 'jul' ( DOT )? )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='j') ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1=='u') ) {
					int LA22_2 = input.LA(3);
					if ( (LA22_2=='l') ) {
						int LA22_3 = input.LA(4);
						if ( (LA22_3=='y') ) {
							alt22=1;
						}

						else {
							alt22=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// HiveLexer.g:321:13: 'july' ( 's' )?
					{
					match("july"); 

					// HiveLexer.g:321:25: ( 's' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='s') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// HiveLexer.g:321:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:321:33: 'jul' ( DOT )?
					{
					match("jul"); 

					// HiveLexer.g:321:39: ( DOT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0=='.') ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "JULY"

	// $ANTLR start "AUGUST"
	public final void mAUGUST() throws RecognitionException {
		try {
			int _type = AUGUST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:322:11: ( 'august' ( 's' )? | 'aug' ( DOT )? )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='a') ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1=='u') ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2=='g') ) {
						int LA25_3 = input.LA(4);
						if ( (LA25_3=='u') ) {
							alt25=1;
						}

						else {
							alt25=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// HiveLexer.g:322:13: 'august' ( 's' )?
					{
					match("august"); 

					// HiveLexer.g:322:25: ( 's' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='s') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// HiveLexer.g:322:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:322:33: 'aug' ( DOT )?
					{
					match("aug"); 

					// HiveLexer.g:322:39: ( DOT )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='.') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "AUGUST"

	// $ANTLR start "SEPTEMBER"
	public final void mSEPTEMBER() throws RecognitionException {
		try {
			int _type = SEPTEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:323:11: ( 'september' ( 's' )? | 'sep' ( DOT )? | 'sept' ( DOT )? )
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='s') ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1=='e') ) {
					int LA29_2 = input.LA(3);
					if ( (LA29_2=='p') ) {
						int LA29_3 = input.LA(4);
						if ( (LA29_3=='t') ) {
							int LA29_4 = input.LA(5);
							if ( (LA29_4=='e') ) {
								alt29=1;
							}

							else {
								alt29=3;
							}

						}

						else {
							alt29=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// HiveLexer.g:323:13: 'september' ( 's' )?
					{
					match("september"); 

					// HiveLexer.g:323:25: ( 's' )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0=='s') ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// HiveLexer.g:323:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:323:33: 'sep' ( DOT )?
					{
					match("sep"); 

					// HiveLexer.g:323:39: ( DOT )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0=='.') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:323:46: 'sept' ( DOT )?
					{
					match("sept"); 

					// HiveLexer.g:323:53: ( DOT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='.') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "SEPTEMBER"

	// $ANTLR start "OCTOBER"
	public final void mOCTOBER() throws RecognitionException {
		try {
			int _type = OCTOBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:324:11: ( 'october' ( 's' )? | 'oct' ( DOT )? )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='o') ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1=='c') ) {
					int LA32_2 = input.LA(3);
					if ( (LA32_2=='t') ) {
						int LA32_3 = input.LA(4);
						if ( (LA32_3=='o') ) {
							alt32=1;
						}

						else {
							alt32=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// HiveLexer.g:324:13: 'october' ( 's' )?
					{
					match("october"); 

					// HiveLexer.g:324:25: ( 's' )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0=='s') ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// HiveLexer.g:324:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:324:33: 'oct' ( DOT )?
					{
					match("oct"); 

					// HiveLexer.g:324:39: ( DOT )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0=='.') ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "OCTOBER"

	// $ANTLR start "NOVEMBER"
	public final void mNOVEMBER() throws RecognitionException {
		try {
			int _type = NOVEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:325:11: ( 'november' ( 's' )? | 'nov' ( DOT )? )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='n') ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1=='o') ) {
					int LA35_2 = input.LA(3);
					if ( (LA35_2=='v') ) {
						int LA35_3 = input.LA(4);
						if ( (LA35_3=='e') ) {
							alt35=1;
						}

						else {
							alt35=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// HiveLexer.g:325:13: 'november' ( 's' )?
					{
					match("november"); 

					// HiveLexer.g:325:25: ( 's' )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0=='s') ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// HiveLexer.g:325:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:325:33: 'nov' ( DOT )?
					{
					match("nov"); 

					// HiveLexer.g:325:39: ( DOT )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0=='.') ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "NOVEMBER"

	// $ANTLR start "DECEMBER"
	public final void mDECEMBER() throws RecognitionException {
		try {
			int _type = DECEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:326:11: ( 'december' ( 's' )? | 'dec' ( DOT )? )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='d') ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1=='e') ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2=='c') ) {
						int LA38_3 = input.LA(4);
						if ( (LA38_3=='e') ) {
							alt38=1;
						}

						else {
							alt38=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// HiveLexer.g:326:13: 'december' ( 's' )?
					{
					match("december"); 

					// HiveLexer.g:326:25: ( 's' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0=='s') ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// HiveLexer.g:326:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:326:33: 'dec' ( DOT )?
					{
					match("dec"); 

					// HiveLexer.g:326:39: ( DOT )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0=='.') ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "DECEMBER"

	// $ANTLR start "SUNDAY"
	public final void mSUNDAY() throws RecognitionException {
		try {
			int _type = SUNDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:328:11: ( 'sunday' ( 's' )? | 'sun' ( DOT )? | 'suns' ( DOT )? )
			int alt42=3;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='s') ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1=='u') ) {
					int LA42_2 = input.LA(3);
					if ( (LA42_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt42=1;
							}
							break;
						case 's':
							{
							alt42=3;
							}
							break;
						default:
							alt42=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 42, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// HiveLexer.g:328:13: 'sunday' ( 's' )?
					{
					match("sunday"); 

					// HiveLexer.g:328:25: ( 's' )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0=='s') ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// HiveLexer.g:328:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:328:33: 'sun' ( DOT )?
					{
					match("sun"); 

					// HiveLexer.g:328:39: ( DOT )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0=='.') ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:328:47: 'suns' ( DOT )?
					{
					match("suns"); 

					// HiveLexer.g:328:54: ( DOT )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0=='.') ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "SUNDAY"

	// $ANTLR start "MONDAY"
	public final void mMONDAY() throws RecognitionException {
		try {
			int _type = MONDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:329:11: ( 'monday' ( 's' )? | 'mon' ( DOT )? | 'mons' ( DOT )? )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='m') ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1=='o') ) {
					int LA46_2 = input.LA(3);
					if ( (LA46_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt46=1;
							}
							break;
						case 's':
							{
							alt46=3;
							}
							break;
						default:
							alt46=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// HiveLexer.g:329:13: 'monday' ( 's' )?
					{
					match("monday"); 

					// HiveLexer.g:329:25: ( 's' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0=='s') ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// HiveLexer.g:329:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:329:33: 'mon' ( DOT )?
					{
					match("mon"); 

					// HiveLexer.g:329:39: ( DOT )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0=='.') ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:329:47: 'mons' ( DOT )?
					{
					match("mons"); 

					// HiveLexer.g:329:54: ( DOT )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0=='.') ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "MONDAY"

	// $ANTLR start "TUESDAY"
	public final void mTUESDAY() throws RecognitionException {
		try {
			int _type = TUESDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:330:11: ( 'tuesday' ( 's' )? | 'tues' ( DOT )? | 'tue' ( DOT )? )
			int alt50=3;
			int LA50_0 = input.LA(1);
			if ( (LA50_0=='t') ) {
				int LA50_1 = input.LA(2);
				if ( (LA50_1=='u') ) {
					int LA50_2 = input.LA(3);
					if ( (LA50_2=='e') ) {
						int LA50_3 = input.LA(4);
						if ( (LA50_3=='s') ) {
							int LA50_4 = input.LA(5);
							if ( (LA50_4=='d') ) {
								alt50=1;
							}

							else {
								alt50=2;
							}

						}

						else {
							alt50=3;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 50, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// HiveLexer.g:330:13: 'tuesday' ( 's' )?
					{
					match("tuesday"); 

					// HiveLexer.g:330:25: ( 's' )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0=='s') ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// HiveLexer.g:330:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:330:33: 'tues' ( DOT )?
					{
					match("tues"); 

					// HiveLexer.g:330:40: ( DOT )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0=='.') ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:330:47: 'tue' ( DOT )?
					{
					match("tue"); 

					// HiveLexer.g:330:53: ( DOT )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0=='.') ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "TUESDAY"

	// $ANTLR start "WEDNESDAY"
	public final void mWEDNESDAY() throws RecognitionException {
		try {
			int _type = WEDNESDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:331:11: ( 'wednesday' ( 's' )? | 'wed' ( DOT )? | 'weds' ( DOT )? )
			int alt54=3;
			int LA54_0 = input.LA(1);
			if ( (LA54_0=='w') ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1=='e') ) {
					int LA54_2 = input.LA(3);
					if ( (LA54_2=='d') ) {
						switch ( input.LA(4) ) {
						case 'n':
							{
							alt54=1;
							}
							break;
						case 's':
							{
							alt54=3;
							}
							break;
						default:
							alt54=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 54, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// HiveLexer.g:331:13: 'wednesday' ( 's' )?
					{
					match("wednesday"); 

					// HiveLexer.g:331:25: ( 's' )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0=='s') ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// HiveLexer.g:331:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:331:33: 'wed' ( DOT )?
					{
					match("wed"); 

					// HiveLexer.g:331:39: ( DOT )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0=='.') ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:331:47: 'weds' ( DOT )?
					{
					match("weds"); 

					// HiveLexer.g:331:54: ( DOT )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0=='.') ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "WEDNESDAY"

	// $ANTLR start "THURSDAY"
	public final void mTHURSDAY() throws RecognitionException {
		try {
			int _type = THURSDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:332:11: ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? )
			int alt60=5;
			int LA60_0 = input.LA(1);
			if ( (LA60_0=='t') ) {
				int LA60_1 = input.LA(2);
				if ( (LA60_1=='h') ) {
					int LA60_2 = input.LA(3);
					if ( (LA60_2=='u') ) {
						switch ( input.LA(4) ) {
						case 'r':
							{
							int LA60_4 = input.LA(5);
							if ( (LA60_4=='s') ) {
								int LA60_7 = input.LA(6);
								if ( (LA60_7=='d') ) {
									alt60=1;
								}

								else {
									alt60=5;
								}

							}

							else {
								alt60=2;
							}

							}
							break;
						case 's':
							{
							alt60=4;
							}
							break;
						default:
							alt60=3;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 60, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// HiveLexer.g:332:13: 'thursday' ( 's' )?
					{
					match("thursday"); 

					// HiveLexer.g:332:25: ( 's' )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0=='s') ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// HiveLexer.g:332:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:332:33: 'thur' ( DOT )?
					{
					match("thur"); 

					// HiveLexer.g:332:40: ( DOT )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0=='.') ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:332:47: 'thu' ( DOT )?
					{
					match("thu"); 

					// HiveLexer.g:332:53: ( DOT )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0=='.') ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 4 :
					// HiveLexer.g:332:62: 'thus' ( DOT )?
					{
					match("thus"); 

					// HiveLexer.g:332:69: ( DOT )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0=='.') ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 5 :
					// HiveLexer.g:332:76: 'thurs' ( DOT )?
					{
					match("thurs"); 

					// HiveLexer.g:332:84: ( DOT )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0=='.') ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "THURSDAY"

	// $ANTLR start "FRIDAY"
	public final void mFRIDAY() throws RecognitionException {
		try {
			int _type = FRIDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:333:11: ( 'friday' ( 's' )? | 'fri' ( DOT )? | 'fris' ( DOT )? )
			int alt64=3;
			int LA64_0 = input.LA(1);
			if ( (LA64_0=='f') ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1=='r') ) {
					int LA64_2 = input.LA(3);
					if ( (LA64_2=='i') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt64=1;
							}
							break;
						case 's':
							{
							alt64=3;
							}
							break;
						default:
							alt64=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// HiveLexer.g:333:13: 'friday' ( 's' )?
					{
					match("friday"); 

					// HiveLexer.g:333:25: ( 's' )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0=='s') ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// HiveLexer.g:333:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:333:33: 'fri' ( DOT )?
					{
					match("fri"); 

					// HiveLexer.g:333:39: ( DOT )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0=='.') ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:333:47: 'fris' ( DOT )?
					{
					match("fris"); 

					// HiveLexer.g:333:54: ( DOT )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0=='.') ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "FRIDAY"

	// $ANTLR start "SATURDAY"
	public final void mSATURDAY() throws RecognitionException {
		try {
			int _type = SATURDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:334:11: ( 'saturday' ( 's' )? | 'sat' ( DOT )? | 'sats' ( DOT )? | 'weekend' )
			int alt68=4;
			int LA68_0 = input.LA(1);
			if ( (LA68_0=='s') ) {
				int LA68_1 = input.LA(2);
				if ( (LA68_1=='a') ) {
					int LA68_3 = input.LA(3);
					if ( (LA68_3=='t') ) {
						switch ( input.LA(4) ) {
						case 'u':
							{
							alt68=1;
							}
							break;
						case 's':
							{
							alt68=3;
							}
							break;
						default:
							alt68=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 68, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA68_0=='w') ) {
				alt68=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// HiveLexer.g:334:13: 'saturday' ( 's' )?
					{
					match("saturday"); 

					// HiveLexer.g:334:25: ( 's' )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0=='s') ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// HiveLexer.g:334:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:334:33: 'sat' ( DOT )?
					{
					match("sat"); 

					// HiveLexer.g:334:39: ( DOT )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0=='.') ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 3 :
					// HiveLexer.g:334:47: 'sats' ( DOT )?
					{
					match("sats"); 

					// HiveLexer.g:334:54: ( DOT )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0=='.') ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 4 :
					// HiveLexer.g:334:62: 'weekend'
					{
					match("weekend"); 

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
	// $ANTLR end "SATURDAY"

	// $ANTLR start "HOUR"
	public final void mHOUR() throws RecognitionException {
		try {
			int _type = HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:336:8: ( 'hour' | 'hours' | 'hr' ( DOT )? | 'hrs' ( DOT )? )
			int alt71=4;
			int LA71_0 = input.LA(1);
			if ( (LA71_0=='h') ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1=='o') ) {
					int LA71_2 = input.LA(3);
					if ( (LA71_2=='u') ) {
						int LA71_4 = input.LA(4);
						if ( (LA71_4=='r') ) {
							int LA71_7 = input.LA(5);
							if ( (LA71_7=='s') ) {
								alt71=2;
							}

							else {
								alt71=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 71, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA71_1=='r') ) {
					int LA71_3 = input.LA(3);
					if ( (LA71_3=='s') ) {
						alt71=4;
					}

					else {
						alt71=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// HiveLexer.g:336:10: 'hour'
					{
					match("hour"); 

					}
					break;
				case 2 :
					// HiveLexer.g:336:21: 'hours'
					{
					match("hours"); 

					}
					break;
				case 3 :
					// HiveLexer.g:336:33: 'hr' ( DOT )?
					{
					match("hr"); 

					// HiveLexer.g:336:38: ( DOT )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0=='.') ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 4 :
					// HiveLexer.g:336:46: 'hrs' ( DOT )?
					{
					match("hrs"); 

					// HiveLexer.g:336:52: ( DOT )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0=='.') ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "HOUR"

	// $ANTLR start "MINUTE"
	public final void mMINUTE() throws RecognitionException {
		try {
			int _type = MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:337:8: ( 'minute' | 'minutes' | 'min' ( DOT )? | 'mins' ( DOT )? )
			int alt74=4;
			int LA74_0 = input.LA(1);
			if ( (LA74_0=='m') ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1=='i') ) {
					int LA74_2 = input.LA(3);
					if ( (LA74_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'u':
							{
							int LA74_4 = input.LA(5);
							if ( (LA74_4=='t') ) {
								int LA74_7 = input.LA(6);
								if ( (LA74_7=='e') ) {
									int LA74_8 = input.LA(7);
									if ( (LA74_8=='s') ) {
										alt74=2;
									}

									else {
										alt74=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 74, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 74, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 's':
							{
							alt74=4;
							}
							break;
						default:
							alt74=3;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 74, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// HiveLexer.g:337:10: 'minute'
					{
					match("minute"); 

					}
					break;
				case 2 :
					// HiveLexer.g:337:21: 'minutes'
					{
					match("minutes"); 

					}
					break;
				case 3 :
					// HiveLexer.g:337:33: 'min' ( DOT )?
					{
					match("min"); 

					// HiveLexer.g:337:39: ( DOT )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0=='.') ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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

					}
					break;
				case 4 :
					// HiveLexer.g:337:46: 'mins' ( DOT )?
					{
					match("mins"); 

					// HiveLexer.g:337:53: ( DOT )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0=='.') ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "MINUTE"

	// $ANTLR start "DAY"
	public final void mDAY() throws RecognitionException {
		try {
			int _type = DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:338:8: ( 'day' | 'days' )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0=='d') ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1=='a') ) {
					int LA75_2 = input.LA(3);
					if ( (LA75_2=='y') ) {
						int LA75_3 = input.LA(4);
						if ( (LA75_3=='s') ) {
							alt75=2;
						}

						else {
							alt75=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 75, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// HiveLexer.g:338:10: 'day'
					{
					match("day"); 

					}
					break;
				case 2 :
					// HiveLexer.g:338:21: 'days'
					{
					match("days"); 

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
	// $ANTLR end "DAY"

	// $ANTLR start "WEEK"
	public final void mWEEK() throws RecognitionException {
		try {
			int _type = WEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:339:8: ( 'week' | 'weeks' | 'wks' ( DOT )? )
			int alt77=3;
			int LA77_0 = input.LA(1);
			if ( (LA77_0=='w') ) {
				int LA77_1 = input.LA(2);
				if ( (LA77_1=='e') ) {
					int LA77_2 = input.LA(3);
					if ( (LA77_2=='e') ) {
						int LA77_4 = input.LA(4);
						if ( (LA77_4=='k') ) {
							int LA77_5 = input.LA(5);
							if ( (LA77_5=='s') ) {
								alt77=2;
							}

							else {
								alt77=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 77, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 77, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA77_1=='k') ) {
					alt77=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// HiveLexer.g:339:10: 'week'
					{
					match("week"); 

					}
					break;
				case 2 :
					// HiveLexer.g:339:21: 'weeks'
					{
					match("weeks"); 

					}
					break;
				case 3 :
					// HiveLexer.g:339:33: 'wks' ( DOT )?
					{
					match("wks"); 

					// HiveLexer.g:339:39: ( DOT )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0=='.') ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "WEEK"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			int _type = MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:340:8: ( 'month' | 'months' )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0=='m') ) {
				int LA78_1 = input.LA(2);
				if ( (LA78_1=='o') ) {
					int LA78_2 = input.LA(3);
					if ( (LA78_2=='n') ) {
						int LA78_3 = input.LA(4);
						if ( (LA78_3=='t') ) {
							int LA78_4 = input.LA(5);
							if ( (LA78_4=='h') ) {
								int LA78_5 = input.LA(6);
								if ( (LA78_5=='s') ) {
									alt78=2;
								}

								else {
									alt78=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 78, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 78, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 78, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// HiveLexer.g:340:10: 'month'
					{
					match("month"); 

					}
					break;
				case 2 :
					// HiveLexer.g:340:21: 'months'
					{
					match("months"); 

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
	// $ANTLR end "MONTH"

	// $ANTLR start "YEAR"
	public final void mYEAR() throws RecognitionException {
		try {
			int _type = YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:341:8: ( 'year' | 'years' | 'yrs' ( DOT )? )
			int alt80=3;
			int LA80_0 = input.LA(1);
			if ( (LA80_0=='y') ) {
				int LA80_1 = input.LA(2);
				if ( (LA80_1=='e') ) {
					int LA80_2 = input.LA(3);
					if ( (LA80_2=='a') ) {
						int LA80_4 = input.LA(4);
						if ( (LA80_4=='r') ) {
							int LA80_5 = input.LA(5);
							if ( (LA80_5=='s') ) {
								alt80=2;
							}

							else {
								alt80=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 80, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 80, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA80_1=='r') ) {
					alt80=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// HiveLexer.g:341:10: 'year'
					{
					match("year"); 

					}
					break;
				case 2 :
					// HiveLexer.g:341:21: 'years'
					{
					match("years"); 

					}
					break;
				case 3 :
					// HiveLexer.g:341:31: 'yrs' ( DOT )?
					{
					match("yrs"); 

					// HiveLexer.g:341:37: ( DOT )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0=='.') ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='.' ) {
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
	// $ANTLR end "YEAR"

	// $ANTLR start "TODAY"
	public final void mTODAY() throws RecognitionException {
		try {
			int _type = TODAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:343:11: ( 'today' )
			// HiveLexer.g:343:13: 'today'
			{
			match("today"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TODAY"

	// $ANTLR start "TOMORROW"
	public final void mTOMORROW() throws RecognitionException {
		try {
			int _type = TOMORROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:344:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' )
			int alt81=4;
			int LA81_0 = input.LA(1);
			if ( (LA81_0=='t') ) {
				int LA81_1 = input.LA(2);
				if ( (LA81_1=='o') ) {
					int LA81_2 = input.LA(3);
					if ( (LA81_2=='m') ) {
						int LA81_3 = input.LA(4);
						if ( (LA81_3=='o') ) {
							int LA81_4 = input.LA(5);
							if ( (LA81_4=='r') ) {
								int LA81_6 = input.LA(6);
								if ( (LA81_6=='o') ) {
									alt81=1;
								}
								else if ( (LA81_6=='r') ) {
									alt81=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 81, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 81, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA81_3=='m') ) {
							int LA81_5 = input.LA(5);
							if ( (LA81_5=='o') ) {
								int LA81_7 = input.LA(6);
								if ( (LA81_7=='r') ) {
									int LA81_10 = input.LA(7);
									if ( (LA81_10=='o') ) {
										alt81=3;
									}
									else if ( (LA81_10=='r') ) {
										alt81=4;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 81, 10, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 81, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 81, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 81, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 81, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// HiveLexer.g:344:13: 'tomorow'
					{
					match("tomorow"); 

					}
					break;
				case 2 :
					// HiveLexer.g:344:27: 'tomorrow'
					{
					match("tomorrow"); 

					}
					break;
				case 3 :
					// HiveLexer.g:344:42: 'tommorow'
					{
					match("tommorow"); 

					}
					break;
				case 4 :
					// HiveLexer.g:344:55: 'tommorrow'
					{
					match("tommorrow"); 

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
	// $ANTLR end "TOMORROW"

	// $ANTLR start "TONIGHT"
	public final void mTONIGHT() throws RecognitionException {
		try {
			int _type = TONIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:345:11: ( 'tonight' )
			// HiveLexer.g:345:13: 'tonight'
			{
			match("tonight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TONIGHT"

	// $ANTLR start "YESTERDAY"
	public final void mYESTERDAY() throws RecognitionException {
		try {
			int _type = YESTERDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:346:11: ( 'yesterday' )
			// HiveLexer.g:346:13: 'yesterday'
			{
			match("yesterday"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YESTERDAY"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// HiveLexer.g:351:5: ( 'a' .. 'z' | 'A' .. 'Z' )
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
			// HiveLexer.g:356:5: ( 'a' .. 'f' | 'A' .. 'F' )
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
			// HiveLexer.g:361:5: ( '0' .. '9' )
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
			// HiveLexer.g:367:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// HiveLexer.g:368:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// HiveLexer.g:368:17: ( PLUS | MINUS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0=='+'||LA82_0=='-') ) {
				alt82=1;
			}
			switch (alt82) {
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

			// HiveLexer.g:368:33: ( Digit )+
			int cnt83=0;
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( ((LA83_0 >= '0' && LA83_0 <= '9')) ) {
					alt83=1;
				}

				switch (alt83) {
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
					if ( cnt83 >= 1 ) break loop83;
					EarlyExitException eee = new EarlyExitException(83, input);
					throw eee;
				}
				cnt83++;
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
			// HiveLexer.g:373:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR )
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
			// HiveLexer.g:380:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// HiveLexer.g:381:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// HiveLexer.g:381:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt86=0;
			loop86:
			while (true) {
				int alt86=3;
				int LA86_0 = input.LA(1);
				if ( (LA86_0=='\'') ) {
					alt86=1;
				}
				else if ( (LA86_0=='\"') ) {
					alt86=2;
				}

				switch (alt86) {
				case 1 :
					// HiveLexer.g:381:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// HiveLexer.g:381:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop84:
					while (true) {
						int alt84=3;
						int LA84_0 = input.LA(1);
						if ( ((LA84_0 >= '\u0000' && LA84_0 <= '&')||(LA84_0 >= '(' && LA84_0 <= '[')||(LA84_0 >= ']' && LA84_0 <= '\uFFFF')) ) {
							alt84=1;
						}
						else if ( (LA84_0=='\\') ) {
							alt84=2;
						}

						switch (alt84) {
						case 1 :
							// HiveLexer.g:381:14: ~ ( '\\'' | '\\\\' )
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
							// HiveLexer.g:381:29: ( '\\\\' . )
							{
							// HiveLexer.g:381:29: ( '\\\\' . )
							// HiveLexer.g:381:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop84;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// HiveLexer.g:382:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// HiveLexer.g:382:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop85:
					while (true) {
						int alt85=3;
						int LA85_0 = input.LA(1);
						if ( ((LA85_0 >= '\u0000' && LA85_0 <= '!')||(LA85_0 >= '#' && LA85_0 <= '[')||(LA85_0 >= ']' && LA85_0 <= '\uFFFF')) ) {
							alt85=1;
						}
						else if ( (LA85_0=='\\') ) {
							alt85=2;
						}

						switch (alt85) {
						case 1 :
							// HiveLexer.g:382:14: ~ ( '\\\"' | '\\\\' )
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
							// HiveLexer.g:382:29: ( '\\\\' . )
							{
							// HiveLexer.g:382:29: ( '\\\\' . )
							// HiveLexer.g:382:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop85;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt86 >= 1 ) break loop86;
					EarlyExitException eee = new EarlyExitException(86, input);
					throw eee;
				}
				cnt86++;
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
			// HiveLexer.g:387:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0=='\"'||LA88_0=='\'') ) {
				alt88=1;
			}
			else if ( (LA88_0=='0') ) {
				alt88=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// HiveLexer.g:388:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// HiveLexer.g:389:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// HiveLexer.g:389:15: ( HexDigit | Digit )+
					int cnt87=0;
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( ((LA87_0 >= '0' && LA87_0 <= '9')||(LA87_0 >= 'A' && LA87_0 <= 'F')||(LA87_0 >= 'a' && LA87_0 <= 'f')) ) {
							alt87=1;
						}

						switch (alt87) {
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
							if ( cnt87 >= 1 ) break loop87;
							EarlyExitException eee = new EarlyExitException(87, input);
							throw eee;
						}
						cnt87++;
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
			// HiveLexer.g:393:5: ( ( Digit )+ 'L' )
			// HiveLexer.g:394:5: ( Digit )+ 'L'
			{
			// HiveLexer.g:394:5: ( Digit )+
			int cnt89=0;
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( ((LA89_0 >= '0' && LA89_0 <= '9')) ) {
					alt89=1;
				}

				switch (alt89) {
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
					if ( cnt89 >= 1 ) break loop89;
					EarlyExitException eee = new EarlyExitException(89, input);
					throw eee;
				}
				cnt89++;
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
			// HiveLexer.g:398:5: ( ( Digit )+ 'S' )
			// HiveLexer.g:399:5: ( Digit )+ 'S'
			{
			// HiveLexer.g:399:5: ( Digit )+
			int cnt90=0;
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( ((LA90_0 >= '0' && LA90_0 <= '9')) ) {
					alt90=1;
				}

				switch (alt90) {
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
					if ( cnt90 >= 1 ) break loop90;
					EarlyExitException eee = new EarlyExitException(90, input);
					throw eee;
				}
				cnt90++;
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
			// HiveLexer.g:403:5: ( ( Digit )+ 'Y' )
			// HiveLexer.g:404:5: ( Digit )+ 'Y'
			{
			// HiveLexer.g:404:5: ( Digit )+
			int cnt91=0;
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( ((LA91_0 >= '0' && LA91_0 <= '9')) ) {
					alt91=1;
				}

				switch (alt91) {
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
					if ( cnt91 >= 1 ) break loop91;
					EarlyExitException eee = new EarlyExitException(91, input);
					throw eee;
				}
				cnt91++;
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
			// HiveLexer.g:408:5: ( Number 'B' 'D' )
			// HiveLexer.g:409:5: Number 'B' 'D'
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
			// HiveLexer.g:413:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// HiveLexer.g:414:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// HiveLexer.g:414:5: ( Digit )+
			int cnt92=0;
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( ((LA92_0 >= '0' && LA92_0 <= '9')) ) {
					alt92=1;
				}

				switch (alt92) {
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
					if ( cnt92 >= 1 ) break loop92;
					EarlyExitException eee = new EarlyExitException(92, input);
					throw eee;
				}
				cnt92++;
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
			// HiveLexer.g:418:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// HiveLexer.g:419:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// HiveLexer.g:419:5: ( Digit )+
			int cnt93=0;
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( ((LA93_0 >= '0' && LA93_0 <= '9')) ) {
					alt93=1;
				}

				switch (alt93) {
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
					if ( cnt93 >= 1 ) break loop93;
					EarlyExitException eee = new EarlyExitException(93, input);
					throw eee;
				}
				cnt93++;
			}

			// HiveLexer.g:419:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt96=3;
			int LA96_0 = input.LA(1);
			if ( (LA96_0=='.') ) {
				alt96=1;
			}
			else if ( (LA96_0=='E'||LA96_0=='e') ) {
				alt96=2;
			}
			switch (alt96) {
				case 1 :
					// HiveLexer.g:419:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// HiveLexer.g:419:20: ( Digit )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( ((LA94_0 >= '0' && LA94_0 <= '9')) ) {
							alt94=1;
						}

						switch (alt94) {
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
							break loop94;
						}
					}

					// HiveLexer.g:419:29: ( Exponent )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0=='E'||LA95_0=='e') ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// HiveLexer.g:419:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:419:43: Exponent
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

	// $ANTLR start "TimeUnit"
	public final void mTimeUnit() throws RecognitionException {
		try {
			int _type = TimeUnit;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:423:5: ( ( Digit )+ ( DOT ( Digit )* )? '(' ( 'd' | 'h' | 'm' | 's' | 'D' | 'H' | 'M' | 'S' ) ')' )
			// HiveLexer.g:424:5: ( Digit )+ ( DOT ( Digit )* )? '(' ( 'd' | 'h' | 'm' | 's' | 'D' | 'H' | 'M' | 'S' ) ')'
			{
			// HiveLexer.g:424:5: ( Digit )+
			int cnt97=0;
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( ((LA97_0 >= '0' && LA97_0 <= '9')) ) {
					alt97=1;
				}

				switch (alt97) {
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
					if ( cnt97 >= 1 ) break loop97;
					EarlyExitException eee = new EarlyExitException(97, input);
					throw eee;
				}
				cnt97++;
			}

			// HiveLexer.g:424:14: ( DOT ( Digit )* )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0=='.') ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// HiveLexer.g:424:15: DOT ( Digit )*
					{
					mDOT(); 

					// HiveLexer.g:424:19: ( Digit )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( ((LA98_0 >= '0' && LA98_0 <= '9')) ) {
							alt98=1;
						}

						switch (alt98) {
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
							break loop98;
						}
					}

					}
					break;

			}

			match('('); 
			if ( input.LA(1)=='D'||input.LA(1)=='H'||input.LA(1)=='M'||input.LA(1)=='S'||input.LA(1)=='d'||input.LA(1)=='h'||input.LA(1)=='m'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TimeUnit"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:428:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* | '`' ( RegexComponent )+ '`' )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( ((LA102_0 >= '0' && LA102_0 <= '9')||(LA102_0 >= 'A' && LA102_0 <= 'Z')||(LA102_0 >= 'a' && LA102_0 <= 'z')) ) {
				alt102=1;
			}
			else if ( (LA102_0=='`') ) {
				alt102=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// HiveLexer.g:429:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// HiveLexer.g:429:22: ( Letter | Digit | '_' )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( ((LA100_0 >= '0' && LA100_0 <= '9')||(LA100_0 >= 'A' && LA100_0 <= 'Z')||LA100_0=='_'||(LA100_0 >= 'a' && LA100_0 <= 'z')) ) {
							alt100=1;
						}

						switch (alt100) {
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
							break loop100;
						}
					}

					}
					break;
				case 2 :
					// HiveLexer.g:430:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// HiveLexer.g:430:11: ( RegexComponent )+
					int cnt101=0;
					loop101:
					while (true) {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0=='$'||(LA101_0 >= '(' && LA101_0 <= '+')||(LA101_0 >= '-' && LA101_0 <= '.')||(LA101_0 >= '0' && LA101_0 <= '9')||LA101_0=='?'||(LA101_0 >= 'A' && LA101_0 <= '[')||(LA101_0 >= ']' && LA101_0 <= '_')||(LA101_0 >= 'a' && LA101_0 <= '}')) ) {
							alt101=1;
						}

						switch (alt101) {
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
							if ( cnt101 >= 1 ) break loop101;
							EarlyExitException eee = new EarlyExitException(101, input);
							throw eee;
						}
						cnt101++;
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
			// HiveLexer.g:434:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// HiveLexer.g:435:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// HiveLexer.g:435:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt103=0;
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( ((LA103_0 >= '-' && LA103_0 <= '.')||(LA103_0 >= '0' && LA103_0 <= ':')||(LA103_0 >= 'A' && LA103_0 <= 'Z')||LA103_0=='_'||(LA103_0 >= 'a' && LA103_0 <= 'z')) ) {
					alt103=1;
				}

				switch (alt103) {
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
					if ( cnt103 >= 1 ) break loop103;
					EarlyExitException eee = new EarlyExitException(103, input);
					throw eee;
				}
				cnt103++;
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
			// HiveLexer.g:438:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// HiveLexer.g:438:8: ( ' ' | '\\r' | '\\t' | '\\n' )
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
			// HiveLexer.g:442:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// HiveLexer.g:442:5: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// HiveLexer.g:442:10: (~ ( '\\n' | '\\r' ) )*
			loop104:
			while (true) {
				int alt104=2;
				int LA104_0 = input.LA(1);
				if ( ((LA104_0 >= '\u0000' && LA104_0 <= '\t')||(LA104_0 >= '\u000B' && LA104_0 <= '\f')||(LA104_0 >= '\u000E' && LA104_0 <= '\uFFFF')) ) {
					alt104=1;
				}

				switch (alt104) {
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
					break loop104;
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
		// HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_DAY | KW_HOUR | KW_MINUTE | KW_SECOND | KW_CONSTANT | KW_INTERVAL | KW_INCRE | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | TimeUnit | Identifier | CharSetName | WS | COMMENT )
		int alt105=318;
		alt105 = dfa105.predict(input);
		switch (alt105) {
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
				// HiveLexer.g:1:78: KW_DAY
				{
				mKW_DAY(); 

				}
				break;
			case 11 :
				// HiveLexer.g:1:85: KW_HOUR
				{
				mKW_HOUR(); 

				}
				break;
			case 12 :
				// HiveLexer.g:1:93: KW_MINUTE
				{
				mKW_MINUTE(); 

				}
				break;
			case 13 :
				// HiveLexer.g:1:103: KW_SECOND
				{
				mKW_SECOND(); 

				}
				break;
			case 14 :
				// HiveLexer.g:1:113: KW_CONSTANT
				{
				mKW_CONSTANT(); 

				}
				break;
			case 15 :
				// HiveLexer.g:1:125: KW_INTERVAL
				{
				mKW_INTERVAL(); 

				}
				break;
			case 16 :
				// HiveLexer.g:1:137: KW_INCRE
				{
				mKW_INCRE(); 

				}
				break;
			case 17 :
				// HiveLexer.g:1:146: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 18 :
				// HiveLexer.g:1:153: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 19 :
				// HiveLexer.g:1:161: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 20 :
				// HiveLexer.g:1:170: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 21 :
				// HiveLexer.g:1:179: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 22 :
				// HiveLexer.g:1:185: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 23 :
				// HiveLexer.g:1:195: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 24 :
				// HiveLexer.g:1:204: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 25 :
				// HiveLexer.g:1:212: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 26 :
				// HiveLexer.g:1:218: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 27 :
				// HiveLexer.g:1:228: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 28 :
				// HiveLexer.g:1:240: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 29 :
				// HiveLexer.g:1:250: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 30 :
				// HiveLexer.g:1:263: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 31 :
				// HiveLexer.g:1:272: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 32 :
				// HiveLexer.g:1:286: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 33 :
				// HiveLexer.g:1:298: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 34 :
				// HiveLexer.g:1:306: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 35 :
				// HiveLexer.g:1:314: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 36 :
				// HiveLexer.g:1:323: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 37 :
				// HiveLexer.g:1:331: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 38 :
				// HiveLexer.g:1:337: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 39 :
				// HiveLexer.g:1:350: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 40 :
				// HiveLexer.g:1:364: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 41 :
				// HiveLexer.g:1:373: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 42 :
				// HiveLexer.g:1:383: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 43 :
				// HiveLexer.g:1:394: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 44 :
				// HiveLexer.g:1:403: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 45 :
				// HiveLexer.g:1:414: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 46 :
				// HiveLexer.g:1:425: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 47 :
				// HiveLexer.g:1:438: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 48 :
				// HiveLexer.g:1:446: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 49 :
				// HiveLexer.g:1:454: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 50 :
				// HiveLexer.g:1:464: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 51 :
				// HiveLexer.g:1:477: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 52 :
				// HiveLexer.g:1:486: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 53 :
				// HiveLexer.g:1:499: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 54 :
				// HiveLexer.g:1:508: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 55 :
				// HiveLexer.g:1:519: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 56 :
				// HiveLexer.g:1:533: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 57 :
				// HiveLexer.g:1:541: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 58 :
				// HiveLexer.g:1:550: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 59 :
				// HiveLexer.g:1:558: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 60 :
				// HiveLexer.g:1:568: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 61 :
				// HiveLexer.g:1:578: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 62 :
				// HiveLexer.g:1:586: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 63 :
				// HiveLexer.g:1:596: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 64 :
				// HiveLexer.g:1:602: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 65 :
				// HiveLexer.g:1:610: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 66 :
				// HiveLexer.g:1:620: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 67 :
				// HiveLexer.g:1:632: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 68 :
				// HiveLexer.g:1:641: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 69 :
				// HiveLexer.g:1:651: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 70 :
				// HiveLexer.g:1:661: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 71 :
				// HiveLexer.g:1:670: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 72 :
				// HiveLexer.g:1:679: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 73 :
				// HiveLexer.g:1:691: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 74 :
				// HiveLexer.g:1:699: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 75 :
				// HiveLexer.g:1:709: KW_IGNORE
				{
				mKW_IGNORE(); 

				}
				break;
			case 76 :
				// HiveLexer.g:1:719: KW_PROTECTION
				{
				mKW_PROTECTION(); 

				}
				break;
			case 77 :
				// HiveLexer.g:1:733: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 78 :
				// HiveLexer.g:1:739: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 79 :
				// HiveLexer.g:1:750: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 80 :
				// HiveLexer.g:1:761: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 81 :
				// HiveLexer.g:1:772: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 82 :
				// HiveLexer.g:1:784: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 83 :
				// HiveLexer.g:1:791: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 84 :
				// HiveLexer.g:1:801: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 85 :
				// HiveLexer.g:1:810: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 86 :
				// HiveLexer.g:1:820: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 87 :
				// HiveLexer.g:1:828: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 88 :
				// HiveLexer.g:1:840: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 89 :
				// HiveLexer.g:1:853: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 90 :
				// HiveLexer.g:1:864: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 91 :
				// HiveLexer.g:1:874: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 92 :
				// HiveLexer.g:1:885: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 93 :
				// HiveLexer.g:1:894: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 94 :
				// HiveLexer.g:1:904: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 95 :
				// HiveLexer.g:1:911: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 96 :
				// HiveLexer.g:1:924: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 97 :
				// HiveLexer.g:1:934: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 98 :
				// HiveLexer.g:1:949: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 99 :
				// HiveLexer.g:1:962: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 100 :
				// HiveLexer.g:1:972: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 101 :
				// HiveLexer.g:1:980: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 102 :
				// HiveLexer.g:1:991: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 103 :
				// HiveLexer.g:1:998: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 104 :
				// HiveLexer.g:1:1006: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 105 :
				// HiveLexer.g:1:1016: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 106 :
				// HiveLexer.g:1:1029: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 107 :
				// HiveLexer.g:1:1039: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 108 :
				// HiveLexer.g:1:1053: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 109 :
				// HiveLexer.g:1:1064: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 110 :
				// HiveLexer.g:1:1078: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 111 :
				// HiveLexer.g:1:1087: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 112 :
				// HiveLexer.g:1:1095: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 113 :
				// HiveLexer.g:1:1107: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 114 :
				// HiveLexer.g:1:1116: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 115 :
				// HiveLexer.g:1:1126: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 116 :
				// HiveLexer.g:1:1140: KW_SEQUENCEFILE
				{
				mKW_SEQUENCEFILE(); 

				}
				break;
			case 117 :
				// HiveLexer.g:1:1156: KW_TEXTFILE
				{
				mKW_TEXTFILE(); 

				}
				break;
			case 118 :
				// HiveLexer.g:1:1168: KW_RCFILE
				{
				mKW_RCFILE(); 

				}
				break;
			case 119 :
				// HiveLexer.g:1:1178: KW_ORCFILE
				{
				mKW_ORCFILE(); 

				}
				break;
			case 120 :
				// HiveLexer.g:1:1189: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 121 :
				// HiveLexer.g:1:1204: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 122 :
				// HiveLexer.g:1:1220: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 123 :
				// HiveLexer.g:1:1235: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 124 :
				// HiveLexer.g:1:1251: KW_OFFLINE
				{
				mKW_OFFLINE(); 

				}
				break;
			case 125 :
				// HiveLexer.g:1:1262: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 126 :
				// HiveLexer.g:1:1272: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 127 :
				// HiveLexer.g:1:1283: KW_READONLY
				{
				mKW_READONLY(); 

				}
				break;
			case 128 :
				// HiveLexer.g:1:1295: KW_NO_DROP
				{
				mKW_NO_DROP(); 

				}
				break;
			case 129 :
				// HiveLexer.g:1:1306: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 130 :
				// HiveLexer.g:1:1318: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 131 :
				// HiveLexer.g:1:1333: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 132 :
				// HiveLexer.g:1:1343: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 133 :
				// HiveLexer.g:1:1350: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 134 :
				// HiveLexer.g:1:1356: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 135 :
				// HiveLexer.g:1:1367: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 136 :
				// HiveLexer.g:1:1375: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 137 :
				// HiveLexer.g:1:1382: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 138 :
				// HiveLexer.g:1:1393: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 139 :
				// HiveLexer.g:1:1402: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 140 :
				// HiveLexer.g:1:1412: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 141 :
				// HiveLexer.g:1:1425: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 142 :
				// HiveLexer.g:1:1437: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 143 :
				// HiveLexer.g:1:1446: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 144 :
				// HiveLexer.g:1:1457: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 145 :
				// HiveLexer.g:1:1469: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 146 :
				// HiveLexer.g:1:1482: KW_PRETTY
				{
				mKW_PRETTY(); 

				}
				break;
			case 147 :
				// HiveLexer.g:1:1492: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 148 :
				// HiveLexer.g:1:1506: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 149 :
				// HiveLexer.g:1:1517: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 150 :
				// HiveLexer.g:1:1526: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 151 :
				// HiveLexer.g:1:1534: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 152 :
				// HiveLexer.g:1:1546: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 153 :
				// HiveLexer.g:1:1565: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 154 :
				// HiveLexer.g:1:1581: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 155 :
				// HiveLexer.g:1:1590: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 156 :
				// HiveLexer.g:1:1597: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 157 :
				// HiveLexer.g:1:1606: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 158 :
				// HiveLexer.g:1:1623: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 159 :
				// HiveLexer.g:1:1640: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 160 :
				// HiveLexer.g:1:1654: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 161 :
				// HiveLexer.g:1:1667: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 162 :
				// HiveLexer.g:1:1675: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 163 :
				// HiveLexer.g:1:1683: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 164 :
				// HiveLexer.g:1:1691: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 165 :
				// HiveLexer.g:1:1699: KW_END
				{
				mKW_END(); 

				}
				break;
			case 166 :
				// HiveLexer.g:1:1706: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 167 :
				// HiveLexer.g:1:1717: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 168 :
				// HiveLexer.g:1:1732: KW_HOLD_DDLTIME
				{
				mKW_HOLD_DDLTIME(); 

				}
				break;
			case 169 :
				// HiveLexer.g:1:1748: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 170 :
				// HiveLexer.g:1:1765: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 171 :
				// HiveLexer.g:1:1772: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 172 :
				// HiveLexer.g:1:1788: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 173 :
				// HiveLexer.g:1:1796: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 174 :
				// HiveLexer.g:1:1806: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 175 :
				// HiveLexer.g:1:1814: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 176 :
				// HiveLexer.g:1:1823: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 177 :
				// HiveLexer.g:1:1832: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 178 :
				// HiveLexer.g:1:1845: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 179 :
				// HiveLexer.g:1:1853: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 180 :
				// HiveLexer.g:1:1859: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 181 :
				// HiveLexer.g:1:1871: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 182 :
				// HiveLexer.g:1:1884: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 183 :
				// HiveLexer.g:1:1900: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 184 :
				// HiveLexer.g:1:1910: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 185 :
				// HiveLexer.g:1:1921: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 186 :
				// HiveLexer.g:1:1930: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 187 :
				// HiveLexer.g:1:1940: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 188 :
				// HiveLexer.g:1:1947: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 189 :
				// HiveLexer.g:1:1955: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 190 :
				// HiveLexer.g:1:1963: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 191 :
				// HiveLexer.g:1:1972: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 192 :
				// HiveLexer.g:1:1982: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 193 :
				// HiveLexer.g:1:1992: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 194 :
				// HiveLexer.g:1:2005: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 195 :
				// HiveLexer.g:1:2018: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 196 :
				// HiveLexer.g:1:2030: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 197 :
				// HiveLexer.g:1:2039: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 198 :
				// HiveLexer.g:1:2047: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 199 :
				// HiveLexer.g:1:2056: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 200 :
				// HiveLexer.g:1:2065: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 201 :
				// HiveLexer.g:1:2074: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 202 :
				// HiveLexer.g:1:2085: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 203 :
				// HiveLexer.g:1:2095: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 204 :
				// HiveLexer.g:1:2106: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 205 :
				// HiveLexer.g:1:2114: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 206 :
				// HiveLexer.g:1:2124: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 207 :
				// HiveLexer.g:1:2133: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 208 :
				// HiveLexer.g:1:2145: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 209 :
				// HiveLexer.g:1:2155: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 210 :
				// HiveLexer.g:1:2166: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 211 :
				// HiveLexer.g:1:2182: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 212 :
				// HiveLexer.g:1:2198: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 213 :
				// HiveLexer.g:1:2206: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 214 :
				// HiveLexer.g:1:2217: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 215 :
				// HiveLexer.g:1:2226: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 216 :
				// HiveLexer.g:1:2237: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 217 :
				// HiveLexer.g:1:2250: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 218 :
				// HiveLexer.g:1:2261: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 219 :
				// HiveLexer.g:1:2275: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 220 :
				// HiveLexer.g:1:2282: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 221 :
				// HiveLexer.g:1:2292: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 222 :
				// HiveLexer.g:1:2307: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 223 :
				// HiveLexer.g:1:2324: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 224 :
				// HiveLexer.g:1:2334: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 225 :
				// HiveLexer.g:1:2346: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 226 :
				// HiveLexer.g:1:2357: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 227 :
				// HiveLexer.g:1:2367: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 228 :
				// HiveLexer.g:1:2377: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 229 :
				// HiveLexer.g:1:2385: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 230 :
				// HiveLexer.g:1:2400: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 231 :
				// HiveLexer.g:1:2407: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 232 :
				// HiveLexer.g:1:2417: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 233 :
				// HiveLexer.g:1:2430: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 234 :
				// HiveLexer.g:1:2443: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 235 :
				// HiveLexer.g:1:2456: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 236 :
				// HiveLexer.g:1:2467: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 237 :
				// HiveLexer.g:1:2475: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 238 :
				// HiveLexer.g:1:2483: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 239 :
				// HiveLexer.g:1:2491: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 240 :
				// HiveLexer.g:1:2503: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 241 :
				// HiveLexer.g:1:2511: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 242 :
				// HiveLexer.g:1:2523: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 243 :
				// HiveLexer.g:1:2533: KW_PARTIALSCAN
				{
				mKW_PARTIALSCAN(); 

				}
				break;
			case 244 :
				// HiveLexer.g:1:2548: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 245 :
				// HiveLexer.g:1:2556: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 246 :
				// HiveLexer.g:1:2564: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 247 :
				// HiveLexer.g:1:2573: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 248 :
				// HiveLexer.g:1:2585: DOT
				{
				mDOT(); 

				}
				break;
			case 249 :
				// HiveLexer.g:1:2589: COLON
				{
				mCOLON(); 

				}
				break;
			case 250 :
				// HiveLexer.g:1:2595: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 251 :
				// HiveLexer.g:1:2601: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 252 :
				// HiveLexer.g:1:2611: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 253 :
				// HiveLexer.g:1:2618: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 254 :
				// HiveLexer.g:1:2625: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 255 :
				// HiveLexer.g:1:2633: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 256 :
				// HiveLexer.g:1:2641: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 257 :
				// HiveLexer.g:1:2648: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 258 :
				// HiveLexer.g:1:2655: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 259 :
				// HiveLexer.g:1:2661: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 260 :
				// HiveLexer.g:1:2670: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 261 :
				// HiveLexer.g:1:2679: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 262 :
				// HiveLexer.g:1:2697: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 263 :
				// HiveLexer.g:1:2706: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 264 :
				// HiveLexer.g:1:2727: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 265 :
				// HiveLexer.g:1:2739: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 266 :
				// HiveLexer.g:1:2746: PLUS
				{
				mPLUS(); 

				}
				break;
			case 267 :
				// HiveLexer.g:1:2751: MINUS
				{
				mMINUS(); 

				}
				break;
			case 268 :
				// HiveLexer.g:1:2757: STAR
				{
				mSTAR(); 

				}
				break;
			case 269 :
				// HiveLexer.g:1:2762: MOD
				{
				mMOD(); 

				}
				break;
			case 270 :
				// HiveLexer.g:1:2766: DIV
				{
				mDIV(); 

				}
				break;
			case 271 :
				// HiveLexer.g:1:2770: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 272 :
				// HiveLexer.g:1:2780: TILDE
				{
				mTILDE(); 

				}
				break;
			case 273 :
				// HiveLexer.g:1:2786: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 274 :
				// HiveLexer.g:1:2796: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 275 :
				// HiveLexer.g:1:2807: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 276 :
				// HiveLexer.g:1:2816: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 277 :
				// HiveLexer.g:1:2823: JANUARY
				{
				mJANUARY(); 

				}
				break;
			case 278 :
				// HiveLexer.g:1:2831: FEBRUARY
				{
				mFEBRUARY(); 

				}
				break;
			case 279 :
				// HiveLexer.g:1:2840: MARCH
				{
				mMARCH(); 

				}
				break;
			case 280 :
				// HiveLexer.g:1:2846: APRIL
				{
				mAPRIL(); 

				}
				break;
			case 281 :
				// HiveLexer.g:1:2852: MAY
				{
				mMAY(); 

				}
				break;
			case 282 :
				// HiveLexer.g:1:2856: JUNE
				{
				mJUNE(); 

				}
				break;
			case 283 :
				// HiveLexer.g:1:2861: JULY
				{
				mJULY(); 

				}
				break;
			case 284 :
				// HiveLexer.g:1:2866: AUGUST
				{
				mAUGUST(); 

				}
				break;
			case 285 :
				// HiveLexer.g:1:2873: SEPTEMBER
				{
				mSEPTEMBER(); 

				}
				break;
			case 286 :
				// HiveLexer.g:1:2883: OCTOBER
				{
				mOCTOBER(); 

				}
				break;
			case 287 :
				// HiveLexer.g:1:2891: NOVEMBER
				{
				mNOVEMBER(); 

				}
				break;
			case 288 :
				// HiveLexer.g:1:2900: DECEMBER
				{
				mDECEMBER(); 

				}
				break;
			case 289 :
				// HiveLexer.g:1:2909: SUNDAY
				{
				mSUNDAY(); 

				}
				break;
			case 290 :
				// HiveLexer.g:1:2916: MONDAY
				{
				mMONDAY(); 

				}
				break;
			case 291 :
				// HiveLexer.g:1:2923: TUESDAY
				{
				mTUESDAY(); 

				}
				break;
			case 292 :
				// HiveLexer.g:1:2931: WEDNESDAY
				{
				mWEDNESDAY(); 

				}
				break;
			case 293 :
				// HiveLexer.g:1:2941: THURSDAY
				{
				mTHURSDAY(); 

				}
				break;
			case 294 :
				// HiveLexer.g:1:2950: FRIDAY
				{
				mFRIDAY(); 

				}
				break;
			case 295 :
				// HiveLexer.g:1:2957: SATURDAY
				{
				mSATURDAY(); 

				}
				break;
			case 296 :
				// HiveLexer.g:1:2966: HOUR
				{
				mHOUR(); 

				}
				break;
			case 297 :
				// HiveLexer.g:1:2971: MINUTE
				{
				mMINUTE(); 

				}
				break;
			case 298 :
				// HiveLexer.g:1:2978: DAY
				{
				mDAY(); 

				}
				break;
			case 299 :
				// HiveLexer.g:1:2982: WEEK
				{
				mWEEK(); 

				}
				break;
			case 300 :
				// HiveLexer.g:1:2987: MONTH
				{
				mMONTH(); 

				}
				break;
			case 301 :
				// HiveLexer.g:1:2993: YEAR
				{
				mYEAR(); 

				}
				break;
			case 302 :
				// HiveLexer.g:1:2998: TODAY
				{
				mTODAY(); 

				}
				break;
			case 303 :
				// HiveLexer.g:1:3004: TOMORROW
				{
				mTOMORROW(); 

				}
				break;
			case 304 :
				// HiveLexer.g:1:3013: TONIGHT
				{
				mTONIGHT(); 

				}
				break;
			case 305 :
				// HiveLexer.g:1:3021: YESTERDAY
				{
				mYESTERDAY(); 

				}
				break;
			case 306 :
				// HiveLexer.g:1:3031: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 307 :
				// HiveLexer.g:1:3045: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 308 :
				// HiveLexer.g:1:3060: BigintLiteral
				{
				mBigintLiteral(); 

				}
				break;
			case 309 :
				// HiveLexer.g:1:3074: SmallintLiteral
				{
				mSmallintLiteral(); 

				}
				break;
			case 310 :
				// HiveLexer.g:1:3090: TinyintLiteral
				{
				mTinyintLiteral(); 

				}
				break;
			case 311 :
				// HiveLexer.g:1:3105: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 312 :
				// HiveLexer.g:1:3120: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 313 :
				// HiveLexer.g:1:3138: Number
				{
				mNumber(); 

				}
				break;
			case 314 :
				// HiveLexer.g:1:3145: TimeUnit
				{
				mTimeUnit(); 

				}
				break;
			case 315 :
				// HiveLexer.g:1:3154: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 316 :
				// HiveLexer.g:1:3165: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 317 :
				// HiveLexer.g:1:3177: WS
				{
				mWS(); 

				}
				break;
			case 318 :
				// HiveLexer.g:1:3180: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA105 dfa105 = new DFA105(this);
	static final String DFA105_eotS =
		"\1\uffff\5\100\1\140\3\100\1\166\1\171\1\176\1\u0087\12\100\1\u00ac\13"+
		"\uffff\1\u00ae\1\u00b0\2\uffff\1\u00b2\7\uffff\14\100\2\uffff\2\u00d9"+
		"\3\uffff\2\100\1\u00e2\15\100\1\u00fa\3\100\1\u0101\2\100\1\u0104\1\u0106"+
		"\3\100\2\uffff\4\100\1\u0116\1\u011d\1\100\1\u011f\15\100\1\uffff\2\100"+
		"\1\uffff\4\100\1\uffff\10\100\1\uffff\7\100\1\u015a\31\100\4\uffff\1\u018a"+
		"\5\uffff\26\100\1\u01a7\2\100\2\uffff\1\u01ac\2\uffff\1\u01ac\1\100\1"+
		"\u01af\1\u00d9\1\u01b0\1\u01b1\1\u00d9\1\100\1\uffff\2\u01b8\1\uffff\5"+
		"\100\1\uffff\17\100\1\u01cf\2\100\1\u01d2\1\100\1\u01d4\1\100\1\u01d6"+
		"\1\uffff\3\100\1\u01da\1\100\1\u01dc\1\uffff\1\100\1\u01e0\1\uffff\1\100"+
		"\1\uffff\1\100\1\140\15\100\1\uffff\1\u01f3\5\100\1\uffff\1\100\1\uffff"+
		"\11\100\1\u0206\10\100\1\u0211\7\100\1\u021b\7\100\1\u0224\11\100\1\u0230"+
		"\15\100\1\uffff\22\100\1\u025b\1\u025d\22\100\1\u0275\7\100\2\uffff\1"+
		"\u027f\1\u0281\1\u0283\1\u0285\1\u0288\1\u028a\1\u028c\1\u0290\1\u0293"+
		"\1\u0295\1\u0297\1\u0299\1\u029c\1\u029f\1\u02a1\1\u02a3\1\u02a5\1\u02a7"+
		"\1\u02a9\1\u02ac\3\100\1\u02b3\1\100\1\u02b5\1\100\1\u01a7\1\uffff\2\100"+
		"\1\u02b9\3\uffff\1\u02ba\3\uffff\1\u00d9\3\uffff\1\u00d9\1\u01b4\1\uffff"+
		"\1\u02bf\13\100\1\u02cb\1\100\1\u02cd\1\u02ce\6\100\1\uffff\2\100\1\uffff"+
		"\1\100\1\uffff\1\100\1\uffff\3\100\1\uffff\1\100\1\uffff\1\u02de\2\100"+
		"\1\uffff\4\100\1\u02e5\1\u02e6\2\100\1\u02e9\1\u02ea\1\100\1\u02ee\1\u02ef"+
		"\1\100\1\u02f1\2\100\1\u02f4\1\uffff\22\100\1\uffff\1\u0308\1\u030a\10"+
		"\100\1\uffff\1\u0315\1\u0317\1\u0318\4\100\1\u031d\1\100\1\uffff\3\100"+
		"\1\u0322\3\100\1\u0326\1\uffff\1\u0327\1\u0329\1\100\1\u032c\7\100\1\uffff"+
		"\14\100\1\u0340\1\u0341\3\100\1\u0345\3\100\1\u0349\6\100\1\u0350\1\100"+
		"\1\u0352\5\100\1\u0358\4\100\1\u035d\1\uffff\1\100\1\uffff\10\100\1\u0367"+
		"\1\100\1\u0369\6\100\1\u0372\4\100\1\u0377\1\uffff\1\100\1\u0379\4\100"+
		"\1\u037e\1\u037f\1\100\1\uffff\1\u0281\1\uffff\1\u0283\1\uffff\1\100\1"+
		"\uffff\1\100\1\u0288\1\uffff\1\100\1\uffff\1\u028c\1\uffff\1\100\1\u0290"+
		"\1\100\1\uffff\1\100\1\u0293\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0299"+
		"\1\uffff\1\100\1\u029c\1\uffff\1\100\1\u029f\1\uffff\1\100\1\uffff\1\100"+
		"\1\uffff\1\100\1\uffff\1\u02a7\1\uffff\1\u02a9\1\uffff\2\u02ac\1\uffff"+
		"\5\100\1\u02b3\1\uffff\1\u02b5\1\uffff\1\u01a7\1\u02b9\1\100\3\uffff\2"+
		"\u00d9\1\100\1\uffff\3\100\1\u03a1\1\u03a2\6\100\1\uffff\1\u03a9\2\uffff"+
		"\1\100\1\u03ab\2\100\1\u03ae\2\100\1\u03b1\1\u03b2\1\100\1\u03b4\1\u03b5"+
		"\1\100\1\u03b7\1\100\1\uffff\1\u03b9\5\100\2\uffff\1\u03bf\1\u03c0\2\uffff"+
		"\1\u03c1\1\100\1\u03c3\2\uffff\1\100\1\uffff\2\100\1\uffff\2\100\1\u03cb"+
		"\2\100\1\u03cf\2\100\1\u03d2\12\100\1\uffff\1\100\1\uffff\12\100\1\uffff"+
		"\1\100\2\uffff\4\100\1\uffff\1\100\1\u03ee\1\100\1\u03f0\1\uffff\2\100"+
		"\1\u03f4\2\uffff\1\100\1\uffff\2\100\1\uffff\21\100\1\u0409\1\100\2\uffff"+
		"\3\100\1\uffff\1\u040f\1\u0410\1\100\1\uffff\5\100\1\u0417\1\uffff\1\u0418"+
		"\1\uffff\2\100\1\u041c\1\u041d\1\100\1\uffff\3\100\1\u0422\1\uffff\11"+
		"\100\1\uffff\1\u042d\1\uffff\1\u042e\6\100\1\u0435\1\uffff\4\100\1\uffff"+
		"\1\100\1\uffff\1\100\1\u043c\1\u043d\1\100\2\uffff\1\100\1\u0281\1\u0283"+
		"\2\100\1\u028a\1\100\1\u0445\1\100\1\u0295\10\100\1\u02ac\1\u0451\5\100"+
		"\1\u02b5\1\u01a7\1\u02b9\4\100\1\u045d\2\uffff\6\100\1\uffff\1\100\1\uffff"+
		"\1\u0465\1\100\1\uffff\1\u0468\1\100\2\uffff\1\100\2\uffff\1\100\1\uffff"+
		"\1\100\1\uffff\2\100\1\u0470\1\100\1\u0472\3\uffff\1\100\1\uffff\5\100"+
		"\1\u0479\1\100\1\uffff\1\u047b\2\100\1\uffff\1\u047e\1\u047f\1\uffff\1"+
		"\100\1\u0481\1\u0482\6\100\1\u0489\3\100\1\u048d\10\100\1\u0496\1\100"+
		"\1\u0498\2\100\1\uffff\1\100\1\uffff\1\u049c\2\100\1\uffff\1\100\1\u04a0"+
		"\1\u04a1\1\100\1\u04a3\1\u04a4\1\100\1\u04a6\1\100\1\u04a9\1\u04aa\3\100"+
		"\1\u04af\4\100\1\u04b4\1\uffff\1\u04b5\1\100\1\u04b7\2\100\2\uffff\1\100"+
		"\1\u04bb\1\u04bc\1\u04be\1\u04bf\1\100\2\uffff\1\u04c1\2\100\2\uffff\1"+
		"\100\1\u04c5\2\100\1\uffff\1\100\1\u04c9\1\100\1\u04cb\6\100\2\uffff\1"+
		"\100\1\u04d3\1\100\1\u04d5\1\u04d6\1\100\1\uffff\1\u04d8\1\u04d9\2\100"+
		"\1\u04dd\1\u04de\2\uffff\3\100\1\u0288\1\100\1\u0290\1\u0445\1\uffff\1"+
		"\u0293\1\u0295\1\u0297\1\100\1\u029c\6\100\1\uffff\11\100\1\u04f9\1\100"+
		"\1\uffff\1\u04fb\6\100\1\uffff\2\100\1\uffff\1\100\1\u0505\1\u0506\3\100"+
		"\1\u050a\1\uffff\1\u050b\1\uffff\1\100\1\u050d\1\u050e\3\100\1\uffff\1"+
		"\u0512\1\uffff\2\100\2\uffff\1\100\2\uffff\1\u0516\4\100\1\u051b\1\uffff"+
		"\1\100\1\u051d\1\100\1\uffff\4\100\1\u0523\3\100\1\uffff\1\100\1\uffff"+
		"\1\100\1\u0529\1\100\1\uffff\3\100\2\uffff\1\100\2\uffff\1\100\1\uffff"+
		"\1\100\1\u0531\2\uffff\3\100\1\u0535\1\uffff\1\100\1\u0537\1\u0538\1\u053b"+
		"\2\uffff\1\u053c\1\uffff\1\u053d\1\100\1\u053f\2\uffff\1\u0540\2\uffff"+
		"\1\u0541\1\uffff\3\100\1\uffff\3\100\1\uffff\1\100\1\uffff\5\100\1\u054e"+
		"\1\u054f\1\uffff\1\u0550\2\uffff\1\100\2\uffff\3\100\2\uffff\1\u0555\1"+
		"\u027f\1\100\1\u0288\1\u028a\1\u0290\1\u0293\1\u0297\1\100\1\u029c\1\100"+
		"\1\u02a1\2\100\1\u02a9\1\100\1\u055f\3\100\1\u0563\1\100\1\u029f\1\100"+
		"\1\u0566\1\100\1\uffff\1\100\1\uffff\2\100\1\u056b\2\100\1\u056f\3\100"+
		"\2\uffff\3\100\2\uffff\1\u0576\2\uffff\1\u0577\2\100\1\uffff\3\100\1\uffff"+
		"\1\u057d\1\u057e\1\100\1\u0580\1\uffff\1\u0581\1\uffff\2\100\1\u0584\1"+
		"\u0585\1\100\1\uffff\1\100\1\u058a\1\u058b\2\100\1\uffff\4\100\1\u0592"+
		"\2\100\1\uffff\1\u0595\1\u0596\1\100\1\uffff\1\100\2\uffff\2\100\3\uffff"+
		"\1\u059b\3\uffff\2\100\1\u059e\3\100\1\u05a2\5\100\3\uffff\1\u05a8\2\100"+
		"\1\u05ab\1\uffff\1\u027f\1\u0285\1\100\1\u029f\1\u02a1\1\u02a3\1\u02a5"+
		"\1\u02a9\1\u02ac\1\uffff\2\u055f\1\100\1\uffff\2\100\1\uffff\1\u05b5\1"+
		"\100\1\u05b7\1\100\1\uffff\1\u05b9\1\100\1\u05bb\1\uffff\1\100\1\u05bd"+
		"\1\u05be\1\u05bf\2\100\2\uffff\1\u05c2\4\100\2\uffff\1\u05c7\2\uffff\1"+
		"\u05c8\1\100\2\uffff\1\100\1\u05cb\1\100\1\u05cd\2\uffff\6\100\1\uffff"+
		"\2\100\2\uffff\2\100\1\u05d8\1\100\1\uffff\1\100\1\u05db\1\uffff\1\u05dc"+
		"\1\u05dd\1\100\1\uffff\1\u05df\1\100\1\u05e1\1\u05e4\1\100\1\uffff\2\100"+
		"\1\uffff\1\u0285\1\u0299\1\u029f\1\u02a3\1\u02a5\1\u02ac\1\u055f\1\u02b3"+
		"\1\u05ea\1\uffff\1\100\1\uffff\1\u05ec\1\uffff\1\100\1\uffff\1\u05ee\3"+
		"\uffff\2\100\1\uffff\4\100\2\uffff\1\u05f5\1\u05f6\1\uffff\1\100\1\uffff"+
		"\7\100\1\u05ff\1\100\1\u0601\1\uffff\1\100\1\u0603\3\uffff\1\100\1\uffff"+
		"\1\u0605\1\uffff\1\u0606\1\100\1\uffff\3\100\1\u0299\1\u02b3\1\uffff\1"+
		"\u060b\1\uffff\1\100\1\uffff\2\100\1\u060f\1\u0610\1\u0611\1\100\2\uffff"+
		"\1\u0613\6\100\1\u061a\1\uffff\1\u061b\1\uffff\1\100\1\uffff\1\100\2\uffff"+
		"\1\u061e\1\u061f\2\100\1\uffff\1\100\1\u0623\1\u0624\3\uffff\1\100\1\uffff"+
		"\1\u0626\1\u0627\1\u0628\1\u0629\2\100\2\uffff\1\100\1\u062d\2\uffff\1"+
		"\u062e\1\u062f\1\u0630\2\uffff\1\u0631\4\uffff\1\100\1\u0633\1\u0634\5"+
		"\uffff\1\100\2\uffff\1\u0636\1\uffff";
	static final String DFA105_eofS =
		"\u0637\uffff";
	static final String DFA105_minS =
		"\1\11\2\101\1\104\1\106\1\117\1\75\1\101\1\104\1\114\4\60\1\101\1\122"+
		"\1\105\1\110\1\116\1\101\1\117\2\101\2\105\13\uffff\2\75\2\uffff\1\55"+
		"\7\uffff\1\141\1\145\1\141\1\160\1\141\1\143\1\157\1\141\1\150\1\145\1"+
		"\157\1\145\2\0\2\50\3\uffff\1\101\1\102\1\60\2\115\1\114\1\105\1\114\1"+
		"\117\1\114\1\105\1\117\1\114\1\124\1\114\1\101\1\60\1\124\1\103\1\104"+
		"\1\60\1\105\1\124\2\60\1\124\1\123\1\114\2\uffff\1\113\1\106\1\101\1\124"+
		"\2\60\1\120\1\60\1\116\1\105\1\130\2\103\1\101\1\123\1\103\1\122\1\124"+
		"\1\117\1\125\1\120\1\uffff\1\126\1\114\1\uffff\2\103\1\116\1\122\1\uffff"+
		"\1\114\1\101\1\122\2\101\1\110\1\114\1\105\1\uffff\1\114\1\125\1\105\1"+
		"\101\1\123\1\102\1\101\1\60\1\117\1\107\1\103\1\106\1\105\1\116\1\101"+
		"\1\105\1\103\1\104\1\105\2\122\1\125\1\122\1\111\1\107\1\101\1\114\1\106"+
		"\1\111\1\116\1\122\1\105\1\131\4\uffff\1\76\5\uffff\1\156\1\154\1\142"+
		"\1\151\1\162\2\156\1\162\1\147\1\160\1\156\2\164\1\166\1\143\1\171\1\145"+
		"\1\165\2\144\1\163\1\165\1\60\1\141\1\163\2\0\1\42\2\0\1\42\2\60\1\50"+
		"\2\60\1\50\1\53\1\uffff\2\60\1\uffff\1\105\1\116\1\107\1\114\1\103\1\uffff"+
		"\1\131\1\105\1\115\1\124\2\120\1\116\1\123\1\115\1\114\1\103\1\123\1\114"+
		"\1\105\1\101\1\60\1\114\1\103\1\60\1\105\1\60\1\114\1\60\1\uffff\1\105"+
		"\1\101\1\110\1\60\1\105\1\60\1\uffff\1\122\1\60\1\uffff\1\114\1\uffff"+
		"\1\111\1\60\1\104\1\103\1\114\2\105\1\111\1\124\1\123\1\101\1\104\1\111"+
		"\1\107\1\105\1\uffff\1\60\1\122\2\105\1\101\1\105\1\uffff\1\117\1\uffff"+
		"\1\117\1\115\1\120\1\123\1\114\1\105\1\110\1\101\1\102\1\60\1\105\1\103"+
		"\1\111\3\105\1\101\1\105\1\60\1\101\1\120\1\102\1\122\1\111\1\104\1\113"+
		"\1\60\1\122\1\105\1\125\2\105\1\125\1\104\1\60\1\111\1\127\1\122\1\124"+
		"\1\114\1\105\1\122\1\124\1\105\1\60\1\127\1\103\1\114\1\115\1\123\1\101"+
		"\1\123\1\116\1\103\1\122\1\105\1\125\1\116\1\uffff\1\114\1\110\1\111\1"+
		"\101\1\113\1\117\1\127\1\116\1\114\1\110\1\104\1\117\1\105\2\117\1\122"+
		"\1\117\1\116\2\60\1\101\2\103\1\124\1\103\1\123\1\107\1\116\1\110\1\125"+
		"\2\101\1\125\1\104\1\105\2\117\1\124\1\60\1\105\1\111\1\113\1\107\1\103"+
		"\1\127\1\123\2\uffff\24\60\1\141\1\155\1\151\1\60\1\153\1\60\1\162\1\60"+
		"\1\uffff\1\162\1\164\1\60\1\0\1\uffff\1\0\1\60\3\uffff\1\50\1\53\1\uffff"+
		"\3\60\1\uffff\1\60\1\103\1\123\1\107\1\105\1\110\1\111\1\123\1\111\1\106"+
		"\1\117\1\122\1\60\1\105\2\60\2\124\1\104\1\106\1\124\1\101\1\uffff\1\117"+
		"\1\110\1\uffff\1\122\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1"+
		"\122\1\uffff\1\60\1\122\1\125\1\uffff\1\111\1\117\1\122\1\101\2\60\1\123"+
		"\1\124\2\60\1\114\2\60\1\103\1\60\2\122\1\60\1\uffff\1\105\1\122\1\130"+
		"\2\124\3\122\1\123\1\122\1\124\1\122\1\101\1\116\1\125\1\101\1\120\1\114"+
		"\1\uffff\2\60\2\115\1\124\1\116\1\122\1\111\1\102\1\103\1\uffff\3\60\1"+
		"\114\1\117\1\116\1\137\1\60\1\117\1\uffff\1\117\1\122\1\123\1\60\1\103"+
		"\2\105\1\60\1\uffff\2\60\1\105\1\60\1\114\1\116\1\103\1\101\1\105\1\111"+
		"\1\115\1\uffff\1\105\1\124\1\111\1\101\1\115\2\105\1\125\2\124\1\123\1"+
		"\107\2\60\1\101\1\117\1\105\1\60\1\120\1\124\1\105\1\60\1\116\1\122\1"+
		"\105\1\122\2\105\1\60\1\105\1\60\1\117\1\125\1\116\1\124\1\107\1\60\2"+
		"\103\1\125\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\105\1\124\3\105\1"+
		"\111\1\105\1\60\1\105\1\60\1\124\2\111\1\101\1\115\1\103\1\60\1\130\1"+
		"\113\2\122\1\60\1\uffff\1\125\1\60\1\114\2\105\1\110\2\60\1\141\1\uffff"+
		"\1\60\1\uffff\1\60\1\uffff\1\165\1\uffff\1\141\1\60\1\uffff\1\150\1\uffff"+
		"\1\60\1\uffff\1\141\1\60\1\150\1\uffff\1\164\1\60\1\uffff\1\154\1\uffff"+
		"\1\163\1\uffff\1\60\1\uffff\1\141\1\60\1\uffff\1\162\1\60\1\uffff\1\142"+
		"\1\uffff\1\155\1\uffff\1\155\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1"+
		"\uffff\1\171\1\162\1\157\1\147\1\145\1\60\1\uffff\1\60\1\uffff\2\60\1"+
		"\145\2\uffff\3\60\1\104\1\uffff\1\101\1\106\1\105\2\60\1\116\1\124\1\116"+
		"\1\111\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60\1\123\1\117\1\60\1"+
		"\124\1\127\2\60\1\132\2\60\1\126\1\60\1\122\1\uffff\1\60\1\124\2\116\1"+
		"\117\1\116\2\uffff\2\60\2\uffff\1\60\1\111\1\60\2\uffff\1\101\1\uffff"+
		"\1\101\1\123\1\uffff\1\115\1\124\1\60\1\110\1\104\1\60\1\124\1\105\1\60"+
		"\1\117\1\123\1\124\1\111\1\116\1\104\1\123\1\116\2\105\1\uffff\1\111\1"+
		"\uffff\1\101\1\111\1\105\1\104\1\122\1\116\1\111\1\114\1\124\1\101\1\uffff"+
		"\1\111\2\uffff\1\105\1\120\1\107\1\104\1\uffff\1\111\1\60\1\111\1\60\1"+
		"\uffff\1\124\1\116\1\60\2\uffff\1\104\1\uffff\2\104\1\uffff\1\111\1\107"+
		"\1\124\1\115\1\104\1\123\1\101\1\104\1\101\1\116\1\124\1\116\1\103\1\116"+
		"\1\124\2\105\1\60\1\105\2\uffff\1\104\1\122\1\116\1\uffff\2\60\1\101\1"+
		"\uffff\1\124\1\131\1\124\2\105\1\60\1\uffff\1\60\1\uffff\1\127\1\105\2"+
		"\60\1\116\1\uffff\1\113\1\110\1\116\1\60\1\uffff\1\115\1\105\1\122\1\131"+
		"\1\104\1\103\1\104\1\101\1\116\1\uffff\1\60\1\uffff\1\60\1\114\1\122\1"+
		"\103\2\105\1\116\1\60\1\uffff\1\120\1\105\1\104\1\111\1\uffff\1\120\1"+
		"\uffff\1\105\2\60\1\101\2\uffff\1\162\2\60\1\141\1\171\1\60\1\171\1\60"+
		"\1\145\1\60\1\164\1\155\1\171\1\144\1\145\2\142\1\141\2\60\1\157\1\162"+
		"\1\150\1\163\1\156\3\60\1\162\1\124\1\117\1\122\1\60\2\uffff\1\124\2\101"+
		"\1\114\1\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\1\uffff\1\60\1\111"+
		"\2\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\uffff\1\104\1\105\1\60\1"+
		"\120\1\60\3\uffff\1\117\1\uffff\2\114\1\101\2\105\1\60\1\123\1\uffff\1"+
		"\60\1\117\1\122\1\uffff\2\60\1\uffff\1\120\2\60\1\116\1\101\1\105\1\111"+
		"\1\107\1\104\1\60\1\102\1\114\1\124\1\60\2\105\1\103\1\102\1\105\1\117"+
		"\1\123\1\115\1\60\1\105\1\60\1\104\1\116\1\uffff\1\101\1\uffff\1\60\1"+
		"\103\1\122\1\uffff\1\101\2\60\1\116\2\60\1\124\1\60\1\124\2\60\1\116\1"+
		"\125\1\105\1\60\2\124\1\105\1\122\1\60\1\uffff\1\60\1\105\1\60\1\124\1"+
		"\116\2\uffff\1\116\4\60\1\116\2\uffff\1\60\1\112\1\131\2\uffff\1\105\1"+
		"\60\1\111\1\104\1\uffff\1\105\1\60\1\126\1\60\1\111\1\124\1\125\1\111"+
		"\1\114\1\124\2\uffff\1\104\1\60\1\105\2\60\1\114\1\uffff\2\60\1\122\1"+
		"\103\2\60\2\uffff\1\122\1\171\1\162\1\60\1\163\2\60\1\uffff\3\60\1\142"+
		"\1\60\1\141\1\162\2\145\1\171\1\141\1\uffff\1\167\2\157\1\164\3\144\1"+
		"\105\1\122\1\60\1\115\1\uffff\1\60\1\115\1\124\1\105\1\122\1\105\1\116"+
		"\1\uffff\1\115\1\105\1\uffff\1\116\2\60\1\124\1\117\1\122\1\60\1\uffff"+
		"\1\60\1\uffff\1\116\2\60\1\114\1\103\1\116\1\uffff\1\60\1\uffff\1\122"+
		"\1\111\2\uffff\1\105\2\uffff\1\60\1\114\1\104\1\126\1\105\1\60\1\uffff"+
		"\1\105\1\60\1\105\1\uffff\1\116\1\104\1\124\1\125\1\60\1\122\2\105\1\uffff"+
		"\1\122\1\uffff\1\114\1\60\1\114\1\uffff\1\105\1\117\1\124\2\uffff\1\124"+
		"\2\uffff\1\101\1\uffff\1\111\1\60\2\uffff\1\124\1\105\1\116\1\60\1\uffff"+
		"\1\111\3\60\2\uffff\1\60\1\uffff\1\60\1\107\1\60\2\uffff\1\60\2\uffff"+
		"\1\60\1\uffff\1\117\1\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff\1\105"+
		"\1\uffff\1\116\1\111\1\122\1\117\1\123\2\60\1\uffff\1\60\2\uffff\1\131"+
		"\2\uffff\1\105\1\122\1\124\2\uffff\2\60\1\171\5\60\1\145\1\60\1\171\1"+
		"\60\2\162\1\60\1\171\1\60\2\167\1\157\1\60\1\141\1\60\1\141\1\60\1\115"+
		"\1\uffff\1\120\1\uffff\1\120\1\105\1\60\1\131\1\122\1\60\1\101\1\104\1"+
		"\107\2\uffff\1\105\1\122\1\111\2\uffff\1\60\2\uffff\1\60\2\124\1\uffff"+
		"\1\115\1\126\1\122\1\uffff\2\60\1\105\1\60\1\uffff\1\60\1\uffff\1\104"+
		"\1\103\2\60\1\124\1\uffff\1\111\2\60\2\124\1\uffff\1\111\1\106\1\120\1"+
		"\101\1\60\1\102\1\103\1\uffff\2\60\1\101\1\uffff\1\117\2\uffff\1\104\1"+
		"\124\3\uffff\1\60\3\uffff\1\111\1\105\1\60\1\105\1\104\1\124\1\60\1\107"+
		"\1\117\1\105\1\116\1\103\3\uffff\1\60\1\101\1\111\1\60\1\uffff\2\60\1"+
		"\162\6\60\1\uffff\2\60\1\167\1\uffff\2\171\1\uffff\1\60\1\114\1\60\1\104"+
		"\1\uffff\1\60\1\124\1\60\1\uffff\1\124\3\60\1\115\1\126\2\uffff\1\60\2"+
		"\101\1\105\1\124\2\uffff\1\60\2\uffff\1\60\1\131\2\uffff\1\105\1\60\1"+
		"\105\1\60\2\uffff\2\111\1\132\1\111\1\105\1\102\1\uffff\1\114\1\123\2"+
		"\uffff\1\124\1\116\1\60\1\101\1\uffff\1\116\1\60\1\uffff\2\60\1\101\1"+
		"\uffff\1\60\1\116\2\60\1\101\1\uffff\1\104\1\124\1\uffff\11\60\1\uffff"+
		"\1\105\1\uffff\1\60\1\uffff\1\111\1\uffff\1\60\3\uffff\1\101\1\105\1\uffff"+
		"\1\114\1\124\1\122\1\111\2\uffff\2\60\1\uffff\1\123\1\uffff\1\105\1\115"+
		"\1\105\1\114\1\122\1\101\1\105\1\60\1\105\1\60\1\uffff\1\124\1\60\3\uffff"+
		"\1\115\1\uffff\1\60\1\uffff\1\60\1\104\1\uffff\1\116\2\105\2\60\1\uffff"+
		"\1\60\1\uffff\1\105\1\uffff\1\124\1\122\3\60\1\105\2\uffff\1\60\1\123"+
		"\1\105\1\104\1\105\1\124\1\123\1\60\1\uffff\1\60\1\uffff\1\125\1\uffff"+
		"\1\120\2\uffff\2\60\2\122\1\uffff\1\123\2\60\3\uffff\1\123\1\uffff\4\60"+
		"\1\111\1\105\2\uffff\1\123\1\60\2\uffff\3\60\2\uffff\1\60\4\uffff\1\105"+
		"\2\60\5\uffff\1\123\2\uffff\1\60\1\uffff";
	static final String DFA105_maxS =
		"\1\176\1\122\1\125\1\123\1\126\1\125\1\75\1\117\1\124\1\130\4\172\1\125"+
		"\1\122\1\131\1\111\1\124\1\125\2\117\1\111\1\105\1\126\13\uffff\1\76\1"+
		"\75\2\uffff\1\55\7\uffff\1\165\1\162\1\157\2\165\1\143\1\157\1\145\1\165"+
		"\1\153\2\162\2\uffff\2\172\3\uffff\1\125\1\102\1\172\1\116\1\130\1\114"+
		"\1\105\1\114\1\117\1\116\1\122\1\117\1\122\2\124\1\104\1\172\1\124\1\122"+
		"\1\104\1\172\1\105\1\124\2\172\1\124\1\137\1\114\2\uffff\1\116\1\123\1"+
		"\116\1\124\2\172\1\120\1\172\1\116\1\105\1\130\1\124\1\103\1\104\2\123"+
		"\1\126\1\124\1\117\1\125\1\120\1\uffff\1\126\1\114\1\uffff\1\103\1\124"+
		"\1\116\1\122\1\uffff\1\124\1\117\1\122\1\101\1\122\1\110\1\114\1\105\1"+
		"\uffff\1\116\1\125\1\117\1\101\1\123\1\122\1\117\1\172\1\124\1\116\1\103"+
		"\1\124\1\111\1\124\1\123\1\111\1\103\1\104\1\117\2\122\1\125\1\122\1\111"+
		"\1\107\1\126\1\127\1\106\1\111\1\116\1\122\1\105\1\131\4\uffff\1\76\5"+
		"\uffff\2\156\1\142\1\151\1\171\2\156\1\162\1\147\1\160\1\156\2\164\1\166"+
		"\1\143\1\171\1\145\1\165\1\156\1\145\1\163\1\165\1\172\2\163\2\uffff\1"+
		"\47\2\uffff\1\47\1\146\4\172\1\145\1\71\1\uffff\2\172\1\uffff\2\116\1"+
		"\107\1\114\1\103\1\uffff\1\131\1\105\1\115\1\124\2\120\1\116\1\123\1\115"+
		"\1\114\1\103\1\123\1\114\1\105\1\101\1\172\1\114\1\103\1\172\1\105\1\172"+
		"\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\105\1\172\1\uffff\1\122"+
		"\1\172\1\uffff\1\114\1\uffff\1\111\1\172\1\104\1\103\1\114\2\105\1\111"+
		"\1\124\1\123\1\113\1\104\1\111\1\107\1\105\1\uffff\1\172\1\122\2\105\1"+
		"\125\1\105\1\uffff\1\117\1\uffff\1\117\1\115\1\120\1\123\1\117\1\105\1"+
		"\114\1\101\1\102\1\172\1\105\1\103\2\111\2\105\1\124\1\105\1\172\1\105"+
		"\1\120\1\102\1\122\1\111\1\104\1\113\1\172\1\122\1\105\1\125\2\105\1\125"+
		"\1\104\1\172\1\111\1\127\1\122\1\124\1\114\1\125\1\122\1\124\1\105\1\172"+
		"\1\127\1\124\1\125\1\120\1\123\1\101\1\123\1\116\1\124\1\123\1\105\1\125"+
		"\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\122\1\114\1"+
		"\110\1\104\1\121\1\111\2\117\1\122\1\117\1\116\2\172\1\101\3\124\1\103"+
		"\1\123\1\107\1\116\1\110\1\125\1\114\1\101\1\125\1\104\1\105\2\117\1\124"+
		"\1\172\1\114\1\111\1\113\1\107\1\103\1\127\1\123\2\uffff\24\172\1\141"+
		"\1\157\1\151\1\172\1\153\1\172\1\162\1\172\1\uffff\1\162\1\164\1\172\1"+
		"\uffff\1\uffff\1\uffff\1\172\3\uffff\1\145\1\71\1\uffff\1\71\2\172\1\uffff"+
		"\1\172\1\103\1\123\1\107\1\105\1\110\1\111\1\123\1\111\1\106\1\117\1\122"+
		"\1\172\1\105\2\172\2\124\1\104\1\106\1\124\1\101\1\uffff\1\117\1\110\1"+
		"\uffff\1\122\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\122\1\uffff"+
		"\1\172\1\122\1\125\1\uffff\1\111\1\117\1\122\1\101\2\172\1\123\1\124\2"+
		"\172\1\124\2\172\1\103\1\172\2\122\1\172\1\uffff\1\105\1\122\1\130\2\124"+
		"\3\122\1\123\1\122\1\124\1\122\1\101\1\122\1\125\1\101\1\120\1\114\1\uffff"+
		"\2\172\2\115\1\124\1\116\2\122\1\102\1\103\1\uffff\3\172\1\114\1\117\1"+
		"\116\1\137\1\172\1\117\1\uffff\1\117\1\122\1\123\1\172\1\103\2\105\1\172"+
		"\1\uffff\2\172\1\105\1\172\1\114\1\116\1\103\1\101\1\105\1\111\1\115\1"+
		"\uffff\1\105\1\124\1\111\1\101\1\115\2\105\1\125\2\124\1\123\1\107\2\172"+
		"\1\101\1\117\1\105\1\172\1\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122"+
		"\2\105\1\172\1\105\1\172\1\117\1\125\1\116\1\124\1\107\1\172\2\103\1\125"+
		"\1\107\1\172\1\uffff\1\124\1\uffff\1\124\1\105\1\124\3\105\1\111\1\105"+
		"\1\172\1\105\1\172\1\124\2\111\1\101\1\115\1\103\1\172\1\130\1\113\2\122"+
		"\1\172\1\uffff\1\125\1\172\1\114\2\105\1\110\2\172\1\141\1\uffff\1\172"+
		"\1\uffff\1\172\1\uffff\1\165\1\uffff\1\141\1\172\1\uffff\1\150\1\uffff"+
		"\1\172\1\uffff\1\141\1\172\1\150\1\uffff\1\164\1\172\1\uffff\1\154\1\uffff"+
		"\1\163\1\uffff\1\172\1\uffff\1\141\1\172\1\uffff\1\162\1\172\1\uffff\1"+
		"\142\1\uffff\1\155\1\uffff\1\155\1\uffff\1\172\1\uffff\1\172\1\uffff\2"+
		"\172\1\uffff\1\171\1\162\1\157\1\147\1\145\1\172\1\uffff\1\172\1\uffff"+
		"\2\172\1\145\2\uffff\1\71\2\102\1\104\1\uffff\1\101\1\106\1\105\2\172"+
		"\1\116\1\124\1\116\1\111\1\122\1\117\1\uffff\1\172\2\uffff\1\111\1\172"+
		"\1\123\1\117\1\172\1\124\1\127\2\172\1\132\2\172\1\126\1\172\1\122\1\uffff"+
		"\1\172\1\124\2\116\1\117\1\116\2\uffff\2\172\2\uffff\1\172\1\111\1\172"+
		"\2\uffff\1\101\1\uffff\1\101\1\126\1\uffff\1\115\1\124\1\172\1\110\1\106"+
		"\1\172\1\124\1\105\1\172\1\117\1\123\1\124\1\111\1\116\1\104\1\123\1\116"+
		"\2\105\1\uffff\1\111\1\uffff\1\101\1\111\1\105\1\104\1\122\1\116\1\111"+
		"\1\114\1\124\1\101\1\uffff\1\111\2\uffff\1\105\1\120\1\107\1\104\1\uffff"+
		"\1\111\1\172\1\111\1\172\1\uffff\1\124\1\116\1\172\2\uffff\1\104\1\uffff"+
		"\2\104\1\uffff\1\111\1\107\1\124\1\115\1\104\1\123\1\101\1\104\1\101\1"+
		"\116\1\124\1\116\1\103\1\116\1\124\2\105\1\172\1\105\2\uffff\1\104\1\122"+
		"\1\116\1\uffff\2\172\1\101\1\uffff\1\124\1\131\1\124\2\105\1\172\1\uffff"+
		"\1\172\1\uffff\1\127\1\105\2\172\1\116\1\uffff\1\113\1\110\1\116\1\172"+
		"\1\uffff\1\115\1\105\1\122\1\131\1\104\1\103\1\104\1\124\1\116\1\uffff"+
		"\1\172\1\uffff\1\172\1\114\1\122\1\103\2\105\1\116\1\172\1\uffff\1\120"+
		"\1\105\1\104\1\111\1\uffff\1\120\1\uffff\1\105\2\172\1\101\2\uffff\1\162"+
		"\2\172\1\141\1\171\1\172\1\171\1\172\1\145\1\172\1\164\1\155\1\171\1\144"+
		"\1\145\2\142\1\141\2\172\2\162\1\150\1\163\1\156\3\172\1\162\1\124\1\117"+
		"\1\122\1\172\2\uffff\1\124\2\101\1\114\1\101\1\120\1\uffff\1\117\1\uffff"+
		"\1\172\1\122\1\uffff\1\172\1\111\2\uffff\1\105\2\uffff\1\105\1\uffff\1"+
		"\111\1\uffff\1\106\1\105\1\172\1\120\1\172\3\uffff\1\117\1\uffff\2\114"+
		"\1\101\2\105\1\172\1\123\1\uffff\1\172\1\117\1\122\1\uffff\2\172\1\uffff"+
		"\1\120\2\172\1\116\1\101\1\105\1\111\1\107\1\104\1\172\1\102\1\114\1\124"+
		"\1\172\2\105\1\103\1\102\1\105\1\117\1\123\1\115\1\172\1\105\1\172\1\104"+
		"\1\116\1\uffff\1\101\1\uffff\1\172\1\103\1\122\1\uffff\1\101\2\172\1\116"+
		"\2\172\1\124\1\172\1\124\2\172\1\116\1\125\1\105\1\172\2\124\1\105\1\122"+
		"\1\172\1\uffff\1\172\1\105\1\172\1\124\1\116\2\uffff\1\116\4\172\1\116"+
		"\2\uffff\1\172\1\112\1\131\2\uffff\1\105\1\172\1\111\1\104\1\uffff\1\105"+
		"\1\172\1\126\1\172\1\111\1\124\1\125\1\111\1\114\1\124\2\uffff\1\104\1"+
		"\172\1\105\2\172\1\114\1\uffff\2\172\1\127\1\103\2\172\2\uffff\1\122\1"+
		"\171\1\162\1\172\1\163\2\172\1\uffff\3\172\1\142\1\172\1\141\1\162\2\145"+
		"\1\171\1\141\1\uffff\1\167\1\157\1\162\1\164\3\144\1\105\1\122\1\172\1"+
		"\115\1\uffff\1\172\1\115\1\124\1\105\1\122\1\105\1\116\1\uffff\1\115\1"+
		"\105\1\uffff\1\116\2\172\1\124\1\117\1\122\1\172\1\uffff\1\172\1\uffff"+
		"\1\116\2\172\1\114\1\103\1\116\1\uffff\1\172\1\uffff\1\122\1\111\2\uffff"+
		"\1\105\2\uffff\1\172\1\114\1\104\1\126\1\105\1\172\1\uffff\1\105\1\172"+
		"\1\105\1\uffff\1\116\1\104\1\124\1\125\1\172\1\122\2\105\1\uffff\1\122"+
		"\1\uffff\1\114\1\172\1\114\1\uffff\1\105\1\117\1\124\2\uffff\1\124\2\uffff"+
		"\1\101\1\uffff\1\111\1\172\2\uffff\1\124\1\105\1\116\1\172\1\uffff\1\111"+
		"\3\172\2\uffff\1\172\1\uffff\1\172\1\107\1\172\2\uffff\1\172\2\uffff\1"+
		"\172\1\uffff\1\117\1\120\1\104\1\uffff\1\126\1\105\1\123\1\uffff\1\105"+
		"\1\uffff\1\116\1\111\1\122\1\117\1\123\2\172\1\uffff\1\172\2\uffff\1\131"+
		"\2\uffff\1\105\1\122\1\124\2\uffff\2\172\1\171\5\172\1\145\1\172\1\171"+
		"\1\172\2\162\1\172\1\171\1\172\2\167\1\157\1\172\1\141\1\172\1\141\1\172"+
		"\1\115\1\uffff\1\120\1\uffff\1\120\1\105\1\172\1\131\1\122\1\172\1\101"+
		"\1\104\1\107\2\uffff\1\105\1\122\1\111\2\uffff\1\172\2\uffff\1\172\2\124"+
		"\1\uffff\1\115\1\126\1\122\1\uffff\2\172\1\105\1\172\1\uffff\1\172\1\uffff"+
		"\1\104\1\103\2\172\1\124\1\uffff\1\131\2\172\2\124\1\uffff\1\111\1\106"+
		"\1\120\1\101\1\172\1\102\1\103\1\uffff\2\172\1\101\1\uffff\1\117\2\uffff"+
		"\1\104\1\124\3\uffff\1\172\3\uffff\1\111\1\105\1\172\1\105\1\104\1\124"+
		"\1\172\1\107\1\117\1\105\1\116\1\103\3\uffff\1\172\1\101\1\111\1\172\1"+
		"\uffff\2\172\1\162\6\172\1\uffff\2\172\1\167\1\uffff\2\171\1\uffff\1\172"+
		"\1\114\1\172\1\104\1\uffff\1\172\1\124\1\172\1\uffff\1\124\3\172\1\115"+
		"\1\126\2\uffff\1\172\2\101\1\105\1\124\2\uffff\1\172\2\uffff\1\172\1\131"+
		"\2\uffff\1\105\1\172\1\105\1\172\2\uffff\2\111\1\132\1\111\1\105\1\102"+
		"\1\uffff\1\114\1\123\2\uffff\1\124\1\116\1\172\1\101\1\uffff\1\116\1\172"+
		"\1\uffff\2\172\1\101\1\uffff\1\172\1\116\2\172\1\101\1\uffff\1\104\1\124"+
		"\1\uffff\11\172\1\uffff\1\105\1\uffff\1\172\1\uffff\1\111\1\uffff\1\172"+
		"\3\uffff\1\101\1\105\1\uffff\1\114\1\124\1\122\1\111\2\uffff\2\172\1\uffff"+
		"\1\123\1\uffff\1\105\1\115\1\105\1\114\1\122\1\101\1\105\1\172\1\105\1"+
		"\172\1\uffff\1\124\1\172\3\uffff\1\115\1\uffff\1\172\1\uffff\1\172\1\104"+
		"\1\uffff\1\116\2\105\2\172\1\uffff\1\172\1\uffff\1\105\1\uffff\1\124\1"+
		"\122\3\172\1\105\2\uffff\1\172\1\123\1\105\1\104\1\105\1\124\1\123\1\172"+
		"\1\uffff\1\172\1\uffff\1\125\1\uffff\1\120\2\uffff\2\172\2\122\1\uffff"+
		"\1\123\2\172\3\uffff\1\123\1\uffff\4\172\1\111\1\105\2\uffff\1\123\1\172"+
		"\2\uffff\3\172\2\uffff\1\172\4\uffff\1\105\2\172\5\uffff\1\123\2\uffff"+
		"\1\172\1\uffff";
	static final String DFA105_acceptS =
		"\31\uffff\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff"+
		"\1\u0100\1\u0101\1\u0102\2\uffff\1\u0109\1\u010a\1\uffff\1\u010c\1\u010d"+
		"\1\u010f\1\u0110\1\u0111\1\u0112\1\u0113\20\uffff\1\u013b\1\u013c\1\u013d"+
		"\34\uffff\1\u0104\1\6\25\uffff\1\12\2\uffff\1\13\4\uffff\1\14\10\uffff"+
		"\1\15\41\uffff\1\160\1\u009f\1\u00a0\1\u0114\1\uffff\1\u0106\1\u0107\1"+
		"\u0108\1\u013e\1\u010b\46\uffff\1\u0139\2\uffff\1\u013a\5\uffff\1\115"+
		"\27\uffff\1\31\6\uffff\1\5\2\uffff\1\45\1\uffff\1\u0085\17\uffff\1\10"+
		"\6\uffff\1\u00b3\1\uffff\1\77\72\uffff\1\25\56\uffff\1\u0103\1\u0105\34"+
		"\uffff\1\u0128\4\uffff\1\u0132\2\uffff\1\u0134\1\u0135\1\u0136\2\uffff"+
		"\1\u0137\3\uffff\1\u0138\26\uffff\1\u00e6\2\uffff\1\3\1\uffff\1\4\1\uffff"+
		"\1\21\3\uffff\1\u0088\1\uffff\1\167\3\uffff\1\u0084\22\uffff\1\122\22"+
		"\uffff\1\u00a5\12\uffff\1\u010e\11\uffff\1\136\10\uffff\1\u009b\13\uffff"+
		"\1\u00bb\52\uffff\1\u00db\1\uffff\1\u00aa\27\uffff\1\146\11\uffff\1\u0115"+
		"\1\uffff\1\u011a\1\uffff\1\u011b\1\uffff\1\u0116\2\uffff\1\u0126\1\uffff"+
		"\1\u0117\1\uffff\1\u0119\3\uffff\1\u0122\2\uffff\1\u0129\1\uffff\1\u0118"+
		"\1\uffff\1\u011c\1\uffff\1\u011d\2\uffff\1\u0121\2\uffff\1\u0127\1\uffff"+
		"\1\u011e\1\uffff\1\u011f\1\uffff\1\u0120\1\uffff\1\u012a\1\uffff\1\u0123"+
		"\2\uffff\1\u0125\6\uffff\1\u0124\1\uffff\1\u012b\3\uffff\1\u012d\1\u0133"+
		"\4\uffff\1\1\13\uffff\1\u00a3\1\uffff\1\30\1\44\17\uffff\1\u00ee\6\uffff"+
		"\1\100\1\7\2\uffff\1\42\1\u00ec\3\uffff\1\u00bd\1\72\1\uffff\1\u00ac\2"+
		"\uffff\1\144\23\uffff\1\u00a4\1\uffff\1\22\12\uffff\1\75\1\uffff\1\126"+
		"\1\111\4\uffff\1\60\4\uffff\1\u00ed\3\uffff\1\u00f0\1\u00d4\1\uffff\1"+
		"\57\2\uffff\1\70\23\uffff\1\u0087\1\u00a1\3\uffff\1\u00e4\3\uffff\1\u00cc"+
		"\6\uffff\1\u00a2\1\uffff\1\u0096\5\uffff\1\u00bc\4\uffff\1\u00f4\11\uffff"+
		"\1\u00ae\1\uffff\1\41\10\uffff\1\u00c5\4\uffff\1\147\1\uffff\1\u00f5\4"+
		"\uffff\1\u00b2\1\157\41\uffff\1\50\1\u00d6\6\uffff\1\2\1\uffff\1\106\2"+
		"\uffff\1\124\2\uffff\1\u00b0\1\103\1\uffff\1\107\1\134\1\uffff\1\23\1"+
		"\uffff\1\36\5\uffff\1\161\1\u009a\1\63\1\uffff\1\u00be\7\uffff\1\53\3"+
		"\uffff\1\u00f6\2\uffff\1\156\33\uffff\1\u008e\1\uffff\1\u00af\3\uffff"+
		"\1\u0095\24\uffff\1\u00ce\5\uffff\1\24\1\u00b9\6\uffff\1\27\1\u00c4\3"+
		"\uffff\1\71\1\u009c\4\uffff\1\65\12\uffff\1\u00c7\1\43\6\uffff\1\u00c6"+
		"\6\uffff\1\u008a\1\u00c8\7\uffff\1\u012c\13\uffff\1\u012e\13\uffff\1\51"+
		"\7\uffff\1\152\2\uffff\1\150\7\uffff\1\u00dc\1\uffff\1\u00f2\6\uffff\1"+
		"\34\1\uffff\1\76\2\uffff\1\74\1\113\1\uffff\1\11\1\73\6\uffff\1\175\3"+
		"\uffff\1\u00ad\10\uffff\1\125\1\uffff\1\26\3\uffff\1\32\3\uffff\1\u00c0"+
		"\1\143\1\uffff\1\132\1\135\1\uffff\1\162\2\uffff\1\u00b7\1\u00e2\4\uffff"+
		"\1\105\4\uffff\1\101\1\104\1\uffff\1\u00d0\3\uffff\1\123\1\u00cd\1\uffff"+
		"\1\u0083\1\u00ca\1\uffff\1\u00e7\3\uffff\1\u00bf\3\uffff\1\u00df\1\uffff"+
		"\1\u0092\7\uffff\1\61\1\uffff\1\112\1\140\1\uffff\1\u008b\1\u00ba\3\uffff"+
		"\1\u00e3\1\166\32\uffff\1\u00d1\1\uffff\1\120\11\uffff\1\u00c9\1\u00d7"+
		"\3\uffff\1\174\1\u0080\1\uffff\1\u0094\1\u00d5\3\uffff\1\54\3\uffff\1"+
		"\u008f\4\uffff\1\154\1\uffff\1\131\5\uffff\1\176\5\uffff\1\u00a6\7\uffff"+
		"\1\u00b8\3\uffff\1\52\1\uffff\1\116\1\u00d9\2\uffff\1\66\1\u00e1\1\u00eb"+
		"\1\uffff\1\117\1\145\1\u00cb\14\uffff\1\u0086\1\55\1\u0089\4\uffff\1\133"+
		"\11\uffff\1\u012f\3\uffff\1\u0130\2\uffff\1\u00f1\4\uffff\1\165\3\uffff"+
		"\1\u008d\6\uffff\1\u0081\1\17\5\uffff\1\102\1\u0090\1\uffff\1\u00f7\1"+
		"\110\2\uffff\1\u0097\1\33\4\uffff\1\u00b4\1\127\6\uffff\1\121\2\uffff"+
		"\1\16\1\u00cf\4\uffff\1\u00ef\2\uffff\1\u00c3\3\uffff\1\40\5\uffff\1\177"+
		"\2\uffff\1\u00e0\11\uffff\1\64\1\uffff\1\130\1\uffff\1\u008c\1\uffff\1"+
		"\56\1\uffff\1\u0091\1\u00ea\1\35\2\uffff\1\u00b1\4\uffff\1\u00c1\1\151"+
		"\2\uffff\1\62\1\uffff\1\u00b5\12\uffff\1\142\2\uffff\1\137\1\u00d8\1\u00e8"+
		"\1\uffff\1\u00e9\1\uffff\1\u00c2\2\uffff\1\46\5\uffff\1\u0131\1\uffff"+
		"\1\153\1\uffff\1\163\6\uffff\1\u0093\1\67\10\uffff\1\u00da\1\uffff\1\155"+
		"\1\uffff\1\37\1\uffff\1\114\1\47\4\uffff\1\u0082\3\uffff\1\20\1\170\1"+
		"\172\1\uffff\1\u00e5\6\uffff\1\u00a7\1\u00dd\2\uffff\1\141\1\u00f3\3\uffff"+
		"\1\171\1\173\1\uffff\1\u0099\1\u00a8\1\u00b6\1\164\3\uffff\1\u00ab\1\u00d2"+
		"\1\u00d3\1\u009d\1\u009e\1\uffff\1\u00de\1\u00a9\1\uffff\1\u0098";
	static final String DFA105_specialS =
		"\74\uffff\1\3\1\2\u008e\uffff\1\5\1\6\1\uffff\1\0\1\7\u00da\uffff\1\4"+
		"\1\uffff\1\1\u0489\uffff}>";
	static final String[] DFA105_transitionS = {
			"\2\102\2\uffff\1\102\22\uffff\1\102\1\6\1\75\1\uffff\1\30\1\52\1\53\1"+
			"\74\1\35\1\36\1\51\1\47\1\33\1\50\1\31\1\46\1\76\11\77\1\32\1\34\1\44"+
			"\1\43\1\45\1\57\1\uffff\1\3\1\20\1\16\1\12\1\11\1\2\1\17\1\13\1\10\1"+
			"\24\1\27\1\7\1\14\1\5\1\4\1\23\1\100\1\25\1\15\1\1\1\22\1\26\1\21\3\100"+
			"\1\37\1\uffff\1\40\1\56\1\101\1\100\1\63\2\100\1\67\1\100\1\61\1\100"+
			"\1\72\1\100\1\60\2\100\1\62\1\66\1\65\3\100\1\64\1\70\2\100\1\71\1\100"+
			"\1\73\1\100\1\41\1\55\1\42\1\54",
			"\1\104\1\110\2\uffff\1\107\2\uffff\1\111\1\106\5\uffff\1\105\2\uffff"+
			"\1\103",
			"\1\112\3\uffff\1\120\3\uffff\1\115\2\uffff\1\116\2\uffff\1\117\2\uffff"+
			"\1\113\2\uffff\1\114",
			"\1\126\1\uffff\1\124\5\uffff\1\121\1\uffff\1\122\3\uffff\1\125\1\123",
			"\1\133\7\uffff\1\132\1\uffff\1\134\1\uffff\1\127\2\uffff\1\131\1\130",
			"\1\135\5\uffff\1\136",
			"\1\137",
			"\1\144\3\uffff\1\142\3\uffff\1\141\5\uffff\1\143",
			"\1\153\1\uffff\1\145\1\151\5\uffff\1\147\1\146\4\uffff\1\150\1\152",
			"\1\157\1\uffff\1\156\4\uffff\1\155\4\uffff\1\154",
			"\12\100\7\uffff\1\162\1\165\2\100\1\160\3\100\1\161\5\100\1\164\2\100"+
			"\1\163\10\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\1\167\15\100\1\170\13\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\1\173\7\100\1\174\5\100\1\175\3\100\1\172\7\100\4\uffff"+
			"\1\100\1\uffff\32\100",
			"\12\100\7\uffff\2\100\1\u0084\1\100\1\177\2\100\1\u0080\2\100\1\u0086"+
			"\1\100\1\u0082\1\100\1\u0081\3\100\1\u0085\1\u0083\6\100\4\uffff\1\100"+
			"\1\uffff\32\100",
			"\1\u008c\6\uffff\1\u008b\3\uffff\1\u0089\2\uffff\1\u0088\2\uffff\1\u008a"+
			"\2\uffff\1\u008d",
			"\1\u008e",
			"\1\u0093\3\uffff\1\u0091\5\uffff\1\u0090\5\uffff\1\u0092\3\uffff\1\u008f",
			"\1\u0094\1\u0095",
			"\1\u0096\1\uffff\1\u0099\2\uffff\1\u0097\1\u0098",
			"\1\u009b\3\uffff\1\u009c\6\uffff\1\u009d\5\uffff\1\u009a\2\uffff\1\u009e",
			"\1\u009f",
			"\1\u00a5\1\uffff\1\u00a3\1\uffff\1\u00a1\3\uffff\1\u00a0\2\uffff\1\u00a4"+
			"\2\uffff\1\u00a2",
			"\1\u00a6\7\uffff\1\u00a7",
			"\1\u00a8",
			"\1\u00ab\5\uffff\1\u00a9\12\uffff\1\u00aa",
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
			"\1\u00ad\1\137",
			"\1\u00af",
			"",
			"",
			"\1\u00b1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b3\23\uffff\1\u00b4",
			"\1\u00b5\14\uffff\1\u00b6",
			"\1\u00b7\7\uffff\1\u00b9\5\uffff\1\u00b8",
			"\1\u00ba\4\uffff\1\u00bb",
			"\1\u00be\3\uffff\1\u00bc\17\uffff\1\u00bd",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c2\3\uffff\1\u00c1",
			"\1\u00c4\6\uffff\1\u00c5\5\uffff\1\u00c3",
			"\1\u00c6\5\uffff\1\u00c7",
			"\1\u00c8\2\uffff\1\u00c9",
			"\1\u00ca\14\uffff\1\u00cb",
			"\47\u00cc\1\u00ce\64\u00cc\1\u00cd\uffa3\u00cc",
			"\42\u00cf\1\u00d1\71\u00cf\1\u00d0\uffa3\u00cf",
			"\1\u00dc\5\uffff\1\u00d7\1\uffff\12\u00d4\7\uffff\1\100\1\u00da\2\100"+
			"\1\u00d8\1\100\1\u00db\3\100\1\u00db\1\u00d3\1\u00db\5\100\1\u00d5\4"+
			"\100\1\u00d2\1\u00d6\1\100\4\uffff\1\100\1\uffff\1\100\1\u00db\2\100"+
			"\1\u00d8\1\100\1\u00db\3\100\1\u00db\1\100\1\u00db\15\100",
			"\1\u00dc\5\uffff\1\u00d7\1\uffff\12\u00d4\7\uffff\1\100\1\u00da\2\100"+
			"\1\u00d8\1\100\1\u00db\3\100\1\u00db\1\u00d3\1\u00db\5\100\1\u00d5\5"+
			"\100\1\u00d6\1\100\4\uffff\1\100\1\uffff\1\100\1\u00db\2\100\1\u00d8"+
			"\1\100\1\u00db\3\100\1\u00db\1\100\1\u00db\15\100",
			"",
			"",
			"",
			"\1\u00de\7\uffff\1\u00df\13\uffff\1\u00dd",
			"\1\u00e0",
			"\12\100\7\uffff\24\100\1\u00e1\5\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u00e4\1\u00e3",
			"\1\u00e7\4\uffff\1\u00e5\5\uffff\1\u00e6",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec\1\uffff\1\u00ed",
			"\1\u00ef\6\uffff\1\u00f0\5\uffff\1\u00ee",
			"\1\u00f1",
			"\1\u00f3\5\uffff\1\u00f2",
			"\1\u00f4",
			"\1\u00f5\7\uffff\1\u00f6",
			"\1\u00f8\2\uffff\1\u00f7",
			"\12\100\7\uffff\2\100\1\u00f9\27\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u00fb",
			"\1\u00fd\16\uffff\1\u00fc",
			"\1\u00fe",
			"\12\100\7\uffff\2\100\1\u0100\1\u00ff\26\100\4\uffff\1\100\1\uffff\32"+
			"\100",
			"\1\u0102",
			"\1\u0103",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\5\100\1\u0105\24\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0107",
			"\1\u010a\1\u0108\12\uffff\1\u0109",
			"\1\u010b",
			"",
			"",
			"\1\u010c\1\uffff\1\u010e\1\u010d",
			"\1\u010f\14\uffff\1\u0110",
			"\1\u0112\1\uffff\1\u0111\3\uffff\1\u0113\6\uffff\1\u0114",
			"\1\u0115",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\2\100\1\u0118\1\u011a\11\100\1\u011c\1\100\1\u011b\2"+
			"\100\1\u0119\1\u0117\6\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u011e",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0126\5\uffff\1\u0123\6\uffff\1\u0124\3\uffff\1\u0125",
			"\1\u0127",
			"\1\u0128\2\uffff\1\u0129",
			"\1\u012a",
			"\1\u012c\2\uffff\1\u012f\5\uffff\1\u012d\3\uffff\1\u012e\2\uffff\1\u012b",
			"\1\u0131\1\u0130\2\uffff\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"",
			"\1\u0137",
			"\1\u0138",
			"",
			"\1\u0139",
			"\1\u013b\14\uffff\1\u013a\3\uffff\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"",
			"\1\u013f\1\u0143\3\uffff\1\u0140\1\u0141\1\uffff\1\u0142",
			"\1\u0145\15\uffff\1\u0144",
			"\1\u0146",
			"\1\u0147",
			"\1\u014a\15\uffff\1\u0149\2\uffff\1\u0148",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"",
			"\1\u014f\1\u0150\1\u014e",
			"\1\u0151",
			"\1\u0152\11\uffff\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0157\17\uffff\1\u0156",
			"\1\u0159\15\uffff\1\u0158",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u015b\4\uffff\1\u015c",
			"\1\u015d\6\uffff\1\u015e",
			"\1\u015f",
			"\1\u0160\15\uffff\1\u0161",
			"\1\u0162\3\uffff\1\u0163",
			"\1\u0165\5\uffff\1\u0164",
			"\1\u016a\1\u016b\1\uffff\1\u0168\4\uffff\1\u0166\2\uffff\1\u0169\6\uffff"+
			"\1\u0167",
			"\1\u016d\3\uffff\1\u016c",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170\11\uffff\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u017c\1\u0178\1\u017f\1\u017b\2\uffff\1\u017d\6\uffff\1\u017a\1\uffff"+
			"\1\u0179\2\uffff\1\u0180\2\uffff\1\u017e",
			"\1\u0182\12\uffff\1\u0181",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"",
			"",
			"",
			"",
			"\1\u0189",
			"",
			"",
			"",
			"",
			"",
			"\1\u018b",
			"\1\u018d\1\uffff\1\u018c",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190\6\uffff\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f\10\uffff\1\u01a0\1\u01a1",
			"\1\u01a2\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u01a6\7\100",
			"\1\u01a8\21\uffff\1\u01a9",
			"\1\u01aa",
			"\47\u00cc\1\u00ce\64\u00cc\1\u00cd\uffa3\u00cc",
			"\0\u01ab",
			"\1\75\4\uffff\1\74",
			"\42\u00cf\1\u00d1\71\u00cf\1\u00d0\uffa3\u00cf",
			"\0\u01ad",
			"\1\75\4\uffff\1\74",
			"\12\u01ae\7\uffff\6\u01ae\32\uffff\6\u01ae",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u00dc\5\uffff\1\u00d7\1\uffff\12\u00d4\7\uffff\1\100\1\u00da\2\100"+
			"\1\u00d8\1\100\1\u00db\3\100\1\u00db\1\u00d3\1\u00db\5\100\1\u00d5\5"+
			"\100\1\u00d6\1\100\4\uffff\1\100\1\uffff\1\100\1\u00db\2\100\1\u00d8"+
			"\1\100\1\u00db\3\100\1\u00db\1\100\1\u00db\15\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u00dc\7\uffff\12\u01b2\10\uffff\1\u01b4\2\uffff\1\u01b3\37\uffff"+
			"\1\u01b3",
			"\1\u01b5\1\uffff\1\u01b5\2\uffff\12\u01b6",
			"",
			"\12\100\7\uffff\3\100\1\u01b7\26\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u01b9\10\uffff\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\12\100\7\uffff\14\100\1\u01ce\15\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u01d0",
			"\1\u01d1",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u01d3",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u01d5",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u01db",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u01dd",
			"\12\100\7\uffff\4\100\1\u01de\12\100\1\u01df\12\100\4\uffff\1\100\1"+
			"\uffff\32\100",
			"",
			"\1\u01e1",
			"",
			"\1\u01e2",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb\11\uffff\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"",
			"\12\100\7\uffff\4\100\1\u01f1\11\100\1\u01f2\13\100\4\uffff\1\100\1"+
			"\uffff\32\100",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7\23\uffff\1\u01f8",
			"\1\u01f9",
			"",
			"\1\u01fa",
			"",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u0200\2\uffff\1\u01ff",
			"\1\u0201",
			"\1\u0203\3\uffff\1\u0202",
			"\1\u0204",
			"\1\u0205",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020b\3\uffff\1\u020a",
			"\1\u020c",
			"\1\u020d",
			"\1\u020f\22\uffff\1\u020e",
			"\1\u0210",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0212\3\uffff\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\12\100\7\uffff\11\100\1\u021a\20\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\12\100\7\uffff\22\100\1\u0223\7\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\1\u0229",
			"\1\u022c\3\uffff\1\u022a\13\uffff\1\u022b",
			"\1\u022d",
			"\1\u022e",
			"\1\u022f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0231",
			"\1\u0234\17\uffff\1\u0232\1\u0233",
			"\1\u0236\10\uffff\1\u0235",
			"\1\u0237\2\uffff\1\u0238",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023f\1\uffff\1\u023e\16\uffff\1\u023d",
			"\1\u0241\1\u0240",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024d\3\uffff\1\u024c",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0252\1\uffff\1\u0251",
			"\1\u0253\3\uffff\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\12\100\7\uffff\21\100\1\u025a\10\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\u025c\1\uffff\32\100",
			"\1\u025e",
			"\1\u0261\17\uffff\1\u025f\1\u0260",
			"\1\u0263\20\uffff\1\u0262",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a",
			"\1\u026b\12\uffff\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0271",
			"\1\u0272",
			"\1\u0273",
			"\12\100\7\uffff\22\100\1\u0274\7\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0277\6\uffff\1\u0276",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\24\100\1\u027e\5\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u0280\25\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\30\100\1\u0282\1\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\21\100\1\u0284\10\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\u0286\16\100\1"+
			"\u0287\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\2\100\1\u0289\27\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u028b\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\u028d\16\100\1"+
			"\u028e\1\u028f\6\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0292\1\100\1"+
			"\u0291\5\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\10\100\1\u0294\21\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\24\100\1\u0296\5\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\23\100\1\u0298\6\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\u029a\16\100\1"+
			"\u029b\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u029e\1\100\1"+
			"\u029d\5\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\16\100\1\u02a0\13\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u02a2\25\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u02a4\25\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u02a6\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u02a8\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\21\100\1\u02aa\1\u02ab"+
			"\7\100",
			"\1\u02ad",
			"\1\u02af\1\uffff\1\u02ae",
			"\1\u02b0",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\15\100\1\u02b1\4\100\1"+
			"\u02b2\7\100",
			"\1\u02b4",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02b6",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u02b7",
			"\1\u02b8",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\47\u00cc\1\u00ce\64\u00cc\1\u00cd\uffa3\u00cc",
			"",
			"\42\u00cf\1\u00d1\71\u00cf\1\u00d0\uffa3\u00cf",
			"\12\u01ae\7\uffff\6\u01ae\24\100\4\uffff\1\100\1\uffff\6\u01ae\24\100",
			"",
			"",
			"",
			"\1\u00dc\7\uffff\12\u01b2\10\uffff\1\u01b4\2\uffff\1\u01b3\37\uffff"+
			"\1\u01b3",
			"\1\u02bb\1\uffff\1\u02bb\2\uffff\12\u02bc",
			"",
			"\12\u02bd",
			"\12\u01b6\7\uffff\1\100\1\u02be\30\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02ca",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02cc",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"",
			"\1\u02d5",
			"\1\u02d6",
			"",
			"\1\u02d7",
			"",
			"\1\u02d8",
			"",
			"\1\u02d9",
			"\1\u02da",
			"\1\u02db",
			"",
			"\1\u02dc",
			"",
			"\12\100\7\uffff\26\100\1\u02dd\3\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02df",
			"\1\u02e0",
			"",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02e7",
			"\1\u02e8",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02eb\7\uffff\1\u02ec",
			"\12\100\7\uffff\22\100\1\u02ed\7\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02f0",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u02f2",
			"\1\u02f3",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0303\3\uffff\1\u0302",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\1\u0307",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\21\100\1\u0309\10\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310\10\uffff\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"",
			"\12\100\7\uffff\1\100\1\u0314\30\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\23\100\1\u0316\6\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0319",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u031e",
			"",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\u0328\1\uffff\32\100",
			"\1\u032a",
			"\12\100\7\uffff\4\100\1\u032b\25\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"",
			"\1\u0334",
			"\1\u0335",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"\1\u0339",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0346",
			"\1\u0347",
			"\1\u0348",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u034a",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d",
			"\1\u034e",
			"\1\u034f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0351",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u035e",
			"",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"\1\u0363",
			"\1\u0364",
			"\1\u0365",
			"\1\u0366",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0368",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\1\u036d",
			"\1\u036e",
			"\1\u036f",
			"\12\100\7\uffff\16\100\1\u0370\3\100\1\u0371\7\100\4\uffff\1\100\1\uffff"+
			"\32\100",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0378",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u037a",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0380",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0381\7\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0382\7\100",
			"",
			"\1\u0383",
			"",
			"\1\u0384",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0385",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0386",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0387",
			"",
			"\1\u0388",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0389",
			"",
			"\1\u038a",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u038b\25\100",
			"",
			"\1\u038c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u038d",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u038e",
			"",
			"\1\u038f",
			"",
			"\1\u0390",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\u0391\26\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0392\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0393",
			"\1\u0394",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u0398\15\100\1"+
			"\u0399\7\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u039a\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u039b\7\100",
			"\1\u039c",
			"",
			"",
			"\12\u02bc",
			"\12\u02bc\10\uffff\1\u01b4",
			"\12\u02bd\10\uffff\1\u01b4",
			"\1\u01b7",
			"",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\12\100\7\uffff\22\100\1\u03a0\7\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u03aa",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03ac",
			"\1\u03ad",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03af",
			"\1\u03b0",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03b3",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03b6",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03b8",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03ba",
			"\1\u03bb",
			"\1\u03bc",
			"\1\u03bd",
			"\1\u03be",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03c2",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u03c4",
			"",
			"\1\u03c5",
			"\1\u03c7\2\uffff\1\u03c6",
			"",
			"\1\u03c8",
			"\1\u03c9",
			"\12\100\7\uffff\4\100\1\u03ca\25\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03cc",
			"\1\u03ce\1\uffff\1\u03cd",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03d0",
			"\1\u03d1",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"",
			"\1\u03dd",
			"",
			"\1\u03de",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\1\u03e2",
			"\1\u03e3",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"",
			"\1\u03e8",
			"",
			"",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\1\u03ec",
			"",
			"\1\u03ed",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u03ef",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u03f1",
			"\1\u03f2",
			"\12\100\7\uffff\17\100\1\u03f3\12\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u03f5",
			"",
			"\1\u03f6",
			"\1\u03f7",
			"",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\1\u0402",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\1\u0406",
			"\1\u0407",
			"\1\u0408",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u040a",
			"",
			"",
			"\1\u040b",
			"\1\u040c",
			"\1\u040d",
			"",
			"\12\100\7\uffff\10\100\1\u040e\21\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0411",
			"",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\1\u0416",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0419",
			"\1\u041a",
			"\12\100\7\uffff\23\100\1\u041b\6\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u041e",
			"",
			"\1\u041f",
			"\1\u0420",
			"\1\u0421",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0423",
			"\1\u0424",
			"\1\u0425",
			"\1\u0426",
			"\1\u0427",
			"\1\u0428",
			"\1\u0429",
			"\1\u042b\22\uffff\1\u042a",
			"\1\u042c",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u042f",
			"\1\u0430",
			"\1\u0431",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"",
			"\1\u043a",
			"",
			"\1\u043b",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u043e",
			"",
			"",
			"\1\u043f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0440",
			"\1\u0441",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u0442\25\100",
			"\1\u0443",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0444\7\100",
			"\1\u0446",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0447\7\100",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\3\100\1\u0450\26\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0452\2\uffff\1\u0453",
			"\1\u0454",
			"\1\u0455",
			"\1\u0456",
			"\1\u0457",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0458",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\12\100\7\uffff\1\u045c\31\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u045e",
			"\1\u045f",
			"\1\u0460",
			"\1\u0461",
			"\1\u0462",
			"\1\u0463",
			"",
			"\1\u0464",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0466",
			"",
			"\12\100\7\uffff\23\100\1\u0467\6\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0469",
			"",
			"",
			"\1\u046a",
			"",
			"",
			"\1\u046b",
			"",
			"\1\u046c",
			"",
			"\1\u046e\1\uffff\1\u046d",
			"\1\u046f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0471",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"\1\u0473",
			"",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u047a",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u047c",
			"\1\u047d",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0480",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0483",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487",
			"\1\u0488",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u048a",
			"\1\u048b",
			"\1\u048c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"\1\u0495",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0497",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0499",
			"\1\u049a",
			"",
			"\1\u049b",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u049d",
			"\1\u049e",
			"",
			"\1\u049f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04a2",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04a5",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04a7",
			"\12\100\7\uffff\22\100\1\u04a8\7\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04ab",
			"\1\u04ac",
			"\1\u04ad",
			"\12\100\7\uffff\22\100\1\u04ae\7\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\1\u04b3",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04b6",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04b8",
			"\1\u04b9",
			"",
			"",
			"\1\u04ba",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\22\100\1\u04bd\7\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04c0",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04c2",
			"\1\u04c3",
			"",
			"",
			"\1\u04c4",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04c6",
			"\1\u04c7",
			"",
			"\1\u04c8",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04ca",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04cc",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u04cf",
			"\1\u04d0",
			"\1\u04d1",
			"",
			"",
			"\1\u04d2",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04d4",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04d7",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04da\4\uffff\1\u04db",
			"\1\u04dc",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u04df",
			"\1\u04e0",
			"\1\u04e1",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u04e2\7\100",
			"\1\u04e3",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u04e4\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u04e5\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u04e6\7\100",
			"\1\u04e7",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u04e8\7\100",
			"\1\u04e9",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"\1\u04ed",
			"\1\u04ee",
			"",
			"\1\u04ef",
			"\1\u04f0",
			"\1\u04f1\2\uffff\1\u04f2",
			"\1\u04f3",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04fa",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u04fc",
			"\1\u04fd",
			"\1\u04fe",
			"\1\u04ff",
			"\1\u0500",
			"\1\u0501",
			"",
			"\1\u0502",
			"\1\u0503",
			"",
			"\1\u0504",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u050c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u050f",
			"\1\u0510",
			"\1\u0511",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0513",
			"\1\u0514",
			"",
			"",
			"\1\u0515",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0517",
			"\1\u0518",
			"\1\u0519",
			"\1\u051a",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u051c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u051e",
			"",
			"\1\u051f",
			"\1\u0520",
			"\1\u0521",
			"\1\u0522",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0524",
			"\1\u0525",
			"\1\u0526",
			"",
			"\1\u0527",
			"",
			"\1\u0528",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u052a",
			"",
			"\1\u052b",
			"\1\u052c",
			"\1\u052d",
			"",
			"",
			"\1\u052e",
			"",
			"",
			"\1\u052f",
			"",
			"\1\u0530",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u0532",
			"\1\u0533",
			"\1\u0534",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0536",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\4\100\1\u0539\15\100\1\u053a\7\100\4\uffff\1\100\1\uffff"+
			"\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u053e",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0542",
			"\1\u0543",
			"\1\u0544",
			"",
			"\1\u0545",
			"\1\u0546",
			"\1\u0547",
			"",
			"\1\u0548",
			"",
			"\1\u0549",
			"\1\u054a",
			"\1\u054b",
			"\1\u054c",
			"\1\u054d",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u0551",
			"",
			"",
			"\1\u0552",
			"\1\u0553",
			"\1\u0554",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u0556\7\100",
			"\1\u0557",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0558",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0559",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u055a\7\100",
			"\1\u055b",
			"\1\u055c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u055d\7\100",
			"\1\u055e",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0560",
			"\1\u0561",
			"\1\u0562",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0564",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0565",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0567",
			"",
			"\1\u0568",
			"",
			"\1\u0569",
			"\1\u056a",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u056c",
			"\1\u056d",
			"\12\100\7\uffff\22\100\1\u056e\7\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0570",
			"\1\u0571",
			"\1\u0572",
			"",
			"",
			"\1\u0573",
			"\1\u0574",
			"\1\u0575",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0578",
			"\1\u0579",
			"",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u057f",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0582",
			"\1\u0583",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0586",
			"",
			"\1\u0588\17\uffff\1\u0587",
			"\12\100\7\uffff\22\100\1\u0589\7\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u058c",
			"\1\u058d",
			"",
			"\1\u058e",
			"\1\u058f",
			"\1\u0590",
			"\1\u0591",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0593",
			"\1\u0594",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0597",
			"",
			"\1\u0598",
			"",
			"",
			"\1\u0599",
			"\1\u059a",
			"",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"\1\u059c",
			"\1\u059d",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u059f",
			"\1\u05a0",
			"\1\u05a1",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05a3",
			"\1\u05a4",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05a9",
			"\1\u05aa",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05ac\7\100",
			"\1\u05ad",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05ae\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05af\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05b0\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05b1\7\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05b2",
			"",
			"\1\u05b3",
			"\1\u05b4",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05b6",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05b8",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05ba",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u05bc",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05c0",
			"\1\u05c1",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05c3",
			"\1\u05c4",
			"\1\u05c5",
			"\1\u05c6",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05c9",
			"",
			"",
			"\1\u05ca",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05cc",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\1\u05ce",
			"\1\u05cf",
			"\1\u05d0",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"",
			"\1\u05d4",
			"\1\u05d5",
			"",
			"",
			"\1\u05d6",
			"\1\u05d7",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05d9",
			"",
			"\1\u05da",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05de",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u05e0",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\4\100\1\u05e3\15\100\1\u05e2\7\100\4\uffff\1\100\1\uffff"+
			"\32\100",
			"\1\u05e5",
			"",
			"\1\u05e6",
			"\1\u05e7",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05e8\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u05e9\7\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u05eb",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u05ed",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"\1\u05ef",
			"\1\u05f0",
			"",
			"\1\u05f1",
			"\1\u05f2",
			"\1\u05f3",
			"\1\u05f4",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u05f7",
			"",
			"\1\u05f8",
			"\1\u05f9",
			"\1\u05fa",
			"\1\u05fb",
			"\1\u05fc",
			"\1\u05fd",
			"\1\u05fe",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0600",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u0602",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"\1\u0604",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0607",
			"",
			"\1\u0608",
			"\1\u0609",
			"\1\u060a",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u060c",
			"",
			"\1\u060d",
			"\1\u060e",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0612",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0614",
			"\1\u0615",
			"\1\u0616",
			"\1\u0617",
			"\1\u0618",
			"\1\u0619",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"\1\u061c",
			"",
			"\1\u061d",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u0620",
			"\1\u0621",
			"",
			"\1\u0622",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"\1\u0625",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\1\u062a",
			"\1\u062b",
			"",
			"",
			"\1\u062c",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"",
			"\1\u0632",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			"",
			"",
			"",
			"",
			"",
			"\1\u0635",
			"",
			"",
			"\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
			""
	};

	static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
	static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
	static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
	static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
	static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
	static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
	static final short[][] DFA105_transition;

	static {
		int numStates = DFA105_transitionS.length;
		DFA105_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
		}
	}

	protected class DFA105 extends DFA {

		public DFA105(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 105;
			this.eot = DFA105_eot;
			this.eof = DFA105_eof;
			this.min = DFA105_min;
			this.max = DFA105_max;
			this.accept = DFA105_accept;
			this.special = DFA105_special;
			this.transition = DFA105_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_DAY | KW_HOUR | KW_MINUTE | KW_SECOND | KW_CONSTANT | KW_INTERVAL | KW_INCRE | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_INNER | KW_EXCHANGE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | TimeUnit | Identifier | CharSetName | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA105_207 = input.LA(1);
						s = -1;
						if ( (LA105_207=='\"') ) {s = 209;}
						else if ( ((LA105_207 >= '\u0000' && LA105_207 <= '!')||(LA105_207 >= '#' && LA105_207 <= '[')||(LA105_207 >= ']' && LA105_207 <= '\uFFFF')) ) {s = 207;}
						else if ( (LA105_207=='\\') ) {s = 208;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA105_429 = input.LA(1);
						s = -1;
						if ( (LA105_429=='\"') ) {s = 209;}
						else if ( ((LA105_429 >= '\u0000' && LA105_429 <= '!')||(LA105_429 >= '#' && LA105_429 <= '[')||(LA105_429 >= ']' && LA105_429 <= '\uFFFF')) ) {s = 207;}
						else if ( (LA105_429=='\\') ) {s = 208;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA105_61 = input.LA(1);
						s = -1;
						if ( ((LA105_61 >= '\u0000' && LA105_61 <= '!')||(LA105_61 >= '#' && LA105_61 <= '[')||(LA105_61 >= ']' && LA105_61 <= '\uFFFF')) ) {s = 207;}
						else if ( (LA105_61=='\\') ) {s = 208;}
						else if ( (LA105_61=='\"') ) {s = 209;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA105_60 = input.LA(1);
						s = -1;
						if ( ((LA105_60 >= '\u0000' && LA105_60 <= '&')||(LA105_60 >= '(' && LA105_60 <= '[')||(LA105_60 >= ']' && LA105_60 <= '\uFFFF')) ) {s = 204;}
						else if ( (LA105_60=='\\') ) {s = 205;}
						else if ( (LA105_60=='\'') ) {s = 206;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA105_427 = input.LA(1);
						s = -1;
						if ( (LA105_427=='\'') ) {s = 206;}
						else if ( ((LA105_427 >= '\u0000' && LA105_427 <= '&')||(LA105_427 >= '(' && LA105_427 <= '[')||(LA105_427 >= ']' && LA105_427 <= '\uFFFF')) ) {s = 204;}
						else if ( (LA105_427=='\\') ) {s = 205;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA105_204 = input.LA(1);
						s = -1;
						if ( (LA105_204=='\'') ) {s = 206;}
						else if ( ((LA105_204 >= '\u0000' && LA105_204 <= '&')||(LA105_204 >= '(' && LA105_204 <= '[')||(LA105_204 >= ']' && LA105_204 <= '\uFFFF')) ) {s = 204;}
						else if ( (LA105_204=='\\') ) {s = 205;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA105_205 = input.LA(1);
						s = -1;
						if ( ((LA105_205 >= '\u0000' && LA105_205 <= '\uFFFF')) ) {s = 427;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA105_208 = input.LA(1);
						s = -1;
						if ( ((LA105_208 >= '\u0000' && LA105_208 <= '\uFFFF')) ) {s = 429;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 105, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
