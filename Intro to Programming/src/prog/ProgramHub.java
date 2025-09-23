package prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramHub {

    public static void main(String[] args) {

        //list variables
        int choice = 0;
        boolean valid = false;

        //List Program
        System.out.println("1.BankAccount");
        System.out.println("2.CheckLarger");
        System.out.println("3.CoordinateSlope");
        System.out.println("4.EvenOrOdd");
        System.out.println("5.FractionReduction");
        System.out.println("6.IsPositive");
        System.out.println("7.LeapYearCheck");
        System.out.println("8.SignCheck");
        System.out.println("9.StandardQuadratics");
        System.out.println("10.SubtractionQuiz");
        System.out.println("11.VoterEligible");
        System.out.println("Select a program:");

        //Open scanner
        Scanner input = new Scanner(System.in);

        //selection code
        while (!valid) {
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer.");
            }
            if ((choice <= 11) && (choice > 0)) {
                valid = true;
            } else {
                System.out.println("Please enter a number between 1 and 11");
            }
        }
        //select class
        switch (choice) {
            case 1 -> BankAccount.main(new String[0]);
            case 2 -> CheckLarger.main(new String[0]);
            case 3 -> CoordinateSlope.main(new String[0]);
            case 4 -> EvenOrOdd.main(new String[0]);
            case 5 -> FractionReduction.main(new String[0]);
            case 6 -> IsPositive.main(new String[0]);
            case 7 -> LeapYearCheck.main(new String[0]);
            case 8 -> SignCheck.main(new String[0]);
            case 9 -> StandardQuadratics.main(new String[0]);
            case 10 -> SubtractionQuiz.main(new String[0]);
            case 11 -> VoterEligible.main(new String[0]);
        }
    }
}

