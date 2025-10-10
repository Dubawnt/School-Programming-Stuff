package prog;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a 4 digit binary string:");
        String userInput = input.nextLine();
        input.close();

        //Input Length Validation
        int length = userInput.length();
        if (length != 4) {
            System.out.println("This string is not 4 digits long.");
            System.exit(0);
        }
        //Input Binary Validation
        for (int charVal = 0; charVal < 4; charVal++) {
            if (userInput.charAt(charVal) != '0' && userInput.charAt(charVal) != '1') {
                System.out.println("This is not a binary string.");
                System.exit(0);
            }
        }

        //conversion to decimal
        int decimal = 0;
        if (userInput.charAt(0) == '1') {
            decimal = decimal + 8;
        }
        if (userInput.charAt(1) == '1') {
            decimal = decimal + 4;
        }
        if (userInput.charAt(2) == '1') {
            decimal = decimal + 2;
        }
        if (userInput.charAt(3) == '1') {
            decimal = decimal + 1;
        }

        //display
        System.out.println("The decimal output of " + userInput + " is " + decimal);

    }
}
