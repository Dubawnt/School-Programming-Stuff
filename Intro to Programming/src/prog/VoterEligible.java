package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterEligible {

	public static void main(String[] args) {
		// open scanner
		Scanner input = new Scanner(System.in);
		// declare variable
		boolean age18 = false;
		boolean felon = false;
		boolean valid1 = false;
		boolean valid2 = false;
		// Instruct
		System.out.println("Answer the statements either true or false");
		// input validation
		do {
			try {
				System.out.println("The applicant is at least 18 years of age");
				age18 = input.nextBoolean();
				valid1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use true or false.");
				input.nextLine();
			}
		} while (!valid1);
		if (age18) {
			do {
				try {
					System.out.println("The applicant has been convicted of a felony");
					felon = input.nextBoolean();
					valid2 = true;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input! Please use true or false.");
					input.nextLine();
				}
			} while (!valid2);
		}
		// close input
		input.close();
		// check values for eligibility
		if (age18) {
			if (!felon) {
				System.out.println("The applicant is an eligible voter.");
			} else {
				System.out.println("The applicant is an ineligible felon.");
			}

		} else {
			System.out.println("The applicant is underage and ineligible.");
		}
	}
}