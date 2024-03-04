/*             Final Method */
/* Final_Keyword2.java:15: error: Mobile_Number() in Thief cannot override Mobile_Number() in Final
    void Mobile_Number()
         ^
  overridden method is final
Final_Keyword2.java:20: error: ATMPIN() in Thief cannot override ATMPIN() in Final
    void ATMPIN()
         ^
  overridden method is final */
class Final{
    final void Mobile_Number()
    {
        System.out.println("9863443232");
    }
    final void ATMPIN()
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
public class Final_Keyword2
{
    public static void main(String[] args)
    {
      Thief t=new Thief();
      t.Mobile_Number();
      t.ATMPIN();
    }
}
/* So,It can not Override this Method */