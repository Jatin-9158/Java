public class Multiple_Try_Catch_Block2 {
   public static void main(String[] args)
   {
      //All exception are handled consecutively.
      try
      {
        // If Exception Occured Handled By catch(ArithmeticException E)
        int a=10/2;
        System.out.println(a);

        // If Exception Occured Handled By catch(ArrayIndexOutofBounds E)  
        int b[]=new int[5];
        System.out.println(b[4]);

        // If Exception Occured Handled By catch(StringIndexOutofBounds E)
        String H=null;
        System.out.println(H.toUpperCase());
      }
      catch(ArithmeticException E)
      {
        //You Know why we put != this not like this =! because as when we apply not operation we always write not (Expression)
         System.err.println("Take Number != 0");
      }
      catch(ArrayIndexOutOfBoundsException E)
      {
        System.err.println("Array Out of Bounds");
      }
      catch(NullPointerException E)
      {
        System.err.println("String Out of Bounds");
      }
      // While working with multiple catch the SuperClass exception catch block must be at the last catch block
      // All Exception type Handler
      catch(Exception E)
      {
         System.err.println("All Type Exception Handled : Something went wrong");
      }
      //Internal Code: 
      //            Example new NullPointerExcception();
   }
    
}
