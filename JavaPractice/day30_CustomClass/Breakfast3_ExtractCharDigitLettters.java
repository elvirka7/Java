package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Breakfast3_ExtractCharDigitLettters {
    public static void main(String[] args) {

        String   str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        
        ArrayList<Character> letters = new ArrayList<>( list );
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( list );
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar= new ArrayList<>( list );
        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );

        specialChar.removeIf(p-> !Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);
    }
}
/*
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */