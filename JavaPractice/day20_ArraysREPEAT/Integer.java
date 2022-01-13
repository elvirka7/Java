package day20_ArraysREPEAT;

import java.util.Arrays;

public class Integer {
    public static void main(String[] args) {



        int [] numbers = {10, 20, 50, 70};  //size is 4, //store the elements: 10, 20, 50, 70

        System.out.println("Third element in array is: "+numbers[numbers.length-2]); // print 3rd element

        System.out.println(Arrays.toString(numbers)); // print all elements

        System.out.println("\n==========");



        int[] scores = new int[5];  // create a variable that contains 5 scores

        System.out.println(scores[4]);


    }
}
