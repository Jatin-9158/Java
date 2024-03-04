abstract class Programming
{
    public abstract void Developer();
    public abstract void rank();
}
abstract class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berner's Lee");
    }   

}
class Java extends HTML
{
    @Override
    public void rank()
    {
        System.out.println("Rank1");
    }


}
public class AbstractProgram4 {
    public static void main(String[] args) {
        Programming Obj=new Java();
        Obj.Developer();
    }
}
