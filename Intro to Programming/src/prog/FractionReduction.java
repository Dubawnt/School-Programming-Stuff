package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FractionReduction {

	public static void main(String[] args) {

		// Declare Variables
		int numerator = 0;
		int denominator = 0;
		int wholeMix = 0;
		int fracMix = 0;
		boolean valid = false;
		boolean valid1 = false;
		boolean proper = false;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

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

		// close scanner
		input.close();
		// check for proper or improper
		if (numerator < denominator) {
			proper = true;
		}

		// Outputs
		if (proper) {
			System.out.println("The fraction " + numerator + "/" + denominator + " is a proper fraction");
		} else {
			if ((numerator % denominator) == 0) {
				System.out.println("The fraction " + numerator + "/" + denominator
						+ " is an improper fraction which reduces to " + (numerator / denominator) + ".");
			} else {
				wholeMix = numerator / denominator;
				fracMix = numerator - (wholeMix * denominator);
				System.out.println("The fraction " + numerator + "/" + denominator
						+ " is an improper fraction which reduces to " + wholeMix + "+" + fracMix + "/" + denominator);
			}
		}
	}
}