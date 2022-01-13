package Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class DReverseIntegerArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of an array");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
            array[i] = sc.nextInt();
        }

        int[] reversedArray = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j++] = array[i];
        }

        /* OR for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
         */
        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Reversed Array " + Arrays.toString(reversedArray));


    }
}
