package Reverse;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GReverseArrayListIntegers {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

       //created a new reversedArrayList
       ArrayList<Integer> reversedList = new ArrayList<>();
       int j = 0;
       for (int i = list.size() - 1; i >= 0; i--) {
       reversedList.add(j++, list.get(i));
           // OR  reversedList.add(list.get(i));
        }

        System.out.println(list);
        System.out.println(reversedList);
    }
}
