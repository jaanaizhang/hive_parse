package org.apache.hadoop.hive.ql.parse;

import java.util.ArrayList;


public class Main {
  public static void main(String[] args)  {
    ArrayList<String> cmds = new  ArrayList<String> ();
    //for have not the explicit time(hour:minute:seconds), which default 0:0:0 of that day
    cmds.add("EXPLAIN SELECT /*+INCREMENTAL(c)*/ * FROM page o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(2014/3/4-2014/3/4)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(2014/3/4,12:5:20-2014/3/4,12:5:20 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 2014/3/4 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 2014/3/4,12:5:20 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 2014/3/4,12:50 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 2014/3/4 INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 2014/3/4,12:5:20 INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 3/4 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 3/4,11:5:20 )*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 3/4,11:5:20 INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 3/4,11:5 INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(after 4,11:5 INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 100(d))*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 100(h))*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 100(m))*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 100(s))*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(d) INTERVAL 3/d)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(d) INTERVAL 3/h)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(d) INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(d) INTERVAL 3/s)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(h) INTERVAL 3/h)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(h) INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(h) INTERVAL 3/s)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(m) INTERVAL 3/m)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(m) INTERVAL 3/s)*/ o JOIN page c ON (o.userid=c.userid)");
    cmds.add("EXPLAIN SELECT  * FROM page/*+INCREMENTAL(constant 10(s) INTERVAL 3/s)*/ o JOIN page c ON (o.userid=c.userid)");
    ParseDriver pd = new ParseDriver();
    try {
      for(String command : cmds ){
          System.out.println(command);
          ASTNode ast = pd.parse(command);
          System.out.println(ast.dump());
          System.out.println("--------------------------------------------------------------------------------------");
      }
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      System.out.println(" failed ");
    }
  }
}
