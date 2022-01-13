package day20_ArraysREPEAT;

import java.util.Arrays;

public class zLunch2_Numbers100to1 {
    public static void main(String[] args) {

        int [] numbers = new int[100];
        for (int i = numbers.length-1; i >=0; i--) {
            numbers[i] = i+1;
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        System.out.print(Arrays.toString(numbers));
    }
}
/*
create an array that has the numbers 100 to 1
 */