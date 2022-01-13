package day20_ArraysREPEAT;

import java.util.Scanner;

public class MonthCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        while (true) {
            //enter a month number
            System.out.println("Please enter a month number");
            int numberOfMonth = sc.nextInt();

            //if month number is incorrect say it is invalid
            while(!(numberOfMonth >=1 && numberOfMonth <=12)) {
                System.err.println("Invalid Entry, please re-enter");
                numberOfMonth = sc.nextInt();
            }
            System.out.println(month[numberOfMonth - 1]);

            // more
            System.out.println("\nWould you like to enter another month");
            String answer = sc.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please enter yes or no");
                answer = sc.next().toLowerCase();
            }
                if (answer.equals("no")) {
                    System.out.println("Thank you for using Cydeo calendar");
               System.exit(0);
                }

        }


    }
}