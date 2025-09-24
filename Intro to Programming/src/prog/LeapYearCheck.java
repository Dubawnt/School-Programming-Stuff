package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        // declare variables
        int isLeapYear = 0;
        boolean valid = false;

        // open scanner
        Scanner input = new Scanner(System.in);

        // take input
        System.out.println("Please enter a year to check if it is a Leap Year:");
        do {
            try {
                isLeapYear = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please use an number.");
                input.nextLine();
            }
        } while (!valid);

        // close scanner
        input.close();

        // check if leap
        if ((isLeapYear % 100) == 0) {
            if ((isLeapYear % 400) == 0) {
                System.out.println(isLeapYear + " is a Leap Year");
            } else {
                System.out.println(isLeapYear + " is not a Leap Year");
            }
        } else {
            if ((isLeapYear % 4) == 0) {
                System.out.println(isLeapYear + " is a Leap Year");
            } else {
                System.out.println(isLeapYear + " is not a Leap Year");
            }
        }

    }
}
