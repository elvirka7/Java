package _3_String;

import java.util.Scanner;

public class _1_PrintFirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        System.out.println(word.charAt(0));
        scan.close();


    }
}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Input: jump
Output: j
 */