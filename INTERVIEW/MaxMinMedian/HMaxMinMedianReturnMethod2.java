package MaxMinMedian;

import java.util.Arrays;

public class HMaxMinMedianReturnMethod2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        int maxNumber = maximum(numbers);
        System.out.println("maxNumber = " + maxNumber);
        
        int minNumber = minimum(numbers);
        System.out.println("minNumber = " + minNumber);
        
        int medNumber = median(numbers);
        System.out.println("medNumber = " + medNumber);
    }
    public static int maximum(int [] array){
        int max = array[0];
        for (int each : array) {
            if(max<each){
                max=each;
            }
        }
        return max;
    }

    public static int minimum(int [] array){
        int min = array[0];
        for (int each : array) {
            if(min>each){
                min=each;
            }
        }
        return min;
    }

    public static int median(int [] array){
        int sum=0;
        for (int each : array) {
            sum+=each;
            }
        int median = sum/array.length;
        
        return median;
    }
}
