
/*                       Exception Propagation                       */ 
// If  Exception Not Handled 
// public class Exception_Propgation {

//     public static void main(String[] args)
//     {
//         m1();
//     }
//     public static void m1()
//     {
//        m2();
//     }
//     public static void m2()
//     {
//         System.out.println(10/0);
//     }
// }

//If Exception Handled by m1 Function
// public class Exception_Propgation {

//     public static void main(String[] args)
//     {
//         m1();
//     }
//     public static void m1()
//     {
//       try
//       {
//         m2();
//       }
//       catch(ArithmeticException E)
//       {
//         System.out.println("Exception  Handled by m1 method()");
//       }
//     }
//     public static void m2()
//     {
//         System.out.println(10/0);
//     }
// }

// If Exception Handled By Main method

public class Exception_Propgation {

    public static void main(String[] args) 
    {
        m1();
    }
    public static void m1()
    {
      try
      {
        m2();
      }
      catch(ArithmeticException E)
      {
        System.out.println("Exception  Handled by m1 method()");
      }
    }
    public static void m2()
    {
        System.out.println(10/0);
    }
}

