package prog;

import java.util.Scanner;

public class NNumbers {
    public static void main(String[] args) {
        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number:");
        int number = input.nextInt();
        input.close();
        int i = 1;
        //loop
        do  {
            System.out.println(i);
            i++;
        }
        while (i <= number);
    }
}
