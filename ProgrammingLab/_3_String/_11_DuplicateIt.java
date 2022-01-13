package ProgrammingLab._3_String;

import java.util.Scanner;

public class _11_DuplicateIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE:

        System.out.println(word1 + word2.repeat(2) + word1);
        scan.close();
    }
}
/*
You have 2 words

Print the first word, second word, second word, first word

Input:

one

two
Input:

one

two
Output:

onetwotwoone
 */