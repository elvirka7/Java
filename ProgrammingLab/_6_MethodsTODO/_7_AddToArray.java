package _6_MethodsTODO;

import java.util.Arrays;
import java.util.Scanner;

public class _7_AddToArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);

    }


    public static void add_to_r(int[] r, int n) {
        //create new array with one more position:

        int[] result = new int[r.length + 1];


        for (int i = 0; i < r.length; i++) {
            result[i] = r[i];
        }
        result[r.length] = n;

        System.out.println(Arrays.toString(result));


        // Do not change those lines

    }
}
/*
add_to_r is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end. Note: The new number is added which means there is a size difference between the two arrays

Example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
