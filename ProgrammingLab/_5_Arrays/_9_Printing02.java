package _5_Arrays;

import java.util.Scanner;

public class _9_Printing02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }

        // DO NOT TOUCH ABOVE
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", " + arr[i + 1]);
            i++;
        }
        input.close();
    }
}
/*
he code provided in your main method will take in eight Strings and save them into an array arr.

Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]

Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
 */