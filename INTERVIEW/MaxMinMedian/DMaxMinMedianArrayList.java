package MaxMinMedian;

import java.util.ArrayList;
import java.util.Scanner;

public class DMaxMinMedianArrayList {
    public static void main(String[] args) {

        System.out.println("Please enter the size of ArrayList");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
           int a = sc.nextInt();
            list.add(a);

        }


        int max = list.get(0);
        int min = list.get(0);
        int total = 0;

        for (Integer each : list) {

            if(max<each){
                max = each;
            } else if(min > each){
                min = each;
            }
            total+=each;

        }

        int median = total/list.size();

        System.out.println("ArrayList elements are "+list);
        System.out.println("Maximum element in ArrayList is "+max+"\nMinimum element in ArrayList is "+min+"\nMedian element in Arraylist is "+median);

        sc.close();
    }
}
