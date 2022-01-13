package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ZBreakfast2_ReverseSecondWord2 {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        String reverse = "";

        for (int j = words[1].length() - 1; j >= 0; j--) {
            reverse += words[1].charAt(j);
        }

        words[1] = reverse;

        String result = "";
        for (String word: words){
            result += word+" ";
        }

        System.out.println(result);



    }
}


/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */