package _5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _7_PrintFirstAndLastChar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
        String result = "";
        for (String each : words) {
            result += "" + each.charAt(0) + each.charAt(each.length() - 1) + " ";
        }
        String[] output = result.split(" ");
        System.out.println(Arrays.toString(output));
        input.close();
    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */