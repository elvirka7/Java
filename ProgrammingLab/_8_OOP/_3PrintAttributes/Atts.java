package _8_OOP._3PrintAttributes;

import java.util.Scanner;

class Atts {
    public String name, color;
    public int amount;


    public String asString() {
        return "name: "+name+" color: "+color +" amount: "+amount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.next();
        a.color = in.next();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
}