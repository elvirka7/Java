package _5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _11_PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below

        String[] array = str.split(", ");
        int shortest = array[0].length();
        String shortOne = "";
        for (int i = 0; i < array.length; i++) {

            if (shortest > array[i].length()) {
                shortest = array[i].length();
            }
        }
        for (String each : array) {
            if (each.length() == shortest) {
                shortOne += each + ", ";
            }
        }

        String[] array1 = shortOne.split(", ");
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        scan.close();
    }
}
/*
Write a program that will find out shortest array in the given string str. If there are few array that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */