package Ananya1;

import java.util.Scanner;

public class Sum 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int m = s.nextInt();
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println("Sum Combinations:");
        System.out.println(m + n);
        System.out.println(m + k);
        System.out.println(n + k);
    }
}

