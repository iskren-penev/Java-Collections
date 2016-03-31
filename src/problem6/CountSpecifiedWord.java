package problem6;

import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        /* Write a program to find how many times a word appears in given text.
           The text is given at the first input line. The target word is given
           at the second input line. The output is an integer number. Please ignore
           the character casing. Consider that any non-letter character is a word separator.*/

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toLowerCase().split("\\W+");
        String pattern = scan.nextLine();
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(pattern)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
