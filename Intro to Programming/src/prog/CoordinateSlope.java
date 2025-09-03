package prog;
import java.util.Scanner;
public class CoordinateSlope {

	public static void main(String[] args) {
		
		//create a scanner object
		try (Scanner input = new Scanner(System.in)) {
		
			//Input Values
			System.out.print("Enter the x-value of the first point: ");
			double x1 = input.nextDouble();
			System.out.print("Enter the y-value of the first point: ");
			double y1 = input.nextDouble();
			System.out.print("Enter the x-value of the second point: ");
			double x2 = input.nextDouble();
			System.out.print("Enter the y-value of the second point: ");
			double y2 = input.nextDouble();
			input.close();
			
			//calculate slope
			double slope = ((y2 - y1) / (x2 - x1));
			
			//output
			System.out.println("The slope of the line connecting the points (" + x1 +"," + y1 + ") and(" + x2 + "," + y2 + ") is " + slope);
	}
	}
}
