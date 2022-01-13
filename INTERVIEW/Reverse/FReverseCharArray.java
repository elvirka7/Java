package Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class FReverseCharArray {
    public static void main(String[] args) {

        // OPTION 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int n = sc.nextInt();   //input the length of the array
        char[] array = new char[n];


        /*
        OPTION 2
        char [] array = { 'a', 'b', 'c', 'd', 'e' };

        OPTION 3
        char [] array = new char[5];
        array[0] = 'a';
        array[1] = 'b';
        array[2] = 'c';
        array[3] = 'd';
        array[4] = 'e';
     */



        int index=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a character");
           array[index++] =  sc.next().charAt(0);  //assign characters to each index of array
        }

        char[] reversedArray = new char[array.length];  //create reversed array
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
         reversedArray[j++] = array[i];
        }

        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Reversed Array " + Arrays.toString(reversedArray));

    }
}
