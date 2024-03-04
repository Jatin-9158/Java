/*                                        Multithreading Problem ...!   */

class Bus implements Runnable
{
    int available=1,passenger;
    Bus(int passenger)
    {
        this.passenger=passenger;
    }
    // Your Output Will Be Corrupted
    public void run()  // When we starts thread they enters with too much speed in main method 
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
public class Multithreading_Problem {
    public static void main(String[] args) {
        
         Bus r = new Bus(1);

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
