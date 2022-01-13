package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of cents");
        int cents = input.nextInt();
        input.close();

        int dollars = cents / 100;
        int centsRemaining = cents % 100;   // or: cents = cents - (dollar * 100)
        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + centsRemaining + " cents");


    }
}
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */