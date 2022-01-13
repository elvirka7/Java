package _NOTES;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {


        /* OPTION 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        OPTION 2
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            Scanner sc = new Scanner(System.in);
            int n;
            list.add(n=sc.nextInt());


        OPTION 3
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         */

        //OPTION 4
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));


        System.out.println(list);
    }
}
