package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of miles");
        Double miles = input.nextDouble();
        input.close();

        double kilometers = miles * 1.60934;

        System.out.println(miles + " miles equal to " + kilometers + " kilometers");

    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */