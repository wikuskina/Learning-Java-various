package Homework6;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);  // Create a Scanner object of temperature entry
        System.out.println("Enter a temperature between -40 and +40.");

        int userTemp = temp.nextInt(); // Read user input
        System.out.println("Temperature is: " + userTemp);  // Output user input
        if (userTemp < 0) {
            System.out.println("It is very cold outside.");
        } else if (userTemp > 0 && userTemp < 16) {
            System.out.println("It is cool outside.");

        } else {
            System.out.println("It warm and lovely outside.");
        }

    }
}
