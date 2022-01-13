package day09_IfStatements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer number");
        int number = sc.nextInt();
        String message = "";

        if (number % 3 == 0 && number % 5 == 0) {
            message = "FizzBuzz";
        } else if (number % 3 == 0) {
            message = "Fizz";
        } else if (number % 5 == 0) {
            message = "Buzz";
        } else {
            System.out.println(number + " is not divisible by 3 or 5");
        }
        System.out.println(message);

        sc.close();

        /*
         FIRST OPTION
         Very important to keep the correct order, only if both are not divisible is false, than others will work.

         ANOTHER OPTION
         if (num % 3 > 0 && num % 5 > 0) {
            System.out.println("Not divisible by 3 and 5");
         */
    }
}


/*
Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz

 */
