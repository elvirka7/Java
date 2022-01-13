package day22_MultiDimensionalArray;

public class ZBreakfast2_ReverseSecondWord {
    public static void main(String[] args) {


        String sentence = "I Love Java";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int j = words[1].length() - 1; j >= 0; j--) {
            reverse += words[1].charAt(j);
        }

        sentence = sentence.replaceFirst(words[1], reverse);
        System.out.println(sentence);
    }


}


/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */