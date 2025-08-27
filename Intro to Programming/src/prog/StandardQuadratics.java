package prog;
import java.util.Scanner;

public class StandardQuadratics {
    public static void main(String[] args) {
        // Create a Scanner object with try-with-resources
        try (Scanner input = new Scanner(System.in)) {

            // Prompt the user for values of a,b,and c
            System.out.print("Enter the value of a for the standard form ax^2+bx+c: ");
            double a = input.nextDouble();
            System.out.print("Enter the value of b for the standard form ax^2+bx+c: ");
            double b = input.nextDouble();
            System.out.print("Enter the value of c for the standard form ax^2+bx+c: ");
            double c = input.nextDouble();

            // Compute discriminant
            double discriminant = Math.pow(b, 2) - (4 * a * c);

            if (discriminant > 0) {
                // Two real and distinct roots
                double Zero1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double Zero2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The zeros of the equation are " + Zero1 + " and " + Zero2);
            } else if (discriminant == 0) {
                // One real root (double root)
                double Zero = -b / (2 * a);
                System.out.println("The zero of the equation is " + Zero);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The equation has complex zeros:");
                System.out.println("Zero1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Zero2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}