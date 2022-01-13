package day09_IfStatements;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        boolean n1min = n1 < n2;
        boolean n2min = n2 < n1;
        boolean equal = n1 == n2;

        if (n1min) {
            System.out.println(n1 + " is the minimum number");
        }
        if (n2min) {
            System.out.println(n2 + " is the minimum number");
        }
        if (equal) {
            System.out.println("Equal");
        }
    sc.close();
    }
}
/*
 Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */