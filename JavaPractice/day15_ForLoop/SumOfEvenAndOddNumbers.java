package day15_ForLoop;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd +=i;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

    }
}
/*
Write a program that can return the sum of odd numbers between 1 to 100
 */