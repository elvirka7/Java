package day20_ArraysREPEAT;

import java.util.Arrays;
import java.util.Scanner;

public class zLunch3_Number10Times {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number");
            number[i] = sc.nextInt();
        }
            int max = number[0];
            int min=number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] <min) {
                min = number[i];
            } else if(number[i]>max) {
                max = number[i];
            }
        }


        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("number = " + Arrays.toString(number));
    }
}
/*
Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
 */
