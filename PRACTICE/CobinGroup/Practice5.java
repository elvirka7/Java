package CobinGroup;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7, 4, 6, 2};

        System.out.println(Arrays.toString(makeEnds(arr1)));
        System.out.println(Arrays.toString(makeEnds(arr2)));
        System.out.println(Arrays.toString(makeEnds(arr3)));

    }

    public static int[] makeEnds(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[array.length - 1];
        return result;

    }
}
