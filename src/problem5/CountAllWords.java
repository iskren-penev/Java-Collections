package problem5;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        /* Write a program to count the number of words in given sentence.
           Use any non-letter character as word separator.*/

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        System.out.println(input.length);
    }
}
