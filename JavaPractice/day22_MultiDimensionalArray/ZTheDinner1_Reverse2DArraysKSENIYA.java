package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ZTheDinner1_Reverse2DArraysKSENIYA {

    public static void main(String[] args) {
        int [][] array2D = { {1,2,3}, {4,5,6}};
        int[][] reversed = new int [array2D.length][array2D[0].length];

        for (int j = 0; j < array2D.length; j++) {
            for (int i = 0 ; i < array2D[j].length; i++) {
                reversed[j][i]  = array2D[array2D.length-1-j][array2D[j].length-1-i];
            }
            System.out.println(Arrays.deepToString(reversed));
        }
        System.out.println();

    }
}