package prog;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number:");
        double operAndy = input.nextDouble();
        input.close();

        //Operations
        double ceil = Math.ceil(operAndy);
        double floor = Math.floor(operAndy);
        double round = Math.round(operAndy);
        double absolute = Math.abs(operAndy);
        double square = Math.pow(operAndy,2);

        //Output
        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
        System.out.println("Round: " + round);
        System.out.println("Absolute: " + absolute);
        System.out.println("Square: " + square);
    }
}
