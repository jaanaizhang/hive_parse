// $ANTLR 3.5.2 SelectClauseParser.g 2014-11-15 16:34:31

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
					if ( (LA3_0==BigintLiteral||LA3_0==CharSetName||LA3_0==DecimalLiteral||LA3_0==Identifier||(LA3_0 >= KW_ADD && LA3_0 <= KW_ANALYZE)||(LA3_0 >= KW_ARCHIVE && LA3_0 <= KW_COLLECTION)||(LA3_0 >= KW_COLUMNS && LA3_0 <= KW_CREATE)||LA3_0==KW_CUBE||(LA3_0 >= KW_CURSOR && LA3_0 <= KW_DATA)||(LA3_0 >= KW_DATABASES && LA3_0 <= KW_DROP)||LA3_0==KW_ELEM_TYPE||LA3_0==KW_ENABLE||LA3_0==KW_ESCAPED||(LA3_0 >= KW_EXCLUSIVE && LA3_0 <= KW_EXPORT)||(LA3_0 >= KW_EXTERNAL && LA3_0 <= KW_FLOAT)||(LA3_0 >= KW_FOR && LA3_0 <= KW_FORMATTED)||LA3_0==KW_FULL||(LA3_0 >= KW_FUNCTIONS && LA3_0 <= KW_GROUPING)||(LA3_0 >= KW_HOLD_DDLTIME && LA3_0 <= KW_INCRE)||(LA3_0 >= KW_INDEX && LA3_0 <= KW_ITEMS)||(LA3_0 >= KW_KEYS && LA3_0 <= KW_LEFT)||(LA3_0 >= KW_LIKE && LA3_0 <= KW_LONG)||(LA3_0 >= KW_MAP && LA3_0 <= KW_MINUS)||(LA3_0 >= KW_MSCK && LA3_0 <= KW_OFFLINE)||LA3_0==KW_OPTION||(LA3_0 >= KW_ORCFILE && LA3_0 <= KW_OUTPUTFORMAT)||LA3_0==KW_OVERWRITE||(LA3_0 >= KW_PARTITION && LA3_0 <= KW_PLUS)||(LA3_0 >= KW_PRETTY && LA3_0 <= KW_RECORDWRITER)||(LA3_0 >= KW_REGEXP && LA3_0 <= KW_SCHEMAS)||(LA3_0 >= KW_SEMI && LA3_0 <= KW_TABLES)||(LA3_0 >= KW_TBLPROPERTIES && LA3_0 <= KW_TEXTFILE)||(LA3_0 >= KW_TIMESTAMP && LA3_0 <= KW_TOUCH)||(LA3_0 >= KW_TRIGGER && LA3_0 <= KW_UNARCHIVE)||(LA3_0 >= KW_UNDO && LA3_0 <= KW_UNIONTYPE)||(LA3_0 >= KW_UNLOCK && LA3_0 <= KW_VALUE_TYPE)||LA3_0==KW_VIEW||LA3_0==KW_WHILE||LA3_0==KW_WITH||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==Number||LA3_0==PLUS||LA3_0==STAR||(LA3_0 >= SmallintLiteral && LA3_0 <= StringLiteral)||LA3_0==TILDE||LA3_0==TinyintLiteral||LA3_0==Day||LA3_0==Hour||(LA3_0 >= Minute && LA3_0 <= Month)||LA3_0==Second||LA3_0==Year) ) {
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
					// elements: selectList, hintClause, hintClause, selectList, selectTrfmClause, hintClause
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
					else if ( (LA8_0==Identifier||(LA8_0 >= KW_ADD && LA8_0 <= KW_AFTER)||(LA8_0 >= KW_ALTER && LA8_0 <= KW_ANALYZE)||(LA8_0 >= KW_ARCHIVE && LA8_0 <= KW_CASCADE)||(LA8_0 >= KW_CHANGE && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_CREATE)||LA8_0==KW_CUBE||(LA8_0 >= KW_CURSOR && LA8_0 <= KW_DATA)||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_DROP)||LA8_0==KW_ELEM_TYPE||LA8_0==KW_ENABLE||LA8_0==KW_ESCAPED||(LA8_0 >= KW_EXCLUSIVE && LA8_0 <= KW_EXPORT)||(LA8_0 >= KW_EXTERNAL && LA8_0 <= KW_FLOAT)||(LA8_0 >= KW_FOR && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FULL||(LA8_0 >= KW_FUNCTIONS && LA8_0 <= KW_GROUPING)||(LA8_0 >= KW_HOLD_DDLTIME && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_IGNORE && LA8_0 <= KW_INCRE)||(LA8_0 >= KW_INDEX && LA8_0 <= KW_ITEMS)||(LA8_0 >= KW_KEYS && LA8_0 <= KW_LEFT)||(LA8_0 >= KW_LIKE && LA8_0 <= KW_LONG)||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MINUS)||(LA8_0 >= KW_MSCK && LA8_0 <= KW_NOSCAN)||(LA8_0 >= KW_NO_DROP && LA8_0 <= KW_OFFLINE)||LA8_0==KW_OPTION||(LA8_0 >= KW_ORCFILE && LA8_0 <= KW_OUTPUTFORMAT)||LA8_0==KW_OVERWRITE||(LA8_0 >= KW_PARTITION && LA8_0 <= KW_PLUS)||(LA8_0 >= KW_PRETTY && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_REGEXP && LA8_0 <= KW_SCHEMAS)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_TABLES)||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TEXTFILE)||(LA8_0 >= KW_TIMESTAMP && LA8_0 <= KW_TOUCH)||(LA8_0 >= KW_TRIGGER && LA8_0 <= KW_UNARCHIVE)||(LA8_0 >= KW_UNDO && LA8_0 <= KW_UNIONTYPE)||(LA8_0 >= KW_UNLOCK && LA8_0 <= KW_VALUE_TYPE)||LA8_0==KW_VIEW||LA8_0==KW_WHILE||LA8_0==KW_WITH) ) {
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
							else if ( ((LA6_0 >= KW_ADD && LA6_0 <= KW_AFTER)||(LA6_0 >= KW_ALTER && LA6_0 <= KW_ANALYZE)||(LA6_0 >= KW_ARCHIVE && LA6_0 <= KW_CASCADE)||(LA6_0 >= KW_CHANGE && LA6_0 <= KW_COLLECTION)||(LA6_0 >= KW_COLUMNS && LA6_0 <= KW_CREATE)||LA6_0==KW_CUBE||(LA6_0 >= KW_CURSOR && LA6_0 <= KW_DATA)||(LA6_0 >= KW_DATABASES && LA6_0 <= KW_DISABLE)||(LA6_0 >= KW_DISTRIBUTE && LA6_0 <= KW_DROP)||LA6_0==KW_ELEM_TYPE||LA6_0==KW_ENABLE||LA6_0==KW_ESCAPED||(LA6_0 >= KW_EXCLUSIVE && LA6_0 <= KW_EXPORT)||(LA6_0 >= KW_EXTERNAL && LA6_0 <= KW_FLOAT)||(LA6_0 >= KW_FOR && LA6_0 <= KW_FORMATTED)||LA6_0==KW_FULL||(LA6_0 >= KW_FUNCTIONS && LA6_0 <= KW_GROUPING)||(LA6_0 >= KW_HOLD_DDLTIME && LA6_0 <= KW_IDXPROPERTIES)||(LA6_0 >= KW_IGNORE && LA6_0 <= KW_INCRE)||(LA6_0 >= KW_INDEX && LA6_0 <= KW_ITEMS)||(LA6_0 >= KW_KEYS && LA6_0 <= KW_LEFT)||(LA6_0 >= KW_LIKE && LA6_0 <= KW_LONG)||(LA6_0 >= KW_MAPJOIN && LA6_0 <= KW_MINUS)||(LA6_0 >= KW_MSCK && LA6_0 <= KW_NOSCAN)||(LA6_0 >= KW_NO_DROP && LA6_0 <= KW_OFFLINE)||LA6_0==KW_OPTION||(LA6_0 >= KW_ORCFILE && LA6_0 <= KW_OUTPUTFORMAT)||LA6_0==KW_OVERWRITE||(LA6_0 >= KW_PARTITION && LA6_0 <= KW_PLUS)||(LA6_0 >= KW_PRETTY && LA6_0 <= KW_RECORDWRITER)||(LA6_0 >= KW_REGEXP && LA6_0 <= KW_SCHEMAS)||(LA6_0 >= KW_SEMI && LA6_0 <= KW_TABLES)||(LA6_0 >= KW_TBLPROPERTIES && LA6_0 <= KW_TEXTFILE)||(LA6_0 >= KW_TIMESTAMP && LA6_0 <= KW_TOUCH)||(LA6_0 >= KW_TRIGGER && LA6_0 <= KW_UNARCHIVE)||(LA6_0 >= KW_UNDO && LA6_0 <= KW_UNIONTYPE)||(LA6_0 >= KW_UNLOCK && LA6_0 <= KW_VALUE_TYPE)||LA6_0==KW_VIEW||LA6_0==KW_WHILE||LA6_0==KW_WITH) ) {
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
			// elements: aliasList, StringLiteral, inSerde, outSerde, inRec, columnNameTypeList, selectExpressionList, outRec
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
	// SelectClauseParser.g:101:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_INCRE -> TOK_INCRE | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME );
	public final HiveParser_SelectClauseParser.hintName_return hintName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintName_return retval = new HiveParser_SelectClauseParser.hintName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAPJOIN35=null;
		Token KW_INCRE36=null;
		Token KW_STREAMTABLE37=null;
		Token KW_HOLD_DDLTIME38=null;

		CommonTree KW_MAPJOIN35_tree=null;
		CommonTree KW_INCRE36_tree=null;
		CommonTree KW_STREAMTABLE37_tree=null;
		CommonTree KW_HOLD_DDLTIME38_tree=null;
		RewriteRuleTokenStream stream_KW_INCRE=new RewriteRuleTokenStream(adaptor,"token KW_INCRE");
		RewriteRuleTokenStream stream_KW_HOLD_DDLTIME=new RewriteRuleTokenStream(adaptor,"token KW_HOLD_DDLTIME");
		RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
		RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");

		 gParent.msgs.push("hint name"); 
		try {
			// SelectClauseParser.g:104:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_INCRE -> TOK_INCRE | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_HOLD_DDLTIME -> TOK_HOLD_DDLTIME )
			int alt12=4;
			switch ( input.LA(1) ) {
			case KW_MAPJOIN:
				{
				alt12=1;
				}
				break;
			case KW_INCRE:
				{
				alt12=2;
				}
				break;
			case KW_STREAMTABLE:
				{
				alt12=3;
				}
				break;
			case KW_HOLD_DDLTIME:
				{
				alt12=4;
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
					// SelectClauseParser.g:106:7: KW_INCRE
					{
					KW_INCRE36=(Token)match(input,KW_INCRE,FOLLOW_KW_INCRE_in_hintName575);  
					stream_KW_INCRE.add(KW_INCRE36);

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
					// 106:16: -> TOK_INCRE
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_INCRE, "TOK_INCRE"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// SelectClauseParser.g:107:7: KW_STREAMTABLE
					{
					KW_STREAMTABLE37=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName587);  
					stream_KW_STREAMTABLE.add(KW_STREAMTABLE37);

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
					// 107:22: -> TOK_STREAMTABLE
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// SelectClauseParser.g:108:7: KW_HOLD_DDLTIME
					{
					KW_HOLD_DDLTIME38=(Token)match(input,KW_HOLD_DDLTIME,FOLLOW_KW_HOLD_DDLTIME_in_hintName599);  
					stream_KW_HOLD_DDLTIME.add(KW_HOLD_DDLTIME38);

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
					// 108:23: -> TOK_HOLD_DDLTIME
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
	// SelectClauseParser.g:111:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
	public final HiveParser_SelectClauseParser.hintArgs_return hintArgs() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgs_return retval = new HiveParser_SelectClauseParser.hintArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA40=null;
		ParserRuleReturnScope hintArgName39 =null;
		ParserRuleReturnScope hintArgName41 =null;

		CommonTree COMMA40_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");

		 gParent.msgs.push("hint arguments"); 
		try {
			// SelectClauseParser.g:114:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
			// SelectClauseParser.g:115:5: hintArgName ( COMMA hintArgName )*
			{
			pushFollow(FOLLOW_hintArgName_in_hintArgs634);
			hintArgName39=hintArgName();
			state._fsp--;

			stream_hintArgName.add(hintArgName39.getTree());
			// SelectClauseParser.g:115:17: ( COMMA hintArgName )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// SelectClauseParser.g:115:18: COMMA hintArgName
					{
					COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs637);  
					stream_COMMA.add(COMMA40);

					pushFollow(FOLLOW_hintArgName_in_hintArgs639);
					hintArgName41=hintArgName();
					state._fsp--;

					stream_hintArgName.add(hintArgName41.getTree());
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
			// 115:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
			{
				// SelectClauseParser.g:115:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
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
	// SelectClauseParser.g:118:1: hintArgName : identifier ;
	public final HiveParser_SelectClauseParser.hintArgName_return hintArgName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgName_return retval = new HiveParser_SelectClauseParser.hintArgName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier42 =null;


		 gParent.msgs.push("hint argument name"); 
		try {
			// SelectClauseParser.g:121:5: ( identifier )
			// SelectClauseParser.g:122:5: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_hintArgName681);
			identifier42=gHiveParser.identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier42.getTree());

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
	// SelectClauseParser.g:125:1: selectItem : ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ) ;
	public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
		HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS44=null;
		Token KW_AS46=null;
		Token LPAREN47=null;
		Token COMMA49=null;
		Token RPAREN51=null;
		ParserRuleReturnScope selectExpression43 =null;
		ParserRuleReturnScope identifier45 =null;
		ParserRuleReturnScope identifier48 =null;
		ParserRuleReturnScope identifier50 =null;

		CommonTree KW_AS44_tree=null;
		CommonTree KW_AS46_tree=null;
		CommonTree LPAREN47_tree=null;
		CommonTree COMMA49_tree=null;
		CommonTree RPAREN51_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.msgs.push("selection target"); 
		try {
			// SelectClauseParser.g:128:5: ( ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR selectExpression ( identifier )* ) )
			// SelectClauseParser.g:129:5: ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
			{
			// SelectClauseParser.g:129:5: ( selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
			// SelectClauseParser.g:129:7: selectExpression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
			{
			pushFollow(FOLLOW_selectExpression_in_selectItem714);
			selectExpression43=selectExpression();
			state._fsp--;

			stream_selectExpression.add(selectExpression43.getTree());
			// SelectClauseParser.g:130:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
			int alt16=3;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// SelectClauseParser.g:130:8: ( ( KW_AS )? identifier )
					{
					// SelectClauseParser.g:130:8: ( ( KW_AS )? identifier )
					// SelectClauseParser.g:130:9: ( KW_AS )? identifier
					{
					// SelectClauseParser.g:130:9: ( KW_AS )?
					int alt14=2;
					alt14 = dfa14.predict(input);
					switch (alt14) {
						case 1 :
							// SelectClauseParser.g:130:9: KW_AS
							{
							KW_AS44=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem724);  
							stream_KW_AS.add(KW_AS44);

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_selectItem727);
					identifier45=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(identifier45.getTree());
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:130:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
					{
					// SelectClauseParser.g:130:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
					// SelectClauseParser.g:130:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
					{
					KW_AS46=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem733);  
					stream_KW_AS.add(KW_AS46);

					LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem735);  
					stream_LPAREN.add(LPAREN47);

					pushFollow(FOLLOW_identifier_in_selectItem737);
					identifier48=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(identifier48.getTree());
					// SelectClauseParser.g:130:55: ( COMMA identifier )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// SelectClauseParser.g:130:56: COMMA identifier
							{
							COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem740);  
							stream_COMMA.add(COMMA49);

							pushFollow(FOLLOW_identifier_in_selectItem742);
							identifier50=gHiveParser.identifier();
							state._fsp--;

							stream_identifier.add(identifier50.getTree());
							}
							break;

						default :
							break loop15;
						}
					}

					RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem746);  
					stream_RPAREN.add(RPAREN51);

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
			// 131:7: -> ^( TOK_SELEXPR selectExpression ( identifier )* )
			{
				// SelectClauseParser.g:131:10: ^( TOK_SELEXPR selectExpression ( identifier )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
				adaptor.addChild(root_1, stream_selectExpression.nextTree());
				// SelectClauseParser.g:131:41: ( identifier )*
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
	// SelectClauseParser.g:134:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAP52=null;
		Token KW_REDUCE54=null;
		Token KW_USING56=null;
		Token StringLiteral57=null;
		Token KW_AS58=null;
		Token LPAREN59=null;
		Token RPAREN62=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList53 =null;
		ParserRuleReturnScope selectExpressionList55 =null;
		ParserRuleReturnScope aliasList60 =null;
		ParserRuleReturnScope columnNameTypeList61 =null;
		ParserRuleReturnScope aliasList63 =null;
		ParserRuleReturnScope columnNameTypeList64 =null;

		CommonTree KW_MAP52_tree=null;
		CommonTree KW_REDUCE54_tree=null;
		CommonTree KW_USING56_tree=null;
		CommonTree StringLiteral57_tree=null;
		CommonTree KW_AS58_tree=null;
		CommonTree LPAREN59_tree=null;
		CommonTree RPAREN62_tree=null;
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
			// SelectClauseParser.g:137:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:138:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			// SelectClauseParser.g:138:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
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
					// SelectClauseParser.g:138:9: KW_MAP selectExpressionList
					{
					KW_MAP52=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause801);  
					stream_KW_MAP.add(KW_MAP52);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause806);
					selectExpressionList53=selectExpressionList();
					state._fsp--;

					stream_selectExpressionList.add(selectExpressionList53.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:139:9: KW_REDUCE selectExpressionList
					{
					KW_REDUCE54=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause816);  
					stream_KW_REDUCE.add(KW_REDUCE54);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause818);
					selectExpressionList55=selectExpressionList();
					state._fsp--;

					stream_selectExpressionList.add(selectExpressionList55.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause828);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_trfmClause832);
			inRec=gHiveParser.recordWriter();
			state._fsp--;

			stream_recordWriter.add(inRec.getTree());
			KW_USING56=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause838);  
			stream_KW_USING.add(KW_USING56);

			StringLiteral57=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause840);  
			stream_StringLiteral.add(StringLiteral57);

			// SelectClauseParser.g:142:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==KW_AS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// SelectClauseParser.g:142:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS58=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause848);  
					stream_KW_AS.add(KW_AS58);

					// SelectClauseParser.g:142:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LPAREN) ) {
						alt20=1;
					}
					else if ( (LA20_0==Identifier||(LA20_0 >= KW_ADD && LA20_0 <= KW_AFTER)||(LA20_0 >= KW_ALTER && LA20_0 <= KW_ANALYZE)||(LA20_0 >= KW_ARCHIVE && LA20_0 <= KW_CASCADE)||(LA20_0 >= KW_CHANGE && LA20_0 <= KW_COLLECTION)||(LA20_0 >= KW_COLUMNS && LA20_0 <= KW_CREATE)||LA20_0==KW_CUBE||(LA20_0 >= KW_CURSOR && LA20_0 <= KW_DATA)||(LA20_0 >= KW_DATABASES && LA20_0 <= KW_DISABLE)||(LA20_0 >= KW_DISTRIBUTE && LA20_0 <= KW_DROP)||LA20_0==KW_ELEM_TYPE||LA20_0==KW_ENABLE||LA20_0==KW_ESCAPED||(LA20_0 >= KW_EXCLUSIVE && LA20_0 <= KW_EXPORT)||(LA20_0 >= KW_EXTERNAL && LA20_0 <= KW_FLOAT)||(LA20_0 >= KW_FOR && LA20_0 <= KW_FORMATTED)||LA20_0==KW_FULL||(LA20_0 >= KW_FUNCTIONS && LA20_0 <= KW_GROUPING)||(LA20_0 >= KW_HOLD_DDLTIME && LA20_0 <= KW_IDXPROPERTIES)||(LA20_0 >= KW_IGNORE && LA20_0 <= KW_INCRE)||(LA20_0 >= KW_INDEX && LA20_0 <= KW_ITEMS)||(LA20_0 >= KW_KEYS && LA20_0 <= KW_LEFT)||(LA20_0 >= KW_LIKE && LA20_0 <= KW_LONG)||(LA20_0 >= KW_MAPJOIN && LA20_0 <= KW_MINUS)||(LA20_0 >= KW_MSCK && LA20_0 <= KW_NOSCAN)||(LA20_0 >= KW_NO_DROP && LA20_0 <= KW_OFFLINE)||LA20_0==KW_OPTION||(LA20_0 >= KW_ORCFILE && LA20_0 <= KW_OUTPUTFORMAT)||LA20_0==KW_OVERWRITE||(LA20_0 >= KW_PARTITION && LA20_0 <= KW_PLUS)||(LA20_0 >= KW_PRETTY && LA20_0 <= KW_RECORDWRITER)||(LA20_0 >= KW_REGEXP && LA20_0 <= KW_SCHEMAS)||(LA20_0 >= KW_SEMI && LA20_0 <= KW_TABLES)||(LA20_0 >= KW_TBLPROPERTIES && LA20_0 <= KW_TEXTFILE)||(LA20_0 >= KW_TIMESTAMP && LA20_0 <= KW_TOUCH)||(LA20_0 >= KW_TRIGGER && LA20_0 <= KW_UNARCHIVE)||(LA20_0 >= KW_UNDO && LA20_0 <= KW_UNIONTYPE)||(LA20_0 >= KW_UNLOCK && LA20_0 <= KW_VALUE_TYPE)||LA20_0==KW_VIEW||LA20_0==KW_WHILE||LA20_0==KW_WITH) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// SelectClauseParser.g:142:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:142:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:142:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause852);  
							stream_LPAREN.add(LPAREN59);

							// SelectClauseParser.g:142:22: ( aliasList | columnNameTypeList )
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
							else if ( ((LA18_0 >= KW_ADD && LA18_0 <= KW_AFTER)||(LA18_0 >= KW_ALTER && LA18_0 <= KW_ANALYZE)||(LA18_0 >= KW_ARCHIVE && LA18_0 <= KW_CASCADE)||(LA18_0 >= KW_CHANGE && LA18_0 <= KW_COLLECTION)||(LA18_0 >= KW_COLUMNS && LA18_0 <= KW_CREATE)||LA18_0==KW_CUBE||(LA18_0 >= KW_CURSOR && LA18_0 <= KW_DATA)||(LA18_0 >= KW_DATABASES && LA18_0 <= KW_DISABLE)||(LA18_0 >= KW_DISTRIBUTE && LA18_0 <= KW_DROP)||LA18_0==KW_ELEM_TYPE||LA18_0==KW_ENABLE||LA18_0==KW_ESCAPED||(LA18_0 >= KW_EXCLUSIVE && LA18_0 <= KW_EXPORT)||(LA18_0 >= KW_EXTERNAL && LA18_0 <= KW_FLOAT)||(LA18_0 >= KW_FOR && LA18_0 <= KW_FORMATTED)||LA18_0==KW_FULL||(LA18_0 >= KW_FUNCTIONS && LA18_0 <= KW_GROUPING)||(LA18_0 >= KW_HOLD_DDLTIME && LA18_0 <= KW_IDXPROPERTIES)||(LA18_0 >= KW_IGNORE && LA18_0 <= KW_INCRE)||(LA18_0 >= KW_INDEX && LA18_0 <= KW_ITEMS)||(LA18_0 >= KW_KEYS && LA18_0 <= KW_LEFT)||(LA18_0 >= KW_LIKE && LA18_0 <= KW_LONG)||(LA18_0 >= KW_MAPJOIN && LA18_0 <= KW_MINUS)||(LA18_0 >= KW_MSCK && LA18_0 <= KW_NOSCAN)||(LA18_0 >= KW_NO_DROP && LA18_0 <= KW_OFFLINE)||LA18_0==KW_OPTION||(LA18_0 >= KW_ORCFILE && LA18_0 <= KW_OUTPUTFORMAT)||LA18_0==KW_OVERWRITE||(LA18_0 >= KW_PARTITION && LA18_0 <= KW_PLUS)||(LA18_0 >= KW_PRETTY && LA18_0 <= KW_RECORDWRITER)||(LA18_0 >= KW_REGEXP && LA18_0 <= KW_SCHEMAS)||(LA18_0 >= KW_SEMI && LA18_0 <= KW_TABLES)||(LA18_0 >= KW_TBLPROPERTIES && LA18_0 <= KW_TEXTFILE)||(LA18_0 >= KW_TIMESTAMP && LA18_0 <= KW_TOUCH)||(LA18_0 >= KW_TRIGGER && LA18_0 <= KW_UNARCHIVE)||(LA18_0 >= KW_UNDO && LA18_0 <= KW_UNIONTYPE)||(LA18_0 >= KW_UNLOCK && LA18_0 <= KW_VALUE_TYPE)||LA18_0==KW_VIEW||LA18_0==KW_WHILE||LA18_0==KW_WITH) ) {
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
									// SelectClauseParser.g:142:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause855);
									aliasList60=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList60.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:142:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause859);
									columnNameTypeList61=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList61.getTree());
									}
									break;

							}

							RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause862);  
							stream_RPAREN.add(RPAREN62);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:142:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:142:65: ( aliasList | columnNameTypeList )
							int alt19=2;
							alt19 = dfa19.predict(input);
							switch (alt19) {
								case 1 :
									// SelectClauseParser.g:142:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause868);
									aliasList63=gHiveParser.aliasList();
									state._fsp--;

									stream_aliasList.add(aliasList63.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:142:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause872);
									columnNameTypeList64=gHiveParser.columnNameTypeList();
									state._fsp--;

									stream_columnNameTypeList.add(columnNameTypeList64.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause884);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;

			stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_trfmClause888);
			outRec=gHiveParser.recordReader();
			state._fsp--;

			stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: selectExpressionList, outRec, columnNameTypeList, aliasList, outSerde, inRec, inSerde, StringLiteral
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
			// 144:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:144:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:144:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:144:104: ( columnNameTypeList )?
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
	// SelectClauseParser.g:147:1: selectExpression : ( expression | tableAllColumns );
	public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope tableAllColumns66 =null;


		 gParent.msgs.push("select expression"); 
		try {
			// SelectClauseParser.g:150:5: ( expression | tableAllColumns )
			int alt22=2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// SelectClauseParser.g:151:5: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_selectExpression951);
					expression65=gHiveParser.expression();
					state._fsp--;

					adaptor.addChild(root_0, expression65.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:151:18: tableAllColumns
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableAllColumns_in_selectExpression955);
					tableAllColumns66=gHiveParser.tableAllColumns();
					state._fsp--;

					adaptor.addChild(root_0, tableAllColumns66.getTree());

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
	// SelectClauseParser.g:154:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
	public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA68=null;
		ParserRuleReturnScope selectExpression67 =null;
		ParserRuleReturnScope selectExpression69 =null;

		CommonTree COMMA68_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");

		 gParent.msgs.push("select expression list"); 
		try {
			// SelectClauseParser.g:157:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
			// SelectClauseParser.g:158:5: selectExpression ( COMMA selectExpression )*
			{
			pushFollow(FOLLOW_selectExpression_in_selectExpressionList986);
			selectExpression67=selectExpression();
			state._fsp--;

			stream_selectExpression.add(selectExpression67.getTree());
			// SelectClauseParser.g:158:22: ( COMMA selectExpression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// SelectClauseParser.g:158:23: COMMA selectExpression
					{
					COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList989);  
					stream_COMMA.add(COMMA68);

					pushFollow(FOLLOW_selectExpression_in_selectExpressionList991);
					selectExpression69=selectExpression();
					state._fsp--;

					stream_selectExpression.add(selectExpression69.getTree());
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
			// 158:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
			{
				// SelectClauseParser.g:158:51: ^( TOK_EXPLIST ( selectExpression )+ )
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


	public static class incrementalClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "incrementalClause"
	// SelectClauseParser.g:163:1: incrementalClause : DIVIDE STAR PLUS KW_INCRE LPAREN incrementalArgs RPAREN STAR DIVIDE -> ^( TOK_INCRE ( incrementalArgs )? ) ;
	public final HiveParser_SelectClauseParser.incrementalClause_return incrementalClause() throws RecognitionException {
		HiveParser_SelectClauseParser.incrementalClause_return retval = new HiveParser_SelectClauseParser.incrementalClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DIVIDE70=null;
		Token STAR71=null;
		Token PLUS72=null;
		Token KW_INCRE73=null;
		Token LPAREN74=null;
		Token RPAREN76=null;
		Token STAR77=null;
		Token DIVIDE78=null;
		ParserRuleReturnScope incrementalArgs75 =null;

		CommonTree DIVIDE70_tree=null;
		CommonTree STAR71_tree=null;
		CommonTree PLUS72_tree=null;
		CommonTree KW_INCRE73_tree=null;
		CommonTree LPAREN74_tree=null;
		CommonTree RPAREN76_tree=null;
		CommonTree STAR77_tree=null;
		CommonTree DIVIDE78_tree=null;
		RewriteRuleTokenStream stream_KW_INCRE=new RewriteRuleTokenStream(adaptor,"token KW_INCRE");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_incrementalArgs=new RewriteRuleSubtreeStream(adaptor,"rule incrementalArgs");

		 gParent.msgs.push("incremental clause"); 
		try {
			// SelectClauseParser.g:166:5: ( DIVIDE STAR PLUS KW_INCRE LPAREN incrementalArgs RPAREN STAR DIVIDE -> ^( TOK_INCRE ( incrementalArgs )? ) )
			// SelectClauseParser.g:167:5: DIVIDE STAR PLUS KW_INCRE LPAREN incrementalArgs RPAREN STAR DIVIDE
			{
			DIVIDE70=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_incrementalClause1035);  
			stream_DIVIDE.add(DIVIDE70);

			STAR71=(Token)match(input,STAR,FOLLOW_STAR_in_incrementalClause1037);  
			stream_STAR.add(STAR71);

			PLUS72=(Token)match(input,PLUS,FOLLOW_PLUS_in_incrementalClause1039);  
			stream_PLUS.add(PLUS72);

			KW_INCRE73=(Token)match(input,KW_INCRE,FOLLOW_KW_INCRE_in_incrementalClause1041);  
			stream_KW_INCRE.add(KW_INCRE73);

			LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_incrementalClause1043);  
			stream_LPAREN.add(LPAREN74);

			pushFollow(FOLLOW_incrementalArgs_in_incrementalClause1045);
			incrementalArgs75=incrementalArgs();
			state._fsp--;

			stream_incrementalArgs.add(incrementalArgs75.getTree());
			RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_incrementalClause1047);  
			stream_RPAREN.add(RPAREN76);

			STAR77=(Token)match(input,STAR,FOLLOW_STAR_in_incrementalClause1049);  
			stream_STAR.add(STAR77);

			DIVIDE78=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_incrementalClause1051);  
			stream_DIVIDE.add(DIVIDE78);

			// AST REWRITE
			// elements: incrementalArgs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 168:6: -> ^( TOK_INCRE ( incrementalArgs )? )
			{
				// SelectClauseParser.g:168:10: ^( TOK_INCRE ( incrementalArgs )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_INCRE, "TOK_INCRE"), root_1);
				// SelectClauseParser.g:168:22: ( incrementalArgs )?
				if ( stream_incrementalArgs.hasNext() ) {
					adaptor.addChild(root_1, stream_incrementalArgs.nextTree());
				}
				stream_incrementalArgs.reset();

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
	// $ANTLR end "incrementalClause"


	public static class incrementalArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "incrementalArgs"
	// SelectClauseParser.g:171:1: incrementalArgs : (date= incrementalDate -> ^( TOK_DATE $date) | KW_EACH KW_INCREFREQUENCY (incre= Number ) KW_DURING (date= incrementalDate ) -> ^( TOK_DATE $date TOK_INCREFREQUENCY $incre) );
	public final HiveParser_SelectClauseParser.incrementalArgs_return incrementalArgs() throws RecognitionException {
		HiveParser_SelectClauseParser.incrementalArgs_return retval = new HiveParser_SelectClauseParser.incrementalArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token incre=null;
		Token KW_EACH79=null;
		Token KW_INCREFREQUENCY80=null;
		Token KW_DURING81=null;
		ParserRuleReturnScope date =null;

		CommonTree incre_tree=null;
		CommonTree KW_EACH79_tree=null;
		CommonTree KW_INCREFREQUENCY80_tree=null;
		CommonTree KW_DURING81_tree=null;
		RewriteRuleTokenStream stream_KW_EACH=new RewriteRuleTokenStream(adaptor,"token KW_EACH");
		RewriteRuleTokenStream stream_KW_DURING=new RewriteRuleTokenStream(adaptor,"token KW_DURING");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_INCREFREQUENCY=new RewriteRuleTokenStream(adaptor,"token KW_INCREFREQUENCY");
		RewriteRuleSubtreeStream stream_incrementalDate=new RewriteRuleSubtreeStream(adaptor,"rule incrementalDate");

		 gParent.msgs.push("incremental arguments"); 
		try {
			// SelectClauseParser.g:174:5: (date= incrementalDate -> ^( TOK_DATE $date) | KW_EACH KW_INCREFREQUENCY (incre= Number ) KW_DURING (date= incrementalDate ) -> ^( TOK_DATE $date TOK_INCREFREQUENCY $incre) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= INT_0 && LA24_0 <= INT_99)) ) {
				alt24=1;
			}
			else if ( (LA24_0==KW_EACH) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// SelectClauseParser.g:175:5: date= incrementalDate
					{
					pushFollow(FOLLOW_incrementalDate_in_incrementalArgs1100);
					date=incrementalDate();
					state._fsp--;

					stream_incrementalDate.add(date.getTree());
					// AST REWRITE
					// elements: date
					// token labels: 
					// rule labels: retval, date
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date",date!=null?date.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 176:6: -> ^( TOK_DATE $date)
					{
						// SelectClauseParser.g:176:9: ^( TOK_DATE $date)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DATE, "TOK_DATE"), root_1);
						adaptor.addChild(root_1, stream_date.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:178:6: KW_EACH KW_INCREFREQUENCY (incre= Number ) KW_DURING (date= incrementalDate )
					{
					KW_EACH79=(Token)match(input,KW_EACH,FOLLOW_KW_EACH_in_incrementalArgs1127);  
					stream_KW_EACH.add(KW_EACH79);

					KW_INCREFREQUENCY80=(Token)match(input,KW_INCREFREQUENCY,FOLLOW_KW_INCREFREQUENCY_in_incrementalArgs1129);  
					stream_KW_INCREFREQUENCY.add(KW_INCREFREQUENCY80);

					// SelectClauseParser.g:178:32: (incre= Number )
					// SelectClauseParser.g:178:33: incre= Number
					{
					incre=(Token)match(input,Number,FOLLOW_Number_in_incrementalArgs1134);  
					stream_Number.add(incre);

					}

					KW_DURING81=(Token)match(input,KW_DURING,FOLLOW_KW_DURING_in_incrementalArgs1137);  
					stream_KW_DURING.add(KW_DURING81);

					// SelectClauseParser.g:178:57: (date= incrementalDate )
					// SelectClauseParser.g:178:58: date= incrementalDate
					{
					pushFollow(FOLLOW_incrementalDate_in_incrementalArgs1142);
					date=incrementalDate();
					state._fsp--;

					stream_incrementalDate.add(date.getTree());
					}

					// AST REWRITE
					// elements: date, incre
					// token labels: incre
					// rule labels: retval, date
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_incre=new RewriteRuleTokenStream(adaptor,"token incre",incre);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date",date!=null?date.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 179:6: -> ^( TOK_DATE $date TOK_INCREFREQUENCY $incre)
					{
						// SelectClauseParser.g:179:9: ^( TOK_DATE $date TOK_INCREFREQUENCY $incre)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DATE, "TOK_DATE"), root_1);
						adaptor.addChild(root_1, stream_date.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_INCREFREQUENCY, "TOK_INCREFREQUENCY"));
						adaptor.addChild(root_1, stream_incre.nextNode());
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
	// $ANTLR end "incrementalArgs"


	public static class incrementalDate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "incrementalDate"
	// SelectClauseParser.g:182:1: incrementalDate : stime= dateArgs MINUS etime= dateArgs -> ^( TOK_STARTTIME $stime TOK_STOPTIME $etime) ;
	public final HiveParser_SelectClauseParser.incrementalDate_return incrementalDate() throws RecognitionException {
		HiveParser_SelectClauseParser.incrementalDate_return retval = new HiveParser_SelectClauseParser.incrementalDate_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MINUS82=null;
		ParserRuleReturnScope stime =null;
		ParserRuleReturnScope etime =null;

		CommonTree MINUS82_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_dateArgs=new RewriteRuleSubtreeStream(adaptor,"rule dateArgs");

		 gParent.msgs.push("incremental date"); 
		try {
			// SelectClauseParser.g:185:5: (stime= dateArgs MINUS etime= dateArgs -> ^( TOK_STARTTIME $stime TOK_STOPTIME $etime) )
			// SelectClauseParser.g:186:5: stime= dateArgs MINUS etime= dateArgs
			{
			pushFollow(FOLLOW_dateArgs_in_incrementalDate1199);
			stime=dateArgs();
			state._fsp--;

			stream_dateArgs.add(stime.getTree());
			MINUS82=(Token)match(input,MINUS,FOLLOW_MINUS_in_incrementalDate1201);  
			stream_MINUS.add(MINUS82);

			pushFollow(FOLLOW_dateArgs_in_incrementalDate1206);
			etime=dateArgs();
			state._fsp--;

			stream_dateArgs.add(etime.getTree());
			// AST REWRITE
			// elements: etime, stime
			// token labels: 
			// rule labels: retval, stime, etime
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_stime=new RewriteRuleSubtreeStream(adaptor,"rule stime",stime!=null?stime.getTree():null);
			RewriteRuleSubtreeStream stream_etime=new RewriteRuleSubtreeStream(adaptor,"rule etime",etime!=null?etime.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 187:5: -> ^( TOK_STARTTIME $stime TOK_STOPTIME $etime)
			{
				// SelectClauseParser.g:187:7: ^( TOK_STARTTIME $stime TOK_STOPTIME $etime)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_STARTTIME, "TOK_STARTTIME"), root_1);
				adaptor.addChild(root_1, stream_stime.nextTree());
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_STOPTIME, "TOK_STOPTIME"));
				adaptor.addChild(root_1, stream_etime.nextTree());
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
	// $ANTLR end "incrementalDate"


	public static class dateArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dateArgs"
	// SelectClauseParser.g:190:1: dateArgs : ( ( explicit_time ) -> ^( TOK_DATETIME explicit_time ) | year );
	public final HiveParser_SelectClauseParser.dateArgs_return dateArgs() throws RecognitionException {
		HiveParser_SelectClauseParser.dateArgs_return retval = new HiveParser_SelectClauseParser.dateArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope explicit_time83 =null;
		ParserRuleReturnScope year84 =null;

		RewriteRuleSubtreeStream stream_explicit_time=new RewriteRuleSubtreeStream(adaptor,"rule explicit_time");

		 gParent.msgs.push("incremental arguments"); 
		try {
			// SelectClauseParser.g:193:5: ( ( explicit_time ) -> ^( TOK_DATETIME explicit_time ) | year )
			int alt25=2;
			switch ( input.LA(1) ) {
			case INT_00:
				{
				switch ( input.LA(2) ) {
				case COLON:
					{
					alt25=1;
					}
					break;
				case INT_00:
					{
					alt25=1;
					}
					break;
				case INT_01:
				case INT_02:
				case INT_03:
				case INT_04:
				case INT_05:
				case INT_06:
				case INT_07:
				case INT_08:
				case INT_09:
				case INT_10:
				case INT_11:
				case INT_12:
					{
					alt25=1;
					}
					break;
				case INT_13:
				case INT_14:
				case INT_15:
				case INT_16:
				case INT_17:
				case INT_18:
				case INT_19:
				case INT_20:
				case INT_21:
				case INT_22:
				case INT_23:
					{
					alt25=1;
					}
					break;
				case INT_24:
				case INT_25:
				case INT_26:
				case INT_27:
				case INT_28:
				case INT_29:
				case INT_30:
				case INT_31:
					{
					alt25=1;
					}
					break;
				case INT_32:
				case INT_33:
				case INT_34:
				case INT_35:
				case INT_36:
				case INT_37:
				case INT_38:
				case INT_39:
				case INT_40:
				case INT_41:
				case INT_42:
				case INT_43:
				case INT_44:
				case INT_45:
				case INT_46:
				case INT_47:
				case INT_48:
				case INT_49:
				case INT_50:
				case INT_51:
				case INT_52:
				case INT_53:
				case INT_54:
				case INT_55:
				case INT_56:
				case INT_57:
				case INT_58:
				case INT_59:
					{
					alt25=1;
					}
					break;
				case INT_60:
				case INT_61:
				case INT_62:
				case INT_63:
				case INT_64:
				case INT_65:
				case INT_66:
				case INT_67:
				case INT_68:
				case INT_69:
				case INT_70:
				case INT_71:
				case INT_72:
				case INT_73:
				case INT_74:
				case INT_75:
				case INT_76:
				case INT_77:
				case INT_78:
				case INT_79:
				case INT_80:
				case INT_81:
				case INT_82:
				case INT_83:
				case INT_84:
				case INT_85:
				case INT_86:
				case INT_87:
				case INT_88:
				case INT_89:
				case INT_90:
				case INT_91:
				case INT_92:
				case INT_93:
				case INT_94:
				case INT_95:
				case INT_96:
				case INT_97:
				case INT_98:
				case INT_99:
				case MINUS:
				case RPAREN:
					{
					alt25=2;
					}
					break;
				default:
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
				break;
			case INT_0:
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
				{
				alt25=1;
				}
				break;
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
				{
				switch ( input.LA(2) ) {
				case COLON:
					{
					alt25=1;
					}
					break;
				case INT_00:
					{
					alt25=1;
					}
					break;
				case INT_01:
				case INT_02:
				case INT_03:
				case INT_04:
				case INT_05:
				case INT_06:
				case INT_07:
				case INT_08:
				case INT_09:
				case INT_10:
				case INT_11:
				case INT_12:
					{
					alt25=1;
					}
					break;
				case INT_13:
				case INT_14:
				case INT_15:
				case INT_16:
				case INT_17:
				case INT_18:
				case INT_19:
				case INT_20:
				case INT_21:
				case INT_22:
				case INT_23:
					{
					alt25=1;
					}
					break;
				case INT_24:
				case INT_25:
				case INT_26:
				case INT_27:
				case INT_28:
				case INT_29:
				case INT_30:
				case INT_31:
					{
					alt25=1;
					}
					break;
				case INT_32:
				case INT_33:
				case INT_34:
				case INT_35:
				case INT_36:
				case INT_37:
				case INT_38:
				case INT_39:
				case INT_40:
				case INT_41:
				case INT_42:
				case INT_43:
				case INT_44:
				case INT_45:
				case INT_46:
				case INT_47:
				case INT_48:
				case INT_49:
				case INT_50:
				case INT_51:
				case INT_52:
				case INT_53:
				case INT_54:
				case INT_55:
				case INT_56:
				case INT_57:
				case INT_58:
				case INT_59:
					{
					alt25=1;
					}
					break;
				case INT_60:
				case INT_61:
				case INT_62:
				case INT_63:
				case INT_64:
				case INT_65:
				case INT_66:
				case INT_67:
				case INT_68:
				case INT_69:
				case INT_70:
				case INT_71:
				case INT_72:
				case INT_73:
				case INT_74:
				case INT_75:
				case INT_76:
				case INT_77:
				case INT_78:
				case INT_79:
				case INT_80:
				case INT_81:
				case INT_82:
				case INT_83:
				case INT_84:
				case INT_85:
				case INT_86:
				case INT_87:
				case INT_88:
				case INT_89:
				case INT_90:
				case INT_91:
				case INT_92:
				case INT_93:
				case INT_94:
				case INT_95:
				case INT_96:
				case INT_97:
				case INT_98:
				case INT_99:
				case MINUS:
				case RPAREN:
					{
					alt25=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
				{
				switch ( input.LA(2) ) {
				case COLON:
					{
					alt25=1;
					}
					break;
				case INT_00:
					{
					alt25=1;
					}
					break;
				case INT_01:
				case INT_02:
				case INT_03:
				case INT_04:
				case INT_05:
				case INT_06:
				case INT_07:
				case INT_08:
				case INT_09:
				case INT_10:
				case INT_11:
				case INT_12:
					{
					alt25=1;
					}
					break;
				case INT_13:
				case INT_14:
				case INT_15:
				case INT_16:
				case INT_17:
				case INT_18:
				case INT_19:
				case INT_20:
				case INT_21:
				case INT_22:
				case INT_23:
					{
					alt25=1;
					}
					break;
				case INT_24:
				case INT_25:
				case INT_26:
				case INT_27:
				case INT_28:
				case INT_29:
				case INT_30:
				case INT_31:
					{
					alt25=1;
					}
					break;
				case INT_32:
				case INT_33:
				case INT_34:
				case INT_35:
				case INT_36:
				case INT_37:
				case INT_38:
				case INT_39:
				case INT_40:
				case INT_41:
				case INT_42:
				case INT_43:
				case INT_44:
				case INT_45:
				case INT_46:
				case INT_47:
				case INT_48:
				case INT_49:
				case INT_50:
				case INT_51:
				case INT_52:
				case INT_53:
				case INT_54:
				case INT_55:
				case INT_56:
				case INT_57:
				case INT_58:
				case INT_59:
					{
					alt25=1;
					}
					break;
				case INT_60:
				case INT_61:
				case INT_62:
				case INT_63:
				case INT_64:
				case INT_65:
				case INT_66:
				case INT_67:
				case INT_68:
				case INT_69:
				case INT_70:
				case INT_71:
				case INT_72:
				case INT_73:
				case INT_74:
				case INT_75:
				case INT_76:
				case INT_77:
				case INT_78:
				case INT_79:
				case INT_80:
				case INT_81:
				case INT_82:
				case INT_83:
				case INT_84:
				case INT_85:
				case INT_86:
				case INT_87:
				case INT_88:
				case INT_89:
				case INT_90:
				case INT_91:
				case INT_92:
				case INT_93:
				case INT_94:
				case INT_95:
				case INT_96:
				case INT_97:
				case INT_98:
				case INT_99:
				case MINUS:
				case RPAREN:
					{
					alt25=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
				{
				alt25=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// SelectClauseParser.g:194:5: ( explicit_time )
					{
					// SelectClauseParser.g:194:5: ( explicit_time )
					// SelectClauseParser.g:194:6: explicit_time
					{
					pushFollow(FOLLOW_explicit_time_in_dateArgs1256);
					explicit_time83=explicit_time();
					state._fsp--;

					stream_explicit_time.add(explicit_time83.getTree());
					}

					// AST REWRITE
					// elements: explicit_time
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 194:20: -> ^( TOK_DATETIME explicit_time )
					{
						// SelectClauseParser.g:194:22: ^( TOK_DATETIME explicit_time )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DATETIME, "TOK_DATETIME"), root_1);
						adaptor.addChild(root_1, stream_explicit_time.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// SelectClauseParser.g:195:7: year
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_year_in_dateArgs1271);
					year84=year();
					state._fsp--;

					adaptor.addChild(root_0, year84.getTree());

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
	// $ANTLR end "dateArgs"


	public static class indefinite_time_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "indefinite_time"
	// SelectClauseParser.g:198:1: indefinite_time : year DIVIDE month DIVIDE day -> ^( TOK_DATE year DIVIDE month DIVIDE day ) ;
	public final HiveParser_SelectClauseParser.indefinite_time_return indefinite_time() throws RecognitionException {
		HiveParser_SelectClauseParser.indefinite_time_return retval = new HiveParser_SelectClauseParser.indefinite_time_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DIVIDE86=null;
		Token DIVIDE88=null;
		ParserRuleReturnScope year85 =null;
		ParserRuleReturnScope month87 =null;
		ParserRuleReturnScope day89 =null;

		CommonTree DIVIDE86_tree=null;
		CommonTree DIVIDE88_tree=null;
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
		RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
		RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
		RewriteRuleSubtreeStream stream_day=new RewriteRuleSubtreeStream(adaptor,"rule day");

		 gParent.msgs.push("incremental argument name"); 
		try {
			// SelectClauseParser.g:201:5: ( year DIVIDE month DIVIDE day -> ^( TOK_DATE year DIVIDE month DIVIDE day ) )
			// SelectClauseParser.g:202:5: year DIVIDE month DIVIDE day
			{
			pushFollow(FOLLOW_year_in_indefinite_time1302);
			year85=year();
			state._fsp--;

			stream_year.add(year85.getTree());
			DIVIDE86=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_indefinite_time1304);  
			stream_DIVIDE.add(DIVIDE86);

			pushFollow(FOLLOW_month_in_indefinite_time1306);
			month87=month();
			state._fsp--;

			stream_month.add(month87.getTree());
			DIVIDE88=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_indefinite_time1308);  
			stream_DIVIDE.add(DIVIDE88);

			pushFollow(FOLLOW_day_in_indefinite_time1310);
			day89=day();
			state._fsp--;

			stream_day.add(day89.getTree());
			// AST REWRITE
			// elements: day, month, DIVIDE, DIVIDE, year
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 203:7: -> ^( TOK_DATE year DIVIDE month DIVIDE day )
			{
				// SelectClauseParser.g:203:10: ^( TOK_DATE year DIVIDE month DIVIDE day )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DATE, "TOK_DATE"), root_1);
				adaptor.addChild(root_1, stream_year.nextTree());
				adaptor.addChild(root_1, stream_DIVIDE.nextNode());
				adaptor.addChild(root_1, stream_month.nextTree());
				adaptor.addChild(root_1, stream_DIVIDE.nextNode());
				adaptor.addChild(root_1, stream_day.nextTree());
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
	// $ANTLR end "indefinite_time"


	public static class explicit_time_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "explicit_time"
	// SelectClauseParser.g:206:1: explicit_time : hour ( COLON )? minute ( ( COLON )? second )? -> ^( TOK_TIME hour minute ( second )? ) ;
	public final HiveParser_SelectClauseParser.explicit_time_return explicit_time() throws RecognitionException {
		HiveParser_SelectClauseParser.explicit_time_return retval = new HiveParser_SelectClauseParser.explicit_time_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON91=null;
		Token COLON93=null;
		ParserRuleReturnScope hour90 =null;
		ParserRuleReturnScope minute92 =null;
		ParserRuleReturnScope second94 =null;

		CommonTree COLON91_tree=null;
		CommonTree COLON93_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_minute=new RewriteRuleSubtreeStream(adaptor,"rule minute");
		RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second");
		RewriteRuleSubtreeStream stream_hour=new RewriteRuleSubtreeStream(adaptor,"rule hour");

		try {
			// SelectClauseParser.g:207:2: ( hour ( COLON )? minute ( ( COLON )? second )? -> ^( TOK_TIME hour minute ( second )? ) )
			// SelectClauseParser.g:207:4: hour ( COLON )? minute ( ( COLON )? second )?
			{
			pushFollow(FOLLOW_hour_in_explicit_time1347);
			hour90=hour();
			state._fsp--;

			stream_hour.add(hour90.getTree());
			// SelectClauseParser.g:207:9: ( COLON )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==COLON) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// SelectClauseParser.g:207:9: COLON
					{
					COLON91=(Token)match(input,COLON,FOLLOW_COLON_in_explicit_time1349);  
					stream_COLON.add(COLON91);

					}
					break;

			}

			pushFollow(FOLLOW_minute_in_explicit_time1352);
			minute92=minute();
			state._fsp--;

			stream_minute.add(minute92.getTree());
			// SelectClauseParser.g:207:23: ( ( COLON )? second )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==COLON||(LA28_0 >= INT_00 && LA28_0 <= INT_09)||(LA28_0 >= INT_10 && LA28_0 <= INT_19)||(LA28_0 >= INT_20 && LA28_0 <= INT_29)||(LA28_0 >= INT_30 && LA28_0 <= INT_39)||(LA28_0 >= INT_40 && LA28_0 <= INT_49)||(LA28_0 >= INT_50 && LA28_0 <= INT_59)) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// SelectClauseParser.g:207:24: ( COLON )? second
					{
					// SelectClauseParser.g:207:24: ( COLON )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==COLON) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// SelectClauseParser.g:207:24: COLON
							{
							COLON93=(Token)match(input,COLON,FOLLOW_COLON_in_explicit_time1355);  
							stream_COLON.add(COLON93);

							}
							break;

					}

					pushFollow(FOLLOW_second_in_explicit_time1358);
					second94=second();
					state._fsp--;

					stream_second.add(second94.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: hour, second, minute
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 208:7: -> ^( TOK_TIME hour minute ( second )? )
			{
				// SelectClauseParser.g:208:10: ^( TOK_TIME hour minute ( second )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TIME, "TOK_TIME"), root_1);
				adaptor.addChild(root_1, stream_hour.nextTree());
				adaptor.addChild(root_1, stream_minute.nextTree());
				// SelectClauseParser.g:208:33: ( second )?
				if ( stream_second.hasNext() ) {
					adaptor.addChild(root_1, stream_second.nextTree());
				}
				stream_second.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "explicit_time"


	public static class hour_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hour"
	// SelectClauseParser.g:212:1: hour : int_00_to_23_optional_prefix -> ^( TOK_HOUR int_00_to_23_optional_prefix ) ;
	public final HiveParser_SelectClauseParser.hour_return hour() throws RecognitionException {
		HiveParser_SelectClauseParser.hour_return retval = new HiveParser_SelectClauseParser.hour_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_00_to_23_optional_prefix95 =null;

		RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");

		try {
			// SelectClauseParser.g:213:3: ( int_00_to_23_optional_prefix -> ^( TOK_HOUR int_00_to_23_optional_prefix ) )
			// SelectClauseParser.g:214:3: int_00_to_23_optional_prefix
			{
			pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hour1398);
			int_00_to_23_optional_prefix95=gHiveParser.int_00_to_23_optional_prefix();
			state._fsp--;

			stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix95.getTree());
			// AST REWRITE
			// elements: int_00_to_23_optional_prefix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 214:32: -> ^( TOK_HOUR int_00_to_23_optional_prefix )
			{
				// SelectClauseParser.g:214:35: ^( TOK_HOUR int_00_to_23_optional_prefix )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HOUR, "TOK_HOUR"), root_1);
				adaptor.addChild(root_1, stream_int_00_to_23_optional_prefix.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "hour"


	public static class minute_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "minute"
	// SelectClauseParser.g:218:1: minute : int_00_to_59_mandatory_prefix -> ^( TOK_MINUTE int_00_to_59_mandatory_prefix ) ;
	public final HiveParser_SelectClauseParser.minute_return minute() throws RecognitionException {
		HiveParser_SelectClauseParser.minute_return retval = new HiveParser_SelectClauseParser.minute_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_00_to_59_mandatory_prefix96 =null;

		RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");

		try {
			// SelectClauseParser.g:219:3: ( int_00_to_59_mandatory_prefix -> ^( TOK_MINUTE int_00_to_59_mandatory_prefix ) )
			// SelectClauseParser.g:220:3: int_00_to_59_mandatory_prefix
			{
			pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minute1425);
			int_00_to_59_mandatory_prefix96=gHiveParser.int_00_to_59_mandatory_prefix();
			state._fsp--;

			stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix96.getTree());
			// AST REWRITE
			// elements: int_00_to_59_mandatory_prefix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 220:33: -> ^( TOK_MINUTE int_00_to_59_mandatory_prefix )
			{
				// SelectClauseParser.g:220:36: ^( TOK_MINUTE int_00_to_59_mandatory_prefix )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_MINUTE, "TOK_MINUTE"), root_1);
				adaptor.addChild(root_1, stream_int_00_to_59_mandatory_prefix.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "minute"


	public static class second_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "second"
	// SelectClauseParser.g:224:1: second : int_00_to_59_mandatory_prefix -> ^( TOK_SECOND int_00_to_59_mandatory_prefix ) ;
	public final HiveParser_SelectClauseParser.second_return second() throws RecognitionException {
		HiveParser_SelectClauseParser.second_return retval = new HiveParser_SelectClauseParser.second_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_00_to_59_mandatory_prefix97 =null;

		RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");

		try {
			// SelectClauseParser.g:225:3: ( int_00_to_59_mandatory_prefix -> ^( TOK_SECOND int_00_to_59_mandatory_prefix ) )
			// SelectClauseParser.g:225:5: int_00_to_59_mandatory_prefix
			{
			pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_second1449);
			int_00_to_59_mandatory_prefix97=gHiveParser.int_00_to_59_mandatory_prefix();
			state._fsp--;

			stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix97.getTree());
			// AST REWRITE
			// elements: int_00_to_59_mandatory_prefix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 225:35: -> ^( TOK_SECOND int_00_to_59_mandatory_prefix )
			{
				// SelectClauseParser.g:225:38: ^( TOK_SECOND int_00_to_59_mandatory_prefix )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SECOND, "TOK_SECOND"), root_1);
				adaptor.addChild(root_1, stream_int_00_to_59_mandatory_prefix.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "second"


	public static class month_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "month"
	// SelectClauseParser.g:228:1: month : int_01_to_12_optional_prefix -> ^( TOK_MONTH int_01_to_12_optional_prefix ) ;
	public final HiveParser_SelectClauseParser.month_return month() throws RecognitionException {
		HiveParser_SelectClauseParser.month_return retval = new HiveParser_SelectClauseParser.month_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_01_to_12_optional_prefix98 =null;

		RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");

		try {
			// SelectClauseParser.g:229:3: ( int_01_to_12_optional_prefix -> ^( TOK_MONTH int_01_to_12_optional_prefix ) )
			// SelectClauseParser.g:229:5: int_01_to_12_optional_prefix
			{
			pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_month1470);
			int_01_to_12_optional_prefix98=gHiveParser.int_01_to_12_optional_prefix();
			state._fsp--;

			stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix98.getTree());
			// AST REWRITE
			// elements: int_01_to_12_optional_prefix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 229:34: -> ^( TOK_MONTH int_01_to_12_optional_prefix )
			{
				// SelectClauseParser.g:229:37: ^( TOK_MONTH int_01_to_12_optional_prefix )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_MONTH, "TOK_MONTH"), root_1);
				adaptor.addChild(root_1, stream_int_01_to_12_optional_prefix.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "month"


	public static class day_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "day"
	// SelectClauseParser.g:232:1: day : int_01_to_31_optional_prefix -> ^( TOK_DAY int_01_to_31_optional_prefix ) ;
	public final HiveParser_SelectClauseParser.day_return day() throws RecognitionException {
		HiveParser_SelectClauseParser.day_return retval = new HiveParser_SelectClauseParser.day_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_01_to_31_optional_prefix99 =null;

		RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");

		try {
			// SelectClauseParser.g:233:3: ( int_01_to_31_optional_prefix -> ^( TOK_DAY int_01_to_31_optional_prefix ) )
			// SelectClauseParser.g:233:5: int_01_to_31_optional_prefix
			{
			pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_day1493);
			int_01_to_31_optional_prefix99=gHiveParser.int_01_to_31_optional_prefix();
			state._fsp--;

			stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix99.getTree());
			// AST REWRITE
			// elements: int_01_to_31_optional_prefix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 233:34: -> ^( TOK_DAY int_01_to_31_optional_prefix )
			{
				// SelectClauseParser.g:233:37: ^( TOK_DAY int_01_to_31_optional_prefix )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_DAY, "TOK_DAY"), root_1);
				adaptor.addChild(root_1, stream_int_01_to_31_optional_prefix.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "day"


	public static class year_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "year"
	// SelectClauseParser.g:236:1: year : ( year_four_digits | int_00_to_99_mandatory_prefix -> ^( TOK_YEAR int_00_to_99_mandatory_prefix ) );
	public final HiveParser_SelectClauseParser.year_return year() throws RecognitionException {
		HiveParser_SelectClauseParser.year_return retval = new HiveParser_SelectClauseParser.year_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope year_four_digits100 =null;
		ParserRuleReturnScope int_00_to_99_mandatory_prefix101 =null;

		RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");

		try {
			// SelectClauseParser.g:237:3: ( year_four_digits | int_00_to_99_mandatory_prefix -> ^( TOK_YEAR int_00_to_99_mandatory_prefix ) )
			int alt29=2;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// SelectClauseParser.g:237:5: year_four_digits
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_year_four_digits_in_year1516);
					year_four_digits100=year_four_digits();
					state._fsp--;

					adaptor.addChild(root_0, year_four_digits100.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:238:5: int_00_to_99_mandatory_prefix
					{
					pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_year1522);
					int_00_to_99_mandatory_prefix101=gHiveParser.int_00_to_99_mandatory_prefix();
					state._fsp--;

					stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix101.getTree());
					// AST REWRITE
					// elements: int_00_to_99_mandatory_prefix
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 238:35: -> ^( TOK_YEAR int_00_to_99_mandatory_prefix )
					{
						// SelectClauseParser.g:238:38: ^( TOK_YEAR int_00_to_99_mandatory_prefix )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_YEAR, "TOK_YEAR"), root_1);
						adaptor.addChild(root_1, stream_int_00_to_99_mandatory_prefix.nextTree());
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

		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "year"


	public static class year_four_digits_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "year_four_digits"
	// SelectClauseParser.g:241:1: year_four_digits : int_four_digits -> ^( TOK_YEAR int_four_digits ) ;
	public final HiveParser_SelectClauseParser.year_four_digits_return year_four_digits() throws RecognitionException {
		HiveParser_SelectClauseParser.year_four_digits_return retval = new HiveParser_SelectClauseParser.year_four_digits_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope int_four_digits102 =null;

		RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");

		try {
			// SelectClauseParser.g:242:3: ( int_four_digits -> ^( TOK_YEAR int_four_digits ) )
			// SelectClauseParser.g:242:5: int_four_digits
			{
			pushFollow(FOLLOW_int_four_digits_in_year_four_digits1545);
			int_four_digits102=gHiveParser.int_four_digits();
			state._fsp--;

			stream_int_four_digits.add(int_four_digits102.getTree());
			// AST REWRITE
			// elements: int_four_digits
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 242:21: -> ^( TOK_YEAR int_four_digits )
			{
				// SelectClauseParser.g:242:24: ^( TOK_YEAR int_four_digits )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_YEAR, "TOK_YEAR"), root_1);
				adaptor.addChild(root_1, stream_int_four_digits.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "year_four_digits"


	public static class window_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_clause"
	// SelectClauseParser.g:247:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
	public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
		HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_WINDOW103=null;
		Token COMMA105=null;
		ParserRuleReturnScope window_defn104 =null;
		ParserRuleReturnScope window_defn106 =null;

		CommonTree KW_WINDOW103_tree=null;
		CommonTree COMMA105_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
		RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");

		 gParent.msgs.push("window_clause"); 
		try {
			// SelectClauseParser.g:250:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
			// SelectClauseParser.g:251:3: KW_WINDOW window_defn ( COMMA window_defn )*
			{
			KW_WINDOW103=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause1583);  
			stream_KW_WINDOW.add(KW_WINDOW103);

			pushFollow(FOLLOW_window_defn_in_window_clause1585);
			window_defn104=window_defn();
			state._fsp--;

			stream_window_defn.add(window_defn104.getTree());
			// SelectClauseParser.g:251:25: ( COMMA window_defn )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// SelectClauseParser.g:251:26: COMMA window_defn
					{
					COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause1588);  
					stream_COMMA.add(COMMA105);

					pushFollow(FOLLOW_window_defn_in_window_clause1590);
					window_defn106=window_defn();
					state._fsp--;

					stream_window_defn.add(window_defn106.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			// AST REWRITE
			// elements: window_defn, KW_WINDOW
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 251:46: -> ^( KW_WINDOW ( window_defn )+ )
			{
				// SelectClauseParser.g:251:49: ^( KW_WINDOW ( window_defn )+ )
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
	// SelectClauseParser.g:254:1: window_defn : Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) ;
	public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
		HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier107=null;
		Token KW_AS108=null;
		ParserRuleReturnScope window_specification109 =null;

		CommonTree Identifier107_tree=null;
		CommonTree KW_AS108_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");

		 gParent.msgs.push("window_defn"); 
		try {
			// SelectClauseParser.g:257:3: ( Identifier KW_AS window_specification -> ^( TOK_WINDOWDEF Identifier window_specification ) )
			// SelectClauseParser.g:258:3: Identifier KW_AS window_specification
			{
			Identifier107=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_defn1626);  
			stream_Identifier.add(Identifier107);

			KW_AS108=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn1628);  
			stream_KW_AS.add(KW_AS108);

			pushFollow(FOLLOW_window_specification_in_window_defn1630);
			window_specification109=window_specification();
			state._fsp--;

			stream_window_specification.add(window_specification109.getTree());
			// AST REWRITE
			// elements: Identifier, window_specification
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 258:41: -> ^( TOK_WINDOWDEF Identifier window_specification )
			{
				// SelectClauseParser.g:258:44: ^( TOK_WINDOWDEF Identifier window_specification )
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
	// SelectClauseParser.g:261:1: window_specification : ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) ;
	public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
		HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier110=null;
		Token LPAREN111=null;
		Token Identifier112=null;
		Token RPAREN115=null;
		ParserRuleReturnScope partitioningSpec113 =null;
		ParserRuleReturnScope window_frame114 =null;

		CommonTree Identifier110_tree=null;
		CommonTree LPAREN111_tree=null;
		CommonTree Identifier112_tree=null;
		CommonTree RPAREN115_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");

		 gParent.msgs.push("window_specification"); 
		try {
			// SelectClauseParser.g:264:3: ( ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? ) )
			// SelectClauseParser.g:265:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			{
			// SelectClauseParser.g:265:3: ( Identifier | ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Identifier) ) {
				alt34=1;
			}
			else if ( (LA34_0==LPAREN) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// SelectClauseParser.g:265:4: Identifier
					{
					Identifier110=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1666);  
					stream_Identifier.add(Identifier110);

					}
					break;
				case 2 :
					// SelectClauseParser.g:265:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					{
					// SelectClauseParser.g:265:17: ( LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					// SelectClauseParser.g:265:19: LPAREN ( Identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
					{
					LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification1672);  
					stream_LPAREN.add(LPAREN111);

					// SelectClauseParser.g:265:26: ( Identifier )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==Identifier) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// SelectClauseParser.g:265:26: Identifier
							{
							Identifier112=(Token)match(input,Identifier,FOLLOW_Identifier_in_window_specification1674);  
							stream_Identifier.add(Identifier112);

							}
							break;

					}

					// SelectClauseParser.g:265:38: ( partitioningSpec )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==KW_CLUSTER||LA32_0==KW_DISTRIBUTE||LA32_0==KW_ORDER||LA32_0==KW_PARTITION||LA32_0==KW_SORT) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// SelectClauseParser.g:265:38: partitioningSpec
							{
							pushFollow(FOLLOW_partitioningSpec_in_window_specification1677);
							partitioningSpec113=gHiveParser.partitioningSpec();
							state._fsp--;

							stream_partitioningSpec.add(partitioningSpec113.getTree());
							}
							break;

					}

					// SelectClauseParser.g:265:56: ( window_frame )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==KW_RANGE||LA33_0==KW_ROWS) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// SelectClauseParser.g:265:56: window_frame
							{
							pushFollow(FOLLOW_window_frame_in_window_specification1680);
							window_frame114=window_frame();
							state._fsp--;

							stream_window_frame.add(window_frame114.getTree());
							}
							break;

					}

					RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification1683);  
					stream_RPAREN.add(RPAREN115);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: Identifier, window_frame, partitioningSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 265:79: -> ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
			{
				// SelectClauseParser.g:265:82: ^( TOK_WINDOWSPEC ( Identifier )? ( partitioningSpec )? ( window_frame )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC"), root_1);
				// SelectClauseParser.g:265:99: ( Identifier )?
				if ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				// SelectClauseParser.g:265:111: ( partitioningSpec )?
				if ( stream_partitioningSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitioningSpec.nextTree());
				}
				stream_partitioningSpec.reset();

				// SelectClauseParser.g:265:129: ( window_frame )?
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
	// SelectClauseParser.g:268:1: window_frame : ( window_range_expression | window_value_expression );
	public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope window_range_expression116 =null;
		ParserRuleReturnScope window_value_expression117 =null;


		try {
			// SelectClauseParser.g:268:14: ( window_range_expression | window_value_expression )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==KW_ROWS) ) {
				alt35=1;
			}
			else if ( (LA35_0==KW_RANGE) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// SelectClauseParser.g:269:2: window_range_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_range_expression_in_window_frame1710);
					window_range_expression116=window_range_expression();
					state._fsp--;

					adaptor.addChild(root_0, window_range_expression116.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:270:2: window_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_value_expression_in_window_frame1715);
					window_value_expression117=window_value_expression();
					state._fsp--;

					adaptor.addChild(root_0, window_value_expression117.getTree());

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
	// SelectClauseParser.g:273:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
	public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ROWS118=null;
		Token KW_ROWS119=null;
		Token KW_BETWEEN120=null;
		Token KW_AND121=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_ROWS118_tree=null;
		CommonTree KW_ROWS119_tree=null;
		CommonTree KW_BETWEEN120_tree=null;
		CommonTree KW_AND121_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");

		 gParent.msgs.push("window_range_expression"); 
		try {
			// SelectClauseParser.g:276:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==KW_ROWS) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==KW_BETWEEN) ) {
					alt36=2;
				}
				else if ( (LA36_1==KW_CURRENT||LA36_1==KW_UNBOUNDED||LA36_1==Number) ) {
					alt36=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// SelectClauseParser.g:277:2: KW_ROWS sb= window_frame_start_boundary
					{
					KW_ROWS118=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1737);  
					stream_KW_ROWS.add(KW_ROWS118);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression1741);
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
					// 277:41: -> ^( TOK_WINDOWRANGE $sb)
					{
						// SelectClauseParser.g:277:44: ^( TOK_WINDOWRANGE $sb)
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
					// SelectClauseParser.g:278:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_ROWS119=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1755);  
					stream_KW_ROWS.add(KW_ROWS119);

					KW_BETWEEN120=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression1757);  
					stream_KW_BETWEEN.add(KW_BETWEEN120);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1761);
					s=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(s.getTree());
					KW_AND121=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression1763);  
					stream_KW_AND.add(KW_AND121);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1767);
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
					// 278:78: -> ^( TOK_WINDOWRANGE $s $end)
					{
						// SelectClauseParser.g:278:81: ^( TOK_WINDOWRANGE $s $end)
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
	// SelectClauseParser.g:281:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
	public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_RANGE122=null;
		Token KW_RANGE123=null;
		Token KW_BETWEEN124=null;
		Token KW_AND125=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_RANGE122_tree=null;
		CommonTree KW_RANGE123_tree=null;
		CommonTree KW_BETWEEN124_tree=null;
		CommonTree KW_AND125_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");

		 gParent.msgs.push("window_value_expression"); 
		try {
			// SelectClauseParser.g:284:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==KW_RANGE) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==KW_BETWEEN) ) {
					alt37=2;
				}
				else if ( (LA37_1==KW_CURRENT||LA37_1==KW_UNBOUNDED||LA37_1==Number) ) {
					alt37=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// SelectClauseParser.g:285:2: KW_RANGE sb= window_frame_start_boundary
					{
					KW_RANGE122=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1801);  
					stream_KW_RANGE.add(KW_RANGE122);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression1805);
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
					// 285:42: -> ^( TOK_WINDOWVALUES $sb)
					{
						// SelectClauseParser.g:285:45: ^( TOK_WINDOWVALUES $sb)
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
					// SelectClauseParser.g:286:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_RANGE123=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1819);  
					stream_KW_RANGE.add(KW_RANGE123);

					KW_BETWEEN124=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1821);  
					stream_KW_BETWEEN.add(KW_BETWEEN124);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1825);
					s=window_frame_boundary();
					state._fsp--;

					stream_window_frame_boundary.add(s.getTree());
					KW_AND125=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1827);  
					stream_KW_AND.add(KW_AND125);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1831);
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
					// 286:79: -> ^( TOK_WINDOWVALUES $s $end)
					{
						// SelectClauseParser.g:286:82: ^( TOK_WINDOWVALUES $s $end)
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
	// SelectClauseParser.g:289:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
	public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_UNBOUNDED126=null;
		Token KW_PRECEDING127=null;
		Token KW_CURRENT128=null;
		Token KW_ROW129=null;
		Token Number130=null;
		Token KW_PRECEDING131=null;

		CommonTree KW_UNBOUNDED126_tree=null;
		CommonTree KW_PRECEDING127_tree=null;
		CommonTree KW_CURRENT128_tree=null;
		CommonTree KW_ROW129_tree=null;
		CommonTree Number130_tree=null;
		CommonTree KW_PRECEDING131_tree=null;
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

		 gParent.msgs.push("windowframestartboundary"); 
		try {
			// SelectClauseParser.g:292:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
			int alt38=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt38=1;
				}
				break;
			case KW_CURRENT:
				{
				alt38=2;
				}
				break;
			case Number:
				{
				alt38=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// SelectClauseParser.g:293:3: KW_UNBOUNDED KW_PRECEDING
					{
					KW_UNBOUNDED126=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1866);  
					stream_KW_UNBOUNDED.add(KW_UNBOUNDED126);

					KW_PRECEDING127=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1868);  
					stream_KW_PRECEDING.add(KW_PRECEDING127);

					// AST REWRITE
					// elements: KW_PRECEDING, KW_UNBOUNDED
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 293:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
					{
						// SelectClauseParser.g:293:33: ^( KW_PRECEDING KW_UNBOUNDED )
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
					// SelectClauseParser.g:294:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT128=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1884);  
					stream_KW_CURRENT.add(KW_CURRENT128);

					KW_ROW129=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1886);  
					stream_KW_ROW.add(KW_ROW129);

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
					// 294:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:294:25: ^( KW_CURRENT )
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
					// SelectClauseParser.g:295:3: Number KW_PRECEDING
					{
					Number130=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1899);  
					stream_Number.add(Number130);

					KW_PRECEDING131=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1901);  
					stream_KW_PRECEDING.add(KW_PRECEDING131);

					// AST REWRITE
					// elements: KW_PRECEDING, Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 295:23: -> ^( KW_PRECEDING Number )
					{
						// SelectClauseParser.g:295:26: ^( KW_PRECEDING Number )
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
	// SelectClauseParser.g:298:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
	public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token r=null;
		Token d=null;
		Token KW_UNBOUNDED132=null;
		Token KW_CURRENT133=null;
		Token KW_ROW134=null;
		Token Number135=null;

		CommonTree r_tree=null;
		CommonTree d_tree=null;
		CommonTree KW_UNBOUNDED132_tree=null;
		CommonTree KW_CURRENT133_tree=null;
		CommonTree KW_ROW134_tree=null;
		CommonTree Number135_tree=null;
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");

		 gParent.msgs.push("windowframeboundary"); 
		try {
			// SelectClauseParser.g:301:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
			int alt41=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt41=1;
				}
				break;
			case KW_CURRENT:
				{
				alt41=2;
				}
				break;
			case Number:
				{
				alt41=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// SelectClauseParser.g:302:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
					{
					KW_UNBOUNDED132=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1932);  
					stream_KW_UNBOUNDED.add(KW_UNBOUNDED132);

					// SelectClauseParser.g:302:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==KW_PRECEDING) ) {
						alt39=1;
					}
					else if ( (LA39_0==KW_FOLLOWING) ) {
						alt39=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// SelectClauseParser.g:302:17: r= KW_PRECEDING
							{
							r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1937);  
							stream_KW_PRECEDING.add(r);

							}
							break;
						case 2 :
							// SelectClauseParser.g:302:32: r= KW_FOLLOWING
							{
							r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1941);  
							stream_KW_FOLLOWING.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: r, KW_UNBOUNDED
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 302:49: -> ^( $r KW_UNBOUNDED )
					{
						// SelectClauseParser.g:302:52: ^( $r KW_UNBOUNDED )
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
					// SelectClauseParser.g:303:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT133=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1959);  
					stream_KW_CURRENT.add(KW_CURRENT133);

					KW_ROW134=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1961);  
					stream_KW_ROW.add(KW_ROW134);

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
					// 303:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:303:25: ^( KW_CURRENT )
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
					// SelectClauseParser.g:304:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
					{
					Number135=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1974);  
					stream_Number.add(Number135);

					// SelectClauseParser.g:304:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==KW_PRECEDING) ) {
						alt40=1;
					}
					else if ( (LA40_0==KW_FOLLOWING) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// SelectClauseParser.g:304:11: d= KW_PRECEDING
							{
							d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1979);  
							stream_KW_PRECEDING.add(d);

							}
							break;
						case 2 :
							// SelectClauseParser.g:304:28: d= KW_FOLLOWING
							{
							d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1985);  
							stream_KW_FOLLOWING.add(d);

							}
							break;

					}

					// AST REWRITE
					// elements: Number, d
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 304:45: -> ^( $d Number )
					{
						// SelectClauseParser.g:304:48: ^( $d Number )
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
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA7_eotS =
		"\u008d\uffff";
	static final String DFA7_eofS =
		"\1\uffff\2\3\u008a\uffff";
	static final String DFA7_minS =
		"\1\u008f\2\14\23\uffff\1\11\45\uffff\1\11\120\uffff";
	static final String DFA7_maxS =
		"\1\u0186\2\u019b\23\uffff\1\u044e\45\uffff\1\u044e\120\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\1\24\uffff\1\2\164\uffff";
	static final String DFA7_specialS =
		"\u008d\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\1\3\uffff\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5"+
			"\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\u008d\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff"+
			"\1\30\12\uffff\1\3\1\30\24\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff"+
			"\1\3\16\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\26\17\uffff"+
			"\1\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30"+
			"\1\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\25\uffff\1\3",
			"\1\3\u008d\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff"+
			"\1\30\12\uffff\1\3\1\30\24\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff"+
			"\1\3\16\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\74\17\uffff"+
			"\1\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30"+
			"\1\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\25\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\6\uffff\1\3\170\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\25\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
			"\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\14\3\1\uffff\4\3\1\uffff"+
			"\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\14\3\1\uffff\16\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1"+
			"\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1"+
			"\3\1\uffff\1\30\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\10\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\21\uffff\1\3\5\uffff\1\3\u0160"+
			"\uffff\2\3\6\uffff\1\3\u0121\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\6\uffff\1\3\170\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\25\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
			"\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\14\3\1\uffff\4\3\1\uffff"+
			"\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\14\3\1\uffff\16\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1"+
			"\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1"+
			"\3\1\uffff\1\30\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\10\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\21\uffff\1\3\5\uffff\1\3\u0160"+
			"\uffff\2\3\6\uffff\1\3\u0121\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
		"\2\14\1\uffff\1\14\3\uffff\1\14\1\uffff\1\14\1\uffff\4\14\1\uffff\2\14"+
		"\u00d0\uffff";
	static final String DFA16_maxS =
		"\2\u019b\1\uffff\1\u019b\3\uffff\1\u019b\1\uffff\1\u019b\1\uffff\4\u019b"+
		"\1\uffff\2\u019b\u00d0\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\1\1\uffff\1\3\22\uffff\1\2\u00ca\uffff";
	static final String DFA16_specialS =
		"\u00e2\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\4\u0082\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\1\13\2\2\uffff"+
			"\1\2\1\13\3\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff"+
			"\1\14\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2"+
			"\1\uffff\3\2\1\4\1\2\1\uffff\2\2\1\7\1\2\1\4\2\2\1\uffff\4\2\1\uffff"+
			"\6\2\1\21\5\2\1\uffff\2\2\1\3\1\2\1\uffff\1\2\1\16\10\2\1\uffff\1\4\3"+
			"\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\11\4\2\1\uffff\1"+
			"\2\1\uffff\5\2\2\uffff\14\2\1\4\16\2\1\4\13\2\1\15\11\2\1\uffff\4\2\1"+
			"\uffff\4\2\1\uffff\4\2\1\uffff\1\2\1\20\1\2\1\uffff\12\2\1\uffff\1\2"+
			"\1\uffff\1\4\1\2\1\4\1\2\24\uffff\1\4",
			"\1\2\u0082\uffff\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5"+
			"\2\1\uffff\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\5\2\1\uffff"+
			"\7\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\1\uffff\4\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5"+
			"\2\2\uffff\61\2\1\uffff\4\2\1\uffff\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff"+
			"\12\2\1\uffff\1\2\1\uffff\4\2\3\uffff\1\27\20\uffff\1\2",
			"",
			"\1\2\u009d\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1"+
			"\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff\1\2\32"+
			"\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\15\uffff\1\4\1\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"",
			"",
			"",
			"\1\2\u0098\uffff\1\4\4\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1"+
			"\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"",
			"\1\2\u0098\uffff\1\4\4\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1"+
			"\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"",
			"\1\2\u0098\uffff\1\4\4\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1"+
			"\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"\1\2\u0098\uffff\1\4\4\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1"+
			"\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"\1\2\u0098\uffff\1\4\4\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1"+
			"\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"\1\2\u009d\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1"+
			"\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff\1\2\32"+
			"\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff\1\2\1\uffff"+
			"\1\2\20\uffff\1\4\4\uffff\1\2",
			"",
			"\1\2\u0088\uffff\1\4\24\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff"+
			"\1\2\1\uffff\1\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17"+
			"\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2\17\uffff"+
			"\1\2\1\uffff\1\2\25\uffff\1\2",
			"\1\2\u009d\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1"+
			"\2\16\uffff\1\2\2\uffff\1\4\5\uffff\1\2\3\uffff\1\2\11\uffff\1\2\17\uffff"+
			"\1\2\5\uffff\1\4\24\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff\1\2"+
			"\17\uffff\1\2\1\uffff\1\2\25\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "130:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
		}
	}

	static final String DFA14_eotS =
		"\u00ce\uffff";
	static final String DFA14_eofS =
		"\1\uffff\1\2\3\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2"+
		"\4\u00ba\uffff";
	static final String DFA14_minS =
		"\1\u008f\1\14\3\uffff\1\14\3\uffff\1\14\1\uffff\1\14\1\uffff\4\14\1\uffff"+
		"\2\14\u00ba\uffff";
	static final String DFA14_maxS =
		"\1\u0186\1\u019b\3\uffff\1\u019b\3\uffff\1\u019b\1\uffff\1\u019b\1\uffff"+
		"\4\u019b\1\uffff\2\u019b\u00ba\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\uffff\1\1\u00c9\uffff";
	static final String DFA14_specialS =
		"\u00ce\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\2\3\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\1\13\2\2\uffff\5\2\1\uffff"+
			"\6\2\1\uffff\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\2"+
			"\uffff\3\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1"+
			"\2\1\uffff\5\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
			"\1\2",
			"\1\2\u0082\uffff\1\4\3\uffff\2\4\1\uffff\2\4\1\uffff\16\4\2\uffff\1"+
			"\4\1\15\3\4\1\uffff\6\4\1\uffff\1\4\1\uffff\2\4\1\uffff\16\4\1\uffff"+
			"\1\16\2\4\2\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\7\4"+
			"\1\uffff\3\4\1\2\1\4\1\uffff\2\4\1\11\1\4\1\2\2\4\1\uffff\4\4\1\uffff"+
			"\6\4\1\23\5\4\1\uffff\2\4\1\5\1\4\1\uffff\1\4\1\20\10\4\1\uffff\1\2\3"+
			"\4\1\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\13\4\4\1\uffff\1"+
			"\4\1\uffff\5\4\2\uffff\14\4\1\2\16\4\1\2\13\4\1\17\11\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\4\4\1\uffff\1\4\1\22\1\4\1\uffff\12\4\1\uffff\1\4"+
			"\1\uffff\1\2\1\4\1\2\1\4\24\uffff\1\2",
			"",
			"",
			"",
			"\1\4\u009d\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1\4\1\uffff\1"+
			"\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff\1\4\32"+
			"\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\15\uffff\1\2\1\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"",
			"",
			"",
			"\1\4\u0098\uffff\1\2\4\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1"+
			"\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"",
			"\1\4\u0098\uffff\1\2\4\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1"+
			"\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"",
			"\1\4\u0098\uffff\1\2\4\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1"+
			"\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"\1\4\u0098\uffff\1\2\4\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1"+
			"\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"\1\4\u0098\uffff\1\2\4\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1"+
			"\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"\1\4\u009d\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1\4\1\uffff\1"+
			"\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff\1\4\32"+
			"\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff\1\4\1\uffff"+
			"\1\4\20\uffff\1\2\4\uffff\1\4",
			"",
			"\1\4\u0088\uffff\1\2\24\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff"+
			"\1\4\1\uffff\1\4\16\uffff\1\4\10\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17"+
			"\uffff\1\4\32\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4\17\uffff"+
			"\1\4\1\uffff\1\4\25\uffff\1\4",
			"\1\4\u009d\uffff\1\4\37\uffff\1\4\32\uffff\1\4\4\uffff\1\4\1\uffff\1"+
			"\4\16\uffff\1\4\2\uffff\1\2\5\uffff\1\4\3\uffff\1\4\11\uffff\1\4\17\uffff"+
			"\1\4\5\uffff\1\2\24\uffff\1\4\16\uffff\1\4\13\uffff\1\4\32\uffff\1\4"+
			"\17\uffff\1\4\1\uffff\1\4\25\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "130:9: ( KW_AS )?";
		}
	}

	static final String DFA19_eotS =
		"\u008d\uffff";
	static final String DFA19_eofS =
		"\1\uffff\2\3\u008a\uffff";
	static final String DFA19_minS =
		"\1\u008f\2\14\23\uffff\1\11\45\uffff\1\11\120\uffff";
	static final String DFA19_maxS =
		"\1\u0186\2\u019b\23\uffff\1\u044e\45\uffff\1\u044e\120\uffff";
	static final String DFA19_acceptS =
		"\3\uffff\1\1\24\uffff\1\2\164\uffff";
	static final String DFA19_specialS =
		"\u008d\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\3\uffff\2\2\1\uffff\2\2\1\uffff\16\2\2\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\1\2\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\7\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\14\2\1\uffff\4\2\1\uffff\12\2\2\uffff\3\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5"+
			"\2\2\uffff\14\2\1\uffff\16\2\1\uffff\25\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
			"\1\3\u008d\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff"+
			"\1\30\12\uffff\1\3\1\30\24\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff"+
			"\1\3\16\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\26\17\uffff"+
			"\1\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30"+
			"\1\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\25\uffff\1\3",
			"\1\3\u008d\uffff\1\30\4\uffff\3\30\10\uffff\1\3\21\uffff\2\30\1\uffff"+
			"\1\30\12\uffff\1\3\1\30\24\uffff\1\30\4\uffff\1\3\4\uffff\1\3\1\uffff"+
			"\1\3\16\uffff\1\3\1\30\7\uffff\1\3\3\uffff\1\3\11\uffff\1\74\17\uffff"+
			"\1\3\30\uffff\1\3\1\uffff\1\3\12\uffff\1\3\3\uffff\1\3\12\uffff\1\30"+
			"\1\3\5\uffff\2\30\10\uffff\2\30\11\uffff\1\3\1\30\13\uffff\1\30\2\uffff"+
			"\1\3\1\uffff\1\3\25\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\6\uffff\1\3\170\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\25\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
			"\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\14\3\1\uffff\4\3\1\uffff"+
			"\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\14\3\1\uffff\16\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1"+
			"\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1"+
			"\3\1\uffff\1\30\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\10\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\21\uffff\1\3\5\uffff\1\3\u0160"+
			"\uffff\2\3\6\uffff\1\3\u0121\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\5\uffff\1\3\6\uffff\1\3\170\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\25\3\1\uffff\6\3\1\uffff\1\3\1\uffff\2\3\1\uffff\16\3\1\uffff"+
			"\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff"+
			"\3\3\1\uffff\1\3\1\uffff\4\3\1\uffff\7\3\1\uffff\14\3\1\uffff\4\3\1\uffff"+
			"\12\3\1\uffff\4\3\1\uffff\7\3\1\uffff\1\3\1\uffff\6\3\1\uffff\1\3\1\uffff"+
			"\5\3\2\uffff\14\3\1\uffff\16\3\1\uffff\25\3\1\uffff\4\3\1\uffff\4\3\1"+
			"\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1"+
			"\3\1\uffff\1\30\1\uffff\1\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\10\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\1\3\4\uffff\1\3\21\uffff\1\3\5\uffff\1\3\u0160"+
			"\uffff\2\3\6\uffff\1\3\u0121\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "142:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA22_eotS =
		"\u01e2\uffff";
	static final String DFA22_eofS =
		"\3\uffff\2\1\15\uffff\2\1\1\uffff\1\1\1\uffff\4\1\u01c7\uffff";
	static final String DFA22_minS =
		"\1\11\2\uffff\2\4\15\uffff\2\4\1\uffff\1\4\1\uffff\4\4\5\uffff\1\u008f"+
		"\60\uffff\1\u008f\55\uffff\1\u008f\56\uffff\1\u008f\57\uffff\1\u008f\56"+
		"\uffff\1\u008f\56\uffff\1\u008f\56\uffff\1\u008f\56\uffff\1\u008f\107"+
		"\uffff";
	static final String DFA22_maxS =
		"\1\u044e\2\uffff\1\u01a1\1\u01a4\15\uffff\2\u01a1\1\uffff\1\u01a1\1\uffff"+
		"\4\u01a1\5\uffff\1\u01a1\60\uffff\1\u01a1\55\uffff\1\u01a1\56\uffff\1"+
		"\u01a1\57\uffff\1\u01a1\56\uffff\1\u01a1\56\uffff\1\u01a1\56\uffff\1\u01a1"+
		"\56\uffff\1\u01a1\107\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\34\uffff\1\2\u01a9\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff"+
		"\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1";
	static final String DFA22_specialS =
		"\u01e2\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\5\uffff\1\1\6\uffff\1\1\170\uffff\1\31\3\uffff\2\32\1\uffff\2\32"+
			"\1\uffff\1\32\1\25\14\32\2\1\5\32\1\uffff\6\32\1\uffff\1\32\1\uffff\2"+
			"\32\1\uffff\1\32\1\4\14\32\1\uffff\3\32\2\uffff\1\32\1\uffff\1\32\1\uffff"+
			"\1\32\1\uffff\4\32\1\uffff\1\32\1\23\5\32\1\uffff\3\32\1\uffff\1\32\1"+
			"\uffff\4\32\1\uffff\2\32\1\1\4\32\1\uffff\14\32\1\uffff\4\32\1\uffff"+
			"\12\32\1\uffff\1\1\3\32\1\uffff\2\32\1\1\1\32\1\3\2\32\1\uffff\1\32\1"+
			"\uffff\6\32\1\uffff\1\32\1\uffff\5\32\2\uffff\14\32\1\uffff\16\32\1\uffff"+
			"\22\32\1\27\2\32\1\uffff\4\32\1\uffff\4\32\1\uffff\1\32\1\22\2\32\1\uffff"+
			"\2\32\1\30\1\uffff\12\32\1\uffff\1\32\2\uffff\1\32\1\uffff\1\32\3\uffff"+
			"\1\1\4\uffff\1\1\6\uffff\1\1\1\uffff\1\1\10\uffff\1\36\1\uffff\2\1\1"+
			"\uffff\1\1\4\uffff\1\1\21\uffff\1\1\5\uffff\1\1\u0160\uffff\2\1\6\uffff"+
			"\1\1\u0121\uffff\1\1",
			"",
			"",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\40\2\uffff\2\1\3"+
			"\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\121\2\uffff\2\1\3"+
			"\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1\2\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\177\2\uffff\2\1\3"+
			"\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u00ae\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u00de\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u010d\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u013c\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u016b\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\u019a\2\uffff\2\1"+
			"\3\uffff\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\4\1\1\uffff\14\1\1\uffff\4\1\1\uffff\12\1\1\uffff\4\1\1\uffff\7\1\1"+
			"\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff\4\1\1\uffff"+
			"\4\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
			"\4\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\5\uffff"+
			"\1\1",
			"",
			"",
			"",
			"",
			"",
			"\1\u01c8\3\uffff\2\u01c9\1\uffff\2\u01c9\1\uffff\16\u01c9\2\uffff\5"+
			"\u01c9\1\uffff\6\u01c9\1\uffff\1\u01c9\1\uffff\2\u01c9\1\uffff\16\u01c9"+
			"\1\uffff\3\u01c9\2\uffff\1\u01c9\1\uffff\1\u01c9\1\uffff\1\u01c9\1\uffff"+
			"\4\u01c9\1\uffff\7\u01c9\1\uffff\3\u01c9\1\uffff\1\u01c9\1\uffff\4\u01c9"+
			"\1\uffff\2\u01c9\1\uffff\4\u01c9\1\uffff\14\u01c9\1\uffff\4\u01c9\1\uffff"+
			"\12\u01c9\2\uffff\3\u01c9\1\uffff\2\u01c9\1\uffff\4\u01c9\1\uffff\1\u01c9"+
			"\1\uffff\6\u01c9\1\uffff\1\u01c9\1\uffff\5\u01c9\2\uffff\14\u01c9\1\uffff"+
			"\16\u01c9\1\uffff\25\u01c9\1\uffff\4\u01c9\1\uffff\4\u01c9\1\uffff\4"+
			"\u01c9\1\uffff\3\u01c9\1\uffff\12\u01c9\1\uffff\1\u01c9\2\uffff\1\u01c9"+
			"\1\uffff\1\u01c9\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01cb\3\uffff\2\u01cc\1\uffff\2\u01cc\1\uffff\16\u01cc\2\uffff\5"+
			"\u01cc\1\uffff\6\u01cc\1\uffff\1\u01cc\1\uffff\2\u01cc\1\uffff\16\u01cc"+
			"\1\uffff\3\u01cc\2\uffff\1\u01cc\1\uffff\1\u01cc\1\uffff\1\u01cc\1\uffff"+
			"\4\u01cc\1\uffff\7\u01cc\1\uffff\3\u01cc\1\uffff\1\u01cc\1\uffff\4\u01cc"+
			"\1\uffff\2\u01cc\1\uffff\4\u01cc\1\uffff\14\u01cc\1\uffff\4\u01cc\1\uffff"+
			"\12\u01cc\2\uffff\3\u01cc\1\uffff\2\u01cc\1\uffff\4\u01cc\1\uffff\1\u01cc"+
			"\1\uffff\6\u01cc\1\uffff\1\u01cc\1\uffff\5\u01cc\2\uffff\14\u01cc\1\uffff"+
			"\16\u01cc\1\uffff\25\u01cc\1\uffff\4\u01cc\1\uffff\4\u01cc\1\uffff\4"+
			"\u01cc\1\uffff\3\u01cc\1\uffff\12\u01cc\1\uffff\1\u01cc\2\uffff\1\u01cc"+
			"\1\uffff\1\u01cc\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01ce\3\uffff\2\u01cf\1\uffff\2\u01cf\1\uffff\16\u01cf\2\uffff\5"+
			"\u01cf\1\uffff\6\u01cf\1\uffff\1\u01cf\1\uffff\2\u01cf\1\uffff\16\u01cf"+
			"\1\uffff\3\u01cf\2\uffff\1\u01cf\1\uffff\1\u01cf\1\uffff\1\u01cf\1\uffff"+
			"\4\u01cf\1\uffff\7\u01cf\1\uffff\3\u01cf\1\uffff\1\u01cf\1\uffff\4\u01cf"+
			"\1\uffff\2\u01cf\1\uffff\4\u01cf\1\uffff\14\u01cf\1\uffff\4\u01cf\1\uffff"+
			"\12\u01cf\2\uffff\3\u01cf\1\uffff\2\u01cf\1\uffff\4\u01cf\1\uffff\1\u01cf"+
			"\1\uffff\6\u01cf\1\uffff\1\u01cf\1\uffff\5\u01cf\2\uffff\14\u01cf\1\uffff"+
			"\16\u01cf\1\uffff\25\u01cf\1\uffff\4\u01cf\1\uffff\4\u01cf\1\uffff\4"+
			"\u01cf\1\uffff\3\u01cf\1\uffff\12\u01cf\1\uffff\1\u01cf\2\uffff\1\u01cf"+
			"\1\uffff\1\u01cf\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d1\3\uffff\2\u01d2\1\uffff\2\u01d2\1\uffff\16\u01d2\2\uffff\5"+
			"\u01d2\1\uffff\6\u01d2\1\uffff\1\u01d2\1\uffff\2\u01d2\1\uffff\16\u01d2"+
			"\1\uffff\3\u01d2\2\uffff\1\u01d2\1\uffff\1\u01d2\1\uffff\1\u01d2\1\uffff"+
			"\4\u01d2\1\uffff\7\u01d2\1\uffff\3\u01d2\1\uffff\1\u01d2\1\uffff\4\u01d2"+
			"\1\uffff\2\u01d2\1\uffff\4\u01d2\1\uffff\14\u01d2\1\uffff\4\u01d2\1\uffff"+
			"\12\u01d2\2\uffff\3\u01d2\1\uffff\2\u01d2\1\uffff\4\u01d2\1\uffff\1\u01d2"+
			"\1\uffff\6\u01d2\1\uffff\1\u01d2\1\uffff\5\u01d2\2\uffff\14\u01d2\1\uffff"+
			"\16\u01d2\1\uffff\25\u01d2\1\uffff\4\u01d2\1\uffff\4\u01d2\1\uffff\4"+
			"\u01d2\1\uffff\3\u01d2\1\uffff\12\u01d2\1\uffff\1\u01d2\2\uffff\1\u01d2"+
			"\1\uffff\1\u01d2\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d4\3\uffff\2\u01d5\1\uffff\2\u01d5\1\uffff\16\u01d5\2\uffff\5"+
			"\u01d5\1\uffff\6\u01d5\1\uffff\1\u01d5\1\uffff\2\u01d5\1\uffff\16\u01d5"+
			"\1\uffff\3\u01d5\2\uffff\1\u01d5\1\uffff\1\u01d5\1\uffff\1\u01d5\1\uffff"+
			"\4\u01d5\1\uffff\7\u01d5\1\uffff\3\u01d5\1\uffff\1\u01d5\1\uffff\4\u01d5"+
			"\1\uffff\2\u01d5\1\uffff\4\u01d5\1\uffff\14\u01d5\1\uffff\4\u01d5\1\uffff"+
			"\12\u01d5\2\uffff\3\u01d5\1\uffff\2\u01d5\1\uffff\4\u01d5\1\uffff\1\u01d5"+
			"\1\uffff\6\u01d5\1\uffff\1\u01d5\1\uffff\5\u01d5\2\uffff\14\u01d5\1\uffff"+
			"\16\u01d5\1\uffff\25\u01d5\1\uffff\4\u01d5\1\uffff\4\u01d5\1\uffff\4"+
			"\u01d5\1\uffff\3\u01d5\1\uffff\12\u01d5\1\uffff\1\u01d5\2\uffff\1\u01d5"+
			"\1\uffff\1\u01d5\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d7\3\uffff\2\u01d8\1\uffff\2\u01d8\1\uffff\16\u01d8\2\uffff\5"+
			"\u01d8\1\uffff\6\u01d8\1\uffff\1\u01d8\1\uffff\2\u01d8\1\uffff\16\u01d8"+
			"\1\uffff\3\u01d8\2\uffff\1\u01d8\1\uffff\1\u01d8\1\uffff\1\u01d8\1\uffff"+
			"\4\u01d8\1\uffff\7\u01d8\1\uffff\3\u01d8\1\uffff\1\u01d8\1\uffff\4\u01d8"+
			"\1\uffff\2\u01d8\1\uffff\4\u01d8\1\uffff\14\u01d8\1\uffff\4\u01d8\1\uffff"+
			"\12\u01d8\2\uffff\3\u01d8\1\uffff\2\u01d8\1\uffff\4\u01d8\1\uffff\1\u01d8"+
			"\1\uffff\6\u01d8\1\uffff\1\u01d8\1\uffff\5\u01d8\2\uffff\14\u01d8\1\uffff"+
			"\16\u01d8\1\uffff\25\u01d8\1\uffff\4\u01d8\1\uffff\4\u01d8\1\uffff\4"+
			"\u01d8\1\uffff\3\u01d8\1\uffff\12\u01d8\1\uffff\1\u01d8\2\uffff\1\u01d8"+
			"\1\uffff\1\u01d8\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01da\3\uffff\2\u01db\1\uffff\2\u01db\1\uffff\16\u01db\2\uffff\5"+
			"\u01db\1\uffff\6\u01db\1\uffff\1\u01db\1\uffff\2\u01db\1\uffff\16\u01db"+
			"\1\uffff\3\u01db\2\uffff\1\u01db\1\uffff\1\u01db\1\uffff\1\u01db\1\uffff"+
			"\4\u01db\1\uffff\7\u01db\1\uffff\3\u01db\1\uffff\1\u01db\1\uffff\4\u01db"+
			"\1\uffff\2\u01db\1\uffff\4\u01db\1\uffff\14\u01db\1\uffff\4\u01db\1\uffff"+
			"\12\u01db\2\uffff\3\u01db\1\uffff\2\u01db\1\uffff\4\u01db\1\uffff\1\u01db"+
			"\1\uffff\6\u01db\1\uffff\1\u01db\1\uffff\5\u01db\2\uffff\14\u01db\1\uffff"+
			"\16\u01db\1\uffff\25\u01db\1\uffff\4\u01db\1\uffff\4\u01db\1\uffff\4"+
			"\u01db\1\uffff\3\u01db\1\uffff\12\u01db\1\uffff\1\u01db\2\uffff\1\u01db"+
			"\1\uffff\1\u01db\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01dd\3\uffff\2\u01de\1\uffff\2\u01de\1\uffff\16\u01de\2\uffff\5"+
			"\u01de\1\uffff\6\u01de\1\uffff\1\u01de\1\uffff\2\u01de\1\uffff\16\u01de"+
			"\1\uffff\3\u01de\2\uffff\1\u01de\1\uffff\1\u01de\1\uffff\1\u01de\1\uffff"+
			"\4\u01de\1\uffff\7\u01de\1\uffff\3\u01de\1\uffff\1\u01de\1\uffff\4\u01de"+
			"\1\uffff\2\u01de\1\uffff\4\u01de\1\uffff\14\u01de\1\uffff\4\u01de\1\uffff"+
			"\12\u01de\2\uffff\3\u01de\1\uffff\2\u01de\1\uffff\4\u01de\1\uffff\1\u01de"+
			"\1\uffff\6\u01de\1\uffff\1\u01de\1\uffff\5\u01de\2\uffff\14\u01de\1\uffff"+
			"\16\u01de\1\uffff\25\u01de\1\uffff\4\u01de\1\uffff\4\u01de\1\uffff\4"+
			"\u01de\1\uffff\3\u01de\1\uffff\12\u01de\1\uffff\1\u01de\2\uffff\1\u01de"+
			"\1\uffff\1\u01de\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01e0\3\uffff\2\u01e1\1\uffff\2\u01e1\1\uffff\16\u01e1\2\uffff\5"+
			"\u01e1\1\uffff\6\u01e1\1\uffff\1\u01e1\1\uffff\2\u01e1\1\uffff\16\u01e1"+
			"\1\uffff\3\u01e1\2\uffff\1\u01e1\1\uffff\1\u01e1\1\uffff\1\u01e1\1\uffff"+
			"\4\u01e1\1\uffff\7\u01e1\1\uffff\3\u01e1\1\uffff\1\u01e1\1\uffff\4\u01e1"+
			"\1\uffff\2\u01e1\1\uffff\4\u01e1\1\uffff\14\u01e1\1\uffff\4\u01e1\1\uffff"+
			"\12\u01e1\2\uffff\3\u01e1\1\uffff\2\u01e1\1\uffff\4\u01e1\1\uffff\1\u01e1"+
			"\1\uffff\6\u01e1\1\uffff\1\u01e1\1\uffff\5\u01e1\2\uffff\14\u01e1\1\uffff"+
			"\16\u01e1\1\uffff\25\u01e1\1\uffff\4\u01e1\1\uffff\4\u01e1\1\uffff\4"+
			"\u01e1\1\uffff\3\u01e1\1\uffff\12\u01e1\1\uffff\1\u01e1\2\uffff\1\u01e1"+
			"\1\uffff\1\u01e1\32\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "147:1: selectExpression : ( expression | tableAllColumns );";
		}
	}

	static final String DFA29_eotS =
		"\75\uffff";
	static final String DFA29_eofS =
		"\75\uffff";
	static final String DFA29_minS =
		"\1\42\6\23\66\uffff";
	static final String DFA29_maxS =
		"\1\u008e\6\u019b\66\uffff";
	static final String DFA29_acceptS =
		"\7\uffff\1\1\5\uffff\1\2\57\uffff";
	static final String DFA29_specialS =
		"\75\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\1\11\2\1\uffff\3\2\7\3\1\uffff\4\3\6\4\1\uffff\2\4\10\5\1\uffff\12"+
			"\5\1\uffff\12\5\1\uffff\12\6\1\uffff\12\6\1\uffff\12\6\1\uffff\12\6",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"\1\15\16\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12"+
			"\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\1\uffff\12\7\u0100"+
			"\uffff\1\15\13\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "236:1: year : ( year_four_digits | int_00_to_99_mandatory_prefix -> ^( TOK_YEAR int_00_to_99_mandatory_prefix ) );";
		}
	}

	public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0x0000000000488200L,0x0000000000000000L,0xFB5FBFFFFEF88000L,0xFFEFEF5DFDEA9FFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDFF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_hintClause_in_selectClause73 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFEF88000L,0xFFEFEF5DFDEA9FFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDFF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x1000000000000100L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_hintClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_PLUS_in_hintClause424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008200000000000L,0x0000000000080000L,0x0000000020000000L});
	public static final BitSet FOLLOW_hintList_in_hintClause426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_hintClause428 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintItem_in_hintList469 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_hintList472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008200000000000L,0x0000000000080000L,0x0000000020000000L});
	public static final BitSet FOLLOW_hintItem_in_hintList474 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_hintName_in_hintItem512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_hintItem515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_hintArgs_in_hintItem517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_hintItem519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INCRE_in_hintName575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_HOLD_DDLTIME_in_hintName599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs634 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_hintArgs637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs639 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_identifier_in_hintArgName681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectItem714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_selectItem727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_selectItem735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_selectItem737 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_selectItem740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_selectItem742 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectItem746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_trfmClause801 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x1000000000000100L});
	public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause816 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x1000000000000100L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_recordWriter_in_trfmClause832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_USING_in_trfmClause838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_StringLiteral_in_trfmClause840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_AS_in_trfmClause848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000452L});
	public static final BitSet FOLLOW_LPAREN_in_trfmClause852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_trfmClause862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_recordReader_in_trfmClause888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectExpression951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectExpression955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList986 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_selectExpressionList989 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList991 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DIVIDE_in_incrementalClause1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_incrementalClause1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_PLUS_in_incrementalClause1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_INCRE_in_incrementalClause1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_incrementalClause1043 = new BitSet(new long[]{0xFFFFFFFE00000000L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL,0x0000000000004000L});
	public static final BitSet FOLLOW_incrementalArgs_in_incrementalClause1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_incrementalClause1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_STAR_in_incrementalClause1049 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DIVIDE_in_incrementalClause1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementalDate_in_incrementalArgs1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_EACH_in_incrementalArgs1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_INCREFREQUENCY_in_incrementalArgs1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_Number_in_incrementalArgs1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_KW_DURING_in_incrementalArgs1137 = new BitSet(new long[]{0xFFFFFFFE00000000L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
	public static final BitSet FOLLOW_incrementalDate_in_incrementalArgs1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateArgs_in_incrementalDate1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_MINUS_in_incrementalDate1201 = new BitSet(new long[]{0xFFFFFFFE00000000L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
	public static final BitSet FOLLOW_dateArgs_in_incrementalDate1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explicit_time_in_dateArgs1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_in_dateArgs1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_in_indefinite_time1302 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DIVIDE_in_indefinite_time1304 = new BitSet(new long[]{0x0080FFF800000000L,0x0200400801002004L,0x0000000000000010L});
	public static final BitSet FOLLOW_month_in_indefinite_time1306 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DIVIDE_in_indefinite_time1308 = new BitSet(new long[]{0xFFFFFFF800000000L,0x020040080100201FL,0x0000000000000010L});
	public static final BitSet FOLLOW_day_in_indefinite_time1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hour_in_explicit_time1347 = new BitSet(new long[]{0xFF7FEFFC00000800L,0x00000007FEFFDFFBL});
	public static final BitSet FOLLOW_COLON_in_explicit_time1349 = new BitSet(new long[]{0xFF7FEFFC00000000L,0x00000007FEFFDFFBL});
	public static final BitSet FOLLOW_minute_in_explicit_time1352 = new BitSet(new long[]{0xFF7FEFFC00000802L,0x00000007FEFFDFFBL});
	public static final BitSet FOLLOW_COLON_in_explicit_time1355 = new BitSet(new long[]{0xFF7FEFFC00000000L,0x00000007FEFFDFFBL});
	public static final BitSet FOLLOW_second_in_explicit_time1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hour1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minute1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_second1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_month1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_day1493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_four_digits_in_year1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_year1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_four_digits_in_year_four_digits1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_WINDOW_in_window_clause1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1585 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_window_clause1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1590 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_Identifier_in_window_defn1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_AS_in_window_defn1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_window_specification_in_window_defn1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_window_specification1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_window_specification1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000008000L,0x0000000000000400L,0x0020040400000000L,0x0000000001000200L,0x0000000008000000L});
	public static final BitSet FOLLOW_Identifier_in_window_specification1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000400L,0x0020040400000000L,0x0000000001000200L,0x0000000008000000L});
	public static final BitSet FOLLOW_partitioningSpec_in_window_specification1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000200L,0x0000000008000000L});
	public static final BitSet FOLLOW_window_frame_in_window_specification1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_window_specification1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_range_expression_in_window_frame1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_value_expression_in_window_frame1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression1741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_range_expression1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_value_expression1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_boundary1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1985 = new BitSet(new long[]{0x0000000000000002L});
}
