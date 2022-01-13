package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class EvenlyDivisible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean divisibleBy2 = number % 2 == 0,
                divisibleBy3 = number % 3 == 0,
                divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisibleBy2 +
                "\n" + number + " is divisible by 3: " + divisibleBy3 +
                "\n" + number + " is divisible by 5: " + divisibleBy5);

        sc.close();

    }
}
/*
Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */