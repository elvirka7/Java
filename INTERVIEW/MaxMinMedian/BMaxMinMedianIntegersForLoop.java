package MaxMinMedian;

import java.util.Scanner;

public class BMaxMinMedianIntegersForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to compare");
        int n = sc.nextInt();

        int max = -2_147_483_648;
        int min = 2_147_483_647;
        int sum = 0;
        int count = 0;
        String numbers = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number");
            int a = sc.nextInt();
            if (max < a) {
                max = a; }
                if (min > a) {
                    min = a;
                }
                numbers += a + " ";
                sum += a;
                count++;
            }

            int average = sum / count;
            System.out.println("Numbers are " + numbers);
            System.out.println("Max number is " + max + "\nMin number is " + min + "\nAverage number is " + average);

    sc.close();
    }

    }

