package day15_ForLoop;

import java.util.Scanner;

public class SumOfFactorial {
    public static void main(String[] args) {


        int num = new Scanner(System.in).nextInt();

        int factorial = 1;

        for(int i = 1; i<=num; i++){
            factorial*=i;
        }
        System.out.println("factorial = " + factorial);



    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */