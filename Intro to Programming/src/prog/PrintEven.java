package prog;

import java.util.Scanner;

public class PrintEven {

    private static boolean PrintEven(int n){
        if (n % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        //take input
        Scanner input = new Scanner(System.in);
        System.out.println("What maximum integer would you like to print evens to? ");
        int number = input.nextInt();

        //Print evens
        int i;
        for (i = 0; i <= number; i++) {
            if (PrintEven(i)) {
                System.out.println(i);
            }
        }
    }
}
