// $ANTLR 3.5.2 FromClauseParser.g 2014-11-15 16:34:32

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
public class HiveParser_FromClauseParser extends Parser {
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
	public static final int INT_0=33;
	public static final int INT_00=34;
	public static final int INT_01=35;
	public static final int INT_02=36;
	public static final int INT_03=37;
	public static final int INT_04=38;
	public static final int INT_05=39;
	public static final int INT_06=40;
	public static final int INT_07=41;
	public static final int INT_08=42;
	public static final int INT_09=43;
	public static final int INT_1=44;
	public static final int INT_10=45;
	public static final int INT_11=46;
	public static final int INT_12=47;
	public static final int INT_13=48;
	public static final int INT_14=49;
	public static final int INT_15=50;
	public static final int INT_16=51;
	public static final int INT_17=52;
	public static final int INT_18=53;
	public static final int INT_19=54;
	public static final int INT_2=55;
	public static final int INT_20=56;
	public static final int INT_21=57;
	public static final int INT_22=58;
	public static final int INT_23=59;
	public static final int INT_24=60;
	public static final int INT_25=61;
	public static final int INT_26=62;
	public static final int INT_27=63;
	public static final int INT_28=64;
	public static final int INT_29=65;
	public static final int INT_3=66;
	public static final int INT_30=67;
	public static final int INT_31=68;
	public static final int INT_32=69;
	public static final int INT_33=70;
	public static final int INT_34=71;
	public static final int INT_35=72;
	public static final int INT_36=73;
	public static final int INT_37=74;
	public static final int INT_38=75;
	public static final int INT_39=76;
	public static final int INT_4=77;
	public static final int INT_40=78;
	public static final int INT_41=79;
	public static final int INT_42=80;
	public static final int INT_43=81;
	public static final int INT_44=82;
	public static final int INT_45=83;
	public static final int INT_46=84;
	public static final int INT_47=85;
	public static final int INT_48=86;
	public static final int INT_49=87;
	public static final int INT_5=88;
	public static final int INT_50=89;
	public static final int INT_51=90;
	public static final int INT_52=91;
	public static final int INT_53=92;
	public static final int INT_54=93;
	public static final int INT_55=94;
	public static final int INT_56=95;
	public static final int INT_57=96;
	public static final int INT_58=97;
	public static final int INT_59=98;
	public static final int INT_6=99;
	public static final int INT_60=100;
	public static final int INT_61=101;
	public static final int INT_62=102;
	public static final int INT_63=103;
	public static final int INT_64=104;
	public static final int INT_65=105;
	public static final int INT_66=106;
	public static final int INT_67=107;
	public static final int INT_68=108;
	public static final int INT_69=109;
	public static final int INT_7=110;
	public static final int INT_70=111;
	public static final int INT_71=112;
	public static final int INT_72=113;
	public static final int INT_73=114;
	public static final int INT_74=115;
	public static final int INT_75=116;
	public static final int INT_76=117;
	public static final int INT_77=118;
	public static final int INT_78=119;
	public static final int INT_79=120;
	public static final int INT_8=121;
	public static final int INT_80=122;
	public static final int INT_81=123;
	public static final int INT_82=124;
	public static final int INT_83=125;
	public static final int INT_84=126;
	public static final int INT_85=127;
	public static final int INT_86=128;
	public static final int INT_87=129;
	public static final int INT_88=130;
	public static final int INT_89=131;
	public static final int INT_9=132;
	public static final int INT_90=133;
	public static final int INT_91=134;
	public static final int INT_92=135;
	public static final int INT_93=136;
	public static final int INT_94=137;
	public static final int INT_95=138;
	public static final int INT_96=139;
	public static final int INT_97=140;
	public static final int INT_98=141;
	public static final int INT_99=142;
	public static final int Identifier=143;
	public static final int JANUARY=144;
	public static final int JULY=145;
	public static final int JUNE=146;
	public static final int KW_ADD=147;
	public static final int KW_AFTER=148;
	public static final int KW_ALL=149;
	public static final int KW_ALTER=150;
	public static final int KW_ANALYZE=151;
	public static final int KW_AND=152;
	public static final int KW_ARCHIVE=153;
	public static final int KW_ARRAY=154;
	public static final int KW_AS=155;
	public static final int KW_ASC=156;
	public static final int KW_BEFORE=157;
	public static final int KW_BETWEEN=158;
	public static final int KW_BIGINT=159;
	public static final int KW_BINARY=160;
	public static final int KW_BOOLEAN=161;
	public static final int KW_BOTH=162;
	public static final int KW_BUCKET=163;
	public static final int KW_BUCKETS=164;
	public static final int KW_BY=165;
	public static final int KW_CASCADE=166;
	public static final int KW_CASE=167;
	public static final int KW_CAST=168;
	public static final int KW_CHANGE=169;
	public static final int KW_CLUSTER=170;
	public static final int KW_CLUSTERED=171;
	public static final int KW_CLUSTERSTATUS=172;
	public static final int KW_COLLECTION=173;
	public static final int KW_COLUMN=174;
	public static final int KW_COLUMNS=175;
	public static final int KW_COMMENT=176;
	public static final int KW_COMPUTE=177;
	public static final int KW_CONCATENATE=178;
	public static final int KW_CONTINUE=179;
	public static final int KW_CREATE=180;
	public static final int KW_CROSS=181;
	public static final int KW_CUBE=182;
	public static final int KW_CURRENT=183;
	public static final int KW_CURSOR=184;
	public static final int KW_DATA=185;
	public static final int KW_DATABASE=186;
	public static final int KW_DATABASES=187;
	public static final int KW_DATE=188;
	public static final int KW_DATETIME=189;
	public static final int KW_DBPROPERTIES=190;
	public static final int KW_DECIMAL=191;
	public static final int KW_DEFERRED=192;
	public static final int KW_DELETE=193;
	public static final int KW_DELIMITED=194;
	public static final int KW_DEPENDENCY=195;
	public static final int KW_DESC=196;
	public static final int KW_DESCRIBE=197;
	public static final int KW_DIRECTORIES=198;
	public static final int KW_DIRECTORY=199;
	public static final int KW_DISABLE=200;
	public static final int KW_DISTINCT=201;
	public static final int KW_DISTRIBUTE=202;
	public static final int KW_DOUBLE=203;
	public static final int KW_DROP=204;
	public static final int KW_DURING=205;
	public static final int KW_EACH=206;
	public static final int KW_ELEM_TYPE=207;
	public static final int KW_ELSE=208;
	public static final int KW_ENABLE=209;
	public static final int KW_END=210;
	public static final int KW_ESCAPED=211;
	public static final int KW_EXCHANGE=212;
	public static final int KW_EXCLUSIVE=213;
	public static final int KW_EXISTS=214;
	public static final int KW_EXPLAIN=215;
	public static final int KW_EXPORT=216;
	public static final int KW_EXTENDED=217;
	public static final int KW_EXTERNAL=218;
	public static final int KW_FALSE=219;
	public static final int KW_FETCH=220;
	public static final int KW_FIELDS=221;
	public static final int KW_FILEFORMAT=222;
	public static final int KW_FIRST=223;
	public static final int KW_FLOAT=224;
	public static final int KW_FOLLOWING=225;
	public static final int KW_FOR=226;
	public static final int KW_FORMAT=227;
	public static final int KW_FORMATTED=228;
	public static final int KW_FROM=229;
	public static final int KW_FULL=230;
	public static final int KW_FUNCTION=231;
	public static final int KW_FUNCTIONS=232;
	public static final int KW_GRANT=233;
	public static final int KW_GROUP=234;
	public static final int KW_GROUPING=235;
	public static final int KW_HAVING=236;
	public static final int KW_HOLD_DDLTIME=237;
	public static final int KW_IDXPROPERTIES=238;
	public static final int KW_IF=239;
	public static final int KW_IGNORE=240;
	public static final int KW_IMPORT=241;
	public static final int KW_IN=242;
	public static final int KW_INCRE=243;
	public static final int KW_INCREFREQUENCY=244;
	public static final int KW_INDEX=245;
	public static final int KW_INDEXES=246;
	public static final int KW_INNER=247;
	public static final int KW_INPATH=248;
	public static final int KW_INPUTDRIVER=249;
	public static final int KW_INPUTFORMAT=250;
	public static final int KW_INSERT=251;
	public static final int KW_INT=252;
	public static final int KW_INTERSECT=253;
	public static final int KW_INTO=254;
	public static final int KW_IS=255;
	public static final int KW_ITEMS=256;
	public static final int KW_JOIN=257;
	public static final int KW_KEYS=258;
	public static final int KW_KEY_TYPE=259;
	public static final int KW_LATERAL=260;
	public static final int KW_LEFT=261;
	public static final int KW_LESS=262;
	public static final int KW_LIKE=263;
	public static final int KW_LIMIT=264;
	public static final int KW_LINES=265;
	public static final int KW_LOAD=266;
	public static final int KW_LOCAL=267;
	public static final int KW_LOCATION=268;
	public static final int KW_LOCK=269;
	public static final int KW_LOCKS=270;
	public static final int KW_LOGICAL=271;
	public static final int KW_LONG=272;
	public static final int KW_MACRO=273;
	public static final int KW_MAP=274;
	public static final int KW_MAPJOIN=275;
	public static final int KW_MATERIALIZED=276;
	public static final int KW_MINUS=277;
	public static final int KW_MORE=278;
	public static final int KW_MSCK=279;
	public static final int KW_NOSCAN=280;
	public static final int KW_NOT=281;
	public static final int KW_NO_DROP=282;
	public static final int KW_NULL=283;
	public static final int KW_OF=284;
	public static final int KW_OFFLINE=285;
	public static final int KW_ON=286;
	public static final int KW_OPTION=287;
	public static final int KW_OR=288;
	public static final int KW_ORCFILE=289;
	public static final int KW_ORDER=290;
	public static final int KW_OUT=291;
	public static final int KW_OUTER=292;
	public static final int KW_OUTPUTDRIVER=293;
	public static final int KW_OUTPUTFORMAT=294;
	public static final int KW_OVER=295;
	public static final int KW_OVERWRITE=296;
	public static final int KW_PARTIALSCAN=297;
	public static final int KW_PARTITION=298;
	public static final int KW_PARTITIONED=299;
	public static final int KW_PARTITIONS=300;
	public static final int KW_PERCENT=301;
	public static final int KW_PLUS=302;
	public static final int KW_PRECEDING=303;
	public static final int KW_PRESERVE=304;
	public static final int KW_PRETTY=305;
	public static final int KW_PROCEDURE=306;
	public static final int KW_PROTECTION=307;
	public static final int KW_PURGE=308;
	public static final int KW_RANGE=309;
	public static final int KW_RCFILE=310;
	public static final int KW_READ=311;
	public static final int KW_READONLY=312;
	public static final int KW_READS=313;
	public static final int KW_REBUILD=314;
	public static final int KW_RECORDREADER=315;
	public static final int KW_RECORDWRITER=316;
	public static final int KW_REDUCE=317;
	public static final int KW_REGEXP=318;
	public static final int KW_RENAME=319;
	public static final int KW_REPAIR=320;
	public static final int KW_REPLACE=321;
	public static final int KW_RESTRICT=322;
	public static final int KW_REVOKE=323;
	public static final int KW_RIGHT=324;
	public static final int KW_RLIKE=325;
	public static final int KW_ROLE=326;
	public static final int KW_ROLLUP=327;
	public static final int KW_ROW=328;
	public static final int KW_ROWS=329;
	public static final int KW_SCHEMA=330;
	public static final int KW_SCHEMAS=331;
	public static final int KW_SELECT=332;
	public static final int KW_SEMI=333;
	public static final int KW_SEQUENCEFILE=334;
	public static final int KW_SERDE=335;
	public static final int KW_SERDEPROPERTIES=336;
	public static final int KW_SET=337;
	public static final int KW_SETS=338;
	public static final int KW_SHARED=339;
	public static final int KW_SHOW=340;
	public static final int KW_SHOW_DATABASE=341;
	public static final int KW_SKEWED=342;
	public static final int KW_SMALLINT=343;
	public static final int KW_SORT=344;
	public static final int KW_SORTED=345;
	public static final int KW_SSL=346;
	public static final int KW_STATISTICS=347;
	public static final int KW_STORED=348;
	public static final int KW_STREAMTABLE=349;
	public static final int KW_STRING=350;
	public static final int KW_STRUCT=351;
	public static final int KW_TABLE=352;
	public static final int KW_TABLES=353;
	public static final int KW_TABLESAMPLE=354;
	public static final int KW_TBLPROPERTIES=355;
	public static final int KW_TEMPORARY=356;
	public static final int KW_TERMINATED=357;
	public static final int KW_TEXTFILE=358;
	public static final int KW_THEN=359;
	public static final int KW_TIMESTAMP=360;
	public static final int KW_TINYINT=361;
	public static final int KW_TO=362;
	public static final int KW_TOUCH=363;
	public static final int KW_TRANSFORM=364;
	public static final int KW_TRIGGER=365;
	public static final int KW_TRUE=366;
	public static final int KW_TRUNCATE=367;
	public static final int KW_UNARCHIVE=368;
	public static final int KW_UNBOUNDED=369;
	public static final int KW_UNDO=370;
	public static final int KW_UNION=371;
	public static final int KW_UNIONTYPE=372;
	public static final int KW_UNIQUEJOIN=373;
	public static final int KW_UNLOCK=374;
	public static final int KW_UNSET=375;
	public static final int KW_UNSIGNED=376;
	public static final int KW_UPDATE=377;
	public static final int KW_USE=378;
	public static final int KW_USER=379;
	public static final int KW_USING=380;
	public static final int KW_UTC=381;
	public static final int KW_UTCTIMESTAMP=382;
	public static final int KW_VALUE_TYPE=383;
	public static final int KW_VARCHAR=384;
	public static final int KW_VIEW=385;
	public static final int KW_WHEN=386;
	public static final int KW_WHERE=387;
	public static final int KW_WHILE=388;
	public static final int KW_WINDOW=389;
	public static final int KW_WITH=390;
	public static final int LCURLY=391;
	public static final int LESSTHAN=392;
	public static final int LESSTHANOREQUALTO=393;
	public static final int LPAREN=394;
	public static final int LSQUARE=395;
	public static final int Letter=396;
	public static final int MARCH=397;
	public static final int MAY=398;
	public static final int MINUS=399;
	public static final int MINUTE=400;
	public static final int MOD=401;
	public static final int MONDAY=402;
	public static final int MONTH=403;
	public static final int NOTEQUAL=404;
	public static final int NOVEMBER=405;
	public static final int Number=406;
	public static final int OCTOBER=407;
	public static final int PLUS=408;
	public static final int QUESTION=409;
	public static final int RCURLY=410;
	public static final int RPAREN=411;
	public static final int RSQUARE=412;
	public static final int RegexComponent=413;
	public static final int SATURDAY=414;
	public static final int SEMICOLON=415;
	public static final int SEPTEMBER=416;
	public static final int STAR=417;
	public static final int SUNDAY=418;
	public static final int SmallintLiteral=419;
	public static final int StringLiteral=420;
	public static final int THURSDAY=421;
	public static final int TILDE=422;
	public static final int TODAY=423;
	public static final int TOMORROW=424;
	public static final int TONIGHT=425;
	public static final int TUESDAY=426;
	public static final int TinyintLiteral=427;
	public static final int WEDNESDAY=428;
	public static final int WEEK=429;
	public static final int WS=430;
	public static final int YEAR=431;
	public static final int YESTERDAY=432;
	public static final int Day=445;
	public static final int Hour=451;
	public static final int INT=452;
	public static final int Minute=804;
	public static final int Month=805;
	public static final int Second=812;
	public static final int TOK_ALIASLIST=816;
	public static final int TOK_ALLCOLREF=817;
	public static final int TOK_ALTERDATABASE_PROPERTIES=818;
	public static final int TOK_ALTERINDEX_PROPERTIES=819;
	public static final int TOK_ALTERINDEX_REBUILD=820;
	public static final int TOK_ALTERTABLE_ADDCOLS=821;
	public static final int TOK_ALTERTABLE_ADDPARTS=822;
	public static final int TOK_ALTERTABLE_ALTERPARTS=823;
	public static final int TOK_ALTERTABLE_ALTERPARTS_MERGEFILES=824;
	public static final int TOK_ALTERTABLE_ALTERPARTS_PROTECTMODE=825;
	public static final int TOK_ALTERTABLE_ARCHIVE=826;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=827;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=828;
	public static final int TOK_ALTERTABLE_DROPPARTS=829;
	public static final int TOK_ALTERTABLE_FILEFORMAT=830;
	public static final int TOK_ALTERTABLE_LOCATION=831;
	public static final int TOK_ALTERTABLE_PARTITION=832;
	public static final int TOK_ALTERTABLE_PROPERTIES=833;
	public static final int TOK_ALTERTABLE_RENAME=834;
	public static final int TOK_ALTERTABLE_RENAMECOL=835;
	public static final int TOK_ALTERTABLE_RENAMEPART=836;
	public static final int TOK_ALTERTABLE_REPLACECOLS=837;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=838;
	public static final int TOK_ALTERTABLE_SERIALIZER=839;
	public static final int TOK_ALTERTABLE_SKEWED=840;
	public static final int TOK_ALTERTABLE_TOUCH=841;
	public static final int TOK_ALTERTABLE_UNARCHIVE=842;
	public static final int TOK_ALTERTBLPART_SKEWED_LOCATION=843;
	public static final int TOK_ALTERVIEW_ADDPARTS=844;
	public static final int TOK_ALTERVIEW_AS=845;
	public static final int TOK_ALTERVIEW_DROPPARTS=846;
	public static final int TOK_ALTERVIEW_PROPERTIES=847;
	public static final int TOK_ALTERVIEW_RENAME=848;
	public static final int TOK_ANALYZE=849;
	public static final int TOK_BIGINT=850;
	public static final int TOK_BINARY=851;
	public static final int TOK_BOOLEAN=852;
	public static final int TOK_CASCADE=853;
	public static final int TOK_CHARSETLITERAL=854;
	public static final int TOK_CLUSTERBY=855;
	public static final int TOK_COLTYPELIST=856;
	public static final int TOK_CREATEDATABASE=857;
	public static final int TOK_CREATEFUNCTION=858;
	public static final int TOK_CREATEINDEX=859;
	public static final int TOK_CREATEINDEX_INDEXTBLNAME=860;
	public static final int TOK_CREATEMACRO=861;
	public static final int TOK_CREATEROLE=862;
	public static final int TOK_CREATETABLE=863;
	public static final int TOK_CREATEVIEW=864;
	public static final int TOK_CROSSJOIN=865;
	public static final int TOK_CUBE_GROUPBY=866;
	public static final int TOK_DATABASECOMMENT=867;
	public static final int TOK_DATABASELOCATION=868;
	public static final int TOK_DATABASEPROPERTIES=869;
	public static final int TOK_DATE=870;
	public static final int TOK_DATELITERAL=871;
	public static final int TOK_DATETIME=872;
	public static final int TOK_DAY=873;
	public static final int TOK_DBPROPLIST=874;
	public static final int TOK_DECIMAL=875;
	public static final int TOK_DEFERRED_REBUILDINDEX=876;
	public static final int TOK_DESCDATABASE=877;
	public static final int TOK_DESCFUNCTION=878;
	public static final int TOK_DESCTABLE=879;
	public static final int TOK_DESTINATION=880;
	public static final int TOK_DIR=881;
	public static final int TOK_DISABLE=882;
	public static final int TOK_DISTRIBUTEBY=883;
	public static final int TOK_DOUBLE=884;
	public static final int TOK_DROPDATABASE=885;
	public static final int TOK_DROPFUNCTION=886;
	public static final int TOK_DROPINDEX=887;
	public static final int TOK_DROPMACRO=888;
	public static final int TOK_DROPROLE=889;
	public static final int TOK_DROPTABLE=890;
	public static final int TOK_DROPTABLE_PROPERTIES=891;
	public static final int TOK_DROPVIEW=892;
	public static final int TOK_DROPVIEW_PROPERTIES=893;
	public static final int TOK_ENABLE=894;
	public static final int TOK_EXCHANGEPARTITION=895;
	public static final int TOK_EXPLAIN=896;
	public static final int TOK_EXPLIST=897;
	public static final int TOK_EXPORT=898;
	public static final int TOK_FALSE=899;
	public static final int TOK_FILEFORMAT_GENERIC=900;
	public static final int TOK_FLOAT=901;
	public static final int TOK_FROM=902;
	public static final int TOK_FULLOUTERJOIN=903;
	public static final int TOK_FUNCTION=904;
	public static final int TOK_FUNCTIONDI=905;
	public static final int TOK_FUNCTIONSTAR=906;
	public static final int TOK_GRANT=907;
	public static final int TOK_GRANT_ROLE=908;
	public static final int TOK_GRANT_WITH_OPTION=909;
	public static final int TOK_GROUP=910;
	public static final int TOK_GROUPBY=911;
	public static final int TOK_GROUPING_SETS=912;
	public static final int TOK_GROUPING_SETS_EXPRESSION=913;
	public static final int TOK_HAVING=914;
	public static final int TOK_HINT=915;
	public static final int TOK_HINTARGLIST=916;
	public static final int TOK_HINTLIST=917;
	public static final int TOK_HOLD_DDLTIME=918;
	public static final int TOK_HOUR=919;
	public static final int TOK_IFEXISTS=920;
	public static final int TOK_IFNOTEXISTS=921;
	public static final int TOK_IGNOREPROTECTION=922;
	public static final int TOK_IMPORT=923;
	public static final int TOK_INCRE=924;
	public static final int TOK_INCREFREQUENCY=925;
	public static final int TOK_INDEXCOMMENT=926;
	public static final int TOK_INDEXPROPERTIES=927;
	public static final int TOK_INDEXPROPLIST=928;
	public static final int TOK_INSERT=929;
	public static final int TOK_INSERT_INTO=930;
	public static final int TOK_INT=931;
	public static final int TOK_ISNOTNULL=932;
	public static final int TOK_ISNULL=933;
	public static final int TOK_JOIN=934;
	public static final int TOK_LATERAL_VIEW=935;
	public static final int TOK_LATERAL_VIEW_OUTER=936;
	public static final int TOK_LEFTOUTERJOIN=937;
	public static final int TOK_LEFTSEMIJOIN=938;
	public static final int TOK_LENGTH=939;
	public static final int TOK_LIKETABLE=940;
	public static final int TOK_LIMIT=941;
	public static final int TOK_LIST=942;
	public static final int TOK_LOAD=943;
	public static final int TOK_LOCAL_DIR=944;
	public static final int TOK_LOCKTABLE=945;
	public static final int TOK_MAP=946;
	public static final int TOK_MAPJOIN=947;
	public static final int TOK_MINUTE=948;
	public static final int TOK_MONTH=949;
	public static final int TOK_MSCK=950;
	public static final int TOK_NOT_CLUSTERED=951;
	public static final int TOK_NOT_SORTED=952;
	public static final int TOK_NO_DROP=953;
	public static final int TOK_NULL=954;
	public static final int TOK_OFFLINE=955;
	public static final int TOK_OP_ADD=956;
	public static final int TOK_OP_AND=957;
	public static final int TOK_OP_BITAND=958;
	public static final int TOK_OP_BITNOT=959;
	public static final int TOK_OP_BITOR=960;
	public static final int TOK_OP_BITXOR=961;
	public static final int TOK_OP_DIV=962;
	public static final int TOK_OP_EQ=963;
	public static final int TOK_OP_GE=964;
	public static final int TOK_OP_GT=965;
	public static final int TOK_OP_LE=966;
	public static final int TOK_OP_LIKE=967;
	public static final int TOK_OP_LT=968;
	public static final int TOK_OP_MOD=969;
	public static final int TOK_OP_MUL=970;
	public static final int TOK_OP_NE=971;
	public static final int TOK_OP_NOT=972;
	public static final int TOK_OP_OR=973;
	public static final int TOK_OP_SUB=974;
	public static final int TOK_ORDERBY=975;
	public static final int TOK_ORREPLACE=976;
	public static final int TOK_PARTITIONINGSPEC=977;
	public static final int TOK_PARTITIONLOCATION=978;
	public static final int TOK_PARTSPEC=979;
	public static final int TOK_PARTVAL=980;
	public static final int TOK_PERCENT=981;
	public static final int TOK_PRINCIPAL_NAME=982;
	public static final int TOK_PRIVILEGE=983;
	public static final int TOK_PRIVILEGE_LIST=984;
	public static final int TOK_PRIV_ALL=985;
	public static final int TOK_PRIV_ALTER_DATA=986;
	public static final int TOK_PRIV_ALTER_METADATA=987;
	public static final int TOK_PRIV_CREATE=988;
	public static final int TOK_PRIV_DROP=989;
	public static final int TOK_PRIV_INDEX=990;
	public static final int TOK_PRIV_LOCK=991;
	public static final int TOK_PRIV_OBJECT=992;
	public static final int TOK_PRIV_OBJECT_COL=993;
	public static final int TOK_PRIV_SELECT=994;
	public static final int TOK_PRIV_SHOW_DATABASE=995;
	public static final int TOK_PTBLFUNCTION=996;
	public static final int TOK_QUERY=997;
	public static final int TOK_READONLY=998;
	public static final int TOK_RECORDREADER=999;
	public static final int TOK_RECORDWRITER=1000;
	public static final int TOK_RESTRICT=1001;
	public static final int TOK_REVOKE=1002;
	public static final int TOK_REVOKE_ROLE=1003;
	public static final int TOK_RIGHTOUTERJOIN=1004;
	public static final int TOK_ROLE=1005;
	public static final int TOK_ROLLUP_GROUPBY=1006;
	public static final int TOK_ROWCOUNT=1007;
	public static final int TOK_SECOND=1008;
	public static final int TOK_SELECT=1009;
	public static final int TOK_SELECTDI=1010;
	public static final int TOK_SELEXPR=1011;
	public static final int TOK_SERDE=1012;
	public static final int TOK_SERDENAME=1013;
	public static final int TOK_SERDEPROPS=1014;
	public static final int TOK_SHOWCOLUMNS=1015;
	public static final int TOK_SHOWDATABASES=1016;
	public static final int TOK_SHOWFUNCTIONS=1017;
	public static final int TOK_SHOWINDEXES=1018;
	public static final int TOK_SHOWLOCKS=1019;
	public static final int TOK_SHOWPARTITIONS=1020;
	public static final int TOK_SHOWTABLES=1021;
	public static final int TOK_SHOW_CREATETABLE=1022;
	public static final int TOK_SHOW_GRANT=1023;
	public static final int TOK_SHOW_ROLE_GRANT=1024;
	public static final int TOK_SHOW_TABLESTATUS=1025;
	public static final int TOK_SHOW_TBLPROPERTIES=1026;
	public static final int TOK_SKEWED_LOCATIONS=1027;
	public static final int TOK_SKEWED_LOCATION_LIST=1028;
	public static final int TOK_SKEWED_LOCATION_MAP=1029;
	public static final int TOK_SMALLINT=1030;
	public static final int TOK_SORTBY=1031;
	public static final int TOK_STARTTIME=1032;
	public static final int TOK_STOPTIME=1033;
	public static final int TOK_STORAGEHANDLER=1034;
	public static final int TOK_STOREDASDIRS=1035;
	public static final int TOK_STREAMTABLE=1036;
	public static final int TOK_STRING=1037;
	public static final int TOK_STRINGLITERALSEQUENCE=1038;
	public static final int TOK_STRUCT=1039;
	public static final int TOK_SUBQUERY=1040;
	public static final int TOK_SWITCHDATABASE=1041;
	public static final int TOK_TAB=1042;
	public static final int TOK_TABALIAS=1043;
	public static final int TOK_TABCOL=1044;
	public static final int TOK_TABCOLLIST=1045;
	public static final int TOK_TABCOLNAME=1046;
	public static final int TOK_TABCOLVALUE=1047;
	public static final int TOK_TABCOLVALUES=1048;
	public static final int TOK_TABCOLVALUE_PAIR=1049;
	public static final int TOK_TABLEBUCKETS=1050;
	public static final int TOK_TABLEBUCKETSAMPLE=1051;
	public static final int TOK_TABLECOMMENT=1052;
	public static final int TOK_TABLEFILEFORMAT=1053;
	public static final int TOK_TABLELOCATION=1054;
	public static final int TOK_TABLEPARTCOLS=1055;
	public static final int TOK_TABLEPROPERTIES=1056;
	public static final int TOK_TABLEPROPERTY=1057;
	public static final int TOK_TABLEPROPLIST=1058;
	public static final int TOK_TABLEROWFORMAT=1059;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=1060;
	public static final int TOK_TABLEROWFORMATFIELD=1061;
	public static final int TOK_TABLEROWFORMATLINES=1062;
	public static final int TOK_TABLEROWFORMATMAPKEYS=1063;
	public static final int TOK_TABLESERIALIZER=1064;
	public static final int TOK_TABLESKEWED=1065;
	public static final int TOK_TABLESPLITSAMPLE=1066;
	public static final int TOK_TABLE_OR_COL=1067;
	public static final int TOK_TABLE_PARTITION=1068;
	public static final int TOK_TABNAME=1069;
	public static final int TOK_TABREF=1070;
	public static final int TOK_TABSORTCOLNAMEASC=1071;
	public static final int TOK_TABSORTCOLNAMEDESC=1072;
	public static final int TOK_TABSRC=1073;
	public static final int TOK_TABTYPE=1074;
	public static final int TOK_TBLORCFILE=1075;
	public static final int TOK_TBLRCFILE=1076;
	public static final int TOK_TBLSEQUENCEFILE=1077;
	public static final int TOK_TBLTEXTFILE=1078;
	public static final int TOK_TIME=1079;
	public static final int TOK_TIMESTAMP=1080;
	public static final int TOK_TINYINT=1081;
	public static final int TOK_TMP_FILE=1082;
	public static final int TOK_TRANSFORM=1083;
	public static final int TOK_TRUE=1084;
	public static final int TOK_TRUNCATETABLE=1085;
	public static final int TOK_UNION=1086;
	public static final int TOK_UNIONTYPE=1087;
	public static final int TOK_UNIQUEJOIN=1088;
	public static final int TOK_UNLOCKTABLE=1089;
	public static final int TOK_USER=1090;
	public static final int TOK_USERSCRIPTCOLNAMES=1091;
	public static final int TOK_USERSCRIPTCOLSCHEMA=1092;
	public static final int TOK_VARCHAR=1093;
	public static final int TOK_VIEWPARTCOLS=1094;
	public static final int TOK_WHERE=1095;
	public static final int TOK_WINDOWDEF=1096;
	public static final int TOK_WINDOWRANGE=1097;
	public static final int TOK_WINDOWSPEC=1098;
	public static final int TOK_WINDOWVALUES=1099;
	public static final int TOK_YEAR=1100;
	public static final int Year=1102;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "FromClauseParser.g"; }


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


	public static class tableAllColumns_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableAllColumns"
	// FromClauseParser.g:48:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
	public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
		HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR1=null;
		Token DOT3=null;
		Token STAR4=null;
		ParserRuleReturnScope tableName2 =null;

		CommonTree STAR1_tree=null;
		CommonTree DOT3_tree=null;
		CommonTree STAR4_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		try {
			// FromClauseParser.g:49:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==STAR) ) {
				alt1=1;
			}
			else if ( (LA1_0==Identifier||(LA1_0 >= KW_ADD && LA1_0 <= KW_AFTER)||(LA1_0 >= KW_ALTER && LA1_0 <= KW_ANALYZE)||(LA1_0 >= KW_ARCHIVE && LA1_0 <= KW_CASCADE)||(LA1_0 >= KW_CHANGE && LA1_0 <= KW_COLLECTION)||(LA1_0 >= KW_COLUMNS && LA1_0 <= KW_CREATE)||LA1_0==KW_CUBE||(LA1_0 >= KW_CURSOR && LA1_0 <= KW_DATA)||(LA1_0 >= KW_DATABASES && LA1_0 <= KW_DISABLE)||(LA1_0 >= KW_DISTRIBUTE && LA1_0 <= KW_DROP)||LA1_0==KW_ELEM_TYPE||LA1_0==KW_ENABLE||LA1_0==KW_ESCAPED||(LA1_0 >= KW_EXCLUSIVE && LA1_0 <= KW_EXPORT)||(LA1_0 >= KW_EXTERNAL && LA1_0 <= KW_FLOAT)||(LA1_0 >= KW_FOR && LA1_0 <= KW_FORMATTED)||LA1_0==KW_FULL||(LA1_0 >= KW_FUNCTIONS && LA1_0 <= KW_GROUPING)||(LA1_0 >= KW_HOLD_DDLTIME && LA1_0 <= KW_IDXPROPERTIES)||(LA1_0 >= KW_IGNORE && LA1_0 <= KW_INCRE)||(LA1_0 >= KW_INDEX && LA1_0 <= KW_ITEMS)||(LA1_0 >= KW_KEYS && LA1_0 <= KW_LEFT)||(LA1_0 >= KW_LIKE && LA1_0 <= KW_LONG)||(LA1_0 >= KW_MAPJOIN && LA1_0 <= KW_MINUS)||(LA1_0 >= KW_MSCK && LA1_0 <= KW_NOSCAN)||(LA1_0 >= KW_NO_DROP && LA1_0 <= KW_OFFLINE)||LA1_0==KW_OPTION||(LA1_0 >= KW_ORCFILE && LA1_0 <= KW_OUTPUTFORMAT)||LA1_0==KW_OVERWRITE||(LA1_0 >= KW_PARTITION && LA1_0 <= KW_PLUS)||(LA1_0 >= KW_PRETTY && LA1_0 <= KW_RECORDWRITER)||(LA1_0 >= KW_REGEXP && LA1_0 <= KW_SCHEMAS)||(LA1_0 >= KW_SEMI && LA1_0 <= KW_TABLES)||(LA1_0 >= KW_TBLPROPERTIES && LA1_0 <= KW_TEXTFILE)||(LA1_0 >= KW_TIMESTAMP && LA1_0 <= KW_TOUCH)||(LA1_0 >= KW_TRIGGER && LA1_0 <= KW_UNARCHIVE)||(LA1_0 >= KW_UNDO && LA1_0 <= KW_UNIONTYPE)||(LA1_0 >= KW_UNLOCK && LA1_0 <= KW_VALUE_TYPE)||LA1_0==KW_VIEW||LA1_0==KW_WHILE||LA1_0==KW_WITH) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// FromClauseParser.g:49:7: STAR
					{
					STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns57); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR1);

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
					// 50:9: -> ^( TOK_ALLCOLREF )
					{
						// FromClauseParser.g:50:12: ^( TOK_ALLCOLREF )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:51:7: tableName DOT STAR
					{
					pushFollow(FOLLOW_tableName_in_tableAllColumns79);
					tableName2=tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());
					DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns81); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT3);

					STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns83); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR4);

					// AST REWRITE
					// elements: tableName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 52:9: -> ^( TOK_ALLCOLREF tableName )
					{
						// FromClauseParser.g:52:12: ^( TOK_ALLCOLREF tableName )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_1, stream_tableName.nextTree());
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
	// $ANTLR end "tableAllColumns"


	public static class tableOrColumn_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableOrColumn"
	// FromClauseParser.g:56:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
	public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
		HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier5 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("table or column identifier"); 
		try {
			// FromClauseParser.g:59:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
			// FromClauseParser.g:60:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableOrColumn131);
			identifier5=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 60:16: -> ^( TOK_TABLE_OR_COL identifier )
			{
				// FromClauseParser.g:60:19: ^( TOK_TABLE_OR_COL identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
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
	// $ANTLR end "tableOrColumn"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// FromClauseParser.g:63:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
	public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
		HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA7=null;
		ParserRuleReturnScope expression6 =null;
		ParserRuleReturnScope expression8 =null;

		CommonTree COMMA7_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("expression list"); 
		try {
			// FromClauseParser.g:66:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
			// FromClauseParser.g:67:5: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList170);
			expression6=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());
			// FromClauseParser.g:67:16: ( COMMA expression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// FromClauseParser.g:67:17: COMMA expression
					{
					COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList173); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA7);

					pushFollow(FOLLOW_expression_in_expressionList175);
					expression8=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression8.getTree());
					}
					break;

				default :
					break loop2;
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
			// 67:36: -> ^( TOK_EXPLIST ( expression )+ )
			{
				// FromClauseParser.g:67:39: ^( TOK_EXPLIST ( expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
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
	// $ANTLR end "expressionList"


	public static class aliasList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aliasList"
	// FromClauseParser.g:70:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
	public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
		HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA10=null;
		ParserRuleReturnScope identifier9 =null;
		ParserRuleReturnScope identifier11 =null;

		CommonTree COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("alias list"); 
		try {
			// FromClauseParser.g:73:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
			// FromClauseParser.g:74:5: identifier ( COMMA identifier )*
			{
			pushFollow(FOLLOW_identifier_in_aliasList217);
			identifier9=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier9.getTree());
			// FromClauseParser.g:74:16: ( COMMA identifier )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// FromClauseParser.g:74:17: COMMA identifier
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList220); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA10);

					pushFollow(FOLLOW_identifier_in_aliasList222);
					identifier11=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 74:36: -> ^( TOK_ALIASLIST ( identifier )+ )
			{
				// FromClauseParser.g:74:39: ^( TOK_ALIASLIST ( identifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST"), root_1);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

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
	// $ANTLR end "aliasList"


	public static class fromClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fromClause"
	// FromClauseParser.g:79:1: fromClause : KW_FROM joinSource -> ^( TOK_FROM joinSource ) ;
	public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
		HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_FROM12=null;
		ParserRuleReturnScope joinSource13 =null;

		CommonTree KW_FROM12_tree=null;
		RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
		RewriteRuleSubtreeStream stream_joinSource=new RewriteRuleSubtreeStream(adaptor,"rule joinSource");

		 gParent.msgs.push("from clause"); 
		try {
			// FromClauseParser.g:82:5: ( KW_FROM joinSource -> ^( TOK_FROM joinSource ) )
			// FromClauseParser.g:83:5: KW_FROM joinSource
			{
			KW_FROM12=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause266); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM12);

			pushFollow(FOLLOW_joinSource_in_fromClause268);
			joinSource13=joinSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_joinSource.add(joinSource13.getTree());
			// AST REWRITE
			// elements: joinSource
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 83:24: -> ^( TOK_FROM joinSource )
			{
				// FromClauseParser.g:83:27: ^( TOK_FROM joinSource )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FROM, "TOK_FROM"), root_1);
				adaptor.addChild(root_1, stream_joinSource.nextTree());
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
	// $ANTLR end "fromClause"


	public static class joinSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joinSource"
	// FromClauseParser.g:86:1: joinSource : ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ );
	public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
		HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ON17=null;
		Token COMMA21=null;
		ParserRuleReturnScope fromSource14 =null;
		ParserRuleReturnScope joinToken15 =null;
		ParserRuleReturnScope fromSource16 =null;
		ParserRuleReturnScope expression18 =null;
		ParserRuleReturnScope uniqueJoinToken19 =null;
		ParserRuleReturnScope uniqueJoinSource20 =null;
		ParserRuleReturnScope uniqueJoinSource22 =null;

		CommonTree KW_ON17_tree=null;
		CommonTree COMMA21_tree=null;

		 gParent.msgs.push("join source"); 
		try {
			// FromClauseParser.g:89:5: ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Identifier||(LA7_0 >= KW_ADD && LA7_0 <= KW_AFTER)||(LA7_0 >= KW_ALTER && LA7_0 <= KW_ANALYZE)||(LA7_0 >= KW_ARCHIVE && LA7_0 <= KW_CASCADE)||(LA7_0 >= KW_CHANGE && LA7_0 <= KW_COLLECTION)||(LA7_0 >= KW_COLUMNS && LA7_0 <= KW_CREATE)||LA7_0==KW_CUBE||(LA7_0 >= KW_CURSOR && LA7_0 <= KW_DATA)||(LA7_0 >= KW_DATABASES && LA7_0 <= KW_DISABLE)||(LA7_0 >= KW_DISTRIBUTE && LA7_0 <= KW_DROP)||LA7_0==KW_ELEM_TYPE||LA7_0==KW_ENABLE||LA7_0==KW_ESCAPED||(LA7_0 >= KW_EXCLUSIVE && LA7_0 <= KW_EXPORT)||(LA7_0 >= KW_EXTERNAL && LA7_0 <= KW_FLOAT)||(LA7_0 >= KW_FOR && LA7_0 <= KW_FORMATTED)||LA7_0==KW_FULL||(LA7_0 >= KW_FUNCTIONS && LA7_0 <= KW_GROUPING)||(LA7_0 >= KW_HOLD_DDLTIME && LA7_0 <= KW_IDXPROPERTIES)||(LA7_0 >= KW_IGNORE && LA7_0 <= KW_INCRE)||(LA7_0 >= KW_INDEX && LA7_0 <= KW_ITEMS)||(LA7_0 >= KW_KEYS && LA7_0 <= KW_LEFT)||(LA7_0 >= KW_LIKE && LA7_0 <= KW_LONG)||(LA7_0 >= KW_MAPJOIN && LA7_0 <= KW_MINUS)||(LA7_0 >= KW_MSCK && LA7_0 <= KW_NOSCAN)||(LA7_0 >= KW_NO_DROP && LA7_0 <= KW_OFFLINE)||LA7_0==KW_OPTION||(LA7_0 >= KW_ORCFILE && LA7_0 <= KW_OUTPUTFORMAT)||LA7_0==KW_OVERWRITE||(LA7_0 >= KW_PARTITION && LA7_0 <= KW_PLUS)||(LA7_0 >= KW_PRETTY && LA7_0 <= KW_RECORDWRITER)||(LA7_0 >= KW_REGEXP && LA7_0 <= KW_SCHEMAS)||(LA7_0 >= KW_SEMI && LA7_0 <= KW_TABLES)||(LA7_0 >= KW_TBLPROPERTIES && LA7_0 <= KW_TEXTFILE)||(LA7_0 >= KW_TIMESTAMP && LA7_0 <= KW_TOUCH)||(LA7_0 >= KW_TRIGGER && LA7_0 <= KW_UNARCHIVE)||(LA7_0 >= KW_UNDO && LA7_0 <= KW_UNIONTYPE)||(LA7_0 >= KW_UNLOCK && LA7_0 <= KW_VALUE_TYPE)||LA7_0==KW_VIEW||LA7_0==KW_WHILE||LA7_0==KW_WITH||LA7_0==LPAREN) ) {
				alt7=1;
			}
			else if ( (LA7_0==KW_UNIQUEJOIN) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// FromClauseParser.g:89:7: fromSource ( joinToken ^ fromSource ( KW_ON ! expression )? )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fromSource_in_joinSource303);
					fromSource14=fromSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource14.getTree());

					// FromClauseParser.g:89:18: ( joinToken ^ fromSource ( KW_ON ! expression )? )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==KW_CROSS||LA5_0==KW_FULL||LA5_0==KW_INNER||LA5_0==KW_JOIN||LA5_0==KW_LEFT||LA5_0==KW_RIGHT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// FromClauseParser.g:89:20: joinToken ^ fromSource ( KW_ON ! expression )?
							{
							pushFollow(FOLLOW_joinToken_in_joinSource307);
							joinToken15=joinToken();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(joinToken15.getTree(), root_0);
							pushFollow(FOLLOW_fromSource_in_joinSource310);
							fromSource16=fromSource();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource16.getTree());

							// FromClauseParser.g:89:42: ( KW_ON ! expression )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==KW_ON) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// FromClauseParser.g:89:43: KW_ON ! expression
									{
									KW_ON17=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource313); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_joinSource316);
									expression18=gHiveParser.expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());

									}
									break;

							}

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:90:7: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_uniqueJoinToken_in_joinSource329);
					uniqueJoinToken19=uniqueJoinToken();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(uniqueJoinToken19.getTree(), root_0);
					pushFollow(FOLLOW_uniqueJoinSource_in_joinSource332);
					uniqueJoinSource20=uniqueJoinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource20.getTree());

					// FromClauseParser.g:90:41: ( COMMA ! uniqueJoinSource )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// FromClauseParser.g:90:42: COMMA ! uniqueJoinSource
							{
							COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinSource335); if (state.failed) return retval;
							pushFollow(FOLLOW_uniqueJoinSource_in_joinSource338);
							uniqueJoinSource22=uniqueJoinSource();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource22.getTree());

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
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
	// $ANTLR end "joinSource"


	public static class uniqueJoinSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinSource"
	// FromClauseParser.g:93:1: uniqueJoinSource : ( KW_PRESERVE )? fromSource uniqueJoinExpr ;
	public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PRESERVE23=null;
		ParserRuleReturnScope fromSource24 =null;
		ParserRuleReturnScope uniqueJoinExpr25 =null;

		CommonTree KW_PRESERVE23_tree=null;

		 gParent.msgs.push("join source"); 
		try {
			// FromClauseParser.g:96:5: ( ( KW_PRESERVE )? fromSource uniqueJoinExpr )
			// FromClauseParser.g:96:7: ( KW_PRESERVE )? fromSource uniqueJoinExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// FromClauseParser.g:96:7: ( KW_PRESERVE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==KW_PRESERVE) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// FromClauseParser.g:96:7: KW_PRESERVE
					{
					KW_PRESERVE23=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_PRESERVE23_tree = (CommonTree)adaptor.create(KW_PRESERVE23);
					adaptor.addChild(root_0, KW_PRESERVE23_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_fromSource_in_uniqueJoinSource370);
			fromSource24=fromSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource24.getTree());

			pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource372);
			uniqueJoinExpr25=uniqueJoinExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr25.getTree());

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
	// $ANTLR end "uniqueJoinSource"


	public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinExpr"
	// FromClauseParser.g:99:1: uniqueJoinExpr : LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) ;
	public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN26=null;
		Token COMMA27=null;
		Token RPAREN28=null;
		List<Object> list_e1=null;
		RuleReturnScope e1 = null;
		CommonTree LPAREN26_tree=null;
		CommonTree COMMA27_tree=null;
		CommonTree RPAREN28_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("unique join expression list"); 
		try {
			// FromClauseParser.g:102:5: ( LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) )
			// FromClauseParser.g:102:7: LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN
			{
			LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr399); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN26);

			pushFollow(FOLLOW_expression_in_uniqueJoinExpr403);
			e1=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
			if (list_e1==null) list_e1=new ArrayList<Object>();
			list_e1.add(e1.getTree());
			// FromClauseParser.g:102:29: ( COMMA e1+= expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// FromClauseParser.g:102:30: COMMA e1+= expression
					{
					COMMA27=(Token)match(input,COMMA,FOLLOW_COMMA_in_uniqueJoinExpr406); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA27);

					pushFollow(FOLLOW_expression_in_uniqueJoinExpr410);
					e1=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
					if (list_e1==null) list_e1=new ArrayList<Object>();
					list_e1.add(e1.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN28);

			// AST REWRITE
			// elements: e1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: e1
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",list_e1);
			root_0 = (CommonTree)adaptor.nil();
			// 103:7: -> ^( TOK_EXPLIST ( $e1)* )
			{
				// FromClauseParser.g:103:10: ^( TOK_EXPLIST ( $e1)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				// FromClauseParser.g:103:25: ( $e1)*
				while ( stream_e1.hasNext() ) {
					adaptor.addChild(root_1, stream_e1.nextTree());
				}
				stream_e1.reset();

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
	// $ANTLR end "uniqueJoinExpr"


	public static class uniqueJoinToken_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinToken"
	// FromClauseParser.g:106:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
	public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_UNIQUEJOIN29=null;

		CommonTree KW_UNIQUEJOIN29_tree=null;
		RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

		 gParent.msgs.push("unique join"); 
		try {
			// FromClauseParser.g:109:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
			// FromClauseParser.g:109:7: KW_UNIQUEJOIN
			{
			KW_UNIQUEJOIN29=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN29);

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
			// 109:21: -> TOK_UNIQUEJOIN
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN"));
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
	// $ANTLR end "uniqueJoinToken"


	public static class joinToken_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joinToken"
	// FromClauseParser.g:111:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN );
	public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
		HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_JOIN30=null;
		Token KW_INNER31=null;
		Token KW_JOIN32=null;
		Token KW_CROSS33=null;
		Token KW_JOIN34=null;
		Token KW_LEFT35=null;
		Token KW_OUTER36=null;
		Token KW_JOIN37=null;
		Token KW_RIGHT38=null;
		Token KW_OUTER39=null;
		Token KW_JOIN40=null;
		Token KW_FULL41=null;
		Token KW_OUTER42=null;
		Token KW_JOIN43=null;
		Token KW_LEFT44=null;
		Token KW_SEMI45=null;
		Token KW_JOIN46=null;

		CommonTree KW_JOIN30_tree=null;
		CommonTree KW_INNER31_tree=null;
		CommonTree KW_JOIN32_tree=null;
		CommonTree KW_CROSS33_tree=null;
		CommonTree KW_JOIN34_tree=null;
		CommonTree KW_LEFT35_tree=null;
		CommonTree KW_OUTER36_tree=null;
		CommonTree KW_JOIN37_tree=null;
		CommonTree KW_RIGHT38_tree=null;
		CommonTree KW_OUTER39_tree=null;
		CommonTree KW_JOIN40_tree=null;
		CommonTree KW_FULL41_tree=null;
		CommonTree KW_OUTER42_tree=null;
		CommonTree KW_JOIN43_tree=null;
		CommonTree KW_LEFT44_tree=null;
		CommonTree KW_SEMI45_tree=null;
		CommonTree KW_JOIN46_tree=null;
		RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");
		RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
		RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
		RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
		RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
		RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");

		 gParent.msgs.push("join type specifier"); 
		try {
			// FromClauseParser.g:114:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN )
			int alt13=7;
			switch ( input.LA(1) ) {
			case KW_JOIN:
				{
				alt13=1;
				}
				break;
			case KW_INNER:
				{
				alt13=2;
				}
				break;
			case KW_CROSS:
				{
				alt13=3;
				}
				break;
			case KW_LEFT:
				{
				int LA13_4 = input.LA(2);
				if ( (LA13_4==KW_SEMI) ) {
					alt13=7;
				}
				else if ( (LA13_4==KW_JOIN||LA13_4==KW_OUTER) ) {
					alt13=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_RIGHT:
				{
				alt13=5;
				}
				break;
			case KW_FULL:
				{
				alt13=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// FromClauseParser.g:115:7: KW_JOIN
					{
					KW_JOIN30=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN30);

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
					// 115:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:116:7: KW_INNER KW_JOIN
					{
					KW_INNER31=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER31);

					KW_JOIN32=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken524); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN32);

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
					// 116:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:117:7: KW_CROSS KW_JOIN
					{
					KW_CROSS33=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS33);

					KW_JOIN34=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken550); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN34);

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
					// 117:36: -> TOK_CROSSJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:118:7: KW_LEFT ( KW_OUTER )? KW_JOIN
					{
					KW_LEFT35=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT35);

					// FromClauseParser.g:118:16: ( KW_OUTER )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==KW_OUTER) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// FromClauseParser.g:118:17: KW_OUTER
							{
							KW_OUTER36=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken578); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER36);

							}
							break;

					}

					KW_JOIN37=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN37);

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
					// 118:36: -> TOK_LEFTOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:119:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
					{
					KW_RIGHT38=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken594); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT38);

					// FromClauseParser.g:119:16: ( KW_OUTER )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==KW_OUTER) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// FromClauseParser.g:119:17: KW_OUTER
							{
							KW_OUTER39=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken597); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER39);

							}
							break;

					}

					KW_JOIN40=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN40);

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
					// 119:36: -> TOK_RIGHTOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// FromClauseParser.g:120:7: KW_FULL ( KW_OUTER )? KW_JOIN
					{
					KW_FULL41=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL41);

					// FromClauseParser.g:120:16: ( KW_OUTER )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==KW_OUTER) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// FromClauseParser.g:120:17: KW_OUTER
							{
							KW_OUTER42=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken617); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER42);

							}
							break;

					}

					KW_JOIN43=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN43);

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
					// 120:36: -> TOK_FULLOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// FromClauseParser.g:121:7: KW_LEFT KW_SEMI KW_JOIN
					{
					KW_LEFT44=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT44);

					KW_SEMI45=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI45);

					KW_JOIN46=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN46);

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
					// 121:36: -> TOK_LEFTSEMIJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN"));
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
	// $ANTLR end "joinToken"


	public static class lateralView_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lateralView"
	// FromClauseParser.g:124:1: lateralView : ( KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) );
	public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
		HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_LATERAL47=null;
		Token KW_VIEW48=null;
		Token KW_OUTER49=null;
		Token KW_AS52=null;
		Token COMMA54=null;
		Token KW_LATERAL56=null;
		Token KW_VIEW57=null;
		Token KW_AS60=null;
		Token COMMA62=null;
		ParserRuleReturnScope function50 =null;
		ParserRuleReturnScope tableAlias51 =null;
		ParserRuleReturnScope identifier53 =null;
		ParserRuleReturnScope identifier55 =null;
		ParserRuleReturnScope function58 =null;
		ParserRuleReturnScope tableAlias59 =null;
		ParserRuleReturnScope identifier61 =null;
		ParserRuleReturnScope identifier63 =null;

		CommonTree KW_LATERAL47_tree=null;
		CommonTree KW_VIEW48_tree=null;
		CommonTree KW_OUTER49_tree=null;
		CommonTree KW_AS52_tree=null;
		CommonTree COMMA54_tree=null;
		CommonTree KW_LATERAL56_tree=null;
		CommonTree KW_VIEW57_tree=null;
		CommonTree KW_AS60_tree=null;
		CommonTree COMMA62_tree=null;
		RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		gParent.msgs.push("lateral view"); 
		try {
			// FromClauseParser.g:127:2: ( KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_LATERAL) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==KW_VIEW) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==KW_OUTER) ) {
						alt18=1;
					}
					else if ( (LA18_2==Identifier||(LA18_2 >= KW_ADD && LA18_2 <= KW_AFTER)||(LA18_2 >= KW_ALTER && LA18_2 <= KW_ANALYZE)||(LA18_2 >= KW_ARCHIVE && LA18_2 <= KW_CASCADE)||(LA18_2 >= KW_CHANGE && LA18_2 <= KW_COLLECTION)||(LA18_2 >= KW_COLUMNS && LA18_2 <= KW_CREATE)||LA18_2==KW_CUBE||(LA18_2 >= KW_CURSOR && LA18_2 <= KW_DATA)||(LA18_2 >= KW_DATABASES && LA18_2 <= KW_DISABLE)||(LA18_2 >= KW_DISTRIBUTE && LA18_2 <= KW_DROP)||LA18_2==KW_ELEM_TYPE||LA18_2==KW_ENABLE||LA18_2==KW_ESCAPED||(LA18_2 >= KW_EXCLUSIVE && LA18_2 <= KW_EXPORT)||(LA18_2 >= KW_EXTERNAL && LA18_2 <= KW_FLOAT)||(LA18_2 >= KW_FOR && LA18_2 <= KW_FORMATTED)||LA18_2==KW_FULL||(LA18_2 >= KW_FUNCTIONS && LA18_2 <= KW_GROUPING)||(LA18_2 >= KW_HOLD_DDLTIME && LA18_2 <= KW_INCRE)||(LA18_2 >= KW_INDEX && LA18_2 <= KW_ITEMS)||(LA18_2 >= KW_KEYS && LA18_2 <= KW_LEFT)||(LA18_2 >= KW_LIKE && LA18_2 <= KW_LONG)||(LA18_2 >= KW_MAP && LA18_2 <= KW_MINUS)||(LA18_2 >= KW_MSCK && LA18_2 <= KW_NOSCAN)||(LA18_2 >= KW_NO_DROP && LA18_2 <= KW_OFFLINE)||LA18_2==KW_OPTION||(LA18_2 >= KW_ORCFILE && LA18_2 <= KW_OUT)||(LA18_2 >= KW_OUTPUTDRIVER && LA18_2 <= KW_OUTPUTFORMAT)||LA18_2==KW_OVERWRITE||(LA18_2 >= KW_PARTITION && LA18_2 <= KW_PLUS)||(LA18_2 >= KW_PRETTY && LA18_2 <= KW_RECORDWRITER)||(LA18_2 >= KW_REGEXP && LA18_2 <= KW_SCHEMAS)||(LA18_2 >= KW_SEMI && LA18_2 <= KW_TABLES)||(LA18_2 >= KW_TBLPROPERTIES && LA18_2 <= KW_TEXTFILE)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TOUCH)||(LA18_2 >= KW_TRIGGER && LA18_2 <= KW_UNARCHIVE)||(LA18_2 >= KW_UNDO && LA18_2 <= KW_UNIONTYPE)||(LA18_2 >= KW_UNLOCK && LA18_2 <= KW_VALUE_TYPE)||LA18_2==KW_VIEW||LA18_2==KW_WHILE||LA18_2==KW_WITH) ) {
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
					// FromClauseParser.g:128:2: KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( COMMA identifier )* )?
					{
					KW_LATERAL47=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL47);

					KW_VIEW48=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView673); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW48);

					KW_OUTER49=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER49);

					pushFollow(FOLLOW_function_in_lateralView677);
					function50=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function50.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView679);
					tableAlias51=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias51.getTree());
					// FromClauseParser.g:128:50: ( KW_AS identifier ( COMMA identifier )* )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==KW_AS) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// FromClauseParser.g:128:51: KW_AS identifier ( COMMA identifier )*
							{
							KW_AS52=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView682); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS52);

							pushFollow(FOLLOW_identifier_in_lateralView684);
							identifier53=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier53.getTree());
							// FromClauseParser.g:128:68: ( COMMA identifier )*
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( (LA14_0==COMMA) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// FromClauseParser.g:128:69: COMMA identifier
									{
									COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView687); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);

									pushFollow(FOLLOW_identifier_in_lateralView689);
									identifier55=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier55.getTree());
									}
									break;

								default :
									break loop14;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: function, tableAlias, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 129:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:129:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER"), root_1);
						// FromClauseParser.g:129:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:129:43: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:129:66: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

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
					// FromClauseParser.g:131:2: KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( COMMA identifier )* )?
					{
					KW_LATERAL56=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView721); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL56);

					KW_VIEW57=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView723); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW57);

					pushFollow(FOLLOW_function_in_lateralView725);
					function58=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function58.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView727);
					tableAlias59=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias59.getTree());
					// FromClauseParser.g:131:41: ( KW_AS identifier ( COMMA identifier )* )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==KW_AS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// FromClauseParser.g:131:42: KW_AS identifier ( COMMA identifier )*
							{
							KW_AS60=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView730); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS60);

							pushFollow(FOLLOW_identifier_in_lateralView732);
							identifier61=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier61.getTree());
							// FromClauseParser.g:131:59: ( COMMA identifier )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( (LA16_0==COMMA) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// FromClauseParser.g:131:60: COMMA identifier
									{
									COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView735); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

									pushFollow(FOLLOW_identifier_in_lateralView737);
									identifier63=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier63.getTree());
									}
									break;

								default :
									break loop16;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: tableAlias, identifier, function
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:132:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW"), root_1);
						// FromClauseParser.g:132:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:132:37: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:132:60: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

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
	// $ANTLR end "lateralView"


	public static class tableAlias_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableAlias"
	// FromClauseParser.g:135:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
	public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
		HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier64 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		gParent.msgs.push("table alias"); 
		try {
			// FromClauseParser.g:138:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
			// FromClauseParser.g:139:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableAlias791);
			identifier64=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier64.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 139:16: -> ^( TOK_TABALIAS identifier )
			{
				// FromClauseParser.g:139:19: ^( TOK_TABALIAS identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
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
	// $ANTLR end "tableAlias"


	public static class fromSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fromSource"
	// FromClauseParser.g:142:1: fromSource : ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)* ;
	public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
		HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope partitionedTableFunction65 =null;
		ParserRuleReturnScope tableSource66 =null;
		ParserRuleReturnScope subQuerySource67 =null;
		ParserRuleReturnScope lateralView68 =null;


		 gParent.msgs.push("from source"); 
		try {
			// FromClauseParser.g:145:5: ( ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)* )
			// FromClauseParser.g:146:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource ) ( lateralView ^)*
			{
			root_0 = (CommonTree)adaptor.nil();


			// FromClauseParser.g:146:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource )
			int alt19=3;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// FromClauseParser.g:146:6: ( Identifier LPAREN )=> partitionedTableFunction
					{
					pushFollow(FOLLOW_partitionedTableFunction_in_fromSource838);
					partitionedTableFunction65=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction65.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:146:55: tableSource
					{
					pushFollow(FOLLOW_tableSource_in_fromSource842);
					tableSource66=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource66.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:146:69: subQuerySource
					{
					pushFollow(FOLLOW_subQuerySource_in_fromSource846);
					subQuerySource67=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource67.getTree());

					}
					break;

			}

			// FromClauseParser.g:146:85: ( lateralView ^)*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==KW_LATERAL) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// FromClauseParser.g:146:86: lateralView ^
					{
					pushFollow(FOLLOW_lateralView_in_fromSource850);
					lateralView68=lateralView();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(lateralView68.getTree(), root_0);
					}
					break;

				default :
					break loop20;
				}
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
	// $ANTLR end "fromSource"


	public static class tableBucketSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableBucketSample"
	// FromClauseParser.g:149:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
	public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token numerator=null;
		Token denominator=null;
		Token KW_TABLESAMPLE69=null;
		Token LPAREN70=null;
		Token KW_BUCKET71=null;
		Token KW_OUT72=null;
		Token KW_OF73=null;
		Token KW_ON74=null;
		Token COMMA75=null;
		Token RPAREN76=null;
		List<Object> list_expr=null;
		RuleReturnScope expr = null;
		CommonTree numerator_tree=null;
		CommonTree denominator_tree=null;
		CommonTree KW_TABLESAMPLE69_tree=null;
		CommonTree LPAREN70_tree=null;
		CommonTree KW_BUCKET71_tree=null;
		CommonTree KW_OUT72_tree=null;
		CommonTree KW_OF73_tree=null;
		CommonTree KW_ON74_tree=null;
		CommonTree COMMA75_tree=null;
		CommonTree RPAREN76_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
		RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.msgs.push("table bucket sample specification"); 
		try {
			// FromClauseParser.g:152:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
			// FromClauseParser.g:153:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
			{
			KW_TABLESAMPLE69=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample884); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE69);

			LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample886); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN70);

			KW_BUCKET71=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET71);

			// FromClauseParser.g:153:37: (numerator= Number )
			// FromClauseParser.g:153:38: numerator= Number
			{
			numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(numerator);

			}

			KW_OUT72=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample896); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT72);

			KW_OF73=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF73);

			// FromClauseParser.g:153:69: (denominator= Number )
			// FromClauseParser.g:153:70: denominator= Number
			{
			denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample903); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(denominator);

			}

			// FromClauseParser.g:153:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==KW_ON) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// FromClauseParser.g:153:91: KW_ON expr+= expression ( COMMA expr+= expression )*
					{
					KW_ON74=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample907); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON74);

					pushFollow(FOLLOW_expression_in_tableBucketSample911);
					expr=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
					if (list_expr==null) list_expr=new ArrayList<Object>();
					list_expr.add(expr.getTree());
					// FromClauseParser.g:153:114: ( COMMA expr+= expression )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==COMMA) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// FromClauseParser.g:153:115: COMMA expr+= expression
							{
							COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample914); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA75);

							pushFollow(FOLLOW_expression_in_tableBucketSample918);
							expr=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
							if (list_expr==null) list_expr=new ArrayList<Object>();
							list_expr.add(expr.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;

			}

			RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample924); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN76);

			// AST REWRITE
			// elements: expr, denominator, numerator
			// token labels: numerator, denominator
			// rule labels: retval
			// token list labels: 
			// rule list labels: expr
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
			RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
			root_0 = (CommonTree)adaptor.nil();
			// 153:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
			{
				// FromClauseParser.g:153:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE"), root_1);
				adaptor.addChild(root_1, stream_numerator.nextNode());
				adaptor.addChild(root_1, stream_denominator.nextNode());
				// FromClauseParser.g:153:201: ( $expr)*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

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
	// $ANTLR end "tableBucketSample"


	public static class splitSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "splitSample"
	// FromClauseParser.g:156:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
	public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
		HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token numerator=null;
		Token percent=null;
		Token KW_TABLESAMPLE77=null;
		Token LPAREN78=null;
		Token KW_ROWS79=null;
		Token RPAREN80=null;
		Token KW_TABLESAMPLE81=null;
		Token LPAREN82=null;
		Token RPAREN83=null;

		CommonTree numerator_tree=null;
		CommonTree percent_tree=null;
		CommonTree KW_TABLESAMPLE77_tree=null;
		CommonTree LPAREN78_tree=null;
		CommonTree KW_ROWS79_tree=null;
		CommonTree RPAREN80_tree=null;
		CommonTree KW_TABLESAMPLE81_tree=null;
		CommonTree LPAREN82_tree=null;
		CommonTree RPAREN83_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");

		 gParent.msgs.push("table split sample specification"); 
		try {
			// FromClauseParser.g:159:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==KW_TABLESAMPLE) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==LPAREN) ) {
					int LA24_2 = input.LA(3);
					if ( (LA24_2==Number) ) {
						alt24=1;
					}
					else if ( (LA24_2==ByteLengthLiteral) ) {
						alt24=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 24, 2, input);
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
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// FromClauseParser.g:160:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
					{
					KW_TABLESAMPLE77=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample971); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE77);

					LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample973); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN78);

					// FromClauseParser.g:160:28: (numerator= Number )
					// FromClauseParser.g:160:29: numerator= Number
					{
					numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample979); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(numerator);

					}

					// FromClauseParser.g:160:47: (percent= KW_PERCENT | KW_ROWS )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==KW_PERCENT) ) {
						alt23=1;
					}
					else if ( (LA23_0==KW_ROWS) ) {
						alt23=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// FromClauseParser.g:160:48: percent= KW_PERCENT
							{
							percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample985); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);

							}
							break;
						case 2 :
							// FromClauseParser.g:160:67: KW_ROWS
							{
							KW_ROWS79=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample987); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS79);

							}
							break;

					}

					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN80);

					// AST REWRITE
					// elements: numerator, numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 161:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
					if (percent != null) {
						// FromClauseParser.g:161:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_PERCENT, "TOK_PERCENT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 162:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
					{
						// FromClauseParser.g:162:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:164:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
					{
					KW_TABLESAMPLE81=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE81);

					LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1036); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN82);

					// FromClauseParser.g:164:28: (numerator= ByteLengthLiteral )
					// FromClauseParser.g:164:29: numerator= ByteLengthLiteral
					{
					numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);

					}

					RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1045); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN83);

					// AST REWRITE
					// elements: numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 165:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
					{
						// FromClauseParser.g:165:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_LENGTH, "TOK_LENGTH"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
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
	// $ANTLR end "splitSample"


	public static class tableSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableSample"
	// FromClauseParser.g:168:1: tableSample : ( tableBucketSample | splitSample );
	public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope tableBucketSample84 =null;
		ParserRuleReturnScope splitSample85 =null;


		 gParent.msgs.push("table sample specification"); 
		try {
			// FromClauseParser.g:171:5: ( tableBucketSample | splitSample )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==KW_TABLESAMPLE) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==LPAREN) ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2==KW_BUCKET) ) {
						alt25=1;
					}
					else if ( (LA25_2==ByteLengthLiteral||LA25_2==Number) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// FromClauseParser.g:172:5: tableBucketSample
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableBucketSample_in_tableSample1091);
					tableBucketSample84=tableBucketSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample84.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:173:5: splitSample
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_splitSample_in_tableSample1099);
					splitSample85=splitSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample85.getTree());

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
	// $ANTLR end "tableSample"


	public static class tableSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableSource"
	// FromClauseParser.g:176:1: tableSource : tabname= tableName (props= tableProperties )? (ts= tableSample )? (ic= incrementalClause )? ( ( KW_AS )? alias= Identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $ic)? ( $alias)? ) ;
	public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
		HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token alias=null;
		Token KW_AS86=null;
		ParserRuleReturnScope tabname =null;
		ParserRuleReturnScope props =null;
		ParserRuleReturnScope ts =null;
		ParserRuleReturnScope ic =null;

		CommonTree alias_tree=null;
		CommonTree KW_AS86_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
		RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_incrementalClause=new RewriteRuleSubtreeStream(adaptor,"rule incrementalClause");

		 gParent.msgs.push("table source"); 
		try {
			// FromClauseParser.g:179:5: (tabname= tableName (props= tableProperties )? (ts= tableSample )? (ic= incrementalClause )? ( ( KW_AS )? alias= Identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $ic)? ( $alias)? ) )
			// FromClauseParser.g:179:7: tabname= tableName (props= tableProperties )? (ts= tableSample )? (ic= incrementalClause )? ( ( KW_AS )? alias= Identifier )?
			{
			pushFollow(FOLLOW_tableName_in_tableSource1128);
			tabname=tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());
			// FromClauseParser.g:179:25: (props= tableProperties )?
			int alt26=2;
			alt26 = dfa26.predict(input);
			switch (alt26) {
				case 1 :
					// FromClauseParser.g:179:26: props= tableProperties
					{
					pushFollow(FOLLOW_tableProperties_in_tableSource1133);
					props=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());
					}
					break;

			}

			// FromClauseParser.g:179:50: (ts= tableSample )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==KW_TABLESAMPLE) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// FromClauseParser.g:179:51: ts= tableSample
					{
					pushFollow(FOLLOW_tableSample_in_tableSource1140);
					ts=tableSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());
					}
					break;

			}

			// FromClauseParser.g:179:68: (ic= incrementalClause )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==DIVIDE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// FromClauseParser.g:179:69: ic= incrementalClause
					{
					pushFollow(FOLLOW_incrementalClause_in_tableSource1147);
					ic=gHiveParser.incrementalClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_incrementalClause.add(ic.getTree());
					}
					break;

			}

			// FromClauseParser.g:179:91: ( ( KW_AS )? alias= Identifier )?
			int alt30=2;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// FromClauseParser.g:179:92: ( KW_AS )? alias= Identifier
					{
					// FromClauseParser.g:179:92: ( KW_AS )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==KW_AS) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// FromClauseParser.g:179:92: KW_AS
							{
							KW_AS86=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1151); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS86);

							}
							break;

					}

					alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_tableSource1156); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(alias);

					}
					break;

			}

			// AST REWRITE
			// elements: props, ts, tabname, alias, ic
			// token labels: alias
			// rule labels: ic, retval, ts, tabname, props
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
			RewriteRuleSubtreeStream stream_ic=new RewriteRuleSubtreeStream(adaptor,"rule ic",ic!=null?ic.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.getTree():null);
			RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.getTree():null);
			RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 180:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $ic)? ( $alias)? )
			{
				// FromClauseParser.g:180:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $ic)? ( $alias)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABREF, "TOK_TABREF"), root_1);
				adaptor.addChild(root_1, stream_tabname.nextTree());
				// FromClauseParser.g:180:31: ( $props)?
				if ( stream_props.hasNext() ) {
					adaptor.addChild(root_1, stream_props.nextTree());
				}
				stream_props.reset();

				// FromClauseParser.g:180:39: ( $ts)?
				if ( stream_ts.hasNext() ) {
					adaptor.addChild(root_1, stream_ts.nextTree());
				}
				stream_ts.reset();

				// FromClauseParser.g:180:45: ( $ic)?
				if ( stream_ic.hasNext() ) {
					adaptor.addChild(root_1, stream_ic.nextTree());
				}
				stream_ic.reset();

				// FromClauseParser.g:180:50: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextNode());
				}
				stream_alias.reset();

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
	// $ANTLR end "tableSource"


	public static class tableName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableName"
	// FromClauseParser.g:183:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );
	public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
		HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOT87=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope tab =null;

		CommonTree DOT87_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("table name"); 
		try {
			// FromClauseParser.g:186:5: (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) )
			int alt31=2;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// FromClauseParser.g:187:5: db= identifier DOT tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1221);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT87=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1223); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT87);

					pushFollow(FOLLOW_identifier_in_tableName1227);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: db, tab
					// token labels: 
					// rule labels: db, retval, tab
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 188:5: -> ^( TOK_TABNAME $db $tab)
					{
						// FromClauseParser.g:188:8: ^( TOK_TABNAME $db $tab)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_db.nextTree());
						adaptor.addChild(root_1, stream_tab.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:190:5: tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1257);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: tab
					// token labels: 
					// rule labels: retval, tab
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 191:5: -> ^( TOK_TABNAME $tab)
					{
						// FromClauseParser.g:191:8: ^( TOK_TABNAME $tab)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_tab.nextTree());
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
	// $ANTLR end "tableName"


	public static class viewName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "viewName"
	// FromClauseParser.g:194:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
	public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
		HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOT88=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope view =null;

		CommonTree DOT88_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("view name"); 
		try {
			// FromClauseParser.g:197:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
			// FromClauseParser.g:198:5: (db= identifier DOT )? view= identifier
			{
			// FromClauseParser.g:198:5: (db= identifier DOT )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Identifier) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==DOT) ) {
					alt32=1;
				}
			}
			else if ( ((LA32_0 >= KW_ADD && LA32_0 <= KW_AFTER)||(LA32_0 >= KW_ALTER && LA32_0 <= KW_ANALYZE)||(LA32_0 >= KW_ARCHIVE && LA32_0 <= KW_CASCADE)||(LA32_0 >= KW_CHANGE && LA32_0 <= KW_COLLECTION)||(LA32_0 >= KW_COLUMNS && LA32_0 <= KW_CREATE)||LA32_0==KW_CUBE||(LA32_0 >= KW_CURSOR && LA32_0 <= KW_DATA)||(LA32_0 >= KW_DATABASES && LA32_0 <= KW_DISABLE)||(LA32_0 >= KW_DISTRIBUTE && LA32_0 <= KW_DROP)||LA32_0==KW_ELEM_TYPE||LA32_0==KW_ENABLE||LA32_0==KW_ESCAPED||(LA32_0 >= KW_EXCLUSIVE && LA32_0 <= KW_EXPORT)||(LA32_0 >= KW_EXTERNAL && LA32_0 <= KW_FLOAT)||(LA32_0 >= KW_FOR && LA32_0 <= KW_FORMATTED)||LA32_0==KW_FULL||(LA32_0 >= KW_FUNCTIONS && LA32_0 <= KW_GROUPING)||(LA32_0 >= KW_HOLD_DDLTIME && LA32_0 <= KW_IDXPROPERTIES)||(LA32_0 >= KW_IGNORE && LA32_0 <= KW_INCRE)||(LA32_0 >= KW_INDEX && LA32_0 <= KW_ITEMS)||(LA32_0 >= KW_KEYS && LA32_0 <= KW_LEFT)||(LA32_0 >= KW_LIKE && LA32_0 <= KW_LONG)||(LA32_0 >= KW_MAPJOIN && LA32_0 <= KW_MINUS)||(LA32_0 >= KW_MSCK && LA32_0 <= KW_NOSCAN)||(LA32_0 >= KW_NO_DROP && LA32_0 <= KW_OFFLINE)||LA32_0==KW_OPTION||(LA32_0 >= KW_ORCFILE && LA32_0 <= KW_OUTPUTFORMAT)||LA32_0==KW_OVERWRITE||(LA32_0 >= KW_PARTITION && LA32_0 <= KW_PLUS)||(LA32_0 >= KW_PRETTY && LA32_0 <= KW_RECORDWRITER)||(LA32_0 >= KW_REGEXP && LA32_0 <= KW_SCHEMAS)||(LA32_0 >= KW_SEMI && LA32_0 <= KW_TABLES)||(LA32_0 >= KW_TBLPROPERTIES && LA32_0 <= KW_TEXTFILE)||(LA32_0 >= KW_TIMESTAMP && LA32_0 <= KW_TOUCH)||(LA32_0 >= KW_TRIGGER && LA32_0 <= KW_UNARCHIVE)||(LA32_0 >= KW_UNDO && LA32_0 <= KW_UNIONTYPE)||(LA32_0 >= KW_UNLOCK && LA32_0 <= KW_VALUE_TYPE)||LA32_0==KW_VIEW||LA32_0==KW_WHILE||LA32_0==KW_WITH) ) {
				int LA32_2 = input.LA(2);
				if ( (LA32_2==DOT) ) {
					alt32=1;
				}
			}
			switch (alt32) {
				case 1 :
					// FromClauseParser.g:198:6: db= identifier DOT
					{
					pushFollow(FOLLOW_identifier_in_viewName1304);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT88=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1306); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT88);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_viewName1312);
			view=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(view.getTree());
			// AST REWRITE
			// elements: db, view
			// token labels: 
			// rule labels: db, retval, view
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 199:5: -> ^( TOK_TABNAME ( $db)? $view)
			{
				// FromClauseParser.g:199:8: ^( TOK_TABNAME ( $db)? $view)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
				// FromClauseParser.g:199:23: ( $db)?
				if ( stream_db.hasNext() ) {
					adaptor.addChild(root_1, stream_db.nextTree());
				}
				stream_db.reset();

				adaptor.addChild(root_1, stream_view.nextTree());
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
	// $ANTLR end "viewName"


	public static class subQuerySource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subQuerySource"
	// FromClauseParser.g:202:1: subQuerySource : LPAREN queryStatementExpression RPAREN identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
	public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
		HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN89=null;
		Token RPAREN91=null;
		ParserRuleReturnScope queryStatementExpression90 =null;
		ParserRuleReturnScope identifier92 =null;

		CommonTree LPAREN89_tree=null;
		CommonTree RPAREN91_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");

		 gParent.msgs.push("subquery source"); 
		try {
			// FromClauseParser.g:205:5: ( LPAREN queryStatementExpression RPAREN identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
			// FromClauseParser.g:206:5: LPAREN queryStatementExpression RPAREN identifier
			{
			LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1360); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);

			pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1362);
			queryStatementExpression90=gHiveParser.queryStatementExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression90.getTree());
			RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1364); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);

			pushFollow(FOLLOW_identifier_in_subQuerySource1366);
			identifier92=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier92.getTree());
			// AST REWRITE
			// elements: identifier, queryStatementExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 206:55: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
			{
				// FromClauseParser.g:206:58: ^( TOK_SUBQUERY queryStatementExpression identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_1);
				adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());
				adaptor.addChild(root_1, stream_identifier.nextTree());
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
	// $ANTLR end "subQuerySource"


	public static class partitioningSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitioningSpec"
	// FromClauseParser.g:210:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
	public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
		HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope partitionByClause93 =null;
		ParserRuleReturnScope orderByClause94 =null;
		ParserRuleReturnScope orderByClause95 =null;
		ParserRuleReturnScope distributeByClause96 =null;
		ParserRuleReturnScope sortByClause97 =null;
		ParserRuleReturnScope sortByClause98 =null;
		ParserRuleReturnScope clusterByClause99 =null;

		RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
		RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
		RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
		RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
		RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");

		 gParent.msgs.push("partitioningSpec clause"); 
		try {
			// FromClauseParser.g:213:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
			int alt35=5;
			switch ( input.LA(1) ) {
			case KW_PARTITION:
				{
				alt35=1;
				}
				break;
			case KW_ORDER:
				{
				alt35=2;
				}
				break;
			case KW_DISTRIBUTE:
				{
				alt35=3;
				}
				break;
			case KW_SORT:
				{
				alt35=4;
				}
				break;
			case KW_CLUSTER:
				{
				alt35=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// FromClauseParser.g:214:4: partitionByClause ( orderByClause )?
					{
					pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1407);
					partitionByClause93=gHiveParser.partitionByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause93.getTree());
					// FromClauseParser.g:214:22: ( orderByClause )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==KW_ORDER) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// FromClauseParser.g:214:22: orderByClause
							{
							pushFollow(FOLLOW_orderByClause_in_partitioningSpec1409);
							orderByClause94=gHiveParser.orderByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause94.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: orderByClause, partitionByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 214:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
					{
						// FromClauseParser.g:214:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_partitionByClause.nextTree());
						// FromClauseParser.g:214:81: ( orderByClause )?
						if ( stream_orderByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_orderByClause.nextTree());
						}
						stream_orderByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:215:4: orderByClause
					{
					pushFollow(FOLLOW_orderByClause_in_partitioningSpec1428);
					orderByClause95=gHiveParser.orderByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause95.getTree());
					// AST REWRITE
					// elements: orderByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 215:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
					{
						// FromClauseParser.g:215:21: ^( TOK_PARTITIONINGSPEC orderByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_orderByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:216:4: distributeByClause ( sortByClause )?
					{
					pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1443);
					distributeByClause96=gHiveParser.distributeByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause96.getTree());
					// FromClauseParser.g:216:23: ( sortByClause )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==KW_SORT) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// FromClauseParser.g:216:23: sortByClause
							{
							pushFollow(FOLLOW_sortByClause_in_partitioningSpec1445);
							sortByClause97=gHiveParser.sortByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause97.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: sortByClause, distributeByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 216:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
					{
						// FromClauseParser.g:216:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_distributeByClause.nextTree());
						// FromClauseParser.g:216:82: ( sortByClause )?
						if ( stream_sortByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_sortByClause.nextTree());
						}
						stream_sortByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:217:4: sortByClause
					{
					pushFollow(FOLLOW_sortByClause_in_partitioningSpec1464);
					sortByClause98=gHiveParser.sortByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause98.getTree());
					// AST REWRITE
					// elements: sortByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 217:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
					{
						// FromClauseParser.g:217:20: ^( TOK_PARTITIONINGSPEC sortByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_sortByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:218:4: clusterByClause
					{
					pushFollow(FOLLOW_clusterByClause_in_partitioningSpec1479);
					clusterByClause99=gHiveParser.clusterByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause99.getTree());
					// AST REWRITE
					// elements: clusterByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 218:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
					{
						// FromClauseParser.g:218:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_clusterByClause.nextTree());
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
	// $ANTLR end "partitioningSpec"


	public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionTableFunctionSource"
	// FromClauseParser.g:221:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
	public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
		HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope subQuerySource100 =null;
		ParserRuleReturnScope tableSource101 =null;
		ParserRuleReturnScope partitionedTableFunction102 =null;


		 gParent.msgs.push("partitionTableFunctionSource clause"); 
		try {
			// FromClauseParser.g:224:4: ( subQuerySource | tableSource | partitionedTableFunction )
			int alt36=3;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt36=1;
				}
				break;
			case Identifier:
				{
				int LA36_2 = input.LA(2);
				if ( (LA36_2==LPAREN) ) {
					int LA36_4 = input.LA(3);
					if ( (LA36_4==KW_ON) ) {
						alt36=3;
					}
					else if ( (LA36_4==StringLiteral) ) {
						alt36=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 36, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA36_2==DIVIDE||LA36_2==DOT||LA36_2==Identifier||LA36_2==KW_AS||LA36_2==KW_CLUSTER||LA36_2==KW_DISTRIBUTE||LA36_2==KW_ORDER||LA36_2==KW_PARTITION||LA36_2==KW_SORT||LA36_2==KW_TABLESAMPLE||LA36_2==RPAREN) ) {
					alt36=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_ADD:
			case KW_AFTER:
			case KW_ALTER:
			case KW_ANALYZE:
			case KW_ARCHIVE:
			case KW_ARRAY:
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
			case KW_STRUCT:
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
			case KW_UNIONTYPE:
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
				alt36=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// FromClauseParser.g:225:4: subQuerySource
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource1516);
					subQuerySource100=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource100.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:226:4: tableSource
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource1523);
					tableSource101=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource101.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:227:4: partitionedTableFunction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1530);
					partitionedTableFunction102=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction102.getTree());

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
	// $ANTLR end "partitionTableFunctionSource"


	public static class partitionedTableFunction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionedTableFunction"
	// FromClauseParser.g:230:1: partitionedTableFunction : name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* ) ;
	public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
		HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token alias=null;
		Token LPAREN103=null;
		Token KW_ON104=null;
		Token Identifier106=null;
		Token LPAREN107=null;
		Token RPAREN109=null;
		Token COMMA110=null;
		Token Identifier111=null;
		Token LPAREN112=null;
		Token RPAREN114=null;
		Token RPAREN115=null;
		ParserRuleReturnScope ptfsrc =null;
		ParserRuleReturnScope partitioningSpec105 =null;
		ParserRuleReturnScope expression108 =null;
		ParserRuleReturnScope expression113 =null;

		CommonTree name_tree=null;
		CommonTree alias_tree=null;
		CommonTree LPAREN103_tree=null;
		CommonTree KW_ON104_tree=null;
		CommonTree Identifier106_tree=null;
		CommonTree LPAREN107_tree=null;
		CommonTree RPAREN109_tree=null;
		CommonTree COMMA110_tree=null;
		CommonTree Identifier111_tree=null;
		CommonTree LPAREN112_tree=null;
		CommonTree RPAREN114_tree=null;
		CommonTree RPAREN115_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");

		 gParent.msgs.push("ptf clause"); 
		try {
			// FromClauseParser.g:233:4: (name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* ) )
			// FromClauseParser.g:234:4: name= Identifier LPAREN KW_ON ptfsrc= partitionTableFunctionSource ( partitioningSpec )? ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? RPAREN (alias= Identifier )?
			{
			name=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1561); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(name);

			LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1566); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);

			KW_ON104=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction1568); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON104);

			pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1572);
			ptfsrc=partitionTableFunctionSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());
			// FromClauseParser.g:235:53: ( partitioningSpec )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==KW_CLUSTER||LA37_0==KW_DISTRIBUTE||LA37_0==KW_ORDER||LA37_0==KW_PARTITION||LA37_0==KW_SORT) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// FromClauseParser.g:235:53: partitioningSpec
					{
					pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction1574);
					partitioningSpec105=partitioningSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitioningSpec.add(partitioningSpec105.getTree());
					}
					break;

			}

			// FromClauseParser.g:236:6: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Identifier) && (synpred2_FromClauseParser())) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// FromClauseParser.g:236:7: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
					{
					Identifier106=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1596); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier106);

					LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1598); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN107);

					pushFollow(FOLLOW_expression_in_partitionedTableFunction1600);
					expression108=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression108.getTree());
					RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN109);

					// FromClauseParser.g:236:85: ( COMMA Identifier LPAREN expression RPAREN )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==COMMA) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// FromClauseParser.g:236:87: COMMA Identifier LPAREN expression RPAREN
							{
							COMMA110=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction1606); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA110);

							Identifier111=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1608); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier111);

							LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1610); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN112);

							pushFollow(FOLLOW_expression_in_partitionedTableFunction1612);
							expression113=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression113.getTree());
							RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1614); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN114);

							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1624); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN115);

			// FromClauseParser.g:237:16: (alias= Identifier )?
			int alt40=2;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// FromClauseParser.g:237:16: alias= Identifier
					{
					alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1628); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(alias);

					}
					break;

			}

			// AST REWRITE
			// elements: partitioningSpec, name, partitionTableFunctionSource, expression, alias
			// token labels: alias, name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 238:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* )
			{
				// FromClauseParser.g:238:9: ^( TOK_PTBLFUNCTION $name ( $alias)? partitionTableFunctionSource ( partitioningSpec )? ( expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// FromClauseParser.g:238:35: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextNode());
				}
				stream_alias.reset();

				adaptor.addChild(root_1, stream_partitionTableFunctionSource.nextTree());
				// FromClauseParser.g:238:71: ( partitioningSpec )?
				if ( stream_partitioningSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitioningSpec.nextTree());
				}
				stream_partitioningSpec.reset();

				// FromClauseParser.g:238:89: ( expression )*
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
	// $ANTLR end "partitionedTableFunction"


	public static class whereClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whereClause"
	// FromClauseParser.g:243:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
	public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
		HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_WHERE116=null;
		ParserRuleReturnScope searchCondition117 =null;

		CommonTree KW_WHERE116_tree=null;
		RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
		RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");

		 gParent.msgs.push("where clause"); 
		try {
			// FromClauseParser.g:246:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
			// FromClauseParser.g:247:5: KW_WHERE searchCondition
			{
			KW_WHERE116=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause1688); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE116);

			pushFollow(FOLLOW_searchCondition_in_whereClause1690);
			searchCondition117=searchCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition117.getTree());
			// AST REWRITE
			// elements: searchCondition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 247:30: -> ^( TOK_WHERE searchCondition )
			{
				// FromClauseParser.g:247:33: ^( TOK_WHERE searchCondition )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WHERE, "TOK_WHERE"), root_1);
				adaptor.addChild(root_1, stream_searchCondition.nextTree());
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
	// $ANTLR end "whereClause"


	public static class searchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searchCondition"
	// FromClauseParser.g:250:1: searchCondition : expression ;
	public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
		HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression118 =null;


		 gParent.msgs.push("search condition"); 
		try {
			// FromClauseParser.g:253:5: ( expression )
			// FromClauseParser.g:254:5: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_searchCondition1729);
			expression118=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

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
	// $ANTLR end "searchCondition"

	// $ANTLR start synpred1_FromClauseParser
	public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:146:6: ( Identifier LPAREN )
		// FromClauseParser.g:146:7: Identifier LPAREN
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred1_FromClauseParser832); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_FromClauseParser834); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_FromClauseParser

	// $ANTLR start synpred2_FromClauseParser
	public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:236:7: ( Identifier LPAREN expression RPAREN )
		// FromClauseParser.g:236:8: Identifier LPAREN expression RPAREN
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred2_FromClauseParser1584); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_FromClauseParser1586); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred2_FromClauseParser1588);
		gHiveParser.expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred2_FromClauseParser1590); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_FromClauseParser

	// Delegated rules

	public final boolean synpred2_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA19 dfa19 = new DFA19(this);
	protected DFA26 dfa26 = new DFA26(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA40 dfa40 = new DFA40(this);
	static final String DFA19_eotS =
		"\100\uffff";
	static final String DFA19_eofS =
		"\1\uffff\1\2\76\uffff";
	static final String DFA19_minS =
		"\1\u008f\1\23\2\uffff\1\11\73\uffff";
	static final String DFA19_maxS =
		"\1\u018a\1\u019b\2\uffff\1\u044e\73\uffff";
	static final String DFA19_acceptS =
		"\2\uffff\1\2\1\3\36\uffff\1\1\35\uffff";
	static final String DFA19_specialS =
		"\4\uffff\1\0\73\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\3\uffff\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5"+
			"\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\3\uffff"+
			"\1\3",
			"\1\2\1\uffff\1\2\171\uffff\1\2\13\uffff\1\2\16\uffff\1\2\12\uffff\1"+
			"\2\24\uffff\1\2\33\uffff\1\2\3\uffff\1\2\1\uffff\1\2\12\uffff\1\2\3\uffff"+
			"\1\2\5\uffff\1\2\2\uffff\2\2\2\uffff\1\2\11\uffff\1\2\13\uffff\1\2\3"+
			"\uffff\1\2\32\uffff\1\2\6\uffff\1\2\7\uffff\1\2\13\uffff\1\2\11\uffff"+
			"\1\2\20\uffff\1\2\17\uffff\1\2\1\uffff\1\2\4\uffff\1\4\20\uffff\1\2",
			"",
			"",
			"\1\2\5\uffff\1\2\6\uffff\1\2\170\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1"+
			"\uffff\25\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff"+
			"\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\14\2\1\uffff\4\2\1\uffff"+
			"\12\2\1\uffff\4\2\1\uffff\7\2\1\42\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff"+
			"\5\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1"+
			"\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1"+
			"\2\3\uffff\1\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\12\uffff\2\2\1\uffff"+
			"\1\2\4\uffff\1\2\21\uffff\1\2\5\uffff\1\2\u0160\uffff\2\2\6\uffff\1\2"+
			"\u0121\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "146:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_4 = input.LA(1);
						 
						int index19_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_4==KW_ON) && (synpred1_FromClauseParser())) {s = 34;}
						else if ( (LA19_4==BigintLiteral||LA19_4==CharSetName||LA19_4==DecimalLiteral||LA19_4==Identifier||(LA19_4 >= KW_ADD && LA19_4 <= KW_AFTER)||(LA19_4 >= KW_ALTER && LA19_4 <= KW_ANALYZE)||(LA19_4 >= KW_ARCHIVE && LA19_4 <= KW_COLLECTION)||(LA19_4 >= KW_COLUMNS && LA19_4 <= KW_CREATE)||LA19_4==KW_CUBE||(LA19_4 >= KW_CURSOR && LA19_4 <= KW_DATA)||(LA19_4 >= KW_DATABASES && LA19_4 <= KW_DISABLE)||(LA19_4 >= KW_DISTRIBUTE && LA19_4 <= KW_DROP)||LA19_4==KW_ELEM_TYPE||LA19_4==KW_ENABLE||LA19_4==KW_ESCAPED||(LA19_4 >= KW_EXCLUSIVE && LA19_4 <= KW_EXPORT)||(LA19_4 >= KW_EXTERNAL && LA19_4 <= KW_FLOAT)||(LA19_4 >= KW_FOR && LA19_4 <= KW_FORMATTED)||LA19_4==KW_FULL||(LA19_4 >= KW_FUNCTIONS && LA19_4 <= KW_GROUPING)||(LA19_4 >= KW_HOLD_DDLTIME && LA19_4 <= KW_INCRE)||(LA19_4 >= KW_INDEX && LA19_4 <= KW_ITEMS)||(LA19_4 >= KW_KEYS && LA19_4 <= KW_LEFT)||(LA19_4 >= KW_LIKE && LA19_4 <= KW_LONG)||(LA19_4 >= KW_MAP && LA19_4 <= KW_MINUS)||(LA19_4 >= KW_MSCK && LA19_4 <= KW_OFFLINE)||LA19_4==KW_OPTION||(LA19_4 >= KW_ORCFILE && LA19_4 <= KW_OUTPUTFORMAT)||LA19_4==KW_OVERWRITE||(LA19_4 >= KW_PARTITION && LA19_4 <= KW_PLUS)||(LA19_4 >= KW_PRETTY && LA19_4 <= KW_RECORDWRITER)||(LA19_4 >= KW_REGEXP && LA19_4 <= KW_SCHEMAS)||(LA19_4 >= KW_SEMI && LA19_4 <= KW_TABLES)||(LA19_4 >= KW_TBLPROPERTIES && LA19_4 <= KW_TEXTFILE)||(LA19_4 >= KW_TIMESTAMP && LA19_4 <= KW_TOUCH)||(LA19_4 >= KW_TRIGGER && LA19_4 <= KW_UNARCHIVE)||(LA19_4 >= KW_UNDO && LA19_4 <= KW_UNIONTYPE)||(LA19_4 >= KW_UNLOCK && LA19_4 <= KW_VALUE_TYPE)||LA19_4==KW_VIEW||LA19_4==KW_WHILE||LA19_4==KW_WITH||LA19_4==LPAREN||LA19_4==MINUS||LA19_4==Number||LA19_4==PLUS||(LA19_4 >= SmallintLiteral && LA19_4 <= StringLiteral)||LA19_4==TILDE||LA19_4==TinyintLiteral||LA19_4==Day||LA19_4==Hour||(LA19_4 >= Minute && LA19_4 <= Month)||LA19_4==Second||LA19_4==Year) ) {s = 2;}
						 
						input.seek(index19_4);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA26_eotS =
		"\124\uffff";
	static final String DFA26_eofS =
		"\1\2\123\uffff";
	static final String DFA26_minS =
		"\1\23\1\11\35\uffff\1\4\64\uffff";
	static final String DFA26_maxS =
		"\1\u019b\1\u044e\35\uffff\1\u01a4\64\uffff";
	static final String DFA26_acceptS =
		"\2\uffff\1\2\71\uffff\3\1\25\uffff";
	static final String DFA26_specialS =
		"\124\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\2\173\uffff\1\2\13\uffff\1\2\16\uffff\1\2\12\uffff\1\2\24\uffff\1"+
			"\2\33\uffff\1\2\3\uffff\1\2\1\uffff\1\2\12\uffff\1\2\3\uffff\1\2\5\uffff"+
			"\1\2\2\uffff\2\2\2\uffff\1\2\11\uffff\1\2\13\uffff\1\2\3\uffff\1\2\7"+
			"\uffff\1\2\22\uffff\1\2\6\uffff\1\2\7\uffff\1\2\13\uffff\1\2\11\uffff"+
			"\1\2\20\uffff\1\2\17\uffff\1\2\1\uffff\1\2\4\uffff\1\1\20\uffff\1\2",
			"\1\2\5\uffff\1\2\6\uffff\1\2\170\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1"+
			"\uffff\25\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff"+
			"\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff"+
			"\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\14\2\1\uffff\4\2\1\uffff"+
			"\12\2\1\uffff\4\2\1\uffff\7\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff"+
			"\5\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1"+
			"\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1"+
			"\2\3\uffff\1\2\4\uffff\1\2\6\uffff\1\2\1\uffff\1\2\12\uffff\1\2\1\37"+
			"\1\uffff\1\2\4\uffff\1\2\21\uffff\1\2\5\uffff\1\2\u0160\uffff\2\2\6\uffff"+
			"\1\2\u0121\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\2\2\uffff\2\2\3\uffff\1\75\5\uffff\2\2\1\uffff\1\2\2\uffff\1\74\1"+
			"\2\3\uffff\2\2\171\uffff\1\2\5\uffff\1\2\123\uffff\1\2\14\uffff\1\2\7"+
			"\uffff\1\2\21\uffff\1\2\6\uffff\1\2\35\uffff\1\2\6\uffff\1\2\102\uffff"+
			"\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\2\uffff"+
			"\1\76\5\uffff\1\2\2\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "179:25: (props= tableProperties )?";
		}
	}

	static final String DFA30_eotS =
		"\125\uffff";
	static final String DFA30_eofS =
		"\1\3\1\uffff\1\1\122\uffff";
	static final String DFA30_minS =
		"\1\u008f\1\uffff\1\u008f\32\uffff\1\11\67\uffff";
	static final String DFA30_maxS =
		"\1\u019b\1\uffff\1\u019b\32\uffff\1\u044e\67\uffff";
	static final String DFA30_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\64\uffff\35\1";
	static final String DFA30_specialS =
		"\125\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\2\13\uffff\1\1\16\uffff\1\3\12\uffff\1\3\24\uffff\1\3\33\uffff\1\3"+
			"\3\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\5\uffff\1\3\2\uffff"+
			"\2\3\2\uffff\1\3\11\uffff\1\3\13\uffff\1\3\3\uffff\1\3\7\uffff\1\3\22"+
			"\uffff\1\3\6\uffff\1\3\7\uffff\1\3\13\uffff\1\3\32\uffff\1\3\17\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\20\uffff\1\3",
			"",
			"\1\1\32\uffff\1\1\12\uffff\1\1\24\uffff\1\1\33\uffff\1\1\3\uffff\1\1"+
			"\1\uffff\1\1\12\uffff\1\1\3\uffff\1\1\5\uffff\1\1\2\uffff\2\1\2\uffff"+
			"\1\1\11\uffff\1\1\13\uffff\1\1\3\uffff\1\1\7\uffff\1\1\22\uffff\1\1\6"+
			"\uffff\1\1\7\uffff\1\1\13\uffff\1\1\32\uffff\1\1\17\uffff\1\1\1\uffff"+
			"\1\1\4\uffff\1\35\20\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\104\5\uffff\1\110\6\uffff\1\107\170\uffff\1\120\3\uffff\2\121\1\uffff"+
			"\2\121\1\uffff\1\121\1\114\14\121\1\123\1\122\5\121\1\uffff\6\121\1\uffff"+
			"\1\121\1\uffff\2\121\1\uffff\1\121\1\73\14\121\1\uffff\3\121\2\uffff"+
			"\1\121\1\uffff\1\121\1\uffff\1\121\1\uffff\4\121\1\uffff\1\121\1\112"+
			"\5\121\1\uffff\3\121\1\uffff\1\121\1\uffff\4\121\1\uffff\2\121\1\113"+
			"\4\121\1\uffff\14\121\1\uffff\4\121\1\uffff\12\121\1\uffff\1\115\3\121"+
			"\1\uffff\2\121\1\70\1\121\1\72\2\121\1\uffff\1\121\1\uffff\6\121\1\uffff"+
			"\1\121\1\uffff\5\121\2\uffff\14\121\1\uffff\16\121\1\uffff\22\121\1\116"+
			"\2\121\1\uffff\4\121\1\uffff\4\121\1\uffff\1\121\1\111\2\121\1\uffff"+
			"\2\121\1\117\1\uffff\12\121\1\uffff\1\121\2\uffff\1\121\1\uffff\1\121"+
			"\3\uffff\1\124\4\uffff\1\71\6\uffff\1\74\1\uffff\1\71\12\uffff\1\105"+
			"\1\103\1\uffff\1\71\4\uffff\1\106\21\uffff\1\77\5\uffff\1\100\u0160\uffff"+
			"\1\101\1\76\6\uffff\1\102\u0121\uffff\1\75",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "179:91: ( ( KW_AS )? alias= Identifier )?";
		}
	}

	static final String DFA31_eotS =
		"\147\uffff";
	static final String DFA31_eofS =
		"\1\uffff\2\4\144\uffff";
	static final String DFA31_minS =
		"\1\u008f\2\23\1\u008f\56\uffff\1\u008f\64\uffff";
	static final String DFA31_maxS =
		"\1\u0186\2\u019b\1\u01a1\56\uffff\1\u01a1\64\uffff";
	static final String DFA31_acceptS =
		"\4\uffff\1\2\135\uffff\1\1\4\uffff";
	static final String DFA31_specialS =
		"\147\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\1\3\uffff\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5"+
			"\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\4\1\uffff\1\3\171\uffff\1\4\13\uffff\1\4\16\uffff\2\4\4\uffff\2\4"+
			"\3\uffff\1\4\24\uffff\1\4\11\uffff\2\4\17\uffff\2\4\3\uffff\1\4\1\uffff"+
			"\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\4\2\uffff"+
			"\2\4\1\uffff\2\4\3\uffff\1\4\5\uffff\1\4\13\uffff\1\4\3\uffff\1\4\7\uffff"+
			"\2\4\21\uffff\1\4\6\uffff\1\4\3\uffff\1\4\3\uffff\1\4\6\uffff\1\4\2\uffff"+
			"\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\2\4\6\uffff\1\4\10\uffff\1\4\17"+
			"\uffff\1\4\1\uffff\1\4\4\uffff\1\4\20\uffff\1\4",
			"\1\4\1\uffff\1\62\171\uffff\1\4\13\uffff\1\4\16\uffff\2\4\4\uffff\2"+
			"\4\3\uffff\1\4\24\uffff\1\4\11\uffff\2\4\17\uffff\2\4\3\uffff\1\4\1\uffff"+
			"\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\4\3\uffff\1\4\5\uffff\1\4\2\uffff"+
			"\2\4\1\uffff\2\4\3\uffff\1\4\5\uffff\1\4\13\uffff\1\4\3\uffff\1\4\7\uffff"+
			"\2\4\21\uffff\1\4\6\uffff\1\4\3\uffff\1\4\3\uffff\1\4\6\uffff\1\4\2\uffff"+
			"\1\4\1\uffff\1\4\3\uffff\1\4\5\uffff\2\4\6\uffff\1\4\10\uffff\1\4\17"+
			"\uffff\1\4\1\uffff\1\4\4\uffff\1\4\20\uffff\1\4",
			"\1\142\3\uffff\2\142\1\uffff\2\142\1\uffff\16\142\2\uffff\5\142\1\uffff"+
			"\6\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\1\uffff\3\142\2\uffff"+
			"\1\142\1\uffff\1\142\1\uffff\1\142\1\uffff\4\142\1\uffff\7\142\1\uffff"+
			"\3\142\1\uffff\1\142\1\uffff\4\142\1\uffff\2\142\1\uffff\4\142\1\uffff"+
			"\14\142\1\uffff\4\142\1\uffff\12\142\2\uffff\3\142\1\uffff\2\142\1\uffff"+
			"\4\142\1\uffff\1\142\1\uffff\6\142\1\uffff\1\142\1\uffff\5\142\2\uffff"+
			"\14\142\1\uffff\16\142\1\uffff\25\142\1\uffff\4\142\1\uffff\4\142\1\uffff"+
			"\4\142\1\uffff\3\142\1\uffff\12\142\1\uffff\1\142\2\uffff\1\142\1\uffff"+
			"\1\142\32\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142\3\uffff\2\142\1\uffff\2\142\1\uffff\16\142\2\uffff\5\142\1\uffff"+
			"\6\142\1\uffff\1\142\1\uffff\2\142\1\uffff\16\142\1\uffff\3\142\2\uffff"+
			"\1\142\1\uffff\1\142\1\uffff\1\142\1\uffff\4\142\1\uffff\7\142\1\uffff"+
			"\3\142\1\uffff\1\142\1\uffff\4\142\1\uffff\2\142\1\uffff\4\142\1\uffff"+
			"\14\142\1\uffff\4\142\1\uffff\12\142\2\uffff\3\142\1\uffff\2\142\1\uffff"+
			"\4\142\1\uffff\1\142\1\uffff\6\142\1\uffff\1\142\1\uffff\5\142\2\uffff"+
			"\14\142\1\uffff\16\142\1\uffff\25\142\1\uffff\4\142\1\uffff\4\142\1\uffff"+
			"\4\142\1\uffff\3\142\1\uffff\12\142\1\uffff\1\142\2\uffff\1\142\1\uffff"+
			"\1\142\32\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "183:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );";
		}
	}

	static final String DFA40_eotS =
		"\124\uffff";
	static final String DFA40_eofS =
		"\1\2\1\35\122\uffff";
	static final String DFA40_minS =
		"\2\u008f\32\uffff\1\11\67\uffff";
	static final String DFA40_maxS =
		"\2\u019b\32\uffff\1\u044e\67\uffff";
	static final String DFA40_acceptS =
		"\2\uffff\1\2\32\uffff\1\1\31\uffff\35\1";
	static final String DFA40_specialS =
		"\124\uffff}>";
	static final String[] DFA40_transitionS = {
			"\1\1\32\uffff\1\2\12\uffff\1\2\24\uffff\1\2\33\uffff\1\2\3\uffff\1\2"+
			"\1\uffff\1\2\12\uffff\1\2\3\uffff\1\2\5\uffff\1\2\2\uffff\2\2\2\uffff"+
			"\1\2\11\uffff\1\2\13\uffff\1\2\3\uffff\1\2\7\uffff\1\2\22\uffff\1\2\6"+
			"\uffff\1\2\7\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2\1\uffff"+
			"\1\2\4\uffff\1\2\20\uffff\1\2",
			"\1\35\32\uffff\1\35\12\uffff\1\35\24\uffff\1\35\33\uffff\1\35\3\uffff"+
			"\1\35\1\uffff\1\35\12\uffff\1\35\3\uffff\1\35\5\uffff\1\35\2\uffff\2"+
			"\35\2\uffff\1\35\11\uffff\1\35\13\uffff\1\35\3\uffff\1\35\7\uffff\1\35"+
			"\22\uffff\1\35\6\uffff\1\35\7\uffff\1\35\13\uffff\1\35\32\uffff\1\35"+
			"\17\uffff\1\35\1\uffff\1\35\4\uffff\1\34\20\uffff\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\103\5\uffff\1\107\6\uffff\1\106\170\uffff\1\117\3\uffff\2\120\1\uffff"+
			"\2\120\1\uffff\1\120\1\113\14\120\1\122\1\121\5\120\1\uffff\6\120\1\uffff"+
			"\1\120\1\uffff\2\120\1\uffff\1\120\1\72\14\120\1\uffff\3\120\2\uffff"+
			"\1\120\1\uffff\1\120\1\uffff\1\120\1\uffff\4\120\1\uffff\1\120\1\111"+
			"\5\120\1\uffff\3\120\1\uffff\1\120\1\uffff\4\120\1\uffff\2\120\1\112"+
			"\4\120\1\uffff\14\120\1\uffff\4\120\1\uffff\12\120\1\uffff\1\114\3\120"+
			"\1\uffff\2\120\1\67\1\120\1\71\2\120\1\uffff\1\120\1\uffff\6\120\1\uffff"+
			"\1\120\1\uffff\5\120\2\uffff\14\120\1\uffff\16\120\1\uffff\22\120\1\115"+
			"\2\120\1\uffff\4\120\1\uffff\4\120\1\uffff\1\120\1\110\2\120\1\uffff"+
			"\2\120\1\116\1\uffff\12\120\1\uffff\1\120\2\uffff\1\120\1\uffff\1\120"+
			"\3\uffff\1\123\4\uffff\1\70\6\uffff\1\73\1\uffff\1\70\12\uffff\1\104"+
			"\1\102\1\uffff\1\70\4\uffff\1\105\21\uffff\1\76\5\uffff\1\77\u0160\uffff"+
			"\1\100\1\75\6\uffff\1\101\u0121\uffff\1\74",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "237:16: (alias= Identifier )?";
		}
	}

	public static final BitSet FOLLOW_STAR_in_tableAllColumns57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableAllColumns79 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DOT_in_tableAllColumns81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_tableAllColumns83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableOrColumn131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList170 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList173 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_expressionList175 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_identifier_in_aliasList217 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_aliasList220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_aliasList222 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_FROM_in_fromClause266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFFDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_joinSource_in_fromClause268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fromSource_in_joinSource303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L,0x0080004000000000L,0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_joinToken_in_joinSource307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_fromSource_in_joinSource310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L,0x0080004000000000L,0x0000000040000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_ON_in_joinSource313 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_joinSource316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L,0x0080004000000000L,0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_uniqueJoinToken_in_joinSource329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFF7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource332 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_joinSource335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFF7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource338 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_fromSource_in_uniqueJoinSource370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr399 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_uniqueJoinExpr403 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_uniqueJoinExpr406 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_uniqueJoinExpr410 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INNER_in_joinToken522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CROSS_in_joinToken548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000002L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RIGHT_in_joinToken594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000002L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FULL_in_joinToken613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000002L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_KW_SEMI_in_joinToken635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_lateralView675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_function_in_lateralView677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView679 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_lateralView684 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_lateralView687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_lateralView689 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_function_in_lateralView725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_lateralView732 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_lateralView735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_lateralView737 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_identifier_in_tableAlias791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_fromSource838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_tableSource_in_fromSource842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_subQuerySource_in_fromSource846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_lateralView_in_fromSource850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_tableBucketSample886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_KW_OF_in_tableBucketSample898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_ON_in_tableBucketSample907 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample911 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_tableBucketSample914 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample918 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_tableBucketSample924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_Number_in_splitSample979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KW_PERCENT_in_splitSample985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_ROWS_in_splitSample987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample1036 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableBucketSample_in_tableSample1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splitSample_in_tableSample1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableSource1128 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000008008000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_tableProperties_in_tableSource1133 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000008008000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_tableSample_in_tableSource1140 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000008008000L});
	public static final BitSet FOLLOW_incrementalClause_in_tableSource1147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008008000L});
	public static final BitSet FOLLOW_KW_AS_in_tableSource1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_tableSource1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1221 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DOT_in_tableName1223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_tableName1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_viewName1304 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DOT_in_viewName1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_viewName1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subQuerySource1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800002000000000L,0x2000000000040000L,0x0000000000001000L});
	public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_subQuerySource1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_subQuerySource1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000008000L,0x0000000000000400L,0x0000040400000000L,0x0000000001000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1598 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1602 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1610 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1614 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_WHERE_in_whereClause1688 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_searchCondition_in_whereClause1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_searchCondition1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred1_FromClauseParser832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_synpred1_FromClauseParser834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred2_FromClauseParser1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_synpred2_FromClauseParser1586 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_synpred2_FromClauseParser1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred2_FromClauseParser1590 = new BitSet(new long[]{0x0000000000000002L});
}
