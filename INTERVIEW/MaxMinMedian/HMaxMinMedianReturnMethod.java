package MaxMinMedian;

import java.util.Arrays;

public class HMaxMinMedianReturnMethod {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] newArray = maxMinMed(numbers);

        System.out.println("Maximum number = "+newArray[0]);
        System.out.println("Minimum number = "+newArray[1]);
        System.out.println("Median number = "+newArray[2]);
    }

    public static int[] maxMinMed(int[] array) {
        int[] result = new int[3];
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int each : array) {
            if (max < each) {
                max = each;
            } else if (min > each) {
                min = each;
            }
            sum += each;
        }
        int median = sum / array.length;
        result[0] = max;
        result[1] = min;
        result[2] = median;

        return result;
    }
}
