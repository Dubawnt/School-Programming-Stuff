package prog;
import java.util.Scanner;

public class StandardQuadratics {
    public static void main(String[] args) {
        // Create a Scanner object with try-with-resources
        try (Scanner input = new Scanner(System.in)) {

            // Input for values of a,b,and c
            System.out.print("Enter the value of a for the standard form ax^2+bx+c: ");
            double a = input.nextDouble();
            if (a == 0) {
            	System.out.println("This is not a quadratic.");
            	System.exit(0);
            }
            System.out.print("Enter the value of b for the standard form ax^2+bx+c: ");
            double b = input.nextDouble();
            System.out.print("Enter the value of c for the standard form ax^2+bx+c: ");
            double c = input.nextDouble();

            // Calculate discriminant
            double discriminant = Math.pow(b, 2) - (4 * a * c);

            if (discriminant > 0) {
                // Two zeros
                double zero1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double zero2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The zeros of the equation are " + zero1 + " and " + zero2);
            } else if (discriminant == 0) {
                // One zero
                double zero = -b / (2 * a);
                System.out.println("The zero of the equation is " + zero);
            } else {
                // Complex zeros
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The equation has complex zeros:");
                System.out.println("Zero1 = " + real + " + " + imaginary + "i");
                System.out.println("Zero2 = " + real + " - " + imaginary + "i");
            }
        }
    }
}