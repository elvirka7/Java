package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int min = 214748364;  //smallest integer we can assign to a variable

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }

        }
        System.out.println(min);


    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number.
 */