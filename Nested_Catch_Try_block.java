/*                 try-catch inside catch block */
public class Nested_Catch_Try_block {
    public static void main(String[] args)
    {
        try
        {
           System.out.println(10/2);
        }
        catch(Exception e)
        {
            System.out.println(e);
            try
            {
                String a=null;
                System.out.println(a.toUpperCase());
            }
            catch(NullPointerException E)
            {
                System.err.println("Error:Due to String is Null");
            }
        }
        System.out.println("Main Method Ended");

    }
}


/*
If Exception Inside catch block not Handled:
public class Nested_Catch_Try_block {
    public static void main(String[] args)
    {
        try
        {
           System.out.println(10/0);
        }
        catch(Exception e)
        {
            String a=null;
            System.out.println(a.toUpperCase());
        }
        System.out.println("Main Method Ended");

    }
}
 */


/*
If No Exception:
public class Nested_Catch_Try_block {
    public static void main(String[] args)
    {
        try
        {
           System.out.println(10/2);
        }
        catch(Exception e)
        {
            System.out.println(e);
            try
            {
                String a=null;
                System.out.println(a.toUpperCase());
            }
            catch(NullPointerException E)
            {
                System.err.println("Error:Due to String is Null");
            }
        }
        System.out.println("Main Method Ended");

    }
}
 */