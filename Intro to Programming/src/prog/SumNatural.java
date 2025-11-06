package prog;

import java.util.Scanner;

public class SumNatural {

    public static void main(String[] args) {
        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input what number to stop at:");
        int number = input.nextInt();
        input.close();
        int i = 0;
        int sum = 0;
        //loop
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}