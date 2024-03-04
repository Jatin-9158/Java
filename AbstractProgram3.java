abstract class Programming
{
    public abstract void Developer();
    public abstract void rank();
}
class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berner's Lee");
    }   
    @Override
    public void rank()
    {
        System.out.println("Rank1");
    }
}
class Java extends Programming
{
   @Override
   public void Developer()
   {
    System.out.println("James Gosling");
   }


}
public class AbstractProgram3 {
    public static void main(String[] args) {
        HTML Obj1=new HTML();
        Java Obj2=new Java();
        Programming Obj3=new HTML();
        Programming Obj4=new Java();
        Obj1.Developer();
        Obj2.Developer();
        Obj3.Developer();
        Obj4.Developer();
    }
}
