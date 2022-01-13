package day10_NestedIf;

import java.util.Scanner;

public class CrewAndPassenger_Ternaries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     // n is for number of people

        String message = (n == 50 || n == 75 || n == 100) ?
                (n == 50) ? "Total: 50  ====> 20 crew, 30 passengers"
                        : (n == 75) ? "Total: 75  ====> 25 crew, 50 passengers"
                        : "Total: 100 ====> 30 crew, 70 passengers"
                : "Number of people on the ship is not valid";

        System.out.println(message);

        sc.close();
    }
}
/*
Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */