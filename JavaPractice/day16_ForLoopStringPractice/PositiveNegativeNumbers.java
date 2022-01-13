package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int posNum = 0;
        int negNum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int n = input.nextInt();

            if (n >= 0) {
                ++posNum;
            } else if (n < 0) {
                ++negNum;
            } else {

            }
        }
        System.out.println(posNum + " positive and " + negNum + " negative");
        input.close();
    }
}
/*
 Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */