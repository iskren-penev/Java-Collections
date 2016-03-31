package problem10;

import java.util.*;
import java.util.stream.Collectors;

public class CardsFrequencies {
    public static void main(String[] args) {
        /* We are given a sequence of N playing cards from a standard deck.
         The input consists of several cards (face + suit), separated by a space.
         Write a program to calculate and print at the console the frequency of
         each card face in format "card_face -> frequency". The frequency is calculated
         by the formula appearances / N and is expressed in percentages with exactly 2
         digits after the decimal point. The card faces with their frequency should be
         printed in the order of the card face's first appearance in the input. The same card
         can appear multiple times in the input, but it's face should be listed only once in the output.*/

        Scanner scan = new Scanner(System.in);
        /* split by whitespace */
        String[] input = scan.nextLine().split("\\s+");

        /* filter the suits */
        ArrayList<String> filteredInput = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String temp = "";
            for (int j = 0; j < input[i].length() - 1; j++) {
                temp += input[i].charAt(j);
            }
            filteredInput.add(temp);
        }
        List<String> uniqueInput = filteredInput.stream().distinct().collect(Collectors.toList());
        /* create a frequency variable */
        double frequency = 0;
        /* calculate and print the frequency of each unique card */
        for (int i = 0; i < uniqueInput.size(); i++) {
            frequency = 100 * ((double) Collections.frequency(filteredInput, filteredInput.get(i))
                    / (double) filteredInput.size());
            System.out.printf("%s -> %.2f", filteredInput.get(i), frequency);
            System.out.println("%");
        }
    }
}
