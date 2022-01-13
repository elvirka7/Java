package day19_LoopPractices;

public class zLunch1_FirstDuplicatedCharacther {
    public static void main(String[] args) {

        String sentence = "What are you";
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            int count = 0;

            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    result = "" + sentence.charAt(i);
                    count++;

                }
            }
            if (count == 2) {
                break;
            }
        }

        System.out.println(result);
    }
}





/*
Write a program that can return the first duplicated character from a string
 */