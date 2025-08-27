package prog;

//program to display sum and take the average of 5 numbers
public class NumAvg {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int sum; // declare output
		int avg;

		n1 = 2; // initialize variables
		n2 = 3;
		n3 = 4;
		n4 = 5;
		n5 = 6;

		sum = n1 + n2 + n3 + n4 + n5;
		avg = sum / 5;

		// Display Result
		System.out.println("The sum of the five numbers is " + sum + " and the average is: " + avg);
	}

}
