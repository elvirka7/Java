package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZTheDinner1_Divisionmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int multiplication = 0;
        int division = 0;
        int remainder = 0;

        while (!(n1 > 0 && n2 > 0)) {
            System.out.println("Invalid entry, enter two positive numbers");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            multiplication += n1;
        }
        System.out.println("Multiplication result is: "+multiplication);

        while (n1 > n2) {
            n1 -= n2;
            division++;
        }
        System.out.println("Division result is: "+division+ " with a remainder of "+n1);
        //remainder is now equal to n1, after n1 - n2 multiple times



        sc.close();
    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */