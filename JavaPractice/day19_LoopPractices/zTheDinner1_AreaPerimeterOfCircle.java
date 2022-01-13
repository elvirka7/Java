package day19_LoopPractices;

import java.util.Scanner;

public class zTheDinner1_AreaPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer = "";

        while (true) {
            System.out.println("Enter the radius of the circle");
            double radius = sc.nextInt();
            if (!(radius > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("diameter = :" + 2 * radius);
            System.out.println("area = :" + Math.PI * radius * radius);
            System.out.println("perimeter = :" + 2 * Math.PI * radius);

            System.out.println("Would you like to calculate another circle?");
            answer = sc.next();


            while (!(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes"))) {
                System.err.println("Invalid entry, please re-enter");
                answer = sc.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }
        sc.close();

    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */