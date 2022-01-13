package _3_String;

import java.util.Scanner;

public class _12_MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE:
        String result = "";
        if (word1.length() == 3 && word2.length() == 3) {
             result = "" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2);
        } else {
            result = "cannot merge";

        }
        System.out.println(result);
        scan.close();
    }
    }

/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol

Output:
alookl


Input:
ear
pie

Output:
epaire

Input:
java
wow

Output:
cannot merge

hint:

by inserting +""+ (empty string) between chars, you can concatenate char values.
 */
