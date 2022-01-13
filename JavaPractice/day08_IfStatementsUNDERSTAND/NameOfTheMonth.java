package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String month = "";

        if (number >= 1 && number <= 12) {

            if (number == 1) {
                month = "January";
            } else if (number == 2) {
                month = "February";
            } else if (number == 3) {
                month = "March";
            } else if (number == 4) {
                month = "April";
            } else if (number == 5) {
                month = "May";
            } else if (number == 6) {
                month = "June";
            } else if (number == 7) {
                month = "July";
            } else if (number == 8) {
                month = "August";
            } else if (number == 9) {
                month = "September";
            } else if (number == 10) {
                month = "October";
            } else if (number == 11) {
                month = "November";
            } else if (number == 12) {
                month = "December";
            } else {
                month = "Invalid month";
            }
            System.out.println(month);
        } else {
            System.out.println("Please enter numbers 1 to 12");
        }

        sc.close();

    }
}
/*
Create a class called NameOfTheMonth, write a program that can display the name of the month

            number = 1 ~ 12
 */
