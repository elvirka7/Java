package day15_ForLoop;

import java.util.Scanner;

public class ReverseString1stMethod {
    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();


        for (int i = 1; i<= word.length(); i++ ) {
            System.out.print(word.charAt(word.length()-i));
        }


    }
}
/*
Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */