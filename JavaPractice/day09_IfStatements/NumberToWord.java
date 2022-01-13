package day09_IfStatements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String word="";

        if (number == 0) {
            word = "Zero";
        } else if (number == 1) {
            word = "One";
        } else if (number == 2) {
            word = "Two";
        } else if (number == 3) {
            word = "Three";
        } else if (number == 4) {
            word = "Four";
        } else if (number == 5) {
            word = "Five";
        } else if (number == 6) {
            word = "Six";
        } else if (number == 7) {
            word = "Seven";
        } else if (number == 8) {
            word = "Eight";
        } else if (number == 9) {
            word = "Nine";
        } else {
            word = "Please enter number between 0 and 9";
        }
        System.out.println(word);

        sc.close();

    }
}

/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */
