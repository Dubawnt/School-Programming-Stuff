package prog;

import java.util.Scanner;

public class FarenheitCelcius {
    public static double FtoC(double x) {
        double celcius = (x - 32) / 1.8;
        return celcius;
    }
    public static double CtoF(double x) {
        double farenheit = (1.8 * x) + 32;
        return farenheit;
    }
    public static void main (String[] args) {

        // open scanner
        Scanner input = new Scanner(System.in);
        // take input
        System.out.println("Enter the temperature you wish to convert");
         double temp = input.nextInt();
         System.out.println("Enter the letter of the unit you are converting from");
         char unit = input.next().charAt(0);
        // close scanner
        input.close();
         if (unit == 'c'){
            temp = CtoF(temp);
            System.out.println("The temperature in farenheit is " + temp);
        }
         else if (unit == 'f') {
             temp = FtoC(temp);
             System.out.println("The temperature in celcius is " + temp);
         }
    }
}
