/*                           By implementing runnable interface                             */

// Runnable interface can't start the thread because it start() is not present in the runnable interface
// In this One also threads are consecutively running 
// Output is unpredictable
class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("My Child thread");
        }
    }
}
public class Thread_implements_runnable_interface {
    public static void main(String[] args)
    {
        // Initially main thread is there 
        A r=new A();
        

        Thread t=new Thread(r);
        t.start();
        // Now create the t.start() creates thread-t 

        for(int i=1;i<=5;i++)
        {
            System.out.println("main thread");
        }
    }
}
