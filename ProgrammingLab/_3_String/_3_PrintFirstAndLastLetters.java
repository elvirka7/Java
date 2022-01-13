package _3_String;

import java.util.Scanner;

public class _3_PrintFirstAndLastLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        scan.close();
        System.out.println(word.substring(0, 1) + word.substring(word.length() - 1));

    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe
Output: ae
 */