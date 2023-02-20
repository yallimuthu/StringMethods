public class StringMethods {
    public static void main(String[] args) {
      String str = "Welcome to BeginnersBook.com";
  
      //finding length of the string using length() method.
      int len = str.length();
  
      // First character of the string
      System.out.println("First character: "+ str.charAt(0));
  
      //creating string using string literal
    String s1 = "BeginnersBook";
    String s2 = "BeginnersBook";

    //creating strings using new keyword
    String s3 = new String("BeginnersBook");
    String s4 = new String("BeginnersBook");

    if(s1 == s2){
      System.out.println("String s1 and s2 are equal");
    }else{
      System.out.println("String s1 and s2 are NOT equal");
    }

    if(s3 == s4){
      System.out.println("String s3 and s4 are equal");
    }else{
      System.out.println("String s3 and s4 are NOT equal");
    }
  }
}