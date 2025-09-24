package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsPositive {

    public static void main(String[] args) {

        //declare variables
        double isPositive = 0;
        boolean valid = false;

        //open scanner
        Scanner input = new Scanner(System.in);

        //take input
        System.out.println("Please enter a number to check if positive:");
        do {
            try {
                isPositive = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please use an number.");
                input.nextLine();
            }
        } while (!valid);

        //close scanner
        input.close();
        //program
        if (isPositive > 0) {
            System.out.println(isPositive + " is positive");
        } else {
            System.out.println(isPositive + " is not positive");
        }
    }
}