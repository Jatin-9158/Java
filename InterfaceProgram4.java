
/*  Extending Interface Using extends Keyword */
interface Customer_1
{
    void add();
}
interface Customer_2 extends Customer_1
{
    void Sub();
}
class Developer implements Customer_2
{
    @Override
    public void add()
    {
      int a=10,b=20,c;
      c=a+b;
      System.out.println("Addition:"+c);
    }
    @Override
    public void Sub()
    {
        int a=10,b=20,c;
        c=a-b;
        System.out.println("Subtraction:"+c);
    }
}
public class InterfaceProgram4 {
   public static void main(String[] args)
   {
      Customer_1 C1=new Developer();
      C1.add();
   }
}
