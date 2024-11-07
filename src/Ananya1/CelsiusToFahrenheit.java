package Ananya1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        float celsius = s.nextFloat();

        System.out.println("Temperature in Fahrenheit: " + ((celsius * 9) / 5 + 32));
    }
}
