package problem11;

import java.util.*;

public class ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        /*Binary search is an algorithm that works on already sorted arrays.
        Basically, it goes to the middle element and checks it has to continue
        searching to the left, or to the right. Return the index of the element,
        or -1, if the element is not found.*/
        Scanner scan = new Scanner(System.in);
        int target = Integer.parseInt(scan.nextLine());
        String[] line = scan.nextLine().split("\\s+");
        /*Create a Set and Array to check if there are numbers, that appear more tham once*/
        TreeSet<Integer> numbers = new TreeSet<>();
        int[] numbersArray = new int[line.length];

        /*fill the array and the set with the input*/
        for (int i = 0; i < line.length; i++) {
            numbersArray[i] = Integer.parseInt(line[i]);
            numbers.add(Integer.parseInt(line[i]));
        }
        int result = recursiveBinarySearch(numbersArray, 0, numbersArray.length, target);
        /*if all numbers are unique. the result will be the index of the number in the array*/
        if (numbersArray.length == numbers.size()) {
            System.out.println(result);
        } else {
            /*else we find the index of the number in array of unique integers
            * and then add half the size of the original array to determine the number's
            * position there*/
            int[] newNumbArr = new int[numbers.size()];
            int counter = 0;
            for (Integer numb: numbers) {
                newNumbArr[counter] = numb;
                counter++;
            }
            int result2 = recursiveBinarySearch(newNumbArr, 0, newNumbArr.length, target);
            if (result2 == 0) {
                System.out.println(result2);
            } else {
                System.out.println(result2 + (numbersArray.length/2));
            }
        }
    }

    public static int recursiveBinarySearch(int[] arr, int first, int arrSize, int target) {
        if (first < arrSize) {
            int middle = first + (arrSize - first) / 2;
            if (target < arr[middle]) {
                return recursiveBinarySearch(arr, first, middle, target);
            } else if (target > arr[middle]) {
                return recursiveBinarySearch(arr, middle + 1, arrSize, target);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
