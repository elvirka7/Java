package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinAverage2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,6,7));
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
