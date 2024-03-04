abstract class animal {
    animal()
    {
        System.out.println("All Animals.............");
    }
    public abstract void sound();
 }
 
 class Dog extends animal {
    Dog()
    {
        super();
    }
   public void sound() {
     System.out.println("Dog is Barking");
   }
 }
 
 class Lion extends animal {
   Lion()
   {
      super();
   }
   public void sound() {
     System.out.println("Tiger is Roar");
   }
 }
 
 public class AbstractProgram2 {
     public static void main(String[] args) {
         animal Doggy1 = new Dog();
         animal Lion1 = new Lion();
         Dog Doggy2 = new Dog();
         Lion Lion2 = new Lion();
         Doggy1.sound();
         Doggy2.sound();
         Lion1.sound();
         Lion2.sound();
     }
 }