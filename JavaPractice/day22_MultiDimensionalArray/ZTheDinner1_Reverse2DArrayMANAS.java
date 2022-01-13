package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ZTheDinner1_Reverse2DArrayMANAS {
    public static void main(String[] args) {

        int[][] array = {{1, 2}, {4, 5, 6}};
        int[][] reversed = new int[array.length][];

        for (int i = 0; i < array.length; i++) {

            int[] elements = new int[array[i].length];

            for (int j = 0; j < array[i].length; j++) {
                elements[(elements.length - 1) - j] = array[i][j];
            }
            reversed[(array.length - 1) - i] = elements;
        }
        System.out.println(Arrays.deepToString(reversed));
    }
}
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */