package Day3_12_18_2021;

public class LoopIntro {

     /*
                 Classic for-loop counting up from 0 to 99
                 0, 1, 2, 3, ... 99
                -init int i = 0
                -test i<100
                -increment i++
                */

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print( i+" ");
        }
        System.out.println();
        System.out.println("===========================");
//even numbers from 0 to 100
        System.out.print(0);
        for (int i = 2; i < 100; i+=2) {
            System.out.print( " "+i);
        }
        //odd numbers from 0 to 100
        System.out.println();
        System.out.println("===========================");

        for (int i = 1; i < 100; i+=2) {
            System.out.print( i+" ");
        }

        //divided by  numbers with 5 from 0 to 100
        System.out.println();
        System.out.println("===========================");

        for (int i = 0; i < 100; i+=5) {
            System.out.print( i+" ");
        }

        System.out.println();
        System.out.println("===========================");
//even numbers from 100 to 0
        for (int i = 98; i >=0; i-=2) {
            System.out.print( "="+i);
        }

    }
}
