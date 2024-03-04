/*  @Override Notation */
// Only use when function of superclass is overrided in sub class
class A 
{
    void Show()
    {
      System.out.println("Super Class");
    }
}
class B extends A 
{
    @Override
    void Show()
    {
      System.out.println("Sub Class");
    }
}
public class Override_Program {
    public static void main(String[] args)
    {
        B r=new B();
    }
}
 