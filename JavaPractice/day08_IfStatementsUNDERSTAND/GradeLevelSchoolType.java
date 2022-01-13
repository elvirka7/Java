package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class GradeLevelSchoolType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte gradeLevel = sc.nextByte();

        boolean elementarySchool = gradeLevel >= 1 && gradeLevel <= 5,
                middleSchool = gradeLevel >= 6 && gradeLevel <= 8,
                highSchool = gradeLevel >= 9 && gradeLevel <= 12,
                college = gradeLevel >= 13 && gradeLevel <= 16,
                gradSchool = gradeLevel >= 16 && gradeLevel <= 18;

        if (gradeLevel >= 1 && gradeLevel <= 18) {
            if (elementarySchool) {
                System.out.println("Elementary school");
            }
            if (middleSchool) {
                System.out.println("Middle school");
            }
            if (highSchool) {
                System.out.println("High school");
            }
            if (college) {
                System.out.println("College");
            }
            if (gradSchool) {
                System.out.println("Grad School");
            }
        } else {
            System.out.println("Please enter number 1 to 18");
        }

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

            Assume that the given number is 1 ~ 18
 */