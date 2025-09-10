package prog;
import java.util.Scanner;
public class CoordinateSlope {

	public static void main(String[] args) {
		
		//create a scanner object
		try (Scanner input = new Scanner(System.in)) {
		
		//Inputs1
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		
			System.out.print("Enter the x-value of the first point: ");
			x1 = input.nextDouble();
			System.out.print("Enter the y-value of the first point: ");
			y1 = input.nextDouble();
			System.out.print("Enter the x-value of the second point: ");
			x2 = input.nextDouble();
			System.out.print("Enter the y-value of the second point: ");
			y2 = input.nextDouble();
			
		
			//calculate slope
			double slope = ((y2 - y1) / (x2 - x1));
			
			//output
			System.out.println("The slope of the line connecting the points (" + x1 +"," + y1 + ") and(" + x2 + "," + y2 + ") is " + slope);
	}
	}
}
