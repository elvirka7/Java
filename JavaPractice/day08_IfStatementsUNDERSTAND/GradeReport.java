package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String message = "";


        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                message = "Excellent";
            } else if (score >= 80) {
                message = "Great";
            } else if (score >= 70) {
                message = "Good";
            } else if (score >= 60) {
                message = "Passed";
            } else {
                message = "Failed";
            }

        } else {
            message = "Please enter number between 0 and 100";
        }
        System.out.println(message);

        sc.close();

    }
}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed

 */