package practice_01_19_2022;

import java.util.Scanner;

public class Q15 {

    public static String method9(String one, String two, String three) {

        return "" + middle(one) + middle(two) + middle(three);
               //   middle(lawn) + middle(solar) + middle(activity)
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(), scan.next(), scan.next());

        System.out.println(str);
    }

    public static char middle(String s) { //middle(lawn)
        return s.charAt(s.length()/2); // wlv
    }


}
