/*                                       Thread suspend() & resume() Method                                */
                   /* These are Depriciated Methods  java doesn't support these methods    */
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
public class Thread_suspend_resume_method {

    public static void main(String[] args) throws InterruptedException {
         
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();

        t2.start(); //pause

        t2.suspend();

        t3.start();
        t2.resume();

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