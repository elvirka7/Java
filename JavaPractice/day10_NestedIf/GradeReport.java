package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your score");
        int score = sc.nextInt();

        String message="";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                message = "Score is " + score + ": Excellent";
            } else if (score >= 80) {
                message = "Score is " + score + ": Great";
            } else if (score >= 70) {
                message = "Score is " + score + ": Good";
            } else if (score >= 60) {
                message = "Score is " + score + ": Passed";
            } else {
                message = "Score is " + score + ": Failed";
            }
            System.out.println(message);

        } else {
            System.out.println("Invalid score");
        }

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