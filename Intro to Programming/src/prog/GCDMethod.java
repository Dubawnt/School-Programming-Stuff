package prog;

import java.util.Scanner;

public class GCDMethod {

    private static int gcd(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0) return y;
        if (y == 0) return x;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the first number:");
        int num1 = input.nextInt();
        System.out.print("Please input the second number:");
        int num2 = input.nextInt();
        input.close();

        //take gcf
        int gcdFinal = gcd(num1, num2);

        //Print GCD
        System.out.println("The GCF of " + num1 + " and " + num2 + " is " + gcdFinal);
    }
}
