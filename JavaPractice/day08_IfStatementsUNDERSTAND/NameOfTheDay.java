package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean monday = num == 1,
                tuesday = num == 2,
                wednesday = num == 3,
                thursday = num == 4,
                friday = num == 5,
                saturday = num == 6,
                sunday = num == 7;

        if (num >= 1 && num <= 7) {
            if (monday) {
                System.out.println("Monday");
            }
            if (tuesday) {
                System.out.println("Tuesday");
            }
            if (wednesday) {
                System.out.println("Wednesday");
            }
            if (thursday) {
                System.out.println("Thursday");
            }
            if (friday) {
                System.out.println("Friday");
            }
            if (saturday) {
                System.out.println("Saturday");
            }
            if (sunday) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Please enter number 1 and 7");
        }

        sc.close();
    }
}
/*
Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7
 */