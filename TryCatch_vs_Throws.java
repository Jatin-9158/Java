/*                       try_catch vs throws  */
/* JVM may sometime may give you Unexpected result while using halding exception using throws keyword */
// public class TryCatch_vs_Throws {
//     public static void Wait() throws InterruptedException
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
//     }
//     public static void main(String[] args) throws Exception {
//         Wait();
//         System.out.println(10/0);
//         System.out.println("Main Method Terminated Normal");
//     }
// }

// Handled By User Using try-catch block
// Ensures you program completes execution with expected results
// Can handle more than exception Using Exception superclass
public class TryCatch_vs_Throws {
    public static void Wait() throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args){
        try
        {
           Wait();
           System.out.println(10/0);
        }
        catch(Exception E)
        {
            System.out.println("Exception Handled....!");
        }
        System.out.println("Main method ended");
    }

}