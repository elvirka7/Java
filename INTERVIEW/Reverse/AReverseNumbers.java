package Reverse;

import java.util.Scanner;

public class AReverseNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int n = sc.nextInt();
        int a = 0;
        String numbers = "";
        String reversed = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
            a = sc.nextInt();
            numbers+=a+" ";
        }

        for (int i = numbers.length()-1; i>=0; i--) {
            reversed+=numbers.charAt(i);
        }





        System.out.println("You entered numbers "+numbers);
        System.out.println("Reversed order of numbers "+reversed);
    }
}
