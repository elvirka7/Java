package _2_Statements;

import java.util.Scanner;

public class _16_FindMidNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        sc.close();

        int min = (num1<num2 && num1<num3)? num1 :(num2<num1 && num2<num3)? num2 : num3;
        int max = (num1>num2 && num1>num3)? num1 :(num2>num1 && num2>num3)? num2 : num3;
        int med = (min!=num1 && max!=num1)? num1 :(min!=num2 && max!=num2)? num2 : num3;

        System.out.println("Medium value is: "+med);

    }
}
/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

1. Create an object of Scanner class.

2. Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34
 */