package prog;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class FibonacciArray {
    public static BigInteger[] Fibonacci(int x){
        BigInteger[] fibArray = new BigInteger[x];
        fibArray[0] = BigInteger.valueOf(0);
        fibArray[1] = BigInteger.valueOf(1);
        for (int i=2; i<=(x-1); i++){
        fibArray[i] = fibArray[i-1].add(fibArray[i-2]);
        }
        return fibArray;
    }

    public static void main(String[] args){

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the length for this fibonacci sequence:");
        int length = input.nextInt();
        input.close();

        //invalid length
        if (length < 2){
            System.out.println("Please use a length of at least 2");
            System.exit(1);
        }
        //get array
        String myArray = Arrays.toString(Fibonacci(length));

        //print array
        System.out.println(myArray);
    }
}
