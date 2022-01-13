package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZTheDinner2_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num;
            num = sc.nextInt();
            ;
        }
        System.out.println(sum);
        sc.close();
    }
}
/*
 Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */