package day10_NestedIf;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type true if you have ID, false if you don't have ID");
        boolean hasID = sc.nextBoolean();

        if (hasID) {
            System.out.println("Please enter your age");
            int age = sc.nextInt();
            if (age >= 21) {
                System.out.println("Contratulations, you are eligible to buy alcohol");
            } else {
                System.out.println("Sorry, you are not eligible to buy alcohol, you need to be 21 or older");
            }
        } else {
            System.out.println("Sorry, you are not eligible to buy alcohol without an ID");
        }
        sc.close();
    }
}
/*
pre-condition: must have an ID
age 21 or older: eligible to buy alcohol
age younger than 21: not eligible to buy alcohol
 */