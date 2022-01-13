package _2_Statements;

import java.util.Scanner;

public class _7_TernaryOperator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();


        String result = (x >= 5) ? x + " is greater than 5" : String.valueOf(-x);
        System.out.println(result);
        sc.close();
    }
}
/*
Write an expression using the conditional operator (? :)
that compares the value of the variable x to 5 and results in:

1. Ask the user to enter a number and assign it to a variable x (int)
2. Display x if x is greater than or equal to 5 Display -x if x is less than 5

Ex:
  Enter a Number
  10

output:
   10 is greater than 5
 */