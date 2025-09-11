package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Declare Variables
		long a = 0L;
		boolean valid = false;
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Instruction
		System.out.println("Please enter the integer to be checked for even/odd.");
		// Take inputs and check for exceptions
		do {
			try {
				System.out.println("Please enter the value of the number:");
				a = input.nextLong();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use integers.");
				input.nextLine();
			}
		} while (!valid);
		//close input
		input.close();
		// check for even or odd
		if ((a % 2) == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
}
