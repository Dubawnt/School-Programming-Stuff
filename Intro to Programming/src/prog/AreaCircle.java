package prog;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		// Create a Scanner object with try-with-resources
		try (Scanner input = new Scanner(System.in)) {

			// Prompt the user to enter a radius
			System.out.print("Enter a number for radius: ");
			double radius = input.nextDouble();
			final double pi =3.14159;
			// Compute area
			double area = radius * radius * pi;

			// Display result
			System.out.println("The area for the circle of radius " + radius + " is " + area);
		}
	}
}