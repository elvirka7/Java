package _2_Statements;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _12_VideoGameCoupons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = sc.nextInt();

        int candyBar = coupons / 10;
        int gumball = coupons % 10 / 3;
        String result;

        if (coupons >= 3) {
            result = "Number of Candies: " + candyBar + "\nNumber of Gumballs: " + gumball;
        } else {
            result = "Not enough coupons";
        }
        System.out.println(result);
        sc.close();
    }
}
/*
The video games machines at your local arcade outputs coupons according to how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars.

if you the coupons are not enough for any redeem, display message:

"Not enough coupons"

Example:

Input:
Enter number of coupons:
13

Output: Number of Candies: 1
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
13

Output: Number of Candies: 1
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
23

Output: Number of Candies: 2
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
23

Output: Number of Candies: 2
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
2

Output: Not enough coupons
 */