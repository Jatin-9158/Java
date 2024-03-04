public class Nested_try_catch_block1 {
  public static void main(String[] args)
  {
    try
    {
      // Always Put Most Risky Code First in Outer Try Block
      try
      {
        int a[]={10,20,30};
        System.out.println(a[3]);
      }
      catch(ArrayIndexOutOfBoundsException E)
      {
        System.err.println("Array Exception");
      }

      // Always Put Less Risky Code Below Inner Try Block in Outer Try Block
      System.out.println(10/0);

    }
    catch(ArithmeticException E)
    {
        System.err.println("Arithmetic Exception");
    }
    // For Checking the Normal Flow & Abnormal Flow
    System.out.println("Well Done Main Method Ended");
  }

}
