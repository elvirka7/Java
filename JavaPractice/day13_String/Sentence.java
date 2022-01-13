package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type a sentence");
        String sentence = sc.nextLine();

        int a = sentence.length();
        char firstCharacter = sentence.charAt(0);
        char lastCharacter = sentence.charAt(a - 1);
        System.out.println("First character: " + firstCharacter + "\nLast character: " + lastCharacter);

        sc.close();
    }
}
/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */