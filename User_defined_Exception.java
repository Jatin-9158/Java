/*                         throw vs throws & try-catch                                      */
/*             User Defined Exception  extended from superclass Exception                  */ 
class InvalidAgeException extends Exception
{
     InvalidAgeException(String msg)
     {
        System.out.println(msg);
     }
}
public class User_defined_Exception{

    public static void vote(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Not Eligible For Voting");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args)
    {
         try
         {
           vote(20);
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
    }
    
}
