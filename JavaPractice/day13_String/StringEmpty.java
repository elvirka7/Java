package day13_String;

import java.util.Scanner;

public class StringEmpty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = sc.nextLine();

        String result = "";

        int a = word.length();

        if (a == 0) {
            result = "String is empty";
        } else if (a > 3) {
            char thirdChar = word.charAt(a - 1);
            char secondChar = word.charAt(a - 2);
            char firstChar = word.charAt(a - 3);
            result = "" + firstChar + secondChar + thirdChar;
        } else if (a > 0 && a <= 3) {
            result = word;
        }

        System.out.println(result);
        sc.close();
    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itsel
 */