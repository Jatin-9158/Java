/*              Static Synchronization                 */

// Synchroninzation Problem  We will also get problem because every object will place one lock  
// Solution to Synchroninzation
class Bank extends Thread
{
    static int bal=5000;
    static int withdraw;

    Bank(int withdraw)
    {
        this.withdraw=withdraw; //withdraw
    }
    public static synchronized void Withdraw()//t1  t2 t3 t4
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)//5000<=0
        {
            System.out.println(name+" withdraw money");
            bal=bal-withdraw; //bal=5000-5000=0
        }
        else 
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void run()
    {
        Withdraw();
    }
}







public class Static_Synchronization {
    public static void main(String[] args)
    {
        Bank obj=new Bank(5000);  // Only One Lock

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("Raju");//5000
        t2.setName("Sunita");

        t1.start();
        t2.start();

        Bank obj2=new Bank(5000); 

        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);

        t3.setName("Rahul");//5000
        t4.setName("Raman");

        t3.start();
        t4.start();
    }
}
