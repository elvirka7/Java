package Reverse;

import java.util.Scanner;

public class BReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--) {
         reverse+= str.charAt(i);
        }

        System.out.println("You entered a word "+str);
        System.out.println("Reversed word is "+reverse);

    }
}
