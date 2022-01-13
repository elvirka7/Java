package day04_Variables;

import java.util.Scanner;

public class KgToPounds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the kg amount");
        int kg = sc.nextInt();
        double lb = kg * 2.2;

        System.out.println("1kg = 2.2lbs" +
                "\nkg: " + kg +
                "\nlbs: " + lb);

        sc.close();
    }
}
/*
4. Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
					Hints: 1 kg = 2.2 pounds
 */