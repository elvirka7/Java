package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte gradeLevel = sc.nextByte();
        String schoolType = "";

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            schoolType = "Elementary School";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            schoolType = "Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            schoolType = "High School";
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            schoolType = "College";
        } else if (gradeLevel == 17 || gradeLevel == 18) {
            schoolType = "Grad SChool";
        } else {
            schoolType = "Invalid grade level";
        }
        System.out.println(schoolType);

        sc.close();

    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
 */
