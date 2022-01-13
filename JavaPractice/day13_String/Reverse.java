package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("Enter a 5 letter word");
        String word = sc.next();

        int l = word.length();

        if (l < 5) {
            result = "Too short!";
        } else if (l > 5) {
            result = "Too long!";
        } else {
            char five = word.charAt(l - 1),
                    four = word.charAt(l - 2),
                    three = word.charAt(l - 3),
                    two = word.charAt(l - 4),
                    one = word.charAt(0);
        result = ""+five+four+three+two+one;

        }

        System.out.println(result);
    }
}

/*
 Create a class called Reverse, write a program that will reverse a string.
 Your program should reverse a string only 5 characters long.
 If word is shorter, display message: "Too short!".
 If word is longer, display message: "Too long!".
 Otherwise, reverse this word and print out result into the console.
 */