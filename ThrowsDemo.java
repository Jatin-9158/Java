/* InterrruptedException is a Checked Exception So, It's necessary to handle it
 Error:
Code:
public class Throws {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
 Error:
  Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unhandled exception type InterruptedException

        at Throws.main(Throws.java:12)
Two Ways:
  Handled By JVM( By throws)



  public class ThrowsDemo {
    public static void main(String[] args)throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
  } 





  Handled By User(By try catch (Customized) Block)
  public class ThrowsDemo {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
           try
           {
            System.out.println(i);
            Thread.sleep(1000);
           }
           catch(InterruptedException E)
           {
             System.out.println(E.getMessage());
           }
        }
    }
}


*/

// public class ThrowsDemo {
//     public static void main(String[] args)throws InterruptedException
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
//     }
//   }


public class ThrowsDemo {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
           try
           {
            System.out.println(i);
            Thread.sleep(1000);
           }
           catch(InterruptedException E)
           {
             System.out.println(E.getMessage());
           }
        }
    }
}
