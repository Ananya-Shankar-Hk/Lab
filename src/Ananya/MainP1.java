package Ananya;


//Base class Vehicle
class Vehicle {
public void start() 
{
   System.out.println("Vehicle started.");
}
}

//Subclass Car
class Car extends Vehicle 
{
@Override
public void start() 
{
   System.out.println("Car started.");
}
}

//Subclass Motorcycle
class Motorcycle extends Vehicle 
{
@Override
public void start() 
{
   System.out.println("Motorcycle started.");
}
}

//Garage class
class Garage 
{
public void serviceVehicle(Vehicle v) 
{
   v.start();
   System.out.println("Vehicle serviced.");
}
}

public class MainP1 
{
	 public static void main(String[] args) 
	 {
	        Garage g = new Garage();
	        g.serviceVehicle(new Car());
	        g.serviceVehicle(new Motorcycle());
	  }
}
