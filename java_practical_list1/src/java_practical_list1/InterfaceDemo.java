//2. Write a program to implement interface [implement any 5 properties of interface]

package java_practical_list1;
//Interface demonstrating properties
interface Animal {
 int LEGS = 4; // 2. Constant (public static final by default)

 void speak(); // 1. Abstract method (public abstract by default)

 default void walk() { // 1. Default method (Java 8+)
     System.out.println("Walking on " + LEGS + " legs.");
 }

 static void info() { // 1. Static method
     System.out.println("Animals have behaviors.");
 }
}

//Another interface to show 3. Multiple inheritance
interface Pet {
 void cuddle();
}

//5. Implementing multiple interfaces
class Dog implements Animal, Pet {
 public void speak() {
     System.out.println("Woof!");
 }

 public void cuddle() {
     System.out.println("Cuddling...");
 }
}

public class InterfaceDemo {
 public static void main(String[] args) {
     Animal dog = new Dog(); // 6. Polymorphism
     dog.speak();            // Woof!
     dog.walk();             // Walking on 4 legs.

     Pet pet = (Pet) dog;
     pet.cuddle();           // Cuddling...

     Animal.info();          // Static method
 }
}
