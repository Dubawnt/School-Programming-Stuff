package prog;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {

        //open scanner
        Scanner input = new Scanner(System.in);
        //take input
        System.out.println("Please type your string of numbers: ");
        String numbers = input.nextLine();
        //calculate length
        int length = numbers.length();
        //declare
        int i = 0;
        int sum = 0;
        //loop
        while ( i <= length) {
            sum = sum + Integer.parseInt(String.valueOf(numbers.charAt(i)));
            i++ ;
        }
        //calculate average
        double sum2 = sum;
        double average = sum2 / length;
        //display
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
