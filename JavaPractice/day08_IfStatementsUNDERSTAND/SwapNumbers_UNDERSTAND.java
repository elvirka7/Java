package day08_IfStatementsUNDERSTAND;

public class SwapNumbers_UNDERSTAND {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
/*
swap variable values without using a temp variable
 */

