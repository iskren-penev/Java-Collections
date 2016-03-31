package problem12;

import java.util.Scanner;

public class CalculateNFactoriel {
    public static void main(String[] args) {
        /*Write a program that recursively calculates factorial.*/
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        long factorial = calcFactorial(number);
        System.out.println(factorial);
    }

    public static long calcFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcFactorial(n-1);
    }

}
