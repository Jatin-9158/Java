/*                         Thread Scheduler                               */

// When we have multiple independent Job then we use multiple threads 
// We will Seperate the job's by making different threads
class A extends Thread 
{   
    @Override
    public void run()
    {     
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }
}
public class Thread_Scheduler {
    public static void main(String[] args)
    {
          A t1 = new A();
          A t2 = new A();
          A t3 = new A();

          t1.setName("Thread 1");
          t2.setName("Thread 2");
          t3.setName("Thread 3");

          t1.start();
          t2.start();
          t3.start();


          String n=Thread.currentThread().getName();
          for(int i=1;i<=3;i++)
          {
              System.out.println(n);
          }

    } 
}
