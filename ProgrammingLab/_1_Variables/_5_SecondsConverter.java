package _1_Variables;

import java.util.Scanner;

public class _5_SecondsConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner sc = new Scanner(System.in);
        int hours, minutes, seconds;

        System.out.println("Enter seconds:");
        int inputSeconds = sc.nextInt();


        hours = inputSeconds / 3600;
        minutes = inputSeconds %3600/ 60;
        seconds = inputSeconds % 3600 %60;

        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");


        sc.close();

    }
}
/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */