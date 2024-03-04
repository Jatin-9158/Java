/*             var-arg method */
class A 
{
   void add(int ... a)//--> var-args method represent to int[]a One Dimensional Array
   {
      int sum=0;
      //for-each loop
      for(int x:a)
      {
        sum=sum+x;
      }
      System.out.println("Sum of Numbers is:"+sum);
   }
}
public class Var_argProgram {
    public static void main(String[] args) {
        A Obj=new A();
        Obj.add();
        Obj.add(2,3);
        Obj.add(3,4,6);
        Obj.add(54,434,23,434);

    }
}
