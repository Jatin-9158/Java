// Interface Variables
interface Customer
{
   int Quantity=5; // By Default ->public +static+final (Here it is Final we have to Finalise it there with some value)
   void purchase(); //By Default->public + abstract 
}
class Seller implements Customer
{
  @Override
  public void purchase()
  {
    /*Quantity++;
    error: cannot assign a value to static final variable Quantity
    Quantity++;
    */
    // Quantity=5 Final
    System.out.println("Customer needs "+Quantity+" Apples");
  }
}
public class InterfaceProgram2 {
    public static void main(String[] args)
    {
        Customer C1=new Seller();
        C1.purchase();
        // Here,it will work 
        System.out.println(Customer.Quantity); 
        // Because Method is static without Making object we can use it

        
    }
}
