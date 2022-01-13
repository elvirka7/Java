package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZTheDinner3_MathOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch =='*' || ch=='/')) {
            System.out.println("Invalid Operator, Please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch == '+') ? num1 + num2 :(ch=='-')? num1 - num2 :(ch=='*')? num1*num2 : num1/num2);

        scan.close();
    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, )

 */