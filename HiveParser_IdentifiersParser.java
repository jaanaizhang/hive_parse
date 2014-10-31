// $ANTLR 3.5.2 IdentifiersParser.g 2014-10-31 18:14:08

package parse;

import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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
public class HiveParser_IdentifiersParser extends Parser {
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
	public static final int TOK_ALIASLIST=554;
	public static final int TOK_ALLCOLREF=555;
	public static final int TOK_ALTERDATABASE_PROPERTIES=556;
	public static final int TOK_ALTERINDEX_PROPERTIES=557;
	public static final int TOK_ALTERINDEX_REBUILD=558;
	public static final int TOK_ALTERTABLE_ADDCOLS=559;
	public static final int TOK_ALTERTABLE_ADDPARTS=560;
	public static final int TOK_ALTERTABLE_ALTERPARTS=561;
	public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=562;
	public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=563;
	public static final int TOK_ALTERTABLE_ARCHIVE=564;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=565;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=566;
	public static final int TOK_ALTERTABLE_DROPPARTS=567;
	public static final int TOK_ALTERTABLE_FILEFORMAT=568;
	public static final int TOK_ALTERTABLE_LOCATION=569;
	public static final int TOK_ALTERTABLE_PARTITION=570;
	public static final int TOK_ALTERTABLE_PROPERTIES=571;
	public static final int TOK_ALTERTABLE_RENAME=572;
	public static final int TOK_ALTERTABLE_RENAMECOL=573;
	public static final int TOK_ALTERTABLE_RENAMEPART=574;
	public static final int TOK_ALTERTABLE_REPLACECOLS=575;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=576;
	public static final int TOK_ALTERTABLE_SERIALIZER=577;
	public static final int TOK_ALTERTABLE_SKEWED=578;
	public static final int TOK_ALTERTABLE_TOUCH=579;
	public static final int TOK_ALTERTABLE_UNARCHIVE=580;
	public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=581;
	public static final int TOK_ALTERVIEW_ADDPARTS=582;
	public static final int TOK_ALTERVIEW_AS=583;
	public static final int TOK_ALTERVIEW_DROPPARTS=584;
	public static final int TOK_ALTERVIEW_PROPERTIES=585;
	public static final int TOK_ALTERVIEW_RENAME=586;
	public static final int TOK_ANALYZE=587;
	public static final int TOK_BIGINT=588;
	public static final int TOK_BINARY=589;
	public static final int TOK_BOOLEAN=590;
	public static final int TOK_CASCADE=591;
	public static final int TOK_CHARSETLITERAL=592;
	public static final int TOK_CLUSTERBY=593;
	public static final int TOK_COLTYPELIST=594;
	public static final int TOK_CREATEDATABASE=595;
	public static final int TOK_CREATEFUNCTION=596;
	public static final int TOK_CREATEINDEX=597;
	public static final int TOK_CREATEINDEX_INDEXTBLNAME=598;
	public static final int TOK_CREATEMACRO=599;
	public static final int TOK_CREATEROLE=600;
	public static final int TOK_CREATETABLE=601;
	public static final int TOK_CREATEVIEW=602;
	public static final int TOK_CROSSJOIN=603;
	public static final int TOK_CUBE_GROUPBY=604;
	public static final int TOK_DATABASECOMMENT=605;
	public static final int TOK_DATABASELOCATION=606;
	public static final int TOK_DATABASEPROPERTIES=607;
	public static final int TOK_DATE=608;
	public static final int TOK_DATELITERAL=609;
	public static final int TOK_DATETIME=610;
	public static final int TOK_DBPROPLIST=611;
	public static final int TOK_DECIMAL=612;
	public static final int TOK_DEFERRED_REBUILDINDEX=613;
	public static final int TOK_DESCDATABASE=614;
	public static final int TOK_DESCFUNCTION=615;
	public static final int TOK_DESCTABLE=616;
	public static final int TOK_DESTINATION=617;
	public static final int TOK_DIR=618;
	public static final int TOK_DISABLE=619;
	public static final int TOK_DISTRIBUTEBY=620;
	public static final int TOK_DOUBLE=621;
	public static final int TOK_DROPDATABASE=622;
	public static final int TOK_DROPFUNCTION=623;
	public static final int TOK_DROPINDEX=624;
	public static final int TOK_DROPMACRO=625;
	public static final int TOK_DROPROLE=626;
	public static final int TOK_DROPTABLE=627;
	public static final int TOK_DROPTABLE_PROPERTIES=628;
	public static final int TOK_DROPVIEW=629;
	public static final int TOK_DROPVIEW_PROPERTIES=630;
	public static final int TOK_ENABLE=631;
	public static final int TOK_EXCHANGEPARTITION=632;
	public static final int TOK_EXPLAIN=633;
	public static final int TOK_EXPLIST=634;
	public static final int TOK_EXPORT=635;
	public static final int TOK_FALSE=636;
	public static final int TOK_FILEFORMAT_GENERIC=637;
	public static final int TOK_FLOAT=638;
	public static final int TOK_FROM=639;
	public static final int TOK_FULLOUTERJOIN=640;
	public static final int TOK_FUNCTION=641;
	public static final int TOK_FUNCTIONDI=642;
	public static final int TOK_FUNCTIONSTAR=643;
	public static final int TOK_GRANT=644;
	public static final int TOK_GRANT_ROLE=645;
	public static final int TOK_GRANT_WITH_OPTION=646;
	public static final int TOK_GROUP=647;
	public static final int TOK_GROUPBY=648;
	public static final int TOK_GROUPING_SETS=649;
	public static final int TOK_GROUPING_SETS_EXPRESSION=650;
	public static final int TOK_HAVING=651;
	public static final int TOK_HINT=652;
	public static final int TOK_HINTARGLIST=653;
	public static final int TOK_HINTLIST=654;
	public static final int TOK_HOLD_DDLTIME=655;
	public static final int TOK_IFEXISTS=656;
	public static final int TOK_IFNOTEXISTS=657;
	public static final int TOK_IGNOREPROTECTION=658;
	public static final int TOK_IMPORT=659;
	public static final int TOK_INCRE=660;
	public static final int TOK_INDEXCOMMENT=661;
	public static final int TOK_INDEXPROPERTIES=662;
	public static final int TOK_INDEXPROPLIST=663;
	public static final int TOK_INSERT=664;
	public static final int TOK_INSERT_INTO=665;
	public static final int TOK_INT=666;
	public static final int TOK_ISNOTNULL=667;
	public static final int TOK_ISNULL=668;
	public static final int TOK_JOIN=669;
	public static final int TOK_LATERAL_VIEW=670;
	public static final int TOK_LATERAL_VIEW_OUTER=671;
	public static final int TOK_LEFTOUTERJOIN=672;
	public static final int TOK_LEFTSEMIJOIN=673;
	public static final int TOK_LENGTH=674;
	public static final int TOK_LIKETABLE=675;
	public static final int TOK_LIMIT=676;
	public static final int TOK_LIST=677;
	public static final int TOK_LOAD=678;
	public static final int TOK_LOCAL_DIR=679;
	public static final int TOK_LOCKTABLE=680;
	public static final int TOK_MAP=681;
	public static final int TOK_MAPJOIN=682;
	public static final int TOK_MSCK=683;
	public static final int TOK_NOT_CLUSTERED=684;
	public static final int TOK_NOT_SORTED=685;
	public static final int TOK_NO_DROP=686;
	public static final int TOK_NULL=687;
	public static final int TOK_OFFLINE=688;
	public static final int TOK_OP_ADD=689;
	public static final int TOK_OP_AND=690;
	public static final int TOK_OP_BITAND=691;
	public static final int TOK_OP_BITNOT=692;
	public static final int TOK_OP_BITOR=693;
	public static final int TOK_OP_BITXOR=694;
	public static final int TOK_OP_DIV=695;
	public static final int TOK_OP_EQ=696;
	public static final int TOK_OP_GE=697;
	public static final int TOK_OP_GT=698;
	public static final int TOK_OP_LE=699;
	public static final int TOK_OP_LIKE=700;
	public static final int TOK_OP_LT=701;
	public static final int TOK_OP_MOD=702;
	public static final int TOK_OP_MUL=703;
	public static final int TOK_OP_NE=704;
	public static final int TOK_OP_NOT=705;
	public static final int TOK_OP_OR=706;
	public static final int TOK_OP_SUB=707;
	public static final int TOK_ORDERBY=708;
	public static final int TOK_ORREPLACE=709;
	public static final int TOK_PARTITIONINGSPEC=710;
	public static final int TOK_PARTITIONLOCATION=711;
	public static final int TOK_PARTSPEC=712;
	public static final int TOK_PARTVAL=713;
	public static final int TOK_PERCENT=714;
	public static final int TOK_PRINCIPAL_NAME=715;
	public static final int TOK_PRIVILEGE=716;
	public static final int TOK_PRIVILEGE_LIST=717;
	public static final int TOK_PRIV_ALL=718;
	public static final int TOK_PRIV_ALTER_DATA=719;
	public static final int TOK_PRIV_ALTER_METADATA=720;
	public static final int TOK_PRIV_CREATE=721;
	public static final int TOK_PRIV_DROP=722;
	public static final int TOK_PRIV_INDEX=723;
	public static final int TOK_PRIV_LOCK=724;
	public static final int TOK_PRIV_OBJECT=725;
	public static final int TOK_PRIV_OBJECT_COL=726;
	public static final int TOK_PRIV_SELECT=727;
	public static final int TOK_PRIV_SHOW_DATABASE=728;
	public static final int TOK_PTBLFUNCTION=729;
	public static final int TOK_QUERY=730;
	public static final int TOK_READONLY=731;
	public static final int TOK_RECORDREADER=732;
	public static final int TOK_RECORDWRITER=733;
	public static final int TOK_RESTRICT=734;
	public static final int TOK_REVOKE=735;
	public static final int TOK_REVOKE_ROLE=736;
	public static final int TOK_RIGHTOUTERJOIN=737;
	public static final int TOK_ROLE=738;
	public static final int TOK_ROLLUP_GROUPBY=739;
	public static final int TOK_ROWCOUNT=740;
	public static final int TOK_SELECT=741;
	public static final int TOK_SELECTDI=742;
	public static final int TOK_SELEXPR=743;
	public static final int TOK_SERDE=744;
	public static final int TOK_SERDENAME=745;
	public static final int TOK_SERDEPROPS=746;
	public static final int TOK_SHOWCOLUMNS=747;
	public static final int TOK_SHOWDATABASES=748;
	public static final int TOK_SHOWFUNCTIONS=749;
	public static final int TOK_SHOWINDEXES=750;
	public static final int TOK_SHOWLOCKS=751;
	public static final int TOK_SHOWPARTITIONS=752;
	public static final int TOK_SHOWTABLES=753;
	public static final int TOK_SHOW_CREATETABLE=754;
	public static final int TOK_SHOW_GRANT=755;
	public static final int TOK_SHOW_ROLE_GRANT=756;
	public static final int TOK_SHOW_TABLESTATUS=757;
	public static final int TOK_SHOW_TBLPROPERTIES=758;
	public static final int TOK_SKEWED_LOCATIONS=759;
	public static final int TOK_SKEWED_LOCATION_LIST=760;
	public static final int TOK_SKEWED_LOCATION_MAP=761;
	public static final int TOK_SMALLINT=762;
	public static final int TOK_SORTBY=763;
	public static final int TOK_STORAGEHANDLER=764;
	public static final int TOK_STOREDASDIRS=765;
	public static final int TOK_STREAMTABLE=766;
	public static final int TOK_STRING=767;
	public static final int TOK_STRINGLITERALSEQUENCE=768;
	public static final int TOK_STRUCT=769;
	public static final int TOK_SUBQUERY=770;
	public static final int TOK_SWITCHDATABASE=771;
	public static final int TOK_TAB=772;
	public static final int TOK_TABALIAS=773;
	public static final int TOK_TABCOL=774;
	public static final int TOK_TABCOLLIST=775;
	public static final int TOK_TABCOLNAME=776;
	public static final int TOK_TABCOLVALUE=777;
	public static final int TOK_TABCOLVALUES=778;
	public static final int TOK_TABCOLVALUE_PAIR=779;
	public static final int TOK_TABLEBUCKETS=780;
	public static final int TOK_TABLEBUCKETSAMPLE=781;
	public static final int TOK_TABLECOMMENT=782;
	public static final int TOK_TABLEFILEFORMAT=783;
	public static final int TOK_TABLELOCATION=784;
	public static final int TOK_TABLEPARTCOLS=785;
	public static final int TOK_TABLEPROPERTIES=786;
	public static final int TOK_TABLEPROPERTY=787;
	public static final int TOK_TABLEPROPLIST=788;
	public static final int TOK_TABLEROWFORMAT=789;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=790;
	public static final int TOK_TABLEROWFORMATFIELD=791;
	public static final int TOK_TABLEROWFORMATLINES=792;
	public static final int TOK_TABLEROWFORMATMAPKEYS=793;
	public static final int TOK_TABLESERIALIZER=794;
	public static final int TOK_TABLESKEWED=795;
	public static final int TOK_TABLESPLITSAMPLE=796;
	public static final int TOK_TABLE_OR_COL=797;
	public static final int TOK_TABLE_PARTITION=798;
	public static final int TOK_TABNAME=799;
	public static final int TOK_TABREF=800;
	public static final int TOK_TABSORTCOLNAMEASC=801;
	public static final int TOK_TABSORTCOLNAMEDESC=802;
	public static final int TOK_TABSRC=803;
	public static final int TOK_TABTYPE=804;
	public static final int TOK_TBLORCFILE=805;
	public static final int TOK_TBLRCFILE=806;
	public static final int TOK_TBLSEQUENCEFILE=807;
	public static final int TOK_TBLTEXTFILE=808;
	public static final int TOK_TIMESTAMP=809;
	public static final int TOK_TINYINT=810;
	public static final int TOK_TMP_FILE=811;
	public static final int TOK_TRANSFORM=812;
	public static final int TOK_TRUE=813;
	public static final int TOK_TRUNCATETABLE=814;
	public static final int TOK_UNION=815;
	public static final int TOK_UNIONTYPE=816;
	public static final int TOK_UNIQUEJOIN=817;
	public static final int TOK_UNLOCKTABLE=818;
	public static final int TOK_USER=819;
	public static final int TOK_USERSCRIPTCOLNAMES=820;
	public static final int TOK_USERSCRIPTCOLSCHEMA=821;
	public static final int TOK_VARCHAR=822;
	public static final int TOK_VIEWPARTCOLS=823;
	public static final int TOK_WHERE=824;
	public static final int TOK_WINDOWDEF=825;
	public static final int TOK_WINDOWRANGE=826;
	public static final int TOK_WINDOWSPEC=827;
	public static final int TOK_WINDOWVALUES=828;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_IdentifiersParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_IdentifiersParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "IdentifiersParser.g"; }


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


	public static class groupByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "groupByClause"
	// IdentifiersParser.g:49:1: groupByClause : KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) ;
	public final HiveParser_IdentifiersParser.groupByClause_return groupByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.groupByClause_return retval = new HiveParser_IdentifiersParser.groupByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token rollup=null;
		Token cube=null;
		Token sets=null;
		Token KW_GROUP1=null;
		Token KW_BY2=null;
		Token COMMA4=null;
		Token KW_ROLLUP6=null;
		Token KW_CUBE7=null;
		Token KW_SETS8=null;
		Token LPAREN9=null;
		Token COMMA11=null;
		Token RPAREN13=null;
		ParserRuleReturnScope groupByExpression3 =null;
		ParserRuleReturnScope groupByExpression5 =null;
		ParserRuleReturnScope groupingSetExpression10 =null;
		ParserRuleReturnScope groupingSetExpression12 =null;

		CommonTree rollup_tree=null;
		CommonTree cube_tree=null;
		CommonTree sets_tree=null;
		CommonTree KW_GROUP1_tree=null;
		CommonTree KW_BY2_tree=null;
		CommonTree COMMA4_tree=null;
		CommonTree KW_ROLLUP6_tree=null;
		CommonTree KW_CUBE7_tree=null;
		CommonTree KW_SETS8_tree=null;
		CommonTree LPAREN9_tree=null;
		CommonTree COMMA11_tree=null;
		CommonTree RPAREN13_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_GROUPING=new RewriteRuleTokenStream(adaptor,"token KW_GROUPING");
		RewriteRuleTokenStream stream_KW_CUBE=new RewriteRuleTokenStream(adaptor,"token KW_CUBE");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_ROLLUP=new RewriteRuleTokenStream(adaptor,"token KW_ROLLUP");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
		RewriteRuleTokenStream stream_KW_SETS=new RewriteRuleTokenStream(adaptor,"token KW_SETS");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_groupingSetExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupingSetExpression");
		RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");

		 gParent.msgs.push("group by clause"); 
		try {
			// IdentifiersParser.g:52:5: ( KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )? -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ ) -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ ) -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ ) -> ^( TOK_GROUPBY ( groupByExpression )+ ) )
			// IdentifiersParser.g:53:5: KW_GROUP KW_BY groupByExpression ( COMMA groupByExpression )* ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )? (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
			{
			KW_GROUP1=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_groupByClause72); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_GROUP.add(KW_GROUP1);

			KW_BY2=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_groupByClause74); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY2);

			pushFollow(FOLLOW_groupByExpression_in_groupByClause80);
			groupByExpression3=groupByExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression3.getTree());
			// IdentifiersParser.g:55:5: ( COMMA groupByExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==COMMA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// IdentifiersParser.g:55:7: COMMA groupByExpression
					{
					COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause88); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA4);

					pushFollow(FOLLOW_groupByExpression_in_groupByClause90);
					groupByExpression5=groupByExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression5.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// IdentifiersParser.g:56:5: ( (rollup= KW_WITH KW_ROLLUP ) | (cube= KW_WITH KW_CUBE ) )?
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==KW_WITH) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==KW_ROLLUP) ) {
					alt2=1;
				}
				else if ( (LA2_1==KW_CUBE) ) {
					alt2=2;
				}
			}
			switch (alt2) {
				case 1 :
					// IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
					{
					// IdentifiersParser.g:56:6: (rollup= KW_WITH KW_ROLLUP )
					// IdentifiersParser.g:56:7: rollup= KW_WITH KW_ROLLUP
					{
					rollup=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause103); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WITH.add(rollup);

					KW_ROLLUP6=(Token)match(input,KW_ROLLUP,FOLLOW_KW_ROLLUP_in_groupByClause105); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROLLUP.add(KW_ROLLUP6);

					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
					{
					// IdentifiersParser.g:56:35: (cube= KW_WITH KW_CUBE )
					// IdentifiersParser.g:56:36: cube= KW_WITH KW_CUBE
					{
					cube=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_groupByClause113); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WITH.add(cube);

					KW_CUBE7=(Token)match(input,KW_CUBE,FOLLOW_KW_CUBE_in_groupByClause115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CUBE.add(KW_CUBE7);

					}

					}
					break;

			}

			// IdentifiersParser.g:57:5: (sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==KW_GROUPING) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// IdentifiersParser.g:57:6: sets= KW_GROUPING KW_SETS LPAREN groupingSetExpression ( COMMA groupingSetExpression )* RPAREN
					{
					sets=(Token)match(input,KW_GROUPING,FOLLOW_KW_GROUPING_in_groupByClause128); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_GROUPING.add(sets);

					KW_SETS8=(Token)match(input,KW_SETS,FOLLOW_KW_SETS_in_groupByClause130); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SETS.add(KW_SETS8);

					LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupByClause137); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN9);

					pushFollow(FOLLOW_groupingSetExpression_in_groupByClause139);
					groupingSetExpression10=groupingSetExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression10.getTree());
					// IdentifiersParser.g:58:34: ( COMMA groupingSetExpression )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// IdentifiersParser.g:58:36: COMMA groupingSetExpression
							{
							COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupByClause143); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);

							pushFollow(FOLLOW_groupingSetExpression_in_groupByClause145);
							groupingSetExpression12=groupingSetExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_groupingSetExpression.add(groupingSetExpression12.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupByClause150); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN13);

					}
					break;

			}

			// AST REWRITE
			// elements: groupByExpression, groupByExpression, groupingSetExpression, groupByExpression, groupByExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 59:5: -> {rollup != null}? ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
			if (rollup != null) {
				// IdentifiersParser.g:59:26: ^( TOK_ROLLUP_GROUPBY ( groupByExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ROLLUP_GROUPBY, "TOK_ROLLUP_GROUPBY"), root_1);
				if ( !(stream_groupByExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_groupByExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_groupByExpression.nextTree());
				}
				stream_groupByExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 60:5: -> {cube != null}? ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
			if (cube != null) {
				// IdentifiersParser.g:60:24: ^( TOK_CUBE_GROUPBY ( groupByExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_CUBE_GROUPBY, "TOK_CUBE_GROUPBY"), root_1);
				if ( !(stream_groupByExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_groupByExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_groupByExpression.nextTree());
				}
				stream_groupByExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 61:5: -> {sets != null}? ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
			if (sets != null) {
				// IdentifiersParser.g:61:24: ^( TOK_GROUPING_SETS ( groupByExpression )+ ( groupingSetExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_GROUPING_SETS, "TOK_GROUPING_SETS"), root_1);
				if ( !(stream_groupByExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_groupByExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_groupByExpression.nextTree());
				}
				stream_groupByExpression.reset();

				if ( !(stream_groupingSetExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_groupingSetExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_groupingSetExpression.nextTree());
				}
				stream_groupingSetExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 62:5: -> ^( TOK_GROUPBY ( groupByExpression )+ )
			{
				// IdentifiersParser.g:62:8: ^( TOK_GROUPBY ( groupByExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_GROUPBY, "TOK_GROUPBY"), root_1);
				if ( !(stream_groupByExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_groupByExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_groupByExpression.nextTree());
				}
				stream_groupByExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupByClause"


	public static class groupingSetExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "groupingSetExpression"
	// IdentifiersParser.g:65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );
	public final HiveParser_IdentifiersParser.groupingSetExpression_return groupingSetExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.groupingSetExpression_return retval = new HiveParser_IdentifiersParser.groupingSetExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN15=null;
		Token COMMA17=null;
		Token RPAREN19=null;
		Token LPAREN20=null;
		Token RPAREN21=null;
		ParserRuleReturnScope groupByExpression14 =null;
		ParserRuleReturnScope groupByExpression16 =null;
		ParserRuleReturnScope groupByExpression18 =null;

		CommonTree LPAREN15_tree=null;
		CommonTree COMMA17_tree=null;
		CommonTree RPAREN19_tree=null;
		CommonTree LPAREN20_tree=null;
		CommonTree RPAREN21_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_groupByExpression=new RewriteRuleSubtreeStream(adaptor,"rule groupByExpression");

		gParent.msgs.push("grouping set expression"); 
		try {
			// IdentifiersParser.g:68:4: ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) )
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// IdentifiersParser.g:69:4: groupByExpression
					{
					pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression244);
					groupByExpression14=groupByExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression14.getTree());
					// AST REWRITE
					// elements: groupByExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 70:4: -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
					{
						// IdentifiersParser.g:70:7: ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_groupByExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:72:4: LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN
					{
					LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression265); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);

					pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression271);
					groupByExpression16=groupByExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression16.getTree());
					// IdentifiersParser.g:73:22: ( COMMA groupByExpression )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// IdentifiersParser.g:73:23: COMMA groupByExpression
							{
							COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupingSetExpression274); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA17);

							pushFollow(FOLLOW_groupByExpression_in_groupingSetExpression276);
							groupByExpression18=groupByExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_groupByExpression.add(groupByExpression18.getTree());
							}
							break;

						default :
							break loop5;
						}
					}

					RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression283); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);

					// AST REWRITE
					// elements: groupByExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 75:4: -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
					{
						// IdentifiersParser.g:75:7: ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION"), root_1);
						if ( !(stream_groupByExpression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_groupByExpression.hasNext() ) {
							adaptor.addChild(root_1, stream_groupByExpression.nextTree());
						}
						stream_groupByExpression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:77:4: LPAREN RPAREN
					{
					LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_groupingSetExpression305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN20);

					RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_groupingSetExpression310); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN21);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 79:4: -> ^( TOK_GROUPING_SETS_EXPRESSION )
					{
						// IdentifiersParser.g:79:7: ^( TOK_GROUPING_SETS_EXPRESSION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_GROUPING_SETS_EXPRESSION, "TOK_GROUPING_SETS_EXPRESSION"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupingSetExpression"


	public static class groupByExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "groupByExpression"
	// IdentifiersParser.g:83:1: groupByExpression : expression ;
	public final HiveParser_IdentifiersParser.groupByExpression_return groupByExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.groupByExpression_return retval = new HiveParser_IdentifiersParser.groupByExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression22 =null;


		 gParent.msgs.push("group by expression"); 
		try {
			// IdentifiersParser.g:86:5: ( expression )
			// IdentifiersParser.g:87:5: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_groupByExpression350);
			expression22=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupByExpression"


	public static class havingClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "havingClause"
	// IdentifiersParser.g:90:1: havingClause : KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) ;
	public final HiveParser_IdentifiersParser.havingClause_return havingClause() throws RecognitionException {
		HiveParser_IdentifiersParser.havingClause_return retval = new HiveParser_IdentifiersParser.havingClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_HAVING23=null;
		ParserRuleReturnScope havingCondition24 =null;

		CommonTree KW_HAVING23_tree=null;
		RewriteRuleTokenStream stream_KW_HAVING=new RewriteRuleTokenStream(adaptor,"token KW_HAVING");
		RewriteRuleSubtreeStream stream_havingCondition=new RewriteRuleSubtreeStream(adaptor,"rule havingCondition");

		 gParent.msgs.push("having clause"); 
		try {
			// IdentifiersParser.g:93:5: ( KW_HAVING havingCondition -> ^( TOK_HAVING havingCondition ) )
			// IdentifiersParser.g:94:5: KW_HAVING havingCondition
			{
			KW_HAVING23=(Token)match(input,KW_HAVING,FOLLOW_KW_HAVING_in_havingClause381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_HAVING.add(KW_HAVING23);

			pushFollow(FOLLOW_havingCondition_in_havingClause383);
			havingCondition24=havingCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_havingCondition.add(havingCondition24.getTree());
			// AST REWRITE
			// elements: havingCondition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 94:31: -> ^( TOK_HAVING havingCondition )
			{
				// IdentifiersParser.g:94:34: ^( TOK_HAVING havingCondition )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HAVING, "TOK_HAVING"), root_1);
				adaptor.addChild(root_1, stream_havingCondition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "havingClause"


	public static class havingCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "havingCondition"
	// IdentifiersParser.g:97:1: havingCondition : expression ;
	public final HiveParser_IdentifiersParser.havingCondition_return havingCondition() throws RecognitionException {
		HiveParser_IdentifiersParser.havingCondition_return retval = new HiveParser_IdentifiersParser.havingCondition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression25 =null;


		 gParent.msgs.push("having condition"); 
		try {
			// IdentifiersParser.g:100:5: ( expression )
			// IdentifiersParser.g:101:5: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_havingCondition422);
			expression25=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "havingCondition"


	public static class orderByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "orderByClause"
	// IdentifiersParser.g:105:1: orderByClause : ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) );
	public final HiveParser_IdentifiersParser.orderByClause_return orderByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.orderByClause_return retval = new HiveParser_IdentifiersParser.orderByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ORDER26=null;
		Token KW_BY27=null;
		Token LPAREN28=null;
		Token COMMA30=null;
		Token RPAREN32=null;
		Token KW_ORDER33=null;
		Token KW_BY34=null;
		Token COMMA36=null;
		ParserRuleReturnScope columnRefOrder29 =null;
		ParserRuleReturnScope columnRefOrder31 =null;
		ParserRuleReturnScope columnRefOrder35 =null;
		ParserRuleReturnScope columnRefOrder37 =null;

		CommonTree KW_ORDER26_tree=null;
		CommonTree KW_BY27_tree=null;
		CommonTree LPAREN28_tree=null;
		CommonTree COMMA30_tree=null;
		CommonTree RPAREN32_tree=null;
		CommonTree KW_ORDER33_tree=null;
		CommonTree KW_BY34_tree=null;
		CommonTree COMMA36_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");

		 gParent.msgs.push("order by clause"); 
		try {
			// IdentifiersParser.g:108:5: ( KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_ORDERBY ( columnRefOrder )+ ) | KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )* -> ^( TOK_ORDERBY ( columnRefOrder )+ ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KW_ORDER) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==KW_BY) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==LPAREN) ) {
						alt9=1;
					}
					else if ( (LA9_2==BigintLiteral||LA9_2==CharSetName||LA9_2==DecimalLiteral||(LA9_2 >= Identifier && LA9_2 <= KW_AFTER)||(LA9_2 >= KW_ALTER && LA9_2 <= KW_ANALYZE)||(LA9_2 >= KW_ARCHIVE && LA9_2 <= KW_COLLECTION)||(LA9_2 >= KW_COLUMNS && LA9_2 <= KW_CREATE)||LA9_2==KW_CUBE||(LA9_2 >= KW_CURSOR && LA9_2 <= KW_DATA)||(LA9_2 >= KW_DATABASES && LA9_2 <= KW_DISABLE)||(LA9_2 >= KW_DISTRIBUTE && LA9_2 <= KW_ELEM_TYPE)||LA9_2==KW_ENABLE||LA9_2==KW_ESCAPED||(LA9_2 >= KW_EXCLUSIVE && LA9_2 <= KW_EXPORT)||(LA9_2 >= KW_EXTERNAL && LA9_2 <= KW_FLOAT)||(LA9_2 >= KW_FOR && LA9_2 <= KW_FORMATTED)||LA9_2==KW_FULL||(LA9_2 >= KW_FUNCTIONS && LA9_2 <= KW_GROUPING)||(LA9_2 >= KW_HOLD_DDLTIME && LA9_2 <= KW_ITEMS)||(LA9_2 >= KW_KEYS && LA9_2 <= KW_LEFT)||(LA9_2 >= KW_LIKE && LA9_2 <= KW_LONG)||(LA9_2 >= KW_MAP && LA9_2 <= KW_MINUS)||(LA9_2 >= KW_MSCK && LA9_2 <= KW_OFFLINE)||LA9_2==KW_OPTION||(LA9_2 >= KW_ORCFILE && LA9_2 <= KW_OUTPUTFORMAT)||LA9_2==KW_OVERWRITE||(LA9_2 >= KW_PARTITION && LA9_2 <= KW_PLUS)||(LA9_2 >= KW_PRETTY && LA9_2 <= KW_RECORDWRITER)||(LA9_2 >= KW_REGEXP && LA9_2 <= KW_SCHEMAS)||(LA9_2 >= KW_SEMI && LA9_2 <= KW_TABLES)||(LA9_2 >= KW_TBLPROPERTIES && LA9_2 <= KW_TEXTFILE)||(LA9_2 >= KW_TIMESTAMP && LA9_2 <= KW_TOUCH)||(LA9_2 >= KW_TRIGGER && LA9_2 <= KW_UNARCHIVE)||(LA9_2 >= KW_UNDO && LA9_2 <= KW_UNIONTYPE)||(LA9_2 >= KW_UNLOCK && LA9_2 <= KW_VALUE_TYPE)||LA9_2==KW_VIEW||LA9_2==KW_WHILE||LA9_2==KW_WITH||LA9_2==MINUS||(LA9_2 >= Number && LA9_2 <= PLUS)||(LA9_2 >= SmallintLiteral && LA9_2 <= TinyintLiteral)) ) {
						alt9=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// IdentifiersParser.g:109:5: KW_ORDER KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
					{
					KW_ORDER26=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause454); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER26);

					KW_BY27=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause456); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY27);

					LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_orderByClause462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN28);

					pushFollow(FOLLOW_columnRefOrder_in_orderByClause464);
					columnRefOrder29=gHiveParser.columnRefOrder();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder29.getTree());
					// IdentifiersParser.g:111:5: ( COMMA columnRefOrder )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// IdentifiersParser.g:111:7: COMMA columnRefOrder
							{
							COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause472); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);

							pushFollow(FOLLOW_columnRefOrder_in_orderByClause474);
							columnRefOrder31=gHiveParser.columnRefOrder();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder31.getTree());
							}
							break;

						default :
							break loop7;
						}
					}

					RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_orderByClause478); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN32);

					// AST REWRITE
					// elements: columnRefOrder
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 111:37: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
					{
						// IdentifiersParser.g:111:40: ^( TOK_ORDERBY ( columnRefOrder )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY"), root_1);
						if ( !(stream_columnRefOrder.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_columnRefOrder.hasNext() ) {
							adaptor.addChild(root_1, stream_columnRefOrder.nextTree());
						}
						stream_columnRefOrder.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:113:5: KW_ORDER KW_BY columnRefOrder ( COMMA columnRefOrder )*
					{
					KW_ORDER33=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_orderByClause499); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ORDER.add(KW_ORDER33);

					KW_BY34=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_orderByClause501); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY34);

					pushFollow(FOLLOW_columnRefOrder_in_orderByClause507);
					columnRefOrder35=gHiveParser.columnRefOrder();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder35.getTree());
					// IdentifiersParser.g:115:5: ( COMMA columnRefOrder )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// IdentifiersParser.g:115:7: COMMA columnRefOrder
							{
							COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderByClause515); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA36);

							pushFollow(FOLLOW_columnRefOrder_in_orderByClause517);
							columnRefOrder37=gHiveParser.columnRefOrder();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder37.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					// AST REWRITE
					// elements: columnRefOrder
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 115:30: -> ^( TOK_ORDERBY ( columnRefOrder )+ )
					{
						// IdentifiersParser.g:115:33: ^( TOK_ORDERBY ( columnRefOrder )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ORDERBY, "TOK_ORDERBY"), root_1);
						if ( !(stream_columnRefOrder.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_columnRefOrder.hasNext() ) {
							adaptor.addChild(root_1, stream_columnRefOrder.nextTree());
						}
						stream_columnRefOrder.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderByClause"


	public static class clusterByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "clusterByClause"
	// IdentifiersParser.g:118:1: clusterByClause : ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) );
	public final HiveParser_IdentifiersParser.clusterByClause_return clusterByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.clusterByClause_return retval = new HiveParser_IdentifiersParser.clusterByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_CLUSTER38=null;
		Token KW_BY39=null;
		Token LPAREN40=null;
		Token COMMA42=null;
		Token RPAREN44=null;
		Token KW_CLUSTER45=null;
		Token KW_BY46=null;
		Token COMMA48=null;
		ParserRuleReturnScope expression41 =null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope expression47 =null;
		ParserRuleReturnScope expression49 =null;

		CommonTree KW_CLUSTER38_tree=null;
		CommonTree KW_BY39_tree=null;
		CommonTree LPAREN40_tree=null;
		CommonTree COMMA42_tree=null;
		CommonTree RPAREN44_tree=null;
		CommonTree KW_CLUSTER45_tree=null;
		CommonTree KW_BY46_tree=null;
		CommonTree COMMA48_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_CLUSTER=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTER");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("cluster by clause"); 
		try {
			// IdentifiersParser.g:121:5: ( KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_CLUSTERBY ( expression )+ ) | KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_CLUSTERBY ( expression )+ ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==KW_CLUSTER) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==KW_BY) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==LPAREN) ) {
						alt12=1;
					}
					else if ( (LA12_2==BigintLiteral||LA12_2==CharSetName||LA12_2==DecimalLiteral||(LA12_2 >= Identifier && LA12_2 <= KW_AFTER)||(LA12_2 >= KW_ALTER && LA12_2 <= KW_ANALYZE)||(LA12_2 >= KW_ARCHIVE && LA12_2 <= KW_COLLECTION)||(LA12_2 >= KW_COLUMNS && LA12_2 <= KW_CREATE)||LA12_2==KW_CUBE||(LA12_2 >= KW_CURSOR && LA12_2 <= KW_DATA)||(LA12_2 >= KW_DATABASES && LA12_2 <= KW_DISABLE)||(LA12_2 >= KW_DISTRIBUTE && LA12_2 <= KW_ELEM_TYPE)||LA12_2==KW_ENABLE||LA12_2==KW_ESCAPED||(LA12_2 >= KW_EXCLUSIVE && LA12_2 <= KW_EXPORT)||(LA12_2 >= KW_EXTERNAL && LA12_2 <= KW_FLOAT)||(LA12_2 >= KW_FOR && LA12_2 <= KW_FORMATTED)||LA12_2==KW_FULL||(LA12_2 >= KW_FUNCTIONS && LA12_2 <= KW_GROUPING)||(LA12_2 >= KW_HOLD_DDLTIME && LA12_2 <= KW_ITEMS)||(LA12_2 >= KW_KEYS && LA12_2 <= KW_LEFT)||(LA12_2 >= KW_LIKE && LA12_2 <= KW_LONG)||(LA12_2 >= KW_MAP && LA12_2 <= KW_MINUS)||(LA12_2 >= KW_MSCK && LA12_2 <= KW_OFFLINE)||LA12_2==KW_OPTION||(LA12_2 >= KW_ORCFILE && LA12_2 <= KW_OUTPUTFORMAT)||LA12_2==KW_OVERWRITE||(LA12_2 >= KW_PARTITION && LA12_2 <= KW_PLUS)||(LA12_2 >= KW_PRETTY && LA12_2 <= KW_RECORDWRITER)||(LA12_2 >= KW_REGEXP && LA12_2 <= KW_SCHEMAS)||(LA12_2 >= KW_SEMI && LA12_2 <= KW_TABLES)||(LA12_2 >= KW_TBLPROPERTIES && LA12_2 <= KW_TEXTFILE)||(LA12_2 >= KW_TIMESTAMP && LA12_2 <= KW_TOUCH)||(LA12_2 >= KW_TRIGGER && LA12_2 <= KW_UNARCHIVE)||(LA12_2 >= KW_UNDO && LA12_2 <= KW_UNIONTYPE)||(LA12_2 >= KW_UNLOCK && LA12_2 <= KW_VALUE_TYPE)||LA12_2==KW_VIEW||LA12_2==KW_WHILE||LA12_2==KW_WITH||LA12_2==MINUS||(LA12_2 >= Number && LA12_2 <= PLUS)||(LA12_2 >= SmallintLiteral && LA12_2 <= TinyintLiteral)) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// IdentifiersParser.g:122:5: KW_CLUSTER KW_BY LPAREN expression ( COMMA expression )* RPAREN
					{
					KW_CLUSTER38=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause559); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER38);

					KW_BY39=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause561); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY39);

					LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_clusterByClause567); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN40);

					pushFollow(FOLLOW_expression_in_clusterByClause569);
					expression41=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());
					// IdentifiersParser.g:123:23: ( COMMA expression )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==COMMA) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// IdentifiersParser.g:123:24: COMMA expression
							{
							COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause572); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA42);

							pushFollow(FOLLOW_expression_in_clusterByClause574);
							expression43=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression43.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_clusterByClause578); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN44);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 123:50: -> ^( TOK_CLUSTERBY ( expression )+ )
					{
						// IdentifiersParser.g:123:53: ^( TOK_CLUSTERBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:125:5: KW_CLUSTER KW_BY expression ( ( COMMA )=> COMMA expression )*
					{
					KW_CLUSTER45=(Token)match(input,KW_CLUSTER,FOLLOW_KW_CLUSTER_in_clusterByClause599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CLUSTER.add(KW_CLUSTER45);

					KW_BY46=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_clusterByClause601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY46);

					pushFollow(FOLLOW_expression_in_clusterByClause607);
					expression47=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());
					// IdentifiersParser.g:127:5: ( ( COMMA )=> COMMA expression )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) && (synpred1_IdentifiersParser())) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// IdentifiersParser.g:127:7: ( COMMA )=> COMMA expression
							{
							COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_clusterByClause619); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);

							pushFollow(FOLLOW_expression_in_clusterByClause621);
							expression49=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());
							}
							break;

						default :
							break loop11;
						}
					}

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:36: -> ^( TOK_CLUSTERBY ( expression )+ )
					{
						// IdentifiersParser.g:127:39: ^( TOK_CLUSTERBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_CLUSTERBY, "TOK_CLUSTERBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "clusterByClause"


	public static class partitionByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionByClause"
	// IdentifiersParser.g:130:1: partitionByClause : ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
	public final HiveParser_IdentifiersParser.partitionByClause_return partitionByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.partitionByClause_return retval = new HiveParser_IdentifiersParser.partitionByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PARTITION50=null;
		Token KW_BY51=null;
		Token LPAREN52=null;
		Token COMMA54=null;
		Token RPAREN56=null;
		Token KW_PARTITION57=null;
		Token KW_BY58=null;
		Token COMMA60=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope expression55 =null;
		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope expression61 =null;

		CommonTree KW_PARTITION50_tree=null;
		CommonTree KW_BY51_tree=null;
		CommonTree LPAREN52_tree=null;
		CommonTree COMMA54_tree=null;
		CommonTree RPAREN56_tree=null;
		CommonTree KW_PARTITION57_tree=null;
		CommonTree KW_BY58_tree=null;
		CommonTree COMMA60_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("partition by clause"); 
		try {
			// IdentifiersParser.g:133:5: ( KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KW_PARTITION) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==KW_BY) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==LPAREN) ) {
						alt15=1;
					}
					else if ( (LA15_2==BigintLiteral||LA15_2==CharSetName||LA15_2==DecimalLiteral||(LA15_2 >= Identifier && LA15_2 <= KW_AFTER)||(LA15_2 >= KW_ALTER && LA15_2 <= KW_ANALYZE)||(LA15_2 >= KW_ARCHIVE && LA15_2 <= KW_COLLECTION)||(LA15_2 >= KW_COLUMNS && LA15_2 <= KW_CREATE)||LA15_2==KW_CUBE||(LA15_2 >= KW_CURSOR && LA15_2 <= KW_DATA)||(LA15_2 >= KW_DATABASES && LA15_2 <= KW_DISABLE)||(LA15_2 >= KW_DISTRIBUTE && LA15_2 <= KW_ELEM_TYPE)||LA15_2==KW_ENABLE||LA15_2==KW_ESCAPED||(LA15_2 >= KW_EXCLUSIVE && LA15_2 <= KW_EXPORT)||(LA15_2 >= KW_EXTERNAL && LA15_2 <= KW_FLOAT)||(LA15_2 >= KW_FOR && LA15_2 <= KW_FORMATTED)||LA15_2==KW_FULL||(LA15_2 >= KW_FUNCTIONS && LA15_2 <= KW_GROUPING)||(LA15_2 >= KW_HOLD_DDLTIME && LA15_2 <= KW_ITEMS)||(LA15_2 >= KW_KEYS && LA15_2 <= KW_LEFT)||(LA15_2 >= KW_LIKE && LA15_2 <= KW_LONG)||(LA15_2 >= KW_MAP && LA15_2 <= KW_MINUS)||(LA15_2 >= KW_MSCK && LA15_2 <= KW_OFFLINE)||LA15_2==KW_OPTION||(LA15_2 >= KW_ORCFILE && LA15_2 <= KW_OUTPUTFORMAT)||LA15_2==KW_OVERWRITE||(LA15_2 >= KW_PARTITION && LA15_2 <= KW_PLUS)||(LA15_2 >= KW_PRETTY && LA15_2 <= KW_RECORDWRITER)||(LA15_2 >= KW_REGEXP && LA15_2 <= KW_SCHEMAS)||(LA15_2 >= KW_SEMI && LA15_2 <= KW_TABLES)||(LA15_2 >= KW_TBLPROPERTIES && LA15_2 <= KW_TEXTFILE)||(LA15_2 >= KW_TIMESTAMP && LA15_2 <= KW_TOUCH)||(LA15_2 >= KW_TRIGGER && LA15_2 <= KW_UNARCHIVE)||(LA15_2 >= KW_UNDO && LA15_2 <= KW_UNIONTYPE)||(LA15_2 >= KW_UNLOCK && LA15_2 <= KW_VALUE_TYPE)||LA15_2==KW_VIEW||LA15_2==KW_WHILE||LA15_2==KW_WITH||LA15_2==MINUS||(LA15_2 >= Number && LA15_2 <= PLUS)||(LA15_2 >= SmallintLiteral && LA15_2 <= TinyintLiteral)) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// IdentifiersParser.g:134:5: KW_PARTITION KW_BY LPAREN expression ( COMMA expression )* RPAREN
					{
					KW_PARTITION50=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause665); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION50);

					KW_BY51=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY51);

					LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionByClause673); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);

					pushFollow(FOLLOW_expression_in_partitionByClause675);
					expression53=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
					// IdentifiersParser.g:135:23: ( COMMA expression )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==COMMA) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// IdentifiersParser.g:135:24: COMMA expression
							{
							COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause678); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);

							pushFollow(FOLLOW_expression_in_partitionByClause680);
							expression55=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());
							}
							break;

						default :
							break loop13;
						}
					}

					RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionByClause684); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN56);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 135:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
					{
						// IdentifiersParser.g:135:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:137:5: KW_PARTITION KW_BY expression ( ( COMMA )=> COMMA expression )*
					{
					KW_PARTITION57=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionByClause705); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION57);

					KW_BY58=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_partitionByClause707); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY58);

					pushFollow(FOLLOW_expression_in_partitionByClause713);
					expression59=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
					// IdentifiersParser.g:138:16: ( ( COMMA )=> COMMA expression )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) && (synpred2_IdentifiersParser())) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// IdentifiersParser.g:138:17: ( COMMA )=> COMMA expression
							{
							COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionByClause721); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA60);

							pushFollow(FOLLOW_expression_in_partitionByClause723);
							expression61=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
							}
							break;

						default :
							break loop14;
						}
					}

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 138:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
					{
						// IdentifiersParser.g:138:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionByClause"


	public static class distributeByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "distributeByClause"
	// IdentifiersParser.g:141:1: distributeByClause : ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) );
	public final HiveParser_IdentifiersParser.distributeByClause_return distributeByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.distributeByClause_return retval = new HiveParser_IdentifiersParser.distributeByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_DISTRIBUTE62=null;
		Token KW_BY63=null;
		Token LPAREN64=null;
		Token COMMA66=null;
		Token RPAREN68=null;
		Token KW_DISTRIBUTE69=null;
		Token KW_BY70=null;
		Token COMMA72=null;
		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope expression67 =null;
		ParserRuleReturnScope expression71 =null;
		ParserRuleReturnScope expression73 =null;

		CommonTree KW_DISTRIBUTE62_tree=null;
		CommonTree KW_BY63_tree=null;
		CommonTree LPAREN64_tree=null;
		CommonTree COMMA66_tree=null;
		CommonTree RPAREN68_tree=null;
		CommonTree KW_DISTRIBUTE69_tree=null;
		CommonTree KW_BY70_tree=null;
		CommonTree COMMA72_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_DISTRIBUTE=new RewriteRuleTokenStream(adaptor,"token KW_DISTRIBUTE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("distribute by clause"); 
		try {
			// IdentifiersParser.g:144:5: ( KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN -> ^( TOK_DISTRIBUTEBY ( expression )+ ) | KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )* -> ^( TOK_DISTRIBUTEBY ( expression )+ ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_DISTRIBUTE) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==KW_BY) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==LPAREN) ) {
						alt18=1;
					}
					else if ( (LA18_2==BigintLiteral||LA18_2==CharSetName||LA18_2==DecimalLiteral||(LA18_2 >= Identifier && LA18_2 <= KW_AFTER)||(LA18_2 >= KW_ALTER && LA18_2 <= KW_ANALYZE)||(LA18_2 >= KW_ARCHIVE && LA18_2 <= KW_COLLECTION)||(LA18_2 >= KW_COLUMNS && LA18_2 <= KW_CREATE)||LA18_2==KW_CUBE||(LA18_2 >= KW_CURSOR && LA18_2 <= KW_DATA)||(LA18_2 >= KW_DATABASES && LA18_2 <= KW_DISABLE)||(LA18_2 >= KW_DISTRIBUTE && LA18_2 <= KW_ELEM_TYPE)||LA18_2==KW_ENABLE||LA18_2==KW_ESCAPED||(LA18_2 >= KW_EXCLUSIVE && LA18_2 <= KW_EXPORT)||(LA18_2 >= KW_EXTERNAL && LA18_2 <= KW_FLOAT)||(LA18_2 >= KW_FOR && LA18_2 <= KW_FORMATTED)||LA18_2==KW_FULL||(LA18_2 >= KW_FUNCTIONS && LA18_2 <= KW_GROUPING)||(LA18_2 >= KW_HOLD_DDLTIME && LA18_2 <= KW_ITEMS)||(LA18_2 >= KW_KEYS && LA18_2 <= KW_LEFT)||(LA18_2 >= KW_LIKE && LA18_2 <= KW_LONG)||(LA18_2 >= KW_MAP && LA18_2 <= KW_MINUS)||(LA18_2 >= KW_MSCK && LA18_2 <= KW_OFFLINE)||LA18_2==KW_OPTION||(LA18_2 >= KW_ORCFILE && LA18_2 <= KW_OUTPUTFORMAT)||LA18_2==KW_OVERWRITE||(LA18_2 >= KW_PARTITION && LA18_2 <= KW_PLUS)||(LA18_2 >= KW_PRETTY && LA18_2 <= KW_RECORDWRITER)||(LA18_2 >= KW_REGEXP && LA18_2 <= KW_SCHEMAS)||(LA18_2 >= KW_SEMI && LA18_2 <= KW_TABLES)||(LA18_2 >= KW_TBLPROPERTIES && LA18_2 <= KW_TEXTFILE)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TOUCH)||(LA18_2 >= KW_TRIGGER && LA18_2 <= KW_UNARCHIVE)||(LA18_2 >= KW_UNDO && LA18_2 <= KW_UNIONTYPE)||(LA18_2 >= KW_UNLOCK && LA18_2 <= KW_VALUE_TYPE)||LA18_2==KW_VIEW||LA18_2==KW_WHILE||LA18_2==KW_WITH||LA18_2==MINUS||(LA18_2 >= Number && LA18_2 <= PLUS)||(LA18_2 >= SmallintLiteral && LA18_2 <= TinyintLiteral)) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// IdentifiersParser.g:145:5: KW_DISTRIBUTE KW_BY LPAREN expression ( COMMA expression )* RPAREN
					{
					KW_DISTRIBUTE62=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE62);

					KW_BY63=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause767); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY63);

					LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_distributeByClause773); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN64);

					pushFollow(FOLLOW_expression_in_distributeByClause775);
					expression65=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());
					// IdentifiersParser.g:146:23: ( COMMA expression )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// IdentifiersParser.g:146:24: COMMA expression
							{
							COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause778); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA66);

							pushFollow(FOLLOW_expression_in_distributeByClause780);
							expression67=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					RPAREN68=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_distributeByClause784); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN68);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 146:50: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
					{
						// IdentifiersParser.g:146:53: ^( TOK_DISTRIBUTEBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:148:5: KW_DISTRIBUTE KW_BY expression ( ( COMMA )=> COMMA expression )*
					{
					KW_DISTRIBUTE69=(Token)match(input,KW_DISTRIBUTE,FOLLOW_KW_DISTRIBUTE_in_distributeByClause805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_DISTRIBUTE.add(KW_DISTRIBUTE69);

					KW_BY70=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_distributeByClause807); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY70);

					pushFollow(FOLLOW_expression_in_distributeByClause813);
					expression71=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression71.getTree());
					// IdentifiersParser.g:149:16: ( ( COMMA )=> COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) && (synpred3_IdentifiersParser())) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// IdentifiersParser.g:149:17: ( COMMA )=> COMMA expression
							{
							COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_distributeByClause821); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA72);

							pushFollow(FOLLOW_expression_in_distributeByClause823);
							expression73=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 149:46: -> ^( TOK_DISTRIBUTEBY ( expression )+ )
					{
						// IdentifiersParser.g:149:49: ^( TOK_DISTRIBUTEBY ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DISTRIBUTEBY, "TOK_DISTRIBUTEBY"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "distributeByClause"


	public static class sortByClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sortByClause"
	// IdentifiersParser.g:152:1: sortByClause : ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) );
	public final HiveParser_IdentifiersParser.sortByClause_return sortByClause() throws RecognitionException {
		HiveParser_IdentifiersParser.sortByClause_return retval = new HiveParser_IdentifiersParser.sortByClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_SORT74=null;
		Token KW_BY75=null;
		Token LPAREN76=null;
		Token COMMA78=null;
		Token RPAREN80=null;
		Token KW_SORT81=null;
		Token KW_BY82=null;
		Token COMMA84=null;
		ParserRuleReturnScope columnRefOrder77 =null;
		ParserRuleReturnScope columnRefOrder79 =null;
		ParserRuleReturnScope columnRefOrder83 =null;
		ParserRuleReturnScope columnRefOrder85 =null;

		CommonTree KW_SORT74_tree=null;
		CommonTree KW_BY75_tree=null;
		CommonTree LPAREN76_tree=null;
		CommonTree COMMA78_tree=null;
		CommonTree RPAREN80_tree=null;
		CommonTree KW_SORT81_tree=null;
		CommonTree KW_BY82_tree=null;
		CommonTree COMMA84_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_SORT=new RewriteRuleTokenStream(adaptor,"token KW_SORT");
		RewriteRuleTokenStream stream_KW_BY=new RewriteRuleTokenStream(adaptor,"token KW_BY");
		RewriteRuleSubtreeStream stream_columnRefOrder=new RewriteRuleSubtreeStream(adaptor,"rule columnRefOrder");

		 gParent.msgs.push("sort by clause"); 
		try {
			// IdentifiersParser.g:155:5: ( KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN -> ^( TOK_SORTBY ( columnRefOrder )+ ) | KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )* -> ^( TOK_SORTBY ( columnRefOrder )+ ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==KW_SORT) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==KW_BY) ) {
					int LA21_2 = input.LA(3);
					if ( (LA21_2==LPAREN) ) {
						alt21=1;
					}
					else if ( (LA21_2==BigintLiteral||LA21_2==CharSetName||LA21_2==DecimalLiteral||(LA21_2 >= Identifier && LA21_2 <= KW_AFTER)||(LA21_2 >= KW_ALTER && LA21_2 <= KW_ANALYZE)||(LA21_2 >= KW_ARCHIVE && LA21_2 <= KW_COLLECTION)||(LA21_2 >= KW_COLUMNS && LA21_2 <= KW_CREATE)||LA21_2==KW_CUBE||(LA21_2 >= KW_CURSOR && LA21_2 <= KW_DATA)||(LA21_2 >= KW_DATABASES && LA21_2 <= KW_DISABLE)||(LA21_2 >= KW_DISTRIBUTE && LA21_2 <= KW_ELEM_TYPE)||LA21_2==KW_ENABLE||LA21_2==KW_ESCAPED||(LA21_2 >= KW_EXCLUSIVE && LA21_2 <= KW_EXPORT)||(LA21_2 >= KW_EXTERNAL && LA21_2 <= KW_FLOAT)||(LA21_2 >= KW_FOR && LA21_2 <= KW_FORMATTED)||LA21_2==KW_FULL||(LA21_2 >= KW_FUNCTIONS && LA21_2 <= KW_GROUPING)||(LA21_2 >= KW_HOLD_DDLTIME && LA21_2 <= KW_ITEMS)||(LA21_2 >= KW_KEYS && LA21_2 <= KW_LEFT)||(LA21_2 >= KW_LIKE && LA21_2 <= KW_LONG)||(LA21_2 >= KW_MAP && LA21_2 <= KW_MINUS)||(LA21_2 >= KW_MSCK && LA21_2 <= KW_OFFLINE)||LA21_2==KW_OPTION||(LA21_2 >= KW_ORCFILE && LA21_2 <= KW_OUTPUTFORMAT)||LA21_2==KW_OVERWRITE||(LA21_2 >= KW_PARTITION && LA21_2 <= KW_PLUS)||(LA21_2 >= KW_PRETTY && LA21_2 <= KW_RECORDWRITER)||(LA21_2 >= KW_REGEXP && LA21_2 <= KW_SCHEMAS)||(LA21_2 >= KW_SEMI && LA21_2 <= KW_TABLES)||(LA21_2 >= KW_TBLPROPERTIES && LA21_2 <= KW_TEXTFILE)||(LA21_2 >= KW_TIMESTAMP && LA21_2 <= KW_TOUCH)||(LA21_2 >= KW_TRIGGER && LA21_2 <= KW_UNARCHIVE)||(LA21_2 >= KW_UNDO && LA21_2 <= KW_UNIONTYPE)||(LA21_2 >= KW_UNLOCK && LA21_2 <= KW_VALUE_TYPE)||LA21_2==KW_VIEW||LA21_2==KW_WHILE||LA21_2==KW_WITH||LA21_2==MINUS||(LA21_2 >= Number && LA21_2 <= PLUS)||(LA21_2 >= SmallintLiteral && LA21_2 <= TinyintLiteral)) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// IdentifiersParser.g:156:5: KW_SORT KW_BY LPAREN columnRefOrder ( COMMA columnRefOrder )* RPAREN
					{
					KW_SORT74=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause865); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT74);

					KW_BY75=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause867); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY75);

					LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sortByClause873); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);

					pushFollow(FOLLOW_columnRefOrder_in_sortByClause875);
					columnRefOrder77=gHiveParser.columnRefOrder();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder77.getTree());
					// IdentifiersParser.g:158:5: ( COMMA columnRefOrder )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==COMMA) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// IdentifiersParser.g:158:7: COMMA columnRefOrder
							{
							COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause883); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);

							pushFollow(FOLLOW_columnRefOrder_in_sortByClause885);
							columnRefOrder79=gHiveParser.columnRefOrder();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder79.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sortByClause889); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN80);

					// AST REWRITE
					// elements: columnRefOrder
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 158:37: -> ^( TOK_SORTBY ( columnRefOrder )+ )
					{
						// IdentifiersParser.g:158:40: ^( TOK_SORTBY ( columnRefOrder )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY"), root_1);
						if ( !(stream_columnRefOrder.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_columnRefOrder.hasNext() ) {
							adaptor.addChild(root_1, stream_columnRefOrder.nextTree());
						}
						stream_columnRefOrder.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:160:5: KW_SORT KW_BY columnRefOrder ( ( COMMA )=> COMMA columnRefOrder )*
					{
					KW_SORT81=(Token)match(input,KW_SORT,FOLLOW_KW_SORT_in_sortByClause910); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SORT.add(KW_SORT81);

					KW_BY82=(Token)match(input,KW_BY,FOLLOW_KW_BY_in_sortByClause912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BY.add(KW_BY82);

					pushFollow(FOLLOW_columnRefOrder_in_sortByClause918);
					columnRefOrder83=gHiveParser.columnRefOrder();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder83.getTree());
					// IdentifiersParser.g:162:5: ( ( COMMA )=> COMMA columnRefOrder )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==COMMA) && (synpred4_IdentifiersParser())) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// IdentifiersParser.g:162:7: ( COMMA )=> COMMA columnRefOrder
							{
							COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_sortByClause931); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);

							pushFollow(FOLLOW_columnRefOrder_in_sortByClause933);
							columnRefOrder85=gHiveParser.columnRefOrder();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_columnRefOrder.add(columnRefOrder85.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					// AST REWRITE
					// elements: columnRefOrder
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:40: -> ^( TOK_SORTBY ( columnRefOrder )+ )
					{
						// IdentifiersParser.g:162:43: ^( TOK_SORTBY ( columnRefOrder )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SORTBY, "TOK_SORTBY"), root_1);
						if ( !(stream_columnRefOrder.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_columnRefOrder.hasNext() ) {
							adaptor.addChild(root_1, stream_columnRefOrder.nextTree());
						}
						stream_columnRefOrder.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sortByClause"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// IdentifiersParser.g:166:1: function : functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) ;
	public final HiveParser_IdentifiersParser.function_return function() throws RecognitionException {
		HiveParser_IdentifiersParser.function_return retval = new HiveParser_IdentifiersParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token star=null;
		Token dist=null;
		Token LPAREN87=null;
		Token COMMA89=null;
		Token RPAREN91=null;
		Token KW_OVER92=null;
		ParserRuleReturnScope ws =null;
		ParserRuleReturnScope functionName86 =null;
		ParserRuleReturnScope selectExpression88 =null;
		ParserRuleReturnScope selectExpression90 =null;

		CommonTree star_tree=null;
		CommonTree dist_tree=null;
		CommonTree LPAREN87_tree=null;
		CommonTree COMMA89_tree=null;
		CommonTree RPAREN91_tree=null;
		CommonTree KW_OVER92_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_KW_OVER=new RewriteRuleTokenStream(adaptor,"token KW_OVER");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
		RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");

		 gParent.msgs.push("function specification"); 
		try {
			// IdentifiersParser.g:169:5: ( functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )? -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? ) -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? ) -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? ) )
			// IdentifiersParser.g:170:5: functionName LPAREN ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? ) RPAREN ( KW_OVER ws= window_specification )?
			{
			pushFollow(FOLLOW_functionName_in_function976);
			functionName86=functionName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionName.add(functionName86.getTree());
			LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function982); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN87);

			// IdentifiersParser.g:172:7: ( (star= STAR ) | (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )? )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==STAR) ) {
				alt25=1;
			}
			else if ( (LA25_0==BigintLiteral||LA25_0==CharSetName||LA25_0==DecimalLiteral||(LA25_0 >= Identifier && LA25_0 <= KW_AFTER)||(LA25_0 >= KW_ALTER && LA25_0 <= KW_ANALYZE)||(LA25_0 >= KW_ARCHIVE && LA25_0 <= KW_COLLECTION)||(LA25_0 >= KW_COLUMNS && LA25_0 <= KW_CREATE)||LA25_0==KW_CUBE||(LA25_0 >= KW_CURSOR && LA25_0 <= KW_DATA)||(LA25_0 >= KW_DATABASES && LA25_0 <= KW_ELEM_TYPE)||LA25_0==KW_ENABLE||LA25_0==KW_ESCAPED||(LA25_0 >= KW_EXCLUSIVE && LA25_0 <= KW_EXPORT)||(LA25_0 >= KW_EXTERNAL && LA25_0 <= KW_FLOAT)||(LA25_0 >= KW_FOR && LA25_0 <= KW_FORMATTED)||LA25_0==KW_FULL||(LA25_0 >= KW_FUNCTIONS && LA25_0 <= KW_GROUPING)||(LA25_0 >= KW_HOLD_DDLTIME && LA25_0 <= KW_ITEMS)||(LA25_0 >= KW_KEYS && LA25_0 <= KW_LEFT)||(LA25_0 >= KW_LIKE && LA25_0 <= KW_LONG)||(LA25_0 >= KW_MAP && LA25_0 <= KW_MINUS)||(LA25_0 >= KW_MSCK && LA25_0 <= KW_OFFLINE)||LA25_0==KW_OPTION||(LA25_0 >= KW_ORCFILE && LA25_0 <= KW_OUTPUTFORMAT)||LA25_0==KW_OVERWRITE||(LA25_0 >= KW_PARTITION && LA25_0 <= KW_PLUS)||(LA25_0 >= KW_PRETTY && LA25_0 <= KW_RECORDWRITER)||(LA25_0 >= KW_REGEXP && LA25_0 <= KW_SCHEMAS)||(LA25_0 >= KW_SEMI && LA25_0 <= KW_TABLES)||(LA25_0 >= KW_TBLPROPERTIES && LA25_0 <= KW_TEXTFILE)||(LA25_0 >= KW_TIMESTAMP && LA25_0 <= KW_TOUCH)||(LA25_0 >= KW_TRIGGER && LA25_0 <= KW_UNARCHIVE)||(LA25_0 >= KW_UNDO && LA25_0 <= KW_UNIONTYPE)||(LA25_0 >= KW_UNLOCK && LA25_0 <= KW_VALUE_TYPE)||LA25_0==KW_VIEW||LA25_0==KW_WHILE||LA25_0==KW_WITH||LA25_0==LPAREN||LA25_0==MINUS||(LA25_0 >= Number && LA25_0 <= PLUS)||LA25_0==RPAREN||(LA25_0 >= SmallintLiteral && LA25_0 <= TinyintLiteral)) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// IdentifiersParser.g:173:9: (star= STAR )
					{
					// IdentifiersParser.g:173:9: (star= STAR )
					// IdentifiersParser.g:173:10: star= STAR
					{
					star=(Token)match(input,STAR,FOLLOW_STAR_in_function1003); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(star);

					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:174:11: (dist= KW_DISTINCT )? ( selectExpression ( COMMA selectExpression )* )?
					{
					// IdentifiersParser.g:174:11: (dist= KW_DISTINCT )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==KW_DISTINCT) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// IdentifiersParser.g:174:12: dist= KW_DISTINCT
							{
							dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_function1019); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);

							}
							break;

					}

					// IdentifiersParser.g:174:31: ( selectExpression ( COMMA selectExpression )* )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==BigintLiteral||LA24_0==CharSetName||LA24_0==DecimalLiteral||(LA24_0 >= Identifier && LA24_0 <= KW_AFTER)||(LA24_0 >= KW_ALTER && LA24_0 <= KW_ANALYZE)||(LA24_0 >= KW_ARCHIVE && LA24_0 <= KW_COLLECTION)||(LA24_0 >= KW_COLUMNS && LA24_0 <= KW_CREATE)||LA24_0==KW_CUBE||(LA24_0 >= KW_CURSOR && LA24_0 <= KW_DATA)||(LA24_0 >= KW_DATABASES && LA24_0 <= KW_DISABLE)||(LA24_0 >= KW_DISTRIBUTE && LA24_0 <= KW_ELEM_TYPE)||LA24_0==KW_ENABLE||LA24_0==KW_ESCAPED||(LA24_0 >= KW_EXCLUSIVE && LA24_0 <= KW_EXPORT)||(LA24_0 >= KW_EXTERNAL && LA24_0 <= KW_FLOAT)||(LA24_0 >= KW_FOR && LA24_0 <= KW_FORMATTED)||LA24_0==KW_FULL||(LA24_0 >= KW_FUNCTIONS && LA24_0 <= KW_GROUPING)||(LA24_0 >= KW_HOLD_DDLTIME && LA24_0 <= KW_ITEMS)||(LA24_0 >= KW_KEYS && LA24_0 <= KW_LEFT)||(LA24_0 >= KW_LIKE && LA24_0 <= KW_LONG)||(LA24_0 >= KW_MAP && LA24_0 <= KW_MINUS)||(LA24_0 >= KW_MSCK && LA24_0 <= KW_OFFLINE)||LA24_0==KW_OPTION||(LA24_0 >= KW_ORCFILE && LA24_0 <= KW_OUTPUTFORMAT)||LA24_0==KW_OVERWRITE||(LA24_0 >= KW_PARTITION && LA24_0 <= KW_PLUS)||(LA24_0 >= KW_PRETTY && LA24_0 <= KW_RECORDWRITER)||(LA24_0 >= KW_REGEXP && LA24_0 <= KW_SCHEMAS)||(LA24_0 >= KW_SEMI && LA24_0 <= KW_TABLES)||(LA24_0 >= KW_TBLPROPERTIES && LA24_0 <= KW_TEXTFILE)||(LA24_0 >= KW_TIMESTAMP && LA24_0 <= KW_TOUCH)||(LA24_0 >= KW_TRIGGER && LA24_0 <= KW_UNARCHIVE)||(LA24_0 >= KW_UNDO && LA24_0 <= KW_UNIONTYPE)||(LA24_0 >= KW_UNLOCK && LA24_0 <= KW_VALUE_TYPE)||LA24_0==KW_VIEW||LA24_0==KW_WHILE||LA24_0==KW_WITH||LA24_0==LPAREN||LA24_0==MINUS||(LA24_0 >= Number && LA24_0 <= PLUS)||(LA24_0 >= STAR && LA24_0 <= TinyintLiteral)) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// IdentifiersParser.g:174:32: selectExpression ( COMMA selectExpression )*
							{
							pushFollow(FOLLOW_selectExpression_in_function1024);
							selectExpression88=gHiveParser.selectExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression88.getTree());
							// IdentifiersParser.g:174:49: ( COMMA selectExpression )*
							loop23:
							while (true) {
								int alt23=2;
								int LA23_0 = input.LA(1);
								if ( (LA23_0==COMMA) ) {
									alt23=1;
								}

								switch (alt23) {
								case 1 :
									// IdentifiersParser.g:174:50: COMMA selectExpression
									{
									COMMA89=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1027); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA89);

									pushFollow(FOLLOW_selectExpression_in_function1029);
									selectExpression90=gHiveParser.selectExpression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression90.getTree());
									}
									break;

								default :
									break loop23;
								}
							}

							}
							break;

					}

					}
					break;

			}

			RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function1047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);

			// IdentifiersParser.g:176:12: ( KW_OVER ws= window_specification )?
			int alt26=2;
			alt26 = dfa26.predict(input);
			switch (alt26) {
				case 1 :
					// IdentifiersParser.g:176:13: KW_OVER ws= window_specification
					{
					KW_OVER92=(Token)match(input,KW_OVER,FOLLOW_KW_OVER_in_function1050); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OVER.add(KW_OVER92);

					pushFollow(FOLLOW_window_specification_in_function1054);
					ws=gHiveParser.window_specification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_specification.add(ws.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ws, selectExpression, selectExpression, ws, functionName, functionName, functionName
			// token labels: 
			// rule labels: retval, ws
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws",ws!=null?ws.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 177:12: -> {$star != null}? ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
			if (star != null) {
				// IdentifiersParser.g:177:32: ^( TOK_FUNCTIONSTAR functionName ( $ws)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTIONSTAR, "TOK_FUNCTIONSTAR"), root_1);
				adaptor.addChild(root_1, stream_functionName.nextTree());
				// IdentifiersParser.g:177:65: ( $ws)?
				if ( stream_ws.hasNext() ) {
					adaptor.addChild(root_1, stream_ws.nextTree());
				}
				stream_ws.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 178:12: -> {$dist == null}? ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
			if (dist == null) {
				// IdentifiersParser.g:178:32: ^( TOK_FUNCTION functionName ( ( selectExpression )+ )? ( $ws)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_functionName.nextTree());
				// IdentifiersParser.g:178:60: ( ( selectExpression )+ )?
				if ( stream_selectExpression.hasNext() ) {
					if ( !(stream_selectExpression.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_selectExpression.hasNext() ) {
						adaptor.addChild(root_1, stream_selectExpression.nextTree());
					}
					stream_selectExpression.reset();

				}
				stream_selectExpression.reset();

				// IdentifiersParser.g:178:82: ( $ws)?
				if ( stream_ws.hasNext() ) {
					adaptor.addChild(root_1, stream_ws.nextTree());
				}
				stream_ws.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 179:29: -> ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
			{
				// IdentifiersParser.g:179:32: ^( TOK_FUNCTIONDI functionName ( ( selectExpression )+ )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTIONDI, "TOK_FUNCTIONDI"), root_1);
				adaptor.addChild(root_1, stream_functionName.nextTree());
				// IdentifiersParser.g:179:62: ( ( selectExpression )+ )?
				if ( stream_selectExpression.hasNext() ) {
					if ( !(stream_selectExpression.hasNext()) ) {
						throw new RewriteEarlyExitException();
					}
					while ( stream_selectExpression.hasNext() ) {
						adaptor.addChild(root_1, stream_selectExpression.nextTree());
					}
					stream_selectExpression.reset();

				}
				stream_selectExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class functionName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionName"
	// IdentifiersParser.g:182:1: functionName : ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | identifier );
	public final HiveParser_IdentifiersParser.functionName_return functionName() throws RecognitionException {
		HiveParser_IdentifiersParser.functionName_return retval = new HiveParser_IdentifiersParser.functionName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_IF93=null;
		Token KW_ARRAY94=null;
		Token KW_MAP95=null;
		Token KW_STRUCT96=null;
		Token KW_UNIONTYPE97=null;
		ParserRuleReturnScope identifier98 =null;

		CommonTree KW_IF93_tree=null;
		CommonTree KW_ARRAY94_tree=null;
		CommonTree KW_MAP95_tree=null;
		CommonTree KW_STRUCT96_tree=null;
		CommonTree KW_UNIONTYPE97_tree=null;

		 gParent.msgs.push("function name"); 
		try {
			// IdentifiersParser.g:185:5: ( KW_IF | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | identifier )
			int alt27=6;
			switch ( input.LA(1) ) {
			case KW_IF:
				{
				alt27=1;
				}
				break;
			case KW_ARRAY:
				{
				alt27=2;
				}
				break;
			case KW_MAP:
				{
				alt27=3;
				}
				break;
			case KW_STRUCT:
				{
				alt27=4;
				}
				break;
			case KW_UNIONTYPE:
				{
				alt27=5;
				}
				break;
			case Identifier:
			case KW_ADD:
			case KW_AFTER:
			case KW_ALTER:
			case KW_ANALYZE:
			case KW_ARCHIVE:
			case KW_AS:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BETWEEN:
			case KW_BIGINT:
			case KW_BINARY:
			case KW_BOOLEAN:
			case KW_BOTH:
			case KW_BUCKET:
			case KW_BUCKETS:
			case KW_BY:
			case KW_CASCADE:
			case KW_CHANGE:
			case KW_CLUSTER:
			case KW_CLUSTERED:
			case KW_CLUSTERSTATUS:
			case KW_COLLECTION:
			case KW_COLUMNS:
			case KW_COMMENT:
			case KW_COMPUTE:
			case KW_CONCATENATE:
			case KW_CONTINUE:
			case KW_CREATE:
			case KW_CUBE:
			case KW_CURSOR:
			case KW_DATA:
			case KW_DATABASES:
			case KW_DATE:
			case KW_DATETIME:
			case KW_DBPROPERTIES:
			case KW_DECIMAL:
			case KW_DEFERRED:
			case KW_DELETE:
			case KW_DELIMITED:
			case KW_DEPENDENCY:
			case KW_DESC:
			case KW_DESCRIBE:
			case KW_DIRECTORIES:
			case KW_DIRECTORY:
			case KW_DISABLE:
			case KW_DISTRIBUTE:
			case KW_DOUBLE:
			case KW_DROP:
			case KW_ELEM_TYPE:
			case KW_ENABLE:
			case KW_ESCAPED:
			case KW_EXCLUSIVE:
			case KW_EXISTS:
			case KW_EXPLAIN:
			case KW_EXPORT:
			case KW_EXTERNAL:
			case KW_FALSE:
			case KW_FETCH:
			case KW_FIELDS:
			case KW_FILEFORMAT:
			case KW_FIRST:
			case KW_FLOAT:
			case KW_FOR:
			case KW_FORMAT:
			case KW_FORMATTED:
			case KW_FULL:
			case KW_FUNCTIONS:
			case KW_GRANT:
			case KW_GROUP:
			case KW_GROUPING:
			case KW_HOLD_DDLTIME:
			case KW_IDXPROPERTIES:
			case KW_IGNORE:
			case KW_IMPORT:
			case KW_IN:
			case KW_INCRE:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_INNER:
			case KW_INPATH:
			case KW_INPUTDRIVER:
			case KW_INPUTFORMAT:
			case KW_INSERT:
			case KW_INT:
			case KW_INTERSECT:
			case KW_INTO:
			case KW_IS:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_LATERAL:
			case KW_LEFT:
			case KW_LIKE:
			case KW_LIMIT:
			case KW_LINES:
			case KW_LOAD:
			case KW_LOCAL:
			case KW_LOCATION:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_LOGICAL:
			case KW_LONG:
			case KW_MAPJOIN:
			case KW_MATERIALIZED:
			case KW_MINUS:
			case KW_MSCK:
			case KW_NOSCAN:
			case KW_NO_DROP:
			case KW_NULL:
			case KW_OF:
			case KW_OFFLINE:
			case KW_OPTION:
			case KW_ORCFILE:
			case KW_ORDER:
			case KW_OUT:
			case KW_OUTER:
			case KW_OUTPUTDRIVER:
			case KW_OUTPUTFORMAT:
			case KW_OVERWRITE:
			case KW_PARTITION:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PERCENT:
			case KW_PLUS:
			case KW_PRETTY:
			case KW_PROCEDURE:
			case KW_PROTECTION:
			case KW_PURGE:
			case KW_RANGE:
			case KW_RCFILE:
			case KW_READ:
			case KW_READONLY:
			case KW_READS:
			case KW_REBUILD:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_REGEXP:
			case KW_RENAME:
			case KW_REPAIR:
			case KW_REPLACE:
			case KW_RESTRICT:
			case KW_REVOKE:
			case KW_RIGHT:
			case KW_RLIKE:
			case KW_ROLE:
			case KW_ROLLUP:
			case KW_ROW:
			case KW_ROWS:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SEMI:
			case KW_SEQUENCEFILE:
			case KW_SERDE:
			case KW_SERDEPROPERTIES:
			case KW_SET:
			case KW_SETS:
			case KW_SHARED:
			case KW_SHOW:
			case KW_SHOW_DATABASE:
			case KW_SKEWED:
			case KW_SMALLINT:
			case KW_SORT:
			case KW_SORTED:
			case KW_SSL:
			case KW_STATISTICS:
			case KW_STORED:
			case KW_STREAMTABLE:
			case KW_STRING:
			case KW_TABLE:
			case KW_TABLES:
			case KW_TBLPROPERTIES:
			case KW_TEMPORARY:
			case KW_TERMINATED:
			case KW_TEXTFILE:
			case KW_TIMESTAMP:
			case KW_TINYINT:
			case KW_TO:
			case KW_TOUCH:
			case KW_TRIGGER:
			case KW_TRUE:
			case KW_TRUNCATE:
			case KW_UNARCHIVE:
			case KW_UNDO:
			case KW_UNION:
			case KW_UNLOCK:
			case KW_UNSET:
			case KW_UNSIGNED:
			case KW_UPDATE:
			case KW_USE:
			case KW_USER:
			case KW_USING:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_VALUE_TYPE:
			case KW_VIEW:
			case KW_WHILE:
			case KW_WITH:
				{
				alt27=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// IdentifiersParser.g:186:5: KW_IF
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_IF93=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_functionName1186); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_IF93_tree = (CommonTree)adaptor.create(KW_IF93);
					adaptor.addChild(root_0, KW_IF93_tree);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:186:13: KW_ARRAY
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_ARRAY94=(Token)match(input,KW_ARRAY,FOLLOW_KW_ARRAY_in_functionName1190); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_ARRAY94_tree = (CommonTree)adaptor.create(KW_ARRAY94);
					adaptor.addChild(root_0, KW_ARRAY94_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:186:24: KW_MAP
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_MAP95=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_functionName1194); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_MAP95_tree = (CommonTree)adaptor.create(KW_MAP95);
					adaptor.addChild(root_0, KW_MAP95_tree);
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:186:33: KW_STRUCT
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_STRUCT96=(Token)match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_functionName1198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_STRUCT96_tree = (CommonTree)adaptor.create(KW_STRUCT96);
					adaptor.addChild(root_0, KW_STRUCT96_tree);
					}

					}
					break;
				case 5 :
					// IdentifiersParser.g:186:45: KW_UNIONTYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_UNIONTYPE97=(Token)match(input,KW_UNIONTYPE,FOLLOW_KW_UNIONTYPE_in_functionName1202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_UNIONTYPE97_tree = (CommonTree)adaptor.create(KW_UNIONTYPE97);
					adaptor.addChild(root_0, KW_UNIONTYPE97_tree);
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:186:60: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_functionName1206);
					identifier98=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier98.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionName"


	public static class castExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "castExpression"
	// IdentifiersParser.g:189:1: castExpression : KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) ;
	public final HiveParser_IdentifiersParser.castExpression_return castExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.castExpression_return retval = new HiveParser_IdentifiersParser.castExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_CAST99=null;
		Token LPAREN100=null;
		Token KW_AS102=null;
		Token RPAREN104=null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope primitiveType103 =null;

		CommonTree KW_CAST99_tree=null;
		CommonTree LPAREN100_tree=null;
		CommonTree KW_AS102_tree=null;
		CommonTree RPAREN104_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_CAST=new RewriteRuleTokenStream(adaptor,"token KW_CAST");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");

		 gParent.msgs.push("cast expression"); 
		try {
			// IdentifiersParser.g:192:5: ( KW_CAST LPAREN expression KW_AS primitiveType RPAREN -> ^( TOK_FUNCTION primitiveType expression ) )
			// IdentifiersParser.g:193:5: KW_CAST LPAREN expression KW_AS primitiveType RPAREN
			{
			KW_CAST99=(Token)match(input,KW_CAST,FOLLOW_KW_CAST_in_castExpression1237); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CAST.add(KW_CAST99);

			LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression1243); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);

			pushFollow(FOLLOW_expression_in_castExpression1255);
			expression101=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());
			KW_AS102=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_castExpression1267); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS102);

			pushFollow(FOLLOW_primitiveType_in_castExpression1279);
			primitiveType103=gHiveParser.primitiveType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType103.getTree());
			RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression1285); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN104);

			// AST REWRITE
			// elements: primitiveType, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 198:12: -> ^( TOK_FUNCTION primitiveType expression )
			{
				// IdentifiersParser.g:198:15: ^( TOK_FUNCTION primitiveType expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_primitiveType.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "castExpression"


	public static class caseExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "caseExpression"
	// IdentifiersParser.g:201:1: caseExpression : KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) ;
	public final HiveParser_IdentifiersParser.caseExpression_return caseExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.caseExpression_return retval = new HiveParser_IdentifiersParser.caseExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_CASE105=null;
		Token KW_WHEN107=null;
		Token KW_THEN109=null;
		Token KW_ELSE111=null;
		Token KW_END113=null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope expression108 =null;
		ParserRuleReturnScope expression110 =null;
		ParserRuleReturnScope expression112 =null;

		CommonTree KW_CASE105_tree=null;
		CommonTree KW_WHEN107_tree=null;
		CommonTree KW_THEN109_tree=null;
		CommonTree KW_ELSE111_tree=null;
		CommonTree KW_END113_tree=null;
		RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
		RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
		RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
		RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
		RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("case expression"); 
		try {
			// IdentifiersParser.g:204:5: ( KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_CASE ( expression )* ) )
			// IdentifiersParser.g:205:5: KW_CASE expression ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
			{
			KW_CASE105=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_caseExpression1326); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE105);

			pushFollow(FOLLOW_expression_in_caseExpression1328);
			expression106=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());
			// IdentifiersParser.g:206:5: ( KW_WHEN expression KW_THEN expression )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==KW_WHEN) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// IdentifiersParser.g:206:6: KW_WHEN expression KW_THEN expression
					{
					KW_WHEN107=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_caseExpression1335); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN107);

					pushFollow(FOLLOW_expression_in_caseExpression1337);
					expression108=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression108.getTree());
					KW_THEN109=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_caseExpression1339); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN109);

					pushFollow(FOLLOW_expression_in_caseExpression1341);
					expression110=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression110.getTree());
					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			// IdentifiersParser.g:207:5: ( KW_ELSE expression )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==KW_ELSE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// IdentifiersParser.g:207:6: KW_ELSE expression
					{
					KW_ELSE111=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_caseExpression1350); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE111);

					pushFollow(FOLLOW_expression_in_caseExpression1352);
					expression112=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());
					}
					break;

			}

			KW_END113=(Token)match(input,KW_END,FOLLOW_KW_END_in_caseExpression1360); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_END.add(KW_END113);

			// AST REWRITE
			// elements: expression, KW_CASE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 208:12: -> ^( TOK_FUNCTION KW_CASE ( expression )* )
			{
				// IdentifiersParser.g:208:15: ^( TOK_FUNCTION KW_CASE ( expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_KW_CASE.nextNode());
				// IdentifiersParser.g:208:38: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseExpression"


	public static class whenExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whenExpression"
	// IdentifiersParser.g:211:1: whenExpression : KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) ;
	public final HiveParser_IdentifiersParser.whenExpression_return whenExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.whenExpression_return retval = new HiveParser_IdentifiersParser.whenExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_CASE114=null;
		Token KW_WHEN115=null;
		Token KW_THEN117=null;
		Token KW_ELSE119=null;
		Token KW_END121=null;
		ParserRuleReturnScope expression116 =null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope expression120 =null;

		CommonTree KW_CASE114_tree=null;
		CommonTree KW_WHEN115_tree=null;
		CommonTree KW_THEN117_tree=null;
		CommonTree KW_ELSE119_tree=null;
		CommonTree KW_END121_tree=null;
		RewriteRuleTokenStream stream_KW_THEN=new RewriteRuleTokenStream(adaptor,"token KW_THEN");
		RewriteRuleTokenStream stream_KW_CASE=new RewriteRuleTokenStream(adaptor,"token KW_CASE");
		RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
		RewriteRuleTokenStream stream_KW_END=new RewriteRuleTokenStream(adaptor,"token KW_END");
		RewriteRuleTokenStream stream_KW_ELSE=new RewriteRuleTokenStream(adaptor,"token KW_ELSE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("case expression"); 
		try {
			// IdentifiersParser.g:214:5: ( KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END -> ^( TOK_FUNCTION KW_WHEN ( expression )* ) )
			// IdentifiersParser.g:215:5: KW_CASE ( KW_WHEN expression KW_THEN expression )+ ( KW_ELSE expression )? KW_END
			{
			KW_CASE114=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_whenExpression1402); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CASE.add(KW_CASE114);

			// IdentifiersParser.g:216:6: ( KW_WHEN expression KW_THEN expression )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==KW_WHEN) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// IdentifiersParser.g:216:8: KW_WHEN expression KW_THEN expression
					{
					KW_WHEN115=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_whenExpression1411); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WHEN.add(KW_WHEN115);

					pushFollow(FOLLOW_expression_in_whenExpression1413);
					expression116=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression116.getTree());
					KW_THEN117=(Token)match(input,KW_THEN,FOLLOW_KW_THEN_in_whenExpression1415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_THEN.add(KW_THEN117);

					pushFollow(FOLLOW_expression_in_whenExpression1417);
					expression118=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression118.getTree());
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			// IdentifiersParser.g:217:5: ( KW_ELSE expression )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==KW_ELSE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// IdentifiersParser.g:217:6: KW_ELSE expression
					{
					KW_ELSE119=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_whenExpression1426); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ELSE.add(KW_ELSE119);

					pushFollow(FOLLOW_expression_in_whenExpression1428);
					expression120=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression120.getTree());
					}
					break;

			}

			KW_END121=(Token)match(input,KW_END,FOLLOW_KW_END_in_whenExpression1436); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_END.add(KW_END121);

			// AST REWRITE
			// elements: expression, KW_WHEN
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 218:12: -> ^( TOK_FUNCTION KW_WHEN ( expression )* )
			{
				// IdentifiersParser.g:218:15: ^( TOK_FUNCTION KW_WHEN ( expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_KW_WHEN.nextNode());
				// IdentifiersParser.g:218:38: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenExpression"


	public static class constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// IdentifiersParser.g:221:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );
	public final HiveParser_IdentifiersParser.constant_return constant() throws RecognitionException {
		HiveParser_IdentifiersParser.constant_return retval = new HiveParser_IdentifiersParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Number122=null;
		Token StringLiteral124=null;
		Token BigintLiteral126=null;
		Token SmallintLiteral127=null;
		Token TinyintLiteral128=null;
		Token DecimalLiteral129=null;
		ParserRuleReturnScope dateLiteral123 =null;
		ParserRuleReturnScope stringLiteralSequence125 =null;
		ParserRuleReturnScope charSetStringLiteral130 =null;
		ParserRuleReturnScope booleanValue131 =null;

		CommonTree Number122_tree=null;
		CommonTree StringLiteral124_tree=null;
		CommonTree BigintLiteral126_tree=null;
		CommonTree SmallintLiteral127_tree=null;
		CommonTree TinyintLiteral128_tree=null;
		CommonTree DecimalLiteral129_tree=null;

		 gParent.msgs.push("constant"); 
		try {
			// IdentifiersParser.g:224:5: ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue )
			int alt32=10;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// IdentifiersParser.g:225:5: Number
					{
					root_0 = (CommonTree)adaptor.nil();


					Number122=(Token)match(input,Number,FOLLOW_Number_in_constant1478); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Number122_tree = (CommonTree)adaptor.create(Number122);
					adaptor.addChild(root_0, Number122_tree);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:226:7: dateLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_constant1486);
					dateLiteral123=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral123.getTree());

					}
					break;
				case 3 :
					// IdentifiersParser.g:227:7: StringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					StringLiteral124=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constant1494); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral124_tree = (CommonTree)adaptor.create(StringLiteral124);
					adaptor.addChild(root_0, StringLiteral124_tree);
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:228:7: stringLiteralSequence
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_stringLiteralSequence_in_constant1502);
					stringLiteralSequence125=stringLiteralSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralSequence125.getTree());

					}
					break;
				case 5 :
					// IdentifiersParser.g:229:7: BigintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					BigintLiteral126=(Token)match(input,BigintLiteral,FOLLOW_BigintLiteral_in_constant1510); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BigintLiteral126_tree = (CommonTree)adaptor.create(BigintLiteral126);
					adaptor.addChild(root_0, BigintLiteral126_tree);
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:230:7: SmallintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					SmallintLiteral127=(Token)match(input,SmallintLiteral,FOLLOW_SmallintLiteral_in_constant1518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SmallintLiteral127_tree = (CommonTree)adaptor.create(SmallintLiteral127);
					adaptor.addChild(root_0, SmallintLiteral127_tree);
					}

					}
					break;
				case 7 :
					// IdentifiersParser.g:231:7: TinyintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					TinyintLiteral128=(Token)match(input,TinyintLiteral,FOLLOW_TinyintLiteral_in_constant1526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TinyintLiteral128_tree = (CommonTree)adaptor.create(TinyintLiteral128);
					adaptor.addChild(root_0, TinyintLiteral128_tree);
					}

					}
					break;
				case 8 :
					// IdentifiersParser.g:232:7: DecimalLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					DecimalLiteral129=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_constant1534); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DecimalLiteral129_tree = (CommonTree)adaptor.create(DecimalLiteral129);
					adaptor.addChild(root_0, DecimalLiteral129_tree);
					}

					}
					break;
				case 9 :
					// IdentifiersParser.g:233:7: charSetStringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_charSetStringLiteral_in_constant1542);
					charSetStringLiteral130=charSetStringLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, charSetStringLiteral130.getTree());

					}
					break;
				case 10 :
					// IdentifiersParser.g:234:7: booleanValue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_booleanValue_in_constant1550);
					booleanValue131=booleanValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanValue131.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class stringLiteralSequence_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stringLiteralSequence"
	// IdentifiersParser.g:237:1: stringLiteralSequence : StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) ;
	public final HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence() throws RecognitionException {
		HiveParser_IdentifiersParser.stringLiteralSequence_return retval = new HiveParser_IdentifiersParser.stringLiteralSequence_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token StringLiteral132=null;
		Token StringLiteral133=null;

		CommonTree StringLiteral132_tree=null;
		CommonTree StringLiteral133_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

		try {
			// IdentifiersParser.g:238:5: ( StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) )
			// IdentifiersParser.g:239:5: StringLiteral ( StringLiteral )+
			{
			StringLiteral132=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1571); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral132);

			// IdentifiersParser.g:239:19: ( StringLiteral )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				alt33 = dfa33.predict(input);
				switch (alt33) {
				case 1 :
					// IdentifiersParser.g:239:19: StringLiteral
					{
					StringLiteral133=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1573); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral133);

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			// AST REWRITE
			// elements: StringLiteral, StringLiteral
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 239:34: -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
			{
				// IdentifiersParser.g:239:37: ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_STRINGLITERALSEQUENCE, "TOK_STRINGLITERALSEQUENCE"), root_1);
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				if ( !(stream_StringLiteral.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_StringLiteral.hasNext() ) {
					adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				}
				stream_StringLiteral.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringLiteralSequence"


	public static class charSetStringLiteral_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "charSetStringLiteral"
	// IdentifiersParser.g:242:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
	public final HiveParser_IdentifiersParser.charSetStringLiteral_return charSetStringLiteral() throws RecognitionException {
		HiveParser_IdentifiersParser.charSetStringLiteral_return retval = new HiveParser_IdentifiersParser.charSetStringLiteral_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token csName=null;
		Token csLiteral=null;

		CommonTree csName_tree=null;
		CommonTree csLiteral_tree=null;
		RewriteRuleTokenStream stream_CharSetLiteral=new RewriteRuleTokenStream(adaptor,"token CharSetLiteral");
		RewriteRuleTokenStream stream_CharSetName=new RewriteRuleTokenStream(adaptor,"token CharSetName");

		 gParent.msgs.push("character string literal"); 
		try {
			// IdentifiersParser.g:245:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
			// IdentifiersParser.g:246:5: csName= CharSetName csLiteral= CharSetLiteral
			{
			csName=(Token)match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral1618); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CharSetName.add(csName);

			csLiteral=(Token)match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral1622); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CharSetLiteral.add(csLiteral);

			// AST REWRITE
			// elements: csName, csLiteral
			// token labels: csName, csLiteral
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_csName=new RewriteRuleTokenStream(adaptor,"token csName",csName);
			RewriteRuleTokenStream stream_csLiteral=new RewriteRuleTokenStream(adaptor,"token csLiteral",csLiteral);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 246:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
			{
				// IdentifiersParser.g:246:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_CHARSETLITERAL, "TOK_CHARSETLITERAL"), root_1);
				adaptor.addChild(root_1, stream_csName.nextNode());
				adaptor.addChild(root_1, stream_csLiteral.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "charSetStringLiteral"


	public static class dateLiteral_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dateLiteral"
	// IdentifiersParser.g:249:1: dateLiteral : KW_DATE StringLiteral ->;
	public final HiveParser_IdentifiersParser.dateLiteral_return dateLiteral() throws RecognitionException {
		HiveParser_IdentifiersParser.dateLiteral_return retval = new HiveParser_IdentifiersParser.dateLiteral_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_DATE134=null;
		Token StringLiteral135=null;

		CommonTree KW_DATE134_tree=null;
		CommonTree StringLiteral135_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");

		try {
			// IdentifiersParser.g:250:5: ( KW_DATE StringLiteral ->)
			// IdentifiersParser.g:251:5: KW_DATE StringLiteral
			{
			KW_DATE134=(Token)match(input,KW_DATE,FOLLOW_KW_DATE_in_dateLiteral1655); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DATE.add(KW_DATE134);

			StringLiteral135=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dateLiteral1657); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral135);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 251:27: ->
			{
				adaptor.addChild(root_0, 
				      // Create DateLiteral token, but with the text of the string value
				      // This makes the dateLiteral more consistent with the other type literals.
				      adaptor.create(TOK_DATELITERAL, (StringLiteral135!=null?StringLiteral135.getText():null))
				    );
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dateLiteral"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// IdentifiersParser.g:259:1: expression : precedenceOrExpression ;
	public final HiveParser_IdentifiersParser.expression_return expression() throws RecognitionException {
		HiveParser_IdentifiersParser.expression_return retval = new HiveParser_IdentifiersParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceOrExpression136 =null;


		 gParent.msgs.push("expression specification"); 
		try {
			// IdentifiersParser.g:262:5: ( precedenceOrExpression )
			// IdentifiersParser.g:263:5: precedenceOrExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceOrExpression_in_expression1696);
			precedenceOrExpression136=precedenceOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceOrExpression136.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class atomExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomExpression"
	// IdentifiersParser.g:266:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !);
	public final HiveParser_IdentifiersParser.atomExpression_return atomExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.atomExpression_return retval = new HiveParser_IdentifiersParser.atomExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NULL137=null;
		Token LPAREN145=null;
		Token RPAREN147=null;
		ParserRuleReturnScope dateLiteral138 =null;
		ParserRuleReturnScope constant139 =null;
		ParserRuleReturnScope function140 =null;
		ParserRuleReturnScope castExpression141 =null;
		ParserRuleReturnScope caseExpression142 =null;
		ParserRuleReturnScope whenExpression143 =null;
		ParserRuleReturnScope tableOrColumn144 =null;
		ParserRuleReturnScope expression146 =null;

		CommonTree KW_NULL137_tree=null;
		CommonTree LPAREN145_tree=null;
		CommonTree RPAREN147_tree=null;
		RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

		try {
			// IdentifiersParser.g:267:5: ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !)
			int alt34=9;
			alt34 = dfa34.predict(input);
			switch (alt34) {
				case 1 :
					// IdentifiersParser.g:268:5: KW_NULL
					{
					KW_NULL137=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression1717); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL137);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 268:13: -> TOK_NULL
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_NULL, "TOK_NULL"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:269:7: dateLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_atomExpression1729);
					dateLiteral138=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral138.getTree());

					}
					break;
				case 3 :
					// IdentifiersParser.g:270:7: constant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constant_in_atomExpression1737);
					constant139=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant139.getTree());

					}
					break;
				case 4 :
					// IdentifiersParser.g:271:7: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_atomExpression1745);
					function140=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function140.getTree());

					}
					break;
				case 5 :
					// IdentifiersParser.g:272:7: castExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_castExpression_in_atomExpression1753);
					castExpression141=castExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression141.getTree());

					}
					break;
				case 6 :
					// IdentifiersParser.g:273:7: caseExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_caseExpression_in_atomExpression1761);
					caseExpression142=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression142.getTree());

					}
					break;
				case 7 :
					// IdentifiersParser.g:274:7: whenExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whenExpression_in_atomExpression1769);
					whenExpression143=whenExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression143.getTree());

					}
					break;
				case 8 :
					// IdentifiersParser.g:275:7: tableOrColumn
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableOrColumn_in_atomExpression1777);
					tableOrColumn144=gHiveParser.tableOrColumn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableOrColumn144.getTree());

					}
					break;
				case 9 :
					// IdentifiersParser.g:276:7: LPAREN ! expression RPAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression1785); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_atomExpression1788);
					expression146=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());

					RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression1790); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomExpression"


	public static class precedenceFieldExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceFieldExpression"
	// IdentifiersParser.g:280:1: precedenceFieldExpression : atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* ;
	public final HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceFieldExpression_return retval = new HiveParser_IdentifiersParser.precedenceFieldExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LSQUARE149=null;
		Token RSQUARE151=null;
		Token DOT152=null;
		ParserRuleReturnScope atomExpression148 =null;
		ParserRuleReturnScope expression150 =null;
		ParserRuleReturnScope identifier153 =null;

		CommonTree LSQUARE149_tree=null;
		CommonTree RSQUARE151_tree=null;
		CommonTree DOT152_tree=null;

		try {
			// IdentifiersParser.g:281:5: ( atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* )
			// IdentifiersParser.g:282:5: atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression1813);
			atomExpression148=atomExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atomExpression148.getTree());

			// IdentifiersParser.g:282:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
			loop35:
			while (true) {
				int alt35=3;
				alt35 = dfa35.predict(input);
				switch (alt35) {
				case 1 :
					// IdentifiersParser.g:282:21: ( LSQUARE ^ expression RSQUARE !)
					{
					// IdentifiersParser.g:282:21: ( LSQUARE ^ expression RSQUARE !)
					// IdentifiersParser.g:282:22: LSQUARE ^ expression RSQUARE !
					{
					LSQUARE149=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression1817); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LSQUARE149_tree = (CommonTree)adaptor.create(LSQUARE149);
					root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE149_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_precedenceFieldExpression1820);
					expression150=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression150.getTree());

					RSQUARE151=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression1822); if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:282:54: ( DOT ^ identifier )
					{
					// IdentifiersParser.g:282:54: ( DOT ^ identifier )
					// IdentifiersParser.g:282:55: DOT ^ identifier
					{
					DOT152=(Token)match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression1829); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT152_tree = (CommonTree)adaptor.create(DOT152);
					root_0 = (CommonTree)adaptor.becomeRoot(DOT152_tree, root_0);
					}

					pushFollow(FOLLOW_identifier_in_precedenceFieldExpression1832);
					identifier153=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier153.getTree());

					}

					}
					break;

				default :
					break loop35;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceFieldExpression"


	public static class precedenceUnaryOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceUnaryOperator"
	// IdentifiersParser.g:285:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
	public final HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnaryOperator_return retval = new HiveParser_IdentifiersParser.precedenceUnaryOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set154=null;

		CommonTree set154_tree=null;

		try {
			// IdentifiersParser.g:286:5: ( PLUS | MINUS | TILDE )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set154=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TILDE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set154));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceUnaryOperator"


	public static class nullCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nullCondition"
	// IdentifiersParser.g:290:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
	public final HiveParser_IdentifiersParser.nullCondition_return nullCondition() throws RecognitionException {
		HiveParser_IdentifiersParser.nullCondition_return retval = new HiveParser_IdentifiersParser.nullCondition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NULL155=null;
		Token KW_NOT156=null;
		Token KW_NULL157=null;

		CommonTree KW_NULL155_tree=null;
		CommonTree KW_NOT156_tree=null;
		CommonTree KW_NULL157_tree=null;
		RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

		try {
			// IdentifiersParser.g:291:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==KW_NULL) ) {
				alt36=1;
			}
			else if ( (LA36_0==KW_NOT) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// IdentifiersParser.g:292:5: KW_NULL
					{
					KW_NULL155=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL155);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 292:13: -> ^( TOK_ISNULL )
					{
						// IdentifiersParser.g:292:16: ^( TOK_ISNULL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ISNULL, "TOK_ISNULL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:293:7: KW_NOT KW_NULL
					{
					KW_NOT156=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition1899); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT156);

					KW_NULL157=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1901); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL157);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 293:22: -> ^( TOK_ISNOTNULL )
					{
						// IdentifiersParser.g:293:25: ^( TOK_ISNOTNULL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ISNOTNULL, "TOK_ISNOTNULL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nullCondition"


	public static class precedenceUnaryPrefixExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceUnaryPrefixExpression"
	// IdentifiersParser.g:296:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator ^)* precedenceFieldExpression ;
	public final HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceUnaryOperator158 =null;
		ParserRuleReturnScope precedenceFieldExpression159 =null;


		try {
			// IdentifiersParser.g:297:5: ( ( precedenceUnaryOperator ^)* precedenceFieldExpression )
			// IdentifiersParser.g:298:5: ( precedenceUnaryOperator ^)* precedenceFieldExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			// IdentifiersParser.g:298:5: ( precedenceUnaryOperator ^)*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==MINUS||LA37_0==PLUS||LA37_0==TILDE) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// IdentifiersParser.g:298:6: precedenceUnaryOperator ^
					{
					pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1929);
					precedenceUnaryOperator158=precedenceUnaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator158.getTree(), root_0);
					}
					break;

				default :
					break loop37;
				}
			}

			pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1934);
			precedenceFieldExpression159=precedenceFieldExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceFieldExpression159.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceUnaryPrefixExpression"


	public static class precedenceUnarySuffixExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceUnarySuffixExpression"
	// IdentifiersParser.g:301:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
	public final HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token a=null;
		ParserRuleReturnScope precedenceUnaryPrefixExpression160 =null;
		ParserRuleReturnScope nullCondition161 =null;

		CommonTree a_tree=null;
		RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
		RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
		RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");

		try {
			// IdentifiersParser.g:302:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
			// IdentifiersParser.g:302:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
			{
			pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1951);
			precedenceUnaryPrefixExpression160=precedenceUnaryPrefixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression160.getTree());
			// IdentifiersParser.g:302:39: (a= KW_IS nullCondition )?
			int alt38=2;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// IdentifiersParser.g:302:40: a= KW_IS nullCondition
					{
					a=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1956); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IS.add(a);

					pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1958);
					nullCondition161=nullCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nullCondition.add(nullCondition161.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: precedenceUnaryPrefixExpression, precedenceUnaryPrefixExpression, nullCondition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 303:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
			if (a != null) {
				// IdentifiersParser.g:303:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_nullCondition.nextTree());
				adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 304:5: -> precedenceUnaryPrefixExpression
			{
				adaptor.addChild(root_0, stream_precedenceUnaryPrefixExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceUnarySuffixExpression"


	public static class precedenceBitwiseXorOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceBitwiseXorOperator"
	// IdentifiersParser.g:308:1: precedenceBitwiseXorOperator : BITWISEXOR ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BITWISEXOR162=null;

		CommonTree BITWISEXOR162_tree=null;

		try {
			// IdentifiersParser.g:309:5: ( BITWISEXOR )
			// IdentifiersParser.g:310:5: BITWISEXOR
			{
			root_0 = (CommonTree)adaptor.nil();


			BITWISEXOR162=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2006); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BITWISEXOR162_tree = (CommonTree)adaptor.create(BITWISEXOR162);
			adaptor.addChild(root_0, BITWISEXOR162_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceBitwiseXorOperator"


	public static class precedenceBitwiseXorExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceBitwiseXorExpression"
	// IdentifiersParser.g:313:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceUnarySuffixExpression163 =null;
		ParserRuleReturnScope precedenceBitwiseXorOperator164 =null;
		ParserRuleReturnScope precedenceUnarySuffixExpression165 =null;


		try {
			// IdentifiersParser.g:314:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* )
			// IdentifiersParser.g:315:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2027);
			precedenceUnarySuffixExpression163=precedenceUnarySuffixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression163.getTree());

			// IdentifiersParser.g:315:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
			loop39:
			while (true) {
				int alt39=2;
				alt39 = dfa39.predict(input);
				switch (alt39) {
				case 1 :
					// IdentifiersParser.g:315:38: precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2030);
					precedenceBitwiseXorOperator164=precedenceBitwiseXorOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator164.getTree(), root_0);
					pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2033);
					precedenceUnarySuffixExpression165=precedenceUnarySuffixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression165.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceBitwiseXorExpression"


	public static class precedenceStarOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceStarOperator"
	// IdentifiersParser.g:319:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
	public final HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceStarOperator_return retval = new HiveParser_IdentifiersParser.precedenceStarOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set166=null;

		CommonTree set166_tree=null;

		try {
			// IdentifiersParser.g:320:5: ( STAR | DIVIDE | MOD | DIV )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set166=input.LT(1);
			if ( (input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||input.LA(1)==MOD||input.LA(1)==STAR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set166));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceStarOperator"


	public static class precedenceStarExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceStarExpression"
	// IdentifiersParser.g:324:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceStarExpression_return retval = new HiveParser_IdentifiersParser.precedenceStarExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceBitwiseXorExpression167 =null;
		ParserRuleReturnScope precedenceStarOperator168 =null;
		ParserRuleReturnScope precedenceBitwiseXorExpression169 =null;


		try {
			// IdentifiersParser.g:325:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* )
			// IdentifiersParser.g:326:5: precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2090);
			precedenceBitwiseXorExpression167=precedenceBitwiseXorExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression167.getTree());

			// IdentifiersParser.g:326:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
			loop40:
			while (true) {
				int alt40=2;
				alt40 = dfa40.predict(input);
				switch (alt40) {
				case 1 :
					// IdentifiersParser.g:326:37: precedenceStarOperator ^ precedenceBitwiseXorExpression
					{
					pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression2093);
					precedenceStarOperator168=precedenceStarOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator168.getTree(), root_0);
					pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2096);
					precedenceBitwiseXorExpression169=precedenceBitwiseXorExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression169.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceStarExpression"


	public static class precedencePlusOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedencePlusOperator"
	// IdentifiersParser.g:330:1: precedencePlusOperator : ( PLUS | MINUS );
	public final HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedencePlusOperator_return retval = new HiveParser_IdentifiersParser.precedencePlusOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set170=null;

		CommonTree set170_tree=null;

		try {
			// IdentifiersParser.g:331:5: ( PLUS | MINUS )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set170=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set170));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedencePlusOperator"


	public static class precedencePlusExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedencePlusExpression"
	// IdentifiersParser.g:335:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* ;
	public final HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedencePlusExpression_return retval = new HiveParser_IdentifiersParser.precedencePlusExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceStarExpression171 =null;
		ParserRuleReturnScope precedencePlusOperator172 =null;
		ParserRuleReturnScope precedenceStarExpression173 =null;


		try {
			// IdentifiersParser.g:336:5: ( precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* )
			// IdentifiersParser.g:337:5: precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2145);
			precedenceStarExpression171=precedenceStarExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression171.getTree());

			// IdentifiersParser.g:337:30: ( precedencePlusOperator ^ precedenceStarExpression )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==MINUS||LA41_0==PLUS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// IdentifiersParser.g:337:31: precedencePlusOperator ^ precedenceStarExpression
					{
					pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression2148);
					precedencePlusOperator172=precedencePlusOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator172.getTree(), root_0);
					pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2151);
					precedenceStarExpression173=precedenceStarExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression173.getTree());

					}
					break;

				default :
					break loop41;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedencePlusExpression"


	public static class precedenceAmpersandOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceAmpersandOperator"
	// IdentifiersParser.g:341:1: precedenceAmpersandOperator : AMPERSAND ;
	public final HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAmpersandOperator_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AMPERSAND174=null;

		CommonTree AMPERSAND174_tree=null;

		try {
			// IdentifiersParser.g:342:5: ( AMPERSAND )
			// IdentifiersParser.g:343:5: AMPERSAND
			{
			root_0 = (CommonTree)adaptor.nil();


			AMPERSAND174=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2175); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AMPERSAND174_tree = (CommonTree)adaptor.create(AMPERSAND174);
			adaptor.addChild(root_0, AMPERSAND174_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceAmpersandOperator"


	public static class precedenceAmpersandExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceAmpersandExpression"
	// IdentifiersParser.g:346:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAmpersandExpression_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedencePlusExpression175 =null;
		ParserRuleReturnScope precedenceAmpersandOperator176 =null;
		ParserRuleReturnScope precedencePlusExpression177 =null;


		try {
			// IdentifiersParser.g:347:5: ( precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* )
			// IdentifiersParser.g:348:5: precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2196);
			precedencePlusExpression175=precedencePlusExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression175.getTree());

			// IdentifiersParser.g:348:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==AMPERSAND) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// IdentifiersParser.g:348:31: precedenceAmpersandOperator ^ precedencePlusExpression
					{
					pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2199);
					precedenceAmpersandOperator176=precedenceAmpersandOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator176.getTree(), root_0);
					pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2202);
					precedencePlusExpression177=precedencePlusExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression177.getTree());

					}
					break;

				default :
					break loop42;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceAmpersandExpression"


	public static class precedenceBitwiseOrOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceBitwiseOrOperator"
	// IdentifiersParser.g:352:1: precedenceBitwiseOrOperator : BITWISEOR ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BITWISEOR178=null;

		CommonTree BITWISEOR178_tree=null;

		try {
			// IdentifiersParser.g:353:5: ( BITWISEOR )
			// IdentifiersParser.g:354:5: BITWISEOR
			{
			root_0 = (CommonTree)adaptor.nil();


			BITWISEOR178=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2226); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BITWISEOR178_tree = (CommonTree)adaptor.create(BITWISEOR178);
			adaptor.addChild(root_0, BITWISEOR178_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceBitwiseOrOperator"


	public static class precedenceBitwiseOrExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceBitwiseOrExpression"
	// IdentifiersParser.g:357:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceAmpersandExpression179 =null;
		ParserRuleReturnScope precedenceBitwiseOrOperator180 =null;
		ParserRuleReturnScope precedenceAmpersandExpression181 =null;


		try {
			// IdentifiersParser.g:358:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* )
			// IdentifiersParser.g:359:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2247);
			precedenceAmpersandExpression179=precedenceAmpersandExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression179.getTree());

			// IdentifiersParser.g:359:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==BITWISEOR) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// IdentifiersParser.g:359:36: precedenceBitwiseOrOperator ^ precedenceAmpersandExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2250);
					precedenceBitwiseOrOperator180=precedenceBitwiseOrOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator180.getTree(), root_0);
					pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2253);
					precedenceAmpersandExpression181=precedenceAmpersandExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression181.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceBitwiseOrExpression"


	public static class precedenceEqualNegatableOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceEqualNegatableOperator"
	// IdentifiersParser.g:364:1: precedenceEqualNegatableOperator : ( KW_LIKE | KW_RLIKE | KW_REGEXP );
	public final HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set182=null;

		CommonTree set182_tree=null;

		try {
			// IdentifiersParser.g:365:5: ( KW_LIKE | KW_RLIKE | KW_REGEXP )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set182=input.LT(1);
			if ( input.LA(1)==KW_LIKE||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set182));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceEqualNegatableOperator"


	public static class precedenceEqualOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceEqualOperator"
	// IdentifiersParser.g:369:1: precedenceEqualOperator : ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
	public final HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL184=null;
		Token EQUAL_NS185=null;
		Token NOTEQUAL186=null;
		Token LESSTHANOREQUALTO187=null;
		Token LESSTHAN188=null;
		Token GREATERTHANOREQUALTO189=null;
		Token GREATERTHAN190=null;
		ParserRuleReturnScope precedenceEqualNegatableOperator183 =null;

		CommonTree EQUAL184_tree=null;
		CommonTree EQUAL_NS185_tree=null;
		CommonTree NOTEQUAL186_tree=null;
		CommonTree LESSTHANOREQUALTO187_tree=null;
		CommonTree LESSTHAN188_tree=null;
		CommonTree GREATERTHANOREQUALTO189_tree=null;
		CommonTree GREATERTHAN190_tree=null;

		try {
			// IdentifiersParser.g:370:5: ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
			int alt44=8;
			switch ( input.LA(1) ) {
			case KW_LIKE:
			case KW_REGEXP:
			case KW_RLIKE:
				{
				alt44=1;
				}
				break;
			case EQUAL:
				{
				alt44=2;
				}
				break;
			case EQUAL_NS:
				{
				alt44=3;
				}
				break;
			case NOTEQUAL:
				{
				alt44=4;
				}
				break;
			case LESSTHANOREQUALTO:
				{
				alt44=5;
				}
				break;
			case LESSTHAN:
				{
				alt44=6;
				}
				break;
			case GREATERTHANOREQUALTO:
				{
				alt44=7;
				}
				break;
			case GREATERTHAN:
				{
				alt44=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// IdentifiersParser.g:371:5: precedenceEqualNegatableOperator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2307);
					precedenceEqualNegatableOperator183=precedenceEqualNegatableOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualNegatableOperator183.getTree());

					}
					break;
				case 2 :
					// IdentifiersParser.g:371:40: EQUAL
					{
					root_0 = (CommonTree)adaptor.nil();


					EQUAL184=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_precedenceEqualOperator2311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL184_tree = (CommonTree)adaptor.create(EQUAL184);
					adaptor.addChild(root_0, EQUAL184_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:371:48: EQUAL_NS
					{
					root_0 = (CommonTree)adaptor.nil();


					EQUAL_NS185=(Token)match(input,EQUAL_NS,FOLLOW_EQUAL_NS_in_precedenceEqualOperator2315); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL_NS185_tree = (CommonTree)adaptor.create(EQUAL_NS185);
					adaptor.addChild(root_0, EQUAL_NS185_tree);
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:371:59: NOTEQUAL
					{
					root_0 = (CommonTree)adaptor.nil();


					NOTEQUAL186=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_precedenceEqualOperator2319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOTEQUAL186_tree = (CommonTree)adaptor.create(NOTEQUAL186);
					adaptor.addChild(root_0, NOTEQUAL186_tree);
					}

					}
					break;
				case 5 :
					// IdentifiersParser.g:371:70: LESSTHANOREQUALTO
					{
					root_0 = (CommonTree)adaptor.nil();


					LESSTHANOREQUALTO187=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESSTHANOREQUALTO187_tree = (CommonTree)adaptor.create(LESSTHANOREQUALTO187);
					adaptor.addChild(root_0, LESSTHANOREQUALTO187_tree);
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:371:90: LESSTHAN
					{
					root_0 = (CommonTree)adaptor.nil();


					LESSTHAN188=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_precedenceEqualOperator2327); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESSTHAN188_tree = (CommonTree)adaptor.create(LESSTHAN188);
					adaptor.addChild(root_0, LESSTHAN188_tree);
					}

					}
					break;
				case 7 :
					// IdentifiersParser.g:371:101: GREATERTHANOREQUALTO
					{
					root_0 = (CommonTree)adaptor.nil();


					GREATERTHANOREQUALTO189=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATERTHANOREQUALTO189_tree = (CommonTree)adaptor.create(GREATERTHANOREQUALTO189);
					adaptor.addChild(root_0, GREATERTHANOREQUALTO189_tree);
					}

					}
					break;
				case 8 :
					// IdentifiersParser.g:371:124: GREATERTHAN
					{
					root_0 = (CommonTree)adaptor.nil();


					GREATERTHAN190=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_precedenceEqualOperator2335); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATERTHAN190_tree = (CommonTree)adaptor.create(GREATERTHAN190);
					adaptor.addChild(root_0, GREATERTHAN190_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceEqualOperator"


	public static class precedenceEqualExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceEqualExpression"
	// IdentifiersParser.g:374:1: precedenceEqualExpression : (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* ;
	public final HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualExpression_return retval = new HiveParser_IdentifiersParser.precedenceEqualExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NOT191=null;
		Token KW_NOT194=null;
		Token KW_IN195=null;
		Token KW_IN197=null;
		Token KW_NOT199=null;
		Token KW_BETWEEN200=null;
		Token KW_AND201=null;
		Token KW_BETWEEN202=null;
		Token KW_AND203=null;
		ParserRuleReturnScope left =null;
		ParserRuleReturnScope notExpr =null;
		ParserRuleReturnScope equalExpr =null;
		ParserRuleReturnScope min =null;
		ParserRuleReturnScope max =null;
		ParserRuleReturnScope precedenceEqualNegatableOperator192 =null;
		ParserRuleReturnScope precedenceEqualOperator193 =null;
		ParserRuleReturnScope expressions196 =null;
		ParserRuleReturnScope expressions198 =null;

		CommonTree KW_NOT191_tree=null;
		CommonTree KW_NOT194_tree=null;
		CommonTree KW_IN195_tree=null;
		CommonTree KW_IN197_tree=null;
		CommonTree KW_NOT199_tree=null;
		CommonTree KW_BETWEEN200_tree=null;
		CommonTree KW_AND201_tree=null;
		CommonTree KW_BETWEEN202_tree=null;
		CommonTree KW_AND203_tree=null;
		RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
		RewriteRuleSubtreeStream stream_precedenceEqualNegatableOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualNegatableOperator");
		RewriteRuleSubtreeStream stream_precedenceEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualOperator");
		RewriteRuleSubtreeStream stream_precedenceBitwiseOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceBitwiseOrExpression");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// IdentifiersParser.g:375:5: ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* )
			// IdentifiersParser.g:376:5: (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
			{
			// IdentifiersParser.g:376:5: (left= precedenceBitwiseOrExpression -> $left)
			// IdentifiersParser.g:376:6: left= precedenceBitwiseOrExpression
			{
			pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2359);
			left=precedenceBitwiseOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(left.getTree());
			// AST REWRITE
			// elements: left
			// token labels: 
			// rule labels: retval, left
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 376:41: -> $left
			{
				adaptor.addChild(root_0, stream_left.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// IdentifiersParser.g:377:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
			loop45:
			while (true) {
				int alt45=7;
				alt45 = dfa45.predict(input);
				switch (alt45) {
				case 1 :
					// IdentifiersParser.g:378:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
					{
					// IdentifiersParser.g:378:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:378:9: KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression
					{
					KW_NOT191=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2381); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT191);

					pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2383);
					precedenceEqualNegatableOperator192=precedenceEqualNegatableOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceEqualNegatableOperator.add(precedenceEqualNegatableOperator192.getTree());
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2387);
					notExpr=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(notExpr.getTree());
					}

					// AST REWRITE
					// elements: precedenceEqualExpression, notExpr, precedenceEqualNegatableOperator, KW_NOT
					// token labels: 
					// rule labels: retval, notExpr
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr",notExpr!=null?notExpr.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 379:8: -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
					{
						// IdentifiersParser.g:379:11: ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_NOT.nextNode(), root_1);
						// IdentifiersParser.g:379:20: ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualNegatableOperator.nextNode(), root_2);
						adaptor.addChild(root_2, stream_retval.nextTree());
						adaptor.addChild(root_2, stream_notExpr.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:380:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
					{
					// IdentifiersParser.g:380:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:380:8: precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2420);
					precedenceEqualOperator193=precedenceEqualOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceEqualOperator.add(precedenceEqualOperator193.getTree());
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2424);
					equalExpr=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(equalExpr.getTree());
					}

					// AST REWRITE
					// elements: equalExpr, precedenceEqualExpression, precedenceEqualOperator
					// token labels: 
					// rule labels: equalExpr, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr",equalExpr!=null?equalExpr.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 381:8: -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
					{
						// IdentifiersParser.g:381:11: ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_precedenceEqualOperator.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_equalExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:382:7: ( KW_NOT KW_IN expressions )
					{
					// IdentifiersParser.g:382:7: ( KW_NOT KW_IN expressions )
					// IdentifiersParser.g:382:8: KW_NOT KW_IN expressions
					{
					KW_NOT194=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2453); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT194);

					KW_IN195=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2455); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN195);

					pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2457);
					expressions196=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions196.getTree());
					}

					// AST REWRITE
					// elements: KW_NOT, expressions, precedenceEqualExpression, KW_IN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 383:8: -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
					{
						// IdentifiersParser.g:383:11: ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_NOT.nextNode(), root_1);
						// IdentifiersParser.g:383:20: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_2);
						adaptor.addChild(root_2, stream_KW_IN.nextNode());
						adaptor.addChild(root_2, stream_retval.nextTree());
						adaptor.addChild(root_2, stream_expressions.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:384:7: ( KW_IN expressions )
					{
					// IdentifiersParser.g:384:7: ( KW_IN expressions )
					// IdentifiersParser.g:384:8: KW_IN expressions
					{
					KW_IN197=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2491); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN197);

					pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2493);
					expressions198=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions198.getTree());
					}

					// AST REWRITE
					// elements: precedenceEqualExpression, expressions, KW_IN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 385:8: -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
					{
						// IdentifiersParser.g:385:11: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
						adaptor.addChild(root_1, stream_KW_IN.nextNode());
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expressions.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// IdentifiersParser.g:386:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					{
					// IdentifiersParser.g:386:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					// IdentifiersParser.g:386:9: KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
					{
					KW_NOT199=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2524); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT199);

					KW_BETWEEN200=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2526); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN200);

					// IdentifiersParser.g:386:27: (min= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:386:28: min= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2531);
					min=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());
					}

					KW_AND201=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND201);

					// IdentifiersParser.g:386:70: (max= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:386:71: max= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2539);
					max=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());
					}

					}

					// AST REWRITE
					// elements: left, min, max
					// token labels: 
					// rule labels: min, retval, max, left
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.getTree():null);
					RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 387:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
					{
						// IdentifiersParser.g:387:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(Identifier, "between"));
						adaptor.addChild(root_1, (CommonTree)adaptor.create(KW_TRUE, "KW_TRUE"));
						adaptor.addChild(root_1, stream_left.nextTree());
						adaptor.addChild(root_1, stream_min.nextTree());
						adaptor.addChild(root_1, stream_max.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:388:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					{
					// IdentifiersParser.g:388:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					// IdentifiersParser.g:388:9: KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
					{
					KW_BETWEEN202=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN202);

					// IdentifiersParser.g:388:20: (min= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:388:21: min= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2584);
					min=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());
					}

					KW_AND203=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND203);

					// IdentifiersParser.g:388:63: (max= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:388:64: max= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2592);
					max=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());
					}

					}

					// AST REWRITE
					// elements: max, min, left
					// token labels: 
					// rule labels: min, retval, max, left
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_max=new RewriteRuleSubtreeStream(adaptor,"rule max",max!=null?max.getTree():null);
					RewriteRuleSubtreeStream stream_left=new RewriteRuleSubtreeStream(adaptor,"rule left",left!=null?left.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 389:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
					{
						// IdentifiersParser.g:389:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(Identifier, "between"));
						adaptor.addChild(root_1, (CommonTree)adaptor.create(KW_FALSE, "KW_FALSE"));
						adaptor.addChild(root_1, stream_left.nextTree());
						adaptor.addChild(root_1, stream_min.nextTree());
						adaptor.addChild(root_1, stream_max.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceEqualExpression"


	public static class expressions_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressions"
	// IdentifiersParser.g:393:1: expressions : LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* ;
	public final HiveParser_IdentifiersParser.expressions_return expressions() throws RecognitionException {
		HiveParser_IdentifiersParser.expressions_return retval = new HiveParser_IdentifiersParser.expressions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN204=null;
		Token COMMA206=null;
		Token RPAREN208=null;
		ParserRuleReturnScope expression205 =null;
		ParserRuleReturnScope expression207 =null;

		CommonTree LPAREN204_tree=null;
		CommonTree COMMA206_tree=null;
		CommonTree RPAREN208_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// IdentifiersParser.g:394:5: ( LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* )
			// IdentifiersParser.g:395:5: LPAREN expression ( COMMA expression )* RPAREN
			{
			LPAREN204=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expressions2650); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN204);

			pushFollow(FOLLOW_expression_in_expressions2652);
			expression205=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression205.getTree());
			// IdentifiersParser.g:395:23: ( COMMA expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMA) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// IdentifiersParser.g:395:24: COMMA expression
					{
					COMMA206=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions2655); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA206);

					pushFollow(FOLLOW_expression_in_expressions2657);
					expression207=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression207.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			RPAREN208=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expressions2661); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN208);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 395:50: -> ( expression )*
			{
				// IdentifiersParser.g:395:53: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressions"


	public static class precedenceNotOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceNotOperator"
	// IdentifiersParser.g:398:1: precedenceNotOperator : KW_NOT ;
	public final HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceNotOperator_return retval = new HiveParser_IdentifiersParser.precedenceNotOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NOT209=null;

		CommonTree KW_NOT209_tree=null;

		try {
			// IdentifiersParser.g:399:5: ( KW_NOT )
			// IdentifiersParser.g:400:5: KW_NOT
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_NOT209=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator2687); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_NOT209_tree = (CommonTree)adaptor.create(KW_NOT209);
			adaptor.addChild(root_0, KW_NOT209_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceNotOperator"


	public static class precedenceNotExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceNotExpression"
	// IdentifiersParser.g:403:1: precedenceNotExpression : ( precedenceNotOperator ^)* precedenceEqualExpression ;
	public final HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceNotExpression_return retval = new HiveParser_IdentifiersParser.precedenceNotExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceNotOperator210 =null;
		ParserRuleReturnScope precedenceEqualExpression211 =null;


		try {
			// IdentifiersParser.g:404:5: ( ( precedenceNotOperator ^)* precedenceEqualExpression )
			// IdentifiersParser.g:405:5: ( precedenceNotOperator ^)* precedenceEqualExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			// IdentifiersParser.g:405:5: ( precedenceNotOperator ^)*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==KW_NOT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// IdentifiersParser.g:405:6: precedenceNotOperator ^
					{
					pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression2709);
					precedenceNotOperator210=precedenceNotOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator210.getTree(), root_0);
					}
					break;

				default :
					break loop47;
				}
			}

			pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2714);
			precedenceEqualExpression211=precedenceEqualExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualExpression211.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceNotExpression"


	public static class precedenceAndOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceAndOperator"
	// IdentifiersParser.g:409:1: precedenceAndOperator : KW_AND ;
	public final HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAndOperator_return retval = new HiveParser_IdentifiersParser.precedenceAndOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AND212=null;

		CommonTree KW_AND212_tree=null;

		try {
			// IdentifiersParser.g:410:5: ( KW_AND )
			// IdentifiersParser.g:411:5: KW_AND
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_AND212=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator2736); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_AND212_tree = (CommonTree)adaptor.create(KW_AND212);
			adaptor.addChild(root_0, KW_AND212_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceAndOperator"


	public static class precedenceAndExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceAndExpression"
	// IdentifiersParser.g:414:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAndExpression_return retval = new HiveParser_IdentifiersParser.precedenceAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceNotExpression213 =null;
		ParserRuleReturnScope precedenceAndOperator214 =null;
		ParserRuleReturnScope precedenceNotExpression215 =null;


		try {
			// IdentifiersParser.g:415:5: ( precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* )
			// IdentifiersParser.g:416:5: precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2757);
			precedenceNotExpression213=precedenceNotExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression213.getTree());

			// IdentifiersParser.g:416:29: ( precedenceAndOperator ^ precedenceNotExpression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==KW_AND) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// IdentifiersParser.g:416:30: precedenceAndOperator ^ precedenceNotExpression
					{
					pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression2760);
					precedenceAndOperator214=precedenceAndOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator214.getTree(), root_0);
					pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2763);
					precedenceNotExpression215=precedenceNotExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression215.getTree());

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceAndExpression"


	public static class precedenceOrOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceOrOperator"
	// IdentifiersParser.g:420:1: precedenceOrOperator : KW_OR ;
	public final HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceOrOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_OR216=null;

		CommonTree KW_OR216_tree=null;

		try {
			// IdentifiersParser.g:421:5: ( KW_OR )
			// IdentifiersParser.g:422:5: KW_OR
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_OR216=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator2787); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_OR216_tree = (CommonTree)adaptor.create(KW_OR216);
			adaptor.addChild(root_0, KW_OR216_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceOrOperator"


	public static class precedenceOrExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "precedenceOrExpression"
	// IdentifiersParser.g:425:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceOrExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceAndExpression217 =null;
		ParserRuleReturnScope precedenceOrOperator218 =null;
		ParserRuleReturnScope precedenceAndExpression219 =null;


		try {
			// IdentifiersParser.g:426:5: ( precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* )
			// IdentifiersParser.g:427:5: precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2808);
			precedenceAndExpression217=precedenceAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression217.getTree());

			// IdentifiersParser.g:427:29: ( precedenceOrOperator ^ precedenceAndExpression )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==KW_OR) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// IdentifiersParser.g:427:30: precedenceOrOperator ^ precedenceAndExpression
					{
					pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression2811);
					precedenceOrOperator218=precedenceOrOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator218.getTree(), root_0);
					pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2814);
					precedenceAndExpression219=precedenceAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression219.getTree());

					}
					break;

				default :
					break loop49;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precedenceOrExpression"


	public static class booleanValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "booleanValue"
	// IdentifiersParser.g:431:1: booleanValue : ( KW_TRUE ^| KW_FALSE ^);
	public final HiveParser_IdentifiersParser.booleanValue_return booleanValue() throws RecognitionException {
		HiveParser_IdentifiersParser.booleanValue_return retval = new HiveParser_IdentifiersParser.booleanValue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_TRUE220=null;
		Token KW_FALSE221=null;

		CommonTree KW_TRUE220_tree=null;
		CommonTree KW_FALSE221_tree=null;

		try {
			// IdentifiersParser.g:432:5: ( KW_TRUE ^| KW_FALSE ^)
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==KW_TRUE) ) {
				alt50=1;
			}
			else if ( (LA50_0==KW_FALSE) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// IdentifiersParser.g:433:5: KW_TRUE ^
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_TRUE220=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue2838); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_TRUE220_tree = (CommonTree)adaptor.create(KW_TRUE220);
					root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE220_tree, root_0);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:433:16: KW_FALSE ^
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_FALSE221=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue2843); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_FALSE221_tree = (CommonTree)adaptor.create(KW_FALSE221);
					root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE221_tree, root_0);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanValue"


	public static class tableOrPartition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableOrPartition"
	// IdentifiersParser.g:436:1: tableOrPartition : tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) ;
	public final HiveParser_IdentifiersParser.tableOrPartition_return tableOrPartition() throws RecognitionException {
		HiveParser_IdentifiersParser.tableOrPartition_return retval = new HiveParser_IdentifiersParser.tableOrPartition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope tableName222 =null;
		ParserRuleReturnScope partitionSpec223 =null;

		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		try {
			// IdentifiersParser.g:437:4: ( tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) )
			// IdentifiersParser.g:438:4: tableName ( partitionSpec )?
			{
			pushFollow(FOLLOW_tableName_in_tableOrPartition2863);
			tableName222=gHiveParser.tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tableName222.getTree());
			// IdentifiersParser.g:438:14: ( partitionSpec )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==KW_PARTITION) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// IdentifiersParser.g:438:14: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_tableOrPartition2865);
					partitionSpec223=partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec223.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: partitionSpec, tableName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 438:29: -> ^( TOK_TAB tableName ( partitionSpec )? )
			{
				// IdentifiersParser.g:438:32: ^( TOK_TAB tableName ( partitionSpec )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TAB, "TOK_TAB"), root_1);
				adaptor.addChild(root_1, stream_tableName.nextTree());
				// IdentifiersParser.g:438:52: ( partitionSpec )?
				if ( stream_partitionSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				}
				stream_partitionSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableOrPartition"


	public static class partitionSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionSpec"
	// IdentifiersParser.g:441:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
	public final HiveParser_IdentifiersParser.partitionSpec_return partitionSpec() throws RecognitionException {
		HiveParser_IdentifiersParser.partitionSpec_return retval = new HiveParser_IdentifiersParser.partitionSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PARTITION224=null;
		Token LPAREN225=null;
		Token COMMA227=null;
		Token RPAREN229=null;
		ParserRuleReturnScope partitionVal226 =null;
		ParserRuleReturnScope partitionVal228 =null;

		CommonTree KW_PARTITION224_tree=null;
		CommonTree LPAREN225_tree=null;
		CommonTree COMMA227_tree=null;
		CommonTree RPAREN229_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");

		try {
			// IdentifiersParser.g:442:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
			// IdentifiersParser.g:443:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
			{
			KW_PARTITION224=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec2897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION224);

			LPAREN225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec2904); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN225);

			pushFollow(FOLLOW_partitionVal_in_partitionSpec2906);
			partitionVal226=partitionVal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal226.getTree());
			// IdentifiersParser.g:444:26: ( COMMA partitionVal )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==COMMA) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// IdentifiersParser.g:444:27: COMMA partitionVal
					{
					COMMA227=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionSpec2909); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA227);

					pushFollow(FOLLOW_partitionVal_in_partitionSpec2912);
					partitionVal228=partitionVal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal228.getTree());
					}
					break;

				default :
					break loop52;
				}
			}

			RPAREN229=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec2917); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN229);

			// AST REWRITE
			// elements: partitionVal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 444:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
			{
				// IdentifiersParser.g:444:60: ^( TOK_PARTSPEC ( partitionVal )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC"), root_1);
				if ( !(stream_partitionVal.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_partitionVal.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionVal.nextTree());
				}
				stream_partitionVal.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionSpec"


	public static class partitionVal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionVal"
	// IdentifiersParser.g:447:1: partitionVal : identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) ;
	public final HiveParser_IdentifiersParser.partitionVal_return partitionVal() throws RecognitionException {
		HiveParser_IdentifiersParser.partitionVal_return retval = new HiveParser_IdentifiersParser.partitionVal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL231=null;
		ParserRuleReturnScope identifier230 =null;
		ParserRuleReturnScope constant232 =null;

		CommonTree EQUAL231_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// IdentifiersParser.g:448:5: ( identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) )
			// IdentifiersParser.g:449:5: identifier ( EQUAL constant )?
			{
			pushFollow(FOLLOW_identifier_in_partitionVal2948);
			identifier230=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier230.getTree());
			// IdentifiersParser.g:449:16: ( EQUAL constant )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EQUAL) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// IdentifiersParser.g:449:17: EQUAL constant
					{
					EQUAL231=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal2951); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL231);

					pushFollow(FOLLOW_constant_in_partitionVal2953);
					constant232=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(constant232.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: identifier, constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 449:34: -> ^( TOK_PARTVAL identifier ( constant )? )
			{
				// IdentifiersParser.g:449:37: ^( TOK_PARTVAL identifier ( constant )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				// IdentifiersParser.g:449:62: ( constant )?
				if ( stream_constant.hasNext() ) {
					adaptor.addChild(root_1, stream_constant.nextTree());
				}
				stream_constant.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionVal"


	public static class dropPartitionSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dropPartitionSpec"
	// IdentifiersParser.g:452:1: dropPartitionSpec : KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) ;
	public final HiveParser_IdentifiersParser.dropPartitionSpec_return dropPartitionSpec() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionSpec_return retval = new HiveParser_IdentifiersParser.dropPartitionSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PARTITION233=null;
		Token LPAREN234=null;
		Token COMMA236=null;
		Token RPAREN238=null;
		ParserRuleReturnScope dropPartitionVal235 =null;
		ParserRuleReturnScope dropPartitionVal237 =null;

		CommonTree KW_PARTITION233_tree=null;
		CommonTree LPAREN234_tree=null;
		CommonTree COMMA236_tree=null;
		CommonTree RPAREN238_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_dropPartitionVal=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionVal");

		try {
			// IdentifiersParser.g:453:5: ( KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) )
			// IdentifiersParser.g:454:5: KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN
			{
			KW_PARTITION233=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_dropPartitionSpec2987); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION233);

			LPAREN234=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dropPartitionSpec2994); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN234);

			pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec2996);
			dropPartitionVal235=dropPartitionVal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal235.getTree());
			// IdentifiersParser.g:455:30: ( COMMA dropPartitionVal )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==COMMA) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// IdentifiersParser.g:455:31: COMMA dropPartitionVal
					{
					COMMA236=(Token)match(input,COMMA,FOLLOW_COMMA_in_dropPartitionSpec2999); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA236);

					pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3002);
					dropPartitionVal237=dropPartitionVal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal237.getTree());
					}
					break;

				default :
					break loop54;
				}
			}

			RPAREN238=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dropPartitionSpec3007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN238);

			// AST REWRITE
			// elements: dropPartitionVal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 455:65: -> ^( TOK_PARTSPEC ( dropPartitionVal )+ )
			{
				// IdentifiersParser.g:455:68: ^( TOK_PARTSPEC ( dropPartitionVal )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTSPEC, "TOK_PARTSPEC"), root_1);
				if ( !(stream_dropPartitionVal.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_dropPartitionVal.hasNext() ) {
					adaptor.addChild(root_1, stream_dropPartitionVal.nextTree());
				}
				stream_dropPartitionVal.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropPartitionSpec"


	public static class dropPartitionVal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dropPartitionVal"
	// IdentifiersParser.g:458:1: dropPartitionVal : identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) ;
	public final HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionVal_return retval = new HiveParser_IdentifiersParser.dropPartitionVal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier239 =null;
		ParserRuleReturnScope dropPartitionOperator240 =null;
		ParserRuleReturnScope constant241 =null;

		RewriteRuleSubtreeStream stream_dropPartitionOperator=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionOperator");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// IdentifiersParser.g:459:5: ( identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) )
			// IdentifiersParser.g:460:5: identifier dropPartitionOperator constant
			{
			pushFollow(FOLLOW_identifier_in_dropPartitionVal3038);
			identifier239=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier239.getTree());
			pushFollow(FOLLOW_dropPartitionOperator_in_dropPartitionVal3040);
			dropPartitionOperator240=dropPartitionOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dropPartitionOperator.add(dropPartitionOperator240.getTree());
			pushFollow(FOLLOW_constant_in_dropPartitionVal3042);
			constant241=constant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constant.add(constant241.getTree());
			// AST REWRITE
			// elements: identifier, constant, dropPartitionOperator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 460:47: -> ^( TOK_PARTVAL identifier dropPartitionOperator constant )
			{
				// IdentifiersParser.g:460:50: ^( TOK_PARTVAL identifier dropPartitionOperator constant )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_dropPartitionOperator.nextTree());
				adaptor.addChild(root_1, stream_constant.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropPartitionVal"


	public static class dropPartitionOperator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dropPartitionOperator"
	// IdentifiersParser.g:463:1: dropPartitionOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
	public final HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionOperator_return retval = new HiveParser_IdentifiersParser.dropPartitionOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set242=null;

		CommonTree set242_tree=null;

		try {
			// IdentifiersParser.g:464:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set242=input.LT(1);
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set242));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropPartitionOperator"


	public static class sysFuncNames_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sysFuncNames"
	// IdentifiersParser.g:468:1: sysFuncNames : ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN );
	public final HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames() throws RecognitionException {
		HiveParser_IdentifiersParser.sysFuncNames_return retval = new HiveParser_IdentifiersParser.sysFuncNames_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set243=null;

		CommonTree set243_tree=null;

		try {
			// IdentifiersParser.g:469:5: ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set243=input.LT(1);
			if ( (input.LA(1) >= AMPERSAND && input.LA(1) <= BITWISEXOR)||(input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||(input.LA(1) >= EQUAL && input.LA(1) <= EQUAL_NS)||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_AND||input.LA(1)==KW_ARRAY||(input.LA(1) >= KW_BETWEEN && input.LA(1) <= KW_BOOLEAN)||input.LA(1)==KW_CASE||input.LA(1)==KW_DOUBLE||input.LA(1)==KW_FLOAT||input.LA(1)==KW_IF||input.LA(1)==KW_IN||input.LA(1)==KW_INT||input.LA(1)==KW_LIKE||input.LA(1)==KW_MAP||input.LA(1)==KW_NOT||input.LA(1)==KW_OR||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE||input.LA(1)==KW_SMALLINT||(input.LA(1) >= KW_STRING && input.LA(1) <= KW_STRUCT)||input.LA(1)==KW_TINYINT||input.LA(1)==KW_UNIONTYPE||input.LA(1)==KW_WHEN||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||(input.LA(1) >= MINUS && input.LA(1) <= NOTEQUAL)||input.LA(1)==PLUS||input.LA(1)==STAR||input.LA(1)==TILDE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set243));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sysFuncNames"


	public static class descFuncNames_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "descFuncNames"
	// IdentifiersParser.g:513:1: descFuncNames : ( sysFuncNames | StringLiteral | identifier );
	public final HiveParser_IdentifiersParser.descFuncNames_return descFuncNames() throws RecognitionException {
		HiveParser_IdentifiersParser.descFuncNames_return retval = new HiveParser_IdentifiersParser.descFuncNames_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token StringLiteral245=null;
		ParserRuleReturnScope sysFuncNames244 =null;
		ParserRuleReturnScope identifier246 =null;

		CommonTree StringLiteral245_tree=null;

		try {
			// IdentifiersParser.g:514:5: ( sysFuncNames | StringLiteral | identifier )
			int alt55=3;
			switch ( input.LA(1) ) {
			case AMPERSAND:
			case BITWISEOR:
			case BITWISEXOR:
			case DIV:
			case DIVIDE:
			case EQUAL:
			case EQUAL_NS:
			case GREATERTHAN:
			case GREATERTHANOREQUALTO:
			case KW_AND:
			case KW_ARRAY:
			case KW_BETWEEN:
			case KW_BIGINT:
			case KW_BINARY:
			case KW_BOOLEAN:
			case KW_CASE:
			case KW_DOUBLE:
			case KW_FLOAT:
			case KW_IF:
			case KW_IN:
			case KW_INT:
			case KW_LIKE:
			case KW_MAP:
			case KW_NOT:
			case KW_OR:
			case KW_REGEXP:
			case KW_RLIKE:
			case KW_SMALLINT:
			case KW_STRING:
			case KW_STRUCT:
			case KW_TINYINT:
			case KW_UNIONTYPE:
			case KW_WHEN:
			case LESSTHAN:
			case LESSTHANOREQUALTO:
			case MINUS:
			case MOD:
			case NOTEQUAL:
			case PLUS:
			case STAR:
			case TILDE:
				{
				alt55=1;
				}
				break;
			case StringLiteral:
				{
				alt55=2;
				}
				break;
			case Identifier:
			case KW_ADD:
			case KW_AFTER:
			case KW_ALTER:
			case KW_ANALYZE:
			case KW_ARCHIVE:
			case KW_AS:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BOTH:
			case KW_BUCKET:
			case KW_BUCKETS:
			case KW_BY:
			case KW_CASCADE:
			case KW_CHANGE:
			case KW_CLUSTER:
			case KW_CLUSTERED:
			case KW_CLUSTERSTATUS:
			case KW_COLLECTION:
			case KW_COLUMNS:
			case KW_COMMENT:
			case KW_COMPUTE:
			case KW_CONCATENATE:
			case KW_CONTINUE:
			case KW_CREATE:
			case KW_CUBE:
			case KW_CURSOR:
			case KW_DATA:
			case KW_DATABASES:
			case KW_DATE:
			case KW_DATETIME:
			case KW_DBPROPERTIES:
			case KW_DECIMAL:
			case KW_DEFERRED:
			case KW_DELETE:
			case KW_DELIMITED:
			case KW_DEPENDENCY:
			case KW_DESC:
			case KW_DESCRIBE:
			case KW_DIRECTORIES:
			case KW_DIRECTORY:
			case KW_DISABLE:
			case KW_DISTRIBUTE:
			case KW_DROP:
			case KW_ELEM_TYPE:
			case KW_ENABLE:
			case KW_ESCAPED:
			case KW_EXCLUSIVE:
			case KW_EXISTS:
			case KW_EXPLAIN:
			case KW_EXPORT:
			case KW_EXTERNAL:
			case KW_FALSE:
			case KW_FETCH:
			case KW_FIELDS:
			case KW_FILEFORMAT:
			case KW_FIRST:
			case KW_FOR:
			case KW_FORMAT:
			case KW_FORMATTED:
			case KW_FULL:
			case KW_FUNCTIONS:
			case KW_GRANT:
			case KW_GROUP:
			case KW_GROUPING:
			case KW_HOLD_DDLTIME:
			case KW_IDXPROPERTIES:
			case KW_IGNORE:
			case KW_IMPORT:
			case KW_INCRE:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_INNER:
			case KW_INPATH:
			case KW_INPUTDRIVER:
			case KW_INPUTFORMAT:
			case KW_INSERT:
			case KW_INTERSECT:
			case KW_INTO:
			case KW_IS:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_LATERAL:
			case KW_LEFT:
			case KW_LIMIT:
			case KW_LINES:
			case KW_LOAD:
			case KW_LOCAL:
			case KW_LOCATION:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_LOGICAL:
			case KW_LONG:
			case KW_MAPJOIN:
			case KW_MATERIALIZED:
			case KW_MINUS:
			case KW_MSCK:
			case KW_NOSCAN:
			case KW_NO_DROP:
			case KW_NULL:
			case KW_OF:
			case KW_OFFLINE:
			case KW_OPTION:
			case KW_ORCFILE:
			case KW_ORDER:
			case KW_OUT:
			case KW_OUTER:
			case KW_OUTPUTDRIVER:
			case KW_OUTPUTFORMAT:
			case KW_OVERWRITE:
			case KW_PARTITION:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PERCENT:
			case KW_PLUS:
			case KW_PRETTY:
			case KW_PROCEDURE:
			case KW_PROTECTION:
			case KW_PURGE:
			case KW_RANGE:
			case KW_RCFILE:
			case KW_READ:
			case KW_READONLY:
			case KW_READS:
			case KW_REBUILD:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_RENAME:
			case KW_REPAIR:
			case KW_REPLACE:
			case KW_RESTRICT:
			case KW_REVOKE:
			case KW_RIGHT:
			case KW_ROLE:
			case KW_ROLLUP:
			case KW_ROW:
			case KW_ROWS:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SEMI:
			case KW_SEQUENCEFILE:
			case KW_SERDE:
			case KW_SERDEPROPERTIES:
			case KW_SET:
			case KW_SETS:
			case KW_SHARED:
			case KW_SHOW:
			case KW_SHOW_DATABASE:
			case KW_SKEWED:
			case KW_SORT:
			case KW_SORTED:
			case KW_SSL:
			case KW_STATISTICS:
			case KW_STORED:
			case KW_STREAMTABLE:
			case KW_TABLE:
			case KW_TABLES:
			case KW_TBLPROPERTIES:
			case KW_TEMPORARY:
			case KW_TERMINATED:
			case KW_TEXTFILE:
			case KW_TIMESTAMP:
			case KW_TO:
			case KW_TOUCH:
			case KW_TRIGGER:
			case KW_TRUE:
			case KW_TRUNCATE:
			case KW_UNARCHIVE:
			case KW_UNDO:
			case KW_UNION:
			case KW_UNLOCK:
			case KW_UNSET:
			case KW_UNSIGNED:
			case KW_UPDATE:
			case KW_USE:
			case KW_USER:
			case KW_USING:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_VALUE_TYPE:
			case KW_VIEW:
			case KW_WHILE:
			case KW_WITH:
				{
				alt55=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// IdentifiersParser.g:515:7: sysFuncNames
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sysFuncNames_in_descFuncNames3461);
					sysFuncNames244=sysFuncNames();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sysFuncNames244.getTree());

					}
					break;
				case 2 :
					// IdentifiersParser.g:516:7: StringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					StringLiteral245=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_descFuncNames3469); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral245_tree = (CommonTree)adaptor.create(StringLiteral245);
					adaptor.addChild(root_0, StringLiteral245_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:517:7: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_descFuncNames3477);
					identifier246=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier246.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "descFuncNames"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// IdentifiersParser.g:520:1: identifier : ( Identifier | nonReserved -> Identifier[$nonReserved.text] );
	public final HiveParser_IdentifiersParser.identifier_return identifier() throws RecognitionException {
		HiveParser_IdentifiersParser.identifier_return retval = new HiveParser_IdentifiersParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier247=null;
		ParserRuleReturnScope nonReserved248 =null;

		CommonTree Identifier247_tree=null;
		RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");

		try {
			// IdentifiersParser.g:521:5: ( Identifier | nonReserved -> Identifier[$nonReserved.text] )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==Identifier) ) {
				alt56=1;
			}
			else if ( ((LA56_0 >= KW_ADD && LA56_0 <= KW_AFTER)||(LA56_0 >= KW_ALTER && LA56_0 <= KW_ANALYZE)||(LA56_0 >= KW_ARCHIVE && LA56_0 <= KW_CASCADE)||(LA56_0 >= KW_CHANGE && LA56_0 <= KW_COLLECTION)||(LA56_0 >= KW_COLUMNS && LA56_0 <= KW_CREATE)||LA56_0==KW_CUBE||(LA56_0 >= KW_CURSOR && LA56_0 <= KW_DATA)||(LA56_0 >= KW_DATABASES && LA56_0 <= KW_DISABLE)||(LA56_0 >= KW_DISTRIBUTE && LA56_0 <= KW_ELEM_TYPE)||LA56_0==KW_ENABLE||LA56_0==KW_ESCAPED||(LA56_0 >= KW_EXCLUSIVE && LA56_0 <= KW_EXPORT)||(LA56_0 >= KW_EXTERNAL && LA56_0 <= KW_FLOAT)||(LA56_0 >= KW_FOR && LA56_0 <= KW_FORMATTED)||LA56_0==KW_FULL||(LA56_0 >= KW_FUNCTIONS && LA56_0 <= KW_GROUPING)||(LA56_0 >= KW_HOLD_DDLTIME && LA56_0 <= KW_IDXPROPERTIES)||(LA56_0 >= KW_IGNORE && LA56_0 <= KW_ITEMS)||(LA56_0 >= KW_KEYS && LA56_0 <= KW_LEFT)||(LA56_0 >= KW_LIKE && LA56_0 <= KW_LONG)||(LA56_0 >= KW_MAPJOIN && LA56_0 <= KW_MINUS)||(LA56_0 >= KW_MSCK && LA56_0 <= KW_NOSCAN)||(LA56_0 >= KW_NO_DROP && LA56_0 <= KW_OFFLINE)||LA56_0==KW_OPTION||(LA56_0 >= KW_ORCFILE && LA56_0 <= KW_OUTPUTFORMAT)||LA56_0==KW_OVERWRITE||(LA56_0 >= KW_PARTITION && LA56_0 <= KW_PLUS)||(LA56_0 >= KW_PRETTY && LA56_0 <= KW_RECORDWRITER)||(LA56_0 >= KW_REGEXP && LA56_0 <= KW_SCHEMAS)||(LA56_0 >= KW_SEMI && LA56_0 <= KW_TABLES)||(LA56_0 >= KW_TBLPROPERTIES && LA56_0 <= KW_TEXTFILE)||(LA56_0 >= KW_TIMESTAMP && LA56_0 <= KW_TOUCH)||(LA56_0 >= KW_TRIGGER && LA56_0 <= KW_UNARCHIVE)||(LA56_0 >= KW_UNDO && LA56_0 <= KW_UNIONTYPE)||(LA56_0 >= KW_UNLOCK && LA56_0 <= KW_VALUE_TYPE)||LA56_0==KW_VIEW||LA56_0==KW_WHILE||LA56_0==KW_WITH) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// IdentifiersParser.g:522:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier247=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier3498); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier247_tree = (CommonTree)adaptor.create(Identifier247);
					adaptor.addChild(root_0, Identifier247_tree);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:523:7: nonReserved
					{
					pushFollow(FOLLOW_nonReserved_in_identifier3506);
					nonReserved248=nonReserved();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved248.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 523:19: -> Identifier[$nonReserved.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(Identifier, (nonReserved248!=null?input.toString(nonReserved248.start,nonReserved248.stop):null)));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class nonReserved_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nonReserved"
	// IdentifiersParser.g:526:1: nonReserved : ( KW_INCRE | KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER );
	public final HiveParser_IdentifiersParser.nonReserved_return nonReserved() throws RecognitionException {
		HiveParser_IdentifiersParser.nonReserved_return retval = new HiveParser_IdentifiersParser.nonReserved_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set249=null;

		CommonTree set249_tree=null;

		try {
			// IdentifiersParser.g:527:5: ( KW_INCRE | KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set249=input.LT(1);
			if ( (input.LA(1) >= KW_ADD && input.LA(1) <= KW_AFTER)||(input.LA(1) >= KW_ALTER && input.LA(1) <= KW_ANALYZE)||(input.LA(1) >= KW_ARCHIVE && input.LA(1) <= KW_CASCADE)||(input.LA(1) >= KW_CHANGE && input.LA(1) <= KW_COLLECTION)||(input.LA(1) >= KW_COLUMNS && input.LA(1) <= KW_CREATE)||input.LA(1)==KW_CUBE||(input.LA(1) >= KW_CURSOR && input.LA(1) <= KW_DATA)||(input.LA(1) >= KW_DATABASES && input.LA(1) <= KW_DISABLE)||(input.LA(1) >= KW_DISTRIBUTE && input.LA(1) <= KW_ELEM_TYPE)||input.LA(1)==KW_ENABLE||input.LA(1)==KW_ESCAPED||(input.LA(1) >= KW_EXCLUSIVE && input.LA(1) <= KW_EXPORT)||(input.LA(1) >= KW_EXTERNAL && input.LA(1) <= KW_FLOAT)||(input.LA(1) >= KW_FOR && input.LA(1) <= KW_FORMATTED)||input.LA(1)==KW_FULL||(input.LA(1) >= KW_FUNCTIONS && input.LA(1) <= KW_GROUPING)||(input.LA(1) >= KW_HOLD_DDLTIME && input.LA(1) <= KW_IDXPROPERTIES)||(input.LA(1) >= KW_IGNORE && input.LA(1) <= KW_ITEMS)||(input.LA(1) >= KW_KEYS && input.LA(1) <= KW_LEFT)||(input.LA(1) >= KW_LIKE && input.LA(1) <= KW_LONG)||(input.LA(1) >= KW_MAPJOIN && input.LA(1) <= KW_MINUS)||(input.LA(1) >= KW_MSCK && input.LA(1) <= KW_NOSCAN)||(input.LA(1) >= KW_NO_DROP && input.LA(1) <= KW_OFFLINE)||input.LA(1)==KW_OPTION||(input.LA(1) >= KW_ORCFILE && input.LA(1) <= KW_OUTPUTFORMAT)||input.LA(1)==KW_OVERWRITE||(input.LA(1) >= KW_PARTITION && input.LA(1) <= KW_PLUS)||(input.LA(1) >= KW_PRETTY && input.LA(1) <= KW_RECORDWRITER)||(input.LA(1) >= KW_REGEXP && input.LA(1) <= KW_SCHEMAS)||(input.LA(1) >= KW_SEMI && input.LA(1) <= KW_TABLES)||(input.LA(1) >= KW_TBLPROPERTIES && input.LA(1) <= KW_TEXTFILE)||(input.LA(1) >= KW_TIMESTAMP && input.LA(1) <= KW_TOUCH)||(input.LA(1) >= KW_TRIGGER && input.LA(1) <= KW_UNARCHIVE)||(input.LA(1) >= KW_UNDO && input.LA(1) <= KW_UNIONTYPE)||(input.LA(1) >= KW_UNLOCK && input.LA(1) <= KW_VALUE_TYPE)||input.LA(1)==KW_VIEW||input.LA(1)==KW_WHILE||input.LA(1)==KW_WITH ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set249));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonReserved"

	// $ANTLR start synpred1_IdentifiersParser
	public final void synpred1_IdentifiersParser_fragment() throws RecognitionException {
		// IdentifiersParser.g:127:7: ( COMMA )
		// IdentifiersParser.g:127:8: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred1_IdentifiersParser616); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_IdentifiersParser

	// $ANTLR start synpred2_IdentifiersParser
	public final void synpred2_IdentifiersParser_fragment() throws RecognitionException {
		// IdentifiersParser.g:138:17: ( COMMA )
		// IdentifiersParser.g:138:18: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred2_IdentifiersParser717); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_IdentifiersParser

	// $ANTLR start synpred3_IdentifiersParser
	public final void synpred3_IdentifiersParser_fragment() throws RecognitionException {
		// IdentifiersParser.g:149:17: ( COMMA )
		// IdentifiersParser.g:149:18: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred3_IdentifiersParser817); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_IdentifiersParser

	// $ANTLR start synpred4_IdentifiersParser
	public final void synpred4_IdentifiersParser_fragment() throws RecognitionException {
		// IdentifiersParser.g:162:7: ( COMMA )
		// IdentifiersParser.g:162:8: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred4_IdentifiersParser927); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_IdentifiersParser

	// Delegated rules

	public final boolean synpred4_IdentifiersParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_IdentifiersParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_IdentifiersParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_IdentifiersParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_IdentifiersParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_IdentifiersParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_IdentifiersParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_IdentifiersParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA26 dfa26 = new DFA26(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA33 dfa33 = new DFA33(this);
	protected DFA34 dfa34 = new DFA34(this);
	protected DFA35 dfa35 = new DFA35(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA39 dfa39 = new DFA39(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA45 dfa45 = new DFA45(this);
	static final String DFA6_eotS =
		"\u01f4\uffff";
	static final String DFA6_eofS =
		"\u01f4\uffff";
	static final String DFA6_minS =
		"\1\7\26\uffff\1\7\1\uffff\2\7\10\4\1\14\2\4\1\u010f\1\4\1\u010f\4\4\1"+
		"\u010f\2\7\u01c4\uffff";
	static final String DFA6_maxS =
		"\1\u0121\26\uffff\1\u0121\1\uffff\2\u0121\1\u011d\1\u011f\1\u011d\1\u011f"+
		"\4\u011d\1\14\2\u011d\1\u010f\1\u011d\1\u010f\4\u011d\1\u010f\2\u0121"+
		"\u01c4\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\26\uffff\1\3\27\uffff\104\1\1\2\30\1\1\uffff\26\1\1\uffff"+
		"\27\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\30\1"+
		"\1\uffff\27\1\1\uffff\30\1\1\uffff\30\1\1\uffff\27\1\1\uffff\27\1\1\uffff"+
		"\27\1\1\uffff\60\1";
	static final String DFA6_specialS =
		"\u01f4\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\3\1\1\uffff\2\1\1\uffff\25\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\23\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\1\1\1"+
			"\uffff\6\1\1\uffff\1\1\1\uffff\5\1\2\uffff\14\1\1\uffff\16\1\1\uffff"+
			"\25\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1"+
			"\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\27\2\uffff\1\1\2\uffff\2"+
			"\1\7\uffff\4\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37\5\uffff\1\43\4\uffff\1\42\7\uffff\1\53\2\54\1\uffff\2\54\1\uffff"+
			"\1\54\1\47\14\54\1\56\1\55\5\54\1\uffff\6\54\1\uffff\1\54\1\uffff\2\54"+
			"\1\uffff\1\54\1\34\14\54\1\uffff\4\54\1\uffff\1\54\1\uffff\1\54\1\uffff"+
			"\4\54\1\uffff\1\54\1\45\5\54\1\uffff\3\54\1\uffff\1\54\1\uffff\4\54\1"+
			"\uffff\2\54\1\46\20\54\1\uffff\4\54\1\uffff\12\54\1\uffff\1\50\3\54\1"+
			"\uffff\2\54\1\31\1\54\1\33\2\54\1\uffff\1\54\1\uffff\6\54\1\uffff\1\54"+
			"\1\uffff\5\54\2\uffff\14\54\1\uffff\16\54\1\uffff\22\54\1\51\2\54\1\uffff"+
			"\4\54\1\uffff\4\54\1\uffff\1\54\1\44\2\54\1\uffff\2\54\1\52\1\uffff\12"+
			"\54\1\uffff\1\54\2\uffff\1\54\1\uffff\1\54\3\uffff\1\57\2\uffff\1\32"+
			"\2\uffff\1\35\1\32\2\uffff\1\30\4\uffff\1\40\1\36\1\32\1\41",
			"",
			"\1\65\5\uffff\1\71\4\uffff\1\70\7\uffff\1\101\2\102\1\uffff\2\102\1"+
			"\uffff\1\102\1\75\14\102\1\104\1\103\5\102\1\uffff\6\102\1\uffff\1\102"+
			"\1\uffff\2\102\1\uffff\1\102\1\62\14\102\1\uffff\4\102\1\uffff\1\102"+
			"\1\uffff\1\102\1\uffff\4\102\1\uffff\1\102\1\73\5\102\1\uffff\3\102\1"+
			"\uffff\1\102\1\uffff\4\102\1\uffff\2\102\1\74\20\102\1\uffff\4\102\1"+
			"\uffff\12\102\1\uffff\1\76\3\102\1\uffff\2\102\1\106\1\102\1\61\2\102"+
			"\1\uffff\1\102\1\uffff\6\102\1\uffff\1\102\1\uffff\5\102\2\uffff\14\102"+
			"\1\uffff\16\102\1\uffff\22\102\1\77\2\102\1\uffff\4\102\1\uffff\4\102"+
			"\1\uffff\1\102\1\72\2\102\1\uffff\2\102\1\100\1\uffff\12\102\1\uffff"+
			"\1\102\2\uffff\1\102\1\uffff\1\102\3\uffff\1\105\2\uffff\1\60\2\uffff"+
			"\1\63\1\60\7\uffff\1\66\1\64\1\60\1\67",
			"\1\113\5\uffff\1\117\4\uffff\1\116\7\uffff\1\127\2\130\1\uffff\2\130"+
			"\1\uffff\1\130\1\123\14\130\1\132\1\131\5\130\1\uffff\6\130\1\uffff\1"+
			"\130\1\uffff\2\130\1\uffff\1\130\1\110\14\130\1\uffff\4\130\1\uffff\1"+
			"\130\1\uffff\1\130\1\uffff\4\130\1\uffff\1\130\1\121\5\130\1\uffff\3"+
			"\130\1\uffff\1\130\1\uffff\4\130\1\uffff\2\130\1\122\20\130\1\uffff\4"+
			"\130\1\uffff\12\130\1\uffff\1\124\3\130\1\uffff\2\130\1\uffff\1\130\1"+
			"\107\2\130\1\uffff\1\130\1\uffff\6\130\1\uffff\1\130\1\uffff\5\130\2"+
			"\uffff\14\130\1\uffff\16\130\1\uffff\22\130\1\125\2\130\1\uffff\4\130"+
			"\1\uffff\4\130\1\uffff\1\130\1\120\2\130\1\uffff\2\130\1\126\1\uffff"+
			"\12\130\1\uffff\1\130\2\uffff\1\130\1\uffff\1\130\3\uffff\1\133\2\uffff"+
			"\1\134\2\uffff\1\111\1\134\7\uffff\1\114\1\112\1\134\1\115",
			"\1\143\1\144\1\140\3\uffff\1\164\3\uffff\2\141\1\uffff\1\136\2\uffff"+
			"\1\147\1\150\1\uffff\1\155\1\154\7\uffff\1\160\5\uffff\1\157\121\uffff"+
			"\1\156\13\uffff\1\137\7\uffff\1\146\21\uffff\1\145\6\uffff\1\161\35\uffff"+
			"\1\146\6\uffff\1\146\102\uffff\1\153\1\152\1\163\1\135\1\uffff\1\142"+
			"\1\141\1\151\1\uffff\1\142\2\uffff\1\162\3\uffff\1\141",
			"\1\175\1\176\1\172\3\uffff\1\164\3\uffff\2\173\1\uffff\1\170\2\uffff"+
			"\1\u0081\1\u0082\1\uffff\1\u0087\1\u0086\7\uffff\1\u008a\5\uffff\1\u0089"+
			"\121\uffff\1\u0088\13\uffff\1\171\7\uffff\1\u0080\21\uffff\1\177\6\uffff"+
			"\1\u008b\35\uffff\1\u0080\6\uffff\1\u0080\102\uffff\1\u0085\1\u0084\1"+
			"\166\1\167\1\uffff\1\174\1\173\1\u0083\1\uffff\1\174\2\uffff\1\u008c"+
			"\3\uffff\1\173\1\uffff\1\165",
			"\1\u0094\1\u0095\1\u0091\3\uffff\1\164\3\uffff\2\u0092\1\uffff\1\u008f"+
			"\2\uffff\1\u0098\1\u0099\1\uffff\1\u009e\1\u009d\7\uffff\1\u00a1\5\uffff"+
			"\1\u00a0\121\uffff\1\u009f\13\uffff\1\u0090\7\uffff\1\u0097\21\uffff"+
			"\1\u0096\6\uffff\1\u00a2\35\uffff\1\u0097\6\uffff\1\u0097\102\uffff\1"+
			"\u009c\1\u009b\1\uffff\1\u008e\1\uffff\1\u0093\1\u0092\1\u009a\1\uffff"+
			"\1\u0093\2\uffff\1\u00a3\3\uffff\1\u0092",
			"\1\u00ab\1\u00ac\1\u00a8\3\uffff\1\164\3\uffff\2\u00a9\1\uffff\1\u00a6"+
			"\2\uffff\1\u00af\1\u00b0\1\uffff\1\u00b5\1\u00b4\7\uffff\1\u00b8\5\uffff"+
			"\1\u00b7\121\uffff\1\u00b6\13\uffff\1\u00a7\7\uffff\1\u00ae\21\uffff"+
			"\1\u00ad\6\uffff\1\u00b9\35\uffff\1\u00ae\6\uffff\1\u00ae\102\uffff\1"+
			"\u00b3\1\u00b2\1\uffff\1\u00a5\1\uffff\1\u00aa\1\u00a9\1\u00b1\1\uffff"+
			"\1\u00aa\2\uffff\1\u00ba\3\uffff\1\u00a9\1\uffff\1\u00bb",
			"\1\u00c3\1\u00c4\1\u00c0\3\uffff\1\164\3\uffff\2\u00c1\1\uffff\1\u00be"+
			"\2\uffff\1\u00c7\1\u00c8\1\uffff\1\u00cd\1\u00cc\7\uffff\1\u00d0\5\uffff"+
			"\1\u00cf\121\uffff\1\u00ce\13\uffff\1\u00bf\7\uffff\1\u00c6\21\uffff"+
			"\1\u00c5\6\uffff\1\u00d1\35\uffff\1\u00c6\6\uffff\1\u00c6\102\uffff\1"+
			"\u00cb\1\u00ca\1\uffff\1\u00bd\1\uffff\1\u00c2\1\u00c1\1\u00c9\1\uffff"+
			"\1\u00c2\2\uffff\1\u00d2\3\uffff\1\u00c1",
			"\1\u00da\1\u00db\1\u00d7\3\uffff\1\164\3\uffff\2\u00d8\1\uffff\1\u00d5"+
			"\2\uffff\1\u00de\1\u00df\1\uffff\1\u00e4\1\u00e3\7\uffff\1\u00e7\5\uffff"+
			"\1\u00e6\121\uffff\1\u00e5\13\uffff\1\u00d6\7\uffff\1\u00dd\21\uffff"+
			"\1\u00dc\6\uffff\1\u00e8\35\uffff\1\u00dd\6\uffff\1\u00dd\102\uffff\1"+
			"\u00e2\1\u00e1\1\uffff\1\u00d4\1\uffff\1\u00d9\1\u00d8\1\u00e0\1\uffff"+
			"\1\u00d9\2\uffff\1\u00e9\3\uffff\1\u00d8",
			"\1\u00f1\1\u00f2\1\u00ee\3\uffff\1\164\3\uffff\2\u00ef\1\uffff\1\u00ec"+
			"\2\uffff\1\u00f5\1\u00f6\1\uffff\1\u00fb\1\u00fa\7\uffff\1\u00fe\5\uffff"+
			"\1\u00fd\121\uffff\1\u00fc\13\uffff\1\u00ed\7\uffff\1\u00f4\21\uffff"+
			"\1\u00f3\6\uffff\1\u00ff\35\uffff\1\u00f4\6\uffff\1\u00f4\102\uffff\1"+
			"\u00f9\1\u00f8\1\uffff\1\u00eb\1\uffff\1\u00f0\1\u00ef\1\u00f7\1\uffff"+
			"\1\u00f0\2\uffff\1\u0100\3\uffff\1\u00ef",
			"\1\u0108\1\u0109\1\u0105\3\uffff\1\164\3\uffff\2\u0106\1\uffff\1\u0103"+
			"\2\uffff\1\u010c\1\u010d\1\uffff\1\u0112\1\u0111\7\uffff\1\u0115\5\uffff"+
			"\1\u0114\121\uffff\1\u0113\13\uffff\1\u0104\7\uffff\1\u010b\21\uffff"+
			"\1\u010a\6\uffff\1\u0116\35\uffff\1\u010b\6\uffff\1\u010b\102\uffff\1"+
			"\u0110\1\u010f\1\uffff\1\u0102\1\uffff\1\u0107\1\u0106\1\u010e\1\uffff"+
			"\1\u0107\2\uffff\1\u0117\3\uffff\1\u0106",
			"\1\u0119",
			"\1\u0120\1\u0121\1\u011d\3\uffff\1\164\3\uffff\2\u011e\1\uffff\1\u011b"+
			"\2\uffff\1\u0124\1\u0125\1\uffff\1\u012a\1\u0129\7\uffff\1\u012d\5\uffff"+
			"\1\u012c\121\uffff\1\u012b\13\uffff\1\u011c\7\uffff\1\u0123\21\uffff"+
			"\1\u0122\6\uffff\1\u012e\35\uffff\1\u0123\6\uffff\1\u0123\102\uffff\1"+
			"\u0128\1\u0127\1\u0130\1\u011a\1\uffff\1\u011f\1\u011e\1\u0126\1\uffff"+
			"\1\u011f\2\uffff\1\u012f\3\uffff\1\u011e",
			"\1\u0138\1\u0139\1\u0135\3\uffff\1\164\3\uffff\2\u0136\1\uffff\1\u0133"+
			"\2\uffff\1\u013c\1\u013d\1\uffff\1\u0142\1\u0141\7\uffff\1\u0145\5\uffff"+
			"\1\u0144\121\uffff\1\u0143\13\uffff\1\u0134\7\uffff\1\u013b\21\uffff"+
			"\1\u013a\6\uffff\1\u0146\35\uffff\1\u013b\6\uffff\1\u013b\102\uffff\1"+
			"\u0140\1\u013f\1\u0148\1\u0132\1\uffff\1\u0137\1\u0136\1\u013e\1\uffff"+
			"\1\u0137\2\uffff\1\u0147\3\uffff\1\u0136",
			"\1\u014a",
			"\1\u0152\1\u0153\1\u014f\3\uffff\1\164\3\uffff\2\u0150\1\uffff\1\u014d"+
			"\2\uffff\1\u0156\1\u0157\1\uffff\1\u015c\1\u015b\7\uffff\1\u015f\5\uffff"+
			"\1\u015e\121\uffff\1\u015d\13\uffff\1\u014e\7\uffff\1\u0155\21\uffff"+
			"\1\u0154\6\uffff\1\u0160\35\uffff\1\u0155\6\uffff\1\u0155\102\uffff\1"+
			"\u015a\1\u0159\1\u014b\1\u014c\1\uffff\1\u0151\1\u0150\1\u0158\1\uffff"+
			"\1\u0151\2\uffff\1\u0161\3\uffff\1\u0150",
			"\1\u0163",
			"\1\u016b\1\u016c\1\u0168\3\uffff\1\164\3\uffff\2\u0169\1\uffff\1\u0166"+
			"\2\uffff\1\u016f\1\u0170\1\uffff\1\u0175\1\u0174\7\uffff\1\u0178\5\uffff"+
			"\1\u0177\121\uffff\1\u0176\13\uffff\1\u0167\7\uffff\1\u016e\21\uffff"+
			"\1\u016d\6\uffff\1\u0179\35\uffff\1\u016e\6\uffff\1\u016e\102\uffff\1"+
			"\u0173\1\u0172\1\u0164\1\u0165\1\uffff\1\u016a\1\u0169\1\u0171\1\uffff"+
			"\1\u016a\2\uffff\1\u017a\3\uffff\1\u0169",
			"\1\u0183\1\u0184\1\u0180\3\uffff\1\164\3\uffff\2\u0181\1\uffff\1\u017e"+
			"\2\uffff\1\u0187\1\u0188\1\uffff\1\u018d\1\u018c\7\uffff\1\u0190\5\uffff"+
			"\1\u018f\121\uffff\1\u018e\13\uffff\1\u017f\7\uffff\1\u0186\21\uffff"+
			"\1\u0185\6\uffff\1\u0191\35\uffff\1\u0186\6\uffff\1\u0186\102\uffff\1"+
			"\u018b\1\u018a\1\u017c\1\u017d\1\uffff\1\u0182\1\u0181\1\u0189\1\uffff"+
			"\1\u0182\2\uffff\1\u0192\3\uffff\1\u0181",
			"\1\u019b\1\u019c\1\u0198\3\uffff\1\164\3\uffff\2\u0199\1\uffff\1\u0196"+
			"\2\uffff\1\u019f\1\u01a0\1\uffff\1\u01a5\1\u01a4\7\uffff\1\u01a8\5\uffff"+
			"\1\u01a7\121\uffff\1\u01a6\13\uffff\1\u0197\7\uffff\1\u019e\21\uffff"+
			"\1\u019d\6\uffff\1\u01a9\35\uffff\1\u019e\6\uffff\1\u019e\102\uffff\1"+
			"\u01a3\1\u01a2\1\u0194\1\u0195\1\uffff\1\u019a\1\u0199\1\u01a1\1\uffff"+
			"\1\u019a\2\uffff\1\u01aa\3\uffff\1\u0199",
			"\1\u01b3\1\u01b4\1\u01b0\3\uffff\1\164\3\uffff\2\u01b1\1\uffff\1\u01ae"+
			"\2\uffff\1\u01b7\1\u01b8\1\uffff\1\u01bd\1\u01bc\7\uffff\1\u01c0\5\uffff"+
			"\1\u01bf\121\uffff\1\u01be\13\uffff\1\u01af\7\uffff\1\u01b6\21\uffff"+
			"\1\u01b5\6\uffff\1\u01c1\35\uffff\1\u01b6\6\uffff\1\u01b6\102\uffff\1"+
			"\u01bb\1\u01ba\1\u01ac\1\u01ad\1\uffff\1\u01b2\1\u01b1\1\u01b9\1\uffff"+
			"\1\u01b2\2\uffff\1\u01c2\3\uffff\1\u01b1",
			"\1\u01c4",
			"\1\u01cb\5\uffff\1\u01cf\4\uffff\1\u01ce\7\uffff\1\u01d7\2\u01d8\1\uffff"+
			"\2\u01d8\1\uffff\1\u01d8\1\u01d3\14\u01d8\1\u01da\1\u01d9\5\u01d8\1\uffff"+
			"\6\u01d8\1\uffff\1\u01d8\1\uffff\2\u01d8\1\uffff\1\u01d8\1\u01c8\14\u01d8"+
			"\1\uffff\4\u01d8\1\uffff\1\u01d8\1\uffff\1\u01d8\1\uffff\4\u01d8\1\uffff"+
			"\1\u01d8\1\u01d1\5\u01d8\1\uffff\3\u01d8\1\uffff\1\u01d8\1\uffff\4\u01d8"+
			"\1\uffff\2\u01d8\1\u01d2\20\u01d8\1\uffff\4\u01d8\1\uffff\12\u01d8\1"+
			"\uffff\1\u01d4\3\u01d8\1\uffff\2\u01d8\1\u01c5\1\u01d8\1\u01c7\2\u01d8"+
			"\1\uffff\1\u01d8\1\uffff\6\u01d8\1\uffff\1\u01d8\1\uffff\5\u01d8\2\uffff"+
			"\14\u01d8\1\uffff\16\u01d8\1\uffff\22\u01d8\1\u01d5\2\u01d8\1\uffff\4"+
			"\u01d8\1\uffff\4\u01d8\1\uffff\1\u01d8\1\u01d0\2\u01d8\1\uffff\2\u01d8"+
			"\1\u01d6\1\uffff\12\u01d8\1\uffff\1\u01d8\1\u01dc\1\uffff\1\u01d8\1\uffff"+
			"\1\u01d8\3\uffff\1\u01db\2\uffff\1\u01c6\2\uffff\1\u01c9\1\u01c6\7\uffff"+
			"\1\u01cc\1\u01ca\1\u01c6\1\u01cd",
			"\1\u01e3\5\uffff\1\u01e7\4\uffff\1\u01e6\7\uffff\1\u01ef\2\u01f0\1\uffff"+
			"\2\u01f0\1\uffff\1\u01f0\1\u01eb\14\u01f0\1\u01f2\1\u01f1\5\u01f0\1\uffff"+
			"\6\u01f0\1\uffff\1\u01f0\1\uffff\2\u01f0\1\uffff\1\u01f0\1\u01e0\14\u01f0"+
			"\1\uffff\4\u01f0\1\uffff\1\u01f0\1\uffff\1\u01f0\1\uffff\4\u01f0\1\uffff"+
			"\1\u01f0\1\u01e9\5\u01f0\1\uffff\3\u01f0\1\uffff\1\u01f0\1\uffff\4\u01f0"+
			"\1\uffff\2\u01f0\1\u01ea\20\u01f0\1\uffff\4\u01f0\1\uffff\12\u01f0\1"+
			"\uffff\1\u01ec\3\u01f0\1\uffff\2\u01f0\1\u01dd\1\u01f0\1\u01df\2\u01f0"+
			"\1\uffff\1\u01f0\1\uffff\6\u01f0\1\uffff\1\u01f0\1\uffff\5\u01f0\2\uffff"+
			"\14\u01f0\1\uffff\16\u01f0\1\uffff\22\u01f0\1\u01ed\2\u01f0\1\uffff\4"+
			"\u01f0\1\uffff\4\u01f0\1\uffff\1\u01f0\1\u01e8\2\u01f0\1\uffff\2\u01f0"+
			"\1\u01ee\1\uffff\12\u01f0\1\uffff\1\u01f0\2\uffff\1\u01f0\1\uffff\1\u01f0"+
			"\3\uffff\1\u01f3\2\uffff\1\u01de\2\uffff\1\u01e1\1\u01de\7\uffff\1\u01e4"+
			"\1\u01e2\1\u01de\1\u01e5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "65:1: groupingSetExpression : ( groupByExpression -> ^( TOK_GROUPING_SETS_EXPRESSION groupByExpression ) | LPAREN groupByExpression ( COMMA groupByExpression )* RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ( groupByExpression )+ ) | LPAREN RPAREN -> ^( TOK_GROUPING_SETS_EXPRESSION ) );";
		}
	}

	static final String DFA26_eotS =
		"\101\uffff";
	static final String DFA26_eofS =
		"\1\2\100\uffff";
	static final String DFA26_minS =
		"\1\4\100\uffff";
	static final String DFA26_maxS =
		"\1\u011d\100\uffff";
	static final String DFA26_acceptS =
		"\1\uffff\1\1\1\2\76\uffff";
	static final String DFA26_specialS =
		"\101\uffff}>";
	static final String[] DFA26_transitionS = {
			"\3\2\3\uffff\1\2\3\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff"+
			"\3\2\1\uffff\21\2\2\uffff\5\2\1\uffff\10\2\1\uffff\2\2\1\uffff\16\2\1"+
			"\uffff\10\2\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\25"+
			"\2\1\uffff\12\2\1\uffff\4\2\1\uffff\7\2\1\uffff\10\2\1\1\1\2\1\uffff"+
			"\5\2\2\uffff\61\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1"+
			"\uffff\6\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\1\uffff\1\2\2\uffff\2"+
			"\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "176:12: ( KW_OVER ws= window_specification )?";
		}
	}

	static final String DFA32_eotS =
		"\113\uffff";
	static final String DFA32_eofS =
		"\3\uffff\1\13\107\uffff";
	static final String DFA32_minS =
		"\1\7\2\uffff\1\4\107\uffff";
	static final String DFA32_maxS =
		"\1\u0121\2\uffff\1\u011f\107\uffff";
	static final String DFA32_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\3\76\uffff"+
		"\1\4";
	static final String DFA32_specialS =
		"\113\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\4\5\uffff\1\10\4\uffff\1\7\61\uffff\1\2\34\uffff\1\11\u0091\uffff"+
			"\1\11\41\uffff\1\1\10\uffff\1\5\1\3\1\uffff\1\6",
			"",
			"",
			"\3\13\3\uffff\1\13\3\uffff\2\13\1\uffff\1\13\2\uffff\2\13\1\uffff\2"+
			"\13\1\uffff\3\13\1\uffff\21\13\2\uffff\5\13\1\uffff\10\13\1\uffff\2\13"+
			"\1\uffff\16\13\1\uffff\10\13\1\uffff\4\13\1\uffff\7\13\1\uffff\5\13\1"+
			"\uffff\7\13\1\uffff\25\13\1\uffff\12\13\1\uffff\4\13\1\uffff\7\13\1\uffff"+
			"\10\13\1\uffff\1\13\1\uffff\5\13\2\uffff\61\13\1\uffff\11\13\1\uffff"+
			"\4\13\1\uffff\3\13\1\uffff\12\13\1\uffff\6\13\1\uffff\2\13\1\uffff\1"+
			"\13\1\uffff\3\13\1\uffff\1\13\2\uffff\2\13\2\uffff\1\13\1\uffff\1\112",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "221:1: constant : ( Number | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );";
		}
	}

	static final String DFA33_eotS =
		"\101\uffff";
	static final String DFA33_eofS =
		"\1\1\100\uffff";
	static final String DFA33_minS =
		"\1\4\100\uffff";
	static final String DFA33_maxS =
		"\1\u011f\100\uffff";
	static final String DFA33_acceptS =
		"\1\uffff\1\2\76\uffff\1\1";
	static final String DFA33_specialS =
		"\101\uffff}>";
	static final String[] DFA33_transitionS = {
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff"+
			"\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1"+
			"\uffff\10\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25"+
			"\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\61\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1"+
			"\uffff\6\1\1\uffff\2\1\1\uffff\1\1\1\uffff\3\1\1\uffff\1\1\2\uffff\2"+
			"\1\2\uffff\1\1\1\uffff\1\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 239:19: ( StringLiteral )+";
		}
	}

	static final String DFA34_eotS =
		"\u026f\uffff";
	static final String DFA34_eofS =
		"\1\uffff\1\26\1\130\7\uffff\2\3\1\uffff\1\130\1\uffff\4\130\u025c\uffff";
	static final String DFA34_minS =
		"\1\7\2\4\7\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\7\u025a\uffff";
	static final String DFA34_maxS =
		"\1\u0121\1\u011d\1\u011f\7\uffff\2\u011d\1\uffff\1\u011d\1\uffff\4\u011d"+
		"\1\uffff\1\u0121\u025a\uffff";
	static final String DFA34_acceptS =
		"\3\uffff\1\3\10\uffff\1\4\6\uffff\1\5\1\uffff\1\11\1\1\77\uffff\1\2\1"+
		"\uffff\1\10\u01fe\uffff\1\6\26\uffff\1\7";
	static final String DFA34_specialS =
		"\u026f\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\1\21\2\22\1\uffff\2\22\1\uffff\1"+
			"\22\1\15\14\22\1\24\1\23\5\22\1\uffff\6\22\1\uffff\1\22\1\uffff\2\22"+
			"\1\uffff\1\22\1\2\14\22\1\uffff\4\22\1\uffff\1\22\1\uffff\1\22\1\uffff"+
			"\4\22\1\uffff\1\22\1\13\5\22\1\uffff\3\22\1\uffff\1\22\1\uffff\4\22\1"+
			"\uffff\2\22\1\14\20\22\1\uffff\4\22\1\uffff\12\22\1\uffff\1\14\3\22\1"+
			"\uffff\2\22\1\uffff\1\22\1\1\2\22\1\uffff\1\22\1\uffff\6\22\1\uffff\1"+
			"\22\1\uffff\5\22\2\uffff\14\22\1\uffff\16\22\1\uffff\22\22\1\17\2\22"+
			"\1\uffff\4\22\1\uffff\4\22\1\uffff\1\22\1\12\2\22\1\uffff\2\22\1\20\1"+
			"\uffff\12\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\3\uffff\1\25\5\uffff"+
			"\1\3\10\uffff\2\3\1\uffff\1\3",
			"\3\26\3\uffff\1\26\3\uffff\2\26\1\uffff\1\26\2\uffff\2\26\1\uffff\2"+
			"\26\1\uffff\3\26\1\uffff\21\26\2\uffff\5\26\1\uffff\10\26\1\uffff\2\26"+
			"\1\uffff\16\26\1\uffff\10\26\1\uffff\4\26\1\uffff\7\26\1\uffff\5\26\1"+
			"\uffff\7\26\1\uffff\25\26\1\uffff\12\26\1\uffff\4\26\1\uffff\7\26\1\uffff"+
			"\10\26\1\uffff\1\26\1\uffff\5\26\2\uffff\61\26\1\uffff\11\26\1\uffff"+
			"\4\26\1\uffff\3\26\1\uffff\12\26\1\uffff\6\26\1\uffff\2\26\1\14\1\26"+
			"\1\uffff\3\26\1\uffff\1\26\2\uffff\2\26\2\uffff\1\26",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130\1\uffff\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
			"\3\3\1\uffff\21\3\2\uffff\5\3\1\uffff\10\3\1\uffff\2\3\1\uffff\16\3\1"+
			"\uffff\10\3\1\uffff\4\3\1\uffff\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\25"+
			"\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\10\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\61\3\1\uffff\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1"+
			"\uffff\6\3\1\uffff\2\3\1\14\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\2\3\2"+
			"\uffff\1\3",
			"\3\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff"+
			"\3\3\1\uffff\21\3\2\uffff\5\3\1\uffff\10\3\1\uffff\2\3\1\uffff\16\3\1"+
			"\uffff\10\3\1\uffff\4\3\1\uffff\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\25"+
			"\3\1\uffff\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\10\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\61\3\1\uffff\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1"+
			"\uffff\6\3\1\uffff\2\3\1\14\1\3\1\uffff\3\3\1\uffff\1\3\2\uffff\2\3\2"+
			"\uffff\1\3",
			"",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130",
			"",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130",
			"\3\130\3\uffff\1\130\3\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff"+
			"\2\130\1\uffff\3\130\1\uffff\21\130\2\uffff\5\130\1\uffff\10\130\1\uffff"+
			"\2\130\1\uffff\16\130\1\uffff\10\130\1\uffff\4\130\1\uffff\7\130\1\uffff"+
			"\5\130\1\uffff\7\130\1\uffff\25\130\1\uffff\12\130\1\uffff\4\130\1\uffff"+
			"\7\130\1\uffff\10\130\1\uffff\1\130\1\uffff\5\130\2\uffff\61\130\1\uffff"+
			"\11\130\1\uffff\4\130\1\uffff\3\130\1\uffff\12\130\1\uffff\6\130\1\uffff"+
			"\2\130\1\14\1\130\1\uffff\3\130\1\uffff\1\130\2\uffff\2\130\2\uffff\1"+
			"\130",
			"",
			"\1\u0257\5\uffff\1\u0257\4\uffff\1\u0257\7\uffff\3\u0257\1\uffff\2\u0257"+
			"\1\uffff\25\u0257\1\uffff\6\u0257\1\uffff\1\u0257\1\uffff\2\u0257\1\uffff"+
			"\16\u0257\1\uffff\4\u0257\1\uffff\1\u0257\1\uffff\1\u0257\1\uffff\4\u0257"+
			"\1\uffff\7\u0257\1\uffff\3\u0257\1\uffff\1\u0257\1\uffff\4\u0257\1\uffff"+
			"\23\u0257\1\uffff\4\u0257\1\uffff\12\u0257\1\uffff\4\u0257\1\uffff\7"+
			"\u0257\1\uffff\1\u0257\1\uffff\6\u0257\1\uffff\1\u0257\1\uffff\5\u0257"+
			"\2\uffff\14\u0257\1\uffff\16\u0257\1\uffff\25\u0257\1\uffff\4\u0257\1"+
			"\uffff\4\u0257\1\uffff\4\u0257\1\uffff\3\u0257\1\uffff\12\u0257\1\uffff"+
			"\1\u0257\1\u026e\1\uffff\1\u0257\1\uffff\1\u0257\3\uffff\1\u0257\2\uffff"+
			"\1\u0257\2\uffff\2\u0257\7\uffff\4\u0257",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "266:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !);";
		}
	}

	static final String DFA35_eotS =
		"\100\uffff";
	static final String DFA35_eofS =
		"\1\1\77\uffff";
	static final String DFA35_minS =
		"\1\4\77\uffff";
	static final String DFA35_maxS =
		"\1\u011d\77\uffff";
	static final String DFA35_acceptS =
		"\1\uffff\1\3\74\uffff\1\1\1\2";
	static final String DFA35_specialS =
		"\100\uffff}>";
	static final String[] DFA35_transitionS = {
			"\3\1\3\uffff\1\1\3\uffff\2\1\1\uffff\1\77\2\uffff\2\1\1\uffff\2\1\1\uffff"+
			"\3\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1"+
			"\uffff\10\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25"+
			"\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\61\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1"+
			"\uffff\6\1\1\uffff\2\1\1\uffff\1\76\1\uffff\3\1\1\uffff\1\1\2\uffff\2"+
			"\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 282:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*";
		}
	}

	static final String DFA38_eotS =
		"\123\uffff";
	static final String DFA38_eofS =
		"\2\2\121\uffff";
	static final String DFA38_minS =
		"\1\4\1\12\121\uffff";
	static final String DFA38_maxS =
		"\1\u011d\1\u0119\121\uffff";
	static final String DFA38_acceptS =
		"\2\uffff\1\2\73\uffff\1\1\24\uffff";
	static final String DFA38_specialS =
		"\123\uffff}>";
	static final String[] DFA38_transitionS = {
			"\3\2\3\uffff\1\2\3\uffff\2\2\4\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff"+
			"\21\2\2\uffff\5\2\1\uffff\10\2\1\uffff\2\2\1\uffff\16\2\1\uffff\10\2"+
			"\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\16\2\1\1\6\2"+
			"\1\uffff\12\2\1\uffff\4\2\1\uffff\7\2\1\uffff\10\2\1\uffff\1\2\1\uffff"+
			"\5\2\2\uffff\61\2\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1"+
			"\uffff\6\2\1\uffff\2\2\3\uffff\3\2\1\uffff\1\2\2\uffff\2\2\2\uffff\1"+
			"\2",
			"\1\2\47\uffff\1\2\37\uffff\1\2\30\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\15\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\6\uffff\1\76\1\uffff"+
			"\1\76\6\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2"+
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
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "302:39: (a= KW_IS nullCondition )?";
		}
	}

	static final String DFA39_eotS =
		"\75\uffff";
	static final String DFA39_eofS =
		"\1\1\74\uffff";
	static final String DFA39_minS =
		"\1\4\74\uffff";
	static final String DFA39_maxS =
		"\1\u011d\74\uffff";
	static final String DFA39_acceptS =
		"\1\uffff\1\2\72\uffff\1\1";
	static final String DFA39_specialS =
		"\75\uffff}>";
	static final String[] DFA39_transitionS = {
			"\2\1\1\74\3\uffff\1\1\3\uffff\2\1\4\uffff\2\1\1\uffff\2\1\1\uffff\3\1"+
			"\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1\uffff"+
			"\10\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1"+
			"\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\61\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1"+
			"\uffff\6\1\1\uffff\2\1\3\uffff\3\1\1\uffff\1\1\2\uffff\2\1\2\uffff\1"+
			"\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
	static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
	static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
	static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
	static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
	static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
	static final short[][] DFA39_transition;

	static {
		int numStates = DFA39_transitionS.length;
		DFA39_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
		}
	}

	protected class DFA39 extends DFA {

		public DFA39(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 39;
			this.eot = DFA39_eot;
			this.eof = DFA39_eof;
			this.min = DFA39_min;
			this.max = DFA39_max;
			this.accept = DFA39_accept;
			this.special = DFA39_special;
			this.transition = DFA39_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 315:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*";
		}
	}

	static final String DFA40_eotS =
		"\74\uffff";
	static final String DFA40_eofS =
		"\1\1\73\uffff";
	static final String DFA40_minS =
		"\1\4\73\uffff";
	static final String DFA40_maxS =
		"\1\u011d\73\uffff";
	static final String DFA40_acceptS =
		"\1\uffff\1\2\71\uffff\1\1";
	static final String DFA40_specialS =
		"\74\uffff}>";
	static final String[] DFA40_transitionS = {
			"\2\1\4\uffff\1\1\3\uffff\2\73\4\uffff\2\1\1\uffff\2\1\1\uffff\3\1\1\uffff"+
			"\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1\uffff\10\1"+
			"\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\25\1\1\uffff"+
			"\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2"+
			"\uffff\61\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\6\1\1\uffff\2\1\3\uffff\1\1\1\73\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff"+
			"\1\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 326:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*";
		}
	}

	static final String DFA45_eotS =
		"\u037d\uffff";
	static final String DFA45_eofS =
		"\1\1\53\uffff\1\1\1\uffff\1\1\7\uffff\1\1\4\uffff\1\57\1\uffff\1\57\1"+
		"\uffff\4\57\1\uffff\2\57\1\uffff\1\57\u0335\uffff";
	static final String DFA45_minS =
		"\1\12\53\uffff\1\7\1\46\1\12\7\uffff\1\7\4\uffff\1\4\1\uffff\1\4\1\uffff"+
		"\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\7\60\uffff\1\4\1\uffff\1\4\1\uffff"+
		"\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\7\u02f4\uffff";
	static final String DFA45_maxS =
		"\1\u011a\53\uffff\1\u0121\1\u00ca\1\u0119\7\uffff\1\u0121\4\uffff\1\u011d"+
		"\1\uffff\1\u011d\1\uffff\4\u011d\1\uffff\2\u011d\1\uffff\1\u011d\1\uffff"+
		"\1\u0121\60\uffff\1\u011d\1\uffff\1\u011d\1\uffff\4\u011d\1\uffff\2\u011d"+
		"\1\uffff\1\u011d\1\uffff\1\u0121\u02f4\uffff";
	static final String DFA45_acceptS =
		"\1\uffff\1\7\55\uffff\1\2\60\uffff\1\3\1\5\1\1\23\uffff\1\4\23\uffff\1"+
		"\6\24\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1"+
		"\2\100\uffff\1\2\u00c2\uffff\2\2\126\uffff\1\2\173\uffff\1\6\1\uffff";
	static final String DFA45_specialS =
		"\u037d\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\1\11\uffff\2\57\1\uffff\2\57\1\uffff\3\1\1\uffff\10\1\1\66\10\1\2"+
			"\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1\uffff\10\1\1\uffff"+
			"\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\2\1\1\56\22\1\1\uffff"+
			"\1\54\11\1\1\uffff\4\1\1\uffff\2\1\1\55\4\1\1\uffff\10\1\1\uffff\1\1"+
			"\1\uffff\5\1\2\uffff\15\1\1\54\6\1\1\54\34\1\1\uffff\11\1\1\uffff\4\1"+
			"\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff\2\57\5\uffff\1\57\4\uffff"+
			"\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57\2\uffff\1\1\2\uffff\1\57\4\uffff\1\57\7\uffff\3\57\1\uffff\2\57"+
			"\1\uffff\21\57\1\100\3\57\1\uffff\6\57\1\uffff\1\57\1\uffff\2\57\1\uffff"+
			"\16\57\1\uffff\1\101\3\57\1\uffff\1\57\1\uffff\1\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\3\57\1\1\1\57\1\uffff\2\57\1\75\1\57\1\1\15\57\1\107\5"+
			"\57\1\uffff\2\57\1\73\1\57\1\uffff\1\57\1\104\10\57\1\uffff\1\111\3\57"+
			"\1\uffff\2\57\1\uffff\4\57\1\uffff\1\57\1\uffff\1\57\1\77\4\57\1\uffff"+
			"\1\57\1\uffff\5\57\2\uffff\14\57\1\1\16\57\1\1\13\57\1\102\11\57\1\uffff"+
			"\4\57\1\uffff\4\57\1\uffff\4\57\1\uffff\1\57\1\105\1\57\1\uffff\12\57"+
			"\1\uffff\1\57\1\uffff\1\1\1\57\1\1\1\57\3\uffff\1\57\2\uffff\1\57\2\uffff"+
			"\2\57\2\uffff\1\1\4\uffff\4\57",
			"\1\141\121\uffff\1\140\23\uffff\1\142\66\uffff\1\142\6\uffff\1\142",
			"\1\1\47\uffff\1\1\37\uffff\1\1\30\uffff\1\1\4\uffff\1\1\1\uffff\1\1"+
			"\15\uffff\1\1\10\uffff\1\1\3\uffff\1\1\11\uffff\1\1\17\uffff\1\1\32\uffff"+
			"\1\1\16\uffff\1\1\13\uffff\1\1\32\uffff\1\1\17\uffff\1\1\1\uffff\1\1"+
			"\4\uffff\1\166\11\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u008a\2\uffff\1\1\2\uffff\1\u008a\4\uffff\1\u008a\7\uffff\3\u008a"+
			"\1\uffff\2\u008a\1\uffff\21\u008a\1\177\3\u008a\1\uffff\6\u008a\1\uffff"+
			"\1\u008a\1\uffff\2\u008a\1\uffff\16\u008a\1\uffff\1\u0080\3\u008a\1\uffff"+
			"\1\u008a\1\uffff\1\u008a\1\uffff\4\u008a\1\uffff\7\u008a\1\uffff\3\u008a"+
			"\1\1\1\u008a\1\uffff\2\u008a\1\174\1\u008a\1\1\15\u008a\1\u0086\5\u008a"+
			"\1\uffff\2\u008a\1\172\1\u008a\1\uffff\1\u008a\1\u0083\10\u008a\1\uffff"+
			"\1\u0088\3\u008a\1\uffff\2\u008a\1\uffff\4\u008a\1\uffff\1\u008a\1\uffff"+
			"\1\u008a\1\176\4\u008a\1\uffff\1\u008a\1\uffff\5\u008a\2\uffff\14\u008a"+
			"\1\1\16\u008a\1\1\13\u008a\1\u0081\11\u008a\1\uffff\4\u008a\1\uffff\4"+
			"\u008a\1\uffff\4\u008a\1\uffff\1\u008a\1\u0084\1\u008a\1\uffff\12\u008a"+
			"\1\uffff\1\u008a\1\uffff\1\1\1\u008a\1\1\1\u008a\3\uffff\1\u008a\2\uffff"+
			"\1\u008a\2\uffff\2\u008a\2\uffff\1\1\4\uffff\4\u008a",
			"",
			"",
			"",
			"",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\21\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57"+
			"\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1"+
			"\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff"+
			"\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff"+
			"\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\1\u009f\5\57\1\uffff\4\57\1"+
			"\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\17\57\1\u00e0\1\57\2\uffff\5\57\1\uffff\10\57"+
			"\1\uffff\2\57\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1"+
			"\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11"+
			"\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\17\57\1\u0121\1\57\2\uffff\5\57\1\uffff\10\57"+
			"\1\uffff\2\57\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1"+
			"\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11"+
			"\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\17\57\1\u0162\1\57\2\uffff\5\57\1\uffff\10\57"+
			"\1\uffff\2\57\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1"+
			"\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11"+
			"\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\17\57\1\u01a3\1\57\2\uffff\5\57\1\uffff\10\57"+
			"\1\uffff\2\57\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1"+
			"\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11"+
			"\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\17\57\1\u01e4\1\57\2\uffff\5\57\1\uffff\10\57"+
			"\1\uffff\2\57\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1"+
			"\uffff\5\57\1\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11"+
			"\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\21\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57"+
			"\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1"+
			"\uffff\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff"+
			"\10\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff"+
			"\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1\uffff\3"+
			"\57\1\1\1\57\2\uffff\2\57\2\uffff\1\57",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\1\21\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1"+
			"\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff"+
			"\7\57\1\uffff\25\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\1\uffff\3\57\1"+
			"\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"",
			"\3\57\3\uffff\1\57\3\uffff\2\57\1\uffff\1\57\2\uffff\2\57\1\uffff\2"+
			"\57\1\uffff\3\57\1\uffff\21\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57"+
			"\1\uffff\16\57\1\uffff\10\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1"+
			"\uffff\7\57\1\uffff\15\57\1\u02a8\7\57\1\uffff\12\57\1\uffff\4\57\1\uffff"+
			"\7\57\1\uffff\10\57\1\uffff\1\u02a7\1\uffff\5\57\2\uffff\61\57\1\uffff"+
			"\11\57\1\uffff\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4"+
			"\57\1\uffff\3\57\1\uffff\1\57\2\uffff\2\57\2\uffff\1\57",
			"",
			"\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\3\1\1\uffff\2\1\1\uffff\25\1\1"+
			"\uffff\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1"+
			"\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff"+
			"\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\5\1\2\uffff\14\1\1\uffff\16"+
			"\1\1\uffff\25\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
			"\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u02ff\2\uffff\1\1"+
			"\2\uffff\2\1\6\uffff\5\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\143\uffff"+
			"\1\u008a\u0081\uffff\1\1\10\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\14\uffff\1"+
			"\1\126\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\14\uffff\1"+
			"\1\126\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\14\uffff\1"+
			"\1\126\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\14\uffff\1"+
			"\1\126\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\14\uffff\1"+
			"\1\126\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\143\uffff"+
			"\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\1\uffff\1\1\1\u008a\6\uffff"+
			"\1\u008a",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\13\uffff\1\1\2\uffff\1\u008a"+
			"\143\uffff\1\u008a\u008a\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1\u008a"+
			"\6\uffff\1\u008a",
			"",
			"\3\u008a\7\uffff\2\u008a\1\uffff\1\u008a\16\uffff\1\u008a\142\uffff"+
			"\1\1\1\u008a\50\uffff\1\1\141\uffff\2\u008a\1\uffff\2\u008a\2\uffff\1"+
			"\u008a\6\uffff\1\u008a",
			"",
			"\1\1\5\uffff\1\1\4\uffff\1\1\7\uffff\3\1\1\uffff\2\1\1\uffff\25\1\1"+
			"\uffff\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\4\1\1\uffff\1"+
			"\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\3\1\1\uffff\1\1\1\uffff"+
			"\4\1\1\uffff\23\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff\5\1\2\uffff\14\1\1\uffff\16"+
			"\1\1\uffff\25\1\1\uffff\4\1\1\uffff\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff"+
			"\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\u037b\2\uffff\1\1"+
			"\2\uffff\2\1\6\uffff\5\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	protected class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 377:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*";
		}
	}

	public static final BitSet FOLLOW_KW_GROUP_in_groupByClause72 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_groupByClause74 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupByExpression_in_groupByClause80 = new BitSet(new long[]{0x0000000000000402L,0x0002000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_groupByClause88 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupByExpression_in_groupByClause90 = new BitSet(new long[]{0x0000000000000402L,0x0002000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_KW_WITH_in_groupByClause103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_ROLLUP_in_groupByClause105 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_groupByClause113 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_KW_CUBE_in_groupByClause115 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_KW_GROUPING_in_groupByClause128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_KW_SETS_in_groupByClause130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_groupByClause137 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause139 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_groupByClause143 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause145 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupByClause150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression265 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression271 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_groupingSetExpression274 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression276 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_groupByExpression350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_HAVING_in_havingClause381 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_havingCondition_in_havingClause383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_havingCondition422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ORDER_in_orderByClause454 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_orderByClause456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_orderByClause462 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause464 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_orderByClause472 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause474 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_orderByClause478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ORDER_in_orderByClause499 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_orderByClause501 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause507 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_orderByClause515 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause517 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause559 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_clusterByClause561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_clusterByClause567 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_clusterByClause569 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_clusterByClause572 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_clusterByClause574 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_clusterByClause578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause599 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_clusterByClause601 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_clusterByClause607 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_clusterByClause619 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_clusterByClause621 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause665 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_partitionByClause667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionByClause673 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_partitionByClause675 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionByClause678 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_partitionByClause680 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionByClause684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause705 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_partitionByClause707 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_partitionByClause713 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_partitionByClause721 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_partitionByClause723 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause765 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_distributeByClause767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_distributeByClause773 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_distributeByClause775 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_distributeByClause778 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_distributeByClause780 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_distributeByClause784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause805 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_distributeByClause807 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_distributeByClause813 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_distributeByClause821 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_distributeByClause823 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_SORT_in_sortByClause865 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_sortByClause867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_sortByClause873 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause875 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_sortByClause883 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause885 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_sortByClause889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SORT_in_sortByClause910 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_KW_BY_in_sortByClause912 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause918 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_sortByClause931 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause933 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_functionName_in_function976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_function982 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABFFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003E2648A5FL});
	public static final BitSet FOLLOW_STAR_in_function1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_KW_DISTINCT_in_function1019 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003E2648A5FL});
	public static final BitSet FOLLOW_selectExpression_in_function1024 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_function1027 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003E0648A5FL});
	public static final BitSet FOLLOW_selectExpression_in_function1029 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_function1047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_OVER_in_function1050 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_window_specification_in_function1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_IF_in_functionName1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ARRAY_in_functionName1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_functionName1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_STRUCT_in_functionName1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNIONTYPE_in_functionName1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionName1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CAST_in_castExpression1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression1243 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_castExpression1255 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_KW_AS_in_castExpression1267 = new BitSet(new long[]{0x0000038000000000L,0x00000040000800B0L,0x0000000000000002L,0x0000600810000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CASE_in_caseExpression1326 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_caseExpression1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_WHEN_in_caseExpression1335 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_caseExpression1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_THEN_in_caseExpression1339 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_caseExpression1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_ELSE_in_caseExpression1350 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_caseExpression1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_END_in_caseExpression1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CASE_in_whenExpression1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_WHEN_in_whenExpression1411 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_whenExpression1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_THEN_in_whenExpression1415 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_whenExpression1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_ELSE_in_whenExpression1426 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_whenExpression1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_END_in_whenExpression1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_constant1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_constant1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_constant1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringLiteralSequence_in_constant1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BigintLiteral_in_constant1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SmallintLiteral_in_constant1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TinyintLiteral_in_constant1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DecimalLiteral_in_constant1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_charSetStringLiteral_in_constant1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanValue_in_constant1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral1618 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DATE_in_dateLiteral1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_StringLiteral_in_dateLiteral1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceOrExpression_in_expression1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NULL_in_atomExpression1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_atomExpression1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_atomExpression1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_atomExpression1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_atomExpression1753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseExpression_in_atomExpression1761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenExpression_in_atomExpression1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableOrColumn_in_atomExpression1777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atomExpression1785 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_atomExpression1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomExpression1790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression1813 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression1817 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_precedenceFieldExpression1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression1822 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression1829 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFCFAFD7B73FF7BFL,0xFBBDEF7FFFFDFFFBL,0x0000000000000A5FL});
	public static final BitSet FOLLOW_identifier_in_precedenceFieldExpression1832 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_NULL_in_nullCondition1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_nullCondition1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_KW_NULL_in_nullCondition1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1929 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000140000000L});
	public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2027 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2030 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2033 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2090 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020080000L});
	public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression2093 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2096 = new BitSet(new long[]{0x000000000000C002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020080000L});
	public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression2148 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2196 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2199 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2202 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2247 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2250 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2253 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_precedenceEqualOperator2311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_NS_in_precedenceEqualOperator2315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTEQUAL_in_precedenceEqualOperator2319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSTHAN_in_precedenceEqualOperator2327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHAN_in_precedenceEqualOperator2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2359 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000408L});
	public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2383 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2387 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2420 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2424 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2453 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2457 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2493 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2524 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2526 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2531 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2534 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2539 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2579 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2584 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2587 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7B7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2592 = new BitSet(new long[]{0x0000004001B00002L,0x0100000000000000L,0x0000000040001000L,0x0000000000000408L,0x0000000000106000L});
	public static final BitSet FOLLOW_LPAREN_in_expressions2650 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_expressions2652 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_expressions2655 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_expression_in_expressions2657 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_expressions2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression2709 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator2736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2757 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression2760 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2763 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator2787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression2811 = new BitSet(new long[]{0x5FBFFFFEDC042080L,0xFFFBD77F7ABDFFFBL,0xFFCFAFD7F7BFF7BFL,0xFBBDEF7FFFFDFFFBL,0x00000003C0648A5FL});
	public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_TRUE_in_booleanValue2838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FALSE_in_booleanValue2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableOrPartition2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_tableOrPartition2865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionSpec2904 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFCFAFD7B73FF7BFL,0xFBBDEF7FFFFDFFFBL,0x0000000000000A5FL});
	public static final BitSet FOLLOW_partitionVal_in_partitionSpec2906 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionSpec2909 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFCFAFD7B73FF7BFL,0xFBBDEF7FFFFDFFFBL,0x0000000000000A5FL});
	public static final BitSet FOLLOW_partitionVal_in_partitionSpec2912 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionSpec2917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_partitionVal2948 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_EQUAL_in_partitionVal2951 = new BitSet(new long[]{0x0000000000042080L,0x0000000200000010L,0x0000000000000000L,0x0008000000000000L,0x00000002C0200000L});
	public static final BitSet FOLLOW_constant_in_partitionVal2953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_dropPartitionSpec2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_dropPartitionSpec2994 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFCFAFD7B73FF7BFL,0xFBBDEF7FFFFDFFFBL,0x0000000000000A5FL});
	public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec2996 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_dropPartitionSpec2999 = new BitSet(new long[]{0x5FBE7FFEDC000000L,0xFFDBD77F7ABDFFFBL,0xFFCFAFD7B73FF7BFL,0xFBBDEF7FFFFDFFFBL,0x0000000000000A5FL});
	public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3002 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_dropPartitionSpec3007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_dropPartitionVal3038 = new BitSet(new long[]{0x0000000001900000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000106000L});
	public static final BitSet FOLLOW_dropPartitionOperator_in_dropPartitionVal3040 = new BitSet(new long[]{0x0000000000042080L,0x0000000200000010L,0x0000000000000000L,0x0008000000000000L,0x00000002C0200000L});
	public static final BitSet FOLLOW_constant_in_dropPartitionVal3042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sysFuncNames_in_descFuncNames3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_descFuncNames3469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_descFuncNames3477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifier3498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonReserved_in_identifier3506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred1_IdentifiersParser616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred2_IdentifiersParser717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred3_IdentifiersParser817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred4_IdentifiersParser927 = new BitSet(new long[]{0x0000000000000002L});
}
