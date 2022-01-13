package ProgrammingLab._3_String;

import java.util.Scanner;

public class _8_PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        System.out.println(word.substring(0, word.length()/2).repeat(2));
        scan.close();
    }
}
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
input: unity
output: unun
 */