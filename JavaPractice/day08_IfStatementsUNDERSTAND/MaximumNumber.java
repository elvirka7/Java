package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        boolean n1max = n1 > n2;
        boolean n2max = n2 > n1;
        boolean equal = n1 == n2;

        if (n1max) {
            System.out.println(n1 + " is the maximum number");
        }
        if (n2max) {
            System.out.println(n2 + " is the maximum number");
        }
        if (equal) {
            System.out.println("Equal");
        }

        sc.close();
    }
}
/*
Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
 */