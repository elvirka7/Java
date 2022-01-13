package day16_ForLoopStringPractice;

public class WordFrequencyWhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python"; //length is 5
        int javaFrequency = 0;


        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            javaFrequency++;
        }
        System.out.println("javaFrequency = " + javaFrequency);


    }
}

/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */