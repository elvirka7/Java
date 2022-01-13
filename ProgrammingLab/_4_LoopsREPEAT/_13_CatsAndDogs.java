package _4_LoopsREPEAT;

import java.util.Scanner;

public class _13_CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals("cat")) {
                countOfCats++;
            }
            if (word.substring(i, i + 3).equals("dog")) {
                countOfDogs++;
            }
        }
        System.out.println(countOfCats == countOfDogs);
        scan.close();

    }
}

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */