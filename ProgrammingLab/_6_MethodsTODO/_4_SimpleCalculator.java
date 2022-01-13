package _6_MethodsTODO;

import java.util.Scanner;

public class _4_SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus() {

        //your code here
        System.out.println("enter first number:");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println("enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("result: " + sum);
        sc.close();

    }

}
/*
Implement the plus method. The return type is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */