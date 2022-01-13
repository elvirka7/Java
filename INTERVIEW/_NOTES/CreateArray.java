package _NOTES;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {

        //OPTION 1
        int [] array = {1,2, 3,4,5};


        /*
        OPTION 2
        int [] array = new int[5];
        array[0] = 1;
        array[1] = 2
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        OPTION 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of an array");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Please enter a number");
        array[i] = sc.nextInt();
        }
         */

        System.out.println(Arrays.toString(array));
    }
}
