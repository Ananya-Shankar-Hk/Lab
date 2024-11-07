package Ananya1;

//Superclass Animal
class Animal {
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class to demonstrate the functionality
public class Main {
 public static void main(String[] args) {
     // Create an instance of Animal
     Animal animal = new Animal();
     // Create an instance of Dog
     Dog dog = new Dog();
     // Create an instance of Cat
     Cat cat = new Cat();

     // Call the makeSound method on each instance
     animal.makeSound(); // Output: The animal makes a sound.
     dog.makeSound();    // Output: The dog barks.
     cat.makeSound();    // Output: The cat meows.
 }
}
