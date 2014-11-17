// $ANTLR 3.5.2 IdentifiersParser.g 2014-11-15 17:07:30

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
			// elements: groupByExpression, groupByExpression, groupByExpression, groupingSetExpression, groupByExpression
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
					else if ( (LA9_2==BigintLiteral||LA9_2==CharSetName||LA9_2==DecimalLiteral||LA9_2==Identifier||(LA9_2 >= KW_ADD && LA9_2 <= KW_AFTER)||(LA9_2 >= KW_ALTER && LA9_2 <= KW_ANALYZE)||(LA9_2 >= KW_ARCHIVE && LA9_2 <= KW_COLLECTION)||(LA9_2 >= KW_COLUMNS && LA9_2 <= KW_CREATE)||LA9_2==KW_CUBE||(LA9_2 >= KW_CURSOR && LA9_2 <= KW_DATA)||(LA9_2 >= KW_DATABASES && LA9_2 <= KW_DISABLE)||(LA9_2 >= KW_DISTRIBUTE && LA9_2 <= KW_DROP)||LA9_2==KW_ELEM_TYPE||LA9_2==KW_ENABLE||LA9_2==KW_ESCAPED||(LA9_2 >= KW_EXCLUSIVE && LA9_2 <= KW_EXPORT)||(LA9_2 >= KW_EXTERNAL && LA9_2 <= KW_FLOAT)||(LA9_2 >= KW_FOR && LA9_2 <= KW_FORMATTED)||LA9_2==KW_FULL||(LA9_2 >= KW_FUNCTIONS && LA9_2 <= KW_GROUPING)||(LA9_2 >= KW_HOLD_DDLTIME && LA9_2 <= KW_INCRE)||(LA9_2 >= KW_INDEX && LA9_2 <= KW_ITEMS)||(LA9_2 >= KW_KEYS && LA9_2 <= KW_LEFT)||(LA9_2 >= KW_LIKE && LA9_2 <= KW_LONG)||(LA9_2 >= KW_MAP && LA9_2 <= KW_MINUS)||(LA9_2 >= KW_MSCK && LA9_2 <= KW_OFFLINE)||LA9_2==KW_OPTION||(LA9_2 >= KW_ORCFILE && LA9_2 <= KW_OUTPUTFORMAT)||LA9_2==KW_OVERWRITE||(LA9_2 >= KW_PARTITION && LA9_2 <= KW_PLUS)||(LA9_2 >= KW_PRETTY && LA9_2 <= KW_RECORDWRITER)||(LA9_2 >= KW_REGEXP && LA9_2 <= KW_SCHEMAS)||(LA9_2 >= KW_SEMI && LA9_2 <= KW_TABLES)||(LA9_2 >= KW_TBLPROPERTIES && LA9_2 <= KW_TEXTFILE)||(LA9_2 >= KW_TIMESTAMP && LA9_2 <= KW_TOUCH)||(LA9_2 >= KW_TRIGGER && LA9_2 <= KW_UNARCHIVE)||(LA9_2 >= KW_UNDO && LA9_2 <= KW_UNIONTYPE)||(LA9_2 >= KW_UNLOCK && LA9_2 <= KW_VALUE_TYPE)||LA9_2==KW_VIEW||LA9_2==KW_WHILE||LA9_2==KW_WITH||LA9_2==MINUS||LA9_2==Number||LA9_2==PLUS||(LA9_2 >= SmallintLiteral && LA9_2 <= StringLiteral)||LA9_2==TILDE||LA9_2==TinyintLiteral||LA9_2==Day||LA9_2==Hour||(LA9_2 >= Minute && LA9_2 <= Month)||LA9_2==Second||LA9_2==Year) ) {
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
					else if ( (LA12_2==BigintLiteral||LA12_2==CharSetName||LA12_2==DecimalLiteral||LA12_2==Identifier||(LA12_2 >= KW_ADD && LA12_2 <= KW_AFTER)||(LA12_2 >= KW_ALTER && LA12_2 <= KW_ANALYZE)||(LA12_2 >= KW_ARCHIVE && LA12_2 <= KW_COLLECTION)||(LA12_2 >= KW_COLUMNS && LA12_2 <= KW_CREATE)||LA12_2==KW_CUBE||(LA12_2 >= KW_CURSOR && LA12_2 <= KW_DATA)||(LA12_2 >= KW_DATABASES && LA12_2 <= KW_DISABLE)||(LA12_2 >= KW_DISTRIBUTE && LA12_2 <= KW_DROP)||LA12_2==KW_ELEM_TYPE||LA12_2==KW_ENABLE||LA12_2==KW_ESCAPED||(LA12_2 >= KW_EXCLUSIVE && LA12_2 <= KW_EXPORT)||(LA12_2 >= KW_EXTERNAL && LA12_2 <= KW_FLOAT)||(LA12_2 >= KW_FOR && LA12_2 <= KW_FORMATTED)||LA12_2==KW_FULL||(LA12_2 >= KW_FUNCTIONS && LA12_2 <= KW_GROUPING)||(LA12_2 >= KW_HOLD_DDLTIME && LA12_2 <= KW_INCRE)||(LA12_2 >= KW_INDEX && LA12_2 <= KW_ITEMS)||(LA12_2 >= KW_KEYS && LA12_2 <= KW_LEFT)||(LA12_2 >= KW_LIKE && LA12_2 <= KW_LONG)||(LA12_2 >= KW_MAP && LA12_2 <= KW_MINUS)||(LA12_2 >= KW_MSCK && LA12_2 <= KW_OFFLINE)||LA12_2==KW_OPTION||(LA12_2 >= KW_ORCFILE && LA12_2 <= KW_OUTPUTFORMAT)||LA12_2==KW_OVERWRITE||(LA12_2 >= KW_PARTITION && LA12_2 <= KW_PLUS)||(LA12_2 >= KW_PRETTY && LA12_2 <= KW_RECORDWRITER)||(LA12_2 >= KW_REGEXP && LA12_2 <= KW_SCHEMAS)||(LA12_2 >= KW_SEMI && LA12_2 <= KW_TABLES)||(LA12_2 >= KW_TBLPROPERTIES && LA12_2 <= KW_TEXTFILE)||(LA12_2 >= KW_TIMESTAMP && LA12_2 <= KW_TOUCH)||(LA12_2 >= KW_TRIGGER && LA12_2 <= KW_UNARCHIVE)||(LA12_2 >= KW_UNDO && LA12_2 <= KW_UNIONTYPE)||(LA12_2 >= KW_UNLOCK && LA12_2 <= KW_VALUE_TYPE)||LA12_2==KW_VIEW||LA12_2==KW_WHILE||LA12_2==KW_WITH||LA12_2==MINUS||LA12_2==Number||LA12_2==PLUS||(LA12_2 >= SmallintLiteral && LA12_2 <= StringLiteral)||LA12_2==TILDE||LA12_2==TinyintLiteral||LA12_2==Day||LA12_2==Hour||(LA12_2 >= Minute && LA12_2 <= Month)||LA12_2==Second||LA12_2==Year) ) {
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
					else if ( (LA15_2==BigintLiteral||LA15_2==CharSetName||LA15_2==DecimalLiteral||LA15_2==Identifier||(LA15_2 >= KW_ADD && LA15_2 <= KW_AFTER)||(LA15_2 >= KW_ALTER && LA15_2 <= KW_ANALYZE)||(LA15_2 >= KW_ARCHIVE && LA15_2 <= KW_COLLECTION)||(LA15_2 >= KW_COLUMNS && LA15_2 <= KW_CREATE)||LA15_2==KW_CUBE||(LA15_2 >= KW_CURSOR && LA15_2 <= KW_DATA)||(LA15_2 >= KW_DATABASES && LA15_2 <= KW_DISABLE)||(LA15_2 >= KW_DISTRIBUTE && LA15_2 <= KW_DROP)||LA15_2==KW_ELEM_TYPE||LA15_2==KW_ENABLE||LA15_2==KW_ESCAPED||(LA15_2 >= KW_EXCLUSIVE && LA15_2 <= KW_EXPORT)||(LA15_2 >= KW_EXTERNAL && LA15_2 <= KW_FLOAT)||(LA15_2 >= KW_FOR && LA15_2 <= KW_FORMATTED)||LA15_2==KW_FULL||(LA15_2 >= KW_FUNCTIONS && LA15_2 <= KW_GROUPING)||(LA15_2 >= KW_HOLD_DDLTIME && LA15_2 <= KW_INCRE)||(LA15_2 >= KW_INDEX && LA15_2 <= KW_ITEMS)||(LA15_2 >= KW_KEYS && LA15_2 <= KW_LEFT)||(LA15_2 >= KW_LIKE && LA15_2 <= KW_LONG)||(LA15_2 >= KW_MAP && LA15_2 <= KW_MINUS)||(LA15_2 >= KW_MSCK && LA15_2 <= KW_OFFLINE)||LA15_2==KW_OPTION||(LA15_2 >= KW_ORCFILE && LA15_2 <= KW_OUTPUTFORMAT)||LA15_2==KW_OVERWRITE||(LA15_2 >= KW_PARTITION && LA15_2 <= KW_PLUS)||(LA15_2 >= KW_PRETTY && LA15_2 <= KW_RECORDWRITER)||(LA15_2 >= KW_REGEXP && LA15_2 <= KW_SCHEMAS)||(LA15_2 >= KW_SEMI && LA15_2 <= KW_TABLES)||(LA15_2 >= KW_TBLPROPERTIES && LA15_2 <= KW_TEXTFILE)||(LA15_2 >= KW_TIMESTAMP && LA15_2 <= KW_TOUCH)||(LA15_2 >= KW_TRIGGER && LA15_2 <= KW_UNARCHIVE)||(LA15_2 >= KW_UNDO && LA15_2 <= KW_UNIONTYPE)||(LA15_2 >= KW_UNLOCK && LA15_2 <= KW_VALUE_TYPE)||LA15_2==KW_VIEW||LA15_2==KW_WHILE||LA15_2==KW_WITH||LA15_2==MINUS||LA15_2==Number||LA15_2==PLUS||(LA15_2 >= SmallintLiteral && LA15_2 <= StringLiteral)||LA15_2==TILDE||LA15_2==TinyintLiteral||LA15_2==Day||LA15_2==Hour||(LA15_2 >= Minute && LA15_2 <= Month)||LA15_2==Second||LA15_2==Year) ) {
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
					else if ( (LA18_2==BigintLiteral||LA18_2==CharSetName||LA18_2==DecimalLiteral||LA18_2==Identifier||(LA18_2 >= KW_ADD && LA18_2 <= KW_AFTER)||(LA18_2 >= KW_ALTER && LA18_2 <= KW_ANALYZE)||(LA18_2 >= KW_ARCHIVE && LA18_2 <= KW_COLLECTION)||(LA18_2 >= KW_COLUMNS && LA18_2 <= KW_CREATE)||LA18_2==KW_CUBE||(LA18_2 >= KW_CURSOR && LA18_2 <= KW_DATA)||(LA18_2 >= KW_DATABASES && LA18_2 <= KW_DISABLE)||(LA18_2 >= KW_DISTRIBUTE && LA18_2 <= KW_DROP)||LA18_2==KW_ELEM_TYPE||LA18_2==KW_ENABLE||LA18_2==KW_ESCAPED||(LA18_2 >= KW_EXCLUSIVE && LA18_2 <= KW_EXPORT)||(LA18_2 >= KW_EXTERNAL && LA18_2 <= KW_FLOAT)||(LA18_2 >= KW_FOR && LA18_2 <= KW_FORMATTED)||LA18_2==KW_FULL||(LA18_2 >= KW_FUNCTIONS && LA18_2 <= KW_GROUPING)||(LA18_2 >= KW_HOLD_DDLTIME && LA18_2 <= KW_INCRE)||(LA18_2 >= KW_INDEX && LA18_2 <= KW_ITEMS)||(LA18_2 >= KW_KEYS && LA18_2 <= KW_LEFT)||(LA18_2 >= KW_LIKE && LA18_2 <= KW_LONG)||(LA18_2 >= KW_MAP && LA18_2 <= KW_MINUS)||(LA18_2 >= KW_MSCK && LA18_2 <= KW_OFFLINE)||LA18_2==KW_OPTION||(LA18_2 >= KW_ORCFILE && LA18_2 <= KW_OUTPUTFORMAT)||LA18_2==KW_OVERWRITE||(LA18_2 >= KW_PARTITION && LA18_2 <= KW_PLUS)||(LA18_2 >= KW_PRETTY && LA18_2 <= KW_RECORDWRITER)||(LA18_2 >= KW_REGEXP && LA18_2 <= KW_SCHEMAS)||(LA18_2 >= KW_SEMI && LA18_2 <= KW_TABLES)||(LA18_2 >= KW_TBLPROPERTIES && LA18_2 <= KW_TEXTFILE)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TOUCH)||(LA18_2 >= KW_TRIGGER && LA18_2 <= KW_UNARCHIVE)||(LA18_2 >= KW_UNDO && LA18_2 <= KW_UNIONTYPE)||(LA18_2 >= KW_UNLOCK && LA18_2 <= KW_VALUE_TYPE)||LA18_2==KW_VIEW||LA18_2==KW_WHILE||LA18_2==KW_WITH||LA18_2==MINUS||LA18_2==Number||LA18_2==PLUS||(LA18_2 >= SmallintLiteral && LA18_2 <= StringLiteral)||LA18_2==TILDE||LA18_2==TinyintLiteral||LA18_2==Day||LA18_2==Hour||(LA18_2 >= Minute && LA18_2 <= Month)||LA18_2==Second||LA18_2==Year) ) {
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
					else if ( (LA21_2==BigintLiteral||LA21_2==CharSetName||LA21_2==DecimalLiteral||LA21_2==Identifier||(LA21_2 >= KW_ADD && LA21_2 <= KW_AFTER)||(LA21_2 >= KW_ALTER && LA21_2 <= KW_ANALYZE)||(LA21_2 >= KW_ARCHIVE && LA21_2 <= KW_COLLECTION)||(LA21_2 >= KW_COLUMNS && LA21_2 <= KW_CREATE)||LA21_2==KW_CUBE||(LA21_2 >= KW_CURSOR && LA21_2 <= KW_DATA)||(LA21_2 >= KW_DATABASES && LA21_2 <= KW_DISABLE)||(LA21_2 >= KW_DISTRIBUTE && LA21_2 <= KW_DROP)||LA21_2==KW_ELEM_TYPE||LA21_2==KW_ENABLE||LA21_2==KW_ESCAPED||(LA21_2 >= KW_EXCLUSIVE && LA21_2 <= KW_EXPORT)||(LA21_2 >= KW_EXTERNAL && LA21_2 <= KW_FLOAT)||(LA21_2 >= KW_FOR && LA21_2 <= KW_FORMATTED)||LA21_2==KW_FULL||(LA21_2 >= KW_FUNCTIONS && LA21_2 <= KW_GROUPING)||(LA21_2 >= KW_HOLD_DDLTIME && LA21_2 <= KW_INCRE)||(LA21_2 >= KW_INDEX && LA21_2 <= KW_ITEMS)||(LA21_2 >= KW_KEYS && LA21_2 <= KW_LEFT)||(LA21_2 >= KW_LIKE && LA21_2 <= KW_LONG)||(LA21_2 >= KW_MAP && LA21_2 <= KW_MINUS)||(LA21_2 >= KW_MSCK && LA21_2 <= KW_OFFLINE)||LA21_2==KW_OPTION||(LA21_2 >= KW_ORCFILE && LA21_2 <= KW_OUTPUTFORMAT)||LA21_2==KW_OVERWRITE||(LA21_2 >= KW_PARTITION && LA21_2 <= KW_PLUS)||(LA21_2 >= KW_PRETTY && LA21_2 <= KW_RECORDWRITER)||(LA21_2 >= KW_REGEXP && LA21_2 <= KW_SCHEMAS)||(LA21_2 >= KW_SEMI && LA21_2 <= KW_TABLES)||(LA21_2 >= KW_TBLPROPERTIES && LA21_2 <= KW_TEXTFILE)||(LA21_2 >= KW_TIMESTAMP && LA21_2 <= KW_TOUCH)||(LA21_2 >= KW_TRIGGER && LA21_2 <= KW_UNARCHIVE)||(LA21_2 >= KW_UNDO && LA21_2 <= KW_UNIONTYPE)||(LA21_2 >= KW_UNLOCK && LA21_2 <= KW_VALUE_TYPE)||LA21_2==KW_VIEW||LA21_2==KW_WHILE||LA21_2==KW_WITH||LA21_2==MINUS||LA21_2==Number||LA21_2==PLUS||(LA21_2 >= SmallintLiteral && LA21_2 <= StringLiteral)||LA21_2==TILDE||LA21_2==TinyintLiteral||LA21_2==Day||LA21_2==Hour||(LA21_2 >= Minute && LA21_2 <= Month)||LA21_2==Second||LA21_2==Year) ) {
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
			else if ( (LA25_0==BigintLiteral||LA25_0==CharSetName||LA25_0==DecimalLiteral||LA25_0==Identifier||(LA25_0 >= KW_ADD && LA25_0 <= KW_AFTER)||(LA25_0 >= KW_ALTER && LA25_0 <= KW_ANALYZE)||(LA25_0 >= KW_ARCHIVE && LA25_0 <= KW_COLLECTION)||(LA25_0 >= KW_COLUMNS && LA25_0 <= KW_CREATE)||LA25_0==KW_CUBE||(LA25_0 >= KW_CURSOR && LA25_0 <= KW_DATA)||(LA25_0 >= KW_DATABASES && LA25_0 <= KW_DROP)||LA25_0==KW_ELEM_TYPE||LA25_0==KW_ENABLE||LA25_0==KW_ESCAPED||(LA25_0 >= KW_EXCLUSIVE && LA25_0 <= KW_EXPORT)||(LA25_0 >= KW_EXTERNAL && LA25_0 <= KW_FLOAT)||(LA25_0 >= KW_FOR && LA25_0 <= KW_FORMATTED)||LA25_0==KW_FULL||(LA25_0 >= KW_FUNCTIONS && LA25_0 <= KW_GROUPING)||(LA25_0 >= KW_HOLD_DDLTIME && LA25_0 <= KW_INCRE)||(LA25_0 >= KW_INDEX && LA25_0 <= KW_ITEMS)||(LA25_0 >= KW_KEYS && LA25_0 <= KW_LEFT)||(LA25_0 >= KW_LIKE && LA25_0 <= KW_LONG)||(LA25_0 >= KW_MAP && LA25_0 <= KW_MINUS)||(LA25_0 >= KW_MSCK && LA25_0 <= KW_OFFLINE)||LA25_0==KW_OPTION||(LA25_0 >= KW_ORCFILE && LA25_0 <= KW_OUTPUTFORMAT)||LA25_0==KW_OVERWRITE||(LA25_0 >= KW_PARTITION && LA25_0 <= KW_PLUS)||(LA25_0 >= KW_PRETTY && LA25_0 <= KW_RECORDWRITER)||(LA25_0 >= KW_REGEXP && LA25_0 <= KW_SCHEMAS)||(LA25_0 >= KW_SEMI && LA25_0 <= KW_TABLES)||(LA25_0 >= KW_TBLPROPERTIES && LA25_0 <= KW_TEXTFILE)||(LA25_0 >= KW_TIMESTAMP && LA25_0 <= KW_TOUCH)||(LA25_0 >= KW_TRIGGER && LA25_0 <= KW_UNARCHIVE)||(LA25_0 >= KW_UNDO && LA25_0 <= KW_UNIONTYPE)||(LA25_0 >= KW_UNLOCK && LA25_0 <= KW_VALUE_TYPE)||LA25_0==KW_VIEW||LA25_0==KW_WHILE||LA25_0==KW_WITH||LA25_0==LPAREN||LA25_0==MINUS||LA25_0==Number||LA25_0==PLUS||LA25_0==RPAREN||(LA25_0 >= SmallintLiteral && LA25_0 <= StringLiteral)||LA25_0==TILDE||LA25_0==TinyintLiteral||LA25_0==Day||LA25_0==Hour||(LA25_0 >= Minute && LA25_0 <= Month)||LA25_0==Second||LA25_0==Year) ) {
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
					if ( (LA24_0==BigintLiteral||LA24_0==CharSetName||LA24_0==DecimalLiteral||LA24_0==Identifier||(LA24_0 >= KW_ADD && LA24_0 <= KW_AFTER)||(LA24_0 >= KW_ALTER && LA24_0 <= KW_ANALYZE)||(LA24_0 >= KW_ARCHIVE && LA24_0 <= KW_COLLECTION)||(LA24_0 >= KW_COLUMNS && LA24_0 <= KW_CREATE)||LA24_0==KW_CUBE||(LA24_0 >= KW_CURSOR && LA24_0 <= KW_DATA)||(LA24_0 >= KW_DATABASES && LA24_0 <= KW_DISABLE)||(LA24_0 >= KW_DISTRIBUTE && LA24_0 <= KW_DROP)||LA24_0==KW_ELEM_TYPE||LA24_0==KW_ENABLE||LA24_0==KW_ESCAPED||(LA24_0 >= KW_EXCLUSIVE && LA24_0 <= KW_EXPORT)||(LA24_0 >= KW_EXTERNAL && LA24_0 <= KW_FLOAT)||(LA24_0 >= KW_FOR && LA24_0 <= KW_FORMATTED)||LA24_0==KW_FULL||(LA24_0 >= KW_FUNCTIONS && LA24_0 <= KW_GROUPING)||(LA24_0 >= KW_HOLD_DDLTIME && LA24_0 <= KW_INCRE)||(LA24_0 >= KW_INDEX && LA24_0 <= KW_ITEMS)||(LA24_0 >= KW_KEYS && LA24_0 <= KW_LEFT)||(LA24_0 >= KW_LIKE && LA24_0 <= KW_LONG)||(LA24_0 >= KW_MAP && LA24_0 <= KW_MINUS)||(LA24_0 >= KW_MSCK && LA24_0 <= KW_OFFLINE)||LA24_0==KW_OPTION||(LA24_0 >= KW_ORCFILE && LA24_0 <= KW_OUTPUTFORMAT)||LA24_0==KW_OVERWRITE||(LA24_0 >= KW_PARTITION && LA24_0 <= KW_PLUS)||(LA24_0 >= KW_PRETTY && LA24_0 <= KW_RECORDWRITER)||(LA24_0 >= KW_REGEXP && LA24_0 <= KW_SCHEMAS)||(LA24_0 >= KW_SEMI && LA24_0 <= KW_TABLES)||(LA24_0 >= KW_TBLPROPERTIES && LA24_0 <= KW_TEXTFILE)||(LA24_0 >= KW_TIMESTAMP && LA24_0 <= KW_TOUCH)||(LA24_0 >= KW_TRIGGER && LA24_0 <= KW_UNARCHIVE)||(LA24_0 >= KW_UNDO && LA24_0 <= KW_UNIONTYPE)||(LA24_0 >= KW_UNLOCK && LA24_0 <= KW_VALUE_TYPE)||LA24_0==KW_VIEW||LA24_0==KW_WHILE||LA24_0==KW_WITH||LA24_0==LPAREN||LA24_0==MINUS||LA24_0==Number||LA24_0==PLUS||LA24_0==STAR||(LA24_0 >= SmallintLiteral && LA24_0 <= StringLiteral)||LA24_0==TILDE||LA24_0==TinyintLiteral||LA24_0==Day||LA24_0==Hour||(LA24_0 >= Minute && LA24_0 <= Month)||LA24_0==Second||LA24_0==Year) ) {
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
			// elements: selectExpression, functionName, ws, functionName, functionName, selectExpression, ws
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
	// IdentifiersParser.g:221:1: constant : ( Number | Year | Month | Day | Hour | Minute | Second | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );
	public final HiveParser_IdentifiersParser.constant_return constant() throws RecognitionException {
		HiveParser_IdentifiersParser.constant_return retval = new HiveParser_IdentifiersParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Number122=null;
		Token Year123=null;
		Token Month124=null;
		Token Day125=null;
		Token Hour126=null;
		Token Minute127=null;
		Token Second128=null;
		Token StringLiteral130=null;
		Token BigintLiteral132=null;
		Token SmallintLiteral133=null;
		Token TinyintLiteral134=null;
		Token DecimalLiteral135=null;
		ParserRuleReturnScope dateLiteral129 =null;
		ParserRuleReturnScope stringLiteralSequence131 =null;
		ParserRuleReturnScope charSetStringLiteral136 =null;
		ParserRuleReturnScope booleanValue137 =null;

		CommonTree Number122_tree=null;
		CommonTree Year123_tree=null;
		CommonTree Month124_tree=null;
		CommonTree Day125_tree=null;
		CommonTree Hour126_tree=null;
		CommonTree Minute127_tree=null;
		CommonTree Second128_tree=null;
		CommonTree StringLiteral130_tree=null;
		CommonTree BigintLiteral132_tree=null;
		CommonTree SmallintLiteral133_tree=null;
		CommonTree TinyintLiteral134_tree=null;
		CommonTree DecimalLiteral135_tree=null;

		 gParent.msgs.push("constant"); 
		try {
			// IdentifiersParser.g:224:5: ( Number | Year | Month | Day | Hour | Minute | Second | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue )
			int alt32=16;
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
					// IdentifiersParser.g:226:7: Year
					{
					root_0 = (CommonTree)adaptor.nil();


					Year123=(Token)match(input,Year,FOLLOW_Year_in_constant1486); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Year123_tree = (CommonTree)adaptor.create(Year123);
					adaptor.addChild(root_0, Year123_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:227:7: Month
					{
					root_0 = (CommonTree)adaptor.nil();


					Month124=(Token)match(input,Month,FOLLOW_Month_in_constant1494); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Month124_tree = (CommonTree)adaptor.create(Month124);
					adaptor.addChild(root_0, Month124_tree);
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:228:7: Day
					{
					root_0 = (CommonTree)adaptor.nil();


					Day125=(Token)match(input,Day,FOLLOW_Day_in_constant1502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Day125_tree = (CommonTree)adaptor.create(Day125);
					adaptor.addChild(root_0, Day125_tree);
					}

					}
					break;
				case 5 :
					// IdentifiersParser.g:229:7: Hour
					{
					root_0 = (CommonTree)adaptor.nil();


					Hour126=(Token)match(input,Hour,FOLLOW_Hour_in_constant1510); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Hour126_tree = (CommonTree)adaptor.create(Hour126);
					adaptor.addChild(root_0, Hour126_tree);
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:230:7: Minute
					{
					root_0 = (CommonTree)adaptor.nil();


					Minute127=(Token)match(input,Minute,FOLLOW_Minute_in_constant1518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Minute127_tree = (CommonTree)adaptor.create(Minute127);
					adaptor.addChild(root_0, Minute127_tree);
					}

					}
					break;
				case 7 :
					// IdentifiersParser.g:231:7: Second
					{
					root_0 = (CommonTree)adaptor.nil();


					Second128=(Token)match(input,Second,FOLLOW_Second_in_constant1526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Second128_tree = (CommonTree)adaptor.create(Second128);
					adaptor.addChild(root_0, Second128_tree);
					}

					}
					break;
				case 8 :
					// IdentifiersParser.g:232:7: dateLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_constant1534);
					dateLiteral129=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral129.getTree());

					}
					break;
				case 9 :
					// IdentifiersParser.g:233:7: StringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					StringLiteral130=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constant1542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral130_tree = (CommonTree)adaptor.create(StringLiteral130);
					adaptor.addChild(root_0, StringLiteral130_tree);
					}

					}
					break;
				case 10 :
					// IdentifiersParser.g:234:7: stringLiteralSequence
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_stringLiteralSequence_in_constant1550);
					stringLiteralSequence131=stringLiteralSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteralSequence131.getTree());

					}
					break;
				case 11 :
					// IdentifiersParser.g:235:7: BigintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					BigintLiteral132=(Token)match(input,BigintLiteral,FOLLOW_BigintLiteral_in_constant1558); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BigintLiteral132_tree = (CommonTree)adaptor.create(BigintLiteral132);
					adaptor.addChild(root_0, BigintLiteral132_tree);
					}

					}
					break;
				case 12 :
					// IdentifiersParser.g:236:7: SmallintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					SmallintLiteral133=(Token)match(input,SmallintLiteral,FOLLOW_SmallintLiteral_in_constant1566); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SmallintLiteral133_tree = (CommonTree)adaptor.create(SmallintLiteral133);
					adaptor.addChild(root_0, SmallintLiteral133_tree);
					}

					}
					break;
				case 13 :
					// IdentifiersParser.g:237:7: TinyintLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					TinyintLiteral134=(Token)match(input,TinyintLiteral,FOLLOW_TinyintLiteral_in_constant1574); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TinyintLiteral134_tree = (CommonTree)adaptor.create(TinyintLiteral134);
					adaptor.addChild(root_0, TinyintLiteral134_tree);
					}

					}
					break;
				case 14 :
					// IdentifiersParser.g:238:7: DecimalLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					DecimalLiteral135=(Token)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_constant1582); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DecimalLiteral135_tree = (CommonTree)adaptor.create(DecimalLiteral135);
					adaptor.addChild(root_0, DecimalLiteral135_tree);
					}

					}
					break;
				case 15 :
					// IdentifiersParser.g:239:7: charSetStringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_charSetStringLiteral_in_constant1590);
					charSetStringLiteral136=charSetStringLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, charSetStringLiteral136.getTree());

					}
					break;
				case 16 :
					// IdentifiersParser.g:240:7: booleanValue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_booleanValue_in_constant1598);
					booleanValue137=booleanValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanValue137.getTree());

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
	// IdentifiersParser.g:243:1: stringLiteralSequence : StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) ;
	public final HiveParser_IdentifiersParser.stringLiteralSequence_return stringLiteralSequence() throws RecognitionException {
		HiveParser_IdentifiersParser.stringLiteralSequence_return retval = new HiveParser_IdentifiersParser.stringLiteralSequence_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token StringLiteral138=null;
		Token StringLiteral139=null;

		CommonTree StringLiteral138_tree=null;
		CommonTree StringLiteral139_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

		try {
			// IdentifiersParser.g:244:5: ( StringLiteral ( StringLiteral )+ -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ ) )
			// IdentifiersParser.g:245:5: StringLiteral ( StringLiteral )+
			{
			StringLiteral138=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1619); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral138);

			// IdentifiersParser.g:245:19: ( StringLiteral )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				alt33 = dfa33.predict(input);
				switch (alt33) {
				case 1 :
					// IdentifiersParser.g:245:19: StringLiteral
					{
					StringLiteral139=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteralSequence1621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral139);

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
			// 245:34: -> ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
			{
				// IdentifiersParser.g:245:37: ^( TOK_STRINGLITERALSEQUENCE StringLiteral ( StringLiteral )+ )
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
	// IdentifiersParser.g:248:1: charSetStringLiteral : csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) ;
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
			// IdentifiersParser.g:251:5: (csName= CharSetName csLiteral= CharSetLiteral -> ^( TOK_CHARSETLITERAL $csName $csLiteral) )
			// IdentifiersParser.g:252:5: csName= CharSetName csLiteral= CharSetLiteral
			{
			csName=(Token)match(input,CharSetName,FOLLOW_CharSetName_in_charSetStringLiteral1666); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CharSetName.add(csName);

			csLiteral=(Token)match(input,CharSetLiteral,FOLLOW_CharSetLiteral_in_charSetStringLiteral1670); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CharSetLiteral.add(csLiteral);

			// AST REWRITE
			// elements: csLiteral, csName
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
			// 252:49: -> ^( TOK_CHARSETLITERAL $csName $csLiteral)
			{
				// IdentifiersParser.g:252:52: ^( TOK_CHARSETLITERAL $csName $csLiteral)
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
	// IdentifiersParser.g:255:1: dateLiteral : KW_DATE StringLiteral ->;
	public final HiveParser_IdentifiersParser.dateLiteral_return dateLiteral() throws RecognitionException {
		HiveParser_IdentifiersParser.dateLiteral_return retval = new HiveParser_IdentifiersParser.dateLiteral_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_DATE140=null;
		Token StringLiteral141=null;

		CommonTree KW_DATE140_tree=null;
		CommonTree StringLiteral141_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_DATE=new RewriteRuleTokenStream(adaptor,"token KW_DATE");

		try {
			// IdentifiersParser.g:256:5: ( KW_DATE StringLiteral ->)
			// IdentifiersParser.g:257:5: KW_DATE StringLiteral
			{
			KW_DATE140=(Token)match(input,KW_DATE,FOLLOW_KW_DATE_in_dateLiteral1703); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DATE.add(KW_DATE140);

			StringLiteral141=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dateLiteral1705); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral141);

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
			// 257:27: ->
			{
				adaptor.addChild(root_0, 
				      // Create DateLiteral token, but with the text of the string value
				      // This makes the dateLiteral more consistent with the other type literals.
				      adaptor.create(TOK_DATELITERAL, (StringLiteral141!=null?StringLiteral141.getText():null))
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
	// IdentifiersParser.g:265:1: expression : precedenceOrExpression ;
	public final HiveParser_IdentifiersParser.expression_return expression() throws RecognitionException {
		HiveParser_IdentifiersParser.expression_return retval = new HiveParser_IdentifiersParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceOrExpression142 =null;


		 gParent.msgs.push("expression specification"); 
		try {
			// IdentifiersParser.g:268:5: ( precedenceOrExpression )
			// IdentifiersParser.g:269:5: precedenceOrExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceOrExpression_in_expression1744);
			precedenceOrExpression142=precedenceOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceOrExpression142.getTree());

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
	// IdentifiersParser.g:272:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !);
	public final HiveParser_IdentifiersParser.atomExpression_return atomExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.atomExpression_return retval = new HiveParser_IdentifiersParser.atomExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NULL143=null;
		Token LPAREN151=null;
		Token RPAREN153=null;
		ParserRuleReturnScope dateLiteral144 =null;
		ParserRuleReturnScope constant145 =null;
		ParserRuleReturnScope function146 =null;
		ParserRuleReturnScope castExpression147 =null;
		ParserRuleReturnScope caseExpression148 =null;
		ParserRuleReturnScope whenExpression149 =null;
		ParserRuleReturnScope tableOrColumn150 =null;
		ParserRuleReturnScope expression152 =null;

		CommonTree KW_NULL143_tree=null;
		CommonTree LPAREN151_tree=null;
		CommonTree RPAREN153_tree=null;
		RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");

		try {
			// IdentifiersParser.g:273:5: ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !)
			int alt34=9;
			alt34 = dfa34.predict(input);
			switch (alt34) {
				case 1 :
					// IdentifiersParser.g:274:5: KW_NULL
					{
					KW_NULL143=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_atomExpression1765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL143);

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
					// 274:13: -> TOK_NULL
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_NULL, "TOK_NULL"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:275:7: dateLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_atomExpression1777);
					dateLiteral144=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral144.getTree());

					}
					break;
				case 3 :
					// IdentifiersParser.g:276:7: constant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constant_in_atomExpression1785);
					constant145=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant145.getTree());

					}
					break;
				case 4 :
					// IdentifiersParser.g:277:7: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_atomExpression1793);
					function146=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function146.getTree());

					}
					break;
				case 5 :
					// IdentifiersParser.g:278:7: castExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_castExpression_in_atomExpression1801);
					castExpression147=castExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression147.getTree());

					}
					break;
				case 6 :
					// IdentifiersParser.g:279:7: caseExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_caseExpression_in_atomExpression1809);
					caseExpression148=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression148.getTree());

					}
					break;
				case 7 :
					// IdentifiersParser.g:280:7: whenExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whenExpression_in_atomExpression1817);
					whenExpression149=whenExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression149.getTree());

					}
					break;
				case 8 :
					// IdentifiersParser.g:281:7: tableOrColumn
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableOrColumn_in_atomExpression1825);
					tableOrColumn150=gHiveParser.tableOrColumn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableOrColumn150.getTree());

					}
					break;
				case 9 :
					// IdentifiersParser.g:282:7: LPAREN ! expression RPAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomExpression1833); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_atomExpression1836);
					expression152=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression152.getTree());

					RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomExpression1838); if (state.failed) return retval;
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
	// IdentifiersParser.g:286:1: precedenceFieldExpression : atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* ;
	public final HiveParser_IdentifiersParser.precedenceFieldExpression_return precedenceFieldExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceFieldExpression_return retval = new HiveParser_IdentifiersParser.precedenceFieldExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LSQUARE155=null;
		Token RSQUARE157=null;
		Token DOT158=null;
		ParserRuleReturnScope atomExpression154 =null;
		ParserRuleReturnScope expression156 =null;
		ParserRuleReturnScope identifier159 =null;

		CommonTree LSQUARE155_tree=null;
		CommonTree RSQUARE157_tree=null;
		CommonTree DOT158_tree=null;

		try {
			// IdentifiersParser.g:287:5: ( atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )* )
			// IdentifiersParser.g:288:5: atomExpression ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atomExpression_in_precedenceFieldExpression1861);
			atomExpression154=atomExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atomExpression154.getTree());

			// IdentifiersParser.g:288:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*
			loop35:
			while (true) {
				int alt35=3;
				alt35 = dfa35.predict(input);
				switch (alt35) {
				case 1 :
					// IdentifiersParser.g:288:21: ( LSQUARE ^ expression RSQUARE !)
					{
					// IdentifiersParser.g:288:21: ( LSQUARE ^ expression RSQUARE !)
					// IdentifiersParser.g:288:22: LSQUARE ^ expression RSQUARE !
					{
					LSQUARE155=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_precedenceFieldExpression1865); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LSQUARE155_tree = (CommonTree)adaptor.create(LSQUARE155);
					root_0 = (CommonTree)adaptor.becomeRoot(LSQUARE155_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_precedenceFieldExpression1868);
					expression156=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

					RSQUARE157=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_precedenceFieldExpression1870); if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:288:54: ( DOT ^ identifier )
					{
					// IdentifiersParser.g:288:54: ( DOT ^ identifier )
					// IdentifiersParser.g:288:55: DOT ^ identifier
					{
					DOT158=(Token)match(input,DOT,FOLLOW_DOT_in_precedenceFieldExpression1877); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT158_tree = (CommonTree)adaptor.create(DOT158);
					root_0 = (CommonTree)adaptor.becomeRoot(DOT158_tree, root_0);
					}

					pushFollow(FOLLOW_identifier_in_precedenceFieldExpression1880);
					identifier159=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier159.getTree());

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
	// IdentifiersParser.g:291:1: precedenceUnaryOperator : ( PLUS | MINUS | TILDE );
	public final HiveParser_IdentifiersParser.precedenceUnaryOperator_return precedenceUnaryOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnaryOperator_return retval = new HiveParser_IdentifiersParser.precedenceUnaryOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set160=null;

		CommonTree set160_tree=null;

		try {
			// IdentifiersParser.g:292:5: ( PLUS | MINUS | TILDE )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set160=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TILDE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set160));
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
	// IdentifiersParser.g:296:1: nullCondition : ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) );
	public final HiveParser_IdentifiersParser.nullCondition_return nullCondition() throws RecognitionException {
		HiveParser_IdentifiersParser.nullCondition_return retval = new HiveParser_IdentifiersParser.nullCondition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NULL161=null;
		Token KW_NOT162=null;
		Token KW_NULL163=null;

		CommonTree KW_NULL161_tree=null;
		CommonTree KW_NOT162_tree=null;
		CommonTree KW_NULL163_tree=null;
		RewriteRuleTokenStream stream_KW_NULL=new RewriteRuleTokenStream(adaptor,"token KW_NULL");
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");

		try {
			// IdentifiersParser.g:297:5: ( KW_NULL -> ^( TOK_ISNULL ) | KW_NOT KW_NULL -> ^( TOK_ISNOTNULL ) )
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
					// IdentifiersParser.g:298:5: KW_NULL
					{
					KW_NULL161=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1933); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL161);

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
					// 298:13: -> ^( TOK_ISNULL )
					{
						// IdentifiersParser.g:298:16: ^( TOK_ISNULL )
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
					// IdentifiersParser.g:299:7: KW_NOT KW_NULL
					{
					KW_NOT162=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_nullCondition1947); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT162);

					KW_NULL163=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_nullCondition1949); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NULL.add(KW_NULL163);

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
					// 299:22: -> ^( TOK_ISNOTNULL )
					{
						// IdentifiersParser.g:299:25: ^( TOK_ISNOTNULL )
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
	// IdentifiersParser.g:302:1: precedenceUnaryPrefixExpression : ( precedenceUnaryOperator ^)* precedenceFieldExpression ;
	public final HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return precedenceUnaryPrefixExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnaryPrefixExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceUnaryOperator164 =null;
		ParserRuleReturnScope precedenceFieldExpression165 =null;


		try {
			// IdentifiersParser.g:303:5: ( ( precedenceUnaryOperator ^)* precedenceFieldExpression )
			// IdentifiersParser.g:304:5: ( precedenceUnaryOperator ^)* precedenceFieldExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			// IdentifiersParser.g:304:5: ( precedenceUnaryOperator ^)*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==MINUS||LA37_0==PLUS||LA37_0==TILDE) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// IdentifiersParser.g:304:6: precedenceUnaryOperator ^
					{
					pushFollow(FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1977);
					precedenceUnaryOperator164=precedenceUnaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceUnaryOperator164.getTree(), root_0);
					}
					break;

				default :
					break loop37;
				}
			}

			pushFollow(FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1982);
			precedenceFieldExpression165=precedenceFieldExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceFieldExpression165.getTree());

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
	// IdentifiersParser.g:307:1: precedenceUnarySuffixExpression : precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression ;
	public final HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return precedenceUnarySuffixExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return retval = new HiveParser_IdentifiersParser.precedenceUnarySuffixExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token a=null;
		ParserRuleReturnScope precedenceUnaryPrefixExpression166 =null;
		ParserRuleReturnScope nullCondition167 =null;

		CommonTree a_tree=null;
		RewriteRuleTokenStream stream_KW_IS=new RewriteRuleTokenStream(adaptor,"token KW_IS");
		RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");
		RewriteRuleSubtreeStream stream_nullCondition=new RewriteRuleSubtreeStream(adaptor,"rule nullCondition");

		try {
			// IdentifiersParser.g:308:5: ( precedenceUnaryPrefixExpression (a= KW_IS nullCondition )? -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression ) -> precedenceUnaryPrefixExpression )
			// IdentifiersParser.g:308:7: precedenceUnaryPrefixExpression (a= KW_IS nullCondition )?
			{
			pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1999);
			precedenceUnaryPrefixExpression166=precedenceUnaryPrefixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression166.getTree());
			// IdentifiersParser.g:308:39: (a= KW_IS nullCondition )?
			int alt38=2;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// IdentifiersParser.g:308:40: a= KW_IS nullCondition
					{
					a=(Token)match(input,KW_IS,FOLLOW_KW_IS_in_precedenceUnarySuffixExpression2004); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IS.add(a);

					pushFollow(FOLLOW_nullCondition_in_precedenceUnarySuffixExpression2006);
					nullCondition167=nullCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nullCondition.add(nullCondition167.getTree());
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
			// 309:5: -> {$a != null}? ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
			if (a != null) {
				// IdentifiersParser.g:309:22: ^( TOK_FUNCTION nullCondition precedenceUnaryPrefixExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_nullCondition.nextTree());
				adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 310:5: -> precedenceUnaryPrefixExpression
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
	// IdentifiersParser.g:314:1: precedenceBitwiseXorOperator : BITWISEXOR ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return precedenceBitwiseXorOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BITWISEXOR168=null;

		CommonTree BITWISEXOR168_tree=null;

		try {
			// IdentifiersParser.g:315:5: ( BITWISEXOR )
			// IdentifiersParser.g:316:5: BITWISEXOR
			{
			root_0 = (CommonTree)adaptor.nil();


			BITWISEXOR168=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BITWISEXOR168_tree = (CommonTree)adaptor.create(BITWISEXOR168);
			adaptor.addChild(root_0, BITWISEXOR168_tree);
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
	// IdentifiersParser.g:319:1: precedenceBitwiseXorExpression : precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return precedenceBitwiseXorExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseXorExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceUnarySuffixExpression169 =null;
		ParserRuleReturnScope precedenceBitwiseXorOperator170 =null;
		ParserRuleReturnScope precedenceUnarySuffixExpression171 =null;


		try {
			// IdentifiersParser.g:320:5: ( precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )* )
			// IdentifiersParser.g:321:5: precedenceUnarySuffixExpression ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2075);
			precedenceUnarySuffixExpression169=precedenceUnarySuffixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression169.getTree());

			// IdentifiersParser.g:321:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*
			loop39:
			while (true) {
				int alt39=2;
				alt39 = dfa39.predict(input);
				switch (alt39) {
				case 1 :
					// IdentifiersParser.g:321:38: precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2078);
					precedenceBitwiseXorOperator170=precedenceBitwiseXorOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseXorOperator170.getTree(), root_0);
					pushFollow(FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2081);
					precedenceUnarySuffixExpression171=precedenceUnarySuffixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceUnarySuffixExpression171.getTree());

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
	// IdentifiersParser.g:325:1: precedenceStarOperator : ( STAR | DIVIDE | MOD | DIV );
	public final HiveParser_IdentifiersParser.precedenceStarOperator_return precedenceStarOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceStarOperator_return retval = new HiveParser_IdentifiersParser.precedenceStarOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set172=null;

		CommonTree set172_tree=null;

		try {
			// IdentifiersParser.g:326:5: ( STAR | DIVIDE | MOD | DIV )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set172=input.LT(1);
			if ( (input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||input.LA(1)==MOD||input.LA(1)==STAR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set172));
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
	// IdentifiersParser.g:330:1: precedenceStarExpression : precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceStarExpression_return precedenceStarExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceStarExpression_return retval = new HiveParser_IdentifiersParser.precedenceStarExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceBitwiseXorExpression173 =null;
		ParserRuleReturnScope precedenceStarOperator174 =null;
		ParserRuleReturnScope precedenceBitwiseXorExpression175 =null;


		try {
			// IdentifiersParser.g:331:5: ( precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )* )
			// IdentifiersParser.g:332:5: precedenceBitwiseXorExpression ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2138);
			precedenceBitwiseXorExpression173=precedenceBitwiseXorExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression173.getTree());

			// IdentifiersParser.g:332:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*
			loop40:
			while (true) {
				int alt40=2;
				alt40 = dfa40.predict(input);
				switch (alt40) {
				case 1 :
					// IdentifiersParser.g:332:37: precedenceStarOperator ^ precedenceBitwiseXorExpression
					{
					pushFollow(FOLLOW_precedenceStarOperator_in_precedenceStarExpression2141);
					precedenceStarOperator174=precedenceStarOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceStarOperator174.getTree(), root_0);
					pushFollow(FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2144);
					precedenceBitwiseXorExpression175=precedenceBitwiseXorExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceBitwiseXorExpression175.getTree());

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
	// IdentifiersParser.g:336:1: precedencePlusOperator : ( PLUS | MINUS );
	public final HiveParser_IdentifiersParser.precedencePlusOperator_return precedencePlusOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedencePlusOperator_return retval = new HiveParser_IdentifiersParser.precedencePlusOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set176=null;

		CommonTree set176_tree=null;

		try {
			// IdentifiersParser.g:337:5: ( PLUS | MINUS )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set176=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set176));
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
	// IdentifiersParser.g:341:1: precedencePlusExpression : precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* ;
	public final HiveParser_IdentifiersParser.precedencePlusExpression_return precedencePlusExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedencePlusExpression_return retval = new HiveParser_IdentifiersParser.precedencePlusExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceStarExpression177 =null;
		ParserRuleReturnScope precedencePlusOperator178 =null;
		ParserRuleReturnScope precedenceStarExpression179 =null;


		try {
			// IdentifiersParser.g:342:5: ( precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )* )
			// IdentifiersParser.g:343:5: precedenceStarExpression ( precedencePlusOperator ^ precedenceStarExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2193);
			precedenceStarExpression177=precedenceStarExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression177.getTree());

			// IdentifiersParser.g:343:30: ( precedencePlusOperator ^ precedenceStarExpression )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==MINUS||LA41_0==PLUS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// IdentifiersParser.g:343:31: precedencePlusOperator ^ precedenceStarExpression
					{
					pushFollow(FOLLOW_precedencePlusOperator_in_precedencePlusExpression2196);
					precedencePlusOperator178=precedencePlusOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedencePlusOperator178.getTree(), root_0);
					pushFollow(FOLLOW_precedenceStarExpression_in_precedencePlusExpression2199);
					precedenceStarExpression179=precedenceStarExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceStarExpression179.getTree());

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
	// IdentifiersParser.g:347:1: precedenceAmpersandOperator : AMPERSAND ;
	public final HiveParser_IdentifiersParser.precedenceAmpersandOperator_return precedenceAmpersandOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAmpersandOperator_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AMPERSAND180=null;

		CommonTree AMPERSAND180_tree=null;

		try {
			// IdentifiersParser.g:348:5: ( AMPERSAND )
			// IdentifiersParser.g:349:5: AMPERSAND
			{
			root_0 = (CommonTree)adaptor.nil();


			AMPERSAND180=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2223); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AMPERSAND180_tree = (CommonTree)adaptor.create(AMPERSAND180);
			adaptor.addChild(root_0, AMPERSAND180_tree);
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
	// IdentifiersParser.g:352:1: precedenceAmpersandExpression : precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceAmpersandExpression_return precedenceAmpersandExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAmpersandExpression_return retval = new HiveParser_IdentifiersParser.precedenceAmpersandExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedencePlusExpression181 =null;
		ParserRuleReturnScope precedenceAmpersandOperator182 =null;
		ParserRuleReturnScope precedencePlusExpression183 =null;


		try {
			// IdentifiersParser.g:353:5: ( precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )* )
			// IdentifiersParser.g:354:5: precedencePlusExpression ( precedenceAmpersandOperator ^ precedencePlusExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2244);
			precedencePlusExpression181=precedencePlusExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression181.getTree());

			// IdentifiersParser.g:354:30: ( precedenceAmpersandOperator ^ precedencePlusExpression )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==AMPERSAND) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// IdentifiersParser.g:354:31: precedenceAmpersandOperator ^ precedencePlusExpression
					{
					pushFollow(FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2247);
					precedenceAmpersandOperator182=precedenceAmpersandOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAmpersandOperator182.getTree(), root_0);
					pushFollow(FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2250);
					precedencePlusExpression183=precedencePlusExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedencePlusExpression183.getTree());

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
	// IdentifiersParser.g:358:1: precedenceBitwiseOrOperator : BITWISEOR ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return precedenceBitwiseOrOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BITWISEOR184=null;

		CommonTree BITWISEOR184_tree=null;

		try {
			// IdentifiersParser.g:359:5: ( BITWISEOR )
			// IdentifiersParser.g:360:5: BITWISEOR
			{
			root_0 = (CommonTree)adaptor.nil();


			BITWISEOR184=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2274); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BITWISEOR184_tree = (CommonTree)adaptor.create(BITWISEOR184);
			adaptor.addChild(root_0, BITWISEOR184_tree);
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
	// IdentifiersParser.g:363:1: precedenceBitwiseOrExpression : precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return precedenceBitwiseOrExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceBitwiseOrExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceAmpersandExpression185 =null;
		ParserRuleReturnScope precedenceBitwiseOrOperator186 =null;
		ParserRuleReturnScope precedenceAmpersandExpression187 =null;


		try {
			// IdentifiersParser.g:364:5: ( precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )* )
			// IdentifiersParser.g:365:5: precedenceAmpersandExpression ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2295);
			precedenceAmpersandExpression185=precedenceAmpersandExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression185.getTree());

			// IdentifiersParser.g:365:35: ( precedenceBitwiseOrOperator ^ precedenceAmpersandExpression )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==BITWISEOR) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// IdentifiersParser.g:365:36: precedenceBitwiseOrOperator ^ precedenceAmpersandExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2298);
					precedenceBitwiseOrOperator186=precedenceBitwiseOrOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceBitwiseOrOperator186.getTree(), root_0);
					pushFollow(FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2301);
					precedenceAmpersandExpression187=precedenceAmpersandExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAmpersandExpression187.getTree());

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
	// IdentifiersParser.g:370:1: precedenceEqualNegatableOperator : ( KW_LIKE | KW_RLIKE | KW_REGEXP );
	public final HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return precedenceEqualNegatableOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualNegatableOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set188=null;

		CommonTree set188_tree=null;

		try {
			// IdentifiersParser.g:371:5: ( KW_LIKE | KW_RLIKE | KW_REGEXP )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set188=input.LT(1);
			if ( input.LA(1)==KW_LIKE||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set188));
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
	// IdentifiersParser.g:375:1: precedenceEqualOperator : ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
	public final HiveParser_IdentifiersParser.precedenceEqualOperator_return precedenceEqualOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualOperator_return retval = new HiveParser_IdentifiersParser.precedenceEqualOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL190=null;
		Token EQUAL_NS191=null;
		Token NOTEQUAL192=null;
		Token LESSTHANOREQUALTO193=null;
		Token LESSTHAN194=null;
		Token GREATERTHANOREQUALTO195=null;
		Token GREATERTHAN196=null;
		ParserRuleReturnScope precedenceEqualNegatableOperator189 =null;

		CommonTree EQUAL190_tree=null;
		CommonTree EQUAL_NS191_tree=null;
		CommonTree NOTEQUAL192_tree=null;
		CommonTree LESSTHANOREQUALTO193_tree=null;
		CommonTree LESSTHAN194_tree=null;
		CommonTree GREATERTHANOREQUALTO195_tree=null;
		CommonTree GREATERTHAN196_tree=null;

		try {
			// IdentifiersParser.g:376:5: ( precedenceEqualNegatableOperator | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
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
					// IdentifiersParser.g:377:5: precedenceEqualNegatableOperator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2355);
					precedenceEqualNegatableOperator189=precedenceEqualNegatableOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualNegatableOperator189.getTree());

					}
					break;
				case 2 :
					// IdentifiersParser.g:377:40: EQUAL
					{
					root_0 = (CommonTree)adaptor.nil();


					EQUAL190=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_precedenceEqualOperator2359); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL190_tree = (CommonTree)adaptor.create(EQUAL190);
					adaptor.addChild(root_0, EQUAL190_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:377:48: EQUAL_NS
					{
					root_0 = (CommonTree)adaptor.nil();


					EQUAL_NS191=(Token)match(input,EQUAL_NS,FOLLOW_EQUAL_NS_in_precedenceEqualOperator2363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL_NS191_tree = (CommonTree)adaptor.create(EQUAL_NS191);
					adaptor.addChild(root_0, EQUAL_NS191_tree);
					}

					}
					break;
				case 4 :
					// IdentifiersParser.g:377:59: NOTEQUAL
					{
					root_0 = (CommonTree)adaptor.nil();


					NOTEQUAL192=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_precedenceEqualOperator2367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOTEQUAL192_tree = (CommonTree)adaptor.create(NOTEQUAL192);
					adaptor.addChild(root_0, NOTEQUAL192_tree);
					}

					}
					break;
				case 5 :
					// IdentifiersParser.g:377:70: LESSTHANOREQUALTO
					{
					root_0 = (CommonTree)adaptor.nil();


					LESSTHANOREQUALTO193=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2371); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESSTHANOREQUALTO193_tree = (CommonTree)adaptor.create(LESSTHANOREQUALTO193);
					adaptor.addChild(root_0, LESSTHANOREQUALTO193_tree);
					}

					}
					break;
				case 6 :
					// IdentifiersParser.g:377:90: LESSTHAN
					{
					root_0 = (CommonTree)adaptor.nil();


					LESSTHAN194=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_precedenceEqualOperator2375); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESSTHAN194_tree = (CommonTree)adaptor.create(LESSTHAN194);
					adaptor.addChild(root_0, LESSTHAN194_tree);
					}

					}
					break;
				case 7 :
					// IdentifiersParser.g:377:101: GREATERTHANOREQUALTO
					{
					root_0 = (CommonTree)adaptor.nil();


					GREATERTHANOREQUALTO195=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2379); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATERTHANOREQUALTO195_tree = (CommonTree)adaptor.create(GREATERTHANOREQUALTO195);
					adaptor.addChild(root_0, GREATERTHANOREQUALTO195_tree);
					}

					}
					break;
				case 8 :
					// IdentifiersParser.g:377:124: GREATERTHAN
					{
					root_0 = (CommonTree)adaptor.nil();


					GREATERTHAN196=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_precedenceEqualOperator2383); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATERTHAN196_tree = (CommonTree)adaptor.create(GREATERTHAN196);
					adaptor.addChild(root_0, GREATERTHAN196_tree);
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
	// IdentifiersParser.g:380:1: precedenceEqualExpression : (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* ;
	public final HiveParser_IdentifiersParser.precedenceEqualExpression_return precedenceEqualExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceEqualExpression_return retval = new HiveParser_IdentifiersParser.precedenceEqualExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NOT197=null;
		Token KW_NOT200=null;
		Token KW_IN201=null;
		Token KW_IN203=null;
		Token KW_NOT205=null;
		Token KW_BETWEEN206=null;
		Token KW_AND207=null;
		Token KW_BETWEEN208=null;
		Token KW_AND209=null;
		ParserRuleReturnScope left =null;
		ParserRuleReturnScope notExpr =null;
		ParserRuleReturnScope equalExpr =null;
		ParserRuleReturnScope min =null;
		ParserRuleReturnScope max =null;
		ParserRuleReturnScope precedenceEqualNegatableOperator198 =null;
		ParserRuleReturnScope precedenceEqualOperator199 =null;
		ParserRuleReturnScope expressions202 =null;
		ParserRuleReturnScope expressions204 =null;

		CommonTree KW_NOT197_tree=null;
		CommonTree KW_NOT200_tree=null;
		CommonTree KW_IN201_tree=null;
		CommonTree KW_IN203_tree=null;
		CommonTree KW_NOT205_tree=null;
		CommonTree KW_BETWEEN206_tree=null;
		CommonTree KW_AND207_tree=null;
		CommonTree KW_BETWEEN208_tree=null;
		CommonTree KW_AND209_tree=null;
		RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
		RewriteRuleSubtreeStream stream_precedenceEqualNegatableOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualNegatableOperator");
		RewriteRuleSubtreeStream stream_precedenceEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule precedenceEqualOperator");
		RewriteRuleSubtreeStream stream_precedenceBitwiseOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceBitwiseOrExpression");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// IdentifiersParser.g:381:5: ( (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )* )
			// IdentifiersParser.g:382:5: (left= precedenceBitwiseOrExpression -> $left) ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
			{
			// IdentifiersParser.g:382:5: (left= precedenceBitwiseOrExpression -> $left)
			// IdentifiersParser.g:382:6: left= precedenceBitwiseOrExpression
			{
			pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2407);
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
			// 382:41: -> $left
			{
				adaptor.addChild(root_0, stream_left.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// IdentifiersParser.g:383:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*
			loop45:
			while (true) {
				int alt45=7;
				alt45 = dfa45.predict(input);
				switch (alt45) {
				case 1 :
					// IdentifiersParser.g:384:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
					{
					// IdentifiersParser.g:384:8: ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:384:9: KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression
					{
					KW_NOT197=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2429); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT197);

					pushFollow(FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2431);
					precedenceEqualNegatableOperator198=precedenceEqualNegatableOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceEqualNegatableOperator.add(precedenceEqualNegatableOperator198.getTree());
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2435);
					notExpr=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(notExpr.getTree());
					}

					// AST REWRITE
					// elements: KW_NOT, notExpr, precedenceEqualExpression, precedenceEqualNegatableOperator
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
					// 385:8: -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
					{
						// IdentifiersParser.g:385:11: ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_NOT.nextNode(), root_1);
						// IdentifiersParser.g:385:20: ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr)
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
					// IdentifiersParser.g:386:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
					{
					// IdentifiersParser.g:386:7: ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:386:8: precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2468);
					precedenceEqualOperator199=precedenceEqualOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceEqualOperator.add(precedenceEqualOperator199.getTree());
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2472);
					equalExpr=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(equalExpr.getTree());
					}

					// AST REWRITE
					// elements: precedenceEqualExpression, equalExpr, precedenceEqualOperator
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
					// 387:8: -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
					{
						// IdentifiersParser.g:387:11: ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr)
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
					// IdentifiersParser.g:388:7: ( KW_NOT KW_IN expressions )
					{
					// IdentifiersParser.g:388:7: ( KW_NOT KW_IN expressions )
					// IdentifiersParser.g:388:8: KW_NOT KW_IN expressions
					{
					KW_NOT200=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2501); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT200);

					KW_IN201=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2503); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN201);

					pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2505);
					expressions202=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions202.getTree());
					}

					// AST REWRITE
					// elements: expressions, KW_NOT, KW_IN, precedenceEqualExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 389:8: -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
					{
						// IdentifiersParser.g:389:11: ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_NOT.nextNode(), root_1);
						// IdentifiersParser.g:389:20: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
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
					// IdentifiersParser.g:390:7: ( KW_IN expressions )
					{
					// IdentifiersParser.g:390:7: ( KW_IN expressions )
					// IdentifiersParser.g:390:8: KW_IN expressions
					{
					KW_IN203=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_precedenceEqualExpression2539); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_IN.add(KW_IN203);

					pushFollow(FOLLOW_expressions_in_precedenceEqualExpression2541);
					expressions204=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions204.getTree());
					}

					// AST REWRITE
					// elements: expressions, precedenceEqualExpression, KW_IN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 391:8: -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
					{
						// IdentifiersParser.g:391:11: ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions )
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
					// IdentifiersParser.g:392:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					{
					// IdentifiersParser.g:392:7: ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					// IdentifiersParser.g:392:9: KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
					{
					KW_NOT205=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceEqualExpression2572); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT205);

					KW_BETWEEN206=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN206);

					// IdentifiersParser.g:392:27: (min= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:392:28: min= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2579);
					min=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());
					}

					KW_AND207=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND207);

					// IdentifiersParser.g:392:70: (max= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:392:71: max= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2587);
					max=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());
					}

					}

					// AST REWRITE
					// elements: left, max, min
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
					// 393:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
					{
						// IdentifiersParser.g:393:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max)
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
					// IdentifiersParser.g:394:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					{
					// IdentifiersParser.g:394:7: ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) )
					// IdentifiersParser.g:394:9: KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression )
					{
					KW_BETWEEN208=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN208);

					// IdentifiersParser.g:394:20: (min= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:394:21: min= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2632);
					min=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(min.getTree());
					}

					KW_AND209=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceEqualExpression2635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND209);

					// IdentifiersParser.g:394:63: (max= precedenceBitwiseOrExpression )
					// IdentifiersParser.g:394:64: max= precedenceBitwiseOrExpression
					{
					pushFollow(FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2640);
					max=precedenceBitwiseOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceBitwiseOrExpression.add(max.getTree());
					}

					}

					// AST REWRITE
					// elements: min, max, left
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
					// 395:8: -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
					{
						// IdentifiersParser.g:395:11: ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max)
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
	// IdentifiersParser.g:399:1: expressions : LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* ;
	public final HiveParser_IdentifiersParser.expressions_return expressions() throws RecognitionException {
		HiveParser_IdentifiersParser.expressions_return retval = new HiveParser_IdentifiersParser.expressions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN210=null;
		Token COMMA212=null;
		Token RPAREN214=null;
		ParserRuleReturnScope expression211 =null;
		ParserRuleReturnScope expression213 =null;

		CommonTree LPAREN210_tree=null;
		CommonTree COMMA212_tree=null;
		CommonTree RPAREN214_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// IdentifiersParser.g:400:5: ( LPAREN expression ( COMMA expression )* RPAREN -> ( expression )* )
			// IdentifiersParser.g:401:5: LPAREN expression ( COMMA expression )* RPAREN
			{
			LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expressions2698); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN210);

			pushFollow(FOLLOW_expression_in_expressions2700);
			expression211=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression211.getTree());
			// IdentifiersParser.g:401:23: ( COMMA expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMA) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// IdentifiersParser.g:401:24: COMMA expression
					{
					COMMA212=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions2703); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA212);

					pushFollow(FOLLOW_expression_in_expressions2705);
					expression213=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression213.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			RPAREN214=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expressions2709); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN214);

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
			// 401:50: -> ( expression )*
			{
				// IdentifiersParser.g:401:53: ( expression )*
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
	// IdentifiersParser.g:404:1: precedenceNotOperator : KW_NOT ;
	public final HiveParser_IdentifiersParser.precedenceNotOperator_return precedenceNotOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceNotOperator_return retval = new HiveParser_IdentifiersParser.precedenceNotOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_NOT215=null;

		CommonTree KW_NOT215_tree=null;

		try {
			// IdentifiersParser.g:405:5: ( KW_NOT )
			// IdentifiersParser.g:406:5: KW_NOT
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_NOT215=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_precedenceNotOperator2735); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_NOT215_tree = (CommonTree)adaptor.create(KW_NOT215);
			adaptor.addChild(root_0, KW_NOT215_tree);
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
	// IdentifiersParser.g:409:1: precedenceNotExpression : ( precedenceNotOperator ^)* precedenceEqualExpression ;
	public final HiveParser_IdentifiersParser.precedenceNotExpression_return precedenceNotExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceNotExpression_return retval = new HiveParser_IdentifiersParser.precedenceNotExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceNotOperator216 =null;
		ParserRuleReturnScope precedenceEqualExpression217 =null;


		try {
			// IdentifiersParser.g:410:5: ( ( precedenceNotOperator ^)* precedenceEqualExpression )
			// IdentifiersParser.g:411:5: ( precedenceNotOperator ^)* precedenceEqualExpression
			{
			root_0 = (CommonTree)adaptor.nil();


			// IdentifiersParser.g:411:5: ( precedenceNotOperator ^)*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==KW_NOT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// IdentifiersParser.g:411:6: precedenceNotOperator ^
					{
					pushFollow(FOLLOW_precedenceNotOperator_in_precedenceNotExpression2757);
					precedenceNotOperator216=precedenceNotOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceNotOperator216.getTree(), root_0);
					}
					break;

				default :
					break loop47;
				}
			}

			pushFollow(FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2762);
			precedenceEqualExpression217=precedenceEqualExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceEqualExpression217.getTree());

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
	// IdentifiersParser.g:415:1: precedenceAndOperator : KW_AND ;
	public final HiveParser_IdentifiersParser.precedenceAndOperator_return precedenceAndOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAndOperator_return retval = new HiveParser_IdentifiersParser.precedenceAndOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AND218=null;

		CommonTree KW_AND218_tree=null;

		try {
			// IdentifiersParser.g:416:5: ( KW_AND )
			// IdentifiersParser.g:417:5: KW_AND
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_AND218=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_precedenceAndOperator2784); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_AND218_tree = (CommonTree)adaptor.create(KW_AND218);
			adaptor.addChild(root_0, KW_AND218_tree);
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
	// IdentifiersParser.g:420:1: precedenceAndExpression : precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceAndExpression_return precedenceAndExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceAndExpression_return retval = new HiveParser_IdentifiersParser.precedenceAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceNotExpression219 =null;
		ParserRuleReturnScope precedenceAndOperator220 =null;
		ParserRuleReturnScope precedenceNotExpression221 =null;


		try {
			// IdentifiersParser.g:421:5: ( precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )* )
			// IdentifiersParser.g:422:5: precedenceNotExpression ( precedenceAndOperator ^ precedenceNotExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2805);
			precedenceNotExpression219=precedenceNotExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression219.getTree());

			// IdentifiersParser.g:422:29: ( precedenceAndOperator ^ precedenceNotExpression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==KW_AND) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// IdentifiersParser.g:422:30: precedenceAndOperator ^ precedenceNotExpression
					{
					pushFollow(FOLLOW_precedenceAndOperator_in_precedenceAndExpression2808);
					precedenceAndOperator220=precedenceAndOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceAndOperator220.getTree(), root_0);
					pushFollow(FOLLOW_precedenceNotExpression_in_precedenceAndExpression2811);
					precedenceNotExpression221=precedenceNotExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceNotExpression221.getTree());

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
	// IdentifiersParser.g:426:1: precedenceOrOperator : KW_OR ;
	public final HiveParser_IdentifiersParser.precedenceOrOperator_return precedenceOrOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceOrOperator_return retval = new HiveParser_IdentifiersParser.precedenceOrOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_OR222=null;

		CommonTree KW_OR222_tree=null;

		try {
			// IdentifiersParser.g:427:5: ( KW_OR )
			// IdentifiersParser.g:428:5: KW_OR
			{
			root_0 = (CommonTree)adaptor.nil();


			KW_OR222=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_precedenceOrOperator2835); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			KW_OR222_tree = (CommonTree)adaptor.create(KW_OR222);
			adaptor.addChild(root_0, KW_OR222_tree);
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
	// IdentifiersParser.g:431:1: precedenceOrExpression : precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* ;
	public final HiveParser_IdentifiersParser.precedenceOrExpression_return precedenceOrExpression() throws RecognitionException {
		HiveParser_IdentifiersParser.precedenceOrExpression_return retval = new HiveParser_IdentifiersParser.precedenceOrExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope precedenceAndExpression223 =null;
		ParserRuleReturnScope precedenceOrOperator224 =null;
		ParserRuleReturnScope precedenceAndExpression225 =null;


		try {
			// IdentifiersParser.g:432:5: ( precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )* )
			// IdentifiersParser.g:433:5: precedenceAndExpression ( precedenceOrOperator ^ precedenceAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2856);
			precedenceAndExpression223=precedenceAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression223.getTree());

			// IdentifiersParser.g:433:29: ( precedenceOrOperator ^ precedenceAndExpression )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==KW_OR) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// IdentifiersParser.g:433:30: precedenceOrOperator ^ precedenceAndExpression
					{
					pushFollow(FOLLOW_precedenceOrOperator_in_precedenceOrExpression2859);
					precedenceOrOperator224=precedenceOrOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(precedenceOrOperator224.getTree(), root_0);
					pushFollow(FOLLOW_precedenceAndExpression_in_precedenceOrExpression2862);
					precedenceAndExpression225=precedenceAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, precedenceAndExpression225.getTree());

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
	// IdentifiersParser.g:437:1: booleanValue : ( KW_TRUE ^| KW_FALSE ^);
	public final HiveParser_IdentifiersParser.booleanValue_return booleanValue() throws RecognitionException {
		HiveParser_IdentifiersParser.booleanValue_return retval = new HiveParser_IdentifiersParser.booleanValue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_TRUE226=null;
		Token KW_FALSE227=null;

		CommonTree KW_TRUE226_tree=null;
		CommonTree KW_FALSE227_tree=null;

		try {
			// IdentifiersParser.g:438:5: ( KW_TRUE ^| KW_FALSE ^)
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
					// IdentifiersParser.g:439:5: KW_TRUE ^
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_TRUE226=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_booleanValue2886); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_TRUE226_tree = (CommonTree)adaptor.create(KW_TRUE226);
					root_0 = (CommonTree)adaptor.becomeRoot(KW_TRUE226_tree, root_0);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:439:16: KW_FALSE ^
					{
					root_0 = (CommonTree)adaptor.nil();


					KW_FALSE227=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_booleanValue2891); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_FALSE227_tree = (CommonTree)adaptor.create(KW_FALSE227);
					root_0 = (CommonTree)adaptor.becomeRoot(KW_FALSE227_tree, root_0);
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
	// IdentifiersParser.g:442:1: tableOrPartition : tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) ;
	public final HiveParser_IdentifiersParser.tableOrPartition_return tableOrPartition() throws RecognitionException {
		HiveParser_IdentifiersParser.tableOrPartition_return retval = new HiveParser_IdentifiersParser.tableOrPartition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope tableName228 =null;
		ParserRuleReturnScope partitionSpec229 =null;

		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		try {
			// IdentifiersParser.g:443:4: ( tableName ( partitionSpec )? -> ^( TOK_TAB tableName ( partitionSpec )? ) )
			// IdentifiersParser.g:444:4: tableName ( partitionSpec )?
			{
			pushFollow(FOLLOW_tableName_in_tableOrPartition2911);
			tableName228=gHiveParser.tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tableName228.getTree());
			// IdentifiersParser.g:444:14: ( partitionSpec )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==KW_PARTITION) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// IdentifiersParser.g:444:14: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_tableOrPartition2913);
					partitionSpec229=partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec229.getTree());
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
			// 444:29: -> ^( TOK_TAB tableName ( partitionSpec )? )
			{
				// IdentifiersParser.g:444:32: ^( TOK_TAB tableName ( partitionSpec )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TAB, "TOK_TAB"), root_1);
				adaptor.addChild(root_1, stream_tableName.nextTree());
				// IdentifiersParser.g:444:52: ( partitionSpec )?
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
	// IdentifiersParser.g:447:1: partitionSpec : KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) ;
	public final HiveParser_IdentifiersParser.partitionSpec_return partitionSpec() throws RecognitionException {
		HiveParser_IdentifiersParser.partitionSpec_return retval = new HiveParser_IdentifiersParser.partitionSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PARTITION230=null;
		Token LPAREN231=null;
		Token COMMA233=null;
		Token RPAREN235=null;
		ParserRuleReturnScope partitionVal232 =null;
		ParserRuleReturnScope partitionVal234 =null;

		CommonTree KW_PARTITION230_tree=null;
		CommonTree LPAREN231_tree=null;
		CommonTree COMMA233_tree=null;
		CommonTree RPAREN235_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_partitionVal=new RewriteRuleSubtreeStream(adaptor,"rule partitionVal");

		try {
			// IdentifiersParser.g:448:5: ( KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN -> ^( TOK_PARTSPEC ( partitionVal )+ ) )
			// IdentifiersParser.g:449:5: KW_PARTITION LPAREN partitionVal ( COMMA partitionVal )* RPAREN
			{
			KW_PARTITION230=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_partitionSpec2945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION230);

			LPAREN231=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionSpec2952); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN231);

			pushFollow(FOLLOW_partitionVal_in_partitionSpec2954);
			partitionVal232=partitionVal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal232.getTree());
			// IdentifiersParser.g:450:26: ( COMMA partitionVal )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==COMMA) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// IdentifiersParser.g:450:27: COMMA partitionVal
					{
					COMMA233=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionSpec2957); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA233);

					pushFollow(FOLLOW_partitionVal_in_partitionSpec2960);
					partitionVal234=partitionVal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionVal.add(partitionVal234.getTree());
					}
					break;

				default :
					break loop52;
				}
			}

			RPAREN235=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionSpec2965); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN235);

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
			// 450:57: -> ^( TOK_PARTSPEC ( partitionVal )+ )
			{
				// IdentifiersParser.g:450:60: ^( TOK_PARTSPEC ( partitionVal )+ )
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
	// IdentifiersParser.g:453:1: partitionVal : identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) ;
	public final HiveParser_IdentifiersParser.partitionVal_return partitionVal() throws RecognitionException {
		HiveParser_IdentifiersParser.partitionVal_return retval = new HiveParser_IdentifiersParser.partitionVal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL237=null;
		ParserRuleReturnScope identifier236 =null;
		ParserRuleReturnScope constant238 =null;

		CommonTree EQUAL237_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// IdentifiersParser.g:454:5: ( identifier ( EQUAL constant )? -> ^( TOK_PARTVAL identifier ( constant )? ) )
			// IdentifiersParser.g:455:5: identifier ( EQUAL constant )?
			{
			pushFollow(FOLLOW_identifier_in_partitionVal2996);
			identifier236=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier236.getTree());
			// IdentifiersParser.g:455:16: ( EQUAL constant )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EQUAL) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// IdentifiersParser.g:455:17: EQUAL constant
					{
					EQUAL237=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_partitionVal2999); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL237);

					pushFollow(FOLLOW_constant_in_partitionVal3001);
					constant238=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(constant238.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: constant, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 455:34: -> ^( TOK_PARTVAL identifier ( constant )? )
			{
				// IdentifiersParser.g:455:37: ^( TOK_PARTVAL identifier ( constant )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTVAL, "TOK_PARTVAL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				// IdentifiersParser.g:455:62: ( constant )?
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
	// IdentifiersParser.g:458:1: dropPartitionSpec : KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) ;
	public final HiveParser_IdentifiersParser.dropPartitionSpec_return dropPartitionSpec() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionSpec_return retval = new HiveParser_IdentifiersParser.dropPartitionSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PARTITION239=null;
		Token LPAREN240=null;
		Token COMMA242=null;
		Token RPAREN244=null;
		ParserRuleReturnScope dropPartitionVal241 =null;
		ParserRuleReturnScope dropPartitionVal243 =null;

		CommonTree KW_PARTITION239_tree=null;
		CommonTree LPAREN240_tree=null;
		CommonTree COMMA242_tree=null;
		CommonTree RPAREN244_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_dropPartitionVal=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionVal");

		try {
			// IdentifiersParser.g:459:5: ( KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN -> ^( TOK_PARTSPEC ( dropPartitionVal )+ ) )
			// IdentifiersParser.g:460:5: KW_PARTITION LPAREN dropPartitionVal ( COMMA dropPartitionVal )* RPAREN
			{
			KW_PARTITION239=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_dropPartitionSpec3035); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION239);

			LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dropPartitionSpec3042); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN240);

			pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3044);
			dropPartitionVal241=dropPartitionVal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal241.getTree());
			// IdentifiersParser.g:461:30: ( COMMA dropPartitionVal )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==COMMA) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// IdentifiersParser.g:461:31: COMMA dropPartitionVal
					{
					COMMA242=(Token)match(input,COMMA,FOLLOW_COMMA_in_dropPartitionSpec3047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA242);

					pushFollow(FOLLOW_dropPartitionVal_in_dropPartitionSpec3050);
					dropPartitionVal243=dropPartitionVal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_dropPartitionVal.add(dropPartitionVal243.getTree());
					}
					break;

				default :
					break loop54;
				}
			}

			RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dropPartitionSpec3055); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN244);

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
			// 461:65: -> ^( TOK_PARTSPEC ( dropPartitionVal )+ )
			{
				// IdentifiersParser.g:461:68: ^( TOK_PARTSPEC ( dropPartitionVal )+ )
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
	// IdentifiersParser.g:464:1: dropPartitionVal : identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) ;
	public final HiveParser_IdentifiersParser.dropPartitionVal_return dropPartitionVal() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionVal_return retval = new HiveParser_IdentifiersParser.dropPartitionVal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier245 =null;
		ParserRuleReturnScope dropPartitionOperator246 =null;
		ParserRuleReturnScope constant247 =null;

		RewriteRuleSubtreeStream stream_dropPartitionOperator=new RewriteRuleSubtreeStream(adaptor,"rule dropPartitionOperator");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// IdentifiersParser.g:465:5: ( identifier dropPartitionOperator constant -> ^( TOK_PARTVAL identifier dropPartitionOperator constant ) )
			// IdentifiersParser.g:466:5: identifier dropPartitionOperator constant
			{
			pushFollow(FOLLOW_identifier_in_dropPartitionVal3086);
			identifier245=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier245.getTree());
			pushFollow(FOLLOW_dropPartitionOperator_in_dropPartitionVal3088);
			dropPartitionOperator246=dropPartitionOperator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dropPartitionOperator.add(dropPartitionOperator246.getTree());
			pushFollow(FOLLOW_constant_in_dropPartitionVal3090);
			constant247=constant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constant.add(constant247.getTree());
			// AST REWRITE
			// elements: constant, dropPartitionOperator, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 466:47: -> ^( TOK_PARTVAL identifier dropPartitionOperator constant )
			{
				// IdentifiersParser.g:466:50: ^( TOK_PARTVAL identifier dropPartitionOperator constant )
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
	// IdentifiersParser.g:469:1: dropPartitionOperator : ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN );
	public final HiveParser_IdentifiersParser.dropPartitionOperator_return dropPartitionOperator() throws RecognitionException {
		HiveParser_IdentifiersParser.dropPartitionOperator_return retval = new HiveParser_IdentifiersParser.dropPartitionOperator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set248=null;

		CommonTree set248_tree=null;

		try {
			// IdentifiersParser.g:470:5: ( EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set248=input.LT(1);
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set248));
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
	// IdentifiersParser.g:474:1: sysFuncNames : ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN );
	public final HiveParser_IdentifiersParser.sysFuncNames_return sysFuncNames() throws RecognitionException {
		HiveParser_IdentifiersParser.sysFuncNames_return retval = new HiveParser_IdentifiersParser.sysFuncNames_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set249=null;

		CommonTree set249_tree=null;

		try {
			// IdentifiersParser.g:475:5: ( KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_CASE | KW_WHEN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_BOOLEAN | KW_STRING | KW_BINARY | KW_ARRAY | KW_MAP | KW_STRUCT | KW_UNIONTYPE | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | KW_RLIKE | KW_REGEXP | KW_IN | KW_BETWEEN )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set249=input.LT(1);
			if ( input.LA(1)==AMPERSAND||(input.LA(1) >= BITWISEOR && input.LA(1) <= BITWISEXOR)||(input.LA(1) >= DIV && input.LA(1) <= DIVIDE)||(input.LA(1) >= EQUAL && input.LA(1) <= EQUAL_NS)||(input.LA(1) >= GREATERTHAN && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_AND||input.LA(1)==KW_ARRAY||(input.LA(1) >= KW_BETWEEN && input.LA(1) <= KW_BOOLEAN)||input.LA(1)==KW_CASE||input.LA(1)==KW_DOUBLE||input.LA(1)==KW_FLOAT||input.LA(1)==KW_IF||input.LA(1)==KW_IN||input.LA(1)==KW_INT||input.LA(1)==KW_LIKE||input.LA(1)==KW_MAP||input.LA(1)==KW_NOT||input.LA(1)==KW_OR||input.LA(1)==KW_REGEXP||input.LA(1)==KW_RLIKE||input.LA(1)==KW_SMALLINT||(input.LA(1) >= KW_STRING && input.LA(1) <= KW_STRUCT)||input.LA(1)==KW_TINYINT||input.LA(1)==KW_UNIONTYPE||input.LA(1)==KW_WHEN||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==MINUS||input.LA(1)==MOD||input.LA(1)==NOTEQUAL||input.LA(1)==PLUS||input.LA(1)==STAR||input.LA(1)==TILDE ) {
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
	// $ANTLR end "sysFuncNames"


	public static class descFuncNames_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "descFuncNames"
	// IdentifiersParser.g:519:1: descFuncNames : ( sysFuncNames | StringLiteral | identifier );
	public final HiveParser_IdentifiersParser.descFuncNames_return descFuncNames() throws RecognitionException {
		HiveParser_IdentifiersParser.descFuncNames_return retval = new HiveParser_IdentifiersParser.descFuncNames_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token StringLiteral251=null;
		ParserRuleReturnScope sysFuncNames250 =null;
		ParserRuleReturnScope identifier252 =null;

		CommonTree StringLiteral251_tree=null;

		try {
			// IdentifiersParser.g:520:5: ( sysFuncNames | StringLiteral | identifier )
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
					// IdentifiersParser.g:521:7: sysFuncNames
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sysFuncNames_in_descFuncNames3509);
					sysFuncNames250=sysFuncNames();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sysFuncNames250.getTree());

					}
					break;
				case 2 :
					// IdentifiersParser.g:522:7: StringLiteral
					{
					root_0 = (CommonTree)adaptor.nil();


					StringLiteral251=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_descFuncNames3517); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					StringLiteral251_tree = (CommonTree)adaptor.create(StringLiteral251);
					adaptor.addChild(root_0, StringLiteral251_tree);
					}

					}
					break;
				case 3 :
					// IdentifiersParser.g:523:7: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_descFuncNames3525);
					identifier252=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier252.getTree());

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
	// IdentifiersParser.g:526:1: identifier : ( Identifier | nonReserved -> Identifier[$nonReserved.text] );
	public final HiveParser_IdentifiersParser.identifier_return identifier() throws RecognitionException {
		HiveParser_IdentifiersParser.identifier_return retval = new HiveParser_IdentifiersParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Identifier253=null;
		ParserRuleReturnScope nonReserved254 =null;

		CommonTree Identifier253_tree=null;
		RewriteRuleSubtreeStream stream_nonReserved=new RewriteRuleSubtreeStream(adaptor,"rule nonReserved");

		try {
			// IdentifiersParser.g:527:5: ( Identifier | nonReserved -> Identifier[$nonReserved.text] )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==Identifier) ) {
				alt56=1;
			}
			else if ( ((LA56_0 >= KW_ADD && LA56_0 <= KW_AFTER)||(LA56_0 >= KW_ALTER && LA56_0 <= KW_ANALYZE)||(LA56_0 >= KW_ARCHIVE && LA56_0 <= KW_CASCADE)||(LA56_0 >= KW_CHANGE && LA56_0 <= KW_COLLECTION)||(LA56_0 >= KW_COLUMNS && LA56_0 <= KW_CREATE)||LA56_0==KW_CUBE||(LA56_0 >= KW_CURSOR && LA56_0 <= KW_DATA)||(LA56_0 >= KW_DATABASES && LA56_0 <= KW_DISABLE)||(LA56_0 >= KW_DISTRIBUTE && LA56_0 <= KW_DROP)||LA56_0==KW_ELEM_TYPE||LA56_0==KW_ENABLE||LA56_0==KW_ESCAPED||(LA56_0 >= KW_EXCLUSIVE && LA56_0 <= KW_EXPORT)||(LA56_0 >= KW_EXTERNAL && LA56_0 <= KW_FLOAT)||(LA56_0 >= KW_FOR && LA56_0 <= KW_FORMATTED)||LA56_0==KW_FULL||(LA56_0 >= KW_FUNCTIONS && LA56_0 <= KW_GROUPING)||(LA56_0 >= KW_HOLD_DDLTIME && LA56_0 <= KW_IDXPROPERTIES)||(LA56_0 >= KW_IGNORE && LA56_0 <= KW_INCRE)||(LA56_0 >= KW_INDEX && LA56_0 <= KW_ITEMS)||(LA56_0 >= KW_KEYS && LA56_0 <= KW_LEFT)||(LA56_0 >= KW_LIKE && LA56_0 <= KW_LONG)||(LA56_0 >= KW_MAPJOIN && LA56_0 <= KW_MINUS)||(LA56_0 >= KW_MSCK && LA56_0 <= KW_NOSCAN)||(LA56_0 >= KW_NO_DROP && LA56_0 <= KW_OFFLINE)||LA56_0==KW_OPTION||(LA56_0 >= KW_ORCFILE && LA56_0 <= KW_OUTPUTFORMAT)||LA56_0==KW_OVERWRITE||(LA56_0 >= KW_PARTITION && LA56_0 <= KW_PLUS)||(LA56_0 >= KW_PRETTY && LA56_0 <= KW_RECORDWRITER)||(LA56_0 >= KW_REGEXP && LA56_0 <= KW_SCHEMAS)||(LA56_0 >= KW_SEMI && LA56_0 <= KW_TABLES)||(LA56_0 >= KW_TBLPROPERTIES && LA56_0 <= KW_TEXTFILE)||(LA56_0 >= KW_TIMESTAMP && LA56_0 <= KW_TOUCH)||(LA56_0 >= KW_TRIGGER && LA56_0 <= KW_UNARCHIVE)||(LA56_0 >= KW_UNDO && LA56_0 <= KW_UNIONTYPE)||(LA56_0 >= KW_UNLOCK && LA56_0 <= KW_VALUE_TYPE)||LA56_0==KW_VIEW||LA56_0==KW_WHILE||LA56_0==KW_WITH) ) {
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
					// IdentifiersParser.g:528:5: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier253=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier3546); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier253_tree = (CommonTree)adaptor.create(Identifier253);
					adaptor.addChild(root_0, Identifier253_tree);
					}

					}
					break;
				case 2 :
					// IdentifiersParser.g:529:7: nonReserved
					{
					pushFollow(FOLLOW_nonReserved_in_identifier3554);
					nonReserved254=nonReserved();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nonReserved.add(nonReserved254.getTree());
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
					// 529:19: -> Identifier[$nonReserved.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(Identifier, (nonReserved254!=null?input.toString(nonReserved254.start,nonReserved254.stop):null)));
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
	// IdentifiersParser.g:532:1: nonReserved : ( KW_INCRE | KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER );
	public final HiveParser_IdentifiersParser.nonReserved_return nonReserved() throws RecognitionException {
		HiveParser_IdentifiersParser.nonReserved_return retval = new HiveParser_IdentifiersParser.nonReserved_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set255=null;

		CommonTree set255_tree=null;

		try {
			// IdentifiersParser.g:533:5: ( KW_INCRE | KW_TRUE | KW_FALSE | KW_LIKE | KW_EXISTS | KW_ASC | KW_DESC | KW_ORDER | KW_GROUP | KW_BY | KW_AS | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_LEFT | KW_RIGHT | KW_FULL | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_IGNORE | KW_PROTECTION | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_DECIMAL | KW_STRING | KW_ARRAY | KW_STRUCT | KW_UNIONTYPE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_SEQUENCEFILE | KW_TEXTFILE | KW_RCFILE | KW_ORCFILE | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_OFFLINE | KW_ENABLE | KW_DISABLE | KW_READONLY | KW_NO_DROP | KW_LOCATION | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_EXPLAIN | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_MAPJOIN | KW_STREAMTABLE | KW_HOLD_DDLTIME | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_INNER )
			// IdentifiersParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set255=input.LT(1);
			if ( (input.LA(1) >= KW_ADD && input.LA(1) <= KW_AFTER)||(input.LA(1) >= KW_ALTER && input.LA(1) <= KW_ANALYZE)||(input.LA(1) >= KW_ARCHIVE && input.LA(1) <= KW_CASCADE)||(input.LA(1) >= KW_CHANGE && input.LA(1) <= KW_COLLECTION)||(input.LA(1) >= KW_COLUMNS && input.LA(1) <= KW_CREATE)||input.LA(1)==KW_CUBE||(input.LA(1) >= KW_CURSOR && input.LA(1) <= KW_DATA)||(input.LA(1) >= KW_DATABASES && input.LA(1) <= KW_DISABLE)||(input.LA(1) >= KW_DISTRIBUTE && input.LA(1) <= KW_DROP)||input.LA(1)==KW_ELEM_TYPE||input.LA(1)==KW_ENABLE||input.LA(1)==KW_ESCAPED||(input.LA(1) >= KW_EXCLUSIVE && input.LA(1) <= KW_EXPORT)||(input.LA(1) >= KW_EXTERNAL && input.LA(1) <= KW_FLOAT)||(input.LA(1) >= KW_FOR && input.LA(1) <= KW_FORMATTED)||input.LA(1)==KW_FULL||(input.LA(1) >= KW_FUNCTIONS && input.LA(1) <= KW_GROUPING)||(input.LA(1) >= KW_HOLD_DDLTIME && input.LA(1) <= KW_IDXPROPERTIES)||(input.LA(1) >= KW_IGNORE && input.LA(1) <= KW_INCRE)||(input.LA(1) >= KW_INDEX && input.LA(1) <= KW_ITEMS)||(input.LA(1) >= KW_KEYS && input.LA(1) <= KW_LEFT)||(input.LA(1) >= KW_LIKE && input.LA(1) <= KW_LONG)||(input.LA(1) >= KW_MAPJOIN && input.LA(1) <= KW_MINUS)||(input.LA(1) >= KW_MSCK && input.LA(1) <= KW_NOSCAN)||(input.LA(1) >= KW_NO_DROP && input.LA(1) <= KW_OFFLINE)||input.LA(1)==KW_OPTION||(input.LA(1) >= KW_ORCFILE && input.LA(1) <= KW_OUTPUTFORMAT)||input.LA(1)==KW_OVERWRITE||(input.LA(1) >= KW_PARTITION && input.LA(1) <= KW_PLUS)||(input.LA(1) >= KW_PRETTY && input.LA(1) <= KW_RECORDWRITER)||(input.LA(1) >= KW_REGEXP && input.LA(1) <= KW_SCHEMAS)||(input.LA(1) >= KW_SEMI && input.LA(1) <= KW_TABLES)||(input.LA(1) >= KW_TBLPROPERTIES && input.LA(1) <= KW_TEXTFILE)||(input.LA(1) >= KW_TIMESTAMP && input.LA(1) <= KW_TOUCH)||(input.LA(1) >= KW_TRIGGER && input.LA(1) <= KW_UNARCHIVE)||(input.LA(1) >= KW_UNDO && input.LA(1) <= KW_UNIONTYPE)||(input.LA(1) >= KW_UNLOCK && input.LA(1) <= KW_VALUE_TYPE)||input.LA(1)==KW_VIEW||input.LA(1)==KW_WHILE||input.LA(1)==KW_WITH ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set255));
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
		"\u02a2\uffff";
	static final String DFA6_eofS =
		"\u02a2\uffff";
	static final String DFA6_minS =
		"\1\11\34\uffff\1\11\1\uffff\2\11\16\4\1\16\2\4\1\u018a\1\4\1\u018a\4\4"+
		"\1\u018a\2\11\u0266\uffff";
	static final String DFA6_maxS =
		"\1\u044e\34\uffff\1\u044e\1\uffff\2\u044e\1\u01a1\1\u01a4\7\u01a1\1\u01a4"+
		"\4\u01a1\1\16\2\u01a1\1\u018a\1\u01a1\1\u018a\4\u01a1\1\u018a\2\u044e"+
		"\u0266\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\34\uffff\1\3\35\uffff\120\1\1\2\30\1\1\uffff\26\1\1\uffff"+
		"\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1"+
		"\1\uffff\27\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff\26\1\1\uffff"+
		"\30\1\1\uffff\27\1\1\uffff\30\1\1\uffff\30\1\1\uffff\27\1\1\uffff\27\1"+
		"\1\uffff\27\1\1\uffff\74\1";
	static final String DFA6_specialS =
		"\u02a2\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\5\uffff\1\1\6\uffff\1\1\170\uffff\1\1\3\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\25\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff"+
			"\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\14\1\1\uffff\4\1\1\uffff"+
			"\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\14\1\1\uffff\16\1\1\uffff\25\1\1\uffff\4\1\1\uffff\4\1\1"+
			"\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1"+
			"\1\3\uffff\1\35\4\uffff\1\1\6\uffff\1\1\1\uffff\1\1\12\uffff\2\1\1\uffff"+
			"\1\1\4\uffff\1\1\21\uffff\1\1\5\uffff\1\1\u0160\uffff\2\1\6\uffff\1\1"+
			"\u0121\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53\5\uffff\1\57\6\uffff\1\56\170\uffff\1\67\3\uffff\2\70\1\uffff"+
			"\2\70\1\uffff\1\70\1\63\14\70\1\72\1\71\5\70\1\uffff\6\70\1\uffff\1\70"+
			"\1\uffff\2\70\1\uffff\1\70\1\42\14\70\1\uffff\3\70\2\uffff\1\70\1\uffff"+
			"\1\70\1\uffff\1\70\1\uffff\4\70\1\uffff\1\70\1\61\5\70\1\uffff\3\70\1"+
			"\uffff\1\70\1\uffff\4\70\1\uffff\2\70\1\62\4\70\1\uffff\14\70\1\uffff"+
			"\4\70\1\uffff\12\70\1\uffff\1\64\3\70\1\uffff\2\70\1\37\1\70\1\41\2\70"+
			"\1\uffff\1\70\1\uffff\6\70\1\uffff\1\70\1\uffff\5\70\2\uffff\14\70\1"+
			"\uffff\16\70\1\uffff\22\70\1\65\2\70\1\uffff\4\70\1\uffff\4\70\1\uffff"+
			"\1\70\1\60\2\70\1\uffff\2\70\1\66\1\uffff\12\70\1\uffff\1\70\2\uffff"+
			"\1\70\1\uffff\1\70\3\uffff\1\73\4\uffff\1\40\6\uffff\1\43\1\uffff\1\40"+
			"\2\uffff\1\36\7\uffff\1\54\1\52\1\uffff\1\40\4\uffff\1\55\21\uffff\1"+
			"\46\5\uffff\1\47\u0160\uffff\1\50\1\45\6\uffff\1\51\u0121\uffff\1\44",
			"",
			"\1\107\5\uffff\1\113\6\uffff\1\112\170\uffff\1\123\3\uffff\2\124\1\uffff"+
			"\2\124\1\uffff\1\124\1\117\14\124\1\126\1\125\5\124\1\uffff\6\124\1\uffff"+
			"\1\124\1\uffff\2\124\1\uffff\1\124\1\76\14\124\1\uffff\3\124\2\uffff"+
			"\1\124\1\uffff\1\124\1\uffff\1\124\1\uffff\4\124\1\uffff\1\124\1\115"+
			"\5\124\1\uffff\3\124\1\uffff\1\124\1\uffff\4\124\1\uffff\2\124\1\116"+
			"\4\124\1\uffff\14\124\1\uffff\4\124\1\uffff\12\124\1\uffff\1\120\3\124"+
			"\1\uffff\2\124\1\130\1\124\1\75\2\124\1\uffff\1\124\1\uffff\6\124\1\uffff"+
			"\1\124\1\uffff\5\124\2\uffff\14\124\1\uffff\16\124\1\uffff\22\124\1\121"+
			"\2\124\1\uffff\4\124\1\uffff\4\124\1\uffff\1\124\1\114\2\124\1\uffff"+
			"\2\124\1\122\1\uffff\12\124\1\uffff\1\124\2\uffff\1\124\1\uffff\1\124"+
			"\3\uffff\1\127\4\uffff\1\74\6\uffff\1\77\1\uffff\1\74\12\uffff\1\110"+
			"\1\106\1\uffff\1\74\4\uffff\1\111\21\uffff\1\102\5\uffff\1\103\u0160"+
			"\uffff\1\104\1\101\6\uffff\1\105\u0121\uffff\1\100",
			"\1\143\5\uffff\1\147\6\uffff\1\146\170\uffff\1\157\3\uffff\2\160\1\uffff"+
			"\2\160\1\uffff\1\160\1\153\14\160\1\162\1\161\5\160\1\uffff\6\160\1\uffff"+
			"\1\160\1\uffff\2\160\1\uffff\1\160\1\132\14\160\1\uffff\3\160\2\uffff"+
			"\1\160\1\uffff\1\160\1\uffff\1\160\1\uffff\4\160\1\uffff\1\160\1\151"+
			"\5\160\1\uffff\3\160\1\uffff\1\160\1\uffff\4\160\1\uffff\2\160\1\152"+
			"\4\160\1\uffff\14\160\1\uffff\4\160\1\uffff\12\160\1\uffff\1\154\3\160"+
			"\1\uffff\2\160\1\uffff\1\160\1\131\2\160\1\uffff\1\160\1\uffff\6\160"+
			"\1\uffff\1\160\1\uffff\5\160\2\uffff\14\160\1\uffff\16\160\1\uffff\22"+
			"\160\1\155\2\160\1\uffff\4\160\1\uffff\4\160\1\uffff\1\160\1\150\2\160"+
			"\1\uffff\2\160\1\156\1\uffff\12\160\1\uffff\1\160\2\uffff\1\160\1\uffff"+
			"\1\160\3\uffff\1\163\4\uffff\1\164\6\uffff\1\133\1\uffff\1\164\12\uffff"+
			"\1\144\1\142\1\uffff\1\164\4\uffff\1\145\21\uffff\1\136\5\uffff\1\137"+
			"\u0160\uffff\1\140\1\135\6\uffff\1\141\u0121\uffff\1\134",
			"\1\173\2\uffff\1\174\1\170\3\uffff\1\u008c\5\uffff\2\171\1\uffff\1\166"+
			"\2\uffff\1\177\1\u0080\3\uffff\1\u0085\1\u0084\171\uffff\1\u0088\5\uffff"+
			"\1\u0087\123\uffff\1\u0086\14\uffff\1\167\7\uffff\1\176\21\uffff\1\175"+
			"\6\uffff\1\u0089\35\uffff\1\176\6\uffff\1\176\102\uffff\1\u0083\1\u0082"+
			"\1\u008b\1\165\3\uffff\1\172\1\uffff\1\171\2\uffff\1\u0081\3\uffff\1"+
			"\172\2\uffff\1\u008a\5\uffff\1\171",
			"\1\u0095\2\uffff\1\u0096\1\u0092\3\uffff\1\u008c\5\uffff\2\u0093\1\uffff"+
			"\1\u0090\2\uffff\1\u0099\1\u009a\3\uffff\1\u009f\1\u009e\171\uffff\1"+
			"\u00a2\5\uffff\1\u00a1\123\uffff\1\u00a0\14\uffff\1\u0091\7\uffff\1\u0098"+
			"\21\uffff\1\u0097\6\uffff\1\u00a3\35\uffff\1\u0098\6\uffff\1\u0098\102"+
			"\uffff\1\u009d\1\u009c\1\u008e\1\u008f\3\uffff\1\u0094\1\uffff\1\u0093"+
			"\2\uffff\1\u009b\3\uffff\1\u0094\2\uffff\1\u00a4\5\uffff\1\u0093\2\uffff"+
			"\1\u008d",
			"\1\u00ac\2\uffff\1\u00ad\1\u00a9\3\uffff\1\u008c\5\uffff\2\u00aa\1\uffff"+
			"\1\u00a7\2\uffff\1\u00b0\1\u00b1\3\uffff\1\u00b6\1\u00b5\171\uffff\1"+
			"\u00b9\5\uffff\1\u00b8\123\uffff\1\u00b7\14\uffff\1\u00a8\7\uffff\1\u00af"+
			"\21\uffff\1\u00ae\6\uffff\1\u00ba\35\uffff\1\u00af\6\uffff\1\u00af\102"+
			"\uffff\1\u00b4\1\u00b3\1\uffff\1\u00a6\3\uffff\1\u00ab\1\uffff\1\u00aa"+
			"\2\uffff\1\u00b2\3\uffff\1\u00ab\2\uffff\1\u00bb\5\uffff\1\u00aa",
			"\1\u00c3\2\uffff\1\u00c4\1\u00c0\3\uffff\1\u008c\5\uffff\2\u00c1\1\uffff"+
			"\1\u00be\2\uffff\1\u00c7\1\u00c8\3\uffff\1\u00cd\1\u00cc\171\uffff\1"+
			"\u00d0\5\uffff\1\u00cf\123\uffff\1\u00ce\14\uffff\1\u00bf\7\uffff\1\u00c6"+
			"\21\uffff\1\u00c5\6\uffff\1\u00d1\35\uffff\1\u00c6\6\uffff\1\u00c6\102"+
			"\uffff\1\u00cb\1\u00ca\1\uffff\1\u00bd\3\uffff\1\u00c2\1\uffff\1\u00c1"+
			"\2\uffff\1\u00c9\3\uffff\1\u00c2\2\uffff\1\u00d2\5\uffff\1\u00c1",
			"\1\u00da\2\uffff\1\u00db\1\u00d7\3\uffff\1\u008c\5\uffff\2\u00d8\1\uffff"+
			"\1\u00d5\2\uffff\1\u00de\1\u00df\3\uffff\1\u00e4\1\u00e3\171\uffff\1"+
			"\u00e7\5\uffff\1\u00e6\123\uffff\1\u00e5\14\uffff\1\u00d6\7\uffff\1\u00dd"+
			"\21\uffff\1\u00dc\6\uffff\1\u00e8\35\uffff\1\u00dd\6\uffff\1\u00dd\102"+
			"\uffff\1\u00e2\1\u00e1\1\uffff\1\u00d4\3\uffff\1\u00d9\1\uffff\1\u00d8"+
			"\2\uffff\1\u00e0\3\uffff\1\u00d9\2\uffff\1\u00e9\5\uffff\1\u00d8",
			"\1\u00f1\2\uffff\1\u00f2\1\u00ee\3\uffff\1\u008c\5\uffff\2\u00ef\1\uffff"+
			"\1\u00ec\2\uffff\1\u00f5\1\u00f6\3\uffff\1\u00fb\1\u00fa\171\uffff\1"+
			"\u00fe\5\uffff\1\u00fd\123\uffff\1\u00fc\14\uffff\1\u00ed\7\uffff\1\u00f4"+
			"\21\uffff\1\u00f3\6\uffff\1\u00ff\35\uffff\1\u00f4\6\uffff\1\u00f4\102"+
			"\uffff\1\u00f9\1\u00f8\1\uffff\1\u00eb\3\uffff\1\u00f0\1\uffff\1\u00ef"+
			"\2\uffff\1\u00f7\3\uffff\1\u00f0\2\uffff\1\u0100\5\uffff\1\u00ef",
			"\1\u0108\2\uffff\1\u0109\1\u0105\3\uffff\1\u008c\5\uffff\2\u0106\1\uffff"+
			"\1\u0103\2\uffff\1\u010c\1\u010d\3\uffff\1\u0112\1\u0111\171\uffff\1"+
			"\u0115\5\uffff\1\u0114\123\uffff\1\u0113\14\uffff\1\u0104\7\uffff\1\u010b"+
			"\21\uffff\1\u010a\6\uffff\1\u0116\35\uffff\1\u010b\6\uffff\1\u010b\102"+
			"\uffff\1\u0110\1\u010f\1\uffff\1\u0102\3\uffff\1\u0107\1\uffff\1\u0106"+
			"\2\uffff\1\u010e\3\uffff\1\u0107\2\uffff\1\u0117\5\uffff\1\u0106",
			"\1\u011f\2\uffff\1\u0120\1\u011c\3\uffff\1\u008c\5\uffff\2\u011d\1\uffff"+
			"\1\u011a\2\uffff\1\u0123\1\u0124\3\uffff\1\u0129\1\u0128\171\uffff\1"+
			"\u012c\5\uffff\1\u012b\123\uffff\1\u012a\14\uffff\1\u011b\7\uffff\1\u0122"+
			"\21\uffff\1\u0121\6\uffff\1\u012d\35\uffff\1\u0122\6\uffff\1\u0122\102"+
			"\uffff\1\u0127\1\u0126\1\uffff\1\u0119\3\uffff\1\u011e\1\uffff\1\u011d"+
			"\2\uffff\1\u0125\3\uffff\1\u011e\2\uffff\1\u012e\5\uffff\1\u011d",
			"\1\u0136\2\uffff\1\u0137\1\u0133\3\uffff\1\u008c\5\uffff\2\u0134\1\uffff"+
			"\1\u0131\2\uffff\1\u013a\1\u013b\3\uffff\1\u0140\1\u013f\171\uffff\1"+
			"\u0143\5\uffff\1\u0142\123\uffff\1\u0141\14\uffff\1\u0132\7\uffff\1\u0139"+
			"\21\uffff\1\u0138\6\uffff\1\u0144\35\uffff\1\u0139\6\uffff\1\u0139\102"+
			"\uffff\1\u013e\1\u013d\1\uffff\1\u0130\3\uffff\1\u0135\1\uffff\1\u0134"+
			"\2\uffff\1\u013c\3\uffff\1\u0135\2\uffff\1\u0145\5\uffff\1\u0134",
			"\1\u014d\2\uffff\1\u014e\1\u014a\3\uffff\1\u008c\5\uffff\2\u014b\1\uffff"+
			"\1\u0148\2\uffff\1\u0151\1\u0152\3\uffff\1\u0157\1\u0156\171\uffff\1"+
			"\u015a\5\uffff\1\u0159\123\uffff\1\u0158\14\uffff\1\u0149\7\uffff\1\u0150"+
			"\21\uffff\1\u014f\6\uffff\1\u015b\35\uffff\1\u0150\6\uffff\1\u0150\102"+
			"\uffff\1\u0155\1\u0154\1\uffff\1\u0147\3\uffff\1\u014c\1\uffff\1\u014b"+
			"\2\uffff\1\u0153\3\uffff\1\u014c\2\uffff\1\u015c\5\uffff\1\u014b\2\uffff"+
			"\1\u015d",
			"\1\u0165\2\uffff\1\u0166\1\u0162\3\uffff\1\u008c\5\uffff\2\u0163\1\uffff"+
			"\1\u0160\2\uffff\1\u0169\1\u016a\3\uffff\1\u016f\1\u016e\171\uffff\1"+
			"\u0172\5\uffff\1\u0171\123\uffff\1\u0170\14\uffff\1\u0161\7\uffff\1\u0168"+
			"\21\uffff\1\u0167\6\uffff\1\u0173\35\uffff\1\u0168\6\uffff\1\u0168\102"+
			"\uffff\1\u016d\1\u016c\1\uffff\1\u015f\3\uffff\1\u0164\1\uffff\1\u0163"+
			"\2\uffff\1\u016b\3\uffff\1\u0164\2\uffff\1\u0174\5\uffff\1\u0163",
			"\1\u017c\2\uffff\1\u017d\1\u0179\3\uffff\1\u008c\5\uffff\2\u017a\1\uffff"+
			"\1\u0177\2\uffff\1\u0180\1\u0181\3\uffff\1\u0186\1\u0185\171\uffff\1"+
			"\u0189\5\uffff\1\u0188\123\uffff\1\u0187\14\uffff\1\u0178\7\uffff\1\u017f"+
			"\21\uffff\1\u017e\6\uffff\1\u018a\35\uffff\1\u017f\6\uffff\1\u017f\102"+
			"\uffff\1\u0184\1\u0183\1\uffff\1\u0176\3\uffff\1\u017b\1\uffff\1\u017a"+
			"\2\uffff\1\u0182\3\uffff\1\u017b\2\uffff\1\u018b\5\uffff\1\u017a",
			"\1\u0193\2\uffff\1\u0194\1\u0190\3\uffff\1\u008c\5\uffff\2\u0191\1\uffff"+
			"\1\u018e\2\uffff\1\u0197\1\u0198\3\uffff\1\u019d\1\u019c\171\uffff\1"+
			"\u01a0\5\uffff\1\u019f\123\uffff\1\u019e\14\uffff\1\u018f\7\uffff\1\u0196"+
			"\21\uffff\1\u0195\6\uffff\1\u01a1\35\uffff\1\u0196\6\uffff\1\u0196\102"+
			"\uffff\1\u019b\1\u019a\1\uffff\1\u018d\3\uffff\1\u0192\1\uffff\1\u0191"+
			"\2\uffff\1\u0199\3\uffff\1\u0192\2\uffff\1\u01a2\5\uffff\1\u0191",
			"\1\u01aa\2\uffff\1\u01ab\1\u01a7\3\uffff\1\u008c\5\uffff\2\u01a8\1\uffff"+
			"\1\u01a5\2\uffff\1\u01ae\1\u01af\3\uffff\1\u01b4\1\u01b3\171\uffff\1"+
			"\u01b7\5\uffff\1\u01b6\123\uffff\1\u01b5\14\uffff\1\u01a6\7\uffff\1\u01ad"+
			"\21\uffff\1\u01ac\6\uffff\1\u01b8\35\uffff\1\u01ad\6\uffff\1\u01ad\102"+
			"\uffff\1\u01b2\1\u01b1\1\uffff\1\u01a4\3\uffff\1\u01a9\1\uffff\1\u01a8"+
			"\2\uffff\1\u01b0\3\uffff\1\u01a9\2\uffff\1\u01b9\5\uffff\1\u01a8",
			"\1\u01bb",
			"\1\u01c2\2\uffff\1\u01c3\1\u01bf\3\uffff\1\u008c\5\uffff\2\u01c0\1\uffff"+
			"\1\u01bd\2\uffff\1\u01c6\1\u01c7\3\uffff\1\u01cc\1\u01cb\171\uffff\1"+
			"\u01cf\5\uffff\1\u01ce\123\uffff\1\u01cd\14\uffff\1\u01be\7\uffff\1\u01c5"+
			"\21\uffff\1\u01c4\6\uffff\1\u01d0\35\uffff\1\u01c5\6\uffff\1\u01c5\102"+
			"\uffff\1\u01ca\1\u01c9\1\u01d2\1\u01bc\3\uffff\1\u01c1\1\uffff\1\u01c0"+
			"\2\uffff\1\u01c8\3\uffff\1\u01c1\2\uffff\1\u01d1\5\uffff\1\u01c0",
			"\1\u01da\2\uffff\1\u01db\1\u01d7\3\uffff\1\u008c\5\uffff\2\u01d8\1\uffff"+
			"\1\u01d5\2\uffff\1\u01de\1\u01df\3\uffff\1\u01e4\1\u01e3\171\uffff\1"+
			"\u01e7\5\uffff\1\u01e6\123\uffff\1\u01e5\14\uffff\1\u01d6\7\uffff\1\u01dd"+
			"\21\uffff\1\u01dc\6\uffff\1\u01e8\35\uffff\1\u01dd\6\uffff\1\u01dd\102"+
			"\uffff\1\u01e2\1\u01e1\1\u01ea\1\u01d4\3\uffff\1\u01d9\1\uffff\1\u01d8"+
			"\2\uffff\1\u01e0\3\uffff\1\u01d9\2\uffff\1\u01e9\5\uffff\1\u01d8",
			"\1\u01ec",
			"\1\u01f4\2\uffff\1\u01f5\1\u01f1\3\uffff\1\u008c\5\uffff\2\u01f2\1\uffff"+
			"\1\u01ef\2\uffff\1\u01f8\1\u01f9\3\uffff\1\u01fe\1\u01fd\171\uffff\1"+
			"\u0201\5\uffff\1\u0200\123\uffff\1\u01ff\14\uffff\1\u01f0\7\uffff\1\u01f7"+
			"\21\uffff\1\u01f6\6\uffff\1\u0202\35\uffff\1\u01f7\6\uffff\1\u01f7\102"+
			"\uffff\1\u01fc\1\u01fb\1\u01ed\1\u01ee\3\uffff\1\u01f3\1\uffff\1\u01f2"+
			"\2\uffff\1\u01fa\3\uffff\1\u01f3\2\uffff\1\u0203\5\uffff\1\u01f2",
			"\1\u0205",
			"\1\u020d\2\uffff\1\u020e\1\u020a\3\uffff\1\u008c\5\uffff\2\u020b\1\uffff"+
			"\1\u0208\2\uffff\1\u0211\1\u0212\3\uffff\1\u0217\1\u0216\171\uffff\1"+
			"\u021a\5\uffff\1\u0219\123\uffff\1\u0218\14\uffff\1\u0209\7\uffff\1\u0210"+
			"\21\uffff\1\u020f\6\uffff\1\u021b\35\uffff\1\u0210\6\uffff\1\u0210\102"+
			"\uffff\1\u0215\1\u0214\1\u0206\1\u0207\3\uffff\1\u020c\1\uffff\1\u020b"+
			"\2\uffff\1\u0213\3\uffff\1\u020c\2\uffff\1\u021c\5\uffff\1\u020b",
			"\1\u0225\2\uffff\1\u0226\1\u0222\3\uffff\1\u008c\5\uffff\2\u0223\1\uffff"+
			"\1\u0220\2\uffff\1\u0229\1\u022a\3\uffff\1\u022f\1\u022e\171\uffff\1"+
			"\u0232\5\uffff\1\u0231\123\uffff\1\u0230\14\uffff\1\u0221\7\uffff\1\u0228"+
			"\21\uffff\1\u0227\6\uffff\1\u0233\35\uffff\1\u0228\6\uffff\1\u0228\102"+
			"\uffff\1\u022d\1\u022c\1\u021e\1\u021f\3\uffff\1\u0224\1\uffff\1\u0223"+
			"\2\uffff\1\u022b\3\uffff\1\u0224\2\uffff\1\u0234\5\uffff\1\u0223",
			"\1\u023d\2\uffff\1\u023e\1\u023a\3\uffff\1\u008c\5\uffff\2\u023b\1\uffff"+
			"\1\u0238\2\uffff\1\u0241\1\u0242\3\uffff\1\u0247\1\u0246\171\uffff\1"+
			"\u024a\5\uffff\1\u0249\123\uffff\1\u0248\14\uffff\1\u0239\7\uffff\1\u0240"+
			"\21\uffff\1\u023f\6\uffff\1\u024b\35\uffff\1\u0240\6\uffff\1\u0240\102"+
			"\uffff\1\u0245\1\u0244\1\u0236\1\u0237\3\uffff\1\u023c\1\uffff\1\u023b"+
			"\2\uffff\1\u0243\3\uffff\1\u023c\2\uffff\1\u024c\5\uffff\1\u023b",
			"\1\u0255\2\uffff\1\u0256\1\u0252\3\uffff\1\u008c\5\uffff\2\u0253\1\uffff"+
			"\1\u0250\2\uffff\1\u0259\1\u025a\3\uffff\1\u025f\1\u025e\171\uffff\1"+
			"\u0262\5\uffff\1\u0261\123\uffff\1\u0260\14\uffff\1\u0251\7\uffff\1\u0258"+
			"\21\uffff\1\u0257\6\uffff\1\u0263\35\uffff\1\u0258\6\uffff\1\u0258\102"+
			"\uffff\1\u025d\1\u025c\1\u024e\1\u024f\3\uffff\1\u0254\1\uffff\1\u0253"+
			"\2\uffff\1\u025b\3\uffff\1\u0254\2\uffff\1\u0264\5\uffff\1\u0253",
			"\1\u0266",
			"\1\u0273\5\uffff\1\u0277\6\uffff\1\u0276\170\uffff\1\u027f\3\uffff\2"+
			"\u0280\1\uffff\2\u0280\1\uffff\1\u0280\1\u027b\14\u0280\1\u0282\1\u0281"+
			"\5\u0280\1\uffff\6\u0280\1\uffff\1\u0280\1\uffff\2\u0280\1\uffff\1\u0280"+
			"\1\u026a\14\u0280\1\uffff\3\u0280\2\uffff\1\u0280\1\uffff\1\u0280\1\uffff"+
			"\1\u0280\1\uffff\4\u0280\1\uffff\1\u0280\1\u0279\5\u0280\1\uffff\3\u0280"+
			"\1\uffff\1\u0280\1\uffff\4\u0280\1\uffff\2\u0280\1\u027a\4\u0280\1\uffff"+
			"\14\u0280\1\uffff\4\u0280\1\uffff\12\u0280\1\uffff\1\u027c\3\u0280\1"+
			"\uffff\2\u0280\1\u0267\1\u0280\1\u0269\2\u0280\1\uffff\1\u0280\1\uffff"+
			"\6\u0280\1\uffff\1\u0280\1\uffff\5\u0280\2\uffff\14\u0280\1\uffff\16"+
			"\u0280\1\uffff\22\u0280\1\u027d\2\u0280\1\uffff\4\u0280\1\uffff\4\u0280"+
			"\1\uffff\1\u0280\1\u0278\2\u0280\1\uffff\2\u0280\1\u027e\1\uffff\12\u0280"+
			"\1\uffff\1\u0280\1\u0284\1\uffff\1\u0280\1\uffff\1\u0280\3\uffff\1\u0283"+
			"\4\uffff\1\u0268\6\uffff\1\u026b\1\uffff\1\u0268\12\uffff\1\u0274\1\u0272"+
			"\1\uffff\1\u0268\4\uffff\1\u0275\21\uffff\1\u026e\5\uffff\1\u026f\u0160"+
			"\uffff\1\u0270\1\u026d\6\uffff\1\u0271\u0121\uffff\1\u026c",
			"\1\u0291\5\uffff\1\u0295\6\uffff\1\u0294\170\uffff\1\u029d\3\uffff\2"+
			"\u029e\1\uffff\2\u029e\1\uffff\1\u029e\1\u0299\14\u029e\1\u02a0\1\u029f"+
			"\5\u029e\1\uffff\6\u029e\1\uffff\1\u029e\1\uffff\2\u029e\1\uffff\1\u029e"+
			"\1\u0288\14\u029e\1\uffff\3\u029e\2\uffff\1\u029e\1\uffff\1\u029e\1\uffff"+
			"\1\u029e\1\uffff\4\u029e\1\uffff\1\u029e\1\u0297\5\u029e\1\uffff\3\u029e"+
			"\1\uffff\1\u029e\1\uffff\4\u029e\1\uffff\2\u029e\1\u0298\4\u029e\1\uffff"+
			"\14\u029e\1\uffff\4\u029e\1\uffff\12\u029e\1\uffff\1\u029a\3\u029e\1"+
			"\uffff\2\u029e\1\u0285\1\u029e\1\u0287\2\u029e\1\uffff\1\u029e\1\uffff"+
			"\6\u029e\1\uffff\1\u029e\1\uffff\5\u029e\2\uffff\14\u029e\1\uffff\16"+
			"\u029e\1\uffff\22\u029e\1\u029b\2\u029e\1\uffff\4\u029e\1\uffff\4\u029e"+
			"\1\uffff\1\u029e\1\u0296\2\u029e\1\uffff\2\u029e\1\u029c\1\uffff\12\u029e"+
			"\1\uffff\1\u029e\2\uffff\1\u029e\1\uffff\1\u029e\3\uffff\1\u02a1\4\uffff"+
			"\1\u0286\6\uffff\1\u0289\1\uffff\1\u0286\12\uffff\1\u0292\1\u0290\1\uffff"+
			"\1\u0286\4\uffff\1\u0293\21\uffff\1\u028c\5\uffff\1\u028d\u0160\uffff"+
			"\1\u028e\1\u028b\6\uffff\1\u028f\u0121\uffff\1\u028a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
		"\1\u01a1\100\uffff";
	static final String DFA26_acceptS =
		"\1\uffff\1\1\1\2\76\uffff";
	static final String DFA26_specialS =
		"\101\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\2\2\uffff\2\2\3\uffff\1\2\5\uffff\2\2\1\uffff\1\2\2\uffff\2\2\3\uffff"+
			"\2\2\160\uffff\1\2\3\uffff\2\2\1\uffff\21\2\2\uffff\5\2\1\uffff\10\2"+
			"\1\uffff\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\5\2\1\uffff\4\2\1\uffff"+
			"\7\2\1\uffff\5\2\1\uffff\7\2\1\uffff\4\2\1\uffff\21\2\1\uffff\12\2\1"+
			"\uffff\4\2\1\uffff\7\2\1\uffff\10\2\1\1\1\2\1\uffff\5\2\2\uffff\61\2"+
			"\1\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\6\2\1\uffff"+
			"\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\2\uffff"+
			"\2\2\4\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
		"\121\uffff";
	static final String DFA32_eofS =
		"\11\uffff\1\21\107\uffff";
	static final String DFA32_minS =
		"\1\11\10\uffff\1\4\107\uffff";
	static final String DFA32_maxS =
		"\1\u044e\10\uffff\1\u01a4\107\uffff";
	static final String DFA32_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16"+
		"\1\17\1\20\1\uffff\1\11\76\uffff\1\12";
	static final String DFA32_specialS =
		"\121\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\12\5\uffff\1\16\6\uffff\1\15\u00a5\uffff\1\10\36\uffff\1\17\u0092"+
			"\uffff\1\17\47\uffff\1\1\14\uffff\1\13\1\11\6\uffff\1\14\21\uffff\1\4"+
			"\5\uffff\1\5\u0160\uffff\1\6\1\3\6\uffff\1\7\u0121\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\21\2\uffff\2\21\3\uffff\1\21\5\uffff\2\21\1\uffff\1\21\2\uffff\2"+
			"\21\3\uffff\2\21\160\uffff\1\21\3\uffff\2\21\1\uffff\21\21\2\uffff\5"+
			"\21\1\uffff\10\21\1\uffff\2\21\1\uffff\16\21\1\uffff\3\21\2\uffff\5\21"+
			"\1\uffff\4\21\1\uffff\7\21\1\uffff\5\21\1\uffff\7\21\1\uffff\4\21\1\uffff"+
			"\21\21\1\uffff\12\21\1\uffff\4\21\1\uffff\7\21\1\uffff\10\21\1\uffff"+
			"\1\21\1\uffff\5\21\2\uffff\61\21\1\uffff\11\21\1\uffff\4\21\1\uffff\3"+
			"\21\1\uffff\12\21\1\uffff\6\21\1\uffff\2\21\1\uffff\1\21\3\uffff\1\21"+
			"\1\uffff\1\21\2\uffff\1\21\3\uffff\1\21\2\uffff\2\21\4\uffff\1\21\2\uffff"+
			"\1\120",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "221:1: constant : ( Number | Year | Month | Day | Hour | Minute | Second | dateLiteral | StringLiteral | stringLiteralSequence | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | charSetStringLiteral | booleanValue );";
		}
	}

	static final String DFA33_eotS =
		"\101\uffff";
	static final String DFA33_eofS =
		"\1\1\100\uffff";
	static final String DFA33_minS =
		"\1\4\100\uffff";
	static final String DFA33_maxS =
		"\1\u01a4\100\uffff";
	static final String DFA33_acceptS =
		"\1\uffff\1\2\76\uffff\1\1";
	static final String DFA33_specialS =
		"\101\uffff}>";
	static final String[] DFA33_transitionS = {
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\1\2\uffff\2\1\3\uffff"+
			"\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1"+
			"\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\5\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\4\1\1\uffff\21\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
			"\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff"+
			"\2\1\4\uffff\1\1\2\uffff\1\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()+ loopback of 245:19: ( StringLiteral )+";
		}
	}

	static final String DFA34_eotS =
		"\u027b\uffff";
	static final String DFA34_eofS =
		"\1\uffff\1\34\1\136\15\uffff\2\3\1\uffff\1\136\1\uffff\4\136\u0262\uffff";
	static final String DFA34_minS =
		"\1\11\2\4\15\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\1\11\u0260\uffff";
	static final String DFA34_maxS =
		"\1\u044e\1\u01a1\1\u01a4\15\uffff\2\u01a1\1\uffff\1\u01a1\1\uffff\4\u01a1"+
		"\1\uffff\1\u044e\u0260\uffff";
	static final String DFA34_acceptS =
		"\3\uffff\1\3\16\uffff\1\4\6\uffff\1\5\1\uffff\1\11\1\1\77\uffff\1\2\1"+
		"\uffff\1\10\u01fe\uffff\1\6\34\uffff\1\7";
	static final String DFA34_specialS =
		"\u027b\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\3\5\uffff\1\3\6\uffff\1\3\170\uffff\1\27\3\uffff\2\30\1\uffff\2\30"+
			"\1\uffff\1\30\1\23\14\30\1\32\1\31\5\30\1\uffff\6\30\1\uffff\1\30\1\uffff"+
			"\2\30\1\uffff\1\30\1\2\14\30\1\uffff\3\30\2\uffff\1\30\1\uffff\1\30\1"+
			"\uffff\1\30\1\uffff\4\30\1\uffff\1\30\1\21\5\30\1\uffff\3\30\1\uffff"+
			"\1\30\1\uffff\4\30\1\uffff\2\30\1\22\4\30\1\uffff\14\30\1\uffff\4\30"+
			"\1\uffff\12\30\1\uffff\1\22\3\30\1\uffff\2\30\1\uffff\1\30\1\1\2\30\1"+
			"\uffff\1\30\1\uffff\6\30\1\uffff\1\30\1\uffff\5\30\2\uffff\14\30\1\uffff"+
			"\16\30\1\uffff\22\30\1\25\2\30\1\uffff\4\30\1\uffff\4\30\1\uffff\1\30"+
			"\1\20\2\30\1\uffff\2\30\1\26\1\uffff\12\30\1\uffff\1\30\2\uffff\1\30"+
			"\1\uffff\1\30\3\uffff\1\33\13\uffff\1\3\14\uffff\2\3\6\uffff\1\3\21\uffff"+
			"\1\3\5\uffff\1\3\u0160\uffff\2\3\6\uffff\1\3\u0121\uffff\1\3",
			"\1\34\2\uffff\2\34\3\uffff\1\34\5\uffff\2\34\1\uffff\1\34\2\uffff\2"+
			"\34\3\uffff\2\34\160\uffff\1\34\3\uffff\2\34\1\uffff\21\34\2\uffff\5"+
			"\34\1\uffff\10\34\1\uffff\2\34\1\uffff\16\34\1\uffff\3\34\2\uffff\5\34"+
			"\1\uffff\4\34\1\uffff\7\34\1\uffff\5\34\1\uffff\7\34\1\uffff\4\34\1\uffff"+
			"\21\34\1\uffff\12\34\1\uffff\4\34\1\uffff\7\34\1\uffff\10\34\1\uffff"+
			"\1\34\1\uffff\5\34\2\uffff\61\34\1\uffff\11\34\1\uffff\4\34\1\uffff\3"+
			"\34\1\uffff\12\34\1\uffff\6\34\1\uffff\2\34\1\22\1\34\3\uffff\1\34\1"+
			"\uffff\1\34\2\uffff\1\34\3\uffff\1\34\2\uffff\2\34\4\uffff\1\34",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136\2\uffff\1\134",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\2\uffff\2\3\3\uffff\1\3\5\uffff\2\3\1\uffff\1\3\2\uffff\2\3\3\uffff"+
			"\2\3\160\uffff\1\3\3\uffff\2\3\1\uffff\21\3\2\uffff\5\3\1\uffff\10\3"+
			"\1\uffff\2\3\1\uffff\16\3\1\uffff\3\3\2\uffff\5\3\1\uffff\4\3\1\uffff"+
			"\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\4\3\1\uffff\21\3\1\uffff\12\3\1"+
			"\uffff\4\3\1\uffff\7\3\1\uffff\10\3\1\uffff\1\3\1\uffff\5\3\2\uffff\61"+
			"\3\1\uffff\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\6\3\1\uffff"+
			"\2\3\1\22\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\2\uffff"+
			"\2\3\4\uffff\1\3",
			"\1\3\2\uffff\2\3\3\uffff\1\3\5\uffff\2\3\1\uffff\1\3\2\uffff\2\3\3\uffff"+
			"\2\3\160\uffff\1\3\3\uffff\2\3\1\uffff\21\3\2\uffff\5\3\1\uffff\10\3"+
			"\1\uffff\2\3\1\uffff\16\3\1\uffff\3\3\2\uffff\5\3\1\uffff\4\3\1\uffff"+
			"\7\3\1\uffff\5\3\1\uffff\7\3\1\uffff\4\3\1\uffff\21\3\1\uffff\12\3\1"+
			"\uffff\4\3\1\uffff\7\3\1\uffff\10\3\1\uffff\1\3\1\uffff\5\3\2\uffff\61"+
			"\3\1\uffff\11\3\1\uffff\4\3\1\uffff\3\3\1\uffff\12\3\1\uffff\6\3\1\uffff"+
			"\2\3\1\22\1\3\3\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\2\uffff"+
			"\2\3\4\uffff\1\3",
			"",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136",
			"",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136",
			"\1\136\2\uffff\2\136\3\uffff\1\136\5\uffff\2\136\1\uffff\1\136\2\uffff"+
			"\2\136\3\uffff\2\136\160\uffff\1\136\3\uffff\2\136\1\uffff\21\136\2\uffff"+
			"\5\136\1\uffff\10\136\1\uffff\2\136\1\uffff\16\136\1\uffff\3\136\2\uffff"+
			"\5\136\1\uffff\4\136\1\uffff\7\136\1\uffff\5\136\1\uffff\7\136\1\uffff"+
			"\4\136\1\uffff\21\136\1\uffff\12\136\1\uffff\4\136\1\uffff\7\136\1\uffff"+
			"\10\136\1\uffff\1\136\1\uffff\5\136\2\uffff\61\136\1\uffff\11\136\1\uffff"+
			"\4\136\1\uffff\3\136\1\uffff\12\136\1\uffff\6\136\1\uffff\2\136\1\22"+
			"\1\136\3\uffff\1\136\1\uffff\1\136\2\uffff\1\136\3\uffff\1\136\2\uffff"+
			"\2\136\4\uffff\1\136",
			"",
			"\1\u025d\5\uffff\1\u025d\6\uffff\1\u025d\170\uffff\1\u025d\3\uffff\2"+
			"\u025d\1\uffff\2\u025d\1\uffff\25\u025d\1\uffff\6\u025d\1\uffff\1\u025d"+
			"\1\uffff\2\u025d\1\uffff\16\u025d\1\uffff\3\u025d\2\uffff\1\u025d\1\uffff"+
			"\1\u025d\1\uffff\1\u025d\1\uffff\4\u025d\1\uffff\7\u025d\1\uffff\3\u025d"+
			"\1\uffff\1\u025d\1\uffff\4\u025d\1\uffff\7\u025d\1\uffff\14\u025d\1\uffff"+
			"\4\u025d\1\uffff\12\u025d\1\uffff\4\u025d\1\uffff\7\u025d\1\uffff\1\u025d"+
			"\1\uffff\6\u025d\1\uffff\1\u025d\1\uffff\5\u025d\2\uffff\14\u025d\1\uffff"+
			"\16\u025d\1\uffff\25\u025d\1\uffff\4\u025d\1\uffff\4\u025d\1\uffff\4"+
			"\u025d\1\uffff\3\u025d\1\uffff\12\u025d\1\uffff\1\u025d\1\u027a\1\uffff"+
			"\1\u025d\1\uffff\1\u025d\3\uffff\1\u025d\4\uffff\1\u025d\6\uffff\1\u025d"+
			"\1\uffff\1\u025d\12\uffff\2\u025d\1\uffff\1\u025d\4\uffff\1\u025d\21"+
			"\uffff\1\u025d\5\uffff\1\u025d\u0160\uffff\2\u025d\6\uffff\1\u025d\u0121"+
			"\uffff\1\u025d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "272:1: atomExpression : ( KW_NULL -> TOK_NULL | dateLiteral | constant | function | castExpression | caseExpression | whenExpression | tableOrColumn | LPAREN ! expression RPAREN !);";
		}
	}

	static final String DFA35_eotS =
		"\100\uffff";
	static final String DFA35_eofS =
		"\1\1\77\uffff";
	static final String DFA35_minS =
		"\1\4\77\uffff";
	static final String DFA35_maxS =
		"\1\u01a1\77\uffff";
	static final String DFA35_acceptS =
		"\1\uffff\1\3\74\uffff\1\1\1\2";
	static final String DFA35_specialS =
		"\100\uffff}>";
	static final String[] DFA35_transitionS = {
			"\1\1\2\uffff\2\1\3\uffff\1\1\5\uffff\2\1\1\uffff\1\77\2\uffff\2\1\3\uffff"+
			"\2\1\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1"+
			"\1\uffff\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\5\1\1\uffff\4\1\1\uffff"+
			"\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff\4\1\1\uffff\21\1\1\uffff\12\1\1"+
			"\uffff\4\1\1\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61"+
			"\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff"+
			"\2\1\1\uffff\1\76\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff"+
			"\2\1\4\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 288:20: ( ( LSQUARE ^ expression RSQUARE !) | ( DOT ^ identifier ) )*";
		}
	}

	static final String DFA38_eotS =
		"\123\uffff";
	static final String DFA38_eofS =
		"\2\2\121\uffff";
	static final String DFA38_minS =
		"\1\4\1\14\121\uffff";
	static final String DFA38_maxS =
		"\1\u01a1\1\u019b\121\uffff";
	static final String DFA38_acceptS =
		"\2\uffff\1\2\73\uffff\1\1\24\uffff";
	static final String DFA38_specialS =
		"\123\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\2\2\uffff\2\2\3\uffff\1\2\5\uffff\2\2\4\uffff\2\2\3\uffff\2\2\160"+
			"\uffff\1\2\3\uffff\2\2\1\uffff\21\2\2\uffff\5\2\1\uffff\10\2\1\uffff"+
			"\2\2\1\uffff\16\2\1\uffff\3\2\2\uffff\5\2\1\uffff\4\2\1\uffff\7\2\1\uffff"+
			"\5\2\1\uffff\7\2\1\uffff\4\2\1\uffff\12\2\1\1\6\2\1\uffff\12\2\1\uffff"+
			"\4\2\1\uffff\7\2\1\uffff\10\2\1\uffff\1\2\1\uffff\5\2\2\uffff\61\2\1"+
			"\uffff\11\2\1\uffff\4\2\1\uffff\3\2\1\uffff\12\2\1\uffff\6\2\1\uffff"+
			"\2\2\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\1\2",
			"\1\2\u009d\uffff\1\2\37\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1"+
			"\2\16\uffff\1\2\10\uffff\1\2\3\uffff\1\2\11\uffff\1\2\6\uffff\1\76\1"+
			"\uffff\1\76\6\uffff\1\2\32\uffff\1\2\16\uffff\1\2\13\uffff\1\2\32\uffff"+
			"\1\2\17\uffff\1\2\1\uffff\1\2\25\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "308:39: (a= KW_IS nullCondition )?";
		}
	}

	static final String DFA39_eotS =
		"\75\uffff";
	static final String DFA39_eofS =
		"\1\1\74\uffff";
	static final String DFA39_minS =
		"\1\4\74\uffff";
	static final String DFA39_maxS =
		"\1\u01a1\74\uffff";
	static final String DFA39_acceptS =
		"\1\uffff\1\2\72\uffff\1\1";
	static final String DFA39_specialS =
		"\75\uffff}>";
	static final String[] DFA39_transitionS = {
			"\1\1\2\uffff\1\1\1\74\3\uffff\1\1\5\uffff\2\1\4\uffff\2\1\3\uffff\2\1"+
			"\160\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\5\1\1\uffff\4\1\1\uffff\7\1\1\uffff"+
			"\5\1\1\uffff\7\1\1\uffff\4\1\1\uffff\21\1\1\uffff\12\1\1\uffff\4\1\1"+
			"\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff"+
			"\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff\2\1\5"+
			"\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\2\1\4\uffff\1"+
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
			return "()* loopback of 321:37: ( precedenceBitwiseXorOperator ^ precedenceUnarySuffixExpression )*";
		}
	}

	static final String DFA40_eotS =
		"\74\uffff";
	static final String DFA40_eofS =
		"\1\1\73\uffff";
	static final String DFA40_minS =
		"\1\4\73\uffff";
	static final String DFA40_maxS =
		"\1\u01a1\73\uffff";
	static final String DFA40_acceptS =
		"\1\uffff\1\2\71\uffff\1\1";
	static final String DFA40_specialS =
		"\74\uffff}>";
	static final String[] DFA40_transitionS = {
			"\1\1\2\uffff\1\1\4\uffff\1\1\5\uffff\2\73\4\uffff\2\1\3\uffff\2\1\160"+
			"\uffff\1\1\3\uffff\2\1\1\uffff\21\1\2\uffff\5\1\1\uffff\10\1\1\uffff"+
			"\2\1\1\uffff\16\1\1\uffff\3\1\2\uffff\5\1\1\uffff\4\1\1\uffff\7\1\1\uffff"+
			"\5\1\1\uffff\7\1\1\uffff\4\1\1\uffff\21\1\1\uffff\12\1\1\uffff\4\1\1"+
			"\uffff\7\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\61\1\1\uffff"+
			"\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\6\1\1\uffff\2\1\5"+
			"\uffff\1\1\1\uffff\1\73\2\uffff\1\1\3\uffff\1\1\2\uffff\2\1\4\uffff\1"+
			"\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 332:36: ( precedenceStarOperator ^ precedenceBitwiseXorExpression )*";
		}
	}

	static final String DFA45_eotS =
		"\u0395\uffff";
	static final String DFA45_eofS =
		"\1\1\53\uffff\1\1\1\uffff\1\1\7\uffff\1\1\4\uffff\1\57\1\uffff\1\57\1"+
		"\uffff\4\57\1\uffff\2\57\1\uffff\1\57\u034d\uffff";
	static final String DFA45_minS =
		"\1\14\53\uffff\1\11\1\u009e\1\14\7\uffff\1\11\4\uffff\1\4\1\uffff\1\4"+
		"\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\11\66\uffff\1\4\1\uffff"+
		"\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\11\u0306\uffff";
	static final String DFA45_maxS =
		"\1\u019c\53\uffff\1\u044e\1\u0145\1\u019b\7\uffff\1\u044e\4\uffff\1\u01a1"+
		"\1\uffff\1\u01a1\1\uffff\4\u01a1\1\uffff\2\u01a1\1\uffff\1\u01a1\1\uffff"+
		"\1\u044e\66\uffff\1\u01a1\1\uffff\1\u01a1\1\uffff\4\u01a1\1\uffff\2\u01a1"+
		"\1\uffff\1\u01a1\1\uffff\1\u044e\u0306\uffff";
	static final String DFA45_acceptS =
		"\1\uffff\1\7\55\uffff\1\2\66\uffff\1\3\1\5\1\1\23\uffff\1\4\23\uffff\1"+
		"\6\32\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1\2\100\uffff\1"+
		"\2\100\uffff\1\2\u00c2\uffff\2\2\134\uffff\1\2\u0081\uffff\1\6\1\uffff";
	static final String DFA45_specialS =
		"\u0395\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\1\13\uffff\2\57\3\uffff\2\57\160\uffff\1\1\3\uffff\2\1\1\uffff\10"+
			"\1\1\66\10\1\2\uffff\5\1\1\uffff\10\1\1\uffff\2\1\1\uffff\16\1\1\uffff"+
			"\3\1\2\uffff\5\1\1\uffff\4\1\1\uffff\7\1\1\uffff\5\1\1\uffff\7\1\1\uffff"+
			"\2\1\1\56\1\1\1\uffff\21\1\1\uffff\1\54\11\1\1\uffff\4\1\1\uffff\2\1"+
			"\1\55\4\1\1\uffff\10\1\1\uffff\1\1\1\uffff\5\1\2\uffff\15\1\1\54\6\1"+
			"\1\54\34\1\1\uffff\11\1\1\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff"+
			"\6\1\1\uffff\2\57\12\uffff\1\57\6\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57\2\uffff\1\1\2\uffff\1\57\6\uffff\1\57\170\uffff\1\57\3\uffff\2"+
			"\57\1\uffff\2\57\1\uffff\21\57\1\100\3\57\1\uffff\6\57\1\uffff\1\57\1"+
			"\uffff\2\57\1\uffff\16\57\1\uffff\1\101\2\57\2\uffff\1\57\1\uffff\1\57"+
			"\1\uffff\1\57\1\uffff\4\57\1\uffff\7\57\1\uffff\3\57\1\1\1\57\1\uffff"+
			"\2\57\1\75\1\57\1\1\7\57\1\uffff\6\57\1\107\5\57\1\uffff\2\57\1\73\1"+
			"\57\1\uffff\1\57\1\104\10\57\1\uffff\1\111\3\57\1\uffff\2\57\1\uffff"+
			"\4\57\1\uffff\1\57\1\uffff\1\57\1\77\4\57\1\uffff\1\57\1\uffff\5\57\2"+
			"\uffff\14\57\1\1\16\57\1\1\13\57\1\102\11\57\1\uffff\4\57\1\uffff\4\57"+
			"\1\uffff\4\57\1\uffff\1\57\1\105\1\57\1\uffff\12\57\1\uffff\1\57\1\uffff"+
			"\1\1\1\57\1\1\1\57\3\uffff\1\57\4\uffff\1\57\6\uffff\1\57\1\uffff\1\57"+
			"\2\uffff\1\1\7\uffff\2\57\1\uffff\1\57\4\uffff\1\57\21\uffff\1\57\5\uffff"+
			"\1\57\u0160\uffff\2\57\6\uffff\1\57\u0121\uffff\1\57",
			"\1\147\123\uffff\1\146\24\uffff\1\150\66\uffff\1\150\6\uffff\1\150",
			"\1\1\u009d\uffff\1\1\37\uffff\1\1\32\uffff\1\1\4\uffff\1\1\1\uffff\1"+
			"\1\16\uffff\1\1\10\uffff\1\1\3\uffff\1\1\11\uffff\1\1\17\uffff\1\1\32"+
			"\uffff\1\1\16\uffff\1\1\13\uffff\1\1\32\uffff\1\1\17\uffff\1\1\1\uffff"+
			"\1\1\4\uffff\1\174\20\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0090\2\uffff\1\1\2\uffff\1\u0090\6\uffff\1\u0090\170\uffff\1\u0090"+
			"\3\uffff\2\u0090\1\uffff\2\u0090\1\uffff\21\u0090\1\u0085\3\u0090\1\uffff"+
			"\6\u0090\1\uffff\1\u0090\1\uffff\2\u0090\1\uffff\16\u0090\1\uffff\1\u0086"+
			"\2\u0090\2\uffff\1\u0090\1\uffff\1\u0090\1\uffff\1\u0090\1\uffff\4\u0090"+
			"\1\uffff\7\u0090\1\uffff\3\u0090\1\1\1\u0090\1\uffff\2\u0090\1\u0082"+
			"\1\u0090\1\1\7\u0090\1\uffff\6\u0090\1\u008c\5\u0090\1\uffff\2\u0090"+
			"\1\u0080\1\u0090\1\uffff\1\u0090\1\u0089\10\u0090\1\uffff\1\u008e\3\u0090"+
			"\1\uffff\2\u0090\1\uffff\4\u0090\1\uffff\1\u0090\1\uffff\1\u0090\1\u0084"+
			"\4\u0090\1\uffff\1\u0090\1\uffff\5\u0090\2\uffff\14\u0090\1\1\16\u0090"+
			"\1\1\13\u0090\1\u0087\11\u0090\1\uffff\4\u0090\1\uffff\4\u0090\1\uffff"+
			"\4\u0090\1\uffff\1\u0090\1\u008a\1\u0090\1\uffff\12\u0090\1\uffff\1\u0090"+
			"\1\uffff\1\1\1\u0090\1\1\1\u0090\3\uffff\1\u0090\4\uffff\1\u0090\6\uffff"+
			"\1\u0090\1\uffff\1\u0090\2\uffff\1\1\7\uffff\2\u0090\1\uffff\1\u0090"+
			"\4\uffff\1\u0090\21\uffff\1\u0090\5\uffff\1\u0090\u0160\uffff\2\u0090"+
			"\6\uffff\1\u0090\u0121\uffff\1\u0090",
			"",
			"",
			"",
			"",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\21\57\2\uffff\5"+
			"\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57\2\uffff\5\57"+
			"\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff\4\57\1\uffff"+
			"\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10\57\1\uffff"+
			"\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57\1\uffff\3"+
			"\57\1\uffff\12\57\1\uffff\1\u00ab\5\57\1\uffff\4\57\3\uffff\1\57\1\uffff"+
			"\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\17\57\1\u00ec\1"+
			"\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57"+
			"\2\uffff\5\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
			"\4\57\1\uffff\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1"+
			"\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\17\57\1\u012d\1"+
			"\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57"+
			"\2\uffff\5\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
			"\4\57\1\uffff\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1"+
			"\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\17\57\1\u016e\1"+
			"\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57"+
			"\2\uffff\5\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
			"\4\57\1\uffff\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1"+
			"\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\17\57\1\u01af\1"+
			"\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57"+
			"\2\uffff\5\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
			"\4\57\1\uffff\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1"+
			"\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\17\57\1\u01f0\1"+
			"\57\2\uffff\5\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57"+
			"\2\uffff\5\57\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff"+
			"\4\57\1\uffff\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57"+
			"\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1"+
			"\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\21\57\2\uffff\5"+
			"\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57\2\uffff\5\57"+
			"\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff\4\57\1\uffff"+
			"\21\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10\57\1\uffff"+
			"\1\57\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57\1\uffff\3"+
			"\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1\uffff\1\57"+
			"\2\uffff\1\57\1\uffff\1\1\1\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\1\21\57\2\uffff\5\57\1"+
			"\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57\2\uffff\5\57\1\uffff"+
			"\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff\4\57\1\uffff\21"+
			"\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10\57\1\uffff\1\57"+
			"\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff\4\57\1\uffff\3\57\1"+
			"\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1\57\1\uffff\1\57\2\uffff"+
			"\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"",
			"\1\57\2\uffff\2\57\3\uffff\1\57\5\uffff\2\57\1\uffff\1\57\2\uffff\2"+
			"\57\3\uffff\2\57\160\uffff\1\57\3\uffff\2\57\1\uffff\21\57\2\uffff\5"+
			"\57\1\uffff\10\57\1\uffff\2\57\1\uffff\16\57\1\uffff\3\57\2\uffff\5\57"+
			"\1\uffff\4\57\1\uffff\7\57\1\uffff\5\57\1\uffff\7\57\1\uffff\4\57\1\uffff"+
			"\11\57\1\u02b4\7\57\1\uffff\12\57\1\uffff\4\57\1\uffff\7\57\1\uffff\10"+
			"\57\1\uffff\1\u02b3\1\uffff\5\57\2\uffff\61\57\1\uffff\11\57\1\uffff"+
			"\4\57\1\uffff\3\57\1\uffff\12\57\1\uffff\6\57\1\uffff\4\57\3\uffff\1"+
			"\57\1\uffff\1\57\2\uffff\1\57\3\uffff\1\57\2\uffff\2\57\4\uffff\1\57",
			"",
			"\1\1\5\uffff\1\1\6\uffff\1\1\170\uffff\1\1\3\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\25\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff"+
			"\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\14\1\1\uffff\4\1\1\uffff"+
			"\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\14\1\1\uffff\16\1\1\uffff\25\1\1\uffff\4\1\1\uffff\4\1\1"+
			"\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1"+
			"\1\3\uffff\1\u0311\4\uffff\1\1\6\uffff\1\1\1\uffff\1\1\10\uffff\1\1\1"+
			"\uffff\2\1\1\uffff\1\1\4\uffff\1\1\21\uffff\1\1\5\uffff\1\1\u0160\uffff"+
			"\2\1\6\uffff\1\1\u0121\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\146\uffff\1\u0090\u0081\uffff\1\1\10\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\14\uffff\1\1\131\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\14\uffff\1\1\131\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\14\uffff\1\1\131\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\14\uffff\1\1\131\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\14\uffff\1\1\131\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\146\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1\u0090\1\uffff"+
			"\1\u0090\4\uffff\1\1\1\uffff\1\u0090\10\uffff\1\u0090",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\177\uffff"+
			"\1\1\2\uffff\1\u0090\146\uffff\1\u0090\u008a\uffff\2\u0090\3\uffff\1"+
			"\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"",
			"\1\u0090\2\uffff\2\u0090\11\uffff\2\u0090\1\uffff\1\u0090\u0082\uffff"+
			"\1\u0090\145\uffff\1\1\1\u0090\50\uffff\1\1\141\uffff\2\u0090\3\uffff"+
			"\1\u0090\1\uffff\1\u0090\6\uffff\1\u0090\10\uffff\1\u0090",
			"",
			"\1\1\5\uffff\1\1\6\uffff\1\1\170\uffff\1\1\3\uffff\2\1\1\uffff\2\1\1"+
			"\uffff\25\1\1\uffff\6\1\1\uffff\1\1\1\uffff\2\1\1\uffff\16\1\1\uffff"+
			"\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff"+
			"\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\14\1\1\uffff\4\1\1\uffff"+
			"\12\1\1\uffff\4\1\1\uffff\7\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\1\uffff"+
			"\5\1\2\uffff\14\1\1\uffff\16\1\1\uffff\25\1\1\uffff\4\1\1\uffff\4\1\1"+
			"\uffff\4\1\1\uffff\3\1\1\uffff\12\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1"+
			"\1\3\uffff\1\u0393\4\uffff\1\1\6\uffff\1\1\1\uffff\1\1\10\uffff\1\1\1"+
			"\uffff\2\1\1\uffff\1\1\4\uffff\1\1\21\uffff\1\1\5\uffff\1\1\u0160\uffff"+
			"\2\1\6\uffff\1\1\u0121\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 383:5: ( ( KW_NOT precedenceEqualNegatableOperator notExpr= precedenceBitwiseOrExpression ) -> ^( KW_NOT ^( precedenceEqualNegatableOperator $precedenceEqualExpression $notExpr) ) | ( precedenceEqualOperator equalExpr= precedenceBitwiseOrExpression ) -> ^( precedenceEqualOperator $precedenceEqualExpression $equalExpr) | ( KW_NOT KW_IN expressions ) -> ^( KW_NOT ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) ) | ( KW_IN expressions ) -> ^( TOK_FUNCTION KW_IN $precedenceEqualExpression expressions ) | ( KW_NOT KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_TRUE $left $min $max) | ( KW_BETWEEN (min= precedenceBitwiseOrExpression ) KW_AND (max= precedenceBitwiseOrExpression ) ) -> ^( TOK_FUNCTION Identifier[\"between\"] KW_FALSE $left $min $max) )*";
		}
	}

	public static final BitSet FOLLOW_KW_GROUP_in_groupByClause72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_groupByClause74 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupByExpression_in_groupByClause80 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_groupByClause88 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupByExpression_in_groupByClause90 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_WITH_in_groupByClause103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_ROLLUP_in_groupByClause105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_groupByClause113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_CUBE_in_groupByClause115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_GROUPING_in_groupByClause128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_SETS_in_groupByClause130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_groupByClause137 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause139 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_groupByClause143 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupingSetExpression_in_groupByClause145 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupByClause150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression265 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression271 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_groupingSetExpression274 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_groupByExpression_in_groupingSetExpression276 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_groupingSetExpression305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_groupingSetExpression310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_groupByExpression350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_HAVING_in_havingClause381 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_havingCondition_in_havingClause383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_havingCondition422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ORDER_in_orderByClause454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_orderByClause456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_orderByClause462 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause464 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_orderByClause472 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause474 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_orderByClause478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ORDER_in_orderByClause499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_orderByClause501 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause507 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_orderByClause515 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_orderByClause517 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_clusterByClause561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_clusterByClause567 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_clusterByClause569 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_clusterByClause572 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_clusterByClause574 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_clusterByClause578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CLUSTER_in_clusterByClause599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_clusterByClause601 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_clusterByClause607 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_clusterByClause619 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_clusterByClause621 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_partitionByClause667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_partitionByClause673 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionByClause675 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionByClause678 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionByClause680 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionByClause684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionByClause705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_partitionByClause707 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionByClause713 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_partitionByClause721 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_partitionByClause723 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_distributeByClause767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_distributeByClause773 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_distributeByClause775 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_distributeByClause778 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_distributeByClause780 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_distributeByClause784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DISTRIBUTE_in_distributeByClause805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_distributeByClause807 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_distributeByClause813 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_distributeByClause821 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_distributeByClause823 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_KW_SORT_in_sortByClause865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_sortByClause867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_sortByClause873 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause875 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_sortByClause883 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause885 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_sortByClause889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SORT_in_sortByClause910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_BY_in_sortByClause912 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause918 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_sortByClause931 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_columnRefOrder_in_sortByClause933 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_functionName_in_function976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_function982 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9FFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A09408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_STAR_in_function1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_DISTINCT_in_function1019 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A09408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpression_in_function1024 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_function1027 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085A01408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_selectExpression_in_function1029 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_function1047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_KW_OVER_in_function1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_window_specification_in_function1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_IF_in_functionName1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ARRAY_in_functionName1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_functionName1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_STRUCT_in_functionName1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNIONTYPE_in_functionName1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionName1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CAST_in_castExpression1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression1243 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_castExpression1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_AS_in_castExpression1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xB000000380000000L,0x1000000100000800L,0x0000000000000000L,0x0000030040800000L,0x0000000000000001L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CASE_in_caseExpression1326 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_caseExpression1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_WHEN_in_caseExpression1335 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_caseExpression1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_KW_THEN_in_caseExpression1339 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_caseExpression1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_ELSE_in_caseExpression1350 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_caseExpression1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_END_in_caseExpression1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CASE_in_whenExpression1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_WHEN_in_whenExpression1411 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_whenExpression1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_KW_THEN_in_whenExpression1415 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_whenExpression1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000050000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_ELSE_in_whenExpression1426 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_whenExpression1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_END_in_whenExpression1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_constant1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Year_in_constant1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Month_in_constant1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Day_in_constant1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hour_in_constant1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minute_in_constant1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Second_in_constant1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_constant1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_constant1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringLiteralSequence_in_constant1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BigintLiteral_in_constant1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SmallintLiteral_in_constant1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TinyintLiteral_in_constant1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DecimalLiteral_in_constant1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_charSetStringLiteral_in_constant1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanValue_in_constant1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_StringLiteral_in_stringLiteralSequence1621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_CharSetName_in_charSetStringLiteral1666 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CharSetLiteral_in_charSetStringLiteral1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DATE_in_dateLiteral1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_StringLiteral_in_dateLiteral1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceOrExpression_in_expression1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NULL_in_atomExpression1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_atomExpression1777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_atomExpression1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_atomExpression1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_atomExpression1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseExpression_in_atomExpression1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenExpression_in_atomExpression1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableOrColumn_in_atomExpression1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atomExpression1833 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_atomExpression1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomExpression1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomExpression_in_precedenceFieldExpression1861 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LSQUARE_in_precedenceFieldExpression1865 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_precedenceFieldExpression1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RSQUARE_in_precedenceFieldExpression1870 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_DOT_in_precedenceFieldExpression1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_identifier_in_precedenceFieldExpression1880 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_KW_NULL_in_nullCondition1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_nullCondition1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_NULL_in_nullCondition1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnaryOperator_in_precedenceUnaryPrefixExpression1977 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceFieldExpression_in_precedenceUnaryPrefixExpression1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_precedenceUnarySuffixExpression1999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_KW_IS_in_precedenceUnarySuffixExpression2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000A000000L});
	public static final BitSet FOLLOW_nullCondition_in_precedenceUnarySuffixExpression2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BITWISEXOR_in_precedenceBitwiseXorOperator2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2075 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_precedenceBitwiseXorOperator_in_precedenceBitwiseXorExpression2078 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceUnarySuffixExpression_in_precedenceBitwiseXorExpression2081 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2138 = new BitSet(new long[]{0x00000000000C0002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200020000L});
	public static final BitSet FOLLOW_precedenceStarOperator_in_precedenceStarExpression2141 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseXorExpression_in_precedenceStarExpression2144 = new BitSet(new long[]{0x00000000000C0002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200020000L});
	public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001008000L});
	public static final BitSet FOLLOW_precedencePlusOperator_in_precedencePlusExpression2196 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceStarExpression_in_precedencePlusExpression2199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001008000L});
	public static final BitSet FOLLOW_AMPERSAND_in_precedenceAmpersandOperator2223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2244 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_precedenceAmpersandOperator_in_precedenceAmpersandExpression2247 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedencePlusExpression_in_precedenceAmpersandExpression2250 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BITWISEOR_in_precedenceBitwiseOrOperator2274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2295 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_precedenceBitwiseOrOperator_in_precedenceBitwiseOrExpression2298 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceAmpersandExpression_in_precedenceBitwiseOrExpression2301 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualOperator2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_precedenceEqualOperator2359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_NS_in_precedenceEqualOperator2363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTEQUAL_in_precedenceEqualOperator2367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_precedenceEqualOperator2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSTHAN_in_precedenceEqualOperator2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_precedenceEqualOperator2379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHAN_in_precedenceEqualOperator2383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2407 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_precedenceEqualNegatableOperator_in_precedenceEqualExpression2431 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2435 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_precedenceEqualOperator_in_precedenceEqualExpression2468 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2472 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2505 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_KW_IN_in_precedenceEqualExpression2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expressions_in_precedenceEqualExpression2541 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceEqualExpression2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2574 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2582 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2587 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_precedenceEqualExpression2627 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceEqualExpression2635 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBDBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceBitwiseOrExpression_in_precedenceEqualExpression2640 = new BitSet(new long[]{0x0000000063000002L,0x0000000000000000L,0x0000000040000000L,0x0004000000000000L,0x4000000002000080L,0x0000000000000020L,0x0000000000100300L});
	public static final BitSet FOLLOW_LPAREN_in_expressions2698 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_expressions2700 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_expressions2703 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_expressions2705 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_expressions2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_precedenceNotOperator2735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceNotOperator_in_precedenceNotExpression2757 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceEqualExpression_in_precedenceNotExpression2762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AND_in_precedenceAndOperator2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_precedenceAndOperator_in_precedenceAndExpression2808 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceNotExpression_in_precedenceAndExpression2811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_OR_in_precedenceOrOperator2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_precedenceOrOperator_in_precedenceOrExpression2859 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0xFB5FBFFFFED88000L,0xFFEFEF5DFDEA9DFFL,0xDFFE7D7EBFBDFFBDL,0xFFDDEF7BFFFFEFFFL,0x2000085801408452L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_precedenceAndExpression_in_precedenceOrExpression2862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_KW_TRUE_in_booleanValue2886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FALSE_in_booleanValue2891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableOrPartition2911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_tableOrPartition2913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_partitionSpec2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_partitionSpec2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_partitionVal_in_partitionSpec2954 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionSpec2957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_partitionVal_in_partitionSpec2960 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionSpec2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_partitionVal2996 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_EQUAL_in_partitionVal2999 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0x1000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000400000000000L,0x2000081800400000L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_constant_in_partitionVal3001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_dropPartitionSpec3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LPAREN_in_dropPartitionSpec3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3044 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_COMMA_in_dropPartitionSpec3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFB5FBE7FFED88000L,0xFFEF6F5DFDEA9DFFL,0xDFFE7D7EBDB9FFBDL,0xFFDDEF7BFFFFEFFFL,0x0000000000000052L});
	public static final BitSet FOLLOW_dropPartitionVal_in_dropPartitionSpec3050 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_dropPartitionSpec3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_dropPartitionVal3086 = new BitSet(new long[]{0x0000000061000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100300L});
	public static final BitSet FOLLOW_dropPartitionOperator_in_dropPartitionVal3088 = new BitSet(new long[]{0x0000000000408200L,0x0000000000000000L,0x1000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000400000000000L,0x2000081800400000L,0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000103000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_constant_in_dropPartitionVal3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sysFuncNames_in_descFuncNames3509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_descFuncNames3517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_descFuncNames3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_identifier3546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonReserved_in_identifier3554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred1_IdentifiersParser616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred2_IdentifiersParser717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred3_IdentifiersParser817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred4_IdentifiersParser927 = new BitSet(new long[]{0x0000000000000002L});
}
