package day08_IfStatementsUNDERSTAND;

import java.util.Scanner;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte age = sc.nextByte();
        String result = "";

        boolean isEligible = age >= 21;

        if (age > 0) {
            if (isEligible) {
                result = "Individuals who are " + age + " years old are eligible to buy cigarettes";
            } else {
                result = "Individuals who are " + age + " years old are not eligible to buy cigarettes";
            }
        } else {
            result = "Invalid age";
        }

        System.out.println(result);
        sc.close();
    }
}

/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */