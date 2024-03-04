/*                   Multiple Inheritance */
/*   
 Error:You can not Extend This Method
 class A 
{
    void Show()
    {
        System.out.println("This is Class A");
    }
}
class B
{
    void Show()
    {
        System.out.println("This is Class A");
    }
}
class Multiple_Inheritance_Program1 extends A,B
{
    public static void main(String[] args)
    {
        Multiple_Inheritance_Program1 M=new Multiple_Inheritance_Program1();
        M.Show();
    }
}
 */
interface A 
{
    void Show(); //By Default->public + abstract
}
interface B
{
    void Show(); //By Default->public + abstract
}
class Multiple_Inheritance_Program1 implements A,B
{
    // Default<Public 
    public void Show()
    {
        System.out.println("Interface A,B");
    }
    
    public static void main(String[] args)
    {
        Multiple_Inheritance_Program1 M=new Multiple_Inheritance_Program1();
        M.Show();
    }
}
