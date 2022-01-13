package day16_ForLoopStringPractice;

public class WordFrequency {
    public static void main(String[] args) {

        String text = "Java Java and Javat";
        int frequency = 0;

        for (int i = 0; i < text.length()-1; i++) {
            if(text.substring(i).toLowerCase().startsWith("java")){
                ++frequency;
            }
        }

        System.out.println(frequency);



        /*for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i).startsWith("Java")){
                ++frequency;
            }
        }
        System.out.println(frequency);
*/
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