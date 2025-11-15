package prog;

import java.util.Arrays;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        System.out.print("Please input number " + (i + 1) + ":");
        intArray[i] = input.nextInt();
        }
        //Print Array
        String arrayString = Arrays.toString(intArray);
        System.out.println(arrayString);
        //Sum Array
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += intArray[i];
        }
        System.out.println("The sum of the array is " + sum);
        //Average Array
        double average = sum / 10;
        System.out.println("The average of the array is " + average);
        //Largest Number
        int largest = intArray[0];
        int indexLarge = 0;
        for (int i = 0; i < 10; i++) {
            if (intArray[i] > largest) {
                largest = intArray[i];
                indexLarge = i;
            }
        }
        System.out.println("The largest number in the array is " + largest + " at index " + indexLarge);
        //Smallest Number
        int smallest = intArray[0];
        int indexSmall = 0;
        for (int i = 0; i < 10; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
                indexSmall = i;
            }
        }
        System.out.println("The smallest number in the array is " + smallest + " at index " + indexSmall);
        //Number Search
        System.out.print("Please input the number you want to search for: ");
        int search = input.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (intArray[i] == search) {
                found = true;
                System.out.println("The number " + search + " was found at index " + i);
            }
        }
        if (!found) {
            System.out.println("The number " + search + " was not found.");
        }
        //Close Scanner
        input.close();
        //Reverse Array
        int[] reversedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = intArray[9 - i];
        }
        String reversedArrayString = Arrays.toString(reversedArray);
        System.out.println(reversedArrayString);
    }
}
