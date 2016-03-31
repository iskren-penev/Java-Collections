package problem2;


import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        /* Write a program that enters an array of strings and finds in it all sequences of equal elements. The input strings are given as a single line, separated by a space. */

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String temp = "";
        int counter = 1;
        for (int i = 1; i < input.length; i++) {
            temp = input[i - 1];
            if (i == input.length - 1) {
                if (temp.equals(input[i])) {
                    for (int j = 0; j < counter; j++) {
                        System.out.print(temp + " ");
                    }
                    System.out.print(input[i]);
                } else {
                    for (int j = 0; j < counter; j++) {
                        System.out.print(temp + " ");
                    }
                    System.out.println();
                    System.out.print(input[i]);
                }

            } else if (i != input.length - 1){
                if (temp.equals(input[i])) {
                    counter++;
                    continue;
                } else {
                    for (int j = 0; j < counter; j++) {
                        System.out.print(temp + " ");
                    }
                    counter = 1;
                }
            }
            System.out.println();
        }
    }
}
