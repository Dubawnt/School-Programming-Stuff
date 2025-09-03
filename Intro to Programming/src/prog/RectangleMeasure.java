package prog;

import java.util.Scanner;

public class RectangleMeasure {

	public static void main(String[] args) {

		// create a scanner object
		try (Scanner input = new Scanner(System.in)) {

			// Input values
			System.out.print("Enter the width of the rectangle: ");
			double width = input.nextDouble();
			System.out.print("Enter the height of the rectangle: ");
			double height = input.nextDouble();
			input.close();

			// Calculate rectangle measurements
			double perimeter = ((height * 2) + (width * 2));
			double area = width * height;
			double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

			// Output
			System.out.println("The perimeter is " + perimeter);
			System.out.println("The area is " + area);
			System.out.println("The length of the diagonal is " + diagonal);
		}
	}
}
