package prog;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SubtractionQuiz {

	public static void main(String[] args) {

		// 1. declare validation variables
		boolean valid1 = false;
		// 2. declare answer variable
		int answer = 0;
		// 3. Generate two random single-digit integers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// 4. generate random response values
		int randResponse = (int) (Math.random() * 3) + 1;

		// 5. If number1 < number2, swap number1 with number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// 6. Prompt the student to answer "what is number1 – number2?"
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		do {
			try {
				answer = input.nextInt();
				valid1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please use an integer.");
				input.nextLine();
			}
		} while (!valid1);
		
		// 7. close scanner
		input.close();

		// 8. Grade the answer and display the result
		if (number1 - number2 == answer) {
			if (randResponse == 1) {
				System.out.println("Excellent");
			} else if (randResponse == 2) {
				System.out.println("Correct");
			} else if (randResponse == 3) {
				System.out.println("Way to go");
			}
		} else {
			if (randResponse == 1) {
				System.out.println("Incorrect");
			} else if (randResponse == 2) {
				System.out.println("Wrong");
			} else if (randResponse == 3) {
				System.out.println("Not Right");
			}
		System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}