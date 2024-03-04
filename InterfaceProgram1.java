import java.util.Scanner;
interface client
{
    void input(); // by default public +abstract
    void output();// public + abstract

}
class Developer implements client
{
   String name;
   double sal;
   // Your Access Modifier of Class should be Greater than Interface Modifer not less than 
   // means range of access is more
   // Do n't use weaker privileges
   // Public > Default 
   public void input()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Username:");
      name=sc.nextLine();

      System.out.println("Enter Salary:");
      sal=sc.nextDouble();

   }
   public void output()
   {
     System.out.println("Username:"+name);
     System.out.println("Salary:"+sal);
   }
}
public class InterfaceProgram1 {
    public static void main(String[] args)
    {
        client c=new Developer();
        c.input();
        c.output();
    }
}
