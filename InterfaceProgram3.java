/*     Interface Methods */
interface Client
{
   void Web_Design(); //public + abstract 
   void Web_Development();// public +abstract
}
/*
Error:
class Tech_Company implements Client
{
    @Override
   public void Web_Design()
   {
     System.out.println("Hello,User");
   }
}
error: Tech_Company is not abstract and does not override abstract method Web_Development() in Client
class Tech_Company implements Client 

Another Option 
Make it abstract 
abstract class Tech_Company implements Client
{
    @Override
   public void Web_Design()
   {
     System.out.println("Hello,User");
   }
}
class New_Tech_Company implements Client
{
   public void Web_Development()
   {
    System.out.println("Developed");
   }
}*/

class New_Tech_Company implements Client
{
    @Override
   public void Web_Design()
   {
     System.out.println("Hello,User");
   }
   public void Web_Development()
   {
    System.out.println("Developed");
   }
}
public class InterfaceProgram3 {
    public static void main(String[] args)
    {
        Client C=new New_Tech_Company();
        C.Web_Design();
        C.Web_Development();

    }
}
