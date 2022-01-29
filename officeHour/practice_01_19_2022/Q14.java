package practice_01_19_2022;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int [] a = new int[size];
        int i=0;

        while(i<size){
            a[i++] = input.nextInt();
        }

        method8(a);
    }

    public static void method8(int[] arr) {

         for(int n : arr){
             if(n%4==0){
                 continue;
             }

             System.out.print(n);//7314
         }
    }
}
