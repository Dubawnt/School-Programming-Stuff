package prog;

import java.util.Scanner;

public class PrintBack {
    public static void main(String[] args){

        //open scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("please enter the number to count back from: ");
        int number = input.nextInt();
        //while loop
        do {
            System.out.println(number);
            number = number - 1;
        } while(number >= 1);
    }
}
