package MaxMinMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FMaxMinCollectionsAdAllMethodScanner {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of ArrayList");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
            int a = sc.nextInt();
            list.add(a);
        }

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
