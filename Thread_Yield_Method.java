/*                        thread -->  yield() */

// If same priority is there btw threads then through yield thread  can give a chance to other threads also
class Thread1 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }  
}
class Thread2 extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }  
}
public class Thread_Yield_Method {
     public static void main(String[] args)
     {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();
     }
}
