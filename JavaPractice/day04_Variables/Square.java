package day04_Variables;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side = sc.nextDouble();
        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Are of Square = " + areaOfSquare +
                "\nPerimeterOfSquare = " + perimeterOfSquare);

        sc.close();
    }
}
/*
 Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side

                        area = side * side;
                        perimeter = 4 * side
 */

