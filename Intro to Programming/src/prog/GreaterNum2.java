package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreaterNum2 {

	public static void main(String[] args) {
		
		// Declare Variables
		double num1 = 0.0;
		double num2 = 0.0;
		boolean valid = false;
		boolean valid1 = false;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Instruction
		System.out.println("Please enter the values of the numbers to check which is larger");

		// Test inputs for exceptions
		do {
			try {
				System.out.println("Please enter the first number:");
				num1 = input.nextDouble();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use an number.");
				input.nextLine();
			}
		} while (!valid);
		do {
			try {
				System.out.println("Please enter the second number:");
				num2 = input.nextDouble();
				valid1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use an number.");
				input.nextLine();
			}
		} while (!valid1);
		
		//close scanner
		input.close();

		if (num1 > num2) {
			System.out.println("Maximum is " + num1 + ".");
		}
		else {
			System.out.println("Maximum is " + num2 + ".");
		}
	}

}
