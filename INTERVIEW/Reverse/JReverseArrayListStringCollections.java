package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JReverseArrayListStringCollections {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Grant", "Elvira", "Kai", "Alia"));

        Collections.reverse(list);
        System.out.println(list);


    }
}
