package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your score");
        int score = sc.nextInt();
        sc.close();

        String message = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                message = "Your grade is: A";
            } else if (score >= 80) {
                message = "Your grade is: B";
            } else if (score >= 70) {
                message = "Your grade is: C";
            } else if (score >= 60) {
                message = "Your grade is: D";
            } else {
                message = "Your grade is: F";
            }
            System.out.println(message);

        } else {
            System.out.println("Invalid score");
        }

    }
}
/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */