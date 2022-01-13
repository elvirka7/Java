package _2_Statements;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _2_HappyValleySchoolSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("Enter age:");
        int n = sc.nextInt();


        if (n >= 0) {
            if (n < 2) {
                result = "ineligible";
            } else if (n == 2) {
                result = "toddler";
            } else if (n >= 3 && n <= 5) {
                result = "early childhood";
            } else if (n == 6 || n == 7) {
                result = "young reader";
            } else if (n >= 8 && n <= 10) {
                result = "elementary";
            } else if (n == 11 || n == 12) {
                result = "middle";
            } else if (n == 13) {
                result = "impossible";
            } else if (n >= 14 && n <= 16) {
                result = "high school";
            } else if (n == 17 || n == 18) {
                result = "scholar";
            } else {
                result = "ineligible";
            }
            System.out.println(result);
        }

        sc.close();
    }
}
/*
In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
copied!
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
Given age print out the category the student would fall under

Example:

Enter age:
8

elementary
 */