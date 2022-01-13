package day24_CustomMethods_Return;

import java.util.Arrays;

public class TheDinner1_ReturnMethods {
    public static void main(String[] args) {

        String str = "AAAABCCCCCD";
        str = removeDuplicateCharacters(str);
        System.out.println("Characters after duplicates have been removed: " + str);

        int[] numbers = {1, 2, 3, 8, 4, 5, 6};
        int max = maxNumberFromArray(numbers);
        System.out.println("Maximum number in an array: " + max);

        int min = minNumberFromArray(numbers);
        System.out.println("Minimum number in an array: " + min);

        String[] names = {"Marlen", "Altynai", "Adil"};
        String[] reversedOrderNames = reversedArray(names);
        System.out.println(Arrays.toString(reversedOrderNames));

        String[] parents = {"Grant", "Elvira"};
        String[] children = {"Kai", "Alia"};
        String[] family = mergedArray(parents, children);
        System.out.println(Arrays.toString(family));


    }

    public static String removeDuplicateCharacters(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;

    }
    public static int maxNumberFromArray(int[] arrayOfNumbers) {
        int max = arrayOfNumbers[0];
        for (int number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
    public static int minNumberFromArray(int[] arrayOfNumbers) {
        int min = arrayOfNumbers[0];
        for (int number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
    public static String[] reversedArray(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
    public static String[] mergedArray(String[] arr1, String[] arr2) {
        String[] mergedArray = new String[arr1.length + arr2.length];
        int newIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[newIndex++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[newIndex++] = arr2[i];
        }
        return mergedArray;


    }

}

/*
Task:
    1. create a method that can remove duplicated characters from a string and returns the new value

    2. create a method that can return the maximum number from an array of integers

    3. create a method that can return the minimum number from an array of integers

    4. create a method that return the reversed array

    5. create a method that can merge two arrays and return
 the new array
 */