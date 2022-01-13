package day14_String;

import java.util.Scanner;

public class SpecialCharacterUpperCaseLowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        sc.close();

        char firstLetter = word.charAt(0);

        if (firstLetter >= '0' && firstLetter <='9') {
            System.out.println("first character is digit");
        } else if(firstLetter >= 'A' && firstLetter<= 'Z'){
            System.out.println("first character is uppercase letter");
        } else if(firstLetter >= 'a' && firstLetter<= 'z') {
            System.out.println("first character is lowercase letter");
        } else {
            System.out.println("first character is special character");
        }

    }
}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */