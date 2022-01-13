package day19_LoopPractices;

import java.util.Scanner;

public class zTheDinner6_HighestFrequencyCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = scan.nextLine().toLowerCase().replace(" ", "").trim();
        int biggestCount = 0;
        char biggestFrequencyChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    count++;
                }
            }
            if (biggestCount < count) {
                biggestCount = count;
                biggestFrequencyChar = c;
            }
        }
        System.out.println(biggestFrequencyChar + " occurs " + biggestCount + " times");
    }
}
/*
Write a program that can find the character that has the highest frequency from a string
 */