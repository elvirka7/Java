package _5_Arrays;

import java.util.Scanner;

public class _5_PrintFirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        for (String each : words) {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
        }
        input.close();
    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */