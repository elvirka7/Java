package day10_NestedIf;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your annual salary amount");
        int salary = sc.nextInt();

        System.out.println("Please enter your credit score");
        int creditScore = sc.nextInt();

        String message = (salary>60_000 && creditScore>650)? "Loan Approved" : "Loan Denied";
        System.out.println(message);

        sc.close();

    }
}
/*
 Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */