package day09_IfStatements;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char number = sc.next().charAt(0);

        boolean alphabet = (number >= 65 && number <= 90) || (number >= 97 && number <= 122);
        boolean digit = number >= 48 && number <= 57;
        boolean specialCharacter = number >= 0 && number <= 255 && !alphabet && !digit;
        String message="";

        if (alphabet) {
            message = "Alphabet";
        } else if (digit) {
            message = "Digit";
        } else if (specialCharacter) {
            message = "Special Character";
        } else {
            message = "Please only enter numbers between 0 and 127";
        }
        System.out.println(message);

        sc.close();
    }
}
/*
Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */

