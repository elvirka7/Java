package day15_ForLoop;

import java.util.Scanner;

public class ReverseString2ndMethod {
    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {    // i: index number of word (starting index to index 0
            result += word.charAt(i);        // adding each character to result
        }
        System.out.println(result);

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