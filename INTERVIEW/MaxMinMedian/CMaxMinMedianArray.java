package MaxMinMedian;

import java.util.Arrays;
import java.util.Scanner;

public class CMaxMinMedianArray {
    public static void main(String[] args) {

        System.out.println("Please enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
             array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        int total=0;
        for (int each : array) {
            if(max<each){
                max = each;
            } else if(min>each){
                min = each;
            }
            total+=each;

        }
        int median=total/array.length;
        System.out.println("Array elements are: "+Arrays.toString(array));
        System.out.println("Maximun number in array is "+max+"\nMinimum number in array is "+min+"\nMedian number in array is "+median);

        sc.close();
    }
}
