package Ananya1;

//Superclass Animal
class Animal1 
{
 public void makeSound() 
 {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog (inherits from Animal)
class Dog1 extends Animal1 
{
 public void makeSound() 
 {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat (inherits from Animal)
class Cat1 extends Animal1 
{
 public void makeSound() 
 {
     System.out.println("The cat meows.");
 }
}

//Main class
public class Student
{
 public static void main(String[] args) 
 {
     Animal1 animal = new Animal1();
     Dog1 dog = new Dog1();
     Cat1 cat = new Cat1();

     System.out.println("Animal:");
     animal.makeSound();
     System.out.println("\nDog:");
     dog.makeSound();

     System.out.println("\nCat:");
     cat.makeSound();
 }
}
