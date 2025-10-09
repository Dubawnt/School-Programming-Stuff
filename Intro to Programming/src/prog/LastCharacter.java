package prog;
import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a string:");
        String userInput = input.nextLine();
        input.close();

        //Get Last Character
        int length = userInput.length();
        char lastChar = userInput.charAt(length - 1);

        //display last character
        System.out.println("The last character is " + lastChar);

    }
}