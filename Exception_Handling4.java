/*                       try-catch-finally                       */
public class Exception_Handling4 {
     public static void main(String[] args)
     {
        try
        {
 
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Hi");
        }
        catch(NullPointerException  E)
        {
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Hi");
        }
        // finally will always give output until Exception is caught inside and not handled
        finally
        {
            System.out.println("Hi");
        }
        System.out.println("Main Method Ended");
     }
}
/*
No Error:
public class Exception_Handling4 {
     public static void main(String[] args)
     {
        try
        {
            System.out.println("Learn One Skill in a Year");
            int a=20,b=2,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Hi");
        }
        catch(ArithmeticException E)
        {
           System.out.println("Can not Divide by Zero");
        }
        finally
        {
          System.out.println("Hello,User");
        }
        System.out.println("Main Method Ended");
     }
}


If Exception Handled:
public class Exception_Handling4 {
     public static void main(String[] args)
     {
        try
        {
            System.out.println("Learn One Skill in a Year");
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Hi");
        }
        catch(ArithmeticException E)
        {
           System.out.println("Can not Divide by Zero");
        }
        finally
        {
          System.out.println("Hello,User");
        }
        System.out.println("Main Method Ended");
     }
}


If Exception not handled:
  Error: Exception Handled with Different Exception Class
public class Exception_Handling4 {
     public static void main(String[] args)
     {
        try
        {
            System.out.println("Learn One Skill in a Year");
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Hi");
        }
        catch(NullPointerException E)
        {
           System.out.println("Can not Divide by Zero");
        }
        finally
        {
          System.out.println("Hello,User");
        }
        System.out.println("Main Method Ended");
     }
}

If Exception in All Blocks
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception_Handling4.main(Exception_Handling4.java:23)
 */