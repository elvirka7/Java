package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the total amount of shares you have already");
        int shares = input.nextInt();

        System.out.println("Please enter their total value in the stock market?");
        double totalValue = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter the name of the company your shares are in");
        String companyName = input.nextLine();

        input.close();

        if (shares > 0) {

            System.out.println("Your total stock market holding is $" + (int) totalValue + " which is made up of " + shares + " shares. " + companyName + "is your company holdings");
        }

    }
}
/*
 StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */