package day20_ArraysREPEAT;

import java.util.Arrays;

public class ArrayCharacters {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("\n=============");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("\n=============");

        char[] letters2 = new char[26];   // Z~A




    }
}
