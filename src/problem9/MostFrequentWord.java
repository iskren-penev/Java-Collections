package problem9;

import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        /*Write a program to find the most frequent word in a text and print it,
         as well as how many times it appears in format "word -> count".
         Consider any non-letter character as a word separator.
         Ignore the character casing. If several words have the same maximal frequency,
         print all of them in alphabetical order.*/

        Scanner scan = new Scanner(System.in);

        /* split by anything that is not a letter */
        String[] input = scan.nextLine().toLowerCase().split("\\W+");
        ArrayList<String> inputList = new ArrayList<>();
        /* fill the list with unique words from the input */
        for (int i = 0; i < input.length; i++) {
            if (!inputList.contains(input[i])) {
                inputList.add(input[i]);
            }
        }
        /* counter for each unique word in the input*/
        int[] counter = new int[inputList.size()];
        int maxCounter = 0;
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < input.length; j++) {
                if (inputList.get(i).equals(input[j].toLowerCase())) {
                    counter[i]++;
                }
            }
        }

        /* check which counter has the greatest value */
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCounter) {
                maxCounter = counter[i];
            }
        }
        /* print the most frequent word and the value of its counter
        if more than 1 word has the maximum value - print them all */
        for (int i = 0; i < inputList.size(); i++) {
            if (counter[i] > 1 && counter[i] == maxCounter) {
                System.out.println(inputList.get(i) + " -> " + counter[i] + " times");
            }
        }
    }
}
