package _8_OOP._2calcII;

import java.util.Scanner;

public class Calc {
    private String names;
    private int x, y, result;

    public String getNames() {
        return names;
    }


      public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus(){
        result = x + y;
    }

    public void minus(){
        result = x - y;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        Calc a = new Calc();
        a.setX(one);
        a.setY(two);
        a.plus();
        System.out.println(a.getResult());
        a.minus();
        System.out.println(a.getResult());
    }
}
