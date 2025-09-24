package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckLarger {

    public static void main(String[] args) {
        // Declare Variables
        double a = 0.0;
        double b = 0.0;
        boolean valid = false;
        boolean valid1 = false;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Instruction
        System.out.println("Please enter the values of the numbers to check which is larger");
        // Take inputs and check for exceptions

        do {
            try {
                System.out.println("Please enter the value of the first number:");
                a = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please use numbers.");
                input.nextLine();
            }
        } while (!valid);
        do {
            try {
                System.out.println("Please enter the value of the second number:");
                b = input.nextDouble();
                valid1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please use numbers.");
                input.nextLine();
            }
        } while (!valid1);
        // close scanner
        input.close();
        // check larger
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
