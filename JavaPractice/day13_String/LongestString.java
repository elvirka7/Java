package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word1 = sc.next();

        System.out.println("Please enter one more word");
        String word2 = sc.next();

        int a = word1.length();
        int b = word2.length();

        String result = (a > b) ? word1 : (b > a) ? word2 : "both words have equal length";

        System.out.println("The longest word is: " + result);

        sc.close();
    }
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */