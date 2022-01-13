package day22_MultiDimensionalArray;

public class ZLunch2_OddEvenArray2D {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7}};

        int min = numbers[0][0];
        int max = numbers[0][0];

        int countOdd = 0;
        int countEven = 0;
        for (int[] number : numbers) {

            for (int i : number) {
                if (i % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }


        }

        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);

    }
}

/*
Write a program that can find the minimum and maximum numbers from a two dimensional array
 */