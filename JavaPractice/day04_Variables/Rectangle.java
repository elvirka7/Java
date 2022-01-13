package day04_Variables;


import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length");
        double length = sc.nextDouble();

        System.out.println("Please enter the width");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length +
                "\nwidth = " + width +
                "\narea = " + area +
                "\nperimeter = " + perimeter);

        sc.close();
    }
}

/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)

 */