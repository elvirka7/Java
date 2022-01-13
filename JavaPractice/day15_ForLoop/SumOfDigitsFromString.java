package day15_ForLoop;

import java.util.Scanner;

public class SumOfDigitsFromString {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();
        int digits = 0;

        for (int i=0; i<word.length();i++){

            if (word.charAt(i) >= '0'-48 && word.charAt(i)<='9'){
                digits+=word.charAt(i)-48;

            }
        }
        System.out.println(digits);
    }
}
/*
 Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */
