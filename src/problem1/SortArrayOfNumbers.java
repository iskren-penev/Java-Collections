package problem1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {

        //Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[].
        //
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbArr = new int[n];
        for (int i = 0; i < n; i++) {
            numbArr[i] = scan.nextInt();
        }
        Arrays.sort(numbArr);
        for (Integer number : numbArr){
            System.out.print(number + " " );
        }
        System.out.println();
    }
}
