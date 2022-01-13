package day10_NestedIf;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String message = "";

        if (age > 0 && age <= 150) {
            if (age < 21) {
                message = "Teenager";
            } else if (age < 55) {
                message = "Adult";
            } else {
                message = "Senior";
            }
        } else {
            message = "Invalid age";
        }
        System.out.println(message);

        sc.close();
    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */