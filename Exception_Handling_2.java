/*           Exception Handling (NullPointerException) */
public class Exception_Handling_2 {
    public static void main(String[] args) {
        String str="abc";
        try
        {
          System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n)
        {
            System.out.println("Null value can't be casted");
        }
    }
}
/*
Error:
If Exception Not Handled:
public class Exception_Handling_2 {
    public static void main(String[] args) {
        String str=null;
        System.out.println(str.toUpperCase());
    }
}
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "<local1>" is null
        at Exception_Handling_2.main(Exception_Handling_2.java:4)
 */