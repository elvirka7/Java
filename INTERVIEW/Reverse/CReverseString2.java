package Reverse;

import java.util.Scanner;

public class CReverseString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            reverse+=str.charAt(str.length()-1-i);  //  charAt(5) is a, charAt(4) is r, chartAt(3) is i, every time i is one more, 5 is one less
            //E l v i r a
            //0 1 2 3 4 5
        }

        System.out.println("You entered a word "+str);
        System.out.println("Reversed word is "+reverse);
    }
}
