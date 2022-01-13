package _2_Statements;

import java.util.Scanner;

public class _11_VendingMachine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = sc.nextInt();
        String result;

        if (cents > 0 && cents < 100) {

            int quarter = cents / 25;
            int dime = cents % 25 / 10;
            int nickel = cents % 25 % 10 / 5;
            int penny = cents % 25 % 10 % 5;
            result = "Your change is " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, and " + penny + " pennies";

        } else {
            result = "Invalid cents amount";
        }
        System.out.println(result);
        sc.close();
    }
}

/*
Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */