package day14_String;

import java.util.Scanner;

public class AppleBanana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first word");
        String word1 = sc.next();
        System.out.println("Please enter second first word");
        String word2 = sc.next();
        sc.close();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1 + word2);

    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */