package practice_01_19_2022;

public class Q7 {

    public static void main(String[] args) {
         method1();
    }

    public static void method1() {

        int n = -5;

        for(int i=1; i<5; i++){
            n *= i; //-30*4=-120
        }

        System.out.println(n);
    }


}
