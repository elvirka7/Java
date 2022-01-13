package day09_IfStatements;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Month " + month + " has 31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Month " + month + " has 30 days");
        } else if (month == 2) {
            System.out.println("Month " + month + " has 28 days");
        } else {
            System.out.println("Month number can only be 1 to 12");
        }

        sc.close();

    }
}
/*
 Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */
