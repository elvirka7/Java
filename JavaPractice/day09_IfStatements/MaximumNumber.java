package day09_IfStatements;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int maxNumber;


        if (n1 > n2) {
            System.out.println(n1 + " is the maximum number");
        } else if (n2 > n1) {
            System.out.println(n2 + " is the maximum number");
        } else {
            System.out.println(n1+" and "+n2+" are equal");
        }

        sc.close();
    }
}
/*
 Maximum number between two different numbers
 */