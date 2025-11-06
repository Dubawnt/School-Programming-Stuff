package prog;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFibonacci {
    public static BigInteger Fibonacci(int x){

        BigInteger fibNum1 = BigInteger.valueOf(0);
        BigInteger fibNum2 = BigInteger.valueOf(1);
        BigInteger fibNumResult = null;
        for (int i=2; i<=(x-1); i++){
            fibNumResult = fibNum1.add(fibNum2);
            fibNum1 = fibNum2;
            fibNum2 = fibNumResult;
        }
        return fibNumResult;
    }

    public static void main(String[] args){

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the target for this fibonacci sequence:");
        int target = input.nextInt();
        input.close();

        //print Fibonacci
        System.out.println(Fibonacci(target));
    }
}