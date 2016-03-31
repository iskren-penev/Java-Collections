package problem3;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        /* Write a program that enters an array of strings and finds in it the largest
          sequence of equal elements. If several sequences have the same longest length,
          print the leftmost of them. The input strings are given as a single line,
          separated by a space. */

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String sequence = input[0];
        int counter = 1;
        int counterMax = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].equals(input[i])) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > counterMax) {
                counterMax = counter;
                sequence = input[i - 1];
            }
        }
        for (int i = 0; i < counterMax; i++) {
            System.out.print(sequence + " ");
        }
        System.out.println();
    }
}
