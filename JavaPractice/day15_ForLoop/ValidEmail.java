package day15_ForLoop;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {

        String email = new Scanner(System.in).next();

        if (email.endsWith("@gmail.com")) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }

    }
}
