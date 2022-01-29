package practice_01_26_2022;

import java.util.ArrayList;

public class Q22 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4); // 4
        nums.remove(nums.size()-1); //
        nums.add(2);// 2
        nums.add(10);// 2, 10
        nums.add(0,6); // 6, 2, 10
        nums.remove(1); // 6, 10
        nums.add(-7); // 6, 10, -7,
        nums.add(2,2); //6, 10, 2, -7

        System.out.println(nums);
    }

}
