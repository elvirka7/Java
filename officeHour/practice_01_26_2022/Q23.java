package practice_01_26_2022;

import java.util.ArrayList;

public class Q23 {

    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList<>();

        strs.add("j"); // j
        strs.add(0,"1"); // 1, j
        strs.add("i"); // 1, j, i
        strs.add(2,"5"); // 1, j, 5, i
        strs.remove(1); // 1, 5, i
        strs.add("e"); // 1,5,i,e
        strs.add("i");// 1, 5 ,i, e, i
        strs.remove("i"); // 1,5,e,i

        System.out.println(strs);
    }
}
