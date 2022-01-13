package _5_Arrays;

import java.util.Scanner;

public class _2_AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        // Do not touch above. Use array temps

        double total = 0;
        for (double each : temps) {
            total += each;
        }
        System.out.println(total / temps.length);
        scan.close();

    }
}
/*
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */