/*               Final Class         */
/* Final_Keyword3.java:11: error: cannot inherit from final Final
class Thief extends Final
                    ^
1 error
 */
final class Final{
    void Mobile_Number()
    {
        System.out.println("9863443232");
    }
    void ATMPIN()
    {
        System.out.println("4342");
    }
}
class Thief extends Final
{
    @Override
    void Mobile_Number()
    {
        System.out.println("9863443232");
    }
    @Override
    void ATMPIN()
    {
        System.out.println("4342");
    }
}
public class Final_Keyword3
{
    public static void main(String[] args)
    {
      Thief t=new Thief();
      t.Mobile_Number();
      t.ATMPIN();
    }
}
/* So,It can not Inherit this Class  */