package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StandardQuadratics {
	public static void main(String[] args) {

		// Declare Variables
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		boolean valid = false;
		boolean valid1 = false;
		boolean valid2 = false;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Instruction
		System.out.println("Please enter the values of a, b, and c as they appear in standard quadratic form.");
		// Test inputs for exceptions

		do {
			try {
				System.out.println("Please enter the value of a:");
				a = input.nextDouble();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use numbers.");
				input.nextLine();
			}
		} while (!valid);
		do {
			try {
				System.out.println("Please enter the value of b:");
				b = input.nextDouble();
				valid1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use numbers.");
				input.nextLine();
			}
		} while (!valid1);

		do {
			try {
				System.out.println("Please enter the value of c:");
				c = input.nextDouble();
				valid2 = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use numbers.");
				input.nextLine();
			}
		} while (!valid2);
		// close input
		input.close();
		// Test case not quadratic
		if (a == 0) {
			System.out.println("This is not a quadratic.");
			System.exit(0);
		}

		// Calculate discriminant
		double discriminant = Math.pow(b, 2) - (4 * a * c);

		if (discriminant > 0) {

			// Two zeros
			double zero1 = (-b - Math.sqrt(discriminant)) / (2 * a);
			double zero2 = (-b + Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The zeros of the equation are " + zero1 + " and " + zero2);
		} else if (discriminant == 0) {

			// One zero
			double zero = -b / (2 * a);
			System.out.println("The zero of the equation is " + zero);
		} else {

			// Complex zeros
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("The equation has complex zeros:");

			// check for extraneous zeros in real
			if (real != 0) {
				System.out.println("Zero1 = " + real + " - " + imaginary + "i");
				System.out.println("Zero2 = " + real + " + " + imaginary + "i");
			} else {
				System.out.println(" - " + imaginary + "i");
				System.out.println(" + " + imaginary + "i");
			}

		}
	}
}