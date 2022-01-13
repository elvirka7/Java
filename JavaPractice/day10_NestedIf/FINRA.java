package day10_NestedIf;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        
        String result;

        if (number % 5 == 0 && number % 3 == 0) {
            result = "FINRA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else if (number % 5 == 0) {
            result = "RA";
        } else {
            result = ""+number;
        }

        System.out.println("result = " + result);;
    sc.close();
    }
}
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */