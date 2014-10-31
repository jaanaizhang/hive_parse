// $ANTLR 3.5.2 SelectClauseParser.g 2014-10-31 17:44:13

package parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
public class HiveParser_SelectClauseParser extends Parser {
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
	public static final int KW_INDEX=121;
	public static final int KW_INDEXES=122;
	public static final int KW_INNER=123;
	public static final int KW_INPATH=124;
	public static final int KW_INPUTDRIVER=125;
	public static final int KW_INPUTFORMAT=126;
	public static final int KW_INSERT=127;
	public static final int KW_INT=128;
	public static final int KW_INTERSECT=129;
	public static final int KW_INTO=130;
	public static final int KW_IS=131;
	public static final int KW_ITEMS=132;
	public static final int KW_JOIN=133;
	public static final int KW_KEYS=134;
	public static final int KW_KEY_TYPE=135;
	public static final int KW_LATERAL=136;
	public static final int KW_LEFT=137;
	public static final int KW_LESS=138;
	public static final int KW_LIKE=139;
	public static final int KW_LIMIT=140;
	public static final int KW_LINES=141;
	public static final int KW_LOAD=142;
	public static final int KW_LOCAL=143;
	public static final int KW_LOCATION=144;
	public static final int KW_LOCK=145;
	public static final int KW_LOCKS=146;
	public static final int KW_LOGICAL=147;
	public static final int KW_LONG=148;
	public static final int KW_MACRO=149;
	public static final int KW_MAP=150;
	public static final int KW_MAPJOIN=151;
	public static final int KW_MATERIALIZED=152;
	public static final int KW_MINUS=153;
	public static final int KW_MORE=154;
	public static final int KW_MSCK=155;
	public static final int KW_NOSCAN=156;
	public static final int KW_NOT=157;
	public static final int KW_NO_DROP=158;
	public static final int KW_NULL=159;
	public static final int KW_OF=160;
	public static final int KW_OFFLINE=161;
	public static final int KW_ON=162;
	public static final int KW_OPTION=163;
	public static final int KW_OR=164;
	public static final int KW_ORCFILE=165;
	public static final int KW_ORDER=166;
	public static final int KW_OUT=167;
	public static final int KW_OUTER=168;
	public static final int KW_OUTPUTDRIVER=169;
	public static final int KW_OUTPUTFORMAT=170;
	public static final int KW_OVER=171;
	public static final int KW_OVERWRITE=172;
	public static final int KW_PARTIALSCAN=173;
	public static final int KW_PARTITION=174;
	public static final int KW_PARTITIONED=175;
	public static final int KW_PARTITIONS=176;
	public static final int KW_PERCENT=177;
	public static final int KW_PLUS=178;
	public static final int KW_PRECEDING=179;
	public static final int KW_PRESERVE=180;
	public static final int KW_PRETTY=181;
	public static final int KW_PROCEDURE=182;
	public static final int KW_PROTECTION=183;
	public static final int KW_PURGE=184;
	public static final int KW_RANGE=185;
	public static final int KW_RCFILE=186;
	public static final int KW_READ=187;
	public static final int KW_READONLY=188;
	public static final int KW_READS=189;
	public static final int KW_REBUILD=190;
	public static final int KW_RECORDREADER=191;
	public static final int KW_RECORDWRITER=192;
	public static final int KW_REDUCE=193;
	public static final int KW_REGEXP=194;
	public static final int KW_RENAME=195;
	public static final int KW_REPAIR=196;
	public static final int KW_REPLACE=197;
	public static final int KW_RESTRICT=198;
	public static final int KW_REVOKE=199;
	public static final int KW_RIGHT=200;
	public static final int KW_RLIKE=201;
	public static final int KW_ROLE=202;
	public static final int KW_ROLLUP=203;
	public static final int KW_ROW=204;
	public static final int KW_ROWS=205;
	public static final int KW_SCHEMA=206;
	public static final int KW_SCHEMAS=207;
	public static final int KW_SELECT=208;
	public static final int KW_SEMI=209;
	public static final int KW_SEQUENCEFILE=210;
	public static final int KW_SERDE=211;
	public static final int KW_SERDEPROPERTIES=212;
	public static final int KW_SET=213;
	public static final int KW_SETS=214;
	public static final int KW_SHARED=215;
	public static final int KW_SHOW=216;
	public static final int KW_SHOW_DATABASE=217;
	public static final int KW_SKEWED=218;
	public static final int KW_SMALLINT=219;
	public static final int KW_SORT=220;
	public static final int KW_SORTED=221;
	public static final int KW_SSL=222;
	public static final int KW_STATISTICS=223;
	public static final int KW_STORED=224;
	public static final int KW_STREAMTABLE=225;
	public static final int KW_STRING=226;
	public static final int KW_STRUCT=227;
	public static final int KW_TABLE=228;
	public static final int KW_TABLES=229;
	public static final int KW_TABLESAMPLE=230;
	public static final int KW_TBLPROPERTIES=231;
	public static final int KW_TEMPORARY=232;
	public static final int KW_TERMINATED=233;
	public static final int KW_TEXTFILE=234;
	public static final int KW_THEN=235;
	public static final int KW_TIMESTAMP=236;
	public static final int KW_TINYINT=237;
	public static final int KW_TO=238;
	public static final int KW_TOUCH=239;
	public static final int KW_TRANSFORM=240;
	public static final int KW_TRIGGER=241;
	public static final int KW_TRUE=242;
	public static final int KW_TRUNCATE=243;
	public static final int KW_UNARCHIVE=244;
	public static final int KW_UNBOUNDED=245;
	public static final int KW_UNDO=246;
	public static final int KW_UNION=247;
	public static final int KW_UNIONTYPE=248;
	public static final int KW_UNIQUEJOIN=249;
	public static final int KW_UNLOCK=250;
	public static final int KW_UNSET=251;
	public static final int KW_UNSIGNED=252;
	public static final int KW_UPDATE=253;
	public static final int KW_USE=254;
	public static final int KW_USER=255;
	public static final int KW_USING=256;
	public static final int KW_UTC=257;
	public static final int KW_UTCTIMESTAMP=258;
	public static final int KW_VALUE_TYPE=259;
	public static final int KW_VARCHAR=260;
	public static final int KW_VIEW=261;
	public static final int KW_WHEN=262;
	public static final int KW_WHERE=263;
	public static final int KW_WHILE=264;
	public static final int KW_WINDOW=265;
	public static final int KW_WITH=266;
	public static final int LCURLY=267;
	public static final int LESSTHAN=268;
	public static final int LESSTHANOREQUALTO=269;
	public static final int LPAREN=270;
	public static final int LSQUARE=271;
	public static final int Letter=272;
	public static final int MINUS=273;
	public static final int MOD=274;
	public static final int NOTEQUAL=275;
	public static final int Number=276;
	public static final int PLUS=277;
	public static final int QUESTION=278;
	public static final int RCURLY=279;
	public static final int RPAREN=280;
	public static final int RSQUARE=281;
	public static final int RegexComponent=282;
	public static final int SEMICOLON=283;
	public static final int STAR=284;
	public static final int SmallintLiteral=285;
	public static final int StringLiteral=286;
	public static final int TILDE=287;
	public static final int TinyintLiteral=288;
	public static final int WS=289;
	public static final int TOK_ALIASLIST=552;
	public static final int TOK_ALLCOLREF=553;
	public static final int TOK_ALTERDATABASE_PROPERTIES=554;
	public static final int TOK_ALTERINDEX_PROPERTIES=555;
	public static final int TOK_ALTERINDEX_REBUILD=556;
	public static final int TOK_ALTERTABLE_ADDCOLS=557;
	public static final int TOK_ALTERTABLE_ADDPARTS=558;
	public static final int TOK_ALTERTABLE_ALTERPARTS=559;
	public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=560;
	public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=561;
	public static final int TOK_ALTERTABLE_ARCHIVE=562;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=563;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=564;
	public static final int TOK_ALTERTABLE_DROPPARTS=565;
	public static final int TOK_ALTERTABLE_FILEFORMAT=566;
	public static final int TOK_ALTERTABLE_LOCATION=567;
	public static final int TOK_ALTERTABLE_PARTITION=568;
	public static final int TOK_ALTERTABLE_PROPERTIES=569;
	public static final int TOK_ALTERTABLE_RENAME=570;
	public static final int TOK_ALTERTABLE_RENAMECOL=571;
	public static final int TOK_ALTERTABLE_RENAMEPART=572;
	public static final int TOK_ALTERTABLE_REPLACECOLS=573;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=574;
	public static final int TOK_ALTERTABLE_SERIALIZER=575;
	public static final int TOK_ALTERTABLE_SKEWED=576;
	public static final int TOK_ALTERTABLE_TOUCH=577;
	public static final int TOK_ALTERTABLE_UNARCHIVE=578;
	public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=579;
	public static final int TOK_ALTERVIEW_ADDPARTS=580;
	public static final int TOK_ALTERVIEW_AS=581;
	public static final int TOK_ALTERVIEW_DROPPARTS=582;
	public static final int TOK_ALTERVIEW_PROPERTIES=583;
	public static final int TOK_ALTERVIEW_RENAME=584;
	public static final int TOK_ANALYZE=585;
	public static final int TOK_BIGINT=586;
	public static final int TOK_BINARY=587;
	public static final int TOK_BOOLEAN=588;
	public static final int TOK_CASCADE=589;
	public static final int TOK_CHARSETLITERAL=590;
	public static final int TOK_CLUSTERBY=591;
	public static final int TOK_COLTYPELIST=592;
	public static final int TOK_CREATEDATABASE=593;
	public static final int TOK_CREATEFUNCTION=594;
	public static final int TOK_CREATEINDEX=595;
	public static final int TOK_CREATEINDEX_INDEXTBLNAME=596;
	public static final int TOK_CREATEMACRO=597;
	public static final int TOK_CREATEROLE=598;
	public static final int TOK_CREATETABLE=599;
	public static final int TOK_CREATEVIEW=600;
	public static final int TOK_CROSSJOIN=601;
	public static final int TOK_CUBE_GROUPBY=602;
	public static final int TOK_DATABASECOMMENT=603;
	public static final int TOK_DATABASELOCATION=604;
	public static final int TOK_DATABASEPROPERTIES=605;
	public static final int TOK_DATE=606;
	public static final int TOK_DATELITERAL=607;
	public static final int TOK_DATETIME=608;
	public static final int TOK_DBPROPLIST=609;
	public static final int TOK_DECIMAL=610;
	public static final int TOK_DEFERRED_REBUILDINDEX=611;
	public static final int TOK_DESCDATABASE=612;
	public static final int TOK_DESCFUNCTION=613;
	public static final int TOK_DESCTABLE=614;
	public static final int TOK_DESTINATION=615;
	public static final int TOK_DIR=616;
	public static final int TOK_DISABLE=617;
	public static final int TOK_DISTRIBUTEBY=618;
	public static final int TOK_DOUBLE=619;
	public static final int TOK_DROPDATABASE=620;
	public static final int TOK_DROPFUNCTION=621;
	public static final int TOK_DROPINDEX=622;
	public static final int TOK_DROPMACRO=623;
	public static final int TOK_DROPROLE=624;
	public static final int TOK_DROPTABLE=625;
	public static final int TOK_DROPTABLE_PROPERTIES=626;
	public static final int TOK_DROPVIEW=627;
	public static final int TOK_DROPVIEW_PROPERTIES=628;
	public static final int TOK_ENABLE=629;
	public static final int TOK_EXCHANGEPARTITION=630;
	public static final int TOK_EXPLAIN=631;
	public static final int TOK_EXPLIST=632;
	public static final int TOK_EXPORT=633;
	public static final int TOK_FALSE=634;
	public static final int TOK_FILEFORMAT_GENERIC=635;
	public static final int TOK_FLOAT=636;
	public static final int TOK_FROM=637;
	public static final int TOK_FULLOUTERJOIN=638;
	public static final int TOK_FUNCTION=639;
	public static final int TOK_FUNCTIONDI=640;
	public static final int TOK_FUNCTIONSTAR=641;
	public static final int TOK_GRANT=642;
	public static final int TOK_GRANT_ROLE=643;
	public static final int TOK_GRANT_WITH_OPTION=644;
	public static final int TOK_GROUP=645;
	public static final int TOK_GROUPBY=646;
	public static final int TOK_GROUPING_SETS=647;
	public static final int TOK_GROUPING_SETS_EXPRESSION=648;
	public static final int TOK_HAVING=649;
	public static final int TOK_HINT=650;
	public static final int TOK_HINTARGLIST=651;
	public static final int TOK_HINTLIST=652;
	public static final int TOK_HOLD_DDLTIME=653;
	public static final int TOK_IFEXISTS=654;
	public static final int TOK_IFNOTEXISTS=655;
	public static final int TOK_IGNOREPROTECTION=656;
	public static final int TOK_IMPORT=657;
	public static final int TOK_INDEXCOMMENT=658;
	public static final int TOK_INDEXPROPERTIES=659;
	public static final int TOK_INDEXPROPLIST=660;
	public static final int TOK_INSERT=661;
	public static final int TOK_INSERT_INTO=662;
	public static final int TOK_INT=663;
	public static final int TOK_ISNOTNULL=664;
	public static final int TOK_ISNULL=665;
	public static final int TOK_JOIN=666;
	public static final int TOK_LATERAL_VIEW=667;
	public static final int TOK_LATERAL_VIEW_OUTER=668;
	public static final int TOK_LEFTOUTERJOIN=669;
	public static final int TOK_LEFTSEMIJOIN=670;
	public static final int TOK_LENGTH=671;
	public static final int TOK_LIKETABLE=672;
	public static final int TOK_LIMIT=673;
	public static final int TOK_LIST=674;
	public static final int TOK_LOAD=675;
	public static final int TOK_LOCAL_DIR=676;
	public static final int TOK_LOCKTABLE=677;
	public static final int TOK_MAP=678;
	public static final int TOK_MAPJOIN=679;
	public static final int TOK_MSCK=680;
	public static final int TOK_NOT_CLUSTERED=681;
	public static final int TOK_NOT_SORTED=682;
	public static final int TOK_NO_DROP=683;
	public static final int TOK_NULL=684;
	public static final int TOK_OFFLINE=685;
	public static final int TOK_OP_ADD=686;
	public static final int TOK_OP_AND=687;
	public static final int TOK_OP_BITAND=688;
	public static final int TOK_OP_BITNOT=689;
	public static final int TOK_OP_BITOR=690;
	public static final int TOK_OP_BITXOR=691;
	public static final int TOK_OP_DIV=692;
	public static final int TOK_OP_EQ=693;
	public static final int TOK_OP_GE=694;
	public static final int TOK_OP_GT=695;
	public static final int TOK_OP_LE=696;
	public static final int TOK_OP_LIKE=697;
	public static final int TOK_OP_LT=698;
	public static final int TOK_OP_MOD=699;
	public static final int TOK_OP_MUL=700;
	public static final int TOK_OP_NE=701;
	public static final int TOK_OP_NOT=702;
	public static final int TOK_OP_OR=703;
	public static final int TOK_OP_SUB=704;
	public static final int TOK_ORDERBY=705;
	public static final int TOK_ORREPLACE=706;
	public static final int TOK_PARTITIONINGSPEC=707;
	public static final int TOK_PARTITIONLOCATION=708;
	public static final int TOK_PARTSPEC=709;
	public static final int TOK_PARTVAL=710;
	public static final int TOK_PERCENT=711;
	public static final int TOK_PRINCIPAL_NAME=712;
	public static final int TOK_PRIVILEGE=713;
	public static final int TOK_PRIVILEGE_LIST=714;
	public static final int TOK_PRIV_ALL=715;
	public static final int TOK_PRIV_ALTER_DATA=716;
	public static final int TOK_PRIV_ALTER_METADATA=717;
	public static final int TOK_PRIV_CREATE=718;
	public static final int TOK_PRIV_DROP=719;
	public static final int TOK_PRIV_INDEX=720;
	public static final int TOK_PRIV_LOCK=721;
	public static final int TOK_PRIV_OBJECT=722;
	public static final int TOK_PRIV_OBJECT_COL=723;
	public static final int TOK_PRIV_SELECT=724;
	public static final int TOK_PRIV_SHOW_DATABASE=725;
	public static final int TOK_PTBLFUNCTION=726;
	public static final int TOK_QUERY=727;
	public static final int TOK_READONLY=728;
	public static final int TOK_RECORDREADER=729;
	public static final int TOK_RECORDWRITER=730;
	public static final int TOK_RESTRICT=731;
	public static final int TOK_REVOKE=732;
	public static final int TOK_REVOKE_ROLE=733;
	public static final int TOK_RIGHTOUTERJOIN=734;
	public static final int TOK_ROLE=735;
	public static final int TOK_ROLLUP_GROUPBY=736;
	public static final int TOK_ROWCOUNT=737;
	public static final int TOK_SELECT=738;
	public static final int TOK_SELECTDI=739;
	public static final int TOK_SELEXPR=740;
	public static final int TOK_SERDE=741;
	public static final int TOK_SERDENAME=742;
	public static final int TOK_SERDEPROPS=743;
	public static final int TOK_SHOWCOLUMNS=744;
	public static final int TOK_SHOWDATABASES=745;
	public static final int TOK_SHOWFUNCTIONS=746;
	public static final int TOK_SHOWINDEXES=747;
	public static final int TOK_SHOWLOCKS=748;
	public static final int TOK_SHOWPARTITIONS=749;
	public static final int TOK_SHOWTABLES=750;
	public static final int TOK_SHOW_CREATETABLE=751;
	public static final int TOK_SHOW_GRANT=752;
	public static final int TOK_SHOW_ROLE_GRANT=753;
	public static final int TOK_SHOW_TABLESTATUS=754;
	public static final int TOK_SHOW_TBLPROPERTIES=755;
	public static final int TOK_SKEWED_LOCATIONS=756;
	public static final int TOK_SKEWED_LOCATION_LIST=757;
	public static final int TOK_SKEWED_LOCATION_MAP=758;
	public static final int TOK_SMALLINT=759;
	public static final int TOK_SORTBY=760;
	public static final int TOK_STORAGEHANDLER=761;
	public static final int TOK_STOREDASDIRS=762;
	public static final int TOK_STREAMTABLE=763;
	public static final int TOK_STRING=764;
	public static final int TOK_STRINGLITERALSEQUENCE=765;
	public static final int TOK_STRUCT=766;
	public static final int TOK_SUBQUERY=767;
	public static final int TOK_SWITCHDATABASE=768;
	public static final int TOK_TAB=769;
	public static final int TOK_TABALIAS=770;
	public static final int TOK_TABCOL=771;
	public static final int TOK_TABCOLLIST=772;
	public static final int TOK_TABCOLNAME=773;
	public static final int TOK_TABCOLVALUE=774;
	public static final int TOK_TABCOLVALUES=775;
	public static final int TOK_TABCOLVALUE_PAIR=776;
	public static final int TOK_TABLEBUCKETS=777;
	public static final int TOK_TABLEBUCKETSAMPLE=778;
	public static final int TOK_TABLECOMMENT=779;
	public static final int TOK_TABLEFILEFORMAT=780;
	public static final int TOK_TABLELOCATION=781;
	public static final int TOK_TABLEPARTCOLS=782;
	public static final int TOK_TABLEPROPERTIES=783;
	public static final int TOK_TABLEPROPERTY=784;
	public static final int TOK_TABLEPROPLIST=785;
	public static final int TOK_TABLEROWFORMAT=786;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=787;
	public static final int TOK_TABLEROWFORMATFIELD=788;
	public static final int TOK_TABLEROWFORMATLINES=789;
	public static final int TOK_TABLEROWFORMATMAPKEYS=790;
	public static final int TOK_TABLESERIALIZER=791;
	public static final int TOK_TABLESKEWED=792;
	public static final int TOK_TABLESPLITSAMPLE=793;
	public static final int TOK_TABLE_OR_COL=794;
	public static final int TOK_TABLE_PARTITION=795;
	public static final int TOK_TABNAME=796;
	public static final int TOK_TABREF=797;
	public static final int TOK_TABSORTCOLNAMEASC=798;
	public static final int TOK_TABSORTCOLNAMEDESC=799;
	public static final int TOK_TABSRC=800;
	public static final int TOK_TABTYPE=801;
	public static final int TOK_TBLORCFILE=802;
	public static final int TOK_TBLRCFILE=803;
	public static final int TOK_TBLSEQUENCEFILE=804;
	public static final int TOK_TBLTEXTFILE=805;
	public static final int TOK_TIMESTAMP=806;
	public static final int TOK_TINYINT=807;
	public static final int TOK_TMP_FILE=808;
	public static final int TOK_TRANSFORM=809;
	public static final int TOK_TRUE=810;
	public static final int TOK_TRUNCATETABLE=811;
	public static final int TOK_UNION=812;
	public static final int TOK_UNIONTYPE=813;
	public static final int TOK_UNIQUEJOIN=814;
	public static final int TOK_UNLOCKTABLE=815;
	public static final int TOK_USER=816;
	public static final int TOK_USERSCRIPTCOLNAMES=817;
	public static final int TOK_USERSCRIPTCOLSCHEMA=818;
	public static final int TOK_VARCHAR=819;
	public static final int TOK_VIEWPARTCOLS=820;
	public static final int TOK_WHERE=821;
	public static final int TOK_WINDOWDEF=822;
	public static final int TOK_WINDOWRANGE=823;
	public static final int TOK_WINDOWSPEC=824;
	public static final int TOK_WINDOWVALUES=825;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_SelectClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_SelectClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
		super(input, state);
		this.gHiveParser = gHiveParser;
		gParent = gHiveParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HiveParser.tokenNames; }
	@Override public String getGrammarFileName() { return "SelectClauseParser.g"; }


	  @Override
	  public Object recoverFromMismatchedSet(IntStream input,
	      RecognitionException re, BitSet follow) throws RecognitionException {
	    throw re;
	  }
	  @Override
	  public void displayRecognitionError(String[] tokenNames,
	      RecognitionException e) {
	    gParent.errors.add(new ParseError(gParent, e, tokenNames));
	  }


	public static class selectClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectClause"
	// SelectClauseParser.g:48:1: selectClause : ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
	public final HiveParser_SelectClauseParser.selectClause_return selectClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectClause_return retval = new HiveParser_SelectClauseParser.selectClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token dist=null;
		Token transform=null;
		Token KW_SELECT1=null;
		Token KW_ALL3=null;
		ParserRuleReturnScope hintClause2 =null;
		ParserRuleReturnScope selectList4 =null;
		ParserRuleReturnScope selectTrfmClause5 =null;
		ParserRuleReturnScope trfmClause6 =null;

		CommonTree dist_tree=null;
		CommonTree transform_tree=null;
		CommonTree KW_SELECT1_tree=null;
		CommonTree KW_ALL3_tree=null;
		RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
		RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
		RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
		RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
		RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
		RewriteRuleSubtreeStream stream_hintClause=new RewriteRuleSubtreeStream(adaptor,"rule hintClause");
		RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
		RewriteRuleSubtreeStream stream_selectTrfmClause=new RewriteRuleSubtreeStream(adaptor,"rule selectTrfmClause");

		 gParent.msgs.push("select clause"); 
		try {
			// SelectClauseParser.g:51:5: ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==KW_SELECT) ) {
				alt4=1;
			}
			else if ( (LA4_0==KW_MAP||LA4_0==KW_REDUCE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// SelectClauseParser.g:52:5: KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					{
					KW_SELECT1=(Token)match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause71);  
					stream_KW_SELECT.add(KW_SELECT1);

					// SelectClauseParser.g:52:15: ( hintClause )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DIVIDE) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// SelectClauseParser.g:52:15: hintClause
							{
							pushFollow(FOLLOW_hintClause_in_selectClause73);
							hintClause2=hintClause();
							state._fsp--;

							stream_hintClause.add(hintClause2.getTree());
							}
							break;

					}

					// SelectClauseParser.g:52:27: ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==BigintLiteral||LA3_0==CharSetName||LA3_0==DecimalLiteral||(LA3_0 >= Identifier && LA3_0 <= KW_ANALYZE)||(LA3_0 >= KW_ARCHIVE && LA3_0 <= KW_COLLECTION)||(LA3_0 >= KW_COLUMNS && LA3_0 <= KW_CREATE)||LA3_0==KW_CUBE||(LA3_0 >= KW_CURSOR && LA3_0 <= KW_DATA)||(LA3_0 >= KW_DATABASES && LA3_0 <= KW_ELEM_TYPE)||LA3_0==KW_ENABLE||LA3_0==KW_ESCAPED||(LA3_0 >= KW_EXCLUSIVE && LA3_0 <= KW_EXPORT)||(LA3_0 >= KW_EXTERNAL && LA3_0 <= KW_FLOAT)||(LA3_0 >= KW_FOR && LA3_0 <= KW_FORMATTED)||LA3_0==KW_FULL||(LA3_0 >= KW_FUNCTIONS && LA3_0 <= KW_GROUPING)||(LA3_0 >= KW_HOLD_DDLTIME && LA3_0 <= KW_ITEMS)||(LA3_0 >= KW_KEYS && LA3_0 <= KW_LEFT)||(LA3_0 >= KW_LIKE && LA3_0 <= KW_LONG)||(LA3_0 >= KW_MAP && LA3_0 <= KW_MINUS)||(LA3_0 >= KW_MSCK && LA3_0 <= KW_OFFLINE)||LA3_0==KW_OPTION||(LA3_0 >= KW_ORCFILE && LA3_0 <= KW_OUTPUTFORMAT)||LA3_0==KW_OVERWRITE||(LA3_0 >= KW_PARTITION && LA3_0 <= KW_PLUS)||(LA3_0 >= KW_PRETTY && LA3_0 <= KW_RECORDWRITER)||(LA3_0 >= KW_REGEXP && LA3_0 <= KW_SCHEMAS)||(LA3_0 >= KW_SEMI && LA3_0 <= KW_TABLES)||(LA3_0 >= KW_TBLPROPERTIES && LA3_0 <= KW_TEXTFILE)||(LA3_0 >= KW_TIMESTAMP && LA3_0 <= KW_TOUCH)||(LA3_0 >= KW_TRIGGER && LA3_0 <= KW_UNARCHIVE)||(LA3_0 >= KW_UNDO && LA3_0 <= KW_UNIONTYPE)||(LA3_0 >= KW_UNLOCK && LA3_0 <= KW_VALUE_TYPE)||LA3_0==KW_VIEW||LA3_0==KW_WHILE||LA3_0==KW_WITH||LA3_0==LPAREN||LA3_0==MINUS||(LA3_0 >= Number && LA3_0 <= PLUS)||(LA3_0 >= STAR && LA3_0 <= TinyintLiteral)) ) {
						alt3=1;
					}
					else if ( (LA3_0==KW_TRANSFORM) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// SelectClauseParser.g:52:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							{
							// SelectClauseParser.g:52:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							// SelectClauseParser.g:52:29: ( KW_ALL |dist= KW_DISTINCT )? selectList
							{
							// SelectClauseParser.g:52:29: ( KW_ALL |dist= KW_DISTINCT )?
							int alt2=3;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==KW_ALL) ) {
								alt2=1;
							}
							else if ( (LA2_0==KW_DISTINCT) ) {
								alt2=2;
							}
							switch (alt2) {
								case 1 :
									// SelectClauseParser.g:52:30: KW_ALL
									{
									KW_ALL3=(Token)match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause79);  
									stream_KW_ALL.add(KW_ALL3);

									}
									break;
								case 2 :
									// SelectClauseParser.g:52:39: dist= KW_DISTINCT
									{
									dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause85);  
									stream_KW_DISTINCT.add(dist);

									}
									break;

							}

							pushFollow(FOLLOW_selectList_in_selectClause89);
							selectList4=selectList();
							state._fsp--;

							stream_selectList.add(selectList4.getTree());
							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:53:29: (transform= KW_TRANSFORM selectTrfmClause )
							{
							// SelectClauseParser.g:53:29: (transform= KW_TRANSFORM selectTrfmClause )
							// SelectClauseParser.g:53:30: transform= KW_TRANSFORM selectTrfmClause
							{
							transform=(Token)match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_selectClause123);  
							stream_KW_TRANSFORM.add(transform);

							pushFollow(FOLLOW_selectTrfmClause_in_selectClause125);
							selectTrfmClause5=selectTrfmClause();
							state._fsp--;

							stream_selectTrfmClause.add(selectTrfmClause5.getTree());
							}

							}
							break;

					}

					// AST REWRITE
					// elements: hintClause, hintClause, hintClause, selectList, selectTrfmClause, selectList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 54:6: -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList )
					if (transform == null && dist == null) {
						// SelectClauseParser.g:54:48: ^( TOK_SELECT ( hintClause )? selectList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:54:61: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 55:6: -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList )
					if (transform == null && dist != null) {
						// SelectClauseParser.g:55:48: ^( TOK_SELECTDI ( hintClause )? selectList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECTDI, "TOK_SELECTDI"), root_1);
						// SelectClauseParser.g:55:63: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 56:6: -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
					{
						// SelectClauseParser.g:56:9: ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:56:22: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						// SelectClauseParser.g:56:34: ^( TOK_SELEXPR selectTrfmClause )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_selectTrfmClause.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:58:5: trfmClause
					{
					pushFollow(FOLLOW_trfmClause_in_selectClause196);
					trfmClause6=trfmClause();
					state._fsp--;

					stream_trfmClause.add(trfmClause6.getTree());
					// AST REWRITE
					// elements: trfmClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 58:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
					{
						// SelectClauseParser.g:58:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:58:32: ^( TOK_SELEXPR trfmClause )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_trfmClause.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectClause"


	public static class selectList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectList"
	// SelectClauseParser.g:61:1: selectList : selectItem ( COMMA selectItem )* -> ( selectItem )+ ;
	public final HiveParser_SelectClauseParser.selectList_return selectList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectList_return retval = new HiveParser_SelectClauseParser.selectList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA8=null;
		ParserRuleReturnScope selectItem7 =null;
		ParserRuleReturnScope selectItem9 =null;

		CommonTree COMMA8_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");

		 gParent.msgs.push("select list"); 
		try {
			// SelectClauseParser.g:64:5: ( selectItem ( COMMA selectItem )* -> ( selectItem )+ )
			// SelectClauseParser.g:65:5: selectItem ( COMMA selectItem )*
			{
			pushFollow(FOLLOW_selectItem_in_selectList239);
			selectItem7=selectItem();
			state._fsp--;

			stream_selectItem.add(selectItem7.getTree());
			// SelectClauseParser.g:65:16: ( COMMA selectItem )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// SelectClauseParser.g:65:18: COMMA selectItem
					{
					COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectList243);  
					stream_COMMA.add(COMMA8);

					pushFollow(FOLLOW_selectItem_in_selectList246);
					selectItem9=selectItem();
					state._fsp--;

					stream_selectItem.add(selectItem9.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: selectItem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 65:39: -> ( selectItem )+
			{
				if ( !(stream_selectItem.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectItem.hasNext() ) {
					adaptor.addChild(root_0, stream_selectItem.nextTree());
				}
				stream_selectItem.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectList"


	public static class selectTrfmClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectTrfmClause"
	// SelectClauseParser.g:68:1: selectTrfmClause : LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectTrfmClause_return retval = new HiveParser_SelectClauseParser.selectTrfmClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN10=null;
		Token RPAREN12=null;
		Token KW_USING13=null;
		Token StringLiteral14=null;
		Token KW_AS15=null;
		Token LPAREN16=null;
		Token RPAREN19=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList11 =null;
		ParserRuleReturnScope aliasList17 =null;
		ParserRuleReturnScope columnNameTypeList18 =null;
		ParserRuleReturnScope aliasList20 =null;
		ParserRuleReturnScope columnNameTypeList21 =null;

		CommonTree LPAREN10_tree=null;
		CommonTree RPAREN12_tree=null;
		CommonTree KW_USING13_tree=null;
		CommonTree StringLiteral14_tree=null;
		CommonTree KW_AS15_tree=null;
		CommonTree LPAREN16_tree=null;
		CommonTree RPAREN19_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.msgs.push("transform clause"); 
		try {
			// SelectClauseParser.g:71:5: ( LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:72:5: LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause285);  
			stream_LPAREN.add(LPAREN10);

			pushFollow(FOLLOW_selectExpressionList_in_selectTrfmClause287);
			selectExpressionList11=selectExpressionList();
			state._fsp--;

			stream_selectExpressionList.add(selectExpressionList11.getTree());
			RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause289);  
			stream_RPAREN.add(RPAREN12);

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause297);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_selectTrfmClause301);
			inRec=gHiveParser.recordWriter();
			state._fsp--;

			stream_recordWriter.add(inRec.getTree());
			KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_selectTrfmClause307);  
			stream_KW_USING.add(KW_USING13);

			StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_selectTrfmClause309);  
			stream_StringLiteral.add(StringLiteral14);

			// SelectClauseParser.g:75:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KW_AS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// SelectClauseParser.g:75:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS15=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectTrfmClause317);  
					stream_KW_AS.add(KW_AS15);

					// SelectClauseParser.g:75:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LPAREN) ) {
						alt8=1;
					}
					else if ( ((LA8_0 >= Identifier && LA8_0 <= KW_AFTER)||(LA8_0 >= KW_ALTER && LA8_0 <= KW_ANALYZE)||(LA8_0 >= KW_ARCHIVE && LA8_0 <= KW_CASCADE)||(LA8_0 >= KW_CHANGE && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_CREATE)||LA8_0==KW_CUBE||(LA8_0 >= KW_CURSOR && LA8_0 <= KW_DATA)||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||LA8_0==KW_ESCAPED||(LA8_0 >= KW_EXCLUSIVE && LA8_0 <= KW_EXPORT)||(LA8_0 >= KW_EXTERNAL && LA8_0 <= KW_FLOAT)||(LA8_0 >= KW_FOR && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FULL||(LA8_0 >= KW_FUNCTIONS && LA8_0 <= KW_GROUPING)||(LA8_0 >= KW_HOLD_DDLTIME && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_IGNORE && LA8_0 <= KW_ITEMS)||(LA8_0 >= KW_KEYS && LA8_0 <= KW_LEFT)||(LA8_0 >= KW_LIKE && LA8_0 <= KW_LONG)||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MINUS)||(LA8_0 >= KW_MSCK && LA8_0 <= KW_NOSCAN)||(LA8_0 >= KW_NO_DROP && LA8_0 <= KW_OFFLINE)||LA8_0==KW_OPTION||(LA8_0 >= KW_ORCFILE && LA8_0 <= KW_OUTPUTFORMAT)||LA8_0==KW_OVERWRITE||(LA8_0 >= KW_PARTITION && LA8_0 <= KW_PLUS)||(LA8_0 >= KW_PRETTY && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_REGEXP && LA8_0 <= KW_SCHEMAS)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_TABLES)||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TEXTFILE)||(LA8_0 >= KW_TIMESTAMP && LA8_0 <= KW_TOUCH)||(LA8_0 >= KW_TRIGGER && LA8_0 <= KW_UNARCHIVE)||(LA8_0 >= KW_UNDO && LA8_0 <= KW_UNIONTYPE)||(LA8_0 >= KW_UNLOCK && LA8_0 <= KW_VALUE_TYPE)||LA8_0==KW_VIEW||LA8_0==KW_WHILE||LA8_0==KW_WITH) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// SelectClauseParser.g:75:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:75:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:75:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause321);  
							stream_LPAREN.add(LPAREN16);

							// SelectClauseParser.g:75:22: ( aliasList | columnNameTypeList )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==Identifier) ) {
								int LA6_1 = input.LA(2);
								if ( (LA6_1==COMMA||LA6_1==RPAREN) ) {
									alt6=1;
								}
								else if ( (LA6_1==KW_ARRAY||(LA6_1 >= KW_BIGINT && LA6_1 <= KW_BOOLEAN)||(LA6_1 >= KW_DATE && LA6_1 <= KW_DATETIME)||LA6_1==KW_DECIMAL||LA6_1==KW_DOUBLE||LA6_1==KW_FLOAT||LA6_1==KW_INT||LA6_1==KW_MAP||LA6_1==KW_SMALLINT||(LA6_1 >= KW_STRING && LA6_1 <= KW_STRUCT)||(LA6_1 >= KW_TIMESTAMP && LA6_1 <= KW_TINYINT)||LA6_1==KW_UNIONTYPE||LA6_1==KW_VARCHAR) ) {
									alt6=2;
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
							else if ( ((LA6_0 >= KW_ADD && LA6_0 <= KW_AFTER)||(LA6_0 >= KW_ALTER && LA6_0 <= KW_ANALYZE)||(LA6_0 >= KW_ARCHIVE && LA6_0 <= KW_CASCADE)||(LA6_0 >= KW_CHANGE && LA6_0 <= KW_COLLECTION)||(LA6_0 >= KW_COLUMNS && LA6_0 <= KW_CREATE)||LA6_0==KW_CUBE||(LA6_0 >= KW_CURSOR && LA6_0 <= KW_DATA)||(LA6_0 >= KW_DATABASES && LA6_0 <= KW_DISABLE)||(LA6_0 >= KW_DISTRIBUTE && LA6_0 <= KW_ELEM_TYPE)||LA6_0==KW_ENABLE||LA6_0==KW_ESCAPED||(LA6_0 >= KW_EXCLUSIVE && LA6_0 <= KW_EXPORT)||(LA6_0 >= KW_EXTERNAL && LA6_0 <= KW_FLOAT)||(LA6_0 >= KW_FOR && LA6_0 <= KW_FORMATTED)||LA6_0==KW_FULL||(LA6_0 >= KW_FUNCTIONS && LA6_0 <= KW_GROUPING)||(LA6_0 >= KW_HOLD_DDLTIME && LA6_0 <= KW_IDXPROPERTIES)||(LA6_0 >= KW_IGNORE && LA6_0 <= KW_ITEMS)||(LA6_0 >= KW_KEYS && LA6_0 <= KW_LEFT)||(LA6_0 >= KW_LIKE && LA6_0 <= KW_LONG)||(LA6_0 >= KW_MAPJOIN && LA6_0 <= KW_MINUS)||(LA6_0 >= KW_MSCK && LA6_0 <= KW_NOSCAN)||(LA6_0 >= KW_NO_DROP && LA6_0 <= KW_OFFLINE)||LA6_0==KW_OPTION||(LA6_0 >= KW_ORCFILE && LA6_0 <= KW_OUTPUTFORMAT)||LA6_0==KW_OVERWRITE||(LA6_0 >= KW_PARTITION && LA6_0 <= KW_PLUS)||(LA6_0 >= KW_PRETTY && LA6_0 <= KW_RECORDWRITER)||(LA6_0 >= KW_REGEXP && LA6_0 <= KW_SCHEMAS)||(LA6_0 >= KW_SEMI && LA6_0 <= KW_TABLES)||(LA6_0 >= KW_TBLPROPERTIES && LA6_0 <= KW_TEXTFILE)||(LA6_0 >= KW_TIMESTAMP && LA6_0 <= KW_TOUCH)||(LA6_0 >= KW_TRIGGER && LA6_0 <= KW_UNARCHIVE)||(LA6_0 >= KW_UNDO && LA6_0 <= KW_UNIONTYPE)||(LA6_0 >= KW_UNLOCK && LA6_0 <= KW_VALUE_TYPE)||LA6_0==KW_VIEW||LA6_0==KW_WHILE||LA6_0==KW_WITH) ) {
								int LA6_2 = input.LA(2);
								if ( (LA6_2==COMMA||LA6_2==RPAREN) ) {
									alt6=1;
								}
								else if ( (LA6_2==KW_ARRAY||(LA6_2 >= KW_BIGINT && LA6_2 <= KW_BOOLEAN)||(LA6_2 >= KW_DATE && LA6_2 <= KW_DATETIME)||LA6_2==KW_DECIMAL||LA6_2==KW_DOUBLE||LA6_2==KW_FLOAT||LA6_2==KW_INT||LA6_2==KW_MAP||LA6_2==KW_SMALLINT||(LA6_2 >= KW_STRING && LA6_2 <= KW_STRUCT)||(LA6_2 >= KW_TIMESTAMP && LA6_2 <= KW_TINYINT)||LA6_2==KW_UNIONTYPE||LA6_2==KW_VARCHAR) ) {
									alt6=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 6, 2, input);
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
									// SelectClauseParser.g:75:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause324);
									aliasList17=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList17.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:75:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause328);
									columnNameTypeList18=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList18.getTree());
									}
									break;

							}

							RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause331);  
							stream_RPAREN.add(RPAREN19);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:75:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:75:65: ( aliasList | columnNameTypeList )
							int alt7=2;
							alt7 = dfa7.predict(input);
							switch (alt7) {
								case 1 :
									// SelectClauseParser.g:75:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause337);
									aliasList20=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList20.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:75:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause341);
									columnNameTypeList21=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList21.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause353);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_selectTrfmClause357);
			outRec=gHiveParser.recordReader();
			state._fsp--;

			stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: outSerde, aliasList, StringLiteral, inSerde, inRec, selectExpressionList, columnNameTypeList, outRec
			// token labels: 
			// rule labels: retval, inRec, inSerde, outRec, outSerde
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:77:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:77:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:77:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectTrfmClause"


	public static class hintClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintClause"
	// SelectClauseParser.g:80:1: hintClause : DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) ;
	public final HiveParser_SelectClauseParser.hintClause_return hintClause() throws RecognitionException {
		HiveParser_SelectClauseParser.hintClause_return retval = new HiveParser_SelectClauseParser.hintClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DIVIDE22=null;
		Token STAR23=null;
		Token PLUS24=null;
		Token STAR26=null;
		Token DIVIDE27=null;
		ParserRuleReturnScope hintList25 =null;

		CommonTree DIVIDE22_tree=null;
		CommonTree STAR23_tree=null;
		CommonTree PLUS24_tree=null;
		CommonTree STAR26_tree=null;
		CommonTree DIVIDE27_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
		RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");

		 gParent.msgs.push("hint clause"); 
		try {
			// SelectClauseParser.g:83:5: ( DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) )
			// SelectClauseParser.g:84:5: DIVIDE STAR PLUS hintList STAR DIVIDE
			{
			DIVIDE22=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause420);  
			stream_DIVIDE.add(DIVIDE22);

			STAR23=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause422);  
			stream_STAR.add(STAR23);

			PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_hintClause424);  
			stream_PLUS.add(PLUS24);

			pushFollow(FOLLOW_hintList_in_hintClause426);
			hintList25=hintList();
			state._fsp--;

			stream_hintList.add(hintList25.getTree());
			STAR26=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause428);  
			stream_STAR.add(STAR26);

			DIVIDE27=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause430);  
			stream_DIVIDE.add(DIVIDE27);

			// AST REWRITE
			// elements: hintList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 84:43: -> ^( TOK_HINTLIST hintList )
			{
				// SelectClauseParser.g:84:46: ^( TOK_HINTLIST hintList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINTLIST, "TOK_HINTLIST"), root_1);
				adaptor.addChild(root_1, stream_hintList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintClause"


	public static class hintList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintList"
	// SelectClauseParser.g:87:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
	public final HiveParser_SelectClauseParser.hintList_return hintList() throws RecognitionException {
		HiveParser_SelectClauseParser.hintList_return retval = new HiveParser_SelectClauseParser.hintList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA29=null;
		ParserRuleReturnScope hintItem28 =null;
		ParserRuleReturnScope hintItem30 =null;

		CommonTree COMMA29_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");

		 gParent.msgs.push("hint list"); 
		try {
			// SelectClauseParser.g:90:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
			// SelectClauseParser.g:91:5: hintItem ( COMMA hintItem )*
			{
			pushFollow(FOLLOW_hintItem_in_hintList469);
			hintItem28=hintItem();
			state._fsp--;

			stream_hintItem.add(hintItem28.getTree());
			// SelectClauseParser.g:91:14: ( COMMA hintItem )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// SelectClauseParser.g:91:15: COMMA hintItem
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintList472);  
					stream_COMMA.add(COMMA29);

					pushFollow(FOLLOW_hintItem_in_hintList474);
					hintItem30=hintItem();
					state._fsp--;

					stream_hintItem.add(hintItem30.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// AST REWRITE
			// elements: hintItem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 91:32: -> ( hintItem )+
			{
				if ( !(stream_hintItem.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_hintItem.hasNext() ) {
					adaptor.addChild(root_0, stream_hintItem.nextTree());
				}
				stream_hintItem.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintList"


	public static class hintItem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintItem"
	// SelectClauseParser.g:94:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) ;
	public final HiveParser_SelectClauseParser.hintItem_return hintItem() throws RecognitionException {
		HiveParser_SelectClauseParser.hintItem_return retval = new HiveParser_SelectClauseParser.hintItem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN32=null;
		Token RPAREN34=null;
		ParserRuleReturnScope hintName31 =null;
		ParserRuleReturnScope hintArgs33 =null;

		CommonTree LPAREN32_tree=null;
		CommonTree RPAREN34_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
		RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");

		 gParent.msgs.push("hint item"); 
		try {
			// SelectClauseParser.g:97:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) )
			// SelectClauseParser.g:98:5: hintName ( LPAREN hintArgs RPAREN )?
			{
			pushFollow(FOLLOW_hintName_in_hintItem512);
			hintName31=hintName();
			state._fsp--;

			stream_hintName.add(hintName31.getTree());
			// SelectClauseParser.g:98:14: ( LPAREN hintArgs RPAREN )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==LPAREN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// SelectClauseParser.g:98:15: LPAREN hintArgs RPAREN
					{
					LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hintItem515);  
					stream_LPAREN.add(LPAREN32);

					pushFollow(FOLLOW_hintArgs_in_hintItem517);
					hintArgs33=hintArgs();
					state._fsp--;

					stream_hintArgs.add(hintArgs33.getTree());
					RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hintItem519);  
					stream_RPAREN.add(RPAREN34);

					}
					break;

			}

			// AST REWRITE
			// elements: hintName, hintArgs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 98:40: -> ^( TOK_HINT hintName ( hintArgs )? )
			{
				// SelectClauseParser.g:98:43: ^( TOK_HINT hintName ( hintArgs )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINT, "TOK_HINT"), root_1);
				adaptor.addChild(root_1, stream_hintName.nextTree());
				// SelectClauseParser.g:98:63: ( hintArgs )?
				if ( stream_hintArgs.hasNext() ) {
					adaptor.addChild(root_1, stream_hintArgs.nextTree());
				}
				stream_hintArgs.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintItem"


	public static class hintName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintName"
	// SelectClauseParser.g:101:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME );
	public final HiveParser_SelectClauseParser.hintName_return hintName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintName_return retval = new HiveParser_SelectClauseParser.hintName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAPJOIN35=null;
		Token KW_STREAMTABLE36=null;
		Token KW_HOLD_DDLTIME37=null;

		CommonTree KW_MAPJOIN35_tree=null;
		CommonTree KW_STREAMTABLE36_tree=null;
		CommonTree KW_HOLD_DDLTIME37_tree=null;
		RewriteRuleTokenStream stream_KW_HOLD_DDLTIME=new RewriteRuleTokenStream(adaptor,"token KW_HOLD_DDLTIME");
		RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
		RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");

		 gParent.msgs.push("hint name"); 
		try {
			// SelectClauseParser.g:104:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME )
			int alt12=3;
			switch ( input.LA(1) ) {
			case KW_MAPJOIN:
				{
				alt12=1;
				}
				break;
			case KW_STREAMTABLE:
				{
				alt12=2;
				}
				break;
			case KW_HOLD_DDLTIME:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// SelectClauseParser.g:105:5: KW_MAPJOIN
					{
					KW_MAPJOIN35=(Token)match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName563);  
					stream_KW_MAPJOIN.add(KW_MAPJOIN35);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 105:16: -> TOK_MAPJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:106:7: KW_STREAMTABLE
					{
					KW_STREAMTABLE36=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName575);  
					stream_KW_STREAMTABLE.add(KW_STREAMTABLE36);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 106:22: -> TOK_STREAMTABLE
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// SelectClauseParser.g:107:7: KW_HOLD_DDLTIME
					{
					KW_HOLD_DDLTIME37=(Token)match(input,KW_HOLD_DDLTIME,FOLLOW_KW_HOLD_DDLTIME_in_hintName587);  
					stream_KW_HOLD_DDLTIME.add(KW_HOLD_DDLTIME37);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 107:23: -> TOK_HOLD_DDLTIME
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_HOLD_DDLTIME, "TOK_HOLD_DDLTIME"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintName"


	public static class hintArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintArgs"
	// SelectClauseParser.g:110:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
	public final HiveParser_SelectClauseParser.hintArgs_return hintArgs() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgs_return retval = new HiveParser_SelectClauseParser.hintArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA39=null;
		ParserRuleReturnScope hintArgName38 =null;
		ParserRuleReturnScope hintArgName40 =null;

		CommonTree COMMA39_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");

		 gParent.msgs.push("hint arguments"); 
		try {
			// SelectClauseParser.g:113:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
			// SelectClauseParser.g:114:5: hintArgName ( COMMA hintArgName )*
			{
			pushFollow(FOLLOW_hintArgName_in_hintArgs622);
			hintArgName38=hintArgName();
			state._fsp--;

			stream_hintArgName.add(hintArgName38.getTree());
			// SelectClauseParser.g:114:17: ( COMMA hintArgName )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// SelectClauseParser.g:114:18: COMMA hintArgName
					{
					COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs625);  
					stream_COMMA.add(COMMA39);

					pushFollow(FOLLOW_hintArgName_in_hintArgs627);
					hintArgName40=hintArgName();
					state._fsp--;

					stream_hintArgName.add(hintArgName40.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: hintArgName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 114:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
			{
				// SelectClauseParser.g:114:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST"), root_1);
				if ( !(stream_hintArgName.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_hintArgName.hasNext() ) {
					adaptor.addChild(root_1, stream_hintArgName.nextTree());
				}
				stream_hintArgName.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintArgs"


	public static class hintArgName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintArgName"
	// SelectClauseParser.g:117:1: hintArgName : identifier ;
	public final HiveParser_SelectClauseParser.hintArgName_return hintArgName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgName_return retval = new HiveParser_SelectClauseParser.hintArgName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier41 =null;


		 gParent.msgs.push("hint argument name"); 
		try {
			// SelectClauseParser.g:120:5: ( identifier )
			// SelectClauseParser.g:121:5: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_hintArgName669);
			identifier41=gHiveParser.identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier41.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hintArgName"


	public static class selectItem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectItem"
	// SelectClauseParser.g:124:1: selectItem : ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ) ;
	public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
		HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS43=null;
		Token KW_AS45=null;
		Token LPAREN46=null;
		Token COMMA48=null;
		Token RPAREN50=null;
		ParserRuleReturnScope selectExpression42 =null;
		ParserRuleReturnScope identifier44 =null;
		ParserRuleReturnScope identifier47 =null;
		ParserRuleReturnScope identifier49 =null;

		CommonTree KW_AS43_tree=null;
		CommonTree KW_AS45_tree=null;
		CommonTree LPAREN46_tree=null;
		CommonTree COMMA48_tree=null;
		CommonTree RPAREN50_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("selection target"); 
		try {
			// SelectClauseParser.g:127:5: ( ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ) )
			// SelectClauseParser.g:128:5: ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
			{
			// SelectClauseParser.g:128:5: ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
			// SelectClauseParser.g:128:7: selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
			{
			pushFollow(FOLLOW_selectExpression_in_selectItem702);
			selectExpression42=selectExpression();
			state._fsp--;

			stream_selectExpression.add(selectExpression42.getTree());
			// SelectClauseParser.g:129:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
			int alt16=3;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// SelectClauseParser.g:129:8: ( ( KW_AS )? identifier )
					{
					// SelectClauseParser.g:129:8: ( ( KW_AS )? identifier )
					// SelectClauseParser.g:129:9: ( KW_AS )? identifier
					{
					// SelectClauseParser.g:129:9: ( KW_AS )?
					int alt14=2;
					alt14 = dfa14.predict(input);
					switch (alt14) {
						case 1 :
							// SelectClauseParser.g:129:9: KW_AS
							{
							KW_AS43=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem712);  
							stream_KW_AS.add(KW_AS43);

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_selectItem715);
					identifier44=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(identifier44.getTree());
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:129:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
					{
					// SelectClauseParser.g:129:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
					// SelectClauseParser.g:129:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
					{
					KW_AS45=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem721);  
					stream_KW_AS.add(KW_AS45);

					LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem723);  
					stream_LPAREN.add(LPAREN46);

					pushFollow(FOLLOW_identifier_in_selectItem725);
					identifier47=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(identifier47.getTree());
					// SelectClauseParser.g:129:55: ( COMMA identifier )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// SelectClauseParser.g:129:56: COMMA identifier
							{
							COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem728);  
							stream_COMMA.add(COMMA48);

							pushFollow(FOLLOW_identifier_in_selectItem730);
							identifier49=gHiveParser.identifier();
							state._fsp--;

							stream_identifier.add(identifier49.getTree());
							}
							break;

						default :
							break loop15;
						}
					}

					RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem734);  
					stream_RPAREN.add(RPAREN50);

					}

					}
					break;

			}

			}

			// AST REWRITE
			// elements: identifier, selectExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 130:7: -> ^( TOK_SELEXPR selectExpression ( identifier )* )
			{
				// SelectClauseParser.g:130:10: ^( TOK_SELEXPR selectExpression ( identifier )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
				adaptor.addChild(root_1, stream_selectExpression.nextTree());
				// SelectClauseParser.g:130:41: ( identifier )*
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectItem"


	public static class trfmClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "trfmClause"
	// SelectClauseParser.g:133:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAP51=null;
		Token KW_REDUCE53=null;
		Token KW_USING55=null;
		Token StringLiteral56=null;
		Token KW_AS57=null;
		Token LPAREN58=null;
		Token RPAREN61=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList52 =null;
		ParserRuleReturnScope selectExpressionList54 =null;
		ParserRuleReturnScope aliasList59 =null;
		ParserRuleReturnScope columnNameTypeList60 =null;
		ParserRuleReturnScope aliasList62 =null;
		ParserRuleReturnScope columnNameTypeList63 =null;

		CommonTree KW_MAP51_tree=null;
		CommonTree KW_REDUCE53_tree=null;
		CommonTree KW_USING55_tree=null;
		CommonTree StringLiteral56_tree=null;
		CommonTree KW_AS57_tree=null;
		CommonTree LPAREN58_tree=null;
		CommonTree RPAREN61_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.msgs.push("transform clause"); 
		try {
			// SelectClauseParser.g:136:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:137:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			// SelectClauseParser.g:137:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==KW_MAP) ) {
				alt17=1;
			}
			else if ( (LA17_0==KW_REDUCE) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// SelectClauseParser.g:137:9: KW_MAP selectExpressionList
					{
					KW_MAP51=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause789);  
					stream_KW_MAP.add(KW_MAP51);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause794);
					selectExpressionList52=selectExpressionList();
					state._fsp--;

					stream_selectExpressionList.add(selectExpressionList52.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:138:9: KW_REDUCE selectExpressionList
					{
					KW_REDUCE53=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause804);  
					stream_KW_REDUCE.add(KW_REDUCE53);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause806);
					selectExpressionList54=selectExpressionList();
					state._fsp--;

					stream_selectExpressionList.add(selectExpressionList54.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause816);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_trfmClause820);
			inRec=gHiveParser.recordWriter();
			state._fsp--;

			stream_recordWriter.add(inRec.getTree());
			KW_USING55=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause826);  
			stream_KW_USING.add(KW_USING55);

			StringLiteral56=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause828);  
			stream_StringLiteral.add(StringLiteral56);

			// SelectClauseParser.g:141:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==KW_AS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// SelectClauseParser.g:141:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS57=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause836);  
					stream_KW_AS.add(KW_AS57);

					// SelectClauseParser.g:141:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LPAREN) ) {
						alt20=1;
					}
					else if ( ((LA20_0 >= Identifier && LA20_0 <= KW_AFTER)||(LA20_0 >= KW_ALTER && LA20_0 <= KW_ANALYZE)||(LA20_0 >= KW_ARCHIVE && LA20_0 <= KW_CASCADE)||(LA20_0 >= KW_CHANGE && LA20_0 <= KW_COLLECTION)||(LA20_0 >= KW_COLUMNS && LA20_0 <= KW_CREATE)||LA20_0==KW_CUBE||(LA20_0 >= KW_CURSOR && LA20_0 <= KW_DATA)||(LA20_0 >= KW_DATABASES && LA20_0 <= KW_DISABLE)||(LA20_0 >= KW_DISTRIBUTE && LA20_0 <= KW_ELEM_TYPE)||LA20_0==KW_ENABLE||LA20_0==KW_ESCAPED||(LA20_0 >= KW_EXCLUSIVE && LA20_0 <= KW_EXPORT)||(LA20_0 >= KW_EXTERNAL && LA20_0 <= KW_FLOAT)||(LA20_0 >= KW_FOR && LA20_0 <= KW_FORMATTED)||LA20_0==KW_FULL||(LA20_0 >= KW_FUNCTIONS && LA20_0 <= KW_GROUPING)||(LA20_0 >= KW_HOLD_DDLTIME && LA20_0 <= KW_IDXPROPERTIES)||(LA20_0 >= KW_IGNORE && LA20_0 <= KW_ITEMS)||(LA20_0 >= KW_KEYS && LA20_0 <= KW_LEFT)||(LA20_0 >= KW_LIKE && LA20_0 <= KW_LONG)||(LA20_0 >= KW_MAPJOIN && LA20_0 <= KW_MINUS)||(LA20_0 >= KW_MSCK && LA20_0 <= KW_NOSCAN)||(LA20_0 >= KW_NO_DROP && LA20_0 <= KW_OFFLINE)||LA20_0==KW_OPTION||(LA20_0 >= KW_ORCFILE && LA20_0 <= KW_OUTPUTFORMAT)||LA20_0==KW_OVERWRITE||(LA20_0 >= KW_PARTITION && LA20_0 <= KW_PLUS)||(LA20_0 >= KW_PRETTY && LA20_0 <= KW_RECORDWRITER)||(LA20_0 >= KW_REGEXP && LA20_0 <= KW_SCHEMAS)||(LA20_0 >= KW_SEMI && LA20_0 <= KW_TABLES)||(LA20_0 >= KW_TBLPROPERTIES && LA20_0 <= KW_TEXTFILE)||(LA20_0 >= KW_TIMESTAMP && LA20_0 <= KW_TOUCH)||(LA20_0 >= KW_TRIGGER && LA20_0 <= KW_UNARCHIVE)||(LA20_0 >= KW_UNDO && LA20_0 <= KW_UNIONTYPE)||(LA20_0 >= KW_UNLOCK && LA20_0 <= KW_VALUE_TYPE)||LA20_0==KW_VIEW||LA20_0==KW_WHILE||LA20_0==KW_WITH) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// SelectClauseParser.g:141:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:141:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:141:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause840);  
							stream_LPAREN.add(LPAREN58);

							// SelectClauseParser.g:141:22: ( aliasList | columnNameTypeList )
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==Identifier) ) {
								int LA18_1 = input.LA(2);
								if ( (LA18_1==COMMA||LA18_1==RPAREN) ) {
									alt18=1;
								}
								else if ( (LA18_1==KW_ARRAY||(LA18_1 >= KW_BIGINT && LA18_1 <= KW_BOOLEAN)||(LA18_1 >= KW_DATE && LA18_1 <= KW_DATETIME)||LA18_1==KW_DECIMAL||LA18_1==KW_DOUBLE||LA18_1==KW_FLOAT||LA18_1==KW_INT||LA18_1==KW_MAP||LA18_1==KW_SMALLINT||(LA18_1 >= KW_STRING && LA18_1 <= KW_STRUCT)||(LA18_1 >= KW_TIMESTAMP && LA18_1 <= KW_TINYINT)||LA18_1==KW_UNIONTYPE||LA18_1==KW_VARCHAR) ) {
									alt18=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 18, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( ((LA18_0 >= KW_ADD && LA18_0 <= KW_AFTER)||(LA18_0 >= KW_ALTER && LA18_0 <= KW_ANALYZE)||(LA18_0 >= KW_ARCHIVE && LA18_0 <= KW_CASCADE)||(LA18_0 >= KW_CHANGE && LA18_0 <= KW_COLLECTION)||(LA18_0 >= KW_COLUMNS && LA18_0 <= KW_CREATE)||LA18_0==KW_CUBE||(LA18_0 >= KW_CURSOR && LA18_0 <= KW_DATA)||(LA18_0 >= KW_DATABASES && LA18_0 <= KW_DISABLE)||(LA18_0 >= KW_DISTRIBUTE && LA18_0 <= KW_ELEM_TYPE)||LA18_0==KW_ENABLE||LA18_0==KW_ESCAPED||(LA18_0 >= KW_EXCLUSIVE && LA18_0 <= KW_EXPORT)||(LA18_0 >= KW_EXTERNAL && LA18_0 <= KW_FLOAT)||(LA18_0 >= KW_FOR && LA18_0 <= KW_FORMATTED)||LA18_0==KW_FULL||(LA18_0 >= KW_FUNCTIONS && LA18_0 <= KW_GROUPING)||(LA18_0 >= KW_HOLD_DDLTIME && LA18_0 <= KW_IDXPROPERTIES)||(LA18_0 >= KW_IGNORE && LA18_0 <= KW_ITEMS)||(LA18_0 >= KW_KEYS && LA18_0 <= KW_LEFT)||(LA18_0 >= KW_LIKE && LA18_0 <= KW_LONG)||(LA18_0 >= KW_MAPJOIN && LA18_0 <= KW_MINUS)||(LA18_0 >= KW_MSCK && LA18_0 <= KW_NOSCAN)||(LA18_0 >= KW_NO_DROP && LA18_0 <= KW_OFFLINE)||LA18_0==KW_OPTION||(LA18_0 >= KW_ORCFILE && LA18_0 <= KW_OUTPUTFORMAT)||LA18_0==KW_OVERWRITE||(LA18_0 >= KW_PARTITION && LA18_0 <= KW_PLUS)||(LA18_0 >= KW_PRETTY && LA18_0 <= KW_RECORDWRITER)||(LA18_0 >= KW_REGEXP && LA18_0 <= KW_SCHEMAS)||(LA18_0 >= KW_SEMI && LA18_0 <= KW_TABLES)||(LA18_0 >= KW_TBLPROPERTIES && LA18_0 <= KW_TEXTFILE)||(LA18_0 >= KW_TIMESTAMP && LA18_0 <= KW_TOUCH)||(LA18_0 >= KW_TRIGGER && LA18_0 <= KW_UNARCHIVE)||(LA18_0 >= KW_UNDO && LA18_0 <= KW_UNIONTYPE)||(LA18_0 >= KW_UNLOCK && LA18_0 <= KW_VALUE_TYPE)||LA18_0==KW_VIEW||LA18_0==KW_WHILE||LA18_0==KW_WITH) ) {
								int LA18_2 = input.LA(2);
								if ( (LA18_2==COMMA||LA18_2==RPAREN) ) {
									alt18=1;
								}
								else if ( (LA18_2==KW_ARRAY||(LA18_2 >= KW_BIGINT && LA18_2 <= KW_BOOLEAN)||(LA18_2 >= KW_DATE && LA18_2 <= KW_DATETIME)||LA18_2==KW_DECIMAL||LA18_2==KW_DOUBLE||LA18_2==KW_FLOAT||LA18_2==KW_INT||LA18_2==KW_MAP||LA18_2==KW_SMALLINT||(LA18_2 >= KW_STRING && LA18_2 <= KW_STRUCT)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TINYINT)||LA18_2==KW_UNIONTYPE||LA18_2==KW_VARCHAR) ) {
									alt18=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 18, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 18, 0, input);
								throw nvae;
							}

							switch (alt18) {
								case 1 :
									// SelectClauseParser.g:141:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause843);
									aliasList59=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList59.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:141:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause847);
									columnNameTypeList60=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList60.getTree());
									}
									break;

							}

							RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause850);  
							stream_RPAREN.add(RPAREN61);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:141:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:141:65: ( aliasList | columnNameTypeList )
							int alt19=2;
							alt19 = dfa19.predict(input);
							switch (alt19) {
								case 1 :
									// SelectClauseParser.g:141:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause856);
									aliasList62=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList62.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:141:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause860);
									columnNameTypeList63=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList63.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause872);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_trfmClause876);
			outRec=gHiveParser.recordReader();
			state._fsp--;

			stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: columnNameTypeList, StringLiteral, inRec, aliasList, outRec, selectExpressionList, outSerde, inSerde
			// token labels: 
			// rule labels: retval, inSerde, inRec, outRec, outSerde
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:143:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:143:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:143:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trfmClause"


	public static class selectExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectExpression"
	// SelectClauseParser.g:146:1: selectExpression : ( expression | tableAllColumns );
	public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope tableAllColumns65 =null;


		 gParent.msgs.push("select expression"); 
		try {
			// SelectClauseParser.g:149:5: ( expression | tableAllColumns )
			int alt22=2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// SelectClauseParser.g:150:5: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_selectExpression939);
					expression64=gHiveParser.expression();
					state._fsp--;

					adaptor.addChild(root_0, expression64.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:150:18: tableAllColumns
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableAllColumns_in_selectExpression943);
					tableAllColumns65=gHiveParser.tableAllColumns();
					state._fsp--;

					adaptor.addChild(root_0, tableAllColumns65.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectExpression"


	public static class selectExpressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectExpressionList"
	// SelectClauseParser.g:153:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
	public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA67=null;
		ParserRuleReturnScope selectExpression66 =null;
		ParserRuleReturnScope selectExpression68 =null;

		CommonTree COMMA67_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");

		 gParent.msgs.push("select expression list"); 
		try {
			// SelectClauseParser.g:156:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
			// SelectClauseParser.g:157:5: selectExpression ( COMMA selectExpression )*
			{
			pushFollow(FOLLOW_selectExpression_in_selectExpressionList974);
			selectExpression66=selectExpression();
			state._fsp--;

			stream_selectExpression.add(selectExpression66.getTree());
			// SelectClauseParser.g:157:22: ( COMMA selectExpression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// SelectClauseParser.g:157:23: COMMA selectExpression
					{
					COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList977);  
					stream_COMMA.add(COMMA67);

					pushFollow(FOLLOW_selectExpression_in_selectExpressionList979);
					selectExpression68=selectExpression();
					state._fsp--;

					stream_selectExpression.add(selectExpression68.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			// AST REWRITE
			// elements: selectExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 157:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
			{
				// SelectClauseParser.g:157:51: ^( TOK_EXPLIST ( selectExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				if ( !(stream_selectExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_selectExpression.nextTree());
				}
				stream_selectExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectExpressionList"


	public static class window_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_clause"
	// SelectClauseParser.g:161:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
	public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
		HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_WINDOW69=null;
		Token COMMA71=null;
		ParserRuleReturnScope window_defn70 =null;
		ParserRuleReturnScope window_defn72 =null;

		CommonTree KW_WINDOW69_tree=null;
		CommonTree COMMA71_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
		RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");

		 gParent.msgs.push("window_clause"); 
		try {
			// SelectClauseParser.g:164:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
			// SelectClauseParser.g:165:3: KW_WINDOW window_defn ( COMMA window_defn )*
			{
			KW_WINDOW69=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause1018);  
			stream_KW_WINDOW.add(KW_WINDOW69);

			pushFollow(FOLLOW_window_defn_in_window_clause1020);
			window_defn70=window_defn();
			state._fsp--;

			stream_window_defn.add(window_defn70.getTree());
			// SelectClauseParser.g:165:25: ( COMMA window_defn )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// SelectClauseParser.g:165:26: COMMA window_defn
					{
					COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause1023);  
					stream_COMMA.add(COMMA71);

					pushFollow(FOLLOW_window_defn_in_window_clause1025);
					window_defn72=window_defn();
					state._fsp--;

					stream_window_defn.add(window_defn72.getTree());
					}
					break;

				default :
					break loop24;
				}
			}

			// AST REWRITE
			// elements: KW_WINDOW, window_defn
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 165:46: -> ^( KW_WINDOW ( window_defn )+ )
			{
				// SelectClauseParser.g:165:49: ^( KW_WINDOW ( window_defn )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_WINDOW.nextNode(), root_1);
				if ( !(stream_window_defn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_window_defn.hasNext() ) {
					adaptor.addChild(root_1, stream_window_defn.nextTree());
				}
				stream_window_defn.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_clause"


	public static class window_defn_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_defn"
	// SelectClauseParser.g:168:1: window_defn : Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) ;
	public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
		HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier73=null;
		Token KW_AS74=null;
		ParserRuleReturnScope window_specification75 =null;

		CommonTree Identifier73_tree=null;
		CommonTree KW_AS74_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");

		 gParent.msgs.push("window_defn"); 
		try {
			// SelectClauseParser.g:171:3: ( Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) )
			// SelectClauseParser.g:172:3: Identifier KW_AS window_specification
			{
			Identifier73=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_defn1061);  
			stream_Identifier.add(Identifier73);

			KW_AS74=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn1063);  
			stream_KW_AS.add(KW_AS74);

			pushFollow(FOLLOW_window_specification_in_window_defn1065);
			window_specification75=window_specification();
			state._fsp--;

			stream_window_specification.add(window_specification75.getTree());
			// AST REWRITE
			// elements: window_specification, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 172:41: -> ^( TOK_WINDOWDEF Identifier window_specification )
			{
				// SelectClauseParser.g:172:44: ^( TOK_WINDOWDEF Identifier window_specification )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWDEF, "TOK_WINDOWDEF"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_window_specification.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_defn"


	public static class window_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_specification"
	// SelectClauseParser.g:175:1: window_specification : ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) ;
	public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
		HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier76=null;
		Token LPAREN77=null;
		Token Identifier78=null;
		Token RPAREN81=null;
		ParserRuleReturnScope partitioningSpec79 =null;
		ParserRuleReturnScope window_frame80 =null;

		CommonTree Identifier76_tree=null;
		CommonTree LPAREN77_tree=null;
		CommonTree Identifier78_tree=null;
		CommonTree RPAREN81_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");

		 gParent.msgs.push("window_specification"); 
		try {
			// SelectClauseParser.g:178:3: ( ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) )
			// SelectClauseParser.g:179:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			{
			// SelectClauseParser.g:179:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Identifier) ) {
				alt28=1;
			}
			else if ( (LA28_0==LPAREN) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// SelectClauseParser.g:179:4: Identifier
					{
					Identifier76=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1101);  
					stream_Identifier.add(Identifier76);

					}
					break;
				case 2 :
					// SelectClauseParser.g:179:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					{
					// SelectClauseParser.g:179:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					// SelectClauseParser.g:179:19: LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
					{
					LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification1107);  
					stream_LPAREN.add(LPAREN77);

					// SelectClauseParser.g:179:26: ( Identifier )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==Identifier) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// SelectClauseParser.g:179:26: Identifier
							{
							Identifier78=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1109);  
							stream_Identifier.add(Identifier78);

							}
							break;

					}

					// SelectClauseParser.g:179:38: ( partitioningSpec )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==KW_CLUSTER||LA26_0==KW_DISTRIBUTE||LA26_0==KW_ORDER||LA26_0==KW_PARTITION||LA26_0==KW_SORT) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// SelectClauseParser.g:179:38: partitioningSpec
							{
							pushFollow(FOLLOW_partitioningSpec_in_window_specification1112);
							partitioningSpec79=gHiveParser.partitioningSpec();
							state._fsp--;

							stream_partitioningSpec.add(partitioningSpec79.getTree());
							}
							break;

					}

					// SelectClauseParser.g:179:56: ( window_frame )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==KW_RANGE||LA27_0==KW_ROWS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// SelectClauseParser.g:179:56: window_frame
							{
							pushFollow(FOLLOW_window_frame_in_window_specification1115);
							window_frame80=window_frame();
							state._fsp--;

							stream_window_frame.add(window_frame80.getTree());
							}
							break;

					}

					RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification1118);  
					stream_RPAREN.add(RPAREN81);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: window_frame, partitioningSpec, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 179:79: -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
			{
				// SelectClauseParser.g:179:82: ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC"), root_1);
				// SelectClauseParser.g:179:99: ( Identifier )?
				if ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				// SelectClauseParser.g:179:111: ( partitioningSpec )?
				if ( stream_partitioningSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitioningSpec.nextTree());
				}
				stream_partitioningSpec.reset();

				// SelectClauseParser.g:179:129: ( window_frame )?
				if ( stream_window_frame.hasNext() ) {
					adaptor.addChild(root_1, stream_window_frame.nextTree());
				}
				stream_window_frame.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_specification"


	public static class window_frame_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame"
	// SelectClauseParser.g:182:1: window_frame : ( window_range_expression | window_value_expression );
	public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope window_range_expression82 =null;
		ParserRuleReturnScope window_value_expression83 =null;


		try {
			// SelectClauseParser.g:182:14: ( window_range_expression | window_value_expression )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==KW_ROWS) ) {
				alt29=1;
			}
			else if ( (LA29_0==KW_RANGE) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// SelectClauseParser.g:183:2: window_range_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_range_expression_in_window_frame1145);
					window_range_expression82=window_range_expression();
					state._fsp--;

					adaptor.addChild(root_0, window_range_expression82.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:184:2: window_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_value_expression_in_window_frame1150);
					window_value_expression83=window_value_expression();
					state._fsp--;

					adaptor.addChild(root_0, window_value_expression83.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_frame"


	public static class window_range_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_range_expression"
	// SelectClauseParser.g:187:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
	public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ROWS84=null;
		Token KW_ROWS85=null;
		Token KW_BETWEEN86=null;
		Token KW_AND87=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_ROWS84_tree=null;
		CommonTree KW_ROWS85_tree=null;
		CommonTree KW_BETWEEN86_tree=null;
		CommonTree KW_AND87_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");

		 gParent.msgs.push("window_range_expression"); 
		try {
			// SelectClauseParser.g:190:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==KW_ROWS) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==KW_BETWEEN) ) {
					alt30=2;
				}
				else if ( (LA30_1==KW_CURRENT||LA30_1==KW_UNBOUNDED||LA30_1==Number) ) {
					alt30=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// SelectClauseParser.g:191:2: KW_ROWS sb= window_frame_start_boundary
					{
					KW_ROWS84=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1172);  
					stream_KW_ROWS.add(KW_ROWS84);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression1176);
					sb=window_frame_start_boundary();
					state._fsp--;

					stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 191:41: -> ^( TOK_WINDOWRANGE $sb)
					{
						// SelectClauseParser.g:191:44: ^( TOK_WINDOWRANGE $sb)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:192:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_ROWS85=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1190);  
					stream_KW_ROWS.add(KW_ROWS85);

					KW_BETWEEN86=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression1192);  
					stream_KW_BETWEEN.add(KW_BETWEEN86);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1196);
					s=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(s.getTree());
					KW_AND87=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression1198);  
					stream_KW_AND.add(KW_AND87);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1202);
					end=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: end, s
					// token labels: 
					// rule labels: retval, s, end
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 192:78: -> ^( TOK_WINDOWRANGE $s $end)
					{
						// SelectClauseParser.g:192:81: ^( TOK_WINDOWRANGE $s $end)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_range_expression"


	public static class window_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_value_expression"
	// SelectClauseParser.g:195:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
	public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_RANGE88=null;
		Token KW_RANGE89=null;
		Token KW_BETWEEN90=null;
		Token KW_AND91=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_RANGE88_tree=null;
		CommonTree KW_RANGE89_tree=null;
		CommonTree KW_BETWEEN90_tree=null;
		CommonTree KW_AND91_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");

		 gParent.msgs.push("window_value_expression"); 
		try {
			// SelectClauseParser.g:198:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==KW_RANGE) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==KW_BETWEEN) ) {
					alt31=2;
				}
				else if ( (LA31_1==KW_CURRENT||LA31_1==KW_UNBOUNDED||LA31_1==Number) ) {
					alt31=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// SelectClauseParser.g:199:2: KW_RANGE sb= window_frame_start_boundary
					{
					KW_RANGE88=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1236);  
					stream_KW_RANGE.add(KW_RANGE88);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression1240);
					sb=window_frame_start_boundary();
					state._fsp--;

					stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 199:42: -> ^( TOK_WINDOWVALUES $sb)
					{
						// SelectClauseParser.g:199:45: ^( TOK_WINDOWVALUES $sb)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:200:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_RANGE89=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1254);  
					stream_KW_RANGE.add(KW_RANGE89);

					KW_BETWEEN90=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1256);  
					stream_KW_BETWEEN.add(KW_BETWEEN90);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1260);
					s=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(s.getTree());
					KW_AND91=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1262);  
					stream_KW_AND.add(KW_AND91);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1266);
					end=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: end, s
					// token labels: 
					// rule labels: retval, s, end
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 200:79: -> ^( TOK_WINDOWVALUES $s $end)
					{
						// SelectClauseParser.g:200:82: ^( TOK_WINDOWVALUES $s $end)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_value_expression"


	public static class window_frame_start_boundary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame_start_boundary"
	// SelectClauseParser.g:203:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
	public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_UNBOUNDED92=null;
		Token KW_PRECEDING93=null;
		Token KW_CURRENT94=null;
		Token KW_ROW95=null;
		Token Number96=null;
		Token KW_PRECEDING97=null;

		CommonTree KW_UNBOUNDED92_tree=null;
		CommonTree KW_PRECEDING93_tree=null;
		CommonTree KW_CURRENT94_tree=null;
		CommonTree KW_ROW95_tree=null;
		CommonTree Number96_tree=null;
		CommonTree KW_PRECEDING97_tree=null;
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

		 gParent.msgs.push("windowframestartboundary"); 
		try {
			// SelectClauseParser.g:206:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
			int alt32=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt32=1;
				}
				break;
			case KW_CURRENT:
				{
				alt32=2;
				}
				break;
			case Number:
				{
				alt32=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// SelectClauseParser.g:207:3: KW_UNBOUNDED KW_PRECEDING
					{
					KW_UNBOUNDED92=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1301);  
					stream_KW_UNBOUNDED.add(KW_UNBOUNDED92);

					KW_PRECEDING93=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1303);  
					stream_KW_PRECEDING.add(KW_PRECEDING93);

					// AST REWRITE
					// elements: KW_UNBOUNDED, KW_PRECEDING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 207:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
					{
						// SelectClauseParser.g:207:33: ^( KW_PRECEDING KW_UNBOUNDED )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:208:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT94=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1319);  
					stream_KW_CURRENT.add(KW_CURRENT94);

					KW_ROW95=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1321);  
					stream_KW_ROW.add(KW_ROW95);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 208:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:208:25: ^( KW_CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// SelectClauseParser.g:209:3: Number KW_PRECEDING
					{
					Number96=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1334);  
					stream_Number.add(Number96);

					KW_PRECEDING97=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1336);  
					stream_KW_PRECEDING.add(KW_PRECEDING97);

					// AST REWRITE
					// elements: Number, KW_PRECEDING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 209:23: -> ^( KW_PRECEDING Number )
					{
						// SelectClauseParser.g:209:26: ^( KW_PRECEDING Number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_frame_start_boundary"


	public static class window_frame_boundary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame_boundary"
	// SelectClauseParser.g:212:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
	public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token r=null;
		Token d=null;
		Token KW_UNBOUNDED98=null;
		Token KW_CURRENT99=null;
		Token KW_ROW100=null;
		Token Number101=null;

		CommonTree r_tree=null;
		CommonTree d_tree=null;
		CommonTree KW_UNBOUNDED98_tree=null;
		CommonTree KW_CURRENT99_tree=null;
		CommonTree KW_ROW100_tree=null;
		CommonTree Number101_tree=null;
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

		 gParent.msgs.push("windowframeboundary"); 
		try {
			// SelectClauseParser.g:215:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
			int alt35=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt35=1;
				}
				break;
			case KW_CURRENT:
				{
				alt35=2;
				}
				break;
			case Number:
				{
				alt35=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// SelectClauseParser.g:216:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
					{
					KW_UNBOUNDED98=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1367);  
					stream_KW_UNBOUNDED.add(KW_UNBOUNDED98);

					// SelectClauseParser.g:216:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==KW_PRECEDING) ) {
						alt33=1;
					}
					else if ( (LA33_0==KW_FOLLOWING) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// SelectClauseParser.g:216:17: r= KW_PRECEDING
							{
							r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1372);  
							stream_KW_PRECEDING.add(r);

							}
							break;
						case 2 :
							// SelectClauseParser.g:216:32: r= KW_FOLLOWING
							{
							r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1376);  
							stream_KW_FOLLOWING.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: KW_UNBOUNDED, r
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 216:49: -> ^( $r KW_UNBOUNDED )
					{
						// SelectClauseParser.g:216:52: ^( $r KW_UNBOUNDED )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:217:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT99=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1394);  
					stream_KW_CURRENT.add(KW_CURRENT99);

					KW_ROW100=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1396);  
					stream_KW_ROW.add(KW_ROW100);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 217:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:217:25: ^( KW_CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// SelectClauseParser.g:218:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
					{
					Number101=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1409);  
					stream_Number.add(Number101);

					// SelectClauseParser.g:218:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==KW_PRECEDING) ) {
						alt34=1;
					}
					else if ( (LA34_0==KW_FOLLOWING) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// SelectClauseParser.g:218:11: d= KW_PRECEDING
							{
							d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1414);  
							stream_KW_PRECEDING.add(d);

							}
							break;
						case 2 :
							// SelectClauseParser.g:218:28: d= KW_FOLLOWING
							{
							d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1420);  
							stream_KW_FOLLOWING.add(d);

							}
							break;

					}

					// AST REWRITE
					// elements: d, Number
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 218:45: -> ^( $d Number )
					{
						// SelectClauseParser.g:218:48: ^( $d Number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_d.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.msgs.pop(); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "window_frame_boundary"

	// Delegated rules


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA7_eotS =
		"\u0081\uffff";
	static final String DFA7_eofS =
		"\1\uffff\2\3\176\uffff";
	static final String DFA7_minS =
		"\1\32\2\12\23\uffff\1\7\45\uffff\1\7\104\uffff";
	static final String DFA7_maxS =
		"\1\u010a\2\u0118\23\uffff\1\u0120\45\uffff\1\u0120\104\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\1\24\uffff\1\2\150\uffff";
	static final String DFA7_specialS =
		"\u0081\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\1\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff\1\2"+
			"\1\uffff\2\2\1\uffff\16\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
			"\17\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1\uffff\2\2\1\uffff\4\2\1"+
			"\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5\2\2\uffff\14\2\1\uffff\16"+
			"\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
			"\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\27\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff\1"+
			"\30\12\uffff\1\3\1\30\22\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff\1"+
			"\3\14\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\26\17\uffff\1"+
			"\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1"+
			"\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\16\uffff\1\3",
			"\1\3\27\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff\1"+
			"\30\12\uffff\1\3\1\30\22\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff\1"+
			"\3\14\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\74\17\uffff\1"+
			"\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1"+
			"\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\16\uffff\1\3",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\3\3\1\uffff\2\3\1\uffff\25\3\1"+
			"\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff\4\3\1\uffff\1"+
			"\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\22\3\1\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1"+
			"\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff\5\3\2\uffff\14\3\1\uffff\16"+
			"\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff"+
			"\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\30\1\uffff\1\3\2"+
			"\uffff\1\3\2\uffff\2\3\6\uffff\5\3",
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
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\3\3\1\uffff\2\3\1\uffff\25\3\1"+
			"\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff\4\3\1\uffff\1"+
			"\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\22\3\1\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1"+
			"\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff\5\3\2\uffff\14\3\1\uffff\16"+
			"\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff"+
			"\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\30\1\uffff\1\3\2"+
			"\uffff\1\3\2\uffff\2\3\6\uffff\5\3",
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
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "75:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA16_eotS =
		"\u00e2\uffff";
	static final String DFA16_eofS =
		"\1\4\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\u00d0"+
		"\uffff";
	static final String DFA16_minS =
		"\2\12\1\uffff\1\12\3\uffff\1\12\1\uffff\1\12\1\uffff\4\12\1\uffff\2\12"+
		"\u00d0\uffff";
	static final String DFA16_maxS =
		"\2\u0118\1\uffff\1\u0118\3\uffff\1\u0118\1\uffff\1\u0118\1\uffff\4\u0118"+
		"\1\uffff\2\u0118\u00d0\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\1\1\uffff\1\3\22\uffff\1\2\u00ca\uffff";
	static final String DFA16_specialS =
		"\u00e2\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\4\17\uffff\3\2\1\uffff\2\2\1\uffff\2\2\1\1\13\2\2\uffff\1\2\1\13\3"+
			"\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\1\14\3\2"+
			"\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\4\1\2"+
			"\1\uffff\2\2\1\7\1\2\1\4\2\2\1\uffff\11\2\1\21\5\2\1\uffff\2\2\1\3\1"+
			"\2\1\uffff\1\2\1\16\10\2\1\uffff\1\4\3\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\1\2\1\11\4\2\1\uffff\1\2\1\uffff\5\2\2\uffff\14\2\1\4\16"+
			"\2\1\4\13\2\1\15\11\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\1\2"+
			"\1\20\1\2\1\uffff\12\2\1\uffff\1\2\1\uffff\1\4\1\2\1\4\1\2\15\uffff\1"+
			"\4",
			"\1\2\17\uffff\3\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1"+
			"\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1"+
			"\2\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\17\2\1\uffff"+
			"\4\2\1\uffff\12\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff"+
			"\6\2\1\uffff\1\2\1\uffff\5\2\2\uffff\61\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\1\uffff\4\2\3\uffff\1\27\11"+
			"\uffff\1\2",
			"",
			"\1\2\47\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff\1\2\32\uffff"+
			"\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\15\uffff\1\4\1\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"",
			"",
			"",
			"\1\2\42\uffff\1\4\4\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"",
			"\1\2\42\uffff\1\4\4\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"",
			"\1\2\42\uffff\1\4\4\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"\1\2\42\uffff\1\4\4\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"\1\2\42\uffff\1\4\4\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"\1\2\47\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff\1\2\32\uffff"+
			"\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2\1\uffff\1\2"+
			"\12\uffff\1\4\3\uffff\1\2",
			"",
			"\1\2\22\uffff\1\4\24\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\14\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2"+
			"\1\uffff\1\2\16\uffff\1\2",
			"\1\2\47\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\14\uffff\1\2\2\uffff\1\4\5\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\5\uffff\1\4\24\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2"+
			"\17\uffff\1\2\1\uffff\1\2\16\uffff\1\2",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "129:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
		}
	}

	static final String DFA14_eotS =
		"\u00ce\uffff";
	static final String DFA14_eofS =
		"\1\uffff\1\2\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2"+
		"\4\u00ba\uffff";
	static final String DFA14_minS =
		"\1\32\1\12\3\uffff\1\12\3\uffff\1\12\1\uffff\1\12\1\uffff\4\12\1\uffff"+
		"\2\12\u00ba\uffff";
	static final String DFA14_maxS =
		"\1\u010a\1\u0118\3\uffff\1\u0118\3\uffff\1\u0118\1\uffff\1\u0118\1\uffff"+
		"\4\u0118\1\uffff\2\u0118\u00ba\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\uffff\1\1\u00c9\uffff";
	static final String DFA14_specialS =
		"\u00ce\uffff}>";
	static final String[] DFA14_transitionS = {
			"\3\2\1\uffff\2\2\1\uffff\2\2\1\1\13\2\2\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
			"\17\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1\uffff\2\2\1\uffff\4\2\1"+
			"\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5\2\2\uffff\14\2\1\uffff\16"+
			"\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
			"\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\2\17\uffff\3\4\1\uffff\2\4\1\uffff\16\4\2\uffff\1\4\1\15\3\4\1\uffff"+
			"\6\4\1\uffff\1\4\1\uffff\2\4\1\uffff\16\4\1\uffff\1\16\3\4\1\uffff\1"+
			"\4\1\uffff\1\4\1\uffff\4\4\1\uffff\7\4\1\uffff\3\4\1\2\1\4\1\uffff\2"+
			"\4\1\11\1\4\1\2\2\4\1\uffff\11\4\1\23\5\4\1\uffff\2\4\1\5\1\4\1\uffff"+
			"\1\4\1\20\10\4\1\uffff\1\2\3\4\1\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1"+
			"\uffff\1\4\1\13\4\4\1\uffff\1\4\1\uffff\5\4\2\uffff\14\4\1\2\16\4\1\2"+
			"\13\4\1\17\11\4\1\uffff\4\4\1\uffff\4\4\1\uffff\4\4\1\uffff\1\4\1\22"+
			"\1\4\1\uffff\12\4\1\uffff\1\4\1\uffff\1\2\1\4\1\2\1\4\15\uffff\1\2",
			"",
			"",
			"",
			"\1\4\47\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4\1\uffff\1\4"+
			"\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff\1\4\32\uffff"+
			"\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\15\uffff\1\2\1\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"",
			"",
			"",
			"\1\4\42\uffff\1\2\4\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"",
			"\1\4\42\uffff\1\2\4\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"",
			"\1\4\42\uffff\1\2\4\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"\1\4\42\uffff\1\2\4\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"\1\4\42\uffff\1\2\4\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"\1\4\47\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4\1\uffff\1\4"+
			"\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff\1\4\32\uffff"+
			"\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4\1\uffff\1\4"+
			"\12\uffff\1\2\3\uffff\1\4",
			"",
			"\1\4\22\uffff\1\2\24\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4"+
			"\1\uffff\1\4\14\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4"+
			"\1\uffff\1\4\16\uffff\1\4",
			"\1\4\47\uffff\1\4\37\uffff\1\4\30\uffff\1\4\4\uffff\1\4\1\uffff\1\4"+
			"\14\uffff\1\4\2\uffff\1\2\5\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\5\uffff\1\2\24\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4"+
			"\17\uffff\1\4\1\uffff\1\4\16\uffff\1\4",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "129:9: ( KW_AS )?";
		}
	}

	static final String DFA19_eotS =
		"\u0081\uffff";
	static final String DFA19_eofS =
		"\1\uffff\2\3\176\uffff";
	static final String DFA19_minS =
		"\1\32\2\12\23\uffff\1\7\45\uffff\1\7\104\uffff";
	static final String DFA19_maxS =
		"\1\u010a\2\u0118\23\uffff\1\u0120\45\uffff\1\u0120\104\uffff";
	static final String DFA19_acceptS =
		"\3\uffff\1\1\24\uffff\1\2\150\uffff";
	static final String DFA19_specialS =
		"\u0081\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff\1\2"+
			"\1\uffff\2\2\1\uffff\16\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
			"\17\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1\uffff\2\2\1\uffff\4\2\1"+
			"\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5\2\2\uffff\14\2\1\uffff\16"+
			"\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
			"\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\27\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff\1"+
			"\30\12\uffff\1\3\1\30\22\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff\1"+
			"\3\14\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\26\17\uffff\1"+
			"\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1"+
			"\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\16\uffff\1\3",
			"\1\3\27\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff\1"+
			"\30\12\uffff\1\3\1\30\22\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff\1"+
			"\3\14\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\74\17\uffff\1"+
			"\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30\1"+
			"\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\16\uffff\1\3",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\3\3\1\uffff\2\3\1\uffff\25\3\1"+
			"\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff\4\3\1\uffff\1"+
			"\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\22\3\1\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1"+
			"\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff\5\3\2\uffff\14\3\1\uffff\16"+
			"\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff"+
			"\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\30\1\uffff\1\3\2"+
			"\uffff\1\3\2\uffff\2\3\6\uffff\5\3",
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
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\3\3\1\uffff\2\3\1\uffff\25\3\1"+
			"\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff\4\3\1\uffff\1"+
			"\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\22\3\1\uffff\4\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1"+
			"\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff\5\3\2\uffff\14\3\1\uffff\16"+
			"\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1\uffff\4\3\1\uffff\3\3\1\uffff"+
			"\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\30\1\uffff\1\3\2"+
			"\uffff\1\3\2\uffff\2\3\6\uffff\5\3",
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
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "141:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA22_eotS =
		"\u01dc\uffff";
	static final String DFA22_eofS =
		"\3\uffff\2\1\7\uffff\2\1\1\uffff\1\1\1\uffff\4\1\u01c7\uffff";
	static final String DFA22_minS =
		"\1\7\2\uffff\2\4\7\uffff\2\4\1\uffff\1\4\1\uffff\4\4\5\uffff\1\32\60\uffff"+
		"\1\32\55\uffff\1\32\56\uffff\1\32\57\uffff\1\32\56\uffff\1\32\56\uffff"+
		"\1\32\56\uffff\1\32\56\uffff\1\32\107\uffff";
	static final String DFA22_maxS =
		"\1\u0120\2\uffff\1\u011c\1\u011e\7\uffff\2\u011c\1\uffff\1\u011c\1\uffff"+
		"\4\u011c\5\uffff\1\u011c\60\uffff\1\u011c\55\uffff\1\u011c\56\uffff\1"+
		"\u011c\57\uffff\1\u011c\56\uffff\1\u011c\56\uffff\1\u011c\56\uffff\1\u011c"+
		"\56\uffff\1\u011c\107\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\26\uffff\1\2\u01a9\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff"+
		"\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1";
	static final String DFA22_specialS =
		"\u01dc\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\1\23\2\24\1\uffff\2\24\1\uffff\1"+
			"\24\1\17\14\24\2\1\5\24\1\uffff\6\24\1\uffff\1\24\1\uffff\2\24\1\uffff"+
			"\1\24\1\4\14\24\1\uffff\4\24\1\uffff\1\24\1\uffff\1\24\1\uffff\4\24\1"+
			"\uffff\1\24\1\15\5\24\1\uffff\3\24\1\uffff\1\24\1\uffff\4\24\1\uffff"+
			"\2\24\1\1\17\24\1\uffff\4\24\1\uffff\12\24\1\uffff\1\1\3\24\1\uffff\2"+
			"\24\1\1\1\24\1\3\2\24\1\uffff\1\24\1\uffff\6\24\1\uffff\1\24\1\uffff"+
			"\5\24\2\uffff\14\24\1\uffff\16\24\1\uffff\22\24\1\21\2\24\1\uffff\4\24"+
			"\1\uffff\4\24\1\uffff\1\24\1\14\2\24\1\uffff\2\24\1\22\1\uffff\12\24"+
			"\1\uffff\1\24\2\uffff\1\24\1\uffff\1\24\3\uffff\1\1\2\uffff\1\1\2\uffff"+
			"\2\1\6\uffff\1\30\4\1",
			"",
			"",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\32\2\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2"+
			"\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\113\2\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2"+
			"\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\171\2\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2"+
			"\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u00a8\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u00d8\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u0107\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u0136\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u0165\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\u0194\2\uffff\2\1\1\uffff\2\1"+
			"\1\uffff\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\17\1\1\uffff\4\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"\1\u01c2\2\u01c3\1\uffff\2\u01c3\1\uffff\16\u01c3\2\uffff\5\u01c3\1"+
			"\uffff\6\u01c3\1\uffff\1\u01c3\1\uffff\2\u01c3\1\uffff\16\u01c3\1\uffff"+
			"\4\u01c3\1\uffff\1\u01c3\1\uffff\1\u01c3\1\uffff\4\u01c3\1\uffff\7\u01c3"+
			"\1\uffff\3\u01c3\1\uffff\1\u01c3\1\uffff\4\u01c3\1\uffff\2\u01c3\1\uffff"+
			"\17\u01c3\1\uffff\4\u01c3\1\uffff\12\u01c3\2\uffff\3\u01c3\1\uffff\2"+
			"\u01c3\1\uffff\4\u01c3\1\uffff\1\u01c3\1\uffff\6\u01c3\1\uffff\1\u01c3"+
			"\1\uffff\5\u01c3\2\uffff\14\u01c3\1\uffff\16\u01c3\1\uffff\25\u01c3\1"+
			"\uffff\4\u01c3\1\uffff\4\u01c3\1\uffff\4\u01c3\1\uffff\3\u01c3\1\uffff"+
			"\12\u01c3\1\uffff\1\u01c3\2\uffff\1\u01c3\1\uffff\1\u01c3\21\uffff\1"+
			"\30",
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
			"",
			"",
			"",
			"",
			"\1\u01c5\2\u01c6\1\uffff\2\u01c6\1\uffff\16\u01c6\2\uffff\5\u01c6\1"+
			"\uffff\6\u01c6\1\uffff\1\u01c6\1\uffff\2\u01c6\1\uffff\16\u01c6\1\uffff"+
			"\4\u01c6\1\uffff\1\u01c6\1\uffff\1\u01c6\1\uffff\4\u01c6\1\uffff\7\u01c6"+
			"\1\uffff\3\u01c6\1\uffff\1\u01c6\1\uffff\4\u01c6\1\uffff\2\u01c6\1\uffff"+
			"\17\u01c6\1\uffff\4\u01c6\1\uffff\12\u01c6\2\uffff\3\u01c6\1\uffff\2"+
			"\u01c6\1\uffff\4\u01c6\1\uffff\1\u01c6\1\uffff\6\u01c6\1\uffff\1\u01c6"+
			"\1\uffff\5\u01c6\2\uffff\14\u01c6\1\uffff\16\u01c6\1\uffff\25\u01c6\1"+
			"\uffff\4\u01c6\1\uffff\4\u01c6\1\uffff\4\u01c6\1\uffff\3\u01c6\1\uffff"+
			"\12\u01c6\1\uffff\1\u01c6\2\uffff\1\u01c6\1\uffff\1\u01c6\21\uffff\1"+
			"\30",
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
			"",
			"\1\u01c8\2\u01c9\1\uffff\2\u01c9\1\uffff\16\u01c9\2\uffff\5\u01c9\1"+
			"\uffff\6\u01c9\1\uffff\1\u01c9\1\uffff\2\u01c9\1\uffff\16\u01c9\1\uffff"+
			"\4\u01c9\1\uffff\1\u01c9\1\uffff\1\u01c9\1\uffff\4\u01c9\1\uffff\7\u01c9"+
			"\1\uffff\3\u01c9\1\uffff\1\u01c9\1\uffff\4\u01c9\1\uffff\2\u01c9\1\uffff"+
			"\17\u01c9\1\uffff\4\u01c9\1\uffff\12\u01c9\2\uffff\3\u01c9\1\uffff\2"+
			"\u01c9\1\uffff\4\u01c9\1\uffff\1\u01c9\1\uffff\6\u01c9\1\uffff\1\u01c9"+
			"\1\uffff\5\u01c9\2\uffff\14\u01c9\1\uffff\16\u01c9\1\uffff\25\u01c9\1"+
			"\uffff\4\u01c9\1\uffff\4\u01c9\1\uffff\4\u01c9\1\uffff\3\u01c9\1\uffff"+
			"\12\u01c9\1\uffff\1\u01c9\2\uffff\1\u01c9\1\uffff\1\u01c9\21\uffff\1"+
			"\30",
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
			"",
			"",
			"\1\u01cb\2\u01cc\1\uffff\2\u01cc\1\uffff\16\u01cc\2\uffff\5\u01cc\1"+
			"\uffff\6\u01cc\1\uffff\1\u01cc\1\uffff\2\u01cc\1\uffff\16\u01cc\1\uffff"+
			"\4\u01cc\1\uffff\1\u01cc\1\uffff\1\u01cc\1\uffff\4\u01cc\1\uffff\7\u01cc"+
			"\1\uffff\3\u01cc\1\uffff\1\u01cc\1\uffff\4\u01cc\1\uffff\2\u01cc\1\uffff"+
			"\17\u01cc\1\uffff\4\u01cc\1\uffff\12\u01cc\2\uffff\3\u01cc\1\uffff\2"+
			"\u01cc\1\uffff\4\u01cc\1\uffff\1\u01cc\1\uffff\6\u01cc\1\uffff\1\u01cc"+
			"\1\uffff\5\u01cc\2\uffff\14\u01cc\1\uffff\16\u01cc\1\uffff\25\u01cc\1"+
			"\uffff\4\u01cc\1\uffff\4\u01cc\1\uffff\4\u01cc\1\uffff\3\u01cc\1\uffff"+
			"\12\u01cc\1\uffff\1\u01cc\2\uffff\1\u01cc\1\uffff\1\u01cc\21\uffff\1"+
			"\30",
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
			"",
			"",
			"",
			"\1\u01ce\2\u01cf\1\uffff\2\u01cf\1\uffff\16\u01cf\2\uffff\5\u01cf\1"+
			"\uffff\6\u01cf\1\uffff\1\u01cf\1\uffff\2\u01cf\1\uffff\16\u01cf\1\uffff"+
			"\4\u01cf\1\uffff\1\u01cf\1\uffff\1\u01cf\1\uffff\4\u01cf\1\uffff\7\u01cf"+
			"\1\uffff\3\u01cf\1\uffff\1\u01cf\1\uffff\4\u01cf\1\uffff\2\u01cf\1\uffff"+
			"\17\u01cf\1\uffff\4\u01cf\1\uffff\12\u01cf\2\uffff\3\u01cf\1\uffff\2"+
			"\u01cf\1\uffff\4\u01cf\1\uffff\1\u01cf\1\uffff\6\u01cf\1\uffff\1\u01cf"+
			"\1\uffff\5\u01cf\2\uffff\14\u01cf\1\uffff\16\u01cf\1\uffff\25\u01cf\1"+
			"\uffff\4\u01cf\1\uffff\4\u01cf\1\uffff\4\u01cf\1\uffff\3\u01cf\1\uffff"+
			"\12\u01cf\1\uffff\1\u01cf\2\uffff\1\u01cf\1\uffff\1\u01cf\21\uffff\1"+
			"\30",
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
			"",
			"",
			"\1\u01d1\2\u01d2\1\uffff\2\u01d2\1\uffff\16\u01d2\2\uffff\5\u01d2\1"+
			"\uffff\6\u01d2\1\uffff\1\u01d2\1\uffff\2\u01d2\1\uffff\16\u01d2\1\uffff"+
			"\4\u01d2\1\uffff\1\u01d2\1\uffff\1\u01d2\1\uffff\4\u01d2\1\uffff\7\u01d2"+
			"\1\uffff\3\u01d2\1\uffff\1\u01d2\1\uffff\4\u01d2\1\uffff\2\u01d2\1\uffff"+
			"\17\u01d2\1\uffff\4\u01d2\1\uffff\12\u01d2\2\uffff\3\u01d2\1\uffff\2"+
			"\u01d2\1\uffff\4\u01d2\1\uffff\1\u01d2\1\uffff\6\u01d2\1\uffff\1\u01d2"+
			"\1\uffff\5\u01d2\2\uffff\14\u01d2\1\uffff\16\u01d2\1\uffff\25\u01d2\1"+
			"\uffff\4\u01d2\1\uffff\4\u01d2\1\uffff\4\u01d2\1\uffff\3\u01d2\1\uffff"+
			"\12\u01d2\1\uffff\1\u01d2\2\uffff\1\u01d2\1\uffff\1\u01d2\21\uffff\1"+
			"\30",
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
			"",
			"",
			"\1\u01d4\2\u01d5\1\uffff\2\u01d5\1\uffff\16\u01d5\2\uffff\5\u01d5\1"+
			"\uffff\6\u01d5\1\uffff\1\u01d5\1\uffff\2\u01d5\1\uffff\16\u01d5\1\uffff"+
			"\4\u01d5\1\uffff\1\u01d5\1\uffff\1\u01d5\1\uffff\4\u01d5\1\uffff\7\u01d5"+
			"\1\uffff\3\u01d5\1\uffff\1\u01d5\1\uffff\4\u01d5\1\uffff\2\u01d5\1\uffff"+
			"\17\u01d5\1\uffff\4\u01d5\1\uffff\12\u01d5\2\uffff\3\u01d5\1\uffff\2"+
			"\u01d5\1\uffff\4\u01d5\1\uffff\1\u01d5\1\uffff\6\u01d5\1\uffff\1\u01d5"+
			"\1\uffff\5\u01d5\2\uffff\14\u01d5\1\uffff\16\u01d5\1\uffff\25\u01d5\1"+
			"\uffff\4\u01d5\1\uffff\4\u01d5\1\uffff\4\u01d5\1\uffff\3\u01d5\1\uffff"+
			"\12\u01d5\1\uffff\1\u01d5\2\uffff\1\u01d5\1\uffff\1\u01d5\21\uffff\1"+
			"\30",
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
			"",
			"",
			"\1\u01d7\2\u01d8\1\uffff\2\u01d8\1\uffff\16\u01d8\2\uffff\5\u01d8\1"+
			"\uffff\6\u01d8\1\uffff\1\u01d8\1\uffff\2\u01d8\1\uffff\16\u01d8\1\uffff"+
			"\4\u01d8\1\uffff\1\u01d8\1\uffff\1\u01d8\1\uffff\4\u01d8\1\uffff\7\u01d8"+
			"\1\uffff\3\u01d8\1\uffff\1\u01d8\1\uffff\4\u01d8\1\uffff\2\u01d8\1\uffff"+
			"\17\u01d8\1\uffff\4\u01d8\1\uffff\12\u01d8\2\uffff\3\u01d8\1\uffff\2"+
			"\u01d8\1\uffff\4\u01d8\1\uffff\1\u01d8\1\uffff\6\u01d8\1\uffff\1\u01d8"+
			"\1\uffff\5\u01d8\2\uffff\14\u01d8\1\uffff\16\u01d8\1\uffff\25\u01d8\1"+
			"\uffff\4\u01d8\1\uffff\4\u01d8\1\uffff\4\u01d8\1\uffff\3\u01d8\1\uffff"+
			"\12\u01d8\1\uffff\1\u01d8\2\uffff\1\u01d8\1\uffff\1\u01d8\21\uffff\1"+
			"\30",
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
			"",
			"",
			"\1\u01da\2\u01db\1\uffff\2\u01db\1\uffff\16\u01db\2\uffff\5\u01db\1"+
			"\uffff\6\u01db\1\uffff\1\u01db\1\uffff\2\u01db\1\uffff\16\u01db\1\uffff"+
			"\4\u01db\1\uffff\1\u01db\1\uffff\1\u01db\1\uffff\4\u01db\1\uffff\7\u01db"+
			"\1\uffff\3\u01db\1\uffff\1\u01db\1\uffff\4\u01db\1\uffff\2\u01db\1\uffff"+
			"\17\u01db\1\uffff\4\u01db\1\uffff\12\u01db\2\uffff\3\u01db\1\uffff\2"+
			"\u01db\1\uffff\4\u01db\1\uffff\1\u01db\1\uffff\6\u01db\1\uffff\1\u01db"+
			"\1\uffff\5\u01db\2\uffff\14\u01db\1\uffff\16\u01db\1\uffff\25\u01db\1"+
			"\uffff\4\u01db\1\uffff\4\u01db\1\uffff\4\u01db\1\uffff\3\u01db\1\uffff"+
			"\12\u01db\1\uffff\1\u01db\2\uffff\1\u01db\1\uffff\1\u01db\21\uffff\1"+
			"\30",
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
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "146:1: selectExpression : ( expression | tableAllColumns );";
		}
	}

	public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0x5FBFFFFEFC04A080L,0xFFFBD77F7ABFFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDFF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_hintClause_in_selectClause73 = new BitSet(new long[]{0x5FBFFFFEFC042080L,0xFFFBD77F7ABFFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDFF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001001L,0x0000000000000001L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000452FL});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_STAR_in_hintClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_PLUS_in_hintClause424 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000800000L,0x0000000200000000L});
	public static final BitSet FOLLOW_hintList_in_hintClause426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_STAR_in_hintClause428 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintItem_in_hintList469 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_hintList472 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000800000L,0x0000000200000000L});
	public static final BitSet FOLLOW_hintItem_in_hintList474 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_hintName_in_hintItem512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LPAREN_in_hintItem515 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_hintArgs_in_hintItem517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_hintItem519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_HOLD_DDLTIME_in_hintName587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs622 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_hintArgs625 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs627 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_identifier_in_hintArgName669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectItem702 = new BitSet(new long[]{0x5FBE7FFEDC000002L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_KW_AS_in_selectItem712 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_identifier_in_selectItem715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LPAREN_in_selectItem723 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_identifier_in_selectItem725 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_selectItem728 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_identifier_in_selectItem730 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectItem734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_trfmClause789 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001001L,0x0000000000000001L});
	public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause804 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001001L,0x0000000000000001L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_recordWriter_in_trfmClause820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_KW_USING_in_trfmClause826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_StringLiteral_in_trfmClause828 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_AS_in_trfmClause836 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000452FL});
	public static final BitSet FOLLOW_LPAREN_in_trfmClause840 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFE7D7EBDB9FFBDFL,0xFDDEF7BFFFFEFFFDL,0x000000000000052FL});
	public static final BitSet FOLLOW_aliasList_in_trfmClause843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_trfmClause850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_recordReader_in_trfmClause876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectExpression939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectExpression943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList974 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_selectExpressionList977 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFE7D7EBFBDFFBDFL,0xFDDEF7BFFFFEFFFDL,0x00000001F032452FL});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList979 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_WINDOW_in_window_clause1018 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1020 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_window_clause1023 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1025 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_Identifier_in_window_defn1061 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_KW_AS_in_window_defn1063 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_window_specification_in_window_defn1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_window_specification1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_window_specification1107 = new BitSet(new long[]{0x0004000004000000L,0x0000000000040000L,0x0200404000000000L,0x0000000010002000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Identifier_in_window_specification1109 = new BitSet(new long[]{0x0004000000000000L,0x0000000000040000L,0x0200404000000000L,0x0000000010002000L,0x0000000001000000L});
	public static final BitSet FOLLOW_partitioningSpec_in_window_specification1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L,0x0000000000002000L,0x0000000001000000L});
	public static final BitSet FOLLOW_window_frame_in_window_specification1115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_window_specification1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_range_expression_in_window_frame1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_value_expression_in_window_frame1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1172 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1190 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression1192 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1196 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_range_expression1198 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1236 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1254 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1256 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1260 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_value_expression1262 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1367 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_boundary1409 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1420 = new BitSet(new long[]{0x0000000000000002L});
}
