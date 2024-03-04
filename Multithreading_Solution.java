/*                                        Multithreading Solution...!   */
/* Using Synchronization  */
/* Randomly Thread Executed */
/* Here Number of Seats equal to No of Passengers  */
class Bus implements Runnable
{
    int available=2,passenger;
    Bus(int passenger)
    {
        this.passenger=passenger;
    }

    public synchronized void run()   
    {                  
      String name=Thread.currentThread().getName();
      if(available>=passenger)
      {
         System.out.println(name+" Reversed Seat....!");
         available=available-passenger;
      }
      else
      {
        System.out.println("Sorry,Seat Not Available");
      }

    }
}
public class Multithreading_Solution {
    public static void main(String[] args) {
        
         Bus r = new Bus(2);

         Thread t1 = new Thread(r);
         Thread t2 = new Thread(r);
         Thread t3 = new Thread(r);

         t1.setName("Passenger_1");
         t2.setName("Passenger_2");
         t3.setName("Passenger_3");


         t1.start();
         t2.start();
         t3.start();

    }
}
