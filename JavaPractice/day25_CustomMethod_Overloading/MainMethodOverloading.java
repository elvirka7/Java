package day25_CustomMethod_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {    // only this method is the ACTUAL MAIN method
        System.out.println("String");
    }

    public static void main(int [] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }
}
