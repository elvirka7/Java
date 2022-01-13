package day15_ForLoop;

import java.util.Scanner;

public class ScannerLoop {
    public static void main(String[] args) {

        int total = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            total += sc.nextInt();
        }
        System.out.println(total);

        sc.close();

    }
}
