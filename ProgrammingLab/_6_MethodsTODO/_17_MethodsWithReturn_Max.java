package _6_MethodsTODO;

import java.util.Scanner;

public class _17_MethodsWithReturn_Max {
    public static int max(int x, int max){
        // Code here

        if(x>max){
            return x;
        } else if(max>x){
            return max;
        } else {
            return x;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


}
/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(1,10) -> 10
max(11,5) -> 11
 */