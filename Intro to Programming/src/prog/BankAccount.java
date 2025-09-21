package prog;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccount {

	 public static void main(String[] args) {
		// declare variables
		int selection = 0;
		double balance = 0.00;
		double deposit;
		double withdrawal;
		boolean valid1 ;
		boolean valid2 ;
		// decimal format
		DecimalFormat currencyFormat = new DecimalFormat("$###,###,###,##0.00");
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// operation selection
		do {
			valid1 = false;
			valid2 = false;

			System.out.println("Please select an operation for your bank account (Input option number)");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("3. Balance Check");
			System.out.println("4. Exit");
			try {
				selection = input.nextInt();
				if (selection <= 0 || selection > 4) {
					System.out.println("Invalid selection please try again.");
					input.nextLine();
				} else {
					System.out.println("You have selected option " + selection);
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input please use an integer between 1 and 4.");
				input.nextLine();
			}

			// Deposit
			do {
				if (selection == 1) {
					try {
						System.out.println("Please enter your deposit amount: ");
						deposit = input.nextDouble();
						System.out.println("You have deposited " + (currencyFormat.format(deposit)));
						System.out.println();
						balance = balance + deposit;
						valid1 = true;
						input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Invalid input please use a number.");
						input.nextLine();
					}
					// Withdrawal
				} else if (selection == 2) {
					do {
						try {
							System.out.println("Please enter your withdrawal amount: ");
							withdrawal = input.nextDouble();
							if ((balance - withdrawal) < 0) {
								System.out.println("You cannot withdraw " + currencyFormat.format(withdrawal)
										+ " as you only have " + currencyFormat.format(balance) + " available.");
								System.out.println();
								input.nextLine();
							} else {
								System.out.println("You have withdrawn " + (currencyFormat.format(withdrawal)));
								balance = balance - withdrawal;
								valid2 = true;
								valid1 = true;
								input.nextLine();
							}
						} catch (InputMismatchException e) {
							System.out.println("Invalid input please use a number.");
							input.nextLine();
						}
					} while (!valid2);
				}
				// Balance Inquiry
				else if (selection == 3) {
					System.out.println("Your bank account balance is " + (currencyFormat.format(balance)));
					System.out.println();
					valid1 = true;
				}
				// Exit
				else if (selection == 4) {
					input.close();
					System.exit(0);
				}
			} while (!valid1);
		} while (true);
	}
}