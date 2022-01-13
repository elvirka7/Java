package day20_ArraysREPEAT;

import java.util.Arrays;

public class zTheDinner5_ReverseIntegers {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5};
        int [] reverseArray = new int[number.length];

        for (int i = 0, j=number.length-1; i < number.length; i++, j--) {

            reverseArray[i] = number[j];
        }
        System.out.println("Numbers: "+ Arrays.toString(number));
        System.out.println("Reversed numers: "+Arrays.toString(reverseArray));
    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */