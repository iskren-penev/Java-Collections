package problem4;

import java.util.*;
import java.util.stream.Collectors;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        /*Write a program to find all increasing sequences inside an array of integers.
         The integers are given in a single line, separated by a space. Print the sequences
         in the order of their appearance in the input array, each at a single line. Separate
         the sequence elements by a space. Find also the longest increasing sequence and
         print it at the last line. If several sequences have the same longest length, print
         the leftmost of them.  */

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String sequence = numbers.get(0).toString() + " " ;
        String longest = sequence;
        int counter = 1;
        int maxCount = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size()-1) {
                if (numbers.get(i+1) > numbers.get(i)){
                    sequence += numbers.get(i+1).toString() + " ";
                    counter++;
                } else {
                    System.out.println(sequence);
                    sequence = numbers.get(i+1).toString() + " ";
                    counter =1;
                }
                if (counter > maxCount){
                    longest = sequence;
                    maxCount= counter;
                }
            } else {
                    System.out.println(sequence);
            }
        }
        System.out.println("Longest: " + longest);
    }
}
