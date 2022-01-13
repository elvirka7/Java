package MaxMinMedian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EMaxMinCollectionsAdAllMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(9,4,1,3,5,6,8,9,10));

        int max = Collections.max(list);
        int min = Collections.min(list);
        int total=0;

        for (Integer each : list) {
            total+=each;
        }
        int median = total/list.size();

        System.out.println("ArrayList "+list);
        System.out.println("Maximum element in ArrayList is "+max+"\nMinimum element in ArrayList is "+min+"\nMedian element in Arraylist is "+median);


    }
}
