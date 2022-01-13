package Reverse;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KReverseArrayListChar {
    public static void main(String[] args) {

        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        System.out.println("charList = " + charList);
        
        ArrayList<Character> reversedCharList = new ArrayList<>();
        for (int i = charList.size() - 1; i >= 0; i--) {
            reversedCharList.add(charList.get(i));
        }

        System.out.println("reversedCharList = " + reversedCharList);
    }
}
