package practice_12_29_2021;

import java.util.Arrays;

public class ForEachString {

    public static void main(String[] args) {

        String [] words = {"one","two","three","four"};
        String [] other = new String[words.length];
        int index = 0;

        for (String word:words) {
            other[index++] = word + word.length();
    //               0      one + 3 = one3
            //       1      two + 3 = two3
            //       2      three + 5 = three5
        }

        System.out.println(Arrays.toString(other));
    }
}
