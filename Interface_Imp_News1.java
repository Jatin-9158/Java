/*   Interface Private Method */
// One Way:
// interface A 
// {

//    default void call()
//    {
//      add(10,30);
//    }
//    private void add(int x,int y)
//    {
//      System.out.println("Sum of two numbers:"+(x+y));;
//    }
// }
// class B implements A
// {
//     public void sub(int x,int y)
//     {
//       System.out.println("Sub of two numbers:"+(x-y));
//     }
// }
// public class Interface_Imp_News1
// {
//     public static void main(String[] args)
//     {
//         B b=new B();
//         b.call();
//         b.sub(200,100);
//     }
// }
// Second Way:
interface A 
{

   public static void call()
   {
     add(10,30);
   }
   private static void add(int x,int y)
   {
     System.out.println("Sum of two numbers:"+(x+y));;
   }
}
class B implements A
{
    public void sub(int x,int y)
    {
      System.out.println("Sub of two numbers:"+(x-y));
    }
}
public class Interface_Imp_News1
{
    public static void main(String[] args)
    {
        B b=new B();
        A.call();
        b.sub(200,100);
    }
}