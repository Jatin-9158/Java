/*                                       Thread Join Method                                */

class A extends Thread
{
    @Override
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            try
            {
                System.out.println(n);
                //sleep() will temporarily blocks all the execution part of the thread for the speicific period of the time
                Thread.sleep(1000);
            }
            catch(InterruptedException E)
            {
                System.out.println("Something went wrong");
            }
        }
    }
}
public class Thread_join_Method {
    public static void main(String[] args) {
         
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try
        {// All the thread will wait upto thread 2 completes it's task that's the work of join()
            t2.join();// It will hold main thread also from Execution 
        }
        catch(InterruptedException E)
        {
            System.out.println("Something Went Wrong");
        }
        t1.start();
        t3.start();

        for(int i=1;i<=3;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName());
                //sleep() will temporarily blocks all the execution part of the thread for the speicific period of the time
                Thread.sleep(1000);
            }
            catch(InterruptedException E)
            {
                System.out.println("Something went wrong");
            }
        }

    }
}