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

		// check gcf
		int a = numerator;
		int b = denominator;
		int gcf;
		int r = 0;
		
		if (a == 0) {
			gcf = b;
		}
		else if (b == 0) {
			gcf = a;
		}
		else {
			do {
				r = a % b;
				if (!(r == 0)) {
				a = b;
				b = r;
				}
			} while (!(r == 0));
			gcf = b;
			
		System.out.println("The gcf of " + numerator + " and " + denominator + " is " + gcf);
		// check for proper or improper
		if (Math.abs(numerator) < Math.abs(denominator)) {
			proper = true;
		}

		// Outputs
		if (proper) {
			System.out.println("The fraction " + numerator + "/" + denominator + " is a proper fraction");
			if (!((gcf) == 1)) {
				System.out.println("The fraction reduces to " + (numerator / gcf) + "/" + (denominator / gcf));
			}
		} else if ((numerator % denominator) == 0) {
			System.out.println("The fraction " + numerator + "/" + denominator
					+ " is an improper fraction which reduces to " + (numerator / denominator) + ".");
		} else if (denominator == 0) {
			System.out.println("This is Undefined!");
		} else {
			wholeMix = numerator / denominator;
			fracMix = numerator - (wholeMix * denominator);
			System.out.println("The fraction " + numerator + "/" + denominator
					+ " is an improper fraction which reduces to " + wholeMix + "+" + (fracMix / gcf) + "/" + (denominator / gcf));
		}
	}
}
}