package day13_String;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three letter word");
        String word = sc.next();

        String result = "";

        int x = word.length();
        if (x == 3) {
            if (word.charAt(x - 2) == 'a') {
                result = "Cool word";
            } else {
                result = "Okay word";
            }

        } else if (x < 3) {
            result = "Word is too short";
        } else if (x > 3) {
            result = "Word is too long";
        }

        System.out.println(result);
        sc.close();
    }
}

/*
write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */