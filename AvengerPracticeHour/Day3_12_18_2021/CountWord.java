package Day3_12_18_2021;

public class CountWord {
    /**
     * Count the word that is given inside the sentence
     *                                 input: Java is Java
     *                                 word:Java
     *                                 output:2
     */

    public static void main(String[] args) {
        String sentence="Java is Java";
        String word="Java";
        int count=0;
                             //8    //12-4=8
        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            String temp=sentence.substring(i,i+word.length());
            if (temp.equals(word))
                count++;
        }
        System.out.println("count = " + count);

    }
}
