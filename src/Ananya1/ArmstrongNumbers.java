package Ananya1;

// Import the Scanner class for user input
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the start of the range
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        // Prompt user to enter the end of the range
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        // Print header for Armstrong numbers output
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        // Loop through each number in the range
        for (int i = start; i <= end; i++) {
            // Initialize sum of cubes of digits and store original number
            int sum = 0, original = i;

            // Loop through each digit in the number
            while (i != 0) {
                // Extract last digit
                int digit = i % 10;

                // Calculate cube of current digit and add to sum
                sum += digit * digit * digit;
             // Remove last digit
                i /= 10;
            }

            // Check if sum of cubes equals the original number (Armstrong number)
            if (sum == original) {
                // Print Armstrong number
                System.out.println(original);
            }

            // Restore i for next iteration
            i = original;
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}



