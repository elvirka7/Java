package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Breakfast2_MoveZeroesToEnd2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(each!=0){
                result.add(each);
            }
        }

        for (Integer each : list) {
            if(each==0){
                result.add(each);
            }
        }
        System.out.println(result);



    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

 */