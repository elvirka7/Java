package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the radius of a circle");
        double radius = sc.nextDouble();

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;

        System.out.println("Perimeter of a circle: "+perimeter);
        System.out.println("Area of a circle: "+area);

        sc.close();

    }
}
/*
Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */