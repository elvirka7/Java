package day18_NestedLoop;

import java.util.Scanner;

public class ZTheDinner3_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number");
            int number1 = sc.nextInt();

            System.out.println("Enter a math operator (+,-,/,*)");
            String mathOperator = sc.next();

            while (!(mathOperator.equals("+") || mathOperator.equals("-") || mathOperator.equals("/") || mathOperator.equals("*"))) {
                System.err.println("Invalid entry, please re-enter the math operator (+,-,/,*)");
                mathOperator = sc.next();
            }
            System.out.println("Enter second number");
            int number2 = sc.nextInt();

            int result = (mathOperator.equals("+")) ? number1 + number2 : (mathOperator.equals("-")) ? number1 - number2 : (mathOperator.equals("/")) ? number1 / number2 : number1 * number2;

            System.out.println(number1 + mathOperator + number2 + "=" + result);


            System.out.println("Do you want to continue");
            String answer = sc.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re-enter yes or no");
                answer = sc.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.err.println("Thank you for using Cydeo calculator!");
                break;
            }
        }

        sc.close();
    }
}




/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */