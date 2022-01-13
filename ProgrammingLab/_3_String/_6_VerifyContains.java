package _3_String;

import java.util.Scanner;

public class _6_VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE:

        boolean verify = sentence.contains(word);
        System.out.println(verify);
        scan.close();
    }
}
/*
Write a program that will verify if the sentence contains word. Print out the result as a boolean value.
 */