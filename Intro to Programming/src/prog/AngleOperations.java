package prog;

import java.util.Scanner;

public class AngleOperations {
    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an angle in degrees:");
        double angle = input.nextDouble();
        input.close();

        //convert to radians
        double radians = Math.toRadians(angle);

        //store trig results
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        //display values
        System.out.println("Sin: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);
    }
}
