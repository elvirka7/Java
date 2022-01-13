package MaxMinMedian;

import java.util.Scanner;

public class AMaxMinMedianTwoNumbers {
    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        int sum = a + b;
        int median = sum / 2;

        if (a > b) {
            System.out.println(a + " is maximum");
        } else if (b > a) {
            System.out.println(b + " is minimum ");
        } else {
            System.out.println(a + " and " + b + " are equal");
        }

        System.out.println("Sum is of "+a+" and "+b+" is " + sum + "\nMedian is " + median);


    }
}
