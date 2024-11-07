package Ananya1;

import java.util.Scanner;

public class GrossSalaryCalculator 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int choice;

        do 
        {
            // Input basic salary
            System.out.print("Enter basic salary: ");
            double basicSalary = s.nextDouble();

            // Calculate HRA and DA
            double hra, da;
            if (basicSalary > 15000) {
                hra = basicSalary * 0.20;
                da = basicSalary * 0.60;
            } 
            else 
            {
                hra = 3000;
                da = basicSalary * 0.70;
            }

            // Calculate gross salary
            double grossSalary = basicSalary + hra + da;

            // Display salary components
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + grossSalary);

            // Ask for user's choice
            System.out.print("Enter -1 to continue, any other integer to exit: ");
            choice = s.nextInt();
        } while (choice == -1);
    }
}

