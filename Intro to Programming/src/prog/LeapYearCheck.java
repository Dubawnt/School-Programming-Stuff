package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearCheck {
    public static boolean LeapYear (int x) {
        int isLeapYear = x;
        if ((isLeapYear % 100) == 0) {
            if ((isLeapYear % 400) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((isLeapYear % 4) == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        // declare variables
        int year = 0;

        // open scanner
        Scanner input = new Scanner(System.in);

        // take input
        System.out.println("Please enter a year to check if it is a Leap Year:");
                year = input.nextInt();
        // close scanner
        input.close();

        // check if leap
        if (LeapYear(year)){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

    }
}
