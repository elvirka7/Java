package day10_NestedIf;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");
        }
        sc.close();
    }
}
/*
Passed: score more than 60
Failed: score less than 60
Score range is 0 - 100
 */