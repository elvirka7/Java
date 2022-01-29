package Day3_12_18_2021;

public class TwoDigitsWithNestedLoop {
     /*
                writing two-digits numbers with nested loops
                hint:
                AB=10*A+B

                10-11-12-...99
                */

    public static void main(String[] args) {

        for (int a = 1; a <=9 ; a++) {
            for (int b = 0; b <=9 ; b++) {
                int ab=10*a+b;
                System.out.print(ab+" ");
            }
        }
    }

}
