/*                                Thread --> isAlive() method */


class A extends Thread
{
    public void run()
    {
        System.out.println("Thread alive");
    }
}
public class Thread_isAlive_Method
{
    public static void main(String[] args) {
          
           A t1 = new A();
           A t2 = new A();

           //When thread t1 not started yet
           System.out.println(t1.isAlive());

           //After thread t1 started
           t1.start();
           t2.start();

           System.out.println(t1.isAlive());
           System.out.println(t2.isAlive());


        // // You can't start already started thread again 
        //    t1.start();
        //    System.out.println(t1.isAlive());
        // //Other Wise :
        // // Error:
        // //    Exception in thread "main" java.lang.IllegalThreadStateException
        // //   at java.base/java.lang.Thread.start(Thread.java:1525)
        // //   at Thread_isAlive_Method.main(Thread_isAlive_Method.java:29)
         
        
    }
}
