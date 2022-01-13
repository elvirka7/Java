package Reverse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IReverseArrayListString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Grant", "Elvira", "Kai", "Alia"));
        System.out.println("list = " + list);

        ArrayList<String> reversedlist = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedlist.add(list.get(i));
        }
        System.out.println("reversedlist = " + reversedlist);
        }



    }

