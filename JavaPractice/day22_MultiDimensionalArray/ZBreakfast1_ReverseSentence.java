package day22_MultiDimensionalArray;

public class ZBreakfast1_ReverseSentence {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";
        String[] sentence = str.split(" ");


        for (int i = sentence.length - 1; i >= 0; i--) {
            System.out.print(sentence[i] + " ");
        }

    }
}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */