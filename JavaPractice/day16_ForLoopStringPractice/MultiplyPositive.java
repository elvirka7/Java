package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplyPositive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int n1 = input.nextInt();

        System.out.println("Enter a positive number");
        int n2 = input.nextInt();

        int sum = 0;


        if (n1 > 0 && n2 > 0) {
            for (int i = 0; i < n1; i++) {
                sum += n2;
            } System.out.println(sum);
        }  else {
            System.out.println("invalid");
        }

            input.close();
        }
    }
/*
Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */
