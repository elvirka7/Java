package day28_ArrayList;

import java.util.ArrayList;

public class zTheDInner3_MultiplyEachOddByTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.set(i,list.get(i)*2);
            }
        }
        System.out.println(list);

    }
}
/*
write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 */