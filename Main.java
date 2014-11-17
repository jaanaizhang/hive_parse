package parse;


public class Main {
  public static void main(String[] args)  {
    // String command = "EXPLAIN SELECT /*+INCREMENTAL(c)*/ * FROM page o JOIN page c ON (o.userid=c.userid)";
 // String command = "EXPLAIN SELECT  * FROM page/*+INCREMENTAL(11:02:33-21:02:33)*/ o JOIN page c ON (o.userid=c.userid)";
  String command = "EXPLAIN SELECT  * FROM page/*+INCREMENTAL(EACH INCRE 12 DURING 11:02:33-21:02:33)*/ o JOIN page c ON (o.userid=c.userid)";
  // String command = "SELECT * FROM b";
    ParseDriver pd = new ParseDriver();
    try {
      ASTNode ast = pd.parse(command);

   // System.out.println( HiveParser.TOK_EXPLAIN);
      System.out.println(ast.getChild(0).getChild(0));
      System.out.println(ast.getChildren());
      System.out.println(ast.dump());
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      System.out.println(" failed ");
    }
  }
}
