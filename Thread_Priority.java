/*                                        thread priority                */
/* Methods:
        1) setPriority()
        2) getPriority()
 */

// //Priority are Same
// // Intially Priority is 5
// class A extends Thread
// {
//     public void run()
//     {
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//     }
// }
// public class Thread_Priority {
//     public static void main(String[] args)
//     {
//            A t1=new A();
//            A t2=new A();
//            A t3=new A();

//            t1.setName("t1 thread");
//            t2.setName("t2 thread");
//            t3.setName("t3 thread");

//            t1.start();
//            t2.start();
//            t3.start();

//     }
// }



//User Defined Priority
// Priority range is between 1 and 10 
class A extends Thread
{
    public void run()
    {
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getPriority());
    }
}
public class Thread_Priority {
    public static void main(String[] args)
    {
           A t1=new A();
           A t2=new A();
           A t3=new A();

           t1.setName("t1 thread");
           t2.setName("t2 thread");
           t3.setName("t3 thread");


           t1.setPriority(9);
           t2.setPriority(10);
           t3.setPriority(4);

           // You can Ovveride the priority also of a thread
           t1.setPriority(5);



           t1.start();
           t2.start();
           t3.start();

           // You can Ovveride the priority also of a thread
           t1.setPriority(6);

    }
}