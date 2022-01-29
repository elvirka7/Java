package _8_OOP.CarpetClass;

import java.util.Scanner;

class Carpet {
    public double width, length, unitPrice;
    public int totalPrice;
    public boolean isPersian;

    public Carpet(){
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        if(isPersian){
            totalPrice = (int) (200+(length+width)*unitPrice);
        }else{
            totalPrice  =(int) ((length+width)*unitPrice);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println(c2.totalPrice);

    }
}
