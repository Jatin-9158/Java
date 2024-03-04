/*                            interrupt()    method  */

class A extends Thread
{
    @Override
    public void run()
    {
         try
         {
            for(int i=1;i<=5;i++)
            {
                System.out.println("t1 thread Running");
                // If thread is not in waiting state then program will continue normal execution 
                Thread.sleep(1000);
            }
         }
         catch(InterruptedException E)
         {
            System.out.println("Something went wrong");
         }
    }
}
public class Thread_interrupt_method {
    public static void main(String[] args)
    {
        A t1=new A();

        t1.start();
        // If threading is interrrupted then catch block will work
        t1.interrupt();
    }
}
