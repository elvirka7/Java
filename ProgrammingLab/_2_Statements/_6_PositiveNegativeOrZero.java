package _2_Statements;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _6_PositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result;
        //Write your code here:

        if (num > 0) {
            result = "positive";
        } else if (num < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        System.out.println(result);

        s.close();
    }
}
/*
Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:

num  = 1

positive
num  = 1

positive
num = -6

negative
num = -6

negative
num = 0

zero
 */