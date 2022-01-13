package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = sc.next();

        System.out.println("Enter a word");
        String word2 = sc.next();

        System.out.println("Enter a word");
        String word3 = sc.next();

        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        String result = "";

        if (l1 == l2 && l2 == l3 && l1 == l3) {
            result = "All words are same length";
        } else if (l1 == l2 && l1 != l3 || l2 == l3 && l1 != l3 || l1 == l3 && l2 != l3) {
            result = "Not Same nor Different lengths";
        } else if (l1 != l2 && l1 != l3 && l2 != l3) {
            result = "All different length";
        }
        System.out.println(result);
        sc.close();
    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */