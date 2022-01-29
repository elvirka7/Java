package practice_01_19_2022;

public class Q16 {

    public static void main(String[] args) {
         double number = add(3.4); // number = 2.5

         number += add("dual"); // number= 12.5
         number += add(Integer.parseInt("100")); // number= 17.5
         number += add(11341L); // number = 20
         number += add(Float.parseFloat("50.8")); // number= 22.5

        System.out.println(number);
    }

    public static int add(int n) {
        return 5;
    }

    public static double add(double d) {
        return 2.5;
    }

    public static long add(String s) {
        return 10;
    }







}
