package day15_ForLoop;

import java.util.Scanner;

public class ReplaceXWithA {
    public static void main(String[] args) {


        String word = new Scanner(System.in).next();


        if (word.charAt(0) == 'x') {
            word.replaceFirst(word.substring(0, 1), "a");
        }
        System.out.println(word);

    }
}
/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */