package _6_MethodsTODO;

import java.util.Scanner;

public class _15_MethodsWithReturn_3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean threeLocks = (a == true && b == true) ? true : (c == true) ? true : false;
        return threeLocks;
    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(), in.nextBoolean()));
    }
}
/*
threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

Hint: See truth table
 */