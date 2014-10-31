package parse;

public class Main {
  public static void main(String[] args)  {
    String command = "EXPLAIN SELECT /*+MAPJOIN(c)*/ * FROM page o JOIN page c ON (o.userid=c.userid)";
 //   String command = "SELECT * FROM b";
    ParseDriver pd = new ParseDriver();
    try {
      ASTNode ast = pd.parse(command);
      System.out.println(ast.dump());
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      System.out.println(" failed ");
    }
  }
}
