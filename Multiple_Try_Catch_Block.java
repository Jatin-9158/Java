// Made with Different Exception Case Handling 
public class Multiple_Try_Catch_Block
{
    public static void main(String[] args)
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
           System.out.println("Can't Divide by Zero");
        }
        try
        {
            int A[]={10,20,30,40,50};
            System.out.println(A[10]);
        }
        catch(ArrayIndexOutOfBoundsException c)
        {
            System.out.println("Array Index Out of Bounds ");
        }
    }
}