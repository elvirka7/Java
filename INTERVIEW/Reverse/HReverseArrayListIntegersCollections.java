package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HReverseArrayListIntegersCollections {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5));
       System.out.println(list);

       //Reversed CURRENT ArrayList without creating a new one
       Collections.reverse(list);
       System.out.println(list);

    }
}


