/*                                        Method-Level Synchronization  */

// //They Will execute simultaenously 
// // It will give wrong result
// class Table 
// {
//     public void printTable(int n)
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(n*i);
//         }
//     }
// }
// class thread1 extends Thread
// {

//    Table t;
//    thread1(Table t)
//    {
//      this.t=t;
//    }
//    public void run()
//    {
//       t.printTable(5);
//    }

// }
// class thread2 extends Thread
// {
//     Table t;
//     thread2(Table t)
//     {
//       this.t=t;
//     }
//     public void run()
//     {
//        t.printTable(7);
//     }
// }
// public class Method_Level_Synchronization {
//     public static void main(String[] args) {

//           Table obj=new Table();//Obj =1 lock 

//           thread1 t1=new thread1(obj);
//           thread2 t2=new thread2(obj);

//           t1.start();
//           t2.start();

//     }
// }


// Handling Synchronization
class Table 
{
    public synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread
{

   Table t;
   thread1(Table t)
   {
     this.t=t;
   }
   public void run()
   {
      t.printTable(5);
   }

}
class thread2 extends Thread
{
    Table t;
    thread2(Table t)
    {
      this.t=t;
    }
    public void run()
    {
       t.printTable(7);
    }
}
public class Method_Level_Synchronization {
    public static void main(String[] args) {

          Table obj=new Table();//Obj =1 lock 

          thread1 t1=new thread1(obj);
          thread2 t2=new thread2(obj);

          t1.start();
          t2.start();

    }
}
