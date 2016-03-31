package problem8;

import java.util.*;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        /*At the first line at the console you are given a piece of text.
         Extract all words from it and print them in alphabetical order.
         Consider each non-letter character as word separator.
         Take the repeating words only once. Ignore the character casing.
         Print the result words in a single line, separated by spaces.*/

        Scanner scan = new Scanner(System.in);
        /* split by anything that is not a letter */
        String[] input = scan.nextLine().toLowerCase().split("\\W+");

        TreeSet<String> outputSet = new TreeSet<>();
        /* fill the set with the words from the input */
        for (int i = 0; i < input.length; i++) {
            if (!outputSet.contains(input[i])){
                outputSet.add(input[i]);
            }
        }
        for (String word: outputSet) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
