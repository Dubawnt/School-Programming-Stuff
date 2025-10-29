package prog;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // declare variables
        int vowels = 0;
        int i = 0;

        //open scanner
        Scanner input = new Scanner(System.in);
        //take input
        System.out.println("Please type your string: ");
        String sweetTea = input.nextLine();
        int lonk = sweetTea.length();
        sweetTea =sweetTea.toLowerCase();
        do {
            if(sweetTea.charAt(i) == 'a' || sweetTea.charAt(i) == 'e' || sweetTea.charAt(i) == 'i' || sweetTea.charAt(i) == 'o' || sweetTea.charAt(i) == 'u') {
                vowels++;
            }
            i++;
        }
        while(i < lonk);
        System.out.println("The number of vowels in your string is " + vowels);
    }
}
