package day09_IfStatements;

import java.util.Scanner;

public class EligibleAlcohol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = sc.nextInt();
        String eligiblity="";

        if (age > 0) {
            if (age >= 21) {
                eligiblity = "Eligible";
            } else {
                eligiblity = "Ineligible";
            }

            System.out.println(eligiblity);
        } else {
            System.out.println("Age has to be a positive number");
        }

    sc.close();
    }
}
/*
Write a program that can check if the person is eligible to buy alcohol
 */