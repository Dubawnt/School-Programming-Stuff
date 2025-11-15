package prog;

import java.util.Scanner;

public class SwapCase {

    public static String SwapCase(String x) {
        String result = "";
        String build = "";
        for (int i=0; i<x.length(); i++){
            build = x.substring(i, i+1);
            if (build.charAt(0) >= 65 && build.charAt(0) <= 90) {
                build = build.toLowerCase();
                result = result.concat(build);
            }
            else if (build.charAt(0) >= 97 && build.charAt(0) <= 122) {
                build = build.toUpperCase();
                result = result.concat(build);
            }
            else {
                result = result.concat(build);
            }
        }
        return result;
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
