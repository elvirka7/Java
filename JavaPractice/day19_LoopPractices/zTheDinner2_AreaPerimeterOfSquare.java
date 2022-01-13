package day19_LoopPractices;

import java.util.Scanner;

public class zTheDinner2_AreaPerimeterOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square:");
            double side = sc.nextDouble();
            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area = side * side;
            double perimeter = 4 * side;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            String answer = sc.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re-enter");
                answer = sc.next().toLowerCase();

            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo calculator");
                break;
            }

        }
        sc.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */