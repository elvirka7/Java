package day20_ArraysREPEAT;

import java.util.Arrays;

public class ArraysWeek {

    public static void main(String[] args) {

     String [] days = {"Monday", "Tuesdays", "Wednesdays", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);
    }
}
