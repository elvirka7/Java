package _6_MethodsTODO;

import java.util.Scanner;

public class _6_6MethodsPrintUniqueNumbers_FINISH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);

    }

    public static void printUniqueNumbers(int[] nums) {
        for (int each : nums) {
            int count = 0;
            for (int n : nums) {
                if (each == n) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}
/*
Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints. Every single unique int should be printed from the new line.
`Example:`
`input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
`output:`
`2`
`9`
`34`
 */