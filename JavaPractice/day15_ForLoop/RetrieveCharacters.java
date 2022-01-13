package day15_ForLoop;

import java.util.Scanner;

public class RetrieveCharacters {
    public static void main(String[] args) {
        
        String word = new Scanner(System.in).next();
        String digits = "";
        String letters = "";
        String characters = "";
        
        for (int i=0; i<word.length();i++){
            if (word.charAt(i) >= '0' && word.charAt(i)<='9'){
               digits+=word.charAt(i);
            } else if (word.charAt(i) >= 'A' && word.charAt(i)<='Z' || word.charAt(i) >= 'a' && word.charAt(i)<='z'){
                letters+=word.charAt(i);
            } else {
                if(word.charAt(i)!= ' ') {
                    characters += word.charAt(i);
                }
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special characters = " + characters);
        
    }
}
/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */