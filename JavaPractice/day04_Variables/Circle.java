package day04_Variables;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;

        System.out.println("Please enter the radius");
        double radius = sc.nextDouble();

        double diameter = radius * 2;
        double area = radius * radius * PI;
        double perimeter = diameter * PI;

        System.out.println("radius of the circle: " + radius +
                "\ndiameter of the circle: " + diameter +
                "\narea of the circle: " + area +
                "\nperimeter of the circle: " + perimeter);

        sc.close();
    }
}
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = diameter * PI
 */

