package day19_LoopPractices;

import java.util.Scanner;

public class zTheDinner3_AreaPerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Enter the length of the Rectangle");
            int length = sc.nextInt();
            if (length <=0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter width of the Rectangle");
            int width = sc.nextInt();
            if (width <=0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Area of rectangle: " +width*length+ "\nPerimeter of rectangle: "+2*(width*length));
            System.out.println("\nWould you like to calculate another Rectangle?");
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
Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */