package practice_01_26_2022;

import java.util.Scanner;

public class Q17 {

    public static int action() {
        return 0;
    }

    public static int action(int i) {
        return i*2; // 12
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        total += action(input.nextBoolean()); // total = 10
        total += action(input.nextInt()); // total = 10+12=22
        total += action(); // total = 22
        total += action(input.next()); // total = 22+5=27
        total += action(input.next()); // total = 27 + 4 =31
  // next() and nextLine() in scanner they represent String

        System.out.println(total); //total =

    }

    public static int action(String s) { //
        return s.length(); // 5
    }

    public static int action(boolean b) {
        if(!b){ // ! --> opposite
            return 5;
        }else{
            return 10;
        }
    }

}
