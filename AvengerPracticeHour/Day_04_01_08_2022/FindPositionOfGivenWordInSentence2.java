package Day_04_01_08_2022;

import java.util.ArrayList;

public class FindPositionOfGivenWordInSentence2 {
    public static void main(String[] args) {
        //1   2  3     4     5        6   7     8
        String sentence="Java      is my job because I am SDET";
        String word="Java";
        int position=findIndexOfGivenWord(sentence,word);
        System.out.println(position);

    }

    private static int findIndexOfGivenWord(String sentence, String word) {
        ArrayList<String> words= splitWords(sentence);
        int i = 0;
        for (i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)){
                break;
            }
        }
        return i+1;

    }

    private static ArrayList<String> splitWords(String sentence) {
        String [] words=sentence.split(" ");
        ArrayList<String> result=new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty()){
                result.add(word);
            }
        }
        return result;

    }
}
