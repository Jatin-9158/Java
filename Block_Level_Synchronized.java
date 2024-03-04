/*                            Synchronized Block                              */
/* For More Lines of Code Synchronization through block is best else Method_Synchronization is best */
class msg
{
    public void show(String name)
    {
         // Home
        // 100 Lines of Code
        // Specific these block becomes specific
        synchronized(this)
        {
            for(int i=0;i<=3;i++)
            {
                System.out.println("How are u  "+name);
            }
        }
        // 100 Lines of Code
    }
}
class Ourthread extends Thread
{
  msg m;
  String name;
  Ourthread(msg m,String name)
  {
    this.m=m;
    this.name=name; 
  }
  public void run()
  {
    m.show(name);
  }
}
public class Block_Level_Synchronized {
    public static void main(String[] args)
    {
        msg m=new msg(); // m has a lock
        Ourthread t1=new Ourthread(m, "Akhilesh");
        Ourthread t2=new Ourthread(m, "Ankush");

        t1.start();
        t2.start();
    }
}
