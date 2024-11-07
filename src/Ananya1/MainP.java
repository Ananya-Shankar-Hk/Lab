package Ananya1;

//Student class
 class Student {
 String name;
 int age;
 String department;

 // Default constructor
 public Student() {
     this.name = "Unknown";
     this.age = 20;
     this.department = "Unassigned";
 }

 // Constructor with name and age
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
     this.department = "IT";
 }

 // Constructor with name, age, and department
 public Student(String name, int age, String department) {
     this.name = name;
     this.age = age;
     this.department = department;
 }

 // Method to print student details
 public void printDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Department: " + department);
     System.out.println();
 }
}

//Main class
public class MainP {
 public static void main(String[] args) {
     // Create instances using each constructor
     Student defaultStudent = new Student();
     Student itStudent = new Student("John Doe", 22);
     Student csStudent = new Student("Jane Doe", 21, "Computer Science");

     // Print details of each student
     System.out.println("Default Student:");
     defaultStudent.printDetails();

     System.out.println("IT Student:");
     itStudent.printDetails();

     System.out.println("CS Student:");
     csStudent.printDetails();
 }
}


