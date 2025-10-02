package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FractionReduction {

    public static void main(String[] args) {

        // Declare Variables
        int numerator = 0;
        int denominator = 0;
        boolean valid = false;
        boolean valid1 = false;
        boolean proper = false;

        // Create a Scanner object
        try (Scanner input = new Scanner(System.in)) {

            // Test inputs for exceptions
            do {
                try {
                    System.out.println("Please enter the numerator:");
                    numerator = input.nextInt();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use an integer.");
                    input.nextLine();
                }
            } while (!valid);
            do {
                try {
                    System.out.println("Please enter the denominator:");
                    denominator = input.nextInt();
                    valid1 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use an integer.");
                    input.nextLine();
                }
            } while (!valid1);
        }
        // Scanner closes automatically here

        //check for undefined
        if (denominator == 0) {
            System.out.println("This is Undefined!");
            return;
        }

        //normalize signs
        int numeratorFinal = numerator;
        int denominatorFinal = denominator;

        if ((numerator < 0) && (denominator < 0)) {
            numeratorFinal = numerator * -1;
            denominatorFinal = denominator * -1;
        } else if ((numerator >= 0) && (denominator < 0)) {
            numeratorFinal = numerator * -1;
            denominatorFinal = denominator * -1;
        }

        // check for proper or improper
        if (Math.abs(numeratorFinal) < Math.abs(denominatorFinal)) {
            proper = true;
        }

        // Outputs
        if (proper) {
            int gcfSimple = gcf(numeratorFinal, denominatorFinal);
            System.out.println("The gcf of " + numerator + " and " + denominator + " is " + gcfSimple);
            System.out.println("The fraction " + numerator + "/" + denominator + " is a proper fraction");
            if (!((gcfSimple) == 1)) {
                System.out.println("The fraction reduces to " + (numeratorFinal / gcfSimple) + "/" + (denominatorFinal / gcfSimple));
            }
        } else if ((numerator % denominator) == 0) {
            System.out.println("The fraction " + numerator + "/" + denominator
                    + " is an improper fraction which reduces to " + (numeratorFinal / denominatorFinal) + ".");
        } else {
            int wholeMix = Math.floorDiv(numeratorFinal, denominatorFinal);
            int fracMix = Math.floorMod(numeratorFinal, denominatorFinal);
            int gcfMixed = gcf(fracMix, denominatorFinal);
            System.out.println("The fraction " + numerator + "/" + denominator
                    + " is an improper fraction which reduces to " + wholeMix + " " + (fracMix / gcfMixed) + "/" + (Math.abs(denominatorFinal) / gcfMixed));
        }
    }

    // Euclidean GCF helper stussy baka
    private static int gcf(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0) return y;
        if (y == 0) return x;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}