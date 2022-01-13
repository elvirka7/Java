package day10_NestedIf;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        String message = "";
        if (n > 0 && n <= 18) {
            if (n >= 17) {
                message = "Grad School";
            } else if (n >= 13) {
                message = "College";
            } else if (n >= 9) {
                message = "High School";
            } else if (n >= 6) {
                message = "Middle School";
            } else {
                message = "Elementary School";
            }

        } else {
            message = "Invalid grade level given";
        }
        System.out.println(message);
    sc.close();

    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
