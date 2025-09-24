package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SignCheck {

    public static void main(String[] args) {
        // open scanner
        Scanner input = new Scanner(System.in);
        // declare variable
        double a = 0.0;
        boolean valid = false;
        // input validation
        do {
            try {
                System.out.println("Please enter the value to be checked:");
                a = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please use numbers.");
                input.nextLine();
            }
        } while (!valid);
        //close scanner
        input.close();
        // check if positive or negative
        if (a == 0) {
            System.out.println("This is zero.");
        } else if (a > 0) {
            System.out.println("This is positive");
        } else {
            System.out.println("This is negative");
        }
    }
}
