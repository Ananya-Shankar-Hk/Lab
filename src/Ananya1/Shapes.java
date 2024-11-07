package Ananya1;

//Shape class (Parent)
 class Shape 
{
 double getArea();
}

//Circle class (Child)
class Circle extends Shape 
{
int radius;

Circle(int radius) 
{
   this.radius = radius;
}

double getArea() 
{
   return Math.PI * radius * radius;
}
}

//Square class (Child)
class Square extends Shape 
{
int length;

Square(int length) 
{
   this.length = length;
}

double getArea() 
{
   return length * length;
}
}
//Rectangle class (Child)
class Rectangle extends Shape 
{
int width, height;

Rectangle(int width, int height) 
{
   this.width = width;
   this.height = height;
}

double getArea() {
   return width * height;
}
}

public class Shapes 
{
public static void main(String[] args) 
{
   Shape circle = new Circle(5);
   Shape square = new Square(4);
   Shape rectangle = new Rectangle(3, 6);

   System.out.println("Circle Area: " + circle.getArea());
   System.out.println("Square Area: " + square.getArea());
   System.out.println("Rectangle Area: " + rectangle.getArea());
}
}

