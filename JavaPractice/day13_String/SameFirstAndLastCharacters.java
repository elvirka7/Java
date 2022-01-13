package day13_String;

import java.util.Scanner;

public class SameFirstAndLastCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.next();

        char firstCharacter = word.charAt(0);
        char lastCharacter = word.charAt(word.length()-1);
        String result = (firstCharacter == lastCharacter)? "same" : "different";

        System.out.println("First character: "+firstCharacter+"\nLast character: "+lastCharacter+"\nCharacters are: "+result);

        sc.close();

    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */