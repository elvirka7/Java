package day16_ForLoopStringPractice;

public class WordFrequency_ForLoop {
    public static void main(String[] args) {

        String str = "Ajava and Majava "; //length is 5
        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            //-4 indicates the position of the sentence that we want to end at.
            // If the word has a length of 4 then we use that to indicate that we want to stop when we get to the last four characters of the sentence

            if(str.substring(i, i+4).equalsIgnoreCase("Java")){
                ++frequency;
            }



        }
        System.out.println(frequency);

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