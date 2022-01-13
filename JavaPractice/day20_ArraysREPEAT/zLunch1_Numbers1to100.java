package day20_ArraysREPEAT;

public class zLunch1_Numbers1to100 {
    public static void main(String[] args) {

        int [] numbers = new int[100];

        for (int i = 0; i <=numbers.length; i++) { // index number starting from 0 to 99
            numbers [i] = i+1 ;
            System.out.print(numbers[i]+" ");
        }

        }
    }


/*
 create an array that has the numbers 1 to 100
 */