package prog;

import java.util.Scanner;

public class StandardQuadratics {
	public static void main(String[] args) {
		// Create a Scanner object with try-with-resources
		try (Scanner input = new Scanner(System.in)) {
			// Declare Variables
			double a = 0.0;
			double b = 0.0;
			double c = 0.0;
			// Input for values of a,b,and c
			System.out.print("Enter the value of a for the standard form ax^2+bx+c: ");
			String aInput = input.nextLine();
			System.out.print("Enter the value of b for the standard form ax^2+bx+c: ");
			String bInput = input.nextLine();
			System.out.print("Enter the value of c for the standard form ax^2+bx+c: ");
			String cInput = input.nextLine();
			// Test inputs for exceptions
			try {
				a = Double.parseDouble(aInput);
				b = Double.parseDouble(bInput);
				c = Double.parseDouble(cInput);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please use numbers.");
				System.exit(0);
			}
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
}