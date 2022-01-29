package Day1_12_04_2021;

public class StringExample3 {
    /**
     * 3.Given a string, return a version without the
     * first and last char, so "Hello" yields "ell".
     *   The string length will be at least 2.
     */

    public static void main(String[] args) {

                  //012345
        String str="selcuk";  //elcu

        String svar = str.substring(1, str.length() - 1);
        System.out.println(svar);




    }
}
