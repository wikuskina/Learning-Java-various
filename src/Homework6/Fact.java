package Homework6;

import java.util.Scanner;

public class Fact {      // calculation of number that is entered in the main function below and sent to this method
    static int calculateFact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner fact = new Scanner(System.in);  // Create a Scanner object of number entry
        System.out.println("Enter an integer:");
        int n = fact.nextInt();
        System.out.println(calculateFact(n));

        // System.out.println();
    }

}
