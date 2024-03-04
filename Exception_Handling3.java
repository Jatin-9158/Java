/*                                   NumberFormat Exception                        */
public class Exception_Handling3 {
   public static void main(String[] args) {
    String str="abc";
    try
    {
    // Always put Risky_Code(Code which seems to come up with error)
      int a=Integer.parseInt(str);  
      System.out.println("Result:"+a);
    }
    catch(ArithmeticException E)
    {
        System.out.println("String "+str+" can't be converted to Integer");         
    }
    System.out.println("Main Method Ended");
   }
}
/*
Error:
public class Exception_Handling3 {
   public static void main(String[] args) {
       String str="abc";
       int a=Integer.parseInt(str);
       System.out.println(a);
       System.out.println("Number Format Exception");  
   }
}
If Exception not handled:
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)    
        at java.base/java.lang.Integer.parseInt(Integer.java:661)
        at java.base/java.lang.Integer.parseInt(Integer.java:777)
        at Exception_Handling3.main(Exception_Handling3.java:5)

 */
/*
Error 2:

If Exception Mismatched:
public class Exception_Handling3 {
   public static void main(String[] args) {
    String str="abc";
    try
    {
      Always put Risky_Code(Code which seems to come up with error)
      int a=Integer.parseInt(str);  
      System.out.println("Result:"+a);
    }
    catch(ArithmeticException E)
    {
        System.out.println("String "+str+" can't be converted to Integer");         
    }
    System.out.println("Main Method Ended");
   }
}
 It will also show the error if your Exception mismatched
 */
