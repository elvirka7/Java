package _2_Statements;

import javax.management.StringValueExp;
import java.util.Scanner;

public class _8_TernaryOperator2 {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        //WRITE YOUR CODE HERE:
        String result = (num1 > num2) ? String.valueOf(num1) : (num2 > num1) ? String.valueOf(num2) : "equal";
        System.out.println(result);
        scan.close();
    }
}
/*
Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2. The result (that is the value) of this expression should be the value of the larger of the two variables. The larger value should be printed out.

Ex:
  Enter number1:
  10
  Enter number2:
  20

output:
  20
 */