package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Breakfast2_MoveZeroesToEnd1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

       int newSize = list.size();

       int totalNumberOfZeroes = size-newSize;

       System.out.println(totalNumberOfZeroes);

        for (int i = 0; i < totalNumberOfZeroes; i++) {
            list.add(0);
        }
        System.out.println(list);
    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

 */