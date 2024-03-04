abstract class animal {
    abstract public void sound();
 }
 
 class Dog extends animal {
   public void sound() {
     System.out.println("Dog is Barking");
   }
 }
 
 class Lion extends animal {
   public void sound() {
     System.out.println("Tiger is Roar");
   }
 }
 
 public class AbstractProgram1 {
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