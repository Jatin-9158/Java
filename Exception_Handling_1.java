/*                       Exception Handling-(ArithmeticException)               */
public class Exception_Handling_1 {
   public static void main(String[] args)
   {
     int a=10,b=0,c;
     try
     {
        c=a/b; //c=10/0
        System.out.println("Output:"+c);
     }
     //Exception (Superclass) Handles all Exception
     //ArithmeticException(Subclass of Exception )Handles Only Arithmetic Exception
     catch(ArithmeticException e)
     {
        System.out.println(e);
     }
   }
}
/*
Error:

If Exception Not Handled:
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception_Handling_1.main(Exception_Handling_1.java:5)


If Exception Handled:
java.lang.ArithmeticException: / by zero
 */