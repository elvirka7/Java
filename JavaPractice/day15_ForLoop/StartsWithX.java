package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        String word = new Scanner(System.in).next();


        if (word.contains("x") || word.contains("X")) {

            word = word.replace("x", "a").replace("X", "a");

        }
        System.out.println(word);

    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
