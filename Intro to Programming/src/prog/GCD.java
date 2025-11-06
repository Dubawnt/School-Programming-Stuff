package prog;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        int number1 = input.nextInt();
        System.out.print("Please input the second number: ");
        int number2 = input.nextInt();
        input.close();

        //calculate GCD
        int i = 1;
        if (number1 > number2) {
            i = number2;
        }
        else {
            i = number1;
        }
        int gcd = 1;
        while ((number1 % i != 0) || (number2 % i != 0)) {
            i--;
            gcd = i;
        }
        System.out.println("The GCD of " + number1 + " and " + number2 + " is " + gcd);
        }
}
