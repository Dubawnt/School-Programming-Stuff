package prog;

import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {
        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input what number to stop at:");
        int number = input.nextInt();
        input.close();
        int i = 0;
        //loop
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
