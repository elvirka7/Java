package Day_04_01_08_2022;

public class FindPositionOfGivenWordInSentence {

    /**
     *   Q2:
     *        - Find the index of the given word in sentence
     *        * do not use indexOf() method
     */

    public static void main(String[] args) {
                                        //1   2  3     4     5        6   7     8
        String sentence="Java      is my job because I am SDET";
        String word="SDET";
        int position=findIndexOfGivenWord(sentence,word);
        System.out.println(position);

    }

    private static int findIndexOfGivenWord(String sentence, String word) {
       String[] words=sentence.split(" ");
       int counter=0;
       for (String each:words){
           counter++;
           if (each.equals(word)){
               break;
           }

       }
       return counter;
    }
}
