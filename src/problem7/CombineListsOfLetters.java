package problem7;

import java.util.*;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        /*Write a program that reads two lists of letters l1 and l2
          and combines them: appends all letters c from l2 to the end
          of l1, but only when c does not appear in l1. Print the obtained
          combined list. All lists are given as sequence of letters separated
          by a single space, each at a separate line. Use ArrayList<Character>
          of chars to keep the input and output lists.*/

        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split("\\W+");
        ArrayList<Character> inputListOne = new ArrayList<>();
        /*fill the first list with the first input line*/
        for (int i = 0; i < firstLine.length; i++) {
            inputListOne.add(firstLine[i].charAt(0));
        }

        String[] secondLine = scan.nextLine().split("\\W+");
        ArrayList<Character> inputListTwo = new ArrayList<>();
        /*fill the second list with the second input line*/
        for (int i = 0; i < secondLine.length; i++) {
            inputListTwo.add(secondLine[i].charAt(0));
        }

        ArrayList<Character> outputList = new ArrayList<>();
        /* fill the output list with the characters from the first input line*/
        for (int i = 0; i < inputListOne.size(); i++) {
            outputList.add(inputListOne.get(i));
        }
        /*check if the first lne contains the character from the second line
        * if not, add them to the output*/
        for (int i = 0; i < inputListTwo.size(); i++) {
            if (!inputListOne.contains(inputListTwo.get(i))) {
                outputList.add(inputListTwo.get(i));
            }
        }
        for (Character symbol : outputList) {
            System.out.print(symbol + " ");
        }
        System.out.println();

    }
}
