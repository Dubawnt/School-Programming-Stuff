package prog;

import java.util.Arrays;
import java.util.Scanner;

public class SwapCase {

    public static String SwapCase(String x) {
        String result = x;
        String build = null;
        for (int i=0; i<result.length(); i++){
            if (Character.getNumericValue(result.charAt(i)) >= 65 || Character.getNumericValue(result.charAt(i)) <= 90) {
                build.concat(String.valueOf(result.substring(i)) + 32);
            }
            else if (Character.getNumericValue(result.charAt(i)) >= 97 || Character.getNumericValue(result.charAt(i)) <= 122) {
                build.concat(String.valueOf(result.substring(i)) - 32);
            }
            else {
                build.concat(result.substring(i, i+1));
            }
        }
        return build;
    }

    public static void main(String[] args){
        //open scanner
        Scanner input = new Scanner(System.in);

        //take input
        System.out.println("Please type your string: ");
        String userInput = input.nextLine();
        input.close();

        //method
        String output = SwapCase(userInput);
        System.out.println(output);
    }
}
