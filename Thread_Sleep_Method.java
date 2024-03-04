/*                            Sleep Method                                            */

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
public class Thread_Sleep_Method {
    public static void main(String[] args) {
         
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
