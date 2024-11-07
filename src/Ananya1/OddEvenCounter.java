package Ananya1;

//Import the Scanner class for user input
import java.util.Scanner;

public class OddEvenCounter {
 public static void main(String[] args) {
     // Create a Scanner object to read user input
     Scanner scanner = new Scanner(System.in);

     // Initialize counters for odd and even numbers
     int oddCount = 0, evenCount = 0;

     // Loop indefinitely until -1 is entered
     while (true) {
         // Prompt user to enter a number
         System.out.print("Enter a number (-1 to exit): ");
         
         // Read user input
         int num = scanner.nextInt();

         // Check if user wants to exit
         if (num == -1) {
             // Break out of the loop
             break;
         }

         // Check if number is odd or even
         if (num % 2 == 0) {
             // Increment even counter if number is even
             evenCount++;
         } else {
             // Increment odd counter if number is odd
             oddCount++;
         }

     }

     // Print total counts
     System.out.println("\nTotal Odd Numbers: " + oddCount);
     System.out.println("Total Even Numbers: " + evenCount);

     // Close scanner
     scanner.close();
 }
}



