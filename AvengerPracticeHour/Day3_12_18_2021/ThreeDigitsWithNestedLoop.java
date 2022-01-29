package Day3_12_18_2021;

public class ThreeDigitsWithNestedLoop {
               /*
                writing three-digits numbers with nested loops
                hint:
                ABC=100*A+10*B+C
                220=100*2+10*2+0
                */

    public static void main(String[] args) {

        for (int a = 1; a <=9 ; a++) {
            for (int b = 0; b <=9 ; b++) {
                for (int c = 0; c <=9 ; c++) {
                    int abc=100*a+10*b+c;
                    System.out.println( abc);
                }
            }
        }
    }
}
