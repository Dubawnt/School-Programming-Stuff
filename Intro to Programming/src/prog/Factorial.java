package prog;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int factoid) {
        //calculate
        int base = factoid;
        int factorial = 1;
        do {
            factorial = factorial * factoid;
            factoid--;
        } while(factoid > 1);
        return factorial;
    }

    public static void main(String[] args) {

        //open scanner
        Scanner input = new Scanner(System.in);

        //take input
        System.out.println("Please type your number: ");
        int number =  input.nextInt();

        //calculate factorial
        int factorialFinal = factorial(number);
        //display output
        System.out.println(number + "! = " + factorialFinal);
    }
}
