package prog;

import java.util.InputMismatchException;
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
            boolean valid = false;
            boolean valid2 = false;
            boolean valid3 = false;
            boolean valid4 = false;

            //Actual code
            do {
                try {
                    System.out.print("Enter the x-value of the first point: ");
                    x1 = input.nextDouble();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use numbers.");
                    input.nextLine();
                }
            } while (!valid);
            do {
                try {
                    System.out.print("Enter the y-value of the first point: ");
                    y1 = input.nextDouble();
                    valid2 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use numbers.");
                    input.nextLine();
                }
            } while (!valid2);
            do {
                try {
                    System.out.print("Enter the x-value of the second point: ");
                    x2 = input.nextDouble();
                    valid3 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use numbers.");
                    input.nextLine();
                }
            } while (!valid3);
            do {
                try {
                    System.out.print("Enter the y-value of the second point: ");
                    y2 = input.nextDouble();
                    valid4 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please use numbers.");
                    input.nextLine();
                }
            } while (!valid4);

            //calculate slope
            double slope = ((y2 - y1) / (x2 - x1));

            //output
            System.out.println("The slope of the line connecting the points (" + x1 + "," + y1 + ") and(" + x2 + "," + y2 + ") is " + slope);
        }
    }
}
