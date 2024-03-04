                 /* Covariant return_type  */
// You can change the return_type of overrided method of superclass in subclass
class A  
{
    // It will not return the class type in Method
    A show()
    {
        System.out.println("Show A");
        // return new A();
        return this; //this --> new A() refers to current Object
    }
}
class B extends A
{
  // Here, we will change the return type of Overrided Method in Sub Class
  @Override
  B show()
  {
    System.out.println("Show B");
    return this;  //this --> new A() refers to current Object
  }

}
public class CovariantProgram1 {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.show();
        b.show();
    }
}
