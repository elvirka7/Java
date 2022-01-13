package _2_Statements;

import java.util.Scanner;

public class _4_IfStatementGrades {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        //Write your code here:

        String result = (grade > 0 && grade <= 100) ? (grade <= 60) ? "fail" : (grade <= 70) ? "pass" : (grade <= 90) ? "good" : "excellent" : "invalid grade";
        System.out.println(result);
        s.close();
    }
}
/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
Examples:

93

excellent
93

excellent
46

fail
46

fail
80

good
 */