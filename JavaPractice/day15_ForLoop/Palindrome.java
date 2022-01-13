package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();
        String reversed = "";

        for(int i = word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);



    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */