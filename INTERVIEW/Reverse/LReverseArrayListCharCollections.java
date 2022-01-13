package Reverse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LReverseArrayListCharCollections {
    public static void main(String[] args) {

        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        System.out.println("charList = " + charList);

        Collections.reverse(charList);
        System.out.println("Reversed charList = "+charList);
    }
}
