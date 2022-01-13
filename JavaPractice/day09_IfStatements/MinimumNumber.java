package day09_IfStatements;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int minNumber;

        if(n1<n2){
            minNumber = n1;
        } else {
            minNumber = n2;
        }
        System.out.println(minNumber);

        sc.close();
    }
}

/*
Minimum number between two different numbers
 */