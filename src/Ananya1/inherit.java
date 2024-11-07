package Ananya1;

//Vehicle class (Parent)
class Vehicle 
{
 String make, model;
 int year, maxSpeed;

 Vehicle(String make, String model, int year, int maxSpeed)
 {
     this.make = make;
     this.model = model;
     this.year = year;
     this.maxSpeed = maxSpeed;
 }

 void drive() 
 {
     System.out.println(make + " " + model + " Vehicle is driving");
 }
}

//Car class (Child)
class Car extends Vehicle
{
 Car(String make, String model, int year, int maxSpeed) 
 {
     super(make, model, year, maxSpeed);
 }

 void drive() 
 {
     System.out.println(make + " " + model + " Car is driving");
 }
}

//Bike class (Child)
class Bike extends Vehicle {
 Bike(String make, String model, int year, int maxSpeed) 
 {
     super(make, model, year, maxSpeed);
 }

 void drive() 
 {
     System.out.println(make + " " + model + " Bike is driving");
 }
}

public class inherit 
{
 public static void main(String[] args) 
 {
     Car car = new Car("Lamborghini", "Huracan", 2020, 350);
     Bike bike = new Bike("Kawasaki Ninja", "H2R", 2023, 400);

 System.out.println("Car: " + car.make + " " + car.model + ", " + car.year + ", Max Speed: " + car.maxSpeed + " km/h");
     car.drive();

 System.out.println("\nBike: " + bike.make + " " + bike.model + ", " + bike.year + ", Max Speed: " + bike.maxSpeed + " km/h");
     bike.drive();
 }
}



