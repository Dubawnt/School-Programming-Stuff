package prog;

import java.util.Scanner;

public class ReverseNumber {
    public static int Reverse (int x) {
        int forward = x;
        int reverse = 0;
        int digit = 0;
        int i = 1;
        while (forward > 0) {
        digit = forward % 10;
        reverse = (reverse * 10) + digit;
        forward = (forward - digit) / 10;
        }
        return reverse;
    }
    public static void main (String[] args) {
        // declare variables
        int number = 0;

        // open scanner
        Scanner input = new Scanner(System.in);

        // take input
        System.out.println("Please enter a number to reverse:");
        number = input.nextInt();
        // close scanner
        input.close();

        //reverse
        int reversed = 0;
        reversed = Reverse(number);
        System.out.println("The reverse of " + number + " is " + reversed);
    }
}