package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
        char [] first = str1.toCharArray();     // abcd
        char [] second = str2.toCharArray();    //abcd

        Arrays.sort(first);
        Arrays.sort(second);
        boolean isAnagram = Arrays.equals(first, second);
        System.out.println(isAnagram); //true


    }
}
/*
// write a program that can check if str1 & str2 are build out same characters
 */