/*                      try-catch-finally inside finally block                   */
public class Nested_Finally_Block {
   public static void main(String[] args) 
   {
      try
      {
         String a="ABC";
         System.out.println(a.toLowerCase());
      } 
      catch(Exception e)
      {
        System.out.println(e.getMessage()); 
      }
      finally
      {
        // If final Exception not handled It will give you error
        try
        {
          System.out.println(10/0);
        }
        catch(ArithmeticException D)
        {
           System.out.println(D.getMessage());
        }
        finally
        {
            System.out.println("Learn Coding");
        }
      }
      System.out.println("Main Method Ended");
   }
}
