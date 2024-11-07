package Ananya;

//Superclass Animal
class Animal 
{
 public void makeSound() 
 {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog (inherits from Animal)
class Dog extends Animal 
{
 @Override
 public void makeSound() 
 {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat (inherits from Animal)
class Cat extends Animal 
{
 @Override
 public void makeSound() 
 {
     System.out.println("The cat meows.");
 }
}

//Main class
public class MainV 
{
 public static void main(String[] args) 
 {
     Animal animal = new Animal();
     Dog dog = new Dog();
     Cat cat = new Cat();
     System.out.println("Animal:");
     animal.makeSound();

     System.out.println("\nDog:");
     dog.makeSound();

     System.out.println("\nCat:");
     cat.makeSound();
 }
}
