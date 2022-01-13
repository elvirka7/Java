package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPositiveNumber = number > 0;
        boolean isNegativeNumber = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isPositiveNumber + "\n" +
                number + " is negative number: " + isNegativeNumber + "\n" +
                number + " is zero: " + isZero);

        sc.close();
    }
}
/*
Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */