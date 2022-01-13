package day28_ArrayList;

import java.util.ArrayList;

public class zTheDinner1_SetLastElementToZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(list.size()-1, 0);     // Or list.set(4,0);
        System.out.println(list);

    }
}
/*
write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */