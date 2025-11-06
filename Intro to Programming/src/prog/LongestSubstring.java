package prog;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {

        //open scanner
        Scanner input = new Scanner(System.in);

        //take input
        System.out.println("Please type your string: ");
        String toScan = input.nextLine();
        input.close();

        //take length
        int length = toScan.length();

        // length loop
        int count = 1;
        int longest = 1;
        int charPosition = 0;
        for (int i = 0; i < (length - 1); i++) {
            if (toScan.charAt(i) == toScan.charAt(i + 1)) {
                count++;
                if (count > longest) {
                    longest = count;
                    charPosition = (i + 2) - longest;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("The longest repeating substring is " + longest + " characters which are " + toScan.substring(charPosition, charPosition + longest));
    }
}