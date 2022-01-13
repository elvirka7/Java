package day04_Variables;


import java.util.Scanner;

public class GallonsToLiters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount of gallons");
        int gallons = sc.nextInt();

        double liters = gallons * 3.79;
        System.out.println("1 gallon = 3.79 liters " +
                "\ngallon: " + gallons +
                "\nliters: " + liters);
        sc.close();
    }
}

/*
5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
 */