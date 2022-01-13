package day22_MultiDimensionalArray;

public class ZLunch1_MinMaxArray {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7}};

        int min = numbers[0][0];
        int max = numbers[0][0];

        for (int[] number : numbers) {

            for (int i : number) {

                if(min>i){
                    min = i;
                } else if(max <i){
                    max = i;
                }

            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
/*
Write a program that can find the minimum and maximum numbers from a two dimensional array
 */