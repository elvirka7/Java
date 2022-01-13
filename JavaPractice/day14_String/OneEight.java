package day14_String;

import java.util.Scanner;

public class OneEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = sc.next();
        System.out.println("Enter a word");
        String word2 = sc.next();
        sc.close();

        char word1Last = word1.charAt(word1.length()-1);
        char word2First = word2.charAt(0);

        if(word1Last == word2First){
            System.out.println(word1+word2.substring(1));
        }

    }
}
/*
Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */