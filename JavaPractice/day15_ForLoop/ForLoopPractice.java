package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {    //65 and 90 from ASCI table
            System.out.print((char) i + " "); //cast i to char
        }

        System.out.println("\n________________________________________________");

        for (char i = 'A'; i <= 'Z'; i++) {     //char variable
            System.out.print(i + " ");
        }

        System.out.println("\n________________________________________________");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n________________________________________________");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n________________________________________________");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n________________________________________________");

        for(char i = 1; i<=40000; i++){
            System.out.print(i+" ");
        }


    }
}
