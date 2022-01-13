package practice_12_22_2021;

import java.util.Arrays;

public class ArrayQuestion {

    public static void main(String[] args) {

        int[] nums= new int [5];

        int a= 5;

        nums[2] = a--; // 5
        nums[0]= a *2; // 8
        nums[4]= --a +(a-9); // 3+ (-6) = -3
        nums[1]= nums[2]; // 5
        nums[3]= nums[a-3];//nums[0]=8
        System.out.print(Arrays.toString(nums));

    }
}
