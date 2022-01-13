package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a text");
        String text = input.nextLine();

        System.out.println("Please enter a character");
        char character = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == character) {
                frequency++;
            }
        }
        System.out.println(frequency);
        input.close();
    }
}

/*
Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */