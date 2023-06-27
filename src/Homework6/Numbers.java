package Homework6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);  // Create a Scanner object of number entry
        System.out.println("Please enter any integer, except 0:");

        int userNumber = number.nextInt(); // Read user input
        System.out.println("You have entered the following integer: " + userNumber);  // Output user input
        String result = userNumber % 2 == 0 ? "This number is even.": "This number is odd.";
        System.out.println(result);

        }
}
