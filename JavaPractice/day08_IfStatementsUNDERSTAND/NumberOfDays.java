package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean has28Days = number == 2,
                has30Days = number == 4 || number == 6 || number == 9 || number == 11,
                has31Days = !has28Days && !has30Days;


        if (number >= 1 && number <= 12) {
            if (has28Days) {
                System.out.println("28 days");
            }

            if (has30Days) {
                System.out.println("30 days");
            }

            if (has31Days) {
                System.out.println("31 days");
            }
        } else {
            System.out.println("Pleas enter number 1 to 12");
        }

        sc.close();
    }
}

/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */