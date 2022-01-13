package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZLunch1_MultiplicationDivisoin$ {
    public static void main(String[] args) {

        System.out.println("Please enter two positive numbers");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();

        int multiplication = 0;
        int division = 0;
        int count = 0;

        for (int i = 0; i < num1; i++) {
            multiplication += num2;
        }
        for (int j = num1; j >= num2; j -= num2) {   //150
            ++division;
        }
        System.out.println(num1 + "*" + num2 + "=" + multiplication);
        System.out.println(num1 + "/" + num2 + "=" + division);


    }
}
/*
Write a program that can divide two numbers without using / (division) and * (multiplication) operators

 */