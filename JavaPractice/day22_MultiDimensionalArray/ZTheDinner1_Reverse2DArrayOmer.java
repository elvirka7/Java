
package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ZTheDinner1_Reverse2DArrayOmer {
    public static void main(String[] args) {

        int array [][]= {{1,2,3 }, {4, 5, 6}};
        int array2[][] = new int[array.length][array[0].length];

        for (int i = 0, j = array.length-1; i < array.length && j >= 0; i++, j--) {

            for (int a = 0, b = array[i].length - 1; a < array[i].length && b >= 0; a++, b--) {

              array2[i][a] = array[j][b];
            }
        }

        System.out.println(Arrays.deepToString(array2));
    }
}
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */