package practice_01_05_2022;

public class Deeper {

    public static void main(String[] args) {
        System.out.println("Not Deep"); //1
        deep();
        System.out.println("Not Deep");//5

    }

    public static void deep() {
        System.out.println(" Deep");//2
        deeper();
        System.out.println(" Deep"); //4

    }

    public static void deeper() {
        System.out.println(" Deeper");//3

    }

}
